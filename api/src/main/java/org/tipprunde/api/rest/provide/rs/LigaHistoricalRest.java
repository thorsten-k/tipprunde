package org.tipprunde.api.rest.provide.rs;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.jeesl.interfaces.util.qualifier.JeeslRestSecured;
import org.tipprunde.api.rest.provide.i.LigaHistoricalRestInterface;
import org.tipprunde.model.xml.liga.Matches;

@Path("/rest/historical")
public interface LigaHistoricalRest extends LigaHistoricalRestInterface
{
	@JeeslRestSecured
    @GET @Path("/matches/{opponentId:[1-9][0-9]*}") 
    @Produces(MediaType.APPLICATION_XML)
    Matches matches(@PathParam("opponentId") long opponentId);
    
	@JeeslRestSecured
    @GET @Path("/matches/direct/{oLeftId:[1-9][0-9]*}/{oRightId:[1-9][0-9]*}") 
    @Produces(MediaType.APPLICATION_XML)
    Matches matches(@PathParam("oLeftId") long oLeftId, @PathParam("oRightId") long oRightId);
}