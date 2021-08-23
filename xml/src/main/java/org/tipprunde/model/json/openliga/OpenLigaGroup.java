package org.tipprunde.model.json.openliga;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.commons.lang3.builder.EqualsBuilder;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.googlecode.objectify.annotation.Cache;
import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;

@Cache
@Entity
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonAutoDetect(fieldVisibility=Visibility.ANY, getterVisibility=Visibility.NONE, setterVisibility=Visibility.NONE)
@JsonIgnoreProperties(ignoreUnknown = true)
public class OpenLigaGroup
{
	public static final long serialVersionUID=1;
	
	@Id
	@JsonProperty("GroupID")
	private Long id;
	public Long getId(){return id;}
	public void setId(Long id){this.id = id;}
	
	@JsonProperty("GroupName")
	private String name;
	public String getName(){return name;}
	public void setName(String name){this.name = name;}
	
	@JsonProperty("GroupOrderID")
	private int nr;
	public int getNr(){return nr;}
	public void setNr(int nr){this.nr = nr;}
	
	@JsonProperty("LeagueShortcut")
	private String leagueShortcut;
	public String getLeagueShortcut(){return leagueShortcut;}
	public void setLeagueShortcut(String leagueShortcut){this.leagueShortcut = leagueShortcut;}

	@JsonProperty("LeagueSeason")
	private String leagueSeason;
	public String getLeagueSeason(){return leagueSeason;}
	public void setLeagueSeason(String leagueSeason){this.leagueSeason = leagueSeason;}
	
	private Date lastUpdate;
	public Date getLastUpdate() {return lastUpdate;}
	public void setLastUpdate(Date lastUpdate) {this.lastUpdate = lastUpdate;}
	
	private Boolean activeUpdate;
	public Boolean isActiveUpdate() {return activeUpdate;}
	public void setActiveUpdate(Boolean activeUpdate) {this.activeUpdate = activeUpdate;}
	
	@JsonProperty("Matches")
	private List<OpenLigaMatch> matches;
	public List<OpenLigaMatch> getMatches() {if(matches==null){matches = new ArrayList<OpenLigaMatch>();}return matches;}
	public void setMatches(List<OpenLigaMatch> matches) {this.matches = matches;}
	
	public String toString()
	{
		StringBuffer sb = new StringBuffer();
		sb.append("[").append(id).append("]");
		sb.append(" ").append(nr);
		sb.append("-(").append(name).append(")");
		if(leagueShortcut!=null){sb.append(" ").append(leagueShortcut);}
		if(leagueSeason!=null){sb.append(":").append(leagueSeason);}
		sb.append(" Update:"+activeUpdate);
		sb.append(" Last:"+lastUpdate);
		return sb.toString();
	}
		
	@Override public boolean equals(Object object)
	{
		if (object == null) {return false;} if (object == this) {return true;}  if (!(object instanceof OpenLigaGroup)) {return false;}	
		OpenLigaGroup other = (OpenLigaGroup)object;
		return new EqualsBuilder().append(id,other.getId()).isEquals();
	}
}