package org.tipprunde.api.rest.provide;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/rest/cron")
public interface TrCronRest
{		    
	@GET @Path("/test") @Produces(MediaType.TEXT_PLAIN)
    String test();
	
//	@GET @Path("/ol") @Produces(MediaType.TEXT_PLAIN)
//    String ol();
	
//	@GET @Path("/current/rounds") @Produces(MediaType.TEXT_PLAIN)
//   String openLigaCurrentGroups();
}