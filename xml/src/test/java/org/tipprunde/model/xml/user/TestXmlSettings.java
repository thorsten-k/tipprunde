package org.tipprunde.model.xml.user;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.tipprunde.test.TrXmlTestBootstrap;

public class TestXmlSettings extends AbstractXmlUserTest<Settings>
{
	final static Logger logger = LoggerFactory.getLogger(TestXmlSettings.class);
	
	public TestXmlSettings(){super(Settings.class);}
	public static Settings create(boolean withChildren){return (new TestXmlSettings()).build(withChildren);}
    
    @Override public Settings build(boolean withChilds)
    {
    	Settings xml = new Settings();
    	xml.setId(1);
    	xml.setLang("de");
    	
       	if(withChilds)
    	{
    		xml.getNotification().add(TestXmlNotification.create(false));
    	}
    	
    	return xml;
    }

	public static void main(String[] args)
    {
		TrXmlTestBootstrap.init();
		TestXmlSettings test = new TestXmlSettings();
		test.saveReferenceXml();
    }
}