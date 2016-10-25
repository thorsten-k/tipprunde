package org.tipprunde.model.xml.liga.match;

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
    	xml.setId(1);
    	xml.setName("myName");
    	xml.setName3("ABC");
    	xml.setNameLegal("myLegalName");
    	xml.setIcon("myIcon");
    	
    	if(withChilds)
    	{
        	xml.setDataSource(TestXmlDataSource.create(false));
        	xml.setType(createOpponentType());
    	}
    	return xml;
    }
    
    private static Opponent.Type createOpponentType()
    {
    	Opponent.Type xml = new Opponent.Type();
    	xml.setCode("myCode");
    	xml.setName("myName");
    	return xml;
    }
  
	public static void main(String[] args)
    {
		TrXmlTestBootstrap.init();	
		TestXmlOpponent test = new TestXmlOpponent();
		test.saveReferenceXml();
    }
}