package org.tipprunde.model.json.ssi.openliga;

import org.apache.commons.lang3.builder.EqualsBuilder;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.googlecode.objectify.annotation.Cache;
import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;

@Cache @Entity
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonAutoDetect(fieldVisibility=Visibility.ANY, getterVisibility=Visibility.NONE, setterVisibility=Visibility.NONE)
//@JsonIgnoreProperties(ignoreUnknown = true)
public class OpenLigaSport
{
	public static final long serialVersionUID=1;
	
	@Id
	@JsonProperty("sportId")
	private Long id;
	public Long getId(){return id;}
	public void setId(Long id){this.id = id;}
	
	@JsonProperty("sportName")
	private String name;
	public String getName(){return name;}
	public void setName(String name){this.name = name;}
		
	@Override public boolean equals(Object object)
	{
		if (object == null) {return false;} if (object == this) {return true;}  if (!(object instanceof OpenLigaSport)) {return false;}	
		OpenLigaSport other = (OpenLigaSport)object;
		return new EqualsBuilder().append(id,other.getId()).isEquals();
	}
}