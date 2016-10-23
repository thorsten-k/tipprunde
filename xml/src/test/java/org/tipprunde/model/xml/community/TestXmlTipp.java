package org.tipprunde.model.xml.community;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Date;

import net.sf.ahtutils.xml.status.Status;
import net.sf.exlp.util.DateUtil;
import net.sf.exlp.util.xml.JaxbUtil;

import org.junit.BeforeClass;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.tipprunde.model.xml.liga.match.TestXmlMatch;
import org.tipprunde.model.xml.user.identity.TestXmlIdentity;
import org.tipprunde.test.TrXmlTestBootstrap;

public class TestXmlTipp extends AbstractXmlCommunityTest
{
	final static Logger logger = LoggerFactory.getLogger(TestXmlTipp.class);
	
	@BeforeClass
	public static void initFiles()
	{
		fXml = new File(rootDir,"tipp2.xml");
	}
    
    @Test
    public void testXml() throws FileNotFoundException
    {
    	Tipp actual = createTipp(true);
    	Tipp expected = JaxbUtil.loadJAXB(fXml.getAbsolutePath(), Tipp.class);
    	assertJaxbEquals(expected, actual);
    }
    
    private static Tipp createTipp(){return createTipp(true);}
    public static Tipp createTipp(boolean withChilds)
    {
    	Date d = DateUtil.getDateFromInt(2012, 2, 23, 12, 42, 12);
    	Tipp xml = new Tipp();
    	xml.setId(1);
    	xml.setLeft(2);
    	xml.setLeft(1);
    	xml.setRecord(DateUtil.getXmlGc4D(d));
    	xml.setDeadline(DateUtil.getXmlGc4D(d));
    	xml.setSync("sync");
    	xml.setStatus(new Status());
    	
    	if(withChilds)
    	{
    		xml.setMatch(TestXmlMatch.create(false));
    		xml.setIdentity(TestXmlIdentity.create(false));
    	}
    	return xml;
    }
    
    public void save() {save(createTipp(), fXml);}
	
	public static void main(String[] args)
    {
		TrXmlTestBootstrap.init();	
			
		TestXmlTipp.initFiles();	
		TestXmlTipp test = new TestXmlTipp();
		test.save();
    }
}