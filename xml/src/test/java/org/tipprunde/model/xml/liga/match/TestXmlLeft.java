package org.tipprunde.model.xml.liga.match;

import java.io.File;
import java.io.FileNotFoundException;

import net.sf.exlp.util.xml.JaxbUtil;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.tipprunde.model.xml.liga.Left;
import org.tipprunde.test.TrXmlTestBootstrap;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestXmlLeft extends AbstractXmlMatchTest
{
	final static Logger logger = LoggerFactory.getLogger(TestXmlLeft.class);
	
	@BeforeClass
	public static void initFiles()
	{
		fXml = new File(rootDir,"left2.xml");
	}
    
    @Test
    public void testPlain() throws FileNotFoundException
    {
    	Left actual = create();
    	Left expected = (Left)JaxbUtil.loadJAXB(fXml.getAbsolutePath(), Left.class);
    	assertJaxbEquals(expected, actual);
    }
        
    private static Left create() {return create(true);}
    public static Left create(boolean withChilds)
    {
    	Left xml = new Left();
    	
    	if(withChilds)
    	{
    		xml.setOpponent(TestXmlOpponent.create(false));
    	}
    	return xml;
    }
    
    public void save() {save(create(), fXml);}
   
	public static void main(String[] args)
    {
		TrXmlTestBootstrap.init();	
			
		TestXmlLeft.initFiles();	
		TestXmlLeft test = new TestXmlLeft();
		test.save();
    }
}