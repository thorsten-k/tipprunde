package org.tipprunde.model.xml.tr;

import org.tipprunde.test.TrXmlTestBootstrap;

public class TestXmlMail extends AbstractXmlTgTest<Mail>
{
	public TestXmlMail(){super(Mail.class);}
	public static Mail create(boolean withChildren){return (new TestXmlMail()).build(withChildren);}
    
    public Mail build(boolean withChilds)
    {
    	Mail xml = new Mail();
    	xml.setId(123);
    	
    	if(withChilds)
    	{
    		xml.setTg(TestXmlTg.create(false));
    		xml.setMail(new net.sf.ahtutils.xml.mail.Mail());
    	}
    	return xml;
    }
	
	public static void main(String[] args)
    {
		TrXmlTestBootstrap.init();	
		TestXmlMail test = new TestXmlMail();
		test.saveReferenceXml();
    }
}