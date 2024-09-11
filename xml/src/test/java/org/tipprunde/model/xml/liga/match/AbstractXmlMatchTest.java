package org.tipprunde.model.xml.liga.match;

import java.nio.file.Paths;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.tipprunde.test.AbstractTrXmlTest;

public abstract class AbstractXmlMatchTest<T extends Object> extends AbstractTrXmlTest<T>
{
	final static Logger logger = LoggerFactory.getLogger(AbstractXmlMatchTest.class);	
	
	public AbstractXmlMatchTest(Class<T> cXml)
	{
		super(cXml,Paths.get("liga","match"));
	}
}