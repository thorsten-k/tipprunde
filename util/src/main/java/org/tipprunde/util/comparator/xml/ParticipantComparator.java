package org.tipprunde.util.comparator.xml;

import java.util.Comparator;
import java.util.Objects;

import org.apache.commons.lang3.ObjectUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.tipprunde.model.xml.community.Participant;

public class ParticipantComparator
{
	final static Logger logger = LoggerFactory.getLogger(ParticipantComparator.class);
	
	public enum CompTyp {ParticipantName,EventPointsDesc,RoundPointsDesc};
	
	public ParticipantComparator()
	{
		
	}
	
	public static Comparator<Participant> factory(CompTyp ct)
	{
		Comparator<Participant> c = null;
		ParticipantComparator pc = new ParticipantComparator();
		switch (ct)
		{
			case EventPointsDesc: c = pc.new EventPointsDesc();break;
			case RoundPointsDesc: c = pc.new EventRoundPointsDesc();break;
			case ParticipantName: c = pc.new ParticipantName();break;
		}

		return c;
	}
	
	public class EventPointsDesc implements Comparator<Participant>
	{
		public int compare(Participant a, Participant b)
		{
		    int diff = a.getPointsEvent().getScore()-b.getPointsEvent().getScore();
		    if (diff < 0) {return 1;}
		    else if (diff == 0) {return 0;}
		    else {return -1;}
	    }
	}
	
	public class ParticipantName implements Comparator<Participant>
	{
		public int compare(Participant a, Participant b)
		{
			int last = a.getIdentity().getUser().getLastName().compareTo(b.getIdentity().getUser().getLastName());
			if(last!=0){return last;}
			else{return a.getIdentity().getUser().getFirstName().compareTo(b.getIdentity().getUser().getFirstName());}
	    }
	}
	
	
	public class EventRoundPointsDesc implements Comparator<Participant>
	{
		public int compare(Participant a, Participant b)
		{		
		    int diff=0;
		    
		    try {diff = a.getPointsEvent().getPointsRound().get(0).getScore()-b.getPointsEvent().getPointsRound().get(0).getScore();}
		    catch (IndexOutOfBoundsException e)
		    {
		    	boolean aValid = Objects.nonNull(a.getPointsEvent()) &&
		    					 ObjectUtils.isNotEmpty(a.getPointsEvent().getPointsRound()) &&
		    					 a.getPointsEvent().getPointsRound().size()>0 &&
		    					 Objects.nonNull(a.getPointsEvent().getPointsRound().get(0).getScore());
		    	boolean bValid = Objects.nonNull(b.getPointsEvent()) &&
		    					 ObjectUtils.isNotEmpty(b.getPointsEvent().getPointsRound()) &&
								 b.getPointsEvent().getPointsRound().size()>0 &&
								 Objects.nonNull(b.getPointsEvent().getPointsRound().get(0).getScore());
		    	logger.trace("IndexOutOfBoundsException aValid:"+aValid+" bValid="+bValid);
		    	if(!aValid && bValid){diff=-1;}
		    	else if(aValid && !bValid){diff=1;}
		    }
		    if (diff < 0) {return 1;}
		    else if (diff == 0) {return 0;}
		    else {return -1;}
	    }
	}
}