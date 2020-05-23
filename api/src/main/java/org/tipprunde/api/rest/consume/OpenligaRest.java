package org.tipprunde.api.rest.consume;

import java.util.Date;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.jeesl.interfaces.model.marker.qualifier.RestDescription;
import org.tipprunde.model.json.openliga.OpenLigaGroup;
import org.tipprunde.model.json.openliga.OpenLigaMatch;

@Path("/api")
@RestDescription(label="OpenligaDB JSON API",description="direct API")
public interface OpenligaRest
{		    
	public static String restHost = "https://www.openligadb.de";
	public static String context = "api";
	
	@GET @Path("/getcurrentgroup/{leagueShortcut}")
	@Produces(MediaType.APPLICATION_JSON)
	OpenLigaGroup getCurrentGroup(@PathParam("leagueShortcut") String leagueShortcut);
	
	@GET @Path("/getlastchangedate/{leagueShortcut}/{leagueSeason}/{groupOrderId}")
	@Produces(MediaType.APPLICATION_JSON)
    Date getLastChangeDate(@PathParam("leagueShortcut") String leagueShortcut,
    						@PathParam("leagueSeason") String leagueSeason,
    						@PathParam("groupOrderId") int groupOrderId);
	
	@GET @Path("/getmatchdata/{leagueShortcut}/{leagueSeason}")
	@Produces(MediaType.APPLICATION_JSON)
	List<OpenLigaMatch> getMatchData(@PathParam("leagueShortcut") String leagueShortcut,
    						@PathParam("leagueSeason") String leagueSeason);
	
	@GET @Path("/getmatchdata/{leagueShortcut}/{leagueSeason}/{groupOrderId}")
	@Produces(MediaType.APPLICATION_JSON)
	List<OpenLigaMatch> getMatchData(@PathParam("leagueShortcut") String leagueShortcut,
    						@PathParam("leagueSeason") String leagueSeason,
    						@PathParam("groupOrderId") int groupOrderId);
	
}