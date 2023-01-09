package org.tipprunde.util.filter.json.liga;

import org.apache.commons.lang3.ObjectUtils;
import org.tipprunde.model.json.community.JsonCommunityEvent;
import org.tipprunde.model.json.community.JsonCommunityRound;

public class JsonRoundFilter
{
	public static JsonCommunityRound toRound(JsonCommunityEvent event, int nr)
	{
		if(ObjectUtils.isNotEmpty(event.getRounds()))
		{
			for(JsonCommunityRound r : event.getRounds())
			{
				if(r.getRound().getNumber()==nr) {return r;}
			}
		}
		return null;
	}
}