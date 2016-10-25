package org.tipprunde.model.xml.liga.match;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.tipprunde.model.xml.liga.Result;
import org.tipprunde.test.TrXmlTestBootstrap;

public class TestXmlResult extends AbstractXmlMatchTest<Result>
{
	final static Logger logger = LoggerFactory.getLogger(TestXmlResult.class);

	public TestXmlResult(){super(Result.class);}
	public static Result create(boolean withChildren){return (new TestXmlResult()).build(withChildren);}
        
    public Result build(boolean withChilds)
    {
    	Result xml = new Result();
    	xml.setId(1);
    	xml.setScoreLeft(1);
    	xml.setScoreRight(1);
    	
    	return xml;
    }
   
	public static void main(String[] args)
    {
		TrXmlTestBootstrap.init();	
		TestXmlResult test = new TestXmlResult();
		test.saveReferenceXml();
    }
}