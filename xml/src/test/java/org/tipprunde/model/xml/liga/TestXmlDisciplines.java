package org.tipprunde.model.xml.liga;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.tipprunde.test.TrXmlTestBootstrap;

public class TestXmlDisciplines extends AbstractXmlLigaTest<Disciplines>
{
	final static Logger logger = LoggerFactory.getLogger(TestXmlDisciplines.class);
	
	public TestXmlDisciplines(){super(Disciplines.class);}
	public static Disciplines create(boolean withChildren){return (new TestXmlDisciplines()).build(withChildren);}
    
    public Disciplines build(boolean withChilds)
    {
    	Disciplines xml = new Disciplines();
    	if(withChilds)
    	{
    		xml.getDiscipline().add(TestXmlDiscipline.create(false));
    		xml.getDiscipline().add(TestXmlDiscipline.create(false));
    	}
    	return xml;
    }
	
	public static void main(String[] args)
    {
		TrXmlTestBootstrap.init();	
		TestXmlDisciplines test = new TestXmlDisciplines();
		test.saveReferenceXml();
    }
}