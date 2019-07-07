package org.tipprunde.util.query.xml;

import java.util.Hashtable;
import java.util.Map;

import org.tipprunde.model.xml.liga.Opponent;
import org.tipprunde.model.xml.tr.Query;

public class XmlLigaQuery
{
	public static enum Key {opponent}
	
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
		xml.setId(0);
		xml.setName("");
		xml.setIcon("");
		xml.setName3("");
		xml.setNameLegal("");
		
		return xml;
	}
}