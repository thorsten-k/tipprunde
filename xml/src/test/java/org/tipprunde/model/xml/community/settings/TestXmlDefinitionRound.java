package org.tipprunde.model.xml.community.settings;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import net.sf.exlp.util.DateUtil;
import net.sf.exlp.util.xml.JaxbUtil;

import org.junit.BeforeClass;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.tipprunde.model.xml.community.DefinitionRound;
import org.tipprunde.model.xml.liga.TestXmlRound;
import org.tipprunde.test.TrXmlTestBootstrap;

public class TestXmlDefinitionRound extends AbstractXmlDefinitionTest
{
	final static Logger logger = LoggerFactory.getLogger(TestXmlDefinitionRound.class);
	
	@BeforeClass
	public static void initFiles()
	{
		fXml = new File(rootDir,"DefinitionRound.xml");
	}
    
    @Test
    public void plain() throws FileNotFoundException
    {
    	DefinitionRound actual = createDefinitionRound(true);
    	DefinitionRound expected = (DefinitionRound)JaxbUtil.loadJAXB(fXml.getAbsolutePath(), DefinitionRound.class);
    	assertJaxbEquals(expected, actual);
    }
    
    public static List<DefinitionRound> createRounds(boolean withChilds)
    {
    	List<DefinitionRound> list = new ArrayList<DefinitionRound>();
    	list.add(TestXmlDefinitionRound.createDefinitionRound(withChilds));
    	return list;
    }
    
    public static DefinitionRound createDefinitionRound(boolean withChilds)
    {
    	Date date = DateUtil.getDateFromInt(2011, 11, 11, 11, 11, 11);
    	
    	
    	DefinitionRound xml = new DefinitionRound();
    	xml.setId(1);
    	xml.setDeadline(DateUtil.getXmlGc4D(date));
    	
    	if(withChilds)
    	{
    		xml.setRound(TestXmlRound.createRound(false));
    		xml.setDefinitionEvent(TestXmlDefinitionEvent.createDefinitionEvent(false));
    	}
    	return xml;
    }
    
    public void save() {save(createDefinitionRound(true), fXml);}
	
	public static void main(String[] args)
    {
		TrXmlTestBootstrap.init();	
			
		TestXmlDefinitionRound.initFiles();	
		TestXmlDefinitionRound test = new TestXmlDefinitionRound();
		test.save();
    }
}