package org.tipprunde.factory.json.liga;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.tipprunde.factory.json.ds.JsonDataSourceFactory;
import org.tipprunde.factory.json.ds.JsonDsOpenligaFactory;
import org.tipprunde.interfaces.ejb.liga.match.TipprundeDsOpenLiga;
import org.tipprunde.model.json.ds.JsonDsOpenLiga;
import org.tipprunde.model.json.liga.JsonLigaTeam;
import org.tipprunde.model.json.ssi.openliga.OpenLigaTeam;

public class JsonLigaTeamFactory
{	
	final static Logger logger = LoggerFactory.getLogger(JsonLigaTeamFactory.class);
	
	public static JsonLigaTeamFactory instance(){return new JsonLigaTeamFactory();}
	private JsonLigaTeamFactory()
	{
		
	}
	
	public static JsonLigaTeam build() {return new JsonLigaTeam();}
	
	
	public static JsonLigaTeam build(OpenLigaTeam olt)
	{
		JsonLigaTeam json = build();
		
		json.setName(olt.getName());
		json.setShortName(olt.getShortName());
		json.setIconUrl(olt.getIconUrl());
		
		JsonDsOpenLiga ds = JsonDsOpenligaFactory.build();
		ds.setType(TipprundeDsOpenLiga.Type.opponent.toString());
		ds.setRefId(olt.getId().intValue());
		json.setDataSource(JsonDataSourceFactory.build(ds));
		
		
		return json;
	}
}