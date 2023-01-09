package org.tipprunde.util.query.json;

import org.tipprunde.model.json.community.JsonCommunityEvent;
import org.tipprunde.model.json.community.JsonCommunityRound;
import org.tipprunde.model.json.liga.JsonLigaEvent;
import org.tipprunde.model.json.liga.JsonLigaRound;

public class JsonEnterpriseQuery
{
	public static JsonCommunityEvent event()
	{
		JsonLigaEvent event = new JsonLigaEvent();
		event.setName("");
		
		JsonCommunityEvent json = new JsonCommunityEvent();
		json.setEvent(event);
		
		return json;
	}
	
	public static JsonCommunityRound round()
	{
		JsonLigaRound round = new JsonLigaRound();
		round.setNumber(0);
		round.setName("");
		
		JsonCommunityRound json = new JsonCommunityRound();
		json.setId(0l);
		json.setRound(round);
		
		return json;
	}
}
