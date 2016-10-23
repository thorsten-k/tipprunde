package org.tipprunde.model.xml.community;

import java.io.File;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.tipprunde.test.AbstractTrXmlTst;

public abstract class AbstractXmlCommunityTest extends AbstractTrXmlTst
{
	final static Logger logger = LoggerFactory.getLogger(AbstractXmlCommunityTest.class);	
	
	protected static final String rootDir = "src/test/resources/data/xml/community";
	protected static File fXml;
}