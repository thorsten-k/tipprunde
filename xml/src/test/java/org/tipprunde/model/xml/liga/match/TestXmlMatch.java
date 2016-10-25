package org.tipprunde.model.xml.liga.match;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.tipprunde.model.xml.liga.Match;
import org.tipprunde.model.xml.liga.TestXmlRounds;
import org.tipprunde.model.xml.liga.ds.TestXmlDataSource;
import org.tipprunde.test.TrXmlTestBootstrap;

public class TestXmlMatch extends AbstractXmlMatchTest<Match>
{
	final static Logger logger = LoggerFactory.getLogger(TestXmlMatch.class);
	
	public TestXmlMatch(){super(Match.class);}
	public static Match create(boolean withChildren){return (new TestXmlMatch()).build(withChildren);}
    
    public Match build(boolean withChilds)
    {
    	Match xml = new Match();
    	xml.setId(1);
    	xml.setFinished(true);
    	xml.setOngoing(false);
    	xml.setKickOff(AbstractXmlMatchTest.getDefaultXmlDate());
    	
    	if(withChilds)
    	{
    		xml.setLeft(TestXmlLeft.create(false));
    		xml.setRight(TestXmlRight.create(false));
    		xml.setResult(TestXmlResult.create(false));
    		xml.setLocation(TestXmlLocation.create(false));
    		xml.setDataSource(TestXmlDataSource.create(false));
    		xml.setRounds(TestXmlRounds.create(false));
    	}
    	return xml;
    }
    
	public static void main(String[] args)
    {
		TrXmlTestBootstrap.init();	
		TestXmlMatch test = new TestXmlMatch();
		test.saveReferenceXml();
    }
}