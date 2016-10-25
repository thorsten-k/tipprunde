package org.tipprunde.model.xml.community.points;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.tipprunde.model.xml.community.PointsEvent;
import org.tipprunde.model.xml.liga.TestXmlEvent;
import org.tipprunde.test.TrXmlTestBootstrap;

public class TestXmlPointsEvent extends AbstractXmlPointsTest<PointsEvent>
{
	final static Logger logger = LoggerFactory.getLogger(TestXmlPointsEvent.class);
	
	public TestXmlPointsEvent(){super(PointsEvent.class);}
	public static PointsEvent create(boolean withChildren){return (new TestXmlPointsEvent()).build(withChildren);}
    
    public PointsEvent build(boolean withChilds)
    {
    	PointsEvent xml = new PointsEvent();
    	xml.setId(1);
    	xml.setScore(5);
    	xml.setRank(2);
    	
    	if(withChilds)
    	{
    		xml.setEvent(TestXmlEvent.create(false));
    		xml.getPointsRound().add(TestXmlPointsRound.create(false));
    	}
    	return xml;
    }
    
	public static void main(String[] args)
    {
		TrXmlTestBootstrap.init();		
		TestXmlPointsEvent test = new TestXmlPointsEvent();
		test.saveReferenceXml();
    }
}