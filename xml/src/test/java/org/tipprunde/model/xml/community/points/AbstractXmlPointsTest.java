package org.tipprunde.model.xml.community.points;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.tipprunde.test.AbstractTrXmlTst;

public abstract class AbstractXmlPointsTest<T extends Object> extends AbstractTrXmlTst<T>
{
	final static Logger logger = LoggerFactory.getLogger(AbstractXmlPointsTest.class);	
	
	public AbstractXmlPointsTest(Class<T> cXml)
	{
		super(cXml,"community/points");
	}
}