package org.tipprunde.api.rest.provide.i;

import org.tipprunde.model.xml.liga.Matches;

public interface LigaHistoricalRestInterface
{
    Matches matches(long opponentId);
    Matches matches(long oLeftId, long oRightId);
}