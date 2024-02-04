package org.tipprunde.model.xml.community;

import java.time.LocalDateTime;

import org.exlp.util.system.DateUtil;
import org.jeesl.model.xml.io.locale.status.Status;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.tipprunde.model.xml.liga.match.TestXmlMatch;
import org.tipprunde.model.xml.user.identity.TestXmlIdentity;
import org.tipprunde.test.TrXmlTestBootstrap;

public class TestXmlTipp extends AbstractXmlCommunityTest<Tipp>
{
	final static Logger logger = LoggerFactory.getLogger(TestXmlTipp.class);
	
	public TestXmlTipp(){super(Tipp.class);}
	public static Tipp create(boolean withChildren){return (new TestXmlTipp()).build(withChildren);}
    
    public Tipp build(boolean withChilds)
    {
    	LocalDateTime d = LocalDateTime.of(2012,2,23,12,42,12);
    		
    	Tipp xml = new Tipp();
    	xml.setId(1l);
    	xml.setLeft(2);
    	xml.setLeft(1);
    	xml.setRecord(DateUtil.toXmlGc(d));
    	xml.setDeadline(DateUtil.toXmlGc(d));
    	xml.setSync("sync");
    	xml.setStatus(new Status());
    	
    	if(withChilds)
    	{
    		xml.setMatch(TestXmlMatch.create(false));
    		xml.setIdentity(TestXmlIdentity.create(false));
    	}
    	return xml;
    }

	public static void main(String[] args)
    {
		TrXmlTestBootstrap.init();	
		TestXmlTipp test = new TestXmlTipp();
		test.saveReferenceXml();
    }
}