package org.tipprunde.model.xml.community.points;

import java.io.File;
import java.io.FileNotFoundException;

import net.sf.exlp.util.xml.JaxbUtil;

import org.junit.BeforeClass;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.tipprunde.model.xml.community.ScoreDetails;
import org.tipprunde.test.TrXmlTestBootstrap;

public class TestXmlScoreDetails extends AbstractXmlPointsTest
{
	final static Logger logger = LoggerFactory.getLogger(TestXmlScoreDetails.class);
	
	@BeforeClass
	public static void initFiles()
	{
		fXml = new File(rootDir,"scoreDetails2.xml");
	}
    
    @Test
    public void testPlain() throws FileNotFoundException
    {
    	ScoreDetails actual = create();
    	ScoreDetails expected = JaxbUtil.loadJAXB(fXml.getAbsolutePath(), ScoreDetails.class);
    	assertJaxbEquals(expected, actual);
    }
    
    private static ScoreDetails create() {return create(true);}
    public static ScoreDetails create(boolean withChilds)
    {
    	ScoreDetails xml = new ScoreDetails();
    	xml.setExcact(true);
    	xml.setDifference(true);
    	xml.setTendence(true);
    	
    	return xml;
    }
    
    public void save() {save(create(), fXml);}
	
	public static void main(String[] args)
    {
		TrXmlTestBootstrap.init();	
			
		TestXmlScoreDetails.initFiles();	
		TestXmlScoreDetails test = new TestXmlScoreDetails();
		test.save();
    }
}