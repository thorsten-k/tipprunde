package org.tipprunde.model.xml.community.settings;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.tipprunde.model.xml.statistic.AbstractXmlStatTest;
import org.tipprunde.test.AbstractTrXmlTest;

public abstract class AbstractXmlDefinitionTest<T extends Object> extends AbstractTrXmlTest<T>
{
	final static Logger logger = LoggerFactory.getLogger(AbstractXmlStatTest.class);	
	
	public AbstractXmlDefinitionTest(Class<T> cXml)
	{
		super(cXml,"community/settings");
	}
}