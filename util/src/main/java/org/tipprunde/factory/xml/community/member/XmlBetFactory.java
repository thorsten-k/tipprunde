package org.tipprunde.factory.xml.community.member;

import java.util.Date;

import org.tipprunde.model.xml.community.Bet;

import net.sf.exlp.util.DateUtil;

public class XmlBetFactory
{
	public static Bet build(double fee, double paid, double win, double balance, boolean ok, long participantId)
	{
		Bet bet = build(fee,paid,win,balance,ok);
		bet.setParticipant(XmlParticipantFactory.build(participantId));
		return bet;
	}
	
	public static Bet build(double fee, double paid, double win, double balance, boolean flag)
	{
		Bet xml = new Bet();
		xml.setRecord(DateUtil.getXmlGc4D(new Date()));
		xml.setFee(fee);
    	xml.setPaid(paid);
    	xml.setWin(win);
    	xml.setBalance(balance);
    	xml.setFlag(flag);
		return xml;
	}
}