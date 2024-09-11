package org.tipprunde.model.xml.community.points;

import java.nio.file.Paths;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.tipprunde.test.AbstractTrXmlTest;

public abstract class AbstractXmlPointsTest<T extends Object> extends AbstractTrXmlTest<T>
{
	final static Logger logger = LoggerFactory.getLogger(AbstractXmlPointsTest.class);	
	
	public AbstractXmlPointsTest(Class<T> cXml)
	{
		super(cXml,Paths.get("community","points"));
	}
}