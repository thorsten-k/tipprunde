package org.tipprunde.model.json.error;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class OpenLigaError
{
	public static final long serialVersionUID=1;
	
	private int httpStatus;
	public int getHttpStatus(){return httpStatus;}
	public void setHttpStatus(int httpStatus){this.httpStatus = httpStatus;}
	
	@JsonProperty("Message")
	private String message;
	public String getMessage(){return message;}
	public void setMessage(String message){this.message = message;}
	

	
	public String toString()
	{
		StringBuffer sb = new StringBuffer();
		sb.append(message);
		return sb.toString();
	}
}