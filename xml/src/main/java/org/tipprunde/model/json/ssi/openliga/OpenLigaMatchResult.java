package org.tipprunde.model.json.ssi.openliga;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonAutoDetect(fieldVisibility=Visibility.ANY, getterVisibility=Visibility.NONE, setterVisibility=Visibility.NONE)
//@JsonIgnoreProperties(ignoreUnknown = true)
public class OpenLigaMatchResult
{
	public static final long serialVersionUID=1;
	
	@JsonProperty("ResultID")
	private Long id;
	public Long getId(){return id;}
	public void setId(Long id){this.id = id;}
	
	@JsonProperty("ResultName")
	private String name;
	public String getName() {return name;}
	public void setName(String name) {this.name = name;}

	@JsonProperty("PointsTeam1")
	private int left;
	public int getLeft() {return left;}
	public void setLeft(int left) {this.left = left;}
	
	@JsonProperty("PointsTeam2")
	private int right;
	public int getRight() {return right;}
	public void setRight(int right) {this.right = right;}
	
	@JsonProperty("ResultOrderID")
	private Integer order;
	public Integer getOrder() {return order;}
	public void setOrder(Integer order) {this.order = order;}
	
	@JsonProperty("ResultTypeID")
	private Integer type;
	public Integer getType() {return type;}
	public void setType(Integer type) {this.type = type;}
	
	@JsonProperty("ResultDescription")
	private String description;
	public String getDescription() {return description;}
	public void setDescription(String description) {this.description = description;}
	
	public String toString()
	{
		StringBuffer sb = new StringBuffer();
		sb.append("[").append(id).append("]");
		sb.append(" ").append(order);
		sb.append(" ").append(name);
		return sb.toString();
	}
}