package org.tipprunde.model.xml.community;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.tipprunde.test.TrXmlTestBootstrap;

import net.sf.exlp.util.DateUtil;

public class TestXmlSubscription extends AbstractXmlCommunityTest<Subscription>
{
	final static Logger logger = LoggerFactory.getLogger(TestXmlSubscription.class);

	public TestXmlSubscription(){super(Subscription.class);}
	public static Subscription create(boolean withChildren){return (new TestXmlSubscription()).build(withChildren);}
	
    public Subscription build(boolean withChilds)
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
	
	public static void main(String[] args)
    {
		TrXmlTestBootstrap.init();	
		TestXmlSubscription test = new TestXmlSubscription();
		test.saveReferenceXml();
    }
}