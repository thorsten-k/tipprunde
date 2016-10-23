package org.tipprunde.model.xml.community.settings;

import java.io.File;
import java.io.FileNotFoundException;

import net.sf.exlp.util.xml.JaxbUtil;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.tipprunde.model.xml.community.DefinitionEvent;
import org.tipprunde.model.xml.community.TestXmlCommunity;
import org.tipprunde.model.xml.community.TestXmlDeadlinePolicy;
import org.tipprunde.model.xml.liga.TestXmlEvent;
import org.tipprunde.test.TrXmlTestBootstrap;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestXmlDefinitionEvent extends AbstractXmlDefinitionTest
{
	final static Logger logger = LoggerFactory.getLogger(TestXmlDefinitionEvent.class);
	
	@BeforeClass
	public static void initFiles()
	{
		fXml = new File(rootDir,"DefinitionEvent.xml");
	}
    
    @Test
    public void testXml() throws FileNotFoundException
    {
    	DefinitionEvent actual = createDefinitionEvent();
    	DefinitionEvent expected = (DefinitionEvent)JaxbUtil.loadJAXB(fXml.getAbsolutePath(), DefinitionEvent.class);
    	assertJaxbEquals(expected, actual);
    }
    
    private static DefinitionEvent createDefinitionEvent() {return createDefinitionEvent(true);}
    public static DefinitionEvent createDefinitionEvent(boolean withChilds)
    {
    	DefinitionEvent xml = new DefinitionEvent();
    	xml.setId(1);
    	
    	if(withChilds)
    	{
    		xml.setDeadlinePolicy(TestXmlDeadlinePolicy.createDeadlinePolicy(false));
    		xml.setCommunity(TestXmlCommunity.createCommunity(false));
    		xml.setEvent(TestXmlEvent.createEvent(false));
    		xml.getDefinitionRound().addAll(TestXmlDefinitionRound.createRounds(false));
    	}
    	return xml;
    }
    
    public void save() {save(createDefinitionEvent(), fXml);}
	
	public static void main(String[] args)
    {
		TrXmlTestBootstrap.init();	
			
		TestXmlDefinitionEvent.initFiles();	
		TestXmlDefinitionEvent test = new TestXmlDefinitionEvent();
		test.save();
    }
}