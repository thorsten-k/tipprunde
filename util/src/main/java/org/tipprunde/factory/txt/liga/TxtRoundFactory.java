package org.tipprunde.factory.txt.liga;

import org.tipprunde.model.xml.liga.Round;

public class TxtRoundFactory
{		
	public static String round(Round round)
	{		
		StringBuffer sb = new StringBuffer();
		sb.append(round.getNr());
		return sb.toString();
	}
}