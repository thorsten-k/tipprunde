package org.tipprunde.api.rest.provide;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.jeesl.interfaces.util.qualifier.JeeslRestSecured;
import org.tipprunde.model.xml.liga.UpdatePolicy;
import org.tipprunde.model.xml.tr.Tg;

@Path("/rest/update")
public interface TrUpdateRest
{
    @GET @Path("/next") @JeeslRestSecured
    @Produces(MediaType.APPLICATION_XML)
    UpdatePolicy nextUpdate();
    
	@GET @Path("/job") @JeeslRestSecured
	@Produces(MediaType.APPLICATION_XML)
    Tg nextJob();
	
	@POST @Path("/update") @JeeslRestSecured
	@Consumes(MediaType.APPLICATION_XML)
	@Produces(MediaType.APPLICATION_XML)
    UpdatePolicy update(Tg tg);
	
	@POST @Path("/status") @JeeslRestSecured
	@Consumes(MediaType.APPLICATION_XML)
    void status(UpdatePolicy status);
}