package org.tipprunde.model.xml.liga;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.tipprunde.test.AbstractTrXmlTst;

public abstract class AbstractXmlLigaTest<T extends Object> extends AbstractTrXmlTst<T>
{
	final static Logger logger = LoggerFactory.getLogger(AbstractXmlLigaTest.class);	
	
	public AbstractXmlLigaTest(Class<T> cXml)
	{
		super(cXml,"liga");
	}
}