package org.tipprunde.factory.xml.liga.event;

import java.util.List;

import org.tipprunde.model.xml.liga.Match;
import org.tipprunde.model.xml.liga.Round;

public class XmlRoundFactory
{
	public static Round build() {return new Round();}
	
	public static Round build(List<Match> matches)
	{
		Round xml = build();
		xml.getMatch().addAll(matches);
		return xml;
	}
}