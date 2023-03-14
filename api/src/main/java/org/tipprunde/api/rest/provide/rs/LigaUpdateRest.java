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

@Path("/rest/liga/update")
public interface LigaUpdateRest extends LigaUpdateRestInterface
{    
	@JeeslRestSecured
    @GET @Path("/next")  @Produces(MediaType.APPLICATION_JSON)
	JsonDsUpdate nextUpdateTime();
    
    @JeeslRestSecured
	@POST @Path("/heartbeat") @Consumes(MediaType.APPLICATION_JSON)
    void uploadHeartbeat(JsonDsUpdate heartbeat);
	
	@JeeslRestSecured
	@GET @Path("/job") @Produces(MediaType.APPLICATION_XML)
    Tg nextOutdatedJob();
	
	@JeeslRestSecured
	@GET @Path("/job") @Produces(MediaType.APPLICATION_JSON)
    JsonTrContainer nextUpdateJob();
	
	@JeeslRestSecured
	@POST @Path("/update") @Consumes(MediaType.APPLICATION_XML) @Produces(MediaType.APPLICATION_XML)
    UpdatePolicy update(Tg tg);
}