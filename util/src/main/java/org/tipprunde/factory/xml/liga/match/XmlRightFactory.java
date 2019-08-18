package org.tipprunde.factory.xml.liga.match;

import org.tipprunde.model.xml.liga.Opponent;
import org.tipprunde.model.xml.liga.Right;

public class XmlRightFactory
{
	public static Right build() {return new Right();}
	public static Right build(Opponent opponent)
	{
		Right xml = build();
		xml.setOpponent(opponent);
		return xml;
	}
}