package org.tipprunde.factory.json.liga;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import org.apache.commons.lang3.ObjectUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.tipprunde.factory.json.JsonTrContainerFactory;
import org.tipprunde.factory.json.ds.JsonDataSourceFactory;
import org.tipprunde.model.json.JsonTrContainer;
import org.tipprunde.model.json.ds.JsonDsOpenLiga;
import org.tipprunde.model.json.liga.JsonLigaEvent;
import org.tipprunde.model.json.liga.JsonLigaRound;
import org.tipprunde.model.json.ssi.openliga.OpenLigaGroup;

public class JsonLigaEventFactory
{	
	final static Logger logger = LoggerFactory.getLogger(JsonLigaEventFactory.class);
	
	public static JsonLigaEventFactory instance(){return new JsonLigaEventFactory();}
	private JsonLigaEventFactory()
	{
		
	}
	
	public static JsonLigaEvent build() {return new JsonLigaEvent();}
	
	public static JsonTrContainer transform(JsonDsOpenLiga job, List<OpenLigaGroup> groups)
	{
		JsonTrContainer json = JsonTrContainerFactory.build();
		
		json.setEvents(new ArrayList<>());
		JsonLigaEvent event = JsonLigaEventFactory.build();
		event.setDataSource(JsonDataSourceFactory.build(job));
		json.getEvents().add(event);
		
		if(ObjectUtils.isNotEmpty(groups))
		{
			json.setRounds(new ArrayList<>());
			for(OpenLigaGroup olg : groups)
			{
				JsonLigaRound r = JsonLigaRoundFactory.transform(olg);
				if(Objects.nonNull(r.getDataSource()) && Objects.nonNull(r.getDataSource().getOpenliga()))
				{
					r.getDataSource().getOpenliga().setSeason(job.getSeason());
					r.getDataSource().getOpenliga().setShortcut(job.getShortcut());
				}
				
				json.getRounds().add(r);
			}
		}
		
		return json;
	}
}