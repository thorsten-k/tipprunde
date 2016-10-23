package org.tipprunde.model.xml.liga.match;

import java.io.File;
import java.io.FileNotFoundException;

import net.sf.exlp.util.xml.JaxbUtil;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.tipprunde.model.xml.liga.Location;
import org.tipprunde.model.xml.liga.ds.TestXmlDataSource;
import org.tipprunde.test.TrXmlTestBootstrap;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestXmlLocation extends AbstractXmlMatchTest
{
	final static Logger logger = LoggerFactory.getLogger(TestXmlLocation.class);
	
	@BeforeClass
	public static void initFiles()
	{
		fXml = new File(rootDir,"location2.xml");
	}
    
    @Test
    public void testPlain() throws FileNotFoundException
    {
    	Location actual = createLocation();
    	Location expected = (Location)JaxbUtil.loadJAXB(fXml.getAbsolutePath(), Location.class);
    	assertJaxbEquals(expected, actual);
    }
        
    private static Location createLocation() {return createLocation(true);}
    public static Location createLocation(boolean withChilds)
    {
    	Location xml = new Location();
    	xml.setId(1);
    	xml.setCity("myCity");
    	xml.setStadium("myStadium");
    	
    	if(withChilds)
    	{
    		xml.setDataSource(TestXmlDataSource.createDataSource(false));
    	}
    	return xml;
    }
    
    public void save() {save(createLocation(), fXml);}
   
	public static void main(String[] args)
    {
		TrXmlTestBootstrap.init();	
			
		TestXmlLocation.initFiles();	
		TestXmlLocation test = new TestXmlLocation();
		test.save();
    }
}