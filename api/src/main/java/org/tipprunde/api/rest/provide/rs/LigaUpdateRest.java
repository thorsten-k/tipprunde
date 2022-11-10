package org.tipprunde.api.rest.provide.rs;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.jeesl.interfaces.util.qualifier.JeeslRestSecured;
import org.tipprunde.api.rest.provide.i.LigaUpdateRestInterface;
import org.tipprunde.model.json.JsonTrContainer;
import org.tipprunde.model.json.ds.JsonDsUpdate;
import org.tipprunde.model.xml.liga.UpdatePolicy;
import org.tipprunde.model.xml.tr.Tg;

@Path("/rest/update")
public interface LigaUpdateRest extends LigaUpdateRestInterface
{    
    @GET @Path("/next") @JeeslRestSecured
    @Produces(MediaType.APPLICATION_JSON)
	JsonDsUpdate nextUpdate();
    
	@POST @Path("/heartbeat") @JeeslRestSecured
	@Consumes(MediaType.APPLICATION_XML)
    void heartbeat(JsonDsUpdate heartbeat);
	
	
	@GET @Path("/job") @JeeslRestSecured
	@Produces(MediaType.APPLICATION_XML)
    Tg nextJobXml();
	
	@GET @Path("/job") @JeeslRestSecured
	@Produces(MediaType.APPLICATION_JSON)
    JsonTrContainer nextJobJson();
	
    
	@POST @Path("/update") @JeeslRestSecured
	@Consumes(MediaType.APPLICATION_XML)
	@Produces(MediaType.APPLICATION_XML)
    UpdatePolicy update(Tg tg);
}