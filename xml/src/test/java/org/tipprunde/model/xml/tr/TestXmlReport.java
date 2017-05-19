package org.tipprunde.model.xml.tr;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.tipprunde.test.TrXmlTestBootstrap;

public class TestXmlReport extends AbstractXmlTgTest<Report>
{
	final static Logger logger = LoggerFactory.getLogger(TestXmlReport.class);
	
	public TestXmlReport(){super(Report.class);}
	public static Report create(boolean withChildren){return (new TestXmlReport()).build(withChildren);}
    
    @Override public Report build(boolean withChilds)
    {
    	Report xml = new Report();
    	xml.setTg(TestXmlTr.create(false));
    	return xml;
    }
	
	public static void main(String[] args)
    {
		TrXmlTestBootstrap.init();	
		TestXmlReport test = new TestXmlReport();
		test.saveReferenceXml();
    }
}