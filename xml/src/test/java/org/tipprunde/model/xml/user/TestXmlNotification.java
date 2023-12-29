package org.tipprunde.model.xml.user;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.tipprunde.test.TrXmlTestBootstrap;

public class TestXmlNotification extends AbstractXmlUserTest<Notification>
{
	final static Logger logger = LoggerFactory.getLogger(TestXmlNotification.class);
	
	public TestXmlNotification(){super(Notification.class);}
	public static Notification create(boolean withChildren){return (new TestXmlNotification()).build(withChildren);}
    
	@Override public Notification build(boolean withChilds)
    {
    	Notification xml = new Notification();
    	xml.setId(1l);
    	
    	return xml;
    }

	public static void main(String[] args)
    {
		TrXmlTestBootstrap.init();
		TestXmlNotification test = new TestXmlNotification();
		test.saveReferenceXml();
    }
}