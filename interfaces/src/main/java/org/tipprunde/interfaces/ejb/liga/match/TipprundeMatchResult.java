package org.tipprunde.interfaces.ejb.liga.match;

import java.io.Serializable;

import net.sf.ahtutils.model.interfaces.with.EjbWithId;

public interface TipprundeMatchResult extends Serializable,EjbWithId
{
	public static enum Result {won,draw,lost}
}