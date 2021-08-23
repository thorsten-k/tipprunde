package org.tipprunde.util.comparator.xml;

import java.util.Comparator;

import org.apache.commons.lang3.builder.CompareToBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.tipprunde.model.xml.community.DefinitionRound;

public class RoundSettingsComparator
{
	final static Logger logger = LoggerFactory.getLogger(RoundSettingsComparator.class);
	
	public enum CompTyp {RoundNr};
	
	public RoundSettingsComparator()
	{
		
	}
	
	public static Comparator<DefinitionRound> factory(CompTyp ct)
	{
		Comparator<DefinitionRound> c = null;
		RoundSettingsComparator pc = new RoundSettingsComparator();
		switch (ct)
		{
			case RoundNr: c = pc.new RoundNumberComparator();break;
		}

		return c;
	}
	
	public class RoundNumberComparator implements Comparator<DefinitionRound>
	{
		public int compare(DefinitionRound a, DefinitionRound b)
		{
			return new CompareToBuilder().append(a.getRound().getNr(),b.getRound().getNr()).toComparison();
	    }
	}
}