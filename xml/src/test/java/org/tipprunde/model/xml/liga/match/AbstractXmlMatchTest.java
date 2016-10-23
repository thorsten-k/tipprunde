package org.tipprunde.model.xml.liga.match;

import java.io.File;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.tipprunde.test.AbstractTrXmlTst;

public abstract class AbstractXmlMatchTest extends AbstractTrXmlTst
{
	final static Logger logger = LoggerFactory.getLogger(AbstractXmlMatchTest.class);	
	
	protected static final String rootDir = "src/test/resources/data/xml/liga/match";
	protected static File fXml;
}