package org.tipprunde.model.xml.community.settings;

import java.io.File;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.tipprunde.test.AbstractTrXmlTst;

public abstract class AbstractXmlDefinitionTest extends AbstractTrXmlTst
{
	final static Logger logger = LoggerFactory.getLogger(AbstractXmlDefinitionTest.class);	
	
	protected static final String rootDir = "src/test/resources/data/xml/community/settings";
	protected static File fXml;
}