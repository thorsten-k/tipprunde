package org.tipprunde.model.json.liga;

import java.util.List;

import org.tipprunde.model.json.ds.JsonDataSource;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class JsonRound
{
	public static final long serialVersionUID=1;
	
	@JsonProperty("number")
	private Integer number;
	public Integer getNumber() {return number;}
	public void setNumber(Integer number) {this.number = number;}

	@JsonProperty("name")
	private String name;
	public String getName() {return name;}
	public void setName(String name) {this.name = name;}
	
	@JsonProperty("events")
	private List<JsonEvent> events;
	public List<JsonEvent> getEvents() {return events;}
	public void setEvents(List<JsonEvent> events) {this.events = events;}

	@JsonProperty("dataSource")
	private JsonDataSource dataSource;
	public JsonDataSource getDataSource() {return dataSource;}
	public void setDataSource(JsonDataSource dataSource) {this.dataSource = dataSource;}
}