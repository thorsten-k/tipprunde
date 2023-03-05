package org.tipprunde.util.filter.json.liga;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

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
	
	public static List<JsonCommunityRound> toRounds(JsonCommunityEvent event, int from, int to)
	{
		List<JsonCommunityRound> result = new ArrayList<>();
		if(ObjectUtils.isNotEmpty(event.getRounds()))
		{
			for(JsonCommunityRound r : event.getRounds())
			{
				int nr=r.getRound().getNumber();
				if(nr>=from && nr<=to) {result.add(r);}
			}
		}
		return result;
	}
	
	public static JsonCommunityRound nextDeadline(JsonCommunityEvent event)
	{
		if(ObjectUtils.isNotEmpty(event.getRounds()))
		{
			LocalDateTime now = LocalDateTime.now();
			for(JsonCommunityRound r : event.getRounds())
			{
				if(r.getTippDeadline().isAfter(now)){return r;}
			}
		}
		return null;
	}
}