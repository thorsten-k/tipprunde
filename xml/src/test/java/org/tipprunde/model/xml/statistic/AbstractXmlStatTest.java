package org.tipprunde.model.xml.statistic;

import java.nio.file.Paths;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.tipprunde.test.AbstractTrXmlTest;

public abstract class AbstractXmlStatTest<T extends Object> extends AbstractTrXmlTest<T>
{
	final static Logger logger = LoggerFactory.getLogger(AbstractXmlStatTest.class);	
	
	public AbstractXmlStatTest(Class<T> cXml)
	{
		super(cXml,Paths.get("statistic"));
	}
}