package org.tipprunde.model.xml.liga.match;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.tipprunde.model.xml.liga.Right;
import org.tipprunde.test.TrXmlTestBootstrap;

public class TestXmlRight extends AbstractXmlMatchTest<Right>
{
	final static Logger logger = LoggerFactory.getLogger(TestXmlRight.class);
	
	public TestXmlRight(){super(Right.class);}
	public static Right create(boolean withChilds){return (new TestXmlRight()).build(withChilds);}

    public Right build(boolean withChilds)
    {
    	Right xml = new Right();
    	
    	if(withChilds)
    	{
    		xml.setOpponent(TestXmlOpponent.create(false));
    	}
    	return xml;
    }

	public static void main(String[] args)
    {
		TrXmlTestBootstrap.init();	
		TestXmlRight test = new TestXmlRight();
		test.saveReferenceXml();
    }
}