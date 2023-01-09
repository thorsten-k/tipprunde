package org.tipprunde.util.query.json;

import org.tipprunde.model.json.liga.JsonEvent;
import org.tipprunde.model.json.liga.JsonRound;

public class JsonEnterpriseQuery
{
	public static JsonEvent event()
	{
		JsonEvent json = new JsonEvent();
		json.setName("");
		return json;
	}
	
	public static JsonRound round()
	{
		JsonRound json = new JsonRound();
		json.setNumber(0);
		json.setName("");
		return json;
	}
}
