package org.tipprunde.api.exception;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class TrOpenligaException extends Exception implements Serializable
{
	private static final long serialVersionUID = 1;

	private List<String> messages;

	public TrOpenligaException() 
	{ 
		messages = new ArrayList<String>();
	} 
 
	public TrOpenligaException(String s) 
	{ 
		super(s);
		messages = new ArrayList<String>();
	}
	
	public void addMessage(String s){messages.add(s);}
	public void addMessages(List<String> s){messages.addAll(s);}
	public List<String> getMessages() {return messages;}
	
}
