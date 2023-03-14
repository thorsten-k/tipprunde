package org.tipprunde.factory.json.ds;

import org.tipprunde.model.json.ds.JsonDataSource;
import org.tipprunde.model.json.ds.JsonDsOpenLiga;

public class JsonDataSourceFactory
{	
//	protected final JsonDsOpenLiga q;
//	
//	protected JsonDsFactory(String localeCode, JsonDsOpenLiga q)
//	{
//		this.q=q;
//	}
	
	public static JsonDataSource build() {return new JsonDataSource();}
	public static JsonDataSource build(JsonDsOpenLiga dsOpenLiga) {JsonDataSource json = build(); json.setOpenliga(dsOpenLiga); return json;}
}
