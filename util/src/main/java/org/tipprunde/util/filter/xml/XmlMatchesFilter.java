package org.tipprunde.util.filter.xml;

import org.tipprunde.factory.xml.liga.match.XmlMatchesFactory;
import org.tipprunde.model.xml.liga.Matches;

public class XmlMatchesFilter
{
	public static Matches last(int max, Matches matches)
	{
		Matches xml = XmlMatchesFactory.build();
		xml.getMatch().addAll(XmlMatchFilter.last(max,matches.getMatch()));
		return xml;
	}
	
	public static Matches home(long opponentId, Matches matches)
	{
		Matches xml = XmlMatchesFactory.build();
		xml.getMatch().addAll(XmlMatchFilter.home(opponentId,matches.getMatch()));
		return xml;
	}
	
	public static Matches guest(long opponentId, Matches matches)
	{
		Matches xml = XmlMatchesFactory.build();
		xml.getMatch().addAll(XmlMatchFilter.guest(opponentId,matches.getMatch()));
		return xml;
	}
}