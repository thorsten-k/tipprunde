package org.tipprunde.model.xml.community.settings;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.tipprunde.model.xml.community.DefinitionRound;
import org.tipprunde.model.xml.liga.TestXmlRound;
import org.tipprunde.test.TrXmlTestBootstrap;

public class TestXmlDefinitionRound extends AbstractXmlDefinitionTest<DefinitionRound>
{
	final static Logger logger = LoggerFactory.getLogger(TestXmlDefinitionRound.class);
	
	public TestXmlDefinitionRound(){super(DefinitionRound.class);}
	public static DefinitionRound create(boolean withChildren){return (new TestXmlDefinitionRound()).build(withChildren);}
    
    public DefinitionRound build(boolean withChilds)
    {
    	DefinitionRound xml = new DefinitionRound();
    	xml.setId(1l);
    	xml.setDeadline(AbstractXmlDefinitionTest.getDefaultXmlDate());
    	
    	if(withChilds)
    	{
    		xml.setRound(TestXmlRound.create(false));
    		xml.setDefinitionEvent(TestXmlDefinitionEvent.create(false));
    	}
    	return xml;
    }

	public static void main(String[] args)
    {
		TrXmlTestBootstrap.init();	
		TestXmlDefinitionRound test = new TestXmlDefinitionRound();
		test.saveReferenceXml();
    }
}