package org.tipprunde.model.xml.liga.match;

import java.io.File;
import java.io.FileNotFoundException;

import net.sf.exlp.util.xml.JaxbUtil;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.tipprunde.model.xml.liga.Result;
import org.tipprunde.test.TrXmlTestBootstrap;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestXmlResult extends AbstractXmlMatchTest
{
	final static Logger logger = LoggerFactory.getLogger(TestXmlResult.class);

	@BeforeClass
	public static void initFiles()
	{
		fXml = new File(rootDir,"result2.xml");
	}
    
    @Test
    public void testPlain() throws FileNotFoundException
    {
    	Result actual = createResult();
    	Result expected = (Result)JaxbUtil.loadJAXB(fXml.getAbsolutePath(), Result.class);
    	assertJaxbEquals(expected, actual);
    }
        
    private static Result createResult() {return createResult(true);}
    public static Result createResult(boolean withChilds)
    {
    	Result xml = new Result();
    	xml.setId(1);
    	xml.setScoreLeft(1);
    	xml.setScoreRight(1);
    	
    	return xml;
    }
    
    public void save() {save(createResult(), fXml);}
   
	public static void main(String[] args)
    {
		TrXmlTestBootstrap.init();	
			
		TestXmlResult.initFiles();	
		TestXmlResult test = new TestXmlResult();
		test.save();
    }
}