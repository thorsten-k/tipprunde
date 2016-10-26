package org.tipprunde.model.xml.tr;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.tipprunde.test.AbstractTrXmlTest;

public abstract class AbstractXmlTgTest<T extends Object> extends AbstractTrXmlTest<T>
{
	final static Logger logger = LoggerFactory.getLogger(AbstractXmlTgTest.class);	
	
	public AbstractXmlTgTest(Class<T> cXml)
	{
		super(cXml,"tr");
	}
}