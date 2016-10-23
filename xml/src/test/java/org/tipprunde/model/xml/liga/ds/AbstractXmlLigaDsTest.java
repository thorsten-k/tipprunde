package org.tipprunde.model.xml.liga.ds;

import java.io.File;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.tipprunde.test.AbstractTrXmlTst;

public abstract class AbstractXmlLigaDsTest extends AbstractTrXmlTst
{
	final static Logger logger = LoggerFactory.getLogger(AbstractXmlLigaDsTest.class);	
	
	protected static final String rootDir = "src/test/resources/data/xml/liga/ds";
	protected static File fXml;
}