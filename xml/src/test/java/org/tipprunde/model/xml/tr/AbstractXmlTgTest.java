package org.tipprunde.model.xml.tr;

import java.nio.file.Paths;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.tipprunde.test.AbstractTrXmlTest;

public abstract class AbstractXmlTgTest<T extends Object> extends AbstractTrXmlTest<T>
{
	final static Logger logger = LoggerFactory.getLogger(AbstractXmlTgTest.class);	
	
	public AbstractXmlTgTest(Class<T> cXml)
	{
		super(cXml,Paths.get("tr"));
	}
}