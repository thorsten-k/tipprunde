package org.tipprunde.test;

import org.exlp.controller.handler.io.log.LoggerBootstrap;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TrXmlTestBootstrap
{
	final static Logger logger = LoggerFactory.getLogger(TrXmlTestBootstrap.class);
		
	public static void init()
	{
		LoggerBootstrap.instance("xml.log4j2.xml").path("tr/system/io/log").init();
//		JaxbUtil.setNsPrefixMapper(new TrNsPrefixMapper());
	}
}