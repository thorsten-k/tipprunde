package org.tipprunde.util.filter.xml;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.tipprunde.model.xml.liga.Match;
import org.tipprunde.util.comparator.xml.MatchComparator;

public class XmlMatchFilter
{
	public static List<Match> last(int max,List<Match> matches)
	{
		List<Match> result = new ArrayList<>(matches);
		Collections.sort(result, MatchComparator.factory(MatchComparator.Type.date));
		
		if(result.size()>max)
		{
			result.removeAll(result.subList(0, result.size()-max));
		}
		
		return result;
	}
	
	public static List<Match> home(long opponentId, List<Match> matches)
	{
		List<Match> result = new ArrayList<>();
		for(Match m : matches)
		{
			if(m.getLeft().getOpponent().getId()==opponentId)
			{
				result.add(m);
			}
		}
		
		return result;
	}
	
	public static List<Match> guest(long opponentId, List<Match> matches)
	{
		List<Match> result = new ArrayList<>();
		for(Match m : matches)
		{
			if(m.getRight().getOpponent().getId()==opponentId)
			{
				result.add(m);
			}
		}
		
		return result;
	}
}