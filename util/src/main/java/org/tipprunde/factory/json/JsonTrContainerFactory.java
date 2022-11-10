package org.tipprunde.factory.json;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.tipprunde.model.json.JsonTrContainer;

public class JsonTrContainerFactory
{	
	final static Logger logger = LoggerFactory.getLogger(JsonTrContainerFactory.class);

	public static JsonTrContainer build() {return new JsonTrContainer();}	
}