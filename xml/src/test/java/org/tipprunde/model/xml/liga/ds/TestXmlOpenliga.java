package org.tipprunde.model.xml.liga.ds;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.tipprunde.model.xml.ds.Openliga;
import org.tipprunde.test.TrXmlTestBootstrap;

public class TestXmlOpenliga extends AbstractXmlLigaDsTest<Openliga>
{
	final static Logger logger = LoggerFactory.getLogger(TestXmlOpenliga.class);
	
	public TestXmlOpenliga(){super(Openliga.class);}
	public static Openliga create(boolean withChildren){return (new TestXmlOpenliga()).build(withChildren);}
  
    public Openliga build(boolean withChilds)
    {
    	Openliga xml = new Openliga();
    	xml.setId(1);
    	xml.setRefId(4711);
    	xml.setType("sport");
    	xml.setSaison("mySaison");
    	xml.setShortcut("myShortcut");
    	return xml;
    }

	public static void main(String[] args)
    {
		TrXmlTestBootstrap.init();	
		TestXmlOpenliga test = new TestXmlOpenliga();
		test.saveReferenceXml();
    }
}