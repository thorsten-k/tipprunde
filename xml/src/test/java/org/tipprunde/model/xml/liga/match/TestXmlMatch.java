package org.tipprunde.model.xml.liga.match;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.tipprunde.model.xml.liga.Match;
import org.tipprunde.model.xml.liga.TestXmlRounds;
import org.tipprunde.model.xml.liga.ds.TestXmlDataSource;
import org.tipprunde.test.TrXmlTestBootstrap;

import net.sf.exlp.util.DateUtil;

public class TestXmlMatch extends AbstractXmlMatchTest<Match>
{
	final static Logger logger = LoggerFactory.getLogger(TestXmlMatch.class);
	
	public TestXmlMatch(){super(Match.class);}
	public static Match create(boolean withChildren){return (new TestXmlMatch()).build(withChildren);}
    
    public Match build(boolean withChilds)
    {
    	Date date = DateUtil.getDateFromInt(2011, 11, 11, 11, 11, 11);
    	Match xml = new Match();
    	xml.setId(1);
    	xml.setFinished(true);
    	xml.setOngoing(false);
    	xml.setKickOff(DateUtil.getXmlGc4D(date));
    	
    	if(withChilds)
    	{
    		xml.setLeft(TestXmlLeft.create(false));
    		xml.setRight(TestXmlRight.create(false));
    		xml.setResult(TestXmlResult.create(false));
    		xml.setLocation(TestXmlLocation.create(false));
    		xml.setDataSource(TestXmlDataSource.createDataSource(false));
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