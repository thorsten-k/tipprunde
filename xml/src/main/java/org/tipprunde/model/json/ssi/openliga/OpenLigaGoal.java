package org.tipprunde.model.json.ssi.openliga;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.googlecode.objectify.annotation.Cache;
import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;

@Cache
@Entity

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonAutoDetect(fieldVisibility=Visibility.ANY, getterVisibility=Visibility.NONE, setterVisibility=Visibility.NONE)
@JsonIgnoreProperties(ignoreUnknown = true)
public class OpenLigaGoal
{
	public static final long serialVersionUID=1;
	
	@Id
	@JsonProperty("GoalID")
	private long id;
	public long getId(){return id;}
	public void setId(long id){this.id = id;}
	

	
	public String toString()
	{
		StringBuffer sb = new StringBuffer();
		sb.append("[").append(id).append("]");
		
		
		return sb.toString();
	}
}