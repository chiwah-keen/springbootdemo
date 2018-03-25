package com.datagrand.webdemo;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.HashMap;

public class Utils extends HashMap<String, Object>{

	
	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static String getStackTrace(Throwable throwable) {
	        StringWriter sw = new StringWriter();
	        PrintWriter pw = new PrintWriter(sw, true);
	        throwable.printStackTrace(pw);
	        return sw.getBuffer().toString();
	    }
	 
	
	public static String getCurrentTimeStamp() {
		return System.currentTimeMillis() +"";
	}
	 
}
