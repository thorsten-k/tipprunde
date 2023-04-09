package org.tipprunde.interfaces.ejb.liga.match;

import java.io.Serializable;

import org.jeesl.interfaces.model.with.primitive.number.EjbWithId;

public interface TipprundeDsOpenLiga extends Serializable,EjbWithId
{
	public static enum Type {sport,league,group,match,result,location,goal,opponent,scorer}
}