package org.tipprunde.util.query.xml;

import java.util.Date;
import java.util.Hashtable;
import java.util.Map;

import org.tipprunde.factory.xml.liga.event.XmlRoundsFactory;
import org.tipprunde.factory.xml.liga.match.XmlLeftFactory;
import org.tipprunde.factory.xml.liga.match.XmlRightFactory;
import org.tipprunde.model.xml.liga.Event;
import org.tipprunde.model.xml.liga.Match;
import org.tipprunde.model.xml.liga.Opponent;
import org.tipprunde.model.xml.liga.Result;
import org.tipprunde.model.xml.liga.Round;
import org.tipprunde.model.xml.tr.Query;

import net.sf.exlp.util.DateUtil;

public class XmlLigaQuery
{
	public static enum Key {opponent,events,event,round,match,matchResult}
	
	public static Map<Key,Query> mQueries;
	
	public static Query get(String localeCode, Key key)
	{
		if(mQueries==null){mQueries = new Hashtable<Key,Query>();}
		if(!mQueries.containsKey(key))
		{
			Query q = new Query();
			switch(key)
			{
				case opponent: q.setOpponent(opponent());break;
				case events: q.setEvent(events());break;
				case event: q.setEvent(event());break;
				case round: q.setRound(round());break;
				case match: q.setMatch(match());break;
				case matchResult: q.setMatch(matchResult());break;
			}
			mQueries.put(key, q);;
		}
		Query q = mQueries.get(key);
		q.setLang(localeCode);
		return q;
	}
	
	public static Opponent opponent()
	{		
		Opponent xml = new Opponent();
		xml.setId(0l);
		xml.setName("");
		xml.setIcon("");
		xml.setName3("");
		xml.setNameLegal("");
		
		return xml;
	}
	
	public static Event events()
	{		
		Event xml = new Event();
		xml.setId(0l);
		xml.setName("");
		
		
		return xml;
	}
	
	public static Event event()
	{		
		Round round = new Round();
		round.setId(0l);
		round.setNr(0);
		round.setName("");
		
		Event xml = new Event();
		xml.setId(0l);
		xml.setName("");
		xml.setRounds(XmlRoundsFactory.build(round));
		
		return xml;
	}
	
	private static Round round()
	{	
		Match match = new Match();
		match.setId(0l);
		match.setKickOff(DateUtil.toXmlGc(new Date()));
		match.setLeft(XmlLeftFactory.build(opponent()));
		match.setRight(XmlRightFactory.build(opponent()));

		Round xml = new Round();
		xml.setId(0l);
		xml.setNr(0);
		xml.setName("");
		
		xml.getMatch().add(match);
		
		return xml;
	}
	
	private static Match match()
	{	
		Match xml = new Match();
		xml.setId(0l);
		xml.setKickOff(DateUtil.toXmlGc(new Date()));
		xml.setLeft(XmlLeftFactory.build(opponent()));
		xml.setRight(XmlRightFactory.build(opponent()));
		
		return xml;
	}
	
	private static Match matchResult()
	{	
		Result result = new Result();
		result.setScoreLeft(0);
		result.setScoreRight(0);
		
		Match xml = match();
		xml.setId(0l);
		xml.setKickOff(DateUtil.toXmlGc(new Date()));
		xml.setLeft(XmlLeftFactory.build(opponent()));
		xml.setRight(XmlRightFactory.build(opponent()));
		xml.setResult(result);
		
		return xml;
	}
}