package org.tipprunde.model.json.community;

import java.util.List;

import org.tipprunde.model.json.liga.JsonLigaEvent;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class JsonCommunityEvent
{
	public static final long serialVersionUID=1;
	
	@JsonProperty("name")
	private String name;
	public String getName() {return name;}
	public void setName(String name) {this.name = name;}
	
	@JsonProperty("event")
	private JsonLigaEvent event;
	public JsonLigaEvent getEvent() {return event;}
	public void setEvent(JsonLigaEvent event) {this.event = event;}

	@JsonProperty("rounds")
	private List<JsonCommunityRound> rounds;
	public List<JsonCommunityRound> getRounds() {return rounds;}
	public void setRounds(List<JsonCommunityRound> rounds) {this.rounds = rounds;}
}