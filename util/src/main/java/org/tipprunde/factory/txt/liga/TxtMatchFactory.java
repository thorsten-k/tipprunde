package org.tipprunde.factory.txt.liga;

import org.tipprunde.model.xml.liga.Match;

public class TxtMatchFactory
{
	public static String debug(Match match)
	{
		StringBuffer sb = new StringBuffer();
		sb.append(match.getKickOff());
		sb.append(" ");
		sb.append(opponents(match));
		return sb.toString();
	}
	
	public static String opponents(Match match)
	{		
		StringBuffer sb = new StringBuffer();
		sb.append(match.getLeft().getOpponent().getName());
		sb.append(" : ");
		sb.append(match.getRight().getOpponent().getName());
		return sb.toString();
	}
}