package org.tipprunde.model.json.liga;

import org.jeesl.model.json.system.status.JsonType;
import org.tipprunde.model.json.ds.JsonDataSource;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class JsonLigaResult
{
	public static final long serialVersionUID=1;
	
	@JsonProperty("dataSource")
	private JsonDataSource dataSource;
	public JsonDataSource getDataSource() {return dataSource;}
	public void setDataSource(JsonDataSource dataSource) {this.dataSource = dataSource;}
	
	@JsonProperty("points1")
	private Integer points1;
	public Integer getPoints1() {return points1;}
	public void setPoints1(Integer points1) {this.points1 = points1;}

	@JsonProperty("points2")
	private Integer points2;
	public Integer getPoints2() {return points2;}
	public void setPoints2(Integer points2) {this.points2 = points2;}
	
	@JsonProperty("type")
	private JsonType type;
	public JsonType getType() {return type;}
	public void setType(JsonType type) {this.type = type;}
}