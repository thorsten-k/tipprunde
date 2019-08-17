package org.tipprunde.util.query.xml;

import java.util.Hashtable;
import java.util.Map;

import org.tipprunde.model.xml.ds.Openliga;
import org.tipprunde.model.xml.liga.DataSource;
import org.tipprunde.model.xml.liga.Discipline;
import org.tipprunde.model.xml.liga.Event;
import org.tipprunde.model.xml.liga.Events;
import org.tipprunde.model.xml.liga.Match;
import org.tipprunde.model.xml.liga.Round;
import org.tipprunde.model.xml.tr.Query;

public class XmlUpdateQuery
{
	public static enum QueryKey {olDiscipline,olEvent,olRound,olMatch}
	
	public static Map<QueryKey,Query> mQueries;
	
	public static Query get(QueryKey key)
	{
		if(mQueries==null){mQueries = new Hashtable<QueryKey,Query>();}
		if(!mQueries.containsKey(key))
		{
			Query q = new Query();
			q.setLang("de");
			switch(key)
			{
				case olDiscipline: q.setDiscipline(olDiscipline());break;
				case olEvent: q.setEvent(olEvent());break;
				case olRound: q.setRound(olRound());break;
				case olMatch: q.setMatch(olMatch());break;
			}
			mQueries.put(key, q);
		}
		
		return mQueries.get(key);
	}
	
	public static Discipline olDiscipline()
	{
		Discipline xml = new Discipline();
		xml.setName("");
		xml.setDataSource(ds());
    	return xml;
	}
	
	public static Event olEvent()
	{
		Event xml = new Event();
		xml.setName("");
		xml.setDataSource(ds());
		xml.setDiscipline(olDiscipline());
    	return xml;
	}
	
	public static Round olRound()
	{
		Round xml = new Round();
		xml.setName("");
		xml.setDataSource(ds());
	
		xml.setEvents(new Events());
		xml.getEvents().getEvent().add(olEvent());
    	return xml;
	}
	
	public static Match olMatch()
	{
		Match xml = new Match();
		xml.setDataSource(ds());
    	return xml;
	}
	
	private static DataSource ds()
	{
		DataSource xml = new DataSource();
		xml.setOpenliga(ol());
		return xml;
	}
	
	private static Openliga ol()
	{
		Openliga xml = new Openliga();
		xml.setRefId(0);
		xml.setSaison("");
		xml.setShortcut("");
		xml.setType("");
		return xml;
	}
}
