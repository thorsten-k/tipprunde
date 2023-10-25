package org.tipprunde.factory.json.liga;

import org.jeesl.factory.json.system.status.JsonTypeFactory;
import org.jeesl.model.json.system.status.JsonType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.tipprunde.factory.json.ds.JsonDataSourceFactory;
import org.tipprunde.factory.json.ds.JsonDsOpenligaFactory;
import org.tipprunde.interfaces.ejb.liga.match.TipprundeDsOpenLiga;
import org.tipprunde.model.json.ds.JsonDsOpenLiga;
import org.tipprunde.model.json.liga.JsonLigaResult;
import org.tipprunde.model.json.ssi.openliga.OpenLigaMatchResult;

public class JsonLigaResultFactory
{	
	final static Logger logger = LoggerFactory.getLogger(JsonLigaResultFactory.class);
	
	public static JsonLigaResultFactory instance(){return new JsonLigaResultFactory();}
	private JsonLigaResultFactory()
	{
		
	}
	
	public static JsonLigaResult build() {return new JsonLigaResult();}
	
	
	public static JsonLigaResult build(OpenLigaMatchResult olr)
	{
		JsonLigaResult json = build();
				
		JsonDsOpenLiga ds = JsonDsOpenligaFactory.build();
		ds.setType(TipprundeDsOpenLiga.Type.result.toString());
		ds.setRefId(olr.getId().intValue());
		json.setDataSource(JsonDataSourceFactory.build(ds));
		
		json.setPoints1(olr.getLeft());
		json.setPoints2(olr.getRight());
		
		JsonType type = JsonTypeFactory.build(""+olr.getType());
		type.setPosition(olr.getOrder());
		type.setLabel(olr.getName());
		type.setDescription(olr.getDescription());
		json.setType(type);
		
		return json;
	}
	

}