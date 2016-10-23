package org.tipprunde.model.xml.liga.match;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Date;

import net.sf.exlp.util.DateUtil;
import net.sf.exlp.util.xml.JaxbUtil;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.tipprunde.model.xml.liga.Match;
import org.tipprunde.model.xml.liga.TestXmlRound;
import org.tipprunde.model.xml.liga.ds.TestXmlDataSource;
import org.tipprunde.test.TrXmlTestBootstrap;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestXmlMatch extends AbstractXmlMatchTest
{
	final static Logger logger = LoggerFactory.getLogger(TestXmlMatch.class);
	
	@BeforeClass
	public static void initFiles()
	{
		fXml = new File(rootDir,"match2.xml");
	}
    
    @Test
    public void testPlain() throws FileNotFoundException
    {
    	Match actual = create(true);
    	Match expected = JaxbUtil.loadJAXB(fXml.getAbsolutePath(), Match.class);
    	assertJaxbEquals(expected, actual);
    }
    
    public static Match create(boolean withChilds)
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
    		xml.setResult(TestXmlResult.createResult(false));
    		xml.setLocation(TestXmlLocation.createLocation(false));
    		xml.setDataSource(TestXmlDataSource.createDataSource(false));
    		xml.setRounds(TestXmlRound.createRounds(false));
    	}
    	return xml;
    }
    
    public void save() {save(create(true), fXml);}
   
	public static void main(String[] args)
    {
		TrXmlTestBootstrap.init();	
			
		TestXmlMatch.initFiles();	
		TestXmlMatch test = new TestXmlMatch();
		test.save();
    }
}