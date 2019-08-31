package org.tipprunde.util.comparator.xml;

import java.util.Comparator;

import org.apache.commons.lang.builder.CompareToBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.tipprunde.model.xml.liga.Match;

public class MatchComparator
{
	final static Logger logger = LoggerFactory.getLogger(MatchComparator.class);
	
	public enum Type {date};
	
	public MatchComparator()
	{
		
	}
	
	public static Comparator<Match> factory(Type ct)
	{
		Comparator<Match> c = null;
		MatchComparator pc = new MatchComparator();
		switch (ct)
		{
			case date: c = pc.new DateComparator();break;
		}

		return c;
	}
	
	private class DateComparator implements Comparator<Match>
	{
		public int compare(Match a, Match b)
		{
			CompareToBuilder ctb = new CompareToBuilder();
			
			ctb.append(a.getKickOff().toGregorianCalendar().getTime(), b.getKickOff().toGregorianCalendar().getTime());
			
			return ctb.toComparison();
	    }
	}
}