package org.tipprunde.model.xml.community;

import org.exlp.model.xml.net.Urls;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.tipprunde.model.xml.community.settings.TestXmlDefinitionEvent;
import org.tipprunde.test.TrXmlTestBootstrap;

public class TestXmlCommunity extends AbstractXmlCommunityTest<Community>
{
	final static Logger logger = LoggerFactory.getLogger(TestXmlCommunity.class);
	
	public TestXmlCommunity(){super(Community.class);}
	public static Community create(boolean withChildren){return (new TestXmlCommunity()).build(withChildren);}
    
    public Community build(boolean withChilds)
    {
    	Community xml = new Community();
    	xml.setId(1l);
    	xml.setName("Test Community");
    	
    	if(withChilds)
    	{
    		xml.setParticipants(TestXmlParticipants.create(false));
    		xml.setSubscription(TestXmlSubscription.create(false));
    		xml.setDefinitionEvent(TestXmlDefinitionEvent.create(false));
    		xml.setRules(TestRules.create(false));
    		xml.setUrls(new Urls());
    	}
    	return xml;
    }

	public static void main(String[] args)
    {
		TrXmlTestBootstrap.init();		
		TestXmlCommunity test = new TestXmlCommunity();
		test.saveReferenceXml();
    }
}