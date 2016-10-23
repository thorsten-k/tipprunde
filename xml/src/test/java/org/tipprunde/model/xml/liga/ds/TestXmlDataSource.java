package org.tipprunde.model.xml.liga.ds;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Date;

import net.sf.exlp.util.DateUtil;
import net.sf.exlp.util.xml.JaxbUtil;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.tipprunde.model.xml.liga.DataSource;
import org.tipprunde.test.TrXmlTestBootstrap;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestXmlDataSource extends AbstractXmlLigaDsTest
{
	final static Logger logger = LoggerFactory.getLogger(TestXmlDataSource.class);
	
	@BeforeClass
	public static void initFiles()
	{
		fXml = new File(rootDir,"dataSource2.xml");
	}
    
    @Test
    public void testXml() throws FileNotFoundException
    {
    	DataSource actual = createDataSource();
    	DataSource expected = (DataSource)JaxbUtil.loadJAXB(fXml.getAbsolutePath(), DataSource.class);
    	assertJaxbEquals(expected, actual);
    }
    
    private static DataSource createDataSource() {return createDataSource(true);}
    public static DataSource createDataSource(boolean withChilds)
    {
    	Date dLast = DateUtil.getDateFromInt(2011, 11, 11, 11, 11, 11);
    	DataSource xml = new DataSource();
    	xml.setId(1);
    	xml.setLastChange(DateUtil.getXmlGc4D(dLast));
    	
    	if(withChilds)
    	{
        	xml.setUpdatePolicy(TestXmlUpdatePolicy.createUpdatePolicy(false));
        	xml.setOpenliga(TestXmlOpenliga.createOpenLiga(false));
    	}

    	return xml;
    }
    
    public void save() {save(createDataSource(), fXml);}
    	
	public static void main(String[] args)
    {
		TrXmlTestBootstrap.init();	
			
		TestXmlDataSource.initFiles();	
		TestXmlDataSource test = new TestXmlDataSource();
		test.save();
    }
}