package org.tipprunde.api.rest.consume;

import java.util.Date;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.jeesl.interfaces.model.marker.qualifier.RestDescription;
import org.tipprunde.model.json.ssi.openliga.OpenLigaGroup;
import org.tipprunde.model.json.ssi.openliga.OpenLigaMatch;

@Path("/")
@RestDescription(label="OpenligaDB JSON API",description="direct API")
public interface OpenligaRest
{		    
	public static String restHost = "https://api.openligadb.de";
	
	@GET @Path("/getavailablegroups/{leagueShortcut}/{leagueSeason}")
	@Produces(MediaType.APPLICATION_JSON)
	List<OpenLigaGroup> getAvailableGroups(@PathParam("leagueShortcut") String leagueShortcut, @PathParam("leagueSeason") String leagueSeason);
	
	@GET @Path("/getcurrentgroup/{leagueShortcut}")
	@Produces(MediaType.APPLICATION_JSON)
	OpenLigaGroup getCurrentGroup(@PathParam("leagueShortcut") String leagueShortcut);
	
	@GET @Path("/getlastchangedate/{league}/{season}/{day}")
	@Produces(MediaType.APPLICATION_JSON)
	Date getLastChangeDate(@PathParam("league") String leagueShortcut, @PathParam("season") String leagueSeason, @PathParam("day") int groupOrderId);
	
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