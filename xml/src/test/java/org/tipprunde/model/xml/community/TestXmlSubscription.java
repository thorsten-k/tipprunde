package org.tipprunde.model.xml.community;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Date;

import org.junit.BeforeClass;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.tipprunde.test.TrXmlTestBootstrap;

import net.sf.exlp.util.DateUtil;
import net.sf.exlp.util.xml.JaxbUtil;

public class TestXmlSubscription extends AbstractXmlCommunityTest
{
	final static Logger logger = LoggerFactory.getLogger(TestXmlSubscription.class);
		
	@BeforeClass
	public static void initFiles()
	{
		fXml = new File(rootDir,"subscription2.xml");
	}
    
    @Test
    public void testPlain() throws FileNotFoundException
    {
    	Subscription actual = createSubscription();
    	Subscription expected = (Subscription)JaxbUtil.loadJAXB(fXml.getAbsolutePath(), Subscription.class);
    	assertJaxbEquals(expected, actual);
    }
    
    private static Subscription createSubscription() {return createSubscription(true);}
    public static Subscription createSubscription(boolean withChilds)
    {
    	Date d = DateUtil.getDateFromInt(2011, 11, 11);
    	
    	Subscription subs = new Subscription();
    	subs.setId(1);
    	subs.setDeadline(DateUtil.getXmlGc4D(d));
    	
    	Subscription.Type type = new Subscription.Type();
    	type.setCode("auto");
    	type.setName("Automatisch");
    	subs.setType(type);    	
    	
    	return subs;
    }
    
    public void save() {save(createSubscription(), fXml);}
	
	public static void main(String[] args)
    {
		TrXmlTestBootstrap.init();	
			
		TestXmlSubscription.initFiles();	
		TestXmlSubscription test = new TestXmlSubscription();
		test.save();
    }
}