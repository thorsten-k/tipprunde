package org.tipprunde.model.xml.liga.ds;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.tipprunde.model.xml.liga.UpdatePolicy;
import org.tipprunde.test.TrXmlTestBootstrap;

import net.sf.exlp.util.DateUtil;

public class TestXmlUpdatePolicy extends AbstractXmlLigaDsTest<UpdatePolicy>
{
	final static Logger logger = LoggerFactory.getLogger(TestXmlUpdatePolicy.class);
	
	public TestXmlUpdatePolicy(){super(UpdatePolicy.class);}
	public static UpdatePolicy create(boolean withChildren){return (new TestXmlUpdatePolicy()).build(withChildren);}
    
    public UpdatePolicy build(boolean withChilds)
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
	 
	public static void main(String[] args)
    {
		TrXmlTestBootstrap.init();	
		TestXmlUpdatePolicy test = new TestXmlUpdatePolicy();
		test.saveReferenceXml();
    }
}