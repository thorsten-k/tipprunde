package org.tipprunde.api.rest.provide.i;

import org.tipprunde.model.json.JsonTrContainer;
import org.tipprunde.model.json.ds.JsonDsUpdate;
import org.tipprunde.model.xml.liga.UpdatePolicy;
import org.tipprunde.model.xml.tr.Tg;

public interface LigaUpdateRestInterface
{
	JsonDsUpdate nextUpdateTime();
	JsonTrContainer nextUpdateJob();
	Tg nextOutdatedJob();
   
	void heartbeat(JsonDsUpdate status);
    UpdatePolicy update(Tg tg);   
}