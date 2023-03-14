package org.tipprunde.factory.json.system.io.ssi.openliga;

import org.encog.ml.data.MLData;
import org.encog.util.arrayutil.NormalizedField;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.tipprunde.model.json.ssi.openliga.OpenLigaMatchResult;

public class JsonOpenLigaMatchResultFactory
{	
	final static Logger logger = LoggerFactory.getLogger(JsonOpenLigaMatchResultFactory.class);
	
	public static OpenLigaMatchResult build(NormalizedField nf, MLData data)
	{
		int left = (new Double(nf.deNormalize(data.getData(0))).intValue());
		int right = (new Double(nf.deNormalize(data.getData(1))).intValue());
		
		return zeroBase(left,right);
	}
	
	public static OpenLigaMatchResult zeroBase(int left, int right)
	{		
		if(left<0)
		{
			int diff = left;
			left = left-diff;
			right = right-diff;
		}
		if(right<0)
		{
			int diff = right;
			left = left-diff;
			right = right-diff;
		}
//		if(hasZero) {logger.info("\t"+left+":"+right);}
		
		OpenLigaMatchResult json = new OpenLigaMatchResult();
		json.setLeft(left);
		json.setRight(right);
		
		return json;
	}
}
