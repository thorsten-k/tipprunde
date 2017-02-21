package org.tipprunde.api.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.tipprunde.model.xml.liga.UpdatePolicy;
import org.tipprunde.model.xml.tr.Tg;

@Path("/rest/update")
public interface UpdateRest
{
    @GET @Path("/next")
    @Produces(MediaType.APPLICATION_XML)
    UpdatePolicy nextUpdate();
    
	@GET @Path("/job")
	@Produces(MediaType.APPLICATION_XML)
    Tg nextJob();
	
	@POST @Path("/update")
	@Consumes(MediaType.APPLICATION_XML)
	@Produces(MediaType.APPLICATION_XML)
    UpdatePolicy update(Tg tg);
	
	@POST @Path("/status")
	@Consumes(MediaType.APPLICATION_XML)
    void status(UpdatePolicy status);
}
