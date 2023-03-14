package org.tipprunde.factory.json.liga;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.tipprunde.factory.json.ds.JsonDataSourceFactory;
import org.tipprunde.factory.json.ds.JsonDsOpenligaFactory;
import org.tipprunde.interfaces.ejb.liga.match.TipprundeDsOpenLiga;
import org.tipprunde.model.json.ds.JsonDsOpenLiga;
import org.tipprunde.model.json.liga.JsonLigaRound;
import org.tipprunde.model.json.ssi.openliga.OpenLigaGroup;

public class JsonLigaRoundFactory
{	
	final static Logger logger = LoggerFactory.getLogger(JsonLigaRoundFactory.class);
	
	public static JsonLigaRoundFactory instance(){return new JsonLigaRoundFactory();}
	private JsonLigaRoundFactory()
	{
		
	}
	
	public static JsonLigaRound build() {return new JsonLigaRound();}
	public static JsonLigaRound transform(OpenLigaGroup olg)
	{
		JsonLigaRound json = build();
		
		json.setNumber(olg.getGroupOrderID());
		json.setName(olg.getName());
		
		
		JsonDsOpenLiga dsOpenLiga = JsonDsOpenligaFactory.build();
		dsOpenLiga.setRefId(olg.getGroupOrderID());
		dsOpenLiga.setType(TipprundeDsOpenLiga.Type.group.toString());
		json.setDataSource(JsonDataSourceFactory.build(dsOpenLiga));
		
		return json;
	}
}