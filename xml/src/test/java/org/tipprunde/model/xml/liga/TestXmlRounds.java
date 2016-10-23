package org.tipprunde.model.xml.liga;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.tipprunde.test.TrXmlTestBootstrap;

public class TestXmlRounds extends AbstractXmlLigaTest<Rounds>
{
	final static Logger logger = LoggerFactory.getLogger(TestXmlRounds.class);

	public TestXmlRounds(){super(Rounds.class);}
	public static Rounds create(boolean withChildren){return (new TestXmlRounds()).build(withChildren);}
    
    public Rounds build(boolean withChilds)
    {
    	Rounds xml = new Rounds();
    	
    	if(withChilds)
    	{
    		xml.getRound().add(TestXmlRound.create(withChilds));
    	}
    	return xml;
    }
   
	public static void main(String[] args)
    {
		TrXmlTestBootstrap.init();	
		TestXmlRounds test = new TestXmlRounds();
		test.saveReferenceXml();
    }
}