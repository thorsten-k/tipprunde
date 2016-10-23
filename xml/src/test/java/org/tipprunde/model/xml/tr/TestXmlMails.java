package org.tipprunde.model.xml.tr;

import org.tipprunde.test.TrXmlTestBootstrap;

public class TestXmlMails extends AbstractXmlTgTest<Mails>
{
	public TestXmlMails(){super(Mails.class);}
	public static Mails create(boolean withChildren){return (new TestXmlMails()).build(withChildren);}
    
    @Override public Mails build(boolean withChilds)
    {
    	Mails xml = new Mails();
    	
    	if(withChilds)
    	{
    		xml.getMail().add(TestXmlMail.create(false));
    		xml.getMail().add(TestXmlMail.create(false));
    	}
    	return xml;
    }
	
	public static void main(String[] args)
    {
		TrXmlTestBootstrap.init();	
		TestXmlMails test = new TestXmlMails();
		test.saveReferenceXml();
    }
}