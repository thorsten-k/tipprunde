package org.tipprunde.model.xml.liga.match;

import org.jeesl.model.xml.io.locale.status.Type;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.tipprunde.model.xml.liga.Opponent;
import org.tipprunde.model.xml.liga.ds.TestXmlDataSource;
import org.tipprunde.test.TrXmlTestBootstrap;

public class TestXmlOpponent extends AbstractXmlMatchTest<Opponent>
{
	final static Logger logger = LoggerFactory.getLogger(TestXmlOpponent.class);
	
	public TestXmlOpponent(){super(Opponent.class);}
	public static Opponent create(boolean withChildren){return (new TestXmlOpponent()).build(withChildren);}
    
    public Opponent build(boolean withChilds)
    {
    	Opponent xml = new Opponent();
    	xml.setId(1l);
    	xml.setName("myName");
    	xml.setName3("ABC");
    	xml.setNameLegal("myLegalName");
    	xml.setIcon("myIcon");
    	
    	if(withChilds)
    	{
        	xml.setDataSource(TestXmlDataSource.create(false));
        	xml.setType(new Type());
    	}
    	return xml;
    }
  
	public static void main(String[] args)
    {
		TrXmlTestBootstrap.init();	
		TestXmlOpponent test = new TestXmlOpponent();
		test.saveReferenceXml();
    }
}