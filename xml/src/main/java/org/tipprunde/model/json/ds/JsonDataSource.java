package org.tipprunde.model.json.ds;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class JsonDataSource
{
	public static final long serialVersionUID=1;
	
	@JsonProperty("refId")
	private String refId;
	public String getRefId() {return refId;}
	public void setRefId(String refId) {this.refId = refId;}
	
	@JsonProperty("openliga")
	private JsonDsOpenLiga openliga;
	public JsonDsOpenLiga getOpenliga() {return openliga;}
	public void setOpenliga(JsonDsOpenLiga openliga) {this.openliga = openliga;}
}