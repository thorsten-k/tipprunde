package org.tipprunde.model.json.ssi.openliga;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.googlecode.objectify.annotation.Cache;
import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;

@Cache @Entity

@JsonInclude(JsonInclude.Include.NON_NULL)
//@JsonIgnoreProperties(ignoreUnknown = true)
public class OpenLigaGoal
{
	public static final long serialVersionUID=1;
	
	@Id
	@JsonProperty("goalID")
	private Long id;
	public Long getId(){return id;}
	public void setId(Long id){this.id = id;}
	
	@JsonProperty("scoreTeam1")
	private Integer scoreTeam1;
	public Integer getScoreTeam1() {return scoreTeam1;}
	public void setScoreTeam1(Integer scoreTeam1) {this.scoreTeam1 = scoreTeam1;}
	
	@JsonProperty("scoreTeam2")
	private Integer scoreTeam2;
	public Integer getScoreTeam2() {return scoreTeam2;}
	public void setScoreTeam2(Integer scoreTeam2) {this.scoreTeam2 = scoreTeam2;}
	
	@JsonProperty("matchMinute")
	private Integer matchMinute;
	public Integer getMatchMinute() {return matchMinute;}
	public void setMatchMinute(Integer matchMinute) {this.matchMinute = matchMinute;}

	@JsonProperty("goalGetterID")
	private Integer goalGetterID;
	public String getGoalGetterName() {return goalGetterName;}
	public void setGoalGetterName(String goalGetterName) {this.goalGetterName = goalGetterName;}

	@JsonProperty("goalGetterName")
	private String goalGetterName;
	public Integer getGoalGetterID() {return goalGetterID;}
	public void setGoalGetterID(Integer goalGetterID) {this.goalGetterID = goalGetterID;}
	
	@JsonProperty("isPenalty")
	private Boolean penalty;
	public Boolean getPenalty() {return penalty;}
	public void setPenalty(Boolean penalty) {this.penalty = penalty;}

	@JsonProperty("isOwnGoal")
	private Boolean ownGoal;
	public Boolean getOwnGoal() {return ownGoal;}
	public void setOwnGoal(Boolean ownGoal) {this.ownGoal = ownGoal;}

	@JsonProperty("isOvertime")
	private Boolean overtime;
	public Boolean getOvertime() {return overtime;}
	public void setOvertime(Boolean overtime) {this.overtime = overtime;}

	@JsonProperty("comment")
	private String comment;
	public String getComment() {return comment;}
	public void setComment(String comment) {this.comment = comment;}
	
	public String toString()
	{
		StringBuffer sb = new StringBuffer();
		sb.append("[").append(id).append("]");
		
		
		return sb.toString();
	}
}