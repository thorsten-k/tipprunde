package org.tipprunde.util.query.xml;

import java.util.Hashtable;
import java.util.Map;

import org.tipprunde.model.xml.tr.Query;
import org.tipprunde.model.xml.user.Identity;
import org.tipprunde.model.xml.user.User;

public class XmlUserQuery
{
	public static enum Key {identity}
	
	public static Map<Key,Query> mQueries;
	
	public static Query get(Key key, String lang)
	{
		if(mQueries==null){mQueries = new Hashtable<Key,Query>();}
		if(!mQueries.containsKey(key))
		{
			Query q = new Query();
			switch(key)
			{
				case identity: q.setIdentity(identity());break;
			}
			mQueries.put(key, q);;
		}
		Query q = mQueries.get(key);
		q.setLang(lang);
		return q;
	}
	
	public static Identity identity()
	{
		Identity xml = new Identity();
		xml.setEmail("");
		
		User user = new User();
		user.setFirstName("");
		user.setLastName("");
		xml.setUser(user);
		
    	return xml;
	}
}