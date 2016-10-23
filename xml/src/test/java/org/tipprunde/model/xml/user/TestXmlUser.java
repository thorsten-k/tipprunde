package org.tipprunde.model.xml.user;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.tipprunde.model.xml.user.identity.TestXmlIdentity;
import org.tipprunde.test.TrXmlTestBootstrap;

public class TestXmlUser extends AbstractXmlUserTest<User>
{
	final static Logger logger = LoggerFactory.getLogger(TestXmlUser.class);
	
	public TestXmlUser(){super(User.class);}
	public static User create(boolean withChildren){return (new TestXmlUser()).build(withChildren);}
    
	@Override public User build(boolean withChilds)
    {
    	User xml = new User();
    	xml.setId(1);
    	xml.setFirstName("firstName");
    	xml.setLastName("lastName");
    	if(withChilds)
    	{
    		xml.getIdentity().add(TestXmlIdentity.create(false));
    		xml.setSettings(TestXmlSettings.create(false));
    	}
    	return xml;
    }

	public static void main(String[] args)
    {
		TrXmlTestBootstrap.init();
		TestXmlUser test = new TestXmlUser();
		test.saveReferenceXml();
    }
}