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
public class OpenLigaLeague
{
	public static final long serialVersionUID=1;
	
	@JsonProperty("Code")
	private String code;
	public String getCode() {return code;}
	public void setCode(String code) {this.code = code;}
	
	@JsonProperty("Seasons")
	private List<OpenLigaSeason> seasons;
	public List<OpenLigaSeason> getSeasons() {if(seasons==null){seasons = new ArrayList<OpenLigaSeason>();}return seasons;}
	public void setSeasons(List<OpenLigaSeason> seasons) {this.seasons = seasons;}
	
}