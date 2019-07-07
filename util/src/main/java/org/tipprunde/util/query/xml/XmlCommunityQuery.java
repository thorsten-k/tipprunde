package org.tipprunde.util.query.xml;

import java.util.Date;
import java.util.Hashtable;
import java.util.Map;

import org.tipprunde.model.xml.community.Community;
import org.tipprunde.model.xml.community.DefinitionEvent;
import org.tipprunde.model.xml.community.DefinitionRound;
import org.tipprunde.model.xml.community.Participant;
import org.tipprunde.model.xml.community.Participants;
import org.tipprunde.model.xml.community.Subscription;
import org.tipprunde.model.xml.liga.Round;
import org.tipprunde.model.xml.tr.Query;
import org.tipprunde.model.xml.user.Identity;
import org.tipprunde.model.xml.user.User;

import net.sf.exlp.util.DateUtil;

public class XmlCommunityQuery
{
	public static enum Key {event,community}
	
	private static Map<Key,Query> mQueries;
	
	public static Query get(Key key){return get(key,null);}
	public static Query get(Key key,String localeCode)
	{
		if(mQueries==null){mQueries = new Hashtable<Key,Query>();}
		if(!mQueries.containsKey(key))
		{
			Query q = new Query();
			switch(key)
			{
				case event: q.setDefinitionEvent(event());break;
				case community: q.setCommunity(createComWithParticipant());break;

			}
			mQueries.put(key, q);
		}
		Query q = mQueries.get(key);
		q.setLang(localeCode);
		return q;
	}
	
	private static DefinitionEvent event()
	{		
		Round qR = new Round();
		qR.setId(0);
		qR.setName("");
		qR.setNr(1);
		
		DefinitionRound qDr = new DefinitionRound();
		qDr.setId(0);
		qDr.setRound(qR);
		qDr.setDeadline(DateUtil.getXmlGc4D(new Date()));
		
		Subscription qS = new Subscription();
		qS.setDeadline(DateUtil.getXmlGc4D(new Date()));
		
		Community qC = new Community();
		qC.setSubscription(qS);
		
		DefinitionEvent qDe = new DefinitionEvent();
		qDe.setId(0);
		qDe.getDefinitionRound().add(qDr);
		qDe.setCommunity(qC);
		return qDe;
	}
	
	private static Community createComWithParticipant()
	{
		User qUser = new User();
		qUser.setFirstName("");
		qUser.setLastName("");
		
		Identity qId = new Identity();
		qId.setUser(qUser);
		
		Participant qParticipant = new Participant();
    	qParticipant.setId(0);
    	qParticipant.setIdentity(qId);
    	
    	Community qCommunity = new Community();
    	qCommunity.setName("test");
    	qCommunity.setId(0);
    	qCommunity.setParticipants(new Participants());
    	qCommunity.getParticipants().getParticipant().add(qParticipant);
    	
    	return qCommunity;
	}
}