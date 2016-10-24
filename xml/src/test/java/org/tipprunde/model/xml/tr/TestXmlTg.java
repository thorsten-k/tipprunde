package org.tipprunde.model.xml.tr;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.tipprunde.model.xml.community.TestXmlParticipant;
import org.tipprunde.model.xml.community.TestXmlTipps;
import org.tipprunde.model.xml.community.settings.TestXmlDefinitionRound;
import org.tipprunde.model.xml.liga.match.TestXmlMatch;
import org.tipprunde.model.xml.statistic.TestXmlUpdateWorker;
import org.tipprunde.model.xml.user.identity.TestXmlIdentity;
import org.tipprunde.test.TrXmlTestBootstrap;

import net.sf.ahtutils.xml.mail.Link;

public class TestXmlTg extends AbstractXmlTgTest<Tg>
{
	final static Logger logger = LoggerFactory.getLogger(TestXmlTg.class);
	
	public TestXmlTg(){super(Tg.class);}
	public static Tg create(boolean withChildren){return (new TestXmlTg()).build(withChildren);}
    
    @Override public Tg build(boolean withChilds)
    {
    	Tg xml = new Tg();

    	if(withChilds)
    	{
    		xml.getTipps().add(TestXmlTipps.create(false));
    		xml.getParticipant().add(TestXmlParticipant.create(false));
    		xml.getDefinitionRound().add(TestXmlDefinitionRound.create(false));
    		xml.getIdentity().add(TestXmlIdentity.create(false));
    		xml.getMatch().add(TestXmlMatch.create(false));
    		xml.getUpdateWorker().add(TestXmlUpdateWorker.create(false));
    		xml.setLink(new Link());
    	}
    	
    	return xml;
    }
	
	public static void main(String[] args)
    {
		TrXmlTestBootstrap.init();
		TestXmlTg test = new TestXmlTg();
		test.saveReferenceXml();
    }
}