package org.tipprunde.model.xml.liga.match;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.tipprunde.model.xml.liga.Left;
import org.tipprunde.test.TrXmlTestBootstrap;

public class TestXmlLeft extends AbstractXmlMatchTest<Left>
{
	final static Logger logger = LoggerFactory.getLogger(TestXmlLeft.class);
	
	public TestXmlLeft(){super(Left.class);}
	public static Left create(boolean withChildren){return (new TestXmlLeft()).build(withChildren);}
        
    public Left build(boolean withChilds)
    {
    	Left xml = new Left();
    	
    	if(withChilds)
    	{
    		xml.setOpponent(TestXmlOpponent.create(false));
    	}
    	return xml;
    }
   
	public static void main(String[] args)
    {
		TrXmlTestBootstrap.init();	
		TestXmlLeft test = new TestXmlLeft();
		test.saveReferenceXml();
    }
}