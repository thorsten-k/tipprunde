package org.tipprunde.model.xml.statistic;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.tipprunde.model.xml.liga.match.TestXmlResult;
import org.tipprunde.test.TrXmlTestBootstrap;

public class TestXmlStatTipp extends AbstractXmlStatTest<StatTipp>
{
	final static Logger logger = LoggerFactory.getLogger(TestXmlStatTipp.class);
	
	public TestXmlStatTipp(){super(StatTipp.class);}
	public static StatTipp create(boolean withChildren){return (new TestXmlStatTipp()).build(withChildren);}
    
    public StatTipp build(boolean withChilds)
    {
    	StatTipp xml = new StatTipp();
    	xml.setRatio(0.33);
    	
    	if(withChilds)
    	{
    		xml.setResult(TestXmlResult.create(false));
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