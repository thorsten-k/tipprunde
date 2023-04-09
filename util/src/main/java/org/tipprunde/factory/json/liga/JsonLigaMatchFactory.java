package org.tipprunde.factory.json.liga;

import java.util.ArrayList;
import java.util.Objects;

import org.apache.commons.lang3.ObjectUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.tipprunde.factory.json.JsonTrContainerFactory;
import org.tipprunde.factory.json.ds.JsonDataSourceFactory;
import org.tipprunde.factory.json.ds.JsonDsOpenligaFactory;
import org.tipprunde.interfaces.ejb.liga.match.TipprundeDsOpenLiga;
import org.tipprunde.model.json.JsonTrContainer;
import org.tipprunde.model.json.ds.JsonDsOpenLiga;
import org.tipprunde.model.json.liga.JsonLigaEvent;
import org.tipprunde.model.json.liga.JsonLigaMatch;
import org.tipprunde.model.json.ssi.openliga.OpenLigaMatch;
import org.tipprunde.model.json.ssi.openliga.OpenLigaMatchResult;

public class JsonLigaMatchFactory
{	
	final static Logger logger = LoggerFactory.getLogger(JsonLigaMatchFactory.class);
	
	public static JsonLigaMatchFactory instance(){return new JsonLigaMatchFactory();}
	private JsonLigaMatchFactory()
	{
		
	}
	
	public static JsonLigaMatch build() {return new JsonLigaMatch();}
	
	
	public static JsonTrContainer toContainer(OpenLigaMatch olm)
	{
		JsonLigaMatch json = build();
		
		json.setBeginLocal(olm.getMatchDateTime());
		json.setBeginUtc(olm.getMatchDateTimeUtc());
		json.setFinished(olm.getFinished());
		
		if(Objects.nonNull(olm.getTeamLeft())) {json.setTeam1(JsonLigaTeamFactory.build(olm.getTeamLeft()));}
		if(Objects.nonNull(olm.getTeamRight())) {json.setTeam2(JsonLigaTeamFactory.build(olm.getTeamRight()));}
		
		JsonDsOpenLiga ds = JsonDsOpenligaFactory.build();
		ds.setType(TipprundeDsOpenLiga.Type.match.toString());
		ds.setRefId(olm.getId().intValue());		
		json.setDataSource(JsonDataSourceFactory.build(ds));
		
		json.setRound(JsonLigaRoundFactory.build(olm.getGroup()));
		json.getRound().setEvents(new ArrayList<>());
		JsonLigaEvent event = JsonLigaEventFactory.build();
		event.setName(olm.getLeagueName());
		json.getRound().getEvents().add(event);
		
		json.setResults(new ArrayList<>());
		if(ObjectUtils.isNotEmpty(olm.getResults()))
		{
			for(OpenLigaMatchResult olr : olm.getResults())
			{
				json.getResults().add(JsonLigaResultFactory.build(olr));
			}
		}
		
		
		JsonTrContainer container = JsonTrContainerFactory.build();
		container.setMatches(new ArrayList<>());
		container.getMatches().add(json);
		return container;
	}
}