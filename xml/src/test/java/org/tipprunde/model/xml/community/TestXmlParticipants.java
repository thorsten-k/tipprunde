package org.tipprunde.model.xml.community;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.tipprunde.test.TrXmlTestBootstrap;

public class TestXmlParticipants extends AbstractXmlCommunityTest<Participants>
{
	final static Logger logger = LoggerFactory.getLogger(TestXmlParticipants.class);
	
	public TestXmlParticipants(){super(Participants.class);}
	public static Participants create(boolean withChildren){return (new TestXmlParticipants()).build(withChildren);}
   
    public Participants build(boolean withChilds)
    {
    	Participants xml = new Participants();
    	xml.setSize(1);
    	if(withChilds)
    	{
    		xml.getParticipant().add(TestXmlParticipant.create(withChilds));
    	}
    	
    	return xml;
    }

	public static void main(String[] args)
    {
		TrXmlTestBootstrap.init();	
		TestXmlParticipants test = new TestXmlParticipants();
		test.saveReferenceXml();
    }
}