package org.tipprunde.model.xml.liga.match;

import java.io.File;
import java.io.FileNotFoundException;

import net.sf.exlp.util.xml.JaxbUtil;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.tipprunde.model.xml.liga.Opponent;
import org.tipprunde.model.xml.liga.ds.TestXmlDataSource;
import org.tipprunde.test.TrXmlTestBootstrap;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestXmlOpponent extends AbstractXmlMatchTest
{
	final static Logger logger = LoggerFactory.getLogger(TestXmlOpponent.class);
	
	@BeforeClass
	public static void initFiles()
	{
		fXml = new File(rootDir,"opponent2.xml");
	}
    
    @Test
    public void testXml() throws FileNotFoundException
    {
    	Opponent actual = create(true);
    	Opponent expected = JaxbUtil.loadJAXB(fXml.getAbsolutePath(), Opponent.class);
    	assertJaxbEquals(expected, actual);
    }
    
    public static Opponent create(boolean withChilds)
    {
    	Opponent xml = new Opponent();
    	xml.setId(1);
    	xml.setName("myName");
    	xml.setName3("ABC");
    	xml.setNameLegal("myLegalName");
    	xml.setIcon("myIcon");
    	
    	if(withChilds)
    	{
        	xml.setDataSource(TestXmlDataSource.createDataSource(false));
        	xml.setType(createOpponentType());
    	}

    	return xml;
    }
    
    public static Opponent.Type createOpponentType()
    {
    	Opponent.Type xml = new Opponent.Type();
    	xml.setCode("myCode");
    	xml.setName("myName");
    	return xml;
    }
    
    public void save() {save(create(true), fXml);}
   
	public static void main(String[] args)
    {
		TrXmlTestBootstrap.init();	
			
		TestXmlOpponent.initFiles();	
		TestXmlOpponent test = new TestXmlOpponent();
		test.save();
    }
}