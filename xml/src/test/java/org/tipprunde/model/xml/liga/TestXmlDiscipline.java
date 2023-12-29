package org.tipprunde.model.xml.liga;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.tipprunde.model.xml.liga.ds.TestXmlDataSource;
import org.tipprunde.test.TrXmlTestBootstrap;

public class TestXmlDiscipline extends AbstractXmlLigaTest<Discipline>
{
	final static Logger logger = LoggerFactory.getLogger(TestXmlDiscipline.class);
	
	public TestXmlDiscipline(){super(Discipline.class);}
	public static Discipline create(boolean withChildren){return (new TestXmlDiscipline()).build(withChildren);}
    
    public Discipline build(boolean withChilds)
    {
    	Discipline xml = new Discipline();
    	xml.setId(1l);
    	xml.setName("Test Community");
    	
    	if(withChilds)
    	{
    		xml.setEvents(TestXmlEvents.create(false));
    		xml.setVisible(TestXmlVisible.create(false));
    		xml.setDataSource(TestXmlDataSource.create(false));
    	}
    	return xml;
    }
	
	public static void main(String[] args)
    {
		TrXmlTestBootstrap.init();	
		TestXmlDiscipline test = new TestXmlDiscipline();
		test.saveReferenceXml();
    }
}