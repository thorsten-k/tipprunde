package org.tipprunde.api.rest.provide.i;

import org.tipprunde.model.xml.community.Tipps;
import org.tipprunde.model.xml.liga.Event;
import org.tipprunde.model.xml.liga.Events;
import org.tipprunde.model.xml.liga.Round;

public interface PersonalRestInterface
{
    Events events();
    Event event(long id);
    Round round(long id);
    Tipps tipps(long id);
    Tipps upload(Tipps tipps);
}