package org.tipprunde.model.json.ssi.openliga;

import java.time.LocalDateTime;
import java.util.List;

import org.jeesl.util.time.ZuluDateTimeDeserializer;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;
import com.googlecode.objectify.annotation.Cache;
import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;
import com.googlecode.objectify.annotation.Index;

@Cache @Entity

@JsonInclude(JsonInclude.Include.NON_NULL)
//@JsonIgnoreProperties(ignoreUnknown = true)
public class OpenLigaMatch
{
	public static final long serialVersionUID=1;
	
	@Id
	@JsonProperty("matchID")
	private Long id;
	public Long getId() {return id;}
	public void setId(Long id) {this.id = id;}
	
	@JsonProperty("matchDateTime")
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd'T'HH:mm:ss")
	@JsonDeserialize(using = LocalDateTimeDeserializer.class)
	@JsonSerialize(using = LocalDateTimeSerializer.class)
	private LocalDateTime matchDateTime;
	public LocalDateTime getMatchDateTime() {return matchDateTime;}
	public void setMatchDateTime(LocalDateTime matchDateTime) {this.matchDateTime = matchDateTime;}

	@JsonProperty("timeZoneID")
	private String timeZoneName;
	public String getTimeZoneName() {return timeZoneName;}
	public void setTimeZoneName(String timeZoneName) {this.timeZoneName = timeZoneName;}
	
	@JsonProperty("matchDateTimeUTC")
	@JsonFormat(pattern="yyyy-MM-dd'T'HH:mm:ss'Z'")
	@JsonSerialize(using = LocalDateTimeSerializer.class)
	@JsonDeserialize(using = ZuluDateTimeDeserializer.class)
	private LocalDateTime matchDateTimeUtc;
	public LocalDateTime getMatchDateTimeUtc() {return matchDateTimeUtc;}
	public void setMatchDateTimeUtc(LocalDateTime matchDateTimeUtc) {this.matchDateTimeUtc = matchDateTimeUtc;}
	
	@JsonProperty("lastUpdateDateTime")
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd'T'HH:mm:ss.SSS")
	@JsonDeserialize(using = LocalDateTimeDeserializer.class)
	@JsonSerialize(using = LocalDateTimeSerializer.class)
	private LocalDateTime updateDateTime;
	public LocalDateTime getUpdateDateTime() {return updateDateTime;}
	public void setUpdateDateTime(LocalDateTime updateDateTime) {this.updateDateTime = updateDateTime;}

	@JsonProperty("leagueId")
	private long leagueId;
	public long getLeagueId() {return leagueId;}
	public void setLeagueId(long leagueId) {this.leagueId = leagueId;}
	
	@JsonProperty("leagueSeason")
	private String leagueSeason;
	public String getLeagueSeason() {return leagueSeason;}
	public void setLeagueSeason(String leagueSeason) {this.leagueSeason = leagueSeason;}
	
	@JsonProperty("leagueShortcut")
	private String leagueShortcut;
	public String getLeagueShortcut() {return leagueShortcut;}
	public void setLeagueShortcut(String leagueShortcut) {this.leagueShortcut = leagueShortcut;}

	@JsonProperty("leagueName")
	private String leagueName;
	public String getLeagueName() {return leagueName;}
	public void setLeagueName(String leagueName) {this.leagueName = leagueName;}
	
	@JsonProperty("group")
	private OpenLigaGroup group;
	public OpenLigaGroup getGroup() {return group;}
	public void setGroup(OpenLigaGroup group) {this.group = group;}

	@Index
	private Long groupId;
	public Long getGroupId(){return groupId;}
	public void setGroupId(Long groupId){this.groupId = groupId;}

	@JsonProperty("team1")
	private OpenLigaTeam teamLeft;
	public OpenLigaTeam getTeamLeft(){return teamLeft;}
	public void setTeamLeft(OpenLigaTeam teamLeft){this.teamLeft = teamLeft;}
	
	@JsonProperty("team2")
	private OpenLigaTeam teamRight;
	public OpenLigaTeam getTeamRight(){return teamRight;}
	public void setTeamRight(OpenLigaTeam teamRight){this.teamRight = teamRight;}
	
	@JsonProperty("matchIsFinished")
	private Boolean finished;
	public Boolean getFinished() {return finished;}
	public void setFinished(Boolean finished) {this.finished = finished;}
	
	
	@JsonProperty("matchResults")
	private List<OpenLigaMatchResult> results;
	public List<OpenLigaMatchResult> getResults(){return results;}
	public void setResults(List<OpenLigaMatchResult> results){this.results = results;}
	
	@JsonProperty("matchResult")
	private OpenLigaMatchResult result;
	public OpenLigaMatchResult getResult() {return result;}
	public void setResult(OpenLigaMatchResult result) {this.result = result;}
	
	@JsonProperty("goals")
	private List<OpenLigaGoal> goals;
	public List<OpenLigaGoal> getGoals(){return goals;}
	public void setGoals(List<OpenLigaGoal> goals){this.goals = goals;}
	
	@JsonProperty("location")
	private OpenLigaLocation location;
	public OpenLigaLocation getLocation() {return location;}
	public void setLocation(OpenLigaLocation location) {this.location = location;}
	
	@JsonProperty("numberOfViewers")
	private Integer numberOfViewers;
	public Integer getNumberOfViewers() {return numberOfViewers;}
	public void setNumberOfViewers(Integer numberOfViewers) {this.numberOfViewers = numberOfViewers;}
	
	public String toString()
	{
		StringBuffer sb = new StringBuffer();
		sb.append("[").append(id).append("]");
		sb.append(" ko").append(matchDateTime);
		sb.append(" up").append(updateDateTime);
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