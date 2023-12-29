package org.tipprunde.model.xml.community;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.tipprunde.model.xml.community.points.TestXmlPointsEvent;
import org.tipprunde.model.xml.user.identity.TestXmlIdentity;
import org.tipprunde.test.TrXmlTestBootstrap;

public class TestXmlParticipant extends AbstractXmlCommunityTest<Participant>
{
	final static Logger logger = LoggerFactory.getLogger(TestXmlParticipant.class);
	
	public TestXmlParticipant(){super(Participant.class);}
	public static Participant create(boolean withChildren){return (new TestXmlParticipant()).build(withChildren);}
   
    public Participant build(boolean withChilds)
    {
    	Participant xml = new Participant();
    	xml.setId(1l);
    	
    	if(withChilds)
    	{
    		xml.setCommunity(TestXmlCommunity.create(false));
    		xml.setPointsEvent(TestXmlPointsEvent.create(false));
    		xml.setIdentity(TestXmlIdentity.create(false));
    		xml.setBet(TestXmlBet.create(false));
    	}
    	
    	return xml;
    }

	public static void main(String[] args)
    {
		TrXmlTestBootstrap.init();	
		TestXmlParticipant test = new TestXmlParticipant();
		test.saveReferenceXml();
    }
}