package org.tipprunde.model.xml.community;

import java.io.File;
import java.io.FileNotFoundException;

import net.sf.exlp.util.xml.JaxbUtil;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.tipprunde.test.TrXmlTestBootstrap;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestXmlTipps extends AbstractXmlCommunityTest
{
	final static Logger logger = LoggerFactory.getLogger(TestXmlTipps.class);
	
	@BeforeClass
	public static void initFiles()
	{
		fXml = new File(rootDir,"tipps2.xml");
	}
    
    @Test
    public void testXml() throws FileNotFoundException
    {
    	Tipps actual = create(true);
    	Tipps expected = JaxbUtil.loadJAXB(fXml.getAbsolutePath(), Tipps.class);
    	assertJaxbEquals(expected, actual);
    }
    
    private static Tipps create(){return create(true);}
    public static Tipps create(boolean withChilds)
    {
    	Tipps xml = new Tipps();
    	
    	if(withChilds)
    	{
    		xml.getTipp().add(TestXmlTipp.createTipp(false));
    		xml.getTipp().add(TestXmlTipp.createTipp(false));
    	}
    	return xml;
    }
    
    public void save() {save(create(), fXml);}
	
	public static void main(String[] args)
    {
		TrXmlTestBootstrap.init();	
			
		TestXmlTipps.initFiles();	
		TestXmlTipps test = new TestXmlTipps();
		test.save();
    }
}