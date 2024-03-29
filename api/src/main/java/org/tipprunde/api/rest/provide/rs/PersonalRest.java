package org.tipprunde.api.rest.provide.rs;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.jeesl.interfaces.util.qualifier.JeeslRestSecured;
import org.tipprunde.api.rest.provide.i.PersonalRestInterface;
import org.tipprunde.model.xml.community.Tipps;
import org.tipprunde.model.xml.liga.Event;
import org.tipprunde.model.xml.liga.Events;
import org.tipprunde.model.xml.liga.Round;

@Path("/rest/personal")
public interface PersonalRest extends PersonalRestInterface
{
    @GET @Path("/events") @JeeslRestSecured
    @Produces(MediaType.APPLICATION_XML)
    Events events();
    
    @GET @Path("/event/{id:[1-9][0-9]*}") @JeeslRestSecured
    @Produces(MediaType.APPLICATION_XML)
    Event event(@PathParam("id") long id);
    
    @GET @Path("/round/{id:[1-9][0-9]*}") @JeeslRestSecured
    @Produces(MediaType.APPLICATION_XML)
    Round round(@PathParam("id") long id);
    
    @GET @Path("/tipps/round/{id:[1-9][0-9]*}") @JeeslRestSecured
    @Produces(MediaType.APPLICATION_XML)
    Tipps tipps(@PathParam("id") long id);
    
    @GET @Path("/upload/tipps") @JeeslRestSecured
    @Produces(MediaType.APPLICATION_XML)  @Consumes(MediaType.APPLICATION_XML)
    Tipps upload(Tipps tipps);
}