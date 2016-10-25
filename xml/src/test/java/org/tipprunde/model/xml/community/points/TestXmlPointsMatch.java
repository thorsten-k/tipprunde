package org.tipprunde.model.xml.community.points;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.tipprunde.model.xml.community.PointsMatch;
import org.tipprunde.model.xml.community.TestXmlTipp;
import org.tipprunde.test.TrXmlTestBootstrap;

public class TestXmlPointsMatch extends AbstractXmlPointsTest<PointsMatch>
{
	final static Logger logger = LoggerFactory.getLogger(TestXmlPointsMatch.class);
	
	public TestXmlPointsMatch(){super(PointsMatch.class);}
	public static PointsMatch create(boolean withChildren){return (new TestXmlPointsMatch()).build(withChildren);}
    
    public PointsMatch build(boolean withChilds)
    {
    	PointsMatch xml = new PointsMatch();
    	xml.setId(1);
    	xml.setScore(5);
    	
    	if(withChilds)
    	{
    		xml.setPointsRound(TestXmlPointsRound.create(false));
    		xml.getTipp().add(TestXmlTipp.create(false));
    		xml.setScoreDetails(TestXmlScoreDetails.create(false));
    	}
    	return xml;
    }
	
	public static void main(String[] args)
    {
		TrXmlTestBootstrap.init();	
		TestXmlPointsMatch test = new TestXmlPointsMatch();
		test.saveReferenceXml();
    }
}