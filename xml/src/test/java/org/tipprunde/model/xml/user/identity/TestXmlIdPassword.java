package org.tipprunde.model.xml.user.identity;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.tipprunde.model.xml.user.IdPassword;
import org.tipprunde.test.TrXmlTestBootstrap;

public class TestXmlIdPassword extends AbstractXmlIdentityTest<IdPassword>
{
	final static Logger logger = LoggerFactory.getLogger(TestXmlIdPassword.class);
	
	public TestXmlIdPassword(){super(IdPassword.class);}
	public static IdPassword create(boolean withChildren){return (new TestXmlIdPassword()).build(withChildren);}

    @Override public IdPassword build(boolean withChilds)
    {
    	IdPassword xml = new IdPassword();
    	xml.setPassword("myPwd");
    	return xml;
    }

	public static void main(String[] args)
    {
		TrXmlTestBootstrap.init();	
		TestXmlIdPassword test = new TestXmlIdPassword();
		test.saveReferenceXml();
    }
}