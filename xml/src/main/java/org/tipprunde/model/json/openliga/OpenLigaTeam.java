package org.tipprunde.model.json.openliga;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonAutoDetect(fieldVisibility=Visibility.ANY, getterVisibility=Visibility.NONE, setterVisibility=Visibility.NONE)

public class OpenLigaTeam
{
	public static final long serialVersionUID=1;
	
	@JsonProperty("TeamId")
	private long id;
	public long getId(){return id;}
	public void setId(long id){this.id = id;}
	
	@JsonProperty("TeamName")
	private String name;
	

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String toString()
	{
		StringBuffer sb = new StringBuffer();
		sb.append("[").append(id).append("]");
		sb.append(" ").append(name);
		return sb.toString();
	}
}