package org.tipprunde.model.xml.user;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.tipprunde.model.xml.statistic.AbstractXmlStatTest;
import org.tipprunde.test.AbstractTrXmlTst;

public abstract class AbstractXmlUserTest<T extends Object> extends AbstractTrXmlTst<T>
{
	final static Logger logger = LoggerFactory.getLogger(AbstractXmlStatTest.class);	
	
	public AbstractXmlUserTest(Class<T> cXml)
	{
		super(cXml,"user");
	}
}