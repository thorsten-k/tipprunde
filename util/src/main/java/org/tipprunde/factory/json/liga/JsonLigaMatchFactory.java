package org.tipprunde.factory.json.liga;

import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.tipprunde.factory.json.JsonTrContainerFactory;
import org.tipprunde.factory.json.ds.JsonDataSourceFactory;
import org.tipprunde.factory.json.ds.JsonDsOpenligaFactory;
import org.tipprunde.interfaces.ejb.liga.match.TipprundeDsOpenLiga;
import org.tipprunde.model.json.JsonTrContainer;
import org.tipprunde.model.json.ds.JsonDsOpenLiga;
import org.tipprunde.model.json.liga.JsonLigaMatch;
import org.tipprunde.model.json.ssi.openliga.OpenLigaMatch;

public class JsonLigaMatchFactory
{	
	final static Logger logger = LoggerFactory.getLogger(JsonLigaMatchFactory.class);
	
	public static JsonLigaMatchFactory instance(){return new JsonLigaMatchFactory();}
	private JsonLigaMatchFactory()
	{
		
	}
	
	public static JsonLigaMatch build() {return new JsonLigaMatch();}
	
	
	public static JsonTrContainer transform(OpenLigaMatch olm)
	{
		JsonLigaMatch json = build();
		
		json.setBeginLocal(olm.getMatchDateTime());
		json.setBeginUtc(olm.getMatchDateTimeUtc());
		json.setFinished(olm.getFinished());
		
		
//		json.setNumber(olg.getGroupOrderID());
//		json.setName(olg.getName());
		
		JsonDsOpenLiga ds = JsonDsOpenligaFactory.build();
		ds.setType(TipprundeDsOpenLiga.Type.match.toString());
		ds.setRefId(olm.getId().intValue());
		
		json.setDataSource(JsonDataSourceFactory.build(ds));
		
		JsonTrContainer container = JsonTrContainerFactory.build();
		container.setMatches(new ArrayList<>());
		container.getMatches().add(json);
		return container;
	}
}