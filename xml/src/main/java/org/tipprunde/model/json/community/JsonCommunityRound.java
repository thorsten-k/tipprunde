package org.tipprunde.model.json.community;

import java.time.LocalDateTime;

import org.tipprunde.model.json.liga.JsonLigaRound;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;

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
	
	@JsonProperty("tippDeadline")
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd HH:mm:ss.SSS")
	@JsonDeserialize(using = LocalDateTimeDeserializer.class)
	@JsonSerialize(using = LocalDateTimeSerializer.class)
	private LocalDateTime tippDeadline;
	public LocalDateTime getTippDeadline() {return tippDeadline;}
	public void setTippDeadline(LocalDateTime tippDeadline) {this.tippDeadline = tippDeadline;}
}