package org.tipprunde.processor.statistic;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.tipprunde.interfaces.ejb.liga.match.TipprundeMatchResult;
import org.tipprunde.model.xml.liga.Match;
import org.tipprunde.model.xml.liga.Opponent;
import org.tipprunde.processor.liga.MatchResultProcessor;

import net.sf.ahtutils.exception.processing.UtilsProcessingException;

public class MatchBalanceProcessor
{
	final static Logger logger = LoggerFactory.getLogger(MatchBalanceProcessor.class);
	
	public static double relBalance(List<Match> matches, Opponent reference) throws UtilsProcessingException
	{
		if(matches.isEmpty()) {return 0;}
		double balance = balance(matches,reference);
		return balance/matches.size();
	}
	public static int balance(List<Match> matches, Opponent reference) throws UtilsProcessingException
	{
//		JaxbUtil.info(XmlRoundFactory.build(matches));
		int balance = 0;
		for(Match match : matches)
		{
			TipprundeMatchResult.Status status = MatchResultProcessor.status(match, reference);
			switch(status)
			{
				case won: balance=balance+1;break;
				case lost: balance=balance-1;break;
				case draw: break;
			}
		}
		
		return balance;
	}
	
}