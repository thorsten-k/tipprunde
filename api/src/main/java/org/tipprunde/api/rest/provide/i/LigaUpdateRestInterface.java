package org.tipprunde.api.rest.provide.i;

import org.tipprunde.model.json.JsonTrContainer;
import org.tipprunde.model.json.ds.JsonDsUpdate;
import org.tipprunde.model.xml.liga.UpdatePolicy;
import org.tipprunde.model.xml.tr.Tg;

public interface LigaUpdateRestInterface
{
	JsonDsUpdate nextUpdate();
	void heartbeat(JsonDsUpdate status);
	
	Tg nextJobXml();
	JsonTrContainer nextJobJson();
   
    UpdatePolicy update(Tg tg);   
}