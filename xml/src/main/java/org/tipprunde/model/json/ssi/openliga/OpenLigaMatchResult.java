package org.tipprunde.model.json.ssi.openliga;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
//@JsonIgnoreProperties(ignoreUnknown = true)
public class OpenLigaMatchResult
{
	public static final long serialVersionUID=1;
	
	@JsonProperty("resultID")
	private Long id;
	public Long getId(){return id;}
	public void setId(Long id){this.id = id;}
	
	@JsonProperty("resultName")
	private String name;
	public String getName() {return name;}
	public void setName(String name) {this.name = name;}

	@JsonProperty("pointsTeam1")
	private Integer left;
	public Integer getLeft() {return left;}
	public void setLeft(Integer left) {this.left = left;}
	
	@JsonProperty("pointsTeam2")
	private Integer right;
	public Integer getRight() {return right;}
	public void setRight(Integer right) {this.right = right;}
	
	@JsonProperty("resultOrderID")
	private Integer order;
	public Integer getOrder() {return order;}
	public void setOrder(Integer order) {this.order = order;}
	
	@JsonProperty("resultTypeID")
	private Integer type;
	public Integer getType() {return type;}
	public void setType(Integer type) {this.type = type;}
	
	@JsonProperty("resultDescription")
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