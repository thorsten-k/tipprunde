package org.tipprunde.model.xml.community.points;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.tipprunde.model.xml.community.ScoreDetails;
import org.tipprunde.test.TrXmlTestBootstrap;

public class TestXmlScoreDetails extends AbstractXmlPointsTest<ScoreDetails>
{
	final static Logger logger = LoggerFactory.getLogger(TestXmlScoreDetails.class);
	
	public TestXmlScoreDetails(){super(ScoreDetails.class);}
	public static ScoreDetails create(boolean withChildren){return (new TestXmlScoreDetails()).build(withChildren);}
    
    @Override public ScoreDetails build(boolean withChilds)
    {
    	ScoreDetails xml = new ScoreDetails();
    	xml.setExcact(true);
    	xml.setDifference(true);
    	xml.setTendence(true);
    	
    	return xml;
    }

	public static void main(String[] args)
    {
		TrXmlTestBootstrap.init();		
		TestXmlScoreDetails test = new TestXmlScoreDetails();
		test.saveReferenceXml();
    }
}