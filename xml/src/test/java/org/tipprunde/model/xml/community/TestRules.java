package org.tipprunde.model.xml.community;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.tipprunde.test.TrXmlTestBootstrap;

public class TestRules extends AbstractXmlCommunityTest<Rules>
{
	final static Logger logger = LoggerFactory.getLogger(TestRules.class);
	
	public TestRules(){super(Rules.class);}
	public static Rules create(boolean withChildren){return (new TestRules()).build(withChildren);}
	
    public Rules build(boolean withChilds)
    {
    	Rules xml = new Rules();
    	xml.setId(1);
    	xml.setTendence(1);
    	xml.setDifference(1);
    	xml.setExcact(1);
    	return xml;
    }

	public static void main(String[] args)
    {
		TrXmlTestBootstrap.init();	
		TestRules test = new TestRules();
		test.saveReferenceXml();
    }
}