package org.tipprunde.api.rest.provide.i;

import org.tipprunde.model.xml.liga.UpdatePolicy;
import org.tipprunde.model.xml.tr.Tg;


public interface LigaUpdateRestInterface
{
	void workerLifeBeat(UpdatePolicy status);
	Tg nextJob();
    UpdatePolicy nextUpdate();
    UpdatePolicy update(Tg tg);
   
}