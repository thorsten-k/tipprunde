package org.tipprunde.test;

import org.exlp.controller.handler.io.log.LoggerBootstrap;
import org.exlp.util.jx.JaxbUtil;
import org.jeesl.test.AbstractJeeslXmlTest;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.tipprunde.model.xml.TrNsPrefixMapper;

@Ignore
public class AbstractTrXmlTest <T extends Object> extends AbstractJeeslXmlTest<T>
{
	final static Logger logger = LoggerFactory.getLogger(AbstractTrXmlTest.class);	
	
	public AbstractTrXmlTest(){this(null,null);}
	public AbstractTrXmlTest(Class<T> cXml,String xmlDirSuffix)
	{
		super(cXml,"tipprunde-xml.test/data/xml",xmlDirSuffix);
	}
	
	@BeforeClass
    public static void initLogger()
	{
		LoggerBootstrap.instance("xml.log4j2.xml").path("tr/system/io/log").init();
    }
	
	@BeforeClass
	public static void initPrefixMapper()
	{
		JaxbUtil.setNsPrefixMapper(new TrNsPrefixMapper());
	}
}