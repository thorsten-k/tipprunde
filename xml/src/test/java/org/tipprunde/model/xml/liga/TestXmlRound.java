package org.tipprunde.model.xml.liga;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.tipprunde.model.xml.liga.ds.TestXmlDataSource;
import org.tipprunde.model.xml.liga.match.TestXmlMatch;
import org.tipprunde.test.TrXmlTestBootstrap;

public class TestXmlRound extends AbstractXmlLigaTest<Round>
{
	final static Logger logger = LoggerFactory.getLogger(TestXmlRound.class);

	public TestXmlRound(){super(Round.class);}
	public static Round create(boolean withChildren){return (new TestXmlRound()).build(withChildren);}
    
    public Round build(boolean withChilds)
    {
    	Round xml = new Round();
    	xml.setId(1);
    	xml.setName("myName");
    	xml.setNr(7);
    	
    	if(withChilds)
    	{
    		xml.setEvents(TestXmlEvents.create(false));
    		xml.setDataSource(TestXmlDataSource.create(false));
    		xml.getMatch().add(TestXmlMatch.create(false));
    		xml.setVisible(TestXmlVisible.create(false));
    	}
    	return xml;
    }
   
	public static void main(String[] args)
    {
		TrXmlTestBootstrap.init();	
		TestXmlRound test = new TestXmlRound();
		test.saveReferenceXml();
    }
}