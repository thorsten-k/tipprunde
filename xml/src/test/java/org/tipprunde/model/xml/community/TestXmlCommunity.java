package org.tipprunde.model.xml.community;

import java.io.File;
import java.io.FileNotFoundException;

import net.sf.exlp.util.xml.JaxbUtil;
import net.sf.exlp.xml.net.Urls;

import org.junit.BeforeClass;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.tipprunde.model.xml.community.settings.TestXmlDefinitionEvent;
import org.tipprunde.test.TrXmlTestBootstrap;

public class TestXmlCommunity extends AbstractXmlCommunityTest
{
	final static Logger logger = LoggerFactory.getLogger(TestXmlCommunity.class);
	
	@BeforeClass
	public static void initFiles()
	{
		fXml = new File(rootDir,"community2.xml");
	}
    
    @Test
    public void testXml() throws FileNotFoundException
    {
    	Community actual = createCommunity();
    	Community expected = (Community)JaxbUtil.loadJAXB(fXml.getAbsolutePath(), Community.class);
    	assertJaxbEquals(expected, actual);
    }
    
    private static Community createCommunity() {return createCommunity(true);}
    public static Community createCommunity(boolean withChilds)
    {
    	Community xml = new Community();
    	xml.setId(1);
    	xml.setName("Test Community");
    	
    	if(withChilds)
    	{
    		xml.setParticipants(TestXmlParticipant.createParticipants(false));
    		xml.setSubscription(TestXmlSubscription.createSubscription(false));
    		xml.setDefinitionEvent(TestXmlDefinitionEvent.create(false));
    		xml.setRules(TestRules.createRules(false));
    		xml.setUrls(new Urls());
    	}
    	return xml;
    }
    
    public void save(){save(createCommunity(), fXml);}
	
	public static void main(String[] args)
    {
		TrXmlTestBootstrap.init();	
			
		TestXmlCommunity.initFiles();	
		TestXmlCommunity test = new TestXmlCommunity();
		test.save();
    }
}