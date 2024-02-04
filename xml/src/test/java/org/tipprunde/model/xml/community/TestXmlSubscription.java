package org.tipprunde.model.xml.community;

import java.time.LocalDate;

import org.exlp.util.system.DateUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.tipprunde.test.TrXmlTestBootstrap;

public class TestXmlSubscription extends AbstractXmlCommunityTest<Subscription>
{
	final static Logger logger = LoggerFactory.getLogger(TestXmlSubscription.class);

	public TestXmlSubscription(){super(Subscription.class);}
	public static Subscription create(boolean withChildren){return (new TestXmlSubscription()).build(withChildren);}
	
    public Subscription build(boolean withChilds)
    {
    	LocalDate d = LocalDate.of(2011,11,11);
    	
    	Subscription subs = new Subscription();
    	subs.setId(1);
    	subs.setDeadline(DateUtil.toXmlGc(d));
    	
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