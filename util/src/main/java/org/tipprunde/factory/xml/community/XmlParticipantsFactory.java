package org.tipprunde.factory.xml.community;

import org.tipprunde.model.xml.community.Participants;

public class XmlParticipantsFactory
{
	protected final String localeCode;
	protected final Participants q;

	
	public XmlParticipantsFactory(String localeCode, Participants q)
	{
		this.localeCode=localeCode;
		this.q=q;
	}
	
	public static Participants build()
	{
		Participants xml = new Participants();

		return xml;
	}
}