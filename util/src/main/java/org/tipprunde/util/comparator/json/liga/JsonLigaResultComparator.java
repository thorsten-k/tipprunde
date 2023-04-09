package org.tipprunde.util.comparator.json.liga;

import java.util.Comparator;

import org.apache.commons.lang3.ObjectUtils;
import org.apache.commons.lang3.builder.CompareToBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.tipprunde.model.json.liga.JsonLigaResult;

public class JsonLigaResultComparator
{
	final static Logger logger = LoggerFactory.getLogger(JsonLigaResultComparator.class);
	
	public enum Type {type};
	
	public JsonLigaResultComparator()
	{
		
	}
	
	public static Comparator<JsonLigaResult> instance(Type ct)
	{
		Comparator<JsonLigaResult> c = null;
		JsonLigaResultComparator pc = new JsonLigaResultComparator();
		switch (ct)
		{
			case type: c = pc.new DateComparator();break;
		}

		return c;
	}
	
	private class DateComparator implements Comparator<JsonLigaResult>
	{
		@Override public int compare(JsonLigaResult a, JsonLigaResult b)
		{
			CompareToBuilder ctb = new CompareToBuilder();
			
			if(ObjectUtils.allNotNull(a.getType(),b.getType()))
			{
				if(ObjectUtils.allNotNull(a.getType().getPosition(),b.getType().getPosition()))
				{
					ctb.append(a.getType().getPosition(), b.getType().getPosition());
				}
			}
			
			return ctb.toComparison();
	    }
	}
}