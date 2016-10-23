package org.tipprunde.model.xml.liga.ds;

import java.io.File;
import java.io.FileNotFoundException;

import net.sf.exlp.util.xml.JaxbUtil;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.tipprunde.model.xml.ds.Openliga;
import org.tipprunde.test.TrXmlTestBootstrap;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestXmlOpenliga extends AbstractXmlLigaDsTest
{
	final static Logger logger = LoggerFactory.getLogger(TestXmlOpenliga.class);
	
	@BeforeClass
	public static void initFiles()
	{
		fXml = new File(rootDir,"dsOpenliga2.xml");
	}
    
    @Test
    public void testPlain() throws FileNotFoundException
    {
    	Openliga actual = createOpenLiga();
    	Openliga expected = (Openliga)JaxbUtil.loadJAXB(fXml.getAbsolutePath(), Openliga.class);
    	assertJaxbEquals(expected, actual);
    }
    
    private static Openliga createOpenLiga() {return createOpenLiga(true);}
    public static Openliga createOpenLiga(boolean withChilds)
    {
    	Openliga xml = new Openliga();
    	xml.setId(1);
    	xml.setRefId(4711);
    	xml.setType("sport");
    	xml.setSaison("mySaison");
    	xml.setShortcut("myShortcut");
    	return xml;
    }
    
    public void save() {save(createOpenLiga(), fXml);}
	
	public static void main(String[] args)
    {
		TrXmlTestBootstrap.init();	
			
		TestXmlOpenliga.initFiles();	
		TestXmlOpenliga test = new TestXmlOpenliga();
		test.save();
    }
}