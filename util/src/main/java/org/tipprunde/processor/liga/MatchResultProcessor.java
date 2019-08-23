package org.tipprunde.processor.liga;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.tipprunde.interfaces.ejb.liga.match.TipprundeMatchResult;
import org.tipprunde.model.xml.liga.Match;
import org.tipprunde.model.xml.liga.Opponent;

import net.sf.ahtutils.exception.processing.UtilsProcessingException;

public class MatchResultProcessor
{
	final static Logger logger = LoggerFactory.getLogger(MatchResultProcessor.class);
	
	public static TipprundeMatchResult.Status status(Match match, Opponent reference) throws UtilsProcessingException
	{
		checkXmlStructure(match);
		
		if(match.getResult().getScoreLeft()==match.getResult().getScoreRight()) {return TipprundeMatchResult.Status.draw;}
		
		if(reference.getId()==match.getLeft().getOpponent().getId())
		{
			if(leftWins(match)){return TipprundeMatchResult.Status.won;}
			else {return TipprundeMatchResult.Status.lost;}
		}
		else
		{
			if(leftWins(match)){return TipprundeMatchResult.Status.lost;}
			else {return TipprundeMatchResult.Status.won;}
		}
	}
	
	
	private static void checkXmlStructure(Match match) throws UtilsProcessingException
	{
		if(!match.isSetLeft()) {throw new UtilsProcessingException("No left Opponent");}
		if(!match.getLeft().isSetOpponent()) {throw new UtilsProcessingException("No left Opponent");}
		if(!match.getLeft().getOpponent().isSetId()) {throw new UtilsProcessingException("No left Opponent");}
		
		if(!match.isSetRight()) {throw new UtilsProcessingException("No right Opponent");}
		if(!match.getRight().isSetOpponent()) {throw new UtilsProcessingException("No right Opponent");}
		if(!match.getRight().getOpponent().isSetId()) {throw new UtilsProcessingException("No right Opponent");}
		
		if(!match.isSetResult()) {throw new UtilsProcessingException("No Result");}
		if(!match.getResult().isSetScoreLeft()) {throw new UtilsProcessingException("No Result.left");}
		if(!match.getResult().isSetScoreRight()) {throw new UtilsProcessingException("No Result.right");}
	}
	
	private static boolean leftWins(Match match)
	{
		return match.getResult().getScoreLeft()>match.getResult().getScoreRight();
	}
}