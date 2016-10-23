package org.tipprunde.model.xml.statistic;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.tipprunde.test.TrXmlTestBootstrap;

public class TestXmlStatMatch extends AbstractXmlStatTest<StatMatch>
{
	final static Logger logger = LoggerFactory.getLogger(TestXmlStatMatch.class);
	
	public TestXmlStatMatch(){super(StatMatch.class);}
	public static StatMatch create(boolean withChildren){return (new TestXmlStatMatch()).build(withChildren);}
    
    public static StatMatch createStatMatch(boolean withChilds)
    {
    	StatMatch xml = new StatMatch();
    	if(withChilds)
    	{
    		xml.setMatch(TestXmlMatch.create(false));
        	xml.getStatTipp().add(TestXmlStatTipp.createStatTipp(false,0.25));
        	xml.getStatTipp().add(TestXmlStatTipp.createStatTipp(false,0.45));
    	}
    	
    	return xml;
    }
   
	public static void main(String[] args)
    {
		TrXmlTestBootstrap.init();
		TestXmlStatMatch test = new TestXmlStatMatch();
		test.saveReferenceXml();
    }
}