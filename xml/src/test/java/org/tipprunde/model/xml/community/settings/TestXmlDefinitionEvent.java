package org.tipprunde.model.xml.community.settings;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.tipprunde.model.xml.community.DefinitionEvent;
import org.tipprunde.model.xml.community.TestXmlCommunity;
import org.tipprunde.model.xml.community.TestXmlDeadlinePolicy;
import org.tipprunde.model.xml.liga.TestXmlEvent;
import org.tipprunde.test.TrXmlTestBootstrap;

public class TestXmlDefinitionEvent extends AbstractXmlDefinitionTest<DefinitionEvent>
{
	final static Logger logger = LoggerFactory.getLogger(TestXmlDefinitionEvent.class);
	
	public TestXmlDefinitionEvent(){super(DefinitionEvent.class);}
	public static DefinitionEvent create(boolean withChildren){return (new TestXmlDefinitionEvent()).build(withChildren);}
    
    public DefinitionEvent build(boolean withChilds)
    {
    	DefinitionEvent xml = new DefinitionEvent();
    	xml.setId(1l);
    	
    	if(withChilds)
    	{
    		xml.setDeadlinePolicy(TestXmlDeadlinePolicy.create(false));
    		xml.setCommunity(TestXmlCommunity.create(false));
    		xml.setEvent(TestXmlEvent.create(false));
    		xml.getDefinitionRound().add(TestXmlDefinitionRound.create(false));xml.getDefinitionRound().add(TestXmlDefinitionRound.create(false));
    	}
    	return xml;
    }

	public static void main(String[] args)
    {
		TrXmlTestBootstrap.init();	
		TestXmlDefinitionEvent test = new TestXmlDefinitionEvent();
		test.saveReferenceXml();
    }
}