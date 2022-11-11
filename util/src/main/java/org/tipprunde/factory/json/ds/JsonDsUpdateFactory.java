package org.tipprunde.factory.json.ds;

import java.time.LocalDateTime;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.tipprunde.model.json.ds.JsonDsUpdate;

public class JsonDsUpdateFactory
{	
	final static Logger logger = LoggerFactory.getLogger(JsonDsUpdateFactory.class);
	
	private JsonDsUpdate json;
	
	public static JsonDsUpdateFactory instance(){return new JsonDsUpdateFactory();}
	private JsonDsUpdateFactory()
	{
		json = JsonDsUpdateFactory.build();
	}
	
	public static JsonDsUpdate build() {return new JsonDsUpdate();}
	
	public JsonDsUpdateFactory last(LocalDateTime ldt) {json.setLastUpdate(ldt);return this;}
	public JsonDsUpdate toJson() {return json;}
	
}
