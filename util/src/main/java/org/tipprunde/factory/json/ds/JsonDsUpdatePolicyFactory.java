package org.tipprunde.factory.json.ds;

import java.time.LocalDateTime;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.tipprunde.model.json.ds.JsonDsUpdate;

public class JsonDsUpdatePolicyFactory
{	
	final static Logger logger = LoggerFactory.getLogger(JsonDsUpdatePolicyFactory.class);
	
	private JsonDsUpdate json;
	
	public static JsonDsUpdatePolicyFactory instance(){return new JsonDsUpdatePolicyFactory();}
	private JsonDsUpdatePolicyFactory()
	{
		json = JsonDsUpdatePolicyFactory.build();
	}
	
	public static JsonDsUpdate build() {return new JsonDsUpdate();}
	
	public JsonDsUpdatePolicyFactory last(LocalDateTime ldt) {json.setLastUpdate(ldt);return this;}
	public JsonDsUpdate toJson() {return json;}
	
}
