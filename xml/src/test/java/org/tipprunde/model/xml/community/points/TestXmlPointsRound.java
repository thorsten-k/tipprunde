package org.tipprunde.model.xml.community.points;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.tipprunde.model.xml.community.PointsRound;
import org.tipprunde.model.xml.liga.TestXmlRound;
import org.tipprunde.test.TrXmlTestBootstrap;

public class TestXmlPointsRound extends AbstractXmlPointsTest<PointsRound>
{
	final static Logger logger = LoggerFactory.getLogger(TestXmlPointsRound.class);
	
	public TestXmlPointsRound(){super(PointsRound.class);}
	public static PointsRound create(boolean withChildren){return (new TestXmlPointsRound()).build(withChildren);}
    
    public PointsRound build(boolean withChilds)
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
    
	public static void main(String[] args)
    {
		TrXmlTestBootstrap.init();	
		TestXmlPointsRound test = new TestXmlPointsRound();
		test.saveReferenceXml();
    }
}