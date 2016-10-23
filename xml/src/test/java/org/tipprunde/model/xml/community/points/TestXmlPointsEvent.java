package org.tipprunde.model.xml.community.points;

import java.io.File;
import java.io.FileNotFoundException;

import net.sf.exlp.util.xml.JaxbUtil;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.tipprunde.model.xml.community.PointsEvent;
import org.tipprunde.model.xml.liga.TestXmlEvent;
import org.tipprunde.test.TrXmlTestBootstrap;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestXmlPointsEvent extends AbstractXmlPointsTest
{
	final static Logger logger = LoggerFactory.getLogger(TestXmlPointsEvent.class);
	
	@BeforeClass
	public static void initFiles()
	{
		fXml = new File(rootDir,"pointsEvent2.xml");
	}
    
    @Test
    public void test() throws FileNotFoundException
    {
    	PointsEvent actual = create();
    	PointsEvent expected = JaxbUtil.loadJAXB(fXml.getAbsolutePath(), PointsEvent.class);
    	assertJaxbEquals(expected, actual);
    }
    
    private static PointsEvent create() {return create(true);}
    public static PointsEvent create(boolean withChilds)
    {
    	PointsEvent xml = new PointsEvent();
    	xml.setId(1);
    	xml.setScore(5);
    	xml.setRank(2);
    	
    	if(withChilds)
    	{
    		xml.setEvent(TestXmlEvent.createEvent(false));
    		xml.getPointsRound().add(TestXmlPointsRound.create(false));
    	}
    	return xml;
    }
    
    public void save() {save(create(), fXml);}
	
	public static void main(String[] args)
    {
		TrXmlTestBootstrap.init();	
			
		TestXmlPointsEvent.initFiles();	
		TestXmlPointsEvent test = new TestXmlPointsEvent();
		test.save();
    }
}