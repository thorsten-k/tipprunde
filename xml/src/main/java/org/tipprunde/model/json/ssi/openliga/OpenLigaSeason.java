package org.tipprunde.model.json.ssi.openliga;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonAutoDetect(fieldVisibility=Visibility.ANY, getterVisibility=Visibility.NONE, setterVisibility=Visibility.NONE)
@JsonIgnoreProperties(ignoreUnknown = true)
public class OpenLigaSeason
{
	public static final long serialVersionUID=1;
	
	@JsonProperty("Year")
	private int year;
	public int getYear() {return year;}
	public void setYear(int year) {this.year = year;}
	
	@JsonProperty("Groups")
	private List<OpenLigaGroup> groups;
	public List<OpenLigaGroup> getGroups() {if(groups==null){groups = new ArrayList<OpenLigaGroup>();} return groups;}
	public void setGroups(List<OpenLigaGroup> groups) {this.groups = groups;}
}