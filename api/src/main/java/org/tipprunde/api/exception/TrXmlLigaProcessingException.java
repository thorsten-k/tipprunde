package org.tipprunde.api.exception;

import java.io.Serializable;

public class TrXmlLigaProcessingException extends Exception implements Serializable
{
	private static final long serialVersionUID = 1;

	public TrXmlLigaProcessingException() 
	{ 
	} 
 
	public TrXmlLigaProcessingException(String s) 
	{ 
		super(s); 
	} 
}
