package org.tipprunde.api.exception;

import java.io.Serializable;

public class TrPointsProcessingException extends Exception implements Serializable
{
	private static final long serialVersionUID = 1;

	public TrPointsProcessingException() 
	{ 
	} 
 
	public TrPointsProcessingException(String s) 
	{ 
		super(s); 
	} 
}
