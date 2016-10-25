package org.tipprunde.model.xml.liga.ds;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.tipprunde.model.xml.liga.DataSource;
import org.tipprunde.test.TrXmlTestBootstrap;

public class TestXmlDataSource extends AbstractXmlLigaDsTest<DataSource>
{
	final static Logger logger = LoggerFactory.getLogger(TestXmlDataSource.class);
	
	public TestXmlDataSource(){super(DataSource.class);}
	public static DataSource create(boolean withChildren){return (new TestXmlDataSource()).build(withChildren);}
  
    public DataSource build(boolean withChildren)
    {
    	DataSource xml = new DataSource();
    	xml.setId(1);
    	xml.setLastChange(AbstractXmlLigaDsTest.getDefaultXmlDate());
    	
    	if(withChildren)
    	{
        	xml.setUpdatePolicy(TestXmlUpdatePolicy.create(false));
        	xml.setOpenliga(TestXmlOpenliga.create(false));
    	}

    	return xml;
    }
  	
	public static void main(String[] args)
    {
		TrXmlTestBootstrap.init();	
		TestXmlDataSource test = new TestXmlDataSource();
		test.saveReferenceXml();
    }
}