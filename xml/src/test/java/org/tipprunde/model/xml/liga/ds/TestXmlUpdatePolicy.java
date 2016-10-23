package org.tipprunde.model.xml.liga.ds;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Date;

import net.sf.exlp.util.DateUtil;
import net.sf.exlp.util.xml.JaxbUtil;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.tipprunde.model.xml.liga.UpdatePolicy;
import org.tipprunde.test.TrXmlTestBootstrap;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestXmlUpdatePolicy extends AbstractXmlLigaDsTest
{
	final static Logger logger = LoggerFactory.getLogger(TestXmlUpdatePolicy.class);
	
	@BeforeClass
	public static void initFiles()
	{
		fXml = new File(rootDir,"updatePolicy2.xml");
	}
    
    @Test
    public void testPlain() throws FileNotFoundException
    {
    	UpdatePolicy actual = createUpdatePolicy();
    	UpdatePolicy expected = (UpdatePolicy)JaxbUtil.loadJAXB(fXml.getAbsolutePath(), UpdatePolicy.class);
    	assertJaxbEquals(expected, actual);
    }
    
    private static UpdatePolicy createUpdatePolicy() {return createUpdatePolicy(true);}
    public static UpdatePolicy createUpdatePolicy(boolean withChilds)
    {
    	Date dLast = DateUtil.getDateFromInt(2011, 11, 11, 11, 11, 11);
    	Date dNext = DateUtil.getDateFromInt(2012, 12, 12, 12, 12, 12);
    	Date dQueue = DateUtil.getDateFromInt(2010, 10, 10, 10, 10, 10);
    	
    	UpdatePolicy p = new UpdatePolicy();
    	p.setId(1);
    	p.setUpdateLast(DateUtil.getXmlGc4D(dLast));
    	p.setUpdateNext(DateUtil.getXmlGc4D(dNext));
    	p.setUpdateQueue(DateUtil.getXmlGc4D(dQueue));
    	p.setType("once");
    	return p;
    }
	
    public void save() {save(createUpdatePolicy(), fXml);}
    
	public static void main(String[] args)
    {
		TrXmlTestBootstrap.init();	
			
		TestXmlUpdatePolicy.initFiles();	
		TestXmlUpdatePolicy test = new TestXmlUpdatePolicy();
		test.save();
    }
}