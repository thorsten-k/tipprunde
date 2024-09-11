package org.tipprunde.model.xml.community;

import java.nio.file.Paths;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.tipprunde.test.AbstractTrXmlTest;

public abstract class AbstractXmlCommunityTest<T extends Object> extends AbstractTrXmlTest<T>
{
	final static Logger logger = LoggerFactory.getLogger(AbstractXmlCommunityTest.class);	
	
	public AbstractXmlCommunityTest(Class<T> cXml)
	{
		super(cXml,Paths.get("community"));
	}
}