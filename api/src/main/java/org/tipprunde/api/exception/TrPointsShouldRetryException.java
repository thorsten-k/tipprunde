package org.tipprunde.api.exception;

import java.io.Serializable;

public class TrPointsShouldRetryException extends Exception implements Serializable
{
	private static final long serialVersionUID = 1;

	public TrPointsShouldRetryException() 
	{ 
	} 
 
	public TrPointsShouldRetryException(String s) 
	{ 
		super(s); 
	} 
}
