package org.tipprunde.model.xml.user.identity;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.tipprunde.model.xml.user.IdEnterprise;
import org.tipprunde.test.TrXmlTestBootstrap;

public class TestXmlIdEnterprise extends AbstractXmlIdentityTest<IdEnterprise>
{
	final static Logger logger = LoggerFactory.getLogger(TestXmlIdEnterprise.class);
	
	public TestXmlIdEnterprise(){super(IdEnterprise.class);}
	public static IdEnterprise create(boolean withChildren){return (new TestXmlIdEnterprise()).build(withChildren);}
   
    public IdEnterprise build(boolean withChilds)
    {
    	IdEnterprise xml = new IdEnterprise();
    	xml.setCompany("myCompany");
    	return xml;
    }
    
	public static void main(String[] args)
    {
		TrXmlTestBootstrap.init();		
		TestXmlIdEnterprise test = new TestXmlIdEnterprise();
		test.saveReferenceXml();
    }
}