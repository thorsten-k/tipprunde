package org.tipprunde.model.xml.statistic;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.tipprunde.test.TrXmlTestBootstrap;

public class TestXmlStatRound extends AbstractXmlStatTest<StatRound>
{
	final static Logger logger = LoggerFactory.getLogger(TestXmlStatRound.class);
	
	public TestXmlStatRound(){super(StatRound.class);}
	public static StatRound create(boolean withChildren){return (new TestXmlStatRound()).build(withChildren);}
    
    public StatRound build(boolean withChilds)
    {
    	StatRound xml = new StatRound();
    	
    	if(withChilds)
    	{
    		logger.error("NYI");
 //       	xml.setRound(TestXmlRound.createRound(false));
        	xml.getStatMatch().add(TestXmlStatMatch.create(false));
        	xml.getStatMatch().add(TestXmlStatMatch.create(false));
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