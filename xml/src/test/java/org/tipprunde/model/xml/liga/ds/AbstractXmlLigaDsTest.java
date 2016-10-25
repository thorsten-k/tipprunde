package org.tipprunde.model.xml.liga.ds;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.tipprunde.test.AbstractTrXmlTst;

public abstract class AbstractXmlLigaDsTest<T extends Object> extends AbstractTrXmlTst<T>
{
	final static Logger logger = LoggerFactory.getLogger(AbstractXmlLigaDsTest.class);	
	
	public AbstractXmlLigaDsTest(Class<T> cXml)
	{
		super(cXml,"liga/ds");
	}
}