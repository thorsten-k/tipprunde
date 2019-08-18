package org.tipprunde.factory.xml.liga.event;

import org.tipprunde.model.xml.liga.Round;
import org.tipprunde.model.xml.liga.Rounds;

public class XmlRoundsFactory
{
	public static Rounds build() {return new Rounds();}
	
	public static Rounds build(Round round)
	{
		Rounds xml = build();
		xml.getRound().add(round);
		return xml;
	}
}