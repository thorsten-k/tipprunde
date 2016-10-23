package org.tipprunde.model.xml.tr;

import org.tipprunde.test.TrXmlTestBootstrap;

public class TestXmlQuery extends AbstractXmlTgTest<Query>
{
	public TestXmlQuery(){super(Query.class);}
	public static Query create(boolean withChildren){return (new TestXmlQuery()).build(withChildren);}
    
    @Override public Query build(boolean withChilds)
    {
    	Query q = new Query();
    	q.setLang("de");
    	return q;
    }
	
	public static void main(String[] args)
    {
		TrXmlTestBootstrap.init();		
		TestXmlQuery test = new TestXmlQuery();
		test.saveReferenceXml();
    }
}