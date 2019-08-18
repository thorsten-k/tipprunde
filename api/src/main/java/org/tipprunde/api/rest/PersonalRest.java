package org.tipprunde.api.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.jeesl.interfaces.util.qualifier.JeeslRestSecured;
import org.tipprunde.model.xml.liga.Event;
import org.tipprunde.model.xml.liga.Events;
import org.tipprunde.model.xml.liga.Round;

@Path("/rest/personal")
public interface PersonalRest
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
}