package org.tipprunde.api.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.jeesl.interfaces.util.qualifier.JeeslRestSecured;
import org.tipprunde.model.xml.liga.Matches;

@Path("/rest/historical")
public interface HistoricalRest
{
    @GET @Path("/matches/{opponentId:[1-9][0-9]*}") @JeeslRestSecured
    @Produces(MediaType.APPLICATION_XML)
    Matches matches(@PathParam("opponentId") long opponentId);
    
    @GET @Path("/matches/direct/{oLeftId:[1-9][0-9]*}/{oRightId:[1-9][0-9]*}") @JeeslRestSecured
    @Produces(MediaType.APPLICATION_XML)
    Matches matches(@PathParam("oLeftId") long oLeftId, @PathParam("oRightId") long oRightId);
}