package org.tipprunde.factory.json.ds;

import org.tipprunde.model.json.ds.JsonDsOpenLiga;

public class JsonDsOpenligaFactory
{	
	protected final JsonDsOpenLiga q;
	
	protected JsonDsOpenligaFactory(String localeCode, JsonDsOpenLiga q)
	{
		this.q=q;
	}
	
	public static JsonDsOpenLiga build() {return new JsonDsOpenLiga();}
}
