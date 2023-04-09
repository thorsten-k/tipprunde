package org.tipprunde.factory.json.liga;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.ObjectUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.tipprunde.factory.json.JsonTrContainerFactory;
import org.tipprunde.factory.json.ds.JsonDataSourceFactory;
import org.tipprunde.factory.json.ds.JsonDsOpenligaFactory;
import org.tipprunde.interfaces.ejb.liga.match.TipprundeDsOpenLiga;
import org.tipprunde.model.json.JsonTrContainer;
import org.tipprunde.model.json.ds.JsonDsOpenLiga;
import org.tipprunde.model.json.liga.JsonDiscipline;
import org.tipprunde.model.json.ssi.openliga.OpenLigaSport;

public class JsonDisciplineFactory
{	
	final static Logger logger = LoggerFactory.getLogger(JsonDisciplineFactory.class);
	
	public static JsonDisciplineFactory instance(){return new JsonDisciplineFactory();}
	private JsonDisciplineFactory()
	{
		
	}
	
	public static JsonDiscipline build() {return new JsonDiscipline();}
	
	public static JsonTrContainer transform(List<OpenLigaSport> sports)
	{
		JsonTrContainer json = JsonTrContainerFactory.build();
		
		if(ObjectUtils.isNotEmpty(sports))
		{
			json.setDisciplines(new ArrayList<>());
			for(OpenLigaSport olg : sports)
			{
				json.getDisciplines().add(JsonDisciplineFactory.transform(olg));
			}
		}
		
		return json;
	}
	public static JsonDiscipline transform(OpenLigaSport sport)
	{
		JsonDiscipline json = JsonDisciplineFactory.build();
		json.setName(sport.getName());
		
		JsonDsOpenLiga dsOpenLiga = JsonDsOpenligaFactory.build();
		dsOpenLiga.setRefId(sport.getId().intValue());
		dsOpenLiga.setType(TipprundeDsOpenLiga.Type.sport.toString());
		json.setDataSource(JsonDataSourceFactory.build(dsOpenLiga));
		
		return json;
	}
}