package org.tipprunde.model.json.ds;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class JsonDsOpenLiga
{
	public static final long serialVersionUID=1;
	
	@JsonProperty("refId")
	private Integer refId;
	public Integer getRefId() {return refId;}
	public void setRefId(Integer refId) {this.refId = refId;}
	
	@JsonProperty("season")
	public String season;
	public String getSeason() {return season;}
	public void setSeason(String season) {this.season = season;}
	
	@JsonProperty("shortcut")
	public String shortcut;
	public String getShortcut() {return shortcut;}
	public void setShortcut(String shortcut) {this.shortcut = shortcut;}
	
	@JsonProperty("type")
	public String type;
	public String getType() {return type;}
	public void setType(String type) {this.type = type;}

}