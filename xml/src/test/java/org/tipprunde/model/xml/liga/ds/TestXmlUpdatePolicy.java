package org.tipprunde.model.xml.liga.ds;

import java.time.LocalDateTime;

import org.exlp.util.system.DateUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.tipprunde.model.xml.liga.UpdatePolicy;
import org.tipprunde.test.TrXmlTestBootstrap;

public class TestXmlUpdatePolicy extends AbstractXmlLigaDsTest<UpdatePolicy>
{
	final static Logger logger = LoggerFactory.getLogger(TestXmlUpdatePolicy.class);
	
	public TestXmlUpdatePolicy(){super(UpdatePolicy.class);}
	public static UpdatePolicy create(boolean withChildren){return (new TestXmlUpdatePolicy()).build(withChildren);}
    
    public UpdatePolicy build(boolean withChilds)
    {
    	LocalDateTime dLast = LocalDateTime.of(2011,11,11,11,11,11);
    	LocalDateTime dNext = LocalDateTime.of(2012,12,12,12,12,12);
    	LocalDateTime dQueue = LocalDateTime.of(2010,10,10,10,10,10);
    	
    	UpdatePolicy p = new UpdatePolicy();
    	p.setId(1);
    	p.setUpdateLast(DateUtil.toXmlGc(dLast));
    	p.setUpdateNext(DateUtil.toXmlGc(dNext));
    	p.setUpdateQueue(DateUtil.toXmlGc(dQueue));
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