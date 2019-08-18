package org.tipprunde.factory.xml.liga.match;

import org.tipprunde.model.xml.liga.Left;
import org.tipprunde.model.xml.liga.Opponent;

public class XmlLeftFactory
{
	public static Left build() {return new Left();}
	public static Left build(Opponent opponent)
	{
		Left xml = build();
		xml.setOpponent(opponent);
		return xml;
	}
}