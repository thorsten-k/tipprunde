package org.tipprunde.model.xml.liga.match;

import java.io.File;
import java.io.FileNotFoundException;

import net.sf.exlp.util.xml.JaxbUtil;

import org.junit.BeforeClass;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.tipprunde.model.xml.liga.Opponents;
import org.tipprunde.test.TrXmlTestBootstrap;

public class TestXmlOpponents extends AbstractXmlMatchTest
{
	final static Logger logger = LoggerFactory.getLogger(TestXmlOpponents.class);
	
	@BeforeClass
	public static void initFiles()
	{
		fXml = new File(rootDir,Opponents.class.getSimpleName()+".xml");
	}
    
    @Test
    public void testXml() throws FileNotFoundException
    {
    	Opponents actual = create(true);
    	Opponents expected = JaxbUtil.loadJAXB(fXml.getAbsolutePath(), Opponents.class);
    	assertJaxbEquals(expected, actual);
    }
    
    public static Opponents create(boolean withChilds)
    {
    	Opponents xml = new Opponents();
    	
    	if(withChilds)
    	{
        	xml.getOpponent().add(TestXmlOpponent.create(false));
        	xml.getOpponent().add(TestXmlOpponent.create(false));
    	}

    	return xml;
    }
    
    public void save() {save(create(true), fXml);}
   
	public static void main(String[] args)
    {
		TrXmlTestBootstrap.init();	
			
		TestXmlOpponents.initFiles();	
		TestXmlOpponents test = new TestXmlOpponents();
		test.save();
    }
}