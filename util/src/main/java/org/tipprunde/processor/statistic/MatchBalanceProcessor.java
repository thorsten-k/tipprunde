package org.tipprunde.processor.statistic;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.tipprunde.model.xml.liga.Match;
import org.tipprunde.model.xml.liga.Opponent;

public class MatchBalanceProcessor
{
	final static Logger logger = LoggerFactory.getLogger(MatchBalanceProcessor.class);
	
	public enum CompTyp {RoundNr};
	
	public MatchBalanceProcessor()
	{
		
	}
	
	public static int balance(List<Match> matches, Opponent reference)
	{
		int balance = 0;
		for(Match m : matches)
		{
			
		}
		
		return 0;
	}
	
}