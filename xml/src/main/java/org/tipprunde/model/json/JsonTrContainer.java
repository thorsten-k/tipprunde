package org.tipprunde.model.json;

import org.tipprunde.model.json.liga.JsonDiscipline;
import org.tipprunde.model.json.liga.JsonLigaEvent;
import org.tipprunde.model.json.liga.JsonLigaMatch;
import org.tipprunde.model.json.liga.JsonLigaRound;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
//@JsonAutoDetect(fieldVisibility=Visibility.ANY, getterVisibility=Visibility.NONE, setterVisibility=Visibility.NONE)
//@JsonIgnoreProperties(ignoreUnknown = true)
public class JsonTrContainer
{
	public static final long serialVersionUID=1;
	
	@JsonProperty("discipline")
	private JsonDiscipline discipline;
	public JsonDiscipline getDiscipline() {return discipline;}
	public void setDiscipline(JsonDiscipline discipline) {this.discipline = discipline;}
	
	@JsonProperty("event")
	private JsonLigaEvent event;
	public JsonLigaEvent getEvent() {return event;}
	public void setEvent(JsonLigaEvent event) {this.event = event;}
	
	@JsonProperty("round")
	private JsonLigaRound round;
	public JsonLigaRound getRound() {return round;}
	public void setRound(JsonLigaRound round) {this.round = round;}
	
	@JsonProperty("match")
	private JsonLigaMatch match;
	public JsonLigaMatch getMatch() {return match;}
	public void setMatch(JsonLigaMatch match) {this.match = match;}
}