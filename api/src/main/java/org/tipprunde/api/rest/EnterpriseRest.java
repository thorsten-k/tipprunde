package org.tipprunde.api.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.jeesl.api.exception.xml.JeeslXmlStructureException;
import org.jeesl.interfaces.util.qualifier.JeeslRestSecured;
import org.tipprunde.model.xml.community.Bet;
import org.tipprunde.model.xml.community.Community;
import org.tipprunde.model.xml.community.DefinitionEvent;
import org.tipprunde.model.xml.community.Participant;
import org.tipprunde.model.xml.community.Tipps;
import org.tipprunde.model.xml.liga.Opponents;
import org.tipprunde.model.xml.tr.Mails;
import org.tipprunde.model.xml.tr.Report;
import org.tipprunde.model.xml.tr.Tg;

import net.sf.ahtutils.exception.ejb.UtilsNotFoundException;

@Path("/rest/enterprise")
public interface EnterpriseRest
{
    @GET @Path("/community/members/{id:[1-9][0-9]*}") @JeeslRestSecured
    @Produces(MediaType.APPLICATION_XML)
    Community members(@PathParam("id") long communityId);
    
    @GET @Path("/participant/{id:[1-9][0-9]*}/{email}") @JeeslRestSecured
    @Produces(MediaType.APPLICATION_XML)
    Participant participant(@PathParam("id") long communityId, @PathParam("email") String email);
    
    @GET @Path("/event/{id:[1-9][0-9]*}") @JeeslRestSecured
    @Produces(MediaType.APPLICATION_XML)
    DefinitionEvent event(@PathParam("id") long communityId);
    
    @GET @Path("/community/opponents/{id:[1-9][0-9]*}") @JeeslRestSecured
    @Produces(MediaType.APPLICATION_XML)
    Opponents opponents(@PathParam("id") long communityId);
    
    @POST @Path("/subscribe") @JeeslRestSecured
    @Consumes(MediaType.APPLICATION_XML) @Produces(MediaType.APPLICATION_XML)
	Participant subscribeParticipant(Participant participant);
    
    @POST @Path("/unsubscribe") @JeeslRestSecured
    @Consumes(MediaType.APPLICATION_XML) @Produces(MediaType.APPLICATION_XML)
	Participant unsubscribeParticipant(Participant participant);
    
    @POST @Path("/bet") @JeeslRestSecured
    @Consumes(MediaType.APPLICATION_XML) @Produces(MediaType.APPLICATION_XML)
	Bet updateBet(Bet bet) throws JeeslXmlStructureException;
	
    @GET @Path("/tipps/{drId:[1-9][0-9]*}/{pId:[1-9][0-9]*}") @JeeslRestSecured
    @Produces(MediaType.APPLICATION_XML)
    Tipps tipps(@PathParam("drId") long defRoundId, @PathParam("pId") long participantId);
    
    @POST @Path("/update") @JeeslRestSecured
    @Consumes(MediaType.APPLICATION_XML) @Produces(MediaType.APPLICATION_XML)
    Tipps update(Tipps tipps) throws JeeslXmlStructureException, UtilsNotFoundException;

    @GET @Path("/update/worker") @JeeslRestSecured
    @Produces(MediaType.APPLICATION_XML)
    Tg updateWorker();
    
    @GET @Path("/updatePoints/{drId:[1-9][0-9]*}") @JeeslRestSecured
    @Produces(MediaType.TEXT_PLAIN)
    String updatePoints(@PathParam("drId") long defRoundId);
    
    @GET @Path("/roundScoreTable/{drId:[1-9][0-9]*}") @JeeslRestSecured
    @Produces(MediaType.APPLICATION_XML)
	public Report roundScoreTable(@PathParam("drId") long defRoundId);
    
    @GET @Path("/missingTipps/{drId:[1-9][0-9]*}") @JeeslRestSecured
    @Produces(MediaType.APPLICATION_XML)
	public Mails missingTipps(@PathParam("drId") long defRoundId);
    
    @GET @Path("/mails/roundScoreTable/{drId:[1-9][0-9]*}") @JeeslRestSecured
    @Produces(MediaType.APPLICATION_XML)
	public Mails mailsRoundScoreTable(@PathParam("drId") long defRoundId);
    
    @GET @Path("/mail/round/reminder/{drId:[1-9][0-9]*}") @JeeslRestSecured
    @Produces(MediaType.APPLICATION_XML)
	Mails mailRoundReminder(@PathParam("drId") long defRoundId);
    
    @GET @Path("/mail/round/score/{drId:[1-9][0-9]*}") @JeeslRestSecured
    @Produces(MediaType.APPLICATION_XML)
	Mails mailRoundScore(@PathParam("drId") long defRoundId);
}