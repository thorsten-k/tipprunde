package org.tipprunde.model.json.ssi.openliga;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.googlecode.objectify.annotation.Cache;
import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;

@Cache @Entity

@JsonInclude(JsonInclude.Include.NON_NULL)
//@JsonIgnoreProperties(ignoreUnknown = true)
public class OpenLigaLocation
{
	public static final long serialVersionUID=1;
	
	@Id
	@JsonProperty("locationID")
	private Long id;
	public long getId(){ return id;}
	public void setId(Long id) {this.id = id;}
	
	@JsonProperty("locationCity")
	private String city;
	public String getCity() {return city;}
	public void setCity(String city) {this.city = city;}
	
	@JsonProperty("locationStadium")
	private String stadium;
	public String getStadium() {return stadium;}
	public void setStadium(String stadium) {this.stadium = stadium;}
	
	public String toString()
	{
		StringBuffer sb = new StringBuffer();
		sb.append("[").append(id).append("]");
		
		
		return sb.toString();
	}
}