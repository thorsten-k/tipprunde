package org.tipprunde.model.xml.liga;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.tipprunde.test.TrXmlTestBootstrap;

public class TestXmlEvents extends AbstractXmlLigaTest<Events>
{
	final static Logger logger = LoggerFactory.getLogger(TestXmlEvents.class);
	
	public TestXmlEvents(){super(Events.class);}
	public static Events create(boolean withChildren){return (new TestXmlEvents()).build(withChildren);}
    
    public Events build(boolean withChilds)
    {
    	Events xml = new Events();
    	
    	if(withChilds)
    	{
    		xml.getEvent().add(TestXmlEvent.create(withChilds));
    	}
    	return xml;
    }
   
	public static void main(String[] args)
    {
		TrXmlTestBootstrap.init();	
		TestXmlEvents test = new TestXmlEvents();
		test.saveReferenceXml();
    }
}