package org.tipprunde.model.xml;

import org.jeesl.model.xml.JeeslNsPrefixMapper;

public class TrNsPrefixMapper //extends NamespacePrefixMapper implements NsPrefixMapperInterface
{
	private JeeslNsPrefixMapper npmJeesl;
	
	public TrNsPrefixMapper()
	{
		npmJeesl = new JeeslNsPrefixMapper();
	}
	
    public String getPreferredPrefix(String namespaceUri, String suggestion, boolean requirePrefix)
    {
    	if("http://www.tipprunde.org".equals(namespaceUri) ){return "tr";}
    	if("http://www.tipprunde.org/community".equals(namespaceUri) ){return "c";}
    	if("http://www.tipprunde.org/liga".equals(namespaceUri) ){return "l";}
    	if("http://www.tipprunde.org/liga/datasource".equals(namespaceUri) ){return "ds";}
    	if("http://www.tipprunde.org/user".equals(namespaceUri) ){return "u";}
    	if("http://www.tipprunde.org/stats".equals(namespaceUri) ){return "s";}
    	
    	if("http://ahtutils.aht-group.com/mail".equals(namespaceUri) ){return "m";}
    	if("http://exlp.sf.net/net".equals(namespaceUri) ){return "net";}
    	
    	if("http://www.openfuxml.org".equals(namespaceUri) ){return "ofx";}
    	if("http://www.openfuxml.org/table".equals(namespaceUri) ){return "table";}
    	
    	String result = null; //npmJeesl.getPreferredPrefix(namespaceUri, null, requirePrefix);	
    	if(result!=null){return result;}
    	
        return suggestion;
    }

    public String[] getPreDeclaredNamespaceUris()
    {
    	String[] result = new String[3];
    	result[2] = "http://www.openfuxml.org/chart";
    	result = new String[0];
        return result;
    }
}