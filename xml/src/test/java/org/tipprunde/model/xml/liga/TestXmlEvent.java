package org.tipprunde.model.xml.liga;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.tipprunde.model.xml.liga.ds.TestXmlDataSource;
import org.tipprunde.test.TrXmlTestBootstrap;

public class TestXmlEvent extends AbstractXmlLigaTest<Event>
{
	final static Logger logger = LoggerFactory.getLogger(TestXmlEvent.class);
	
	public TestXmlEvent(){super(Event.class);}
	public static Event create(boolean withChildren){return (new TestXmlEvent()).build(withChildren);}
    
    public Event build(boolean withChilds)
    {
    	Event xml = new Event();
    	xml.setId(1);
    	xml.setName("testName");
    	
    	if(withChilds)
    	{
    		xml.setDiscipline(TestXmlDiscipline.create(false));
    		xml.setRounds(TestXmlRounds.create(false));
    		xml.setVisible(TestXmlVisible.create(false));
    		xml.setDataSource(TestXmlDataSource.create(false));
    	}
    	return xml;
    }
   
	public static void main(String[] args)
    {
		TrXmlTestBootstrap.init();	
		TestXmlEvent test = new TestXmlEvent();
		test.saveReferenceXml();
    }
}