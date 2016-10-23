package org.tipprunde.model.xml.liga;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.tipprunde.test.TrXmlTestBootstrap;

public class TestXmlVisible extends AbstractXmlLigaTest<Visible>
{
	final static Logger logger = LoggerFactory.getLogger(TestXmlVisible.class);
	
	public TestXmlVisible(){super(Visible.class);}
	public static Visible create(boolean withChildren){return (new TestXmlVisible()).build(withChildren);}
    
    public Visible build(boolean withChilds)
    {
    	Visible v = new Visible();
    	v.setId(1);
    	v.setName("Test Community");
    	v.setCode("visible");
    	return v;
    }
	
	public static void main(String[] args)
    {
		TrXmlTestBootstrap.init();
		TestXmlVisible test = new TestXmlVisible();
		test.saveReferenceXml();
    }
}