package org.tipprunde.api.rest.provide.i;

import org.jeesl.model.json.io.ssi.update.JsonSsiUpdate;
import org.tipprunde.model.json.JsonTrContainer;
import org.tipprunde.model.json.ds.JsonDsUpdate;
import org.tipprunde.model.xml.liga.UpdatePolicy;
import org.tipprunde.model.xml.tr.Tg;

public interface LigaUpdateRestInterface
{
	JsonDsUpdate nextUpdateTime();
	void uploadHeartbeat(JsonDsUpdate status);
	
	JsonTrContainer nextUpdateJob();
	JsonSsiUpdate update(JsonTrContainer json);
	
	Tg nextOutdatedJob();
    UpdatePolicy updateOutdated(Tg tg);   
}