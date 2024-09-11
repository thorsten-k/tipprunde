package org.tipprunde.model.xml.liga.ds;

import java.nio.file.Paths;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.tipprunde.test.AbstractTrXmlTest;

public abstract class AbstractXmlLigaDsTest<T extends Object> extends AbstractTrXmlTest<T>
{
	final static Logger logger = LoggerFactory.getLogger(AbstractXmlLigaDsTest.class);	
	
	public AbstractXmlLigaDsTest(Class<T> cXml)
	{
		super(cXml,Paths.get("liga","ds"));
	}
}