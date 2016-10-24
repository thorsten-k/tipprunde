package org.tipprunde.model.xml.community.points;

import java.io.File;
import java.io.FileNotFoundException;

import net.sf.exlp.util.xml.JaxbUtil;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.tipprunde.model.xml.community.PointsRound;
import org.tipprunde.model.xml.liga.TestXmlRound;
import org.tipprunde.test.TrXmlTestBootstrap;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestXmlPointsRound extends AbstractXmlPointsTest
{
	final static Logger logger = LoggerFactory.getLogger(TestXmlPointsRound.class);
	
	@BeforeClass
	public static void initFiles()
	{
		fXml = new File(rootDir,"pointsRound2.xml");
	}
    
    @Test
    public void testPlain() throws FileNotFoundException
    {
    	PointsRound actual = create();
    	PointsRound expected = JaxbUtil.loadJAXB(fXml.getAbsolutePath(), PointsRound.class);
    	assertJaxbEquals(expected, actual);
    }
    
    private static PointsRound create() {return create(true);}
    public static PointsRound create(boolean withChilds)
    {
    	PointsRound xml = new PointsRound();
    	xml.setId(1);
    	xml.setScore(5);
    	xml.setRank(2);
    	
    	if(withChilds)
    	{
    		xml.setRound(TestXmlRound.create(false));
    		xml.getPointsMatch().add(TestXmlPointsMatch.create(false));
    		xml.setPointsEvent(TestXmlPointsEvent.create(false));
    	}
    	return xml;
    }
    
    public void save() {save(create(), fXml);}
	
	public static void main(String[] args)
    {
		TrXmlTestBootstrap.init();	
			
		TestXmlPointsRound.initFiles();	
		TestXmlPointsRound test = new TestXmlPointsRound();
		test.save();
    }
}