package org.tipprunde.util.query.xml;

import java.util.Date;
import java.util.Hashtable;
import java.util.Map;

import org.exlp.util.system.DateUtil;
import org.tipprunde.model.xml.community.Tipp;
import org.tipprunde.model.xml.liga.Left;
import org.tipprunde.model.xml.liga.Match;
import org.tipprunde.model.xml.liga.Opponent;
import org.tipprunde.model.xml.liga.Result;
import org.tipprunde.model.xml.liga.Right;
import org.tipprunde.model.xml.tr.Query;

public class XmlTippQuery
{
	public static enum Key {withMatchOpponentResult}
	
	public static Map<Key,Query> mQueries;
	
	public static Query get(Key key, String lang)
	{
		if(mQueries==null){mQueries = new Hashtable<Key,Query>();}
		if(!mQueries.containsKey(key))
		{
			Query q = new Query();
			switch(key)
			{
				case withMatchOpponentResult: q.setTipp(withMatchOpponentResult());break;
			}
			mQueries.put(key, q);;
		}
		Query q = mQueries.get(key);
		q.setLang(lang);
		return q;
	}
	
	public static Tipp withMatchOpponentResult()
	{
		Result qResult = new Result();
		qResult.setScoreLeft(0);
		qResult.setScoreRight(0);
		
		Opponent opponent = new Opponent();
		opponent.setId(0l);
		opponent.setName("");
		opponent.setIcon("");
		
		Match qM = new Match();
		qM.setKickOff(DateUtil.toXmlGc(new Date()));
		qM.setId(0l);
		qM.setLeft(new Left());qM.getLeft().setOpponent(opponent);
		qM.setRight(new Right());qM.getRight().setOpponent(opponent);
		qM.setResult(qResult);
		
		Tipp qT = new Tipp();
		qT.setLeft(0);
		qT.setRight(0);
		qT.setId(0l);
		qT.setMatch(qM);
		
		return qT;
	}
	

}