package org.tipprunde.model.xml.community.points;

import java.io.File;
import java.io.FileNotFoundException;

import net.sf.exlp.util.xml.JaxbUtil;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.tipprunde.model.xml.community.PointsMatch;
import org.tipprunde.model.xml.community.TestXmlTipp;
import org.tipprunde.test.TrXmlTestBootstrap;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestXmlPointsMatch extends AbstractXmlPointsTest
{
	final static Logger logger = LoggerFactory.getLogger(TestXmlPointsMatch.class);
	
	@BeforeClass
	public static void initFiles()
	{
		fXml = new File(rootDir,"pointsMatch2.xml");
	}
    
    @Test
    public void testPlain() throws FileNotFoundException
    {
    	PointsMatch actual = create();
    	PointsMatch expected = (PointsMatch)JaxbUtil.loadJAXB(fXml.getAbsolutePath(), PointsMatch.class);
    	assertJaxbEquals(expected, actual);
    }
    
    private static PointsMatch create() {return create(true);}
    public static PointsMatch create(boolean withChilds)
    {
    	PointsMatch xml = new PointsMatch();
    	xml.setId(1);
    	xml.setScore(5);
    	
    	if(withChilds)
    	{
    		xml.setPointsRound(TestXmlPointsRound.create(false));
    		xml.getTipp().add(TestXmlTipp.createTipp(false));
    		xml.setScoreDetails(TestXmlScoreDetails.create(false));
    	}
    	return xml;
    }
    
    public void save() {save(create(), fXml);}
	
	public static void main(String[] args)
    {
		TrXmlTestBootstrap.init();	
			
		TestXmlPointsMatch.initFiles();	
		TestXmlPointsMatch test = new TestXmlPointsMatch();
		test.save();
    }
}