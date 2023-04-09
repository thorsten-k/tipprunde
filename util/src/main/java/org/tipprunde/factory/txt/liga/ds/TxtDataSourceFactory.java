package org.tipprunde.factory.txt.liga.ds;

import java.util.Objects;

import org.tipprunde.model.json.ds.JsonDataSource;
import org.tipprunde.model.json.ds.JsonDsOpenLiga;

public class TxtDataSourceFactory
{
	public static String debug(JsonDataSource ds)
	{
		if(Objects.nonNull(ds.getOpenliga())) {return debug(ds.getOpenliga());}
		return "NYI";
	}
	
	private static String debug(JsonDsOpenLiga ds)
	{
		StringBuilder sb = new StringBuilder();
		sb.append(ds.getType());
		sb.append(" ");
		sb.append(ds.getRefId());
		return sb.toString();
	}
}