package com.mba.util;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * The purpose of common class to have all static common method thats
 * we will use in the entire project.
 * 
 * @author m.bassam
 * 
 */
public class Common {
	
	/**
	 * Is blank or null method
	 * Check the value of the sting is blank or null
	 * 
	 * 
	 * @param value String value
	 * @return true if the string value is blank or null 
	 */
	public static boolean isBlankOrNull(String value) {

		if (value != null && !value.equals("")) {
			return false;
		}
		return true;
	}
	
	/**
	 * Is null method
	 * Check whether the object is null or not
	 * 
	 * @param object
	 * @return true if the object is null
	 */
	public static boolean isNull(Object object) {

		if (object != null) {
			return false;
		}
		return true;
	}
	
	/**
	 * Convert date to string method
	 * Convert The Date object to String in ("yyyy-MM-dd") format
	 * 
	 * @param date Date object
	 * @return String in ("yyyy-MM-dd") format
	 */
	public static String convertDateToString(Date date) {
		String dateInString = "";
		if (!isNull(date)) {
			DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
			dateInString = dateFormat.format(date);
		}
		return dateInString;
	}
	
	/**
	 * Convert double to string method
	 * 
	 * 
	 * @param value Double
	 * @return String value in double format
	 */
	public static String convertDoubletoString(Double value) {
		String doubleInString = "";
		if(!isNull(value)) {
			doubleInString = String.valueOf(value);
		}
		return doubleInString;
	}
	
	
	/**
	 * Convert integer to string method
	 * 
	 * 
	 * @param value Integer
	 * @return String value in integer format  
	 */
	public static String convertIntegerToString(Integer value) {
		String integerInString = "";
		if(!isNull(value)) {
			integerInString = String.valueOf(value);
		}
		return integerInString;
	}
}  

