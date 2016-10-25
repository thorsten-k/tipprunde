package org.tipprunde.model.xml.community;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.tipprunde.test.TrXmlTestBootstrap;

public class TestXmlDeadlinePolicy extends AbstractXmlCommunityTest<DeadlinePolicy>
{
	final static Logger logger = LoggerFactory.getLogger(TestXmlDeadlinePolicy.class);

	public TestXmlDeadlinePolicy(){super(DeadlinePolicy.class);}
	public static DeadlinePolicy create(boolean withChildren){return (new TestXmlDeadlinePolicy()).build(withChildren);}
    
	public DeadlinePolicy build(boolean withChilds)
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
  
	public static void main(String[] args)
    {
		TrXmlTestBootstrap.init();
		TestXmlDeadlinePolicy test = new TestXmlDeadlinePolicy();
		test.saveReferenceXml();
    }
}