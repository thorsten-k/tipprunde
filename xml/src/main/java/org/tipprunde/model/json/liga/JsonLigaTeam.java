package org.tipprunde.model.json.liga;

import org.tipprunde.model.json.ds.JsonDataSource;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class JsonLigaTeam
{
	public static final long serialVersionUID=1;
	
	@JsonProperty("dataSource")
	private JsonDataSource dataSource;
	public JsonDataSource getDataSource() {return dataSource;}
	public void setDataSource(JsonDataSource dataSource) {this.dataSource = dataSource;}
	
	@JsonProperty("name")
	private String name;
	public String getName() {return name;}
	public void setName(String name) {this.name = name;}
	
	@JsonProperty("shortName")
	private String shortName;
	public String getShortName() {return shortName;}
	public void setShortName(String shortName) {this.shortName = shortName;}

	@JsonProperty("iconUrl")
	private String iconUrl;
	public String getIconUrl() {return iconUrl;}
	public void setIconUrl(String iconUrl) {this.iconUrl = iconUrl;}
}