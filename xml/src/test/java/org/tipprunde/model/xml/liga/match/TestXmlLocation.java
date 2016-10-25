package org.tipprunde.model.xml.liga.match;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.tipprunde.model.xml.liga.Location;
import org.tipprunde.model.xml.liga.ds.TestXmlDataSource;
import org.tipprunde.test.TrXmlTestBootstrap;

public class TestXmlLocation extends AbstractXmlMatchTest<Location>
{
	final static Logger logger = LoggerFactory.getLogger(TestXmlLocation.class);
	
	public TestXmlLocation(){super(Location.class);}
	public static Location create(boolean withChildren){return (new TestXmlLocation()).build(withChildren);}
        
    public Location build(boolean withChilds)
    {
    	Location xml = new Location();
    	xml.setId(1);
    	xml.setCity("myCity");
    	xml.setStadium("myStadium");
    	
    	if(withChilds)
    	{
    		xml.setDataSource(TestXmlDataSource.create(false));
    	}
    	return xml;
    }

	public static void main(String[] args)
    {
		TrXmlTestBootstrap.init();	
		TestXmlLocation test = new TestXmlLocation();
		test.saveReferenceXml();
    }
}