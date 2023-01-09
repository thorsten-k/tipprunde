package org.tipprunde.util.query.json;

import org.tipprunde.model.json.ds.JsonDataSource;
import org.tipprunde.model.json.ds.JsonDsOpenLiga;
import org.tipprunde.model.json.liga.JsonDiscipline;
import org.tipprunde.model.json.liga.JsonLigaEvent;
import org.tipprunde.model.json.liga.JsonLigaMatch;
import org.tipprunde.model.json.liga.JsonLigaRound;

public class JsonDsUpdateQuery
{
	public static JsonDiscipline dsUpdateDiscipline()
	{
		JsonDiscipline json = new JsonDiscipline();
		json.setName("");
		json.setDataSource(ds());
		return json;
	}
	
	public static JsonLigaEvent dsUpdateEvent()
	{
		JsonLigaEvent json = new JsonLigaEvent();
		json.setName("");
		json.setDataSource(ds());
		return json;
	}
	
	public static JsonLigaRound dsUpdateRound()
	{
		JsonLigaRound json = new JsonLigaRound();
		json.setName("");
		json.setDataSource(ds());
		return json;
	}
	
	public static JsonLigaMatch dsUpdateMatch()
	{
		JsonLigaMatch json = new JsonLigaMatch();
		json.setDataSource(ds());
		return json;
	}
	
	
	private static JsonDataSource ds()
	{
		JsonDataSource json = new JsonDataSource();
		json.setOpenliga(JsonDsUpdateQuery.dsOpenLiga());
		return json;
	}
	
	private static JsonDsOpenLiga dsOpenLiga()
	{
		JsonDsOpenLiga json = new JsonDsOpenLiga();
		json.setRefId(0);
		json.setSeason("");
		json.setShortcut("");
		json.setType("");
		return json;
	}
}
