package org.tipprunde.model.xml.community;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.tipprunde.test.AbstractTrXmlTst;

public abstract class AbstractXmlCommunityTest<T extends Object> extends AbstractTrXmlTst<T>
{
	final static Logger logger = LoggerFactory.getLogger(AbstractXmlCommunityTest.class);	
	
	public AbstractXmlCommunityTest(Class<T> cXml)
	{
		super(cXml,"community");
	}
}