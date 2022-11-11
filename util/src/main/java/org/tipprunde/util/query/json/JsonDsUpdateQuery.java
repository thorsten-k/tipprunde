package org.tipprunde.util.query.json;

import org.tipprunde.model.json.ds.JsonDataSource;
import org.tipprunde.model.json.ds.JsonDsOpenLiga;
import org.tipprunde.model.json.liga.JsonDiscipline;
import org.tipprunde.model.json.liga.JsonEvent;
import org.tipprunde.model.json.liga.JsonMatch;
import org.tipprunde.model.json.liga.JsonRound;

public class JsonDsUpdateQuery
{
	public static JsonDiscipline dsUpdateDiscipline()
	{
		JsonDiscipline json = new JsonDiscipline();
		json.setName("");
		json.setDataSource(ds());
		return json;
	}
	
	public static JsonEvent dsUpdateEvent()
	{
		JsonEvent json = new JsonEvent();
		json.setName("");
		json.setDataSource(ds());
		return json;
	}
	
	public static JsonRound dsUpdateRound()
	{
		JsonRound json = new JsonRound();
		json.setName("");
		json.setDataSource(ds());
		return json;
	}
	
	public static JsonMatch dsUpdateMatch()
	{
		JsonMatch json = new JsonMatch();
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
