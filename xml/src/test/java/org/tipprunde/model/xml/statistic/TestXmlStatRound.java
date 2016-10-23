package org.tipprunde.model.xml.statistic;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.tipprunde.test.TrXmlTestBootstrap;

public class TestXmlStatRound extends AbstractXmlStatTest<StatRound>
{
	final static Logger logger = LoggerFactory.getLogger(TestXmlStatRound.class);
	
	public TestXmlStatRound(){super(StatRound.class);}
	public static StatRound create(boolean withChildren){return (new TestXmlStatRound()).build(withChildren);}
    
    public static StatRound createStatRound(boolean withChilds)
    {
    	StatRound xml = new StatRound();
    	
    	if(withChilds)
    	{
        	xml.setRound(TestXmlRound.createRound(false));
        	xml.getStatMatch().add(TestXmlStatMatch.createStatMatch(false));
        	xml.getStatMatch().add(TestXmlStatMatch.createStatMatch(false));
    	}

    	return xml;
    }
   
	public static void main(String[] args)
    {
		TrXmlTestBootstrap.init();		
		TestXmlStatRound test = new TestXmlStatRound();
		test.saveReferenceXml();
    }
}