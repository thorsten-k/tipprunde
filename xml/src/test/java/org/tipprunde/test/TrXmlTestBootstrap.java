package org.tipprunde.test;

import net.sf.exlp.util.io.LoggerInit;
import net.sf.exlp.util.xml.JaxbUtil;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.tipprunde.model.xml.TrNsPrefixMapper;

public class TrXmlTestBootstrap
{
	final static Logger logger = LoggerFactory.getLogger(TrXmlTestBootstrap.class);
		
	public static void init()
	{
		LoggerInit loggerInit = new LoggerInit("log4j.xml");	
		loggerInit.path("tipprunde-xml.test/config");
		loggerInit.init();
		JaxbUtil.setNsPrefixMapper(new TrNsPrefixMapper());
	}
}