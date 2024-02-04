package org.tipprunde.factory.xml.community.member;

import java.util.Date;

import org.exlp.util.system.DateUtil;
import org.tipprunde.model.xml.community.Bet;

public class XmlBetFactory
{
	public static Bet build(double carryover, double fee, double paid, double win, double out, double balance, long participantId)
	{
		Bet bet = build(carryover,fee,paid,win,out,balance);
		bet.setParticipant(XmlParticipantFactory.build(participantId));
		return bet;
	}
	
	public static Bet build(double carryover, double fee, double paid, double win, double out, double balance)
	{
		Bet xml = new Bet();
		xml.setRecord(DateUtil.toXmlGc(new Date()));
		xml.setCarryover(carryover);
		xml.setFee(fee);
    	xml.setPaid(paid);
    	xml.setWin(win);
    	xml.setOut(out);
    	xml.setBalance(balance);
		return xml;
	}
}