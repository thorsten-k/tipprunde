package org.tipprunde.factory.xml.community.member;

import java.util.Date;

import org.tipprunde.model.xml.community.Bet;

import net.sf.exlp.util.DateUtil;

public class XmlBetFactory
{
	public static Bet build(double amount, boolean paid, long participantId)
	{
		Bet bet = new Bet();
		bet.setPaid(paid);
		bet.setAmount(amount);
		bet.setRecord(DateUtil.getXmlGc4D(new Date()));
		bet.setParticipant(XmlParticipantFactory.build(participantId));
		return bet;
	}
	
	public static Bet build(double amount, boolean paid)
	{
		Bet bet = new Bet();
		bet.setPaid(paid);
		bet.setAmount(amount);
		bet.setRecord(DateUtil.getXmlGc4D(new Date()));
		return bet;
	}
}