package org.tipprunde.model.xml.user.identity;

import java.nio.file.Paths;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.tipprunde.model.xml.statistic.AbstractXmlStatTest;
import org.tipprunde.test.AbstractTrXmlTest;

public abstract class AbstractXmlIdentityTest <T extends Object> extends AbstractTrXmlTest<T>
{
	final static Logger logger = LoggerFactory.getLogger(AbstractXmlStatTest.class);	
	
	public AbstractXmlIdentityTest(Class<T> cXml)
	{
		super(cXml,Paths.get("user","identity"));
	}
}