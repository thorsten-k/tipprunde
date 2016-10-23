package org.tipprunde.model.xml.community;

import java.io.File;
import java.io.FileNotFoundException;

import net.sf.exlp.util.xml.JaxbUtil;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.tipprunde.model.xml.community.points.TestXmlPointsEvent;
import org.tipprunde.model.xml.user.identity.TestXmlIdentity;
import org.tipprunde.test.TrXmlTestBootstrap;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestXmlParticipant extends AbstractXmlCommunityTest
{
	final static Logger logger = LoggerFactory.getLogger(TestXmlParticipant.class);
	
	@BeforeClass
	public static void initFiles()
	{
		fXml = new File(rootDir,"participant2.xml");
	}
    
    @Test
    public void testXml() throws FileNotFoundException
    {
    	Participant test = create();
    	Participant ref = JaxbUtil.loadJAXB(fXml.getAbsolutePath(), Participant.class);
    	assertJaxbEquals(ref, test);
    }
    
    public static Participants createParticipants(boolean withChilds)
    {
    	Participants p = new Participants();
    	p.getParticipant().add(TestXmlParticipant.create(withChilds));
    	p.setSize(1);
    	return p;
    }
    
    private static Participant create() {return create(true);}
    public static Participant create(boolean withChilds)
    {
    	Participant xml = new Participant();
    	xml.setId(1);
    	
    	if(withChilds)
    	{
    		xml.setCommunity(TestXmlCommunity.createCommunity(false));
    		xml.setPointsEvent(TestXmlPointsEvent.create(false));
    		xml.setIdentity(TestXmlIdentity.create(false));
    		xml.setBet(TestXmlBet.create(false));
    	}
    	
    	return xml;
    }
    
    public void save() {save(create(), fXml);}
	
	public static void main(String[] args)
    {
		TrXmlTestBootstrap.init();	
			
		TestXmlParticipant.initFiles();	
		TestXmlParticipant test = new TestXmlParticipant();
		test.save();
    }
}