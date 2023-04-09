package org.tipprunde.model.json;

import java.util.List;

import org.tipprunde.model.json.ds.JsonDataSource;
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
	
	@JsonProperty("disciplines")
	private List<JsonDiscipline> disciplines;
	public List<JsonDiscipline> getDisciplines() {return disciplines;}
	public void setDisciplines(List<JsonDiscipline> disciplines) {this.disciplines = disciplines;}
	
	@JsonProperty("events")
	private List<JsonLigaEvent> events;
	public List<JsonLigaEvent> getEvents() {return events;}
	public void setEvents(List<JsonLigaEvent> events) {this.events = events;}
	
	@JsonProperty("rounds")
	private List<JsonLigaRound> rounds;
	public List<JsonLigaRound> getRounds() {return rounds;}
	public void setRounds(List<JsonLigaRound> rounds) {this.rounds = rounds;}

	@JsonProperty("matches")
	private List<JsonLigaMatch> matches;
	public List<JsonLigaMatch> getMatches() {return matches;}
	public void setMatches(List<JsonLigaMatch> matches) {this.matches = matches;}

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
	
	
	@JsonProperty("datasource")
	private JsonDataSource datasource;
	public JsonDataSource getDatasource() {return datasource;}
	public void setDatasource(JsonDataSource datasource) {this.datasource = datasource;}
}