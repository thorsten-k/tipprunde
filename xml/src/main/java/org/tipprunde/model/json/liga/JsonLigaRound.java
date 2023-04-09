package org.tipprunde.model.json.liga;

import java.util.List;

import org.tipprunde.model.json.ds.JsonDataSource;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class JsonLigaRound
{
	public static final long serialVersionUID=1;
	
	@JsonProperty("id")
	private Long id;
	public Long getId() {return id;}
	public void setId(Long id) {this.id = id;}
	
	@JsonProperty("dataSource")
	private JsonDataSource dataSource;
	public JsonDataSource getDataSource() {return dataSource;}
	public void setDataSource(JsonDataSource dataSource) {this.dataSource = dataSource;}

	@JsonProperty("number")
	private Integer number;
	public Integer getNumber() {return number;}
	public void setNumber(Integer number) {this.number = number;}

	@JsonProperty("name")
	private String name;
	public String getName() {return name;}
	public void setName(String name) {this.name = name;}
	
	@JsonProperty("events")
	private List<JsonLigaEvent> events;
	public List<JsonLigaEvent> getEvents() {return events;}
	public void setEvents(List<JsonLigaEvent> events) {this.events = events;}
}