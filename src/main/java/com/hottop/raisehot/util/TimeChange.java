package com.hottop.raisehot.util;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeChange {
	public static Timestamp change(String time) {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date = new Date();
		// StringתDate
		try {
			date = format.parse(time); // Wed sep 26 00:00:00 CST 2007
		} catch (ParseException e) {
			e.printStackTrace();
		}
		String tm = format.format(date);
		Timestamp ts = Timestamp.valueOf(tm);
		return ts;
	}
}
