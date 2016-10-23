package org.tipprunde.model.xml.community;

import java.io.File;
import java.io.FileNotFoundException;

import org.junit.BeforeClass;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.tipprunde.test.TrXmlTestBootstrap;

import net.sf.exlp.util.xml.JaxbUtil;

public class TestXmlDeadlinePolicy extends AbstractXmlCommunityTest
{
	final static Logger logger = LoggerFactory.getLogger(TestXmlDeadlinePolicy.class);

	@BeforeClass
	public static void initFiles()
	{
		fXml = new File(rootDir,"deadlinePolicy2.xml");
	}
    
    @Test
    public void testPlain() throws FileNotFoundException
    {
    	DeadlinePolicy actual = createDeadlinePolicy();
    	DeadlinePolicy expected = (DeadlinePolicy)JaxbUtil.loadJAXB(fXml.getAbsolutePath(), DeadlinePolicy.class);
    	assertJaxbEquals(expected, actual);
    }
    
    private static DeadlinePolicy createDeadlinePolicy() {return createDeadlinePolicy(true);}
    public static DeadlinePolicy createDeadlinePolicy(boolean withChilds)
    {
    	DeadlinePolicy xml = new DeadlinePolicy();
    	xml.setId(1);
    	xml.setMinutes(30);
    	xml.setHours(5);
    	xml.setDays(2);
    	xml.setWeeks(1);
    	xml.setType(createDeadlinePolicyType());
    	return xml;
    }
    
    public static DeadlinePolicy.Type createDeadlinePolicyType()
    {
    	DeadlinePolicy.Type xml = new DeadlinePolicy.Type();
    	xml.setCode("individual");
    	xml.setName("XX");
    	return xml;
    }
    
    public void save() {save(createDeadlinePolicy(), fXml);}
    
	public static void main(String[] args)
    {
		TrXmlTestBootstrap.init();
			
		TestXmlDeadlinePolicy.initFiles();	
		TestXmlDeadlinePolicy test = new TestXmlDeadlinePolicy();
		test.save();
    }
}