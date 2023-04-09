package org.tipprunde.model.json.liga;

import java.time.LocalDateTime;
import java.util.List;

import org.tipprunde.model.json.ds.JsonDataSource;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class JsonLigaMatch
{
	public static final long serialVersionUID=1;
	
	@JsonProperty("dataSource")
	private JsonDataSource dataSource;
	public JsonDataSource getDataSource() {return dataSource;}
	public void setDataSource(JsonDataSource dataSource) {this.dataSource = dataSource;}
	
	@JsonProperty("beginLocal")
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd HH:mm:ss")
	@JsonDeserialize(using=LocalDateTimeDeserializer.class)
	@JsonSerialize(using=LocalDateTimeSerializer.class)
	private LocalDateTime beginLocal;
	public LocalDateTime getBeginLocal() {return beginLocal;}
	public void setBeginLocal(LocalDateTime beginLocal) {this.beginLocal = beginLocal;}
	
	@JsonProperty("beginUtc")
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd HH:mm:ss")
	@JsonDeserialize(using=LocalDateTimeDeserializer.class)
	@JsonSerialize(using=LocalDateTimeSerializer.class)
	private LocalDateTime beginUtc;
	public LocalDateTime getBeginUtc() {return beginUtc;}
	public void setBeginUtc(LocalDateTime beginUtc) {this.beginUtc = beginUtc;}

	@JsonProperty("finished")
	private Boolean finished;
	public Boolean getFinished() {return finished;}
	public void setFinished(Boolean finished) {this.finished = finished;}
	
	@JsonProperty("round")
	private JsonLigaRound round;
	public JsonLigaRound getRound() {return round;}
	public void setRound(JsonLigaRound round) {this.round = round;}
	
	@JsonProperty("team1")
	private JsonLigaTeam team1;
	public JsonLigaTeam getTeam1() {return team1;}
	public void setTeam1(JsonLigaTeam team1) {this.team1 = team1;}

	@JsonProperty("team2")
	private JsonLigaTeam team2;
	public JsonLigaTeam getTeam2() {return team2;}
	public void setTeam2(JsonLigaTeam team2) {this.team2 = team2;}
	
	@JsonProperty("results")
	private List<JsonLigaResult> results;
	public List<JsonLigaResult> getResults() {return results;}
	public void setResults(List<JsonLigaResult> results) {this.results = results;}
}