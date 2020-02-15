package org.tipprunde.model.xml.community;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.tipprunde.test.TrXmlTestBootstrap;

public class TestXmlBet extends AbstractXmlCommunityTest<Bet>
{
	final static Logger logger = LoggerFactory.getLogger(TestXmlBet.class);
	
	public TestXmlBet(){super(Bet.class);}
	public static Bet create(boolean withChildren){return (new TestXmlBet()).build(withChildren);}
    
    public Bet build(boolean withChilds)
    {
    	Bet xml = new Bet();
    	xml.setId(1);
    	xml.setCarryover(15);
    	xml.setFee(50);
    	xml.setPaid(25);
    	xml.setWin(10);
    	xml.setOut(5);
    	xml.setBalance(15);

    	xml.setRecord(AbstractXmlCommunityTest.getDefaultXmlDate());
    	
    	if(withChilds)
    	{
    		xml.setParticipant(TestXmlParticipant.create(false));
    	}
    	
    	return xml;
    }

	public static void main(String[] args)
    {
		TrXmlTestBootstrap.init();	
		TestXmlBet test = new TestXmlBet();
		test.saveReferenceXml();
    }
}