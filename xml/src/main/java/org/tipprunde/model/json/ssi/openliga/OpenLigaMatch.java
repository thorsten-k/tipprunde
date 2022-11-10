package org.tipprunde.model.json.ssi.openliga;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.googlecode.objectify.annotation.Cache;
import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;
import com.googlecode.objectify.annotation.Index;

@Cache
@Entity

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonAutoDetect(fieldVisibility=Visibility.ANY, getterVisibility=Visibility.NONE, setterVisibility=Visibility.NONE)
//@JsonIgnoreProperties(ignoreUnknown = true)

public class OpenLigaMatch
{
	public static final long serialVersionUID=1;
	
	@Id
	@JsonProperty("MatchID")
	private long id;
	public long getId(){return id;}
	public void setId(long id){this.id = id;}
	
	@JsonProperty("MatchDateTime")
	private Date kickoff;
	public Date getKickoff(){return kickoff;}
	public void setKickoff(Date kickoff){this.kickoff = kickoff;}
	
	@JsonProperty("TimeZoneID")
	private String timeZoneName;
	
	public String getTimeZoneName() {
		return timeZoneName;
	}
	public void setTimeZoneName(String timeZoneName) {
		this.timeZoneName = timeZoneName;
	}

	@JsonProperty("LeagueId")
	private long leagueId;
	public long getLeagueId() {return leagueId;}
	public void setLeagueId(long leagueId) {this.leagueId = leagueId;}
	
	@JsonProperty("LeagueName")
	private String leagueName;
	public String getLeagueName() {return leagueName;}
	public void setLeagueName(String leagueName) {this.leagueName = leagueName;}
	
	@JsonProperty("Group")
	private OpenLigaGroup group;

	public OpenLigaGroup getGroup() {
		return group;
	}
	public void setGroup(OpenLigaGroup group) {
		this.group = group;
	}

	@Index
	private Long groupId;
	public Long getGroupId(){return groupId;}
	public void setGroupId(Long groupId){this.groupId = groupId;}




	
	@JsonProperty("MatchDateTimeUTC")
	private Date kickoffUtc;
	public Date getKickoffUtc() {return kickoffUtc;}
	public void setKickoffUtc(Date kickoffUtc) {this.kickoffUtc = kickoffUtc;}



	@JsonProperty("Team1")
	private OpenLigaTeam teamLeft;
	public OpenLigaTeam getTeamLeft(){return teamLeft;}
	public void setTeamLeft(OpenLigaTeam teamLeft){this.teamLeft = teamLeft;}
	
	@JsonProperty("Team2")
	private OpenLigaTeam teamRight;
	public OpenLigaTeam getTeamRight(){return teamRight;}
	public void setTeamRight(OpenLigaTeam teamRight){this.teamRight = teamRight;}
	
	@JsonProperty("LastUpdateDateTime")
	private Date update;
	public Date getUpdate(){return update;}
	public void setUpdate(Date update){this.update = update;}
	
	@JsonProperty("MatchIsFinished")
	private Boolean finished;
	public Boolean getFinished() {return finished;}
	public void setFinished(Boolean finished) {this.finished = finished;}
	
	
	@JsonProperty("MatchResults")
	private List<OpenLigaMatchResult> results;
	public List<OpenLigaMatchResult> getResults(){return results;}
	public void setResults(List<OpenLigaMatchResult> results){this.results = results;}
	
	@JsonProperty("MatchResult")
	private OpenLigaMatchResult result;
	public OpenLigaMatchResult getResult() {return result;}
	public void setResult(OpenLigaMatchResult result) {this.result = result;}
	
	@JsonProperty("Goals")
	private List<OpenLigaGoal> goals;
	public List<OpenLigaGoal> getGoals(){return goals;}
	public void setGoals(List<OpenLigaGoal> goals){this.goals = goals;}
	
	@JsonProperty("Location")
	private OpenLigaLocation location;
	public OpenLigaLocation getLocation() {return location;}
	public void setLocation(OpenLigaLocation location) {this.location = location;}
	
	@JsonProperty("NumberOfViewers")
	private Integer numberOfViewers;
	public Integer getNumberOfViewers() {return numberOfViewers;}
	public void setNumberOfViewers(Integer numberOfViewers) {this.numberOfViewers = numberOfViewers;}
	
	public String toString()
	{
		StringBuffer sb = new StringBuffer();
		sb.append("[").append(id).append("]");
		sb.append(" ko").append(kickoff);
		sb.append(" up").append(update);
		if(teamLeft!=null){sb.append(" TL{").append(teamLeft.toString()).append("}");}
		if(teamRight!=null){sb.append(" TR{").append(teamRight.toString()).append("}");}
		
		if(results!=null)
		{
			sb.append(" R: ");
			for(OpenLigaMatchResult r : results)
			{
				sb.append(r.toString());
			}
		}
		
		return sb.toString();
	}
}