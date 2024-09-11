package org.tipprunde.model.xml.liga;

import java.nio.file.Paths;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.tipprunde.test.AbstractTrXmlTest;

public abstract class AbstractXmlLigaTest<T extends Object> extends AbstractTrXmlTest<T>
{
	final static Logger logger = LoggerFactory.getLogger(AbstractXmlLigaTest.class);	
	
	public AbstractXmlLigaTest(Class<T> cXml)
	{
		super(cXml,Paths.get("liga"));
	}
}