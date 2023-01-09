package org.tipprunde.model.json.community;

import org.tipprunde.model.json.liga.JsonLigaRound;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class JsonCommunityRound
{
	public static final long serialVersionUID=1;
	
	@JsonProperty("id")
	private Long id;
	public Long getId() {return id;}
	public void setId(Long id) {this.id = id;}

	@JsonProperty("round")
	private JsonLigaRound round;
	public JsonLigaRound getRound() {return round;}
	public void setRound(JsonLigaRound round) {this.round = round;}
}