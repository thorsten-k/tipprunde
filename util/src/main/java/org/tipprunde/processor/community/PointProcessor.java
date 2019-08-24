package org.tipprunde.processor.community;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.tipprunde.model.json.openliga.OpenLigaMatchResult;

public class PointProcessor
{
	final static Logger logger = LoggerFactory.getLogger(PointProcessor.class);
	
	public static int calculateScore(OpenLigaMatchResult tipp, OpenLigaMatchResult result)
	{
		//Exact
		boolean leftExact = tipp.getLeft()==result.getLeft();
		boolean rightExact = tipp.getRight()==result.getRight();
		if(leftExact && rightExact)
		{
			return 3;
		}
		
		//Difference
		int tippDiff = tipp.getLeft()-tipp.getRight();
		int resultDiff = result.getLeft()-result.getRight();
		if(tippDiff == resultDiff)
		{
			return 2;
		}
		
		//Tendency
		boolean draw = (tipp.getLeft()==tipp.getRight()) && result.getLeft()==result.getRight();
		boolean winLeft = (tipp.getLeft()>tipp.getRight() && result.getLeft()>result.getRight());
		boolean winRight = (tipp.getLeft()<tipp.getRight() && result.getLeft()<result.getRight());
		
		if(draw || winLeft || winRight)
		{
			return 1;
		}
		
		return 0;
	}
}