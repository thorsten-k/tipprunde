package org.tipprunde.model.json.liga;

import java.util.List;

import org.tipprunde.model.json.ds.JsonDataSource;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class JsonLigaEvent
{
	public static final long serialVersionUID=1;
	
	@JsonProperty("name")
	private String name;
	public String getName() {return name;}
	public void setName(String name) {this.name = name;}
	
	@JsonProperty("dataSource")
	private JsonDataSource dataSource;
	public JsonDataSource getDataSource() {return dataSource;}
	public void setDataSource(JsonDataSource dataSource) {this.dataSource = dataSource;}
	
	@JsonProperty("rounds")
	private List<JsonLigaRound> rounds;
	public List<JsonLigaRound> getRounds() {return rounds;}
	public void setRounds(List<JsonLigaRound> rounds) {this.rounds = rounds;}
}