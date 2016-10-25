package org.tipprunde.model.xml.liga.match;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.tipprunde.model.xml.liga.Opponents;
import org.tipprunde.test.TrXmlTestBootstrap;

public class TestXmlOpponents extends AbstractXmlMatchTest<Opponents>
{
	final static Logger logger = LoggerFactory.getLogger(TestXmlOpponents.class);
	
	public TestXmlOpponents(){super(Opponents.class);}
	public static Opponents create(boolean withChildren){return (new TestXmlOpponents()).build(withChildren);}
    
    public Opponents build(boolean withChilds)
    {
    	Opponents xml = new Opponents();
    	
    	if(withChilds)
    	{
        	xml.getOpponent().add(TestXmlOpponent.create(false));
        	xml.getOpponent().add(TestXmlOpponent.create(false));
    	}

    	return xml;
    }

	public static void main(String[] args)
    {
		TrXmlTestBootstrap.init();	
		TestXmlOpponents test = new TestXmlOpponents();
		test.saveReferenceXml();
    }
}