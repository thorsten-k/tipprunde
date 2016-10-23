package org.tipprunde.model.xml.user.identity;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.tipprunde.model.xml.user.Identity;
import org.tipprunde.test.TrXmlTestBootstrap;

public class TestXmlIdentity extends AbstractXmlIdentityTest<Identity>
{
	final static Logger logger = LoggerFactory.getLogger(TestXmlIdentity.class);
	
	public TestXmlIdentity(){super(Identity.class);}
	public static Identity create(boolean withChildren){return (new TestXmlIdentity()).build(withChildren);}
   
    @Override public Identity build(boolean withChilds)
    {
    	Identity xml = new Identity();
    	xml.setId(1);
    	xml.setPreferred(true);
    	xml.setEmail("myEmail");
    	xml.setEmailVerified(true);
    	
    	if(withChilds)
    	{
    		logger.error("NYI");
//    		xml.setUser(TestXmlUser.create(false));
    		xml.setIdFacebook(TestXmlIdFacebook.create(false));
    		xml.setIdPassword(TestXmlIdPassword.create(false));
    		xml.setIdEnterprise(TestXmlIdEnterprise.create(false));
    	}
    	return xml;
    }
    
	public static void main(String[] args)
    {
		TrXmlTestBootstrap.init();	
		TestXmlIdentity test = new TestXmlIdentity();
		test.saveReferenceXml();
    }
}