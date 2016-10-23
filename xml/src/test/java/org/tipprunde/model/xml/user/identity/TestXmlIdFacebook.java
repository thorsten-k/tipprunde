package org.tipprunde.model.xml.user.identity;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.tipprunde.model.xml.user.IdFacebook;
import org.tipprunde.test.TrXmlTestBootstrap;

public class TestXmlIdFacebook extends AbstractXmlIdentityTest<IdFacebook>
{
	final static Logger logger = LoggerFactory.getLogger(TestXmlIdFacebook.class);
	
	public TestXmlIdFacebook(){super(IdFacebook.class);}
	public static IdFacebook create(boolean withChildren){return (new TestXmlIdFacebook()).build(withChildren);}

    public IdFacebook build(boolean withChilds)
    {
    	IdFacebook xml = new IdFacebook();
    	xml.setAccessToken("myAccessToken");
    	xml.setAppAuhtCode("appAuthCode");
    	xml.setExpiresToken(getDefaultXmlDate());
    	xml.setFbId("myId");
    	return xml;
    }
    
	public static void main(String[] args)
    {
		TrXmlTestBootstrap.init();	
		TestXmlIdFacebook test = new TestXmlIdFacebook();
		test.saveReferenceXml();
    }
}