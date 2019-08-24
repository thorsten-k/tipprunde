package org.tipprunde.factory.txt.liga;

import org.tipprunde.model.xml.liga.Match;

public class TxtMatchFactory
{		
	public static String opponents(Match match)
	{		
		StringBuffer sb = new StringBuffer();
		sb.append(match.getLeft().getOpponent().getName());
		sb.append(" : ");
		sb.append(match.getRight().getOpponent().getName());
		return sb.toString();
	}
}