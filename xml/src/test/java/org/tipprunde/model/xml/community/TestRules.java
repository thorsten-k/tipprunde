package org.tipprunde.model.xml.community;

import java.io.File;
import java.io.FileNotFoundException;

import net.sf.exlp.util.xml.JaxbUtil;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.tipprunde.test.TrXmlTestBootstrap;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestRules extends AbstractXmlCommunityTest
{
	final static Logger logger = LoggerFactory.getLogger(TestRules.class);
	
	@BeforeClass
	public static void initFiles()
	{
		fXml = new File(rootDir,"rules2.xml");
	}
    
    @Test
    public void testPlain() throws FileNotFoundException
    {
    	Rules actual = createRules();
    	Rules expected = (Rules)JaxbUtil.loadJAXB(fXml.getAbsolutePath(), Rules.class);
    	assertJaxbEquals(expected, actual);
    }
    
    private static Rules createRules() {return createRules(true);}
    public static Rules createRules(boolean withChilds)
    {
    	Rules xml = new Rules();
    	xml.setId(1);
    	xml.setTendence(1);
    	xml.setDifference(1);
    	xml.setExcact(1);
    	return xml;
    }
    
    public void save() {save(createRules(), fXml);}
	
	public static void main(String[] args)
    {
		TrXmlTestBootstrap.init();	
			
		TestRules.initFiles();	
		TestRules test = new TestRules();
		test.save();
    }
}