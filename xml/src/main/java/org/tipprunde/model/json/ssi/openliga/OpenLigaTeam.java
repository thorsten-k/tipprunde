package org.tipprunde.model.json.ssi.openliga;

import com.fasterxml.jackson.annotation.JsonProperty;

//@JsonIgnoreProperties(ignoreUnknown = true)
public class OpenLigaTeam
{
	public static final long serialVersionUID=1;
	
	@JsonProperty("teamId")
	private Long id;
	public Long getId(){return id;}
	public void setId(Long id){this.id = id;}
	
	@JsonProperty("teamName")
	private String name;
	public String getName() {return name;}
	public void setName(String name) {this.name = name;}

	@JsonProperty("shortName")
	private String shortName;
	public String getShortName() {return shortName;}
	public void setShortName(String shortName) {this.shortName = shortName;}

	@JsonProperty("teamIconUrl")
	private String iconUrl;
	public String getIconUrl() {return iconUrl;}
	public void setIconUrl(String iconUrl) {this.iconUrl = iconUrl;}
	
	@JsonProperty("teamGroupName")
	private String groupName;
	public String getGroupName() {return groupName;}
	public void setGroupName(String groupName) {this.groupName = groupName;}
	
	public String toString()
	{
		StringBuffer sb = new StringBuffer();
		sb.append("[").append(id).append("]");
		sb.append(" ").append(name);
		return sb.toString();
	}
}