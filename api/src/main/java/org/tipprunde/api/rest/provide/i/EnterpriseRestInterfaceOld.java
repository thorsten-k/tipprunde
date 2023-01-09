package org.tipprunde.api.rest.provide.i;

import javax.ws.rs.PathParam;

import org.jeesl.api.exception.xml.JeeslXmlStructureException;
import org.jeesl.exception.ejb.JeeslNotFoundException;
import org.tipprunde.model.xml.community.Bet;
import org.tipprunde.model.xml.community.Community;
import org.tipprunde.model.xml.community.DefinitionEvent;
import org.tipprunde.model.xml.community.Participant;
import org.tipprunde.model.xml.community.Tipps;
import org.tipprunde.model.xml.liga.Opponents;
import org.tipprunde.model.xml.tr.Mails;
import org.tipprunde.model.xml.tr.Report;
import org.tipprunde.model.xml.tr.Tg;

public interface EnterpriseRestInterfaceOld
{
    Community members(long communityId);
    Participant participant(long communityId, String email);
    DefinitionEvent event(long communityId);
    Opponents opponents(long communityId);
	Participant subscribeParticipant(Participant participant);
	Participant unsubscribeParticipant(Participant participant);
	Bet updateBet(Bet bet);
    Tipps tipps(long roundDefinitionId, @PathParam("pId") long participantId);
    Tipps update(Tipps tipps) throws JeeslXmlStructureException, JeeslNotFoundException;
    Tg updateWorker();
    String updatePoints(long defRoundId);
	
    Report roundScoreTable(long defRoundId);
    Mails missingTipps(long defRoundId);
    Mails mailsRoundScoreTable(long defRoundId);
	Mails mailRoundReminder(long defRoundId);
	Mails mailRoundScore(long defRoundId);
}