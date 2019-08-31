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
	
	public static double tendenceRelative(List<Match> matches, Opponent reference) throws UtilsProcessingException
	{
		if(matches.isEmpty()) {return 0;}
		double balance = tendence(matches,reference);
		return balance/matches.size();
	}
	public static int tendence(List<Match> matches, Opponent reference) throws UtilsProcessingException
	{
		int tendence = 0;
		for(Match match : matches)
		{
			TipprundeMatchResult.Status status = MatchResultProcessor.status(match, reference);
			switch(status)
			{
				case won: tendence=tendence+1;break;
				case lost: tendence=tendence-1;break;
				case draw: break;
			}
		}
		return tendence;
	}
	
	public static int balance(List<Match> matches, Opponent reference) throws UtilsProcessingException
	{
		int balance = 0;
		for(Match match : matches)
		{
			balance = balance + MatchResultProcessor.differnece(match, reference);
		}
		return balance;
	}
	
	public static String results(List<Match> matches, Opponent reference) throws UtilsProcessingException
	{
		StringBuilder sb = new StringBuilder();
		for(Match match : matches)
		{
			TipprundeMatchResult.Status status = MatchResultProcessor.status(match,reference);
			switch(status)
			{
				case won: sb.append("+");break;
				case lost: sb.append("-");break;
				case draw: sb.append("0");break;
			}
		}		
		return sb.toString();
	}
}