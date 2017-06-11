package org.tipprunde.factory.xml.community.points;

import org.tipprunde.model.xml.community.Community;
import org.tipprunde.model.xml.community.Participant;
import org.tipprunde.model.xml.user.Identity;
import org.tipprunde.model.xml.user.User;

public class XmlParticipantFactory
{
	public static Participant build(long id)
	{
		Participant xml = new Participant();
		xml.setId(id);
		return xml;
	}
	
	public static Participant createParticipant(String firstName, String lastName, String email)
	{
		User user = new User();
		user.setFirstName(firstName);
		user.setLastName(lastName);
		
		Identity identity = new Identity();
		identity.setUser(user);
		identity.setEmail(email);
		
		Participant participant = new Participant();
		participant.setIdentity(identity);
		return participant;
	}
	
	public static Participant subscribe(Participant participant, Community community)
	{
		return subscribe(participant, community.getId());
	}
	public static Participant subscribe(Participant participant, long communityId)
	{
		Community community = new Community();
		community.setId(communityId);
		participant.setCommunity(community);
		return participant;
	}
}