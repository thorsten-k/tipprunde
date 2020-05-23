package org.tipprunde.api.rest.consume;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/api")
public interface OpenligaRest
{		    
	 @GET @Path("/getavailableteams/bl1/2016")
	 @Produces(MediaType.APPLICATION_JSON) 
	 String  teams();
	
}