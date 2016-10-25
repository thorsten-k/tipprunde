package org.tipprunde.model.xml.community;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.tipprunde.test.TrXmlTestBootstrap;

public class TestXmlTipps extends AbstractXmlCommunityTest<Tipps>
{
	final static Logger logger = LoggerFactory.getLogger(TestXmlTipps.class);
	
	public TestXmlTipps(){super(Tipps.class);}
	public static Tipps create(boolean withChildren){return (new TestXmlTipps()).build(withChildren);}
  
    public Tipps build(boolean withChilds)
    {
    	Tipps xml = new Tipps();
    	
    	if(withChilds)
    	{
    		xml.getTipp().add(TestXmlTipp.create(false));
    		xml.getTipp().add(TestXmlTipp.create(false));
    	}
    	return xml;
    }

	public static void main(String[] args)
    {
		TrXmlTestBootstrap.init();	
		TestXmlTipps test = new TestXmlTipps();
		test.saveReferenceXml();
    }
}