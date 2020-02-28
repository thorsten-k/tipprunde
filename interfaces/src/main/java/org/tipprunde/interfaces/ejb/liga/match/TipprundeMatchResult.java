package org.tipprunde.interfaces.ejb.liga.match;

import java.io.Serializable;

import org.jeesl.interfaces.model.with.primitive.number.EjbWithId;

public interface TipprundeMatchResult extends Serializable,EjbWithId
{
	public static enum Status {won,draw,lost}
}