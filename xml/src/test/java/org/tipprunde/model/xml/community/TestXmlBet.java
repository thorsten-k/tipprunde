package org.tipprunde.model.xml.community;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Date;

import net.sf.exlp.util.DateUtil;
import net.sf.exlp.util.xml.JaxbUtil;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.tipprunde.test.TrXmlTestBootstrap;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestXmlBet extends AbstractXmlCommunityTest
{
	final static Logger logger = LoggerFactory.getLogger(TestXmlBet.class);
	
	@BeforeClass
	public static void initFiles()
	{
		fXml = new File(rootDir,"bet2.xml");
	}
    
	@Test
    public void testXml() throws FileNotFoundException
    {
    	Bet actual = create(true);
    	Bet expected = JaxbUtil.loadJAXB(fXml.getAbsolutePath(), Bet.class);
    	assertJaxbEquals(expected, actual);
    }
    
    public static Bet create(boolean withChilds)
    {
    	Date d = DateUtil.getDateFromInt(2012, 2, 23, 12, 42, 12);
    	
    	Bet xml = new Bet();
    	xml.setId(1);
    	xml.setAmount(25);
    	xml.setRecord(DateUtil.getXmlGc4D(d));
    	
    	if(withChilds)
    	{
    		xml.setParticipant(TestXmlParticipant.create(false));
    	}
    	
    	return xml;
    }
    
    public void save(){save(create(true), fXml);}
	
	public static void main(String[] args)
    {
		TrXmlTestBootstrap.init();	
			
		TestXmlBet.initFiles();	
		TestXmlBet test = new TestXmlBet();
		test.save();
    }
}