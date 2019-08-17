package org.tipprunde.api.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.jeesl.interfaces.util.qualifier.JeeslRestSecured;
import org.tipprunde.model.xml.liga.Events;

@Path("/rest/personal")
public interface PersonalRest
{
    @GET @Path("/events") @JeeslRestSecured
    @Produces(MediaType.APPLICATION_XML)
    Events events();
}