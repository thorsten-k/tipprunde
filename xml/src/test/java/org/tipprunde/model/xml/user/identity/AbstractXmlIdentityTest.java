package org.tipprunde.model.xml.user.identity;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.tipprunde.model.xml.statistic.AbstractXmlStatTest;
import org.tipprunde.test.AbstractTrXmlTst;

public abstract class AbstractXmlIdentityTest <T extends Object> extends AbstractTrXmlTst<T>
{
	final static Logger logger = LoggerFactory.getLogger(AbstractXmlStatTest.class);	
	
	public AbstractXmlIdentityTest(Class<T> cXml)
	{
		super(cXml,"user/identity");
	}
}