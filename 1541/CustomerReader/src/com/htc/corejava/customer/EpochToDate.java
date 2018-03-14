package com.htc.corejava.customer;
import java.util.*;
import java.text.*;
public class EpochToDate {
	public static void main(String[] args) throws InterruptedException {
	        Date date = new Date(1000000008000L);
	        DateFormat format = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	        format.setTimeZone(TimeZone.getTimeZone("Etc/UTC"));
	        String formatted = format.format(date);
	        System.out.println(formatted);
	        format.setTimeZone(TimeZone.getTimeZone("America/Chicago"));
	        formatted = format.format(date);
	        System.out.println(formatted);
	    }
}
