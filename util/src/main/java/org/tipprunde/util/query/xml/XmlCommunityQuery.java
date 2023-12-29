package org.tipprunde.util.query.xml;

import java.util.Date;
import java.util.Hashtable;
import java.util.Map;

import org.jeesl.model.xml.io.cms.text.Remark;
import org.tipprunde.factory.xml.community.member.XmlParticipantsFactory;
import org.tipprunde.model.xml.community.Bet;
import org.tipprunde.model.xml.community.Community;
import org.tipprunde.model.xml.community.DefinitionEvent;
import org.tipprunde.model.xml.community.DefinitionRound;
import org.tipprunde.model.xml.community.Participant;
import org.tipprunde.model.xml.community.Participants;
import org.tipprunde.model.xml.community.Subscription;
import org.tipprunde.model.xml.community.Tipp;
import org.tipprunde.model.xml.liga.Match;
import org.tipprunde.model.xml.liga.Round;
import org.tipprunde.model.xml.tr.Query;
import org.tipprunde.model.xml.user.Identity;
import org.tipprunde.model.xml.user.User;

import net.sf.exlp.util.DateUtil;

public class XmlCommunityQuery
{
	public static enum Key {event,community,bet,tipp}
	
	private static Map<Key,Query> mQueries;
	
	public static Query get(Key key){return get(null,key);}
	public static Query get(String localeCode, Key key)
	{
		if(mQueries==null){mQueries = new Hashtable<Key,Query>();}
		if(!mQueries.containsKey(key))
		{
			Query q = new Query();
			switch(key)
			{
				case event: q.setDefinitionEvent(event());break;
				case community: q.setCommunity(community());break;
				case bet: q.setBet(bet());break;
				case tipp: q.setTipp(tipp());break;
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
		qR.setId(0l);
		qR.setName("");
		qR.setNr(1);
		
		DefinitionRound qDr = new DefinitionRound();
		qDr.setId(0l);
		qDr.setRound(qR);
		qDr.setDeadline(DateUtil.toXmlGc(new Date()));
		
		Subscription qS = new Subscription();
		qS.setDeadline(DateUtil.toXmlGc(new Date()));
		
		Community qC = new Community();
		qC.setSubscription(qS);
		
		DefinitionEvent qDe = new DefinitionEvent();
		qDe.setId(0l);
		qDe.getDefinitionRound().add(qDr);
		qDe.setCommunity(qC);
		return qDe;
	}
	
	private static Community community()
	{
		User qUser = new User();
		qUser.setFirstName("");
		qUser.setLastName("");
		
		Identity qId = new Identity();
		qId.setEmail("");
		qId.setUser(qUser);
		
		Participant participant = new Participant();
		participant.setId(0l);
		participant.setIdentity(qId);
		participant.setBet(bet());
    	
    	Participants participants = XmlParticipantsFactory.build(participant);
    	participants.setSize(0);
    	
    	Community qCommunity = new Community();
    	qCommunity.setName("test");
    	qCommunity.setId(0l);
    	qCommunity.setParticipants(participants);
    	
    	return qCommunity;
	}
	
	private static Bet bet()
	{
		Bet xml = new Bet();
		xml.setId(0l);
		xml.setRecord(DateUtil.toXmlGc(new Date()));
		xml.setCarryover(0d);
		xml.setFee(0d);
    	xml.setPaid(0d);
    	xml.setWin(0d);
    	xml.setOut(0d);
    	xml.setBalance(0d);
    	xml.setRemark(new Remark());
		return xml;
	}
	
	private static Tipp tipp()
	{	
		Match match = new Match();
		match.setId(0l);
		
		Tipp xml = new Tipp();
		xml.setLeft(0);
		xml.setRight(0);
		xml.setMatch(match);
		
		
		return xml;
	}
}