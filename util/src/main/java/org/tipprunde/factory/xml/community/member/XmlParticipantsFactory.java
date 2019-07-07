package org.tipprunde.factory.xml.community.member;

import org.tipprunde.model.xml.community.Participant;
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
	public static Participants build() {return new Participants();}
	
	public static Participants build(Participant participant)
	{
		Participants xml = build();
		xml.getParticipant().add(participant);
		return xml;
	}
}