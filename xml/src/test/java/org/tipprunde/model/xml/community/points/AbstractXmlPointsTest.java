package org.tipprunde.model.xml.community.points;

import java.io.File;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.tipprunde.test.AbstractTrXmlTst;

public abstract class AbstractXmlPointsTest extends AbstractTrXmlTst
{
	final static Logger logger = LoggerFactory.getLogger(AbstractXmlPointsTest.class);	
	
	protected static final String rootDir = "src/test/resources/data/xml/community/points";
	protected static File fXml;
}