package org.tipprunde.factory.xml.liga.match;

import java.util.List;

import org.tipprunde.model.xml.liga.Match;
import org.tipprunde.model.xml.liga.Matches;

public class XmlMatchesFactory
{
	public static Matches build() {return new Matches();}
	
	public static Matches build(List<Match> matches)
	{
		Matches xml = build();
		xml.getMatch().addAll(matches);
		return xml;
	}
}