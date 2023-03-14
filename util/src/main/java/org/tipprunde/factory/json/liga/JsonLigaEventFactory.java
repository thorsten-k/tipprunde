package org.tipprunde.factory.json.liga;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.ObjectUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.tipprunde.model.json.liga.JsonLigaEvent;
import org.tipprunde.model.json.ssi.openliga.OpenLigaGroup;

public class JsonLigaEventFactory
{	
	final static Logger logger = LoggerFactory.getLogger(JsonLigaEventFactory.class);
	
	public static JsonLigaEventFactory instance(){return new JsonLigaEventFactory();}
	private JsonLigaEventFactory()
	{
		
	}
	
	public static JsonLigaEvent build() {return new JsonLigaEvent();}
	public static JsonLigaEvent transform(List<OpenLigaGroup> groups)
	{
		JsonLigaEvent json = build();
		
		if(ObjectUtils.isNotEmpty(groups))
		{
			json.setRounds(new ArrayList<>());
			for(OpenLigaGroup olg : groups)
			{
				json.getRounds().add(JsonLigaRoundFactory.transform(olg));
			}
		}
		
		return json;
	}
}