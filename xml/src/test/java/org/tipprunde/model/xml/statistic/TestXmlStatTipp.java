package org.tipprunde.model.xml.statistic;

import java.io.File;
import java.io.FileNotFoundException;

import net.sf.exlp.util.xml.JaxbUtil;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.tipprunde.model.xml.liga.match.TestXmlResult;
import org.tipprunde.model.xml.statistic.StatTipp;
import org.tipprunde.test.TgXmlTstBootstrap;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestXmlStatTipp extends AbstractXmlStatTest<StatTipp>
{
	final static Logger logger = LoggerFactory.getLogger(TestXmlStatTipp.class);
	
	public TestXmlStatTipp(){super(StatTipp.class);}
	public static StatTipp create(boolean withChildren){return (new TestXmlStatTipp()).build(withChildren);}
    
    private static StatTipp createStatTipp(){return createStatTipp(0.33);}
    private static StatTipp createStatTipp(double ratio){return createStatTipp(true,ratio);}
    
    public static StatTipp createStatTipp(boolean withChilds){return createStatTipp(withChilds,0.33);}
    public static StatTipp createStatTipp(boolean withChilds,double ratio)
    {
    	StatTipp xml = new StatTipp();
    	xml.setRatio(ratio);
    	
    	if(withChilds)
    	{
    		xml.setResult(TestXmlResult.createResult(false));
    	}
    	
    	return xml;
    }

	public static void main(String[] args)
    {
		TrXmlTestBootstrap.init();			
		TestXmlStatTipp test = new TestXmlStatTipp();
		test.saveReferenceXml();
    }
}