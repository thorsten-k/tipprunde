package org.tipprunde.model.xml.statistic;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestXmlUpdateWorker extends AbstractXmlStatTest<UpdateWorker>
{
	final static Logger logger = LoggerFactory.getLogger(TestXmlUpdateWorker.class);
	
	public TestXmlUpdateWorker(){super(UpdateWorker.class);}
	public static UpdateWorker create(boolean withChildren){return (new TestXmlUpdateWorker()).build(withChildren);}
    
    public static UpdateWorker create(boolean withChilds)
    {
    	UpdateWorker xml = new UpdateWorker();
    	xml.setId(123);
    	xml.setName("myName");
    	
    	if(withChilds)
    	{
    		xml.setUpdatePolicy(TestXmlUpdatePolicy.createUpdatePolicy(false));
    	}
    	
    	return xml;
    }

	public static void main(String[] args)
    {
		TgXmlTstBootstrap.init();		
		TestXmlUpdateWorker test = new TestXmlUpdateWorker();
		test.saveReferenceXml();
    }
}