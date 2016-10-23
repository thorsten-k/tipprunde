package org.tipprunde.model.xml.liga.match;

import java.io.File;
import java.io.FileNotFoundException;

import net.sf.exlp.util.xml.JaxbUtil;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.tipprunde.model.xml.liga.Right;
import org.tipprunde.test.TrXmlTestBootstrap;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestXmlRight extends AbstractXmlMatchTest
{
	final static Logger logger = LoggerFactory.getLogger(TestXmlRight.class);
	
	@BeforeClass
	public static void initFiles()
	{
		fXml = new File(rootDir,"right2.xml");
	}
    
    @Test
    public void testPlain() throws FileNotFoundException
    {
    	Right actual = create();
    	Right expected = (Right)JaxbUtil.loadJAXB(fXml.getAbsolutePath(), Right.class);
    	assertJaxbEquals(expected, actual);
    }
        
    private static Right create() {return create(true);}
    public static Right create(boolean withChilds)
    {
    	Right xml = new Right();
    	
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
			
		TestXmlRight.initFiles();	
		TestXmlRight test = new TestXmlRight();
		test.save();
    }
}