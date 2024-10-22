package org.tipprunde.test;

import java.nio.file.Path;
import java.nio.file.Paths;

import org.exlp.controller.handler.io.log.LoggerBootstrap;
import org.exlp.test.AbstractXmlTest;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Ignore
public class AbstractTrXmlTest <T extends Object> extends AbstractXmlTest<T>
{
	final static Logger logger = LoggerFactory.getLogger(AbstractTrXmlTest.class);	
	
	public AbstractTrXmlTest(Class<T> cXml,Path pSuffix)
	{
		super(cXml,Paths.get("tipprunde-xml.test","data","xml"),pSuffix);
	}
	
	@BeforeClass
    public static void initLogger()
	{
		LoggerBootstrap.instance("xml.log4j2.xml").path("tr/system/io/log").init();
    }
	
	@BeforeClass
	public static void initPrefixMapper()
	{
		logger.warn("NS Prefix Mapper deactivated");
//		JaxbUtil.setNsPrefixMapper(new TrNsPrefixMapper());
	}
}