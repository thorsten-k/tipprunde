package org.tipprunde.model.json;

import org.tipprunde.model.json.liga.JsonDiscipline;
import org.tipprunde.model.json.liga.JsonEvent;
import org.tipprunde.model.json.liga.JsonMatch;
import org.tipprunde.model.json.liga.JsonRound;

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
	private JsonEvent event;
	public JsonEvent getEvent() {return event;}
	public void setEvent(JsonEvent event) {this.event = event;}
	
	@JsonProperty("round")
	private JsonRound round;
	public JsonRound getRound() {return round;}
	public void setRound(JsonRound round) {this.round = round;}
	
	@JsonProperty("match")
	private JsonMatch match;
	public JsonMatch getMatch() {return match;}
	public void setMatch(JsonMatch match) {this.match = match;}
}