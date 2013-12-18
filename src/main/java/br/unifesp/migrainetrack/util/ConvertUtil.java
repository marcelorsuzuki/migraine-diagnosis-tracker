package br.unifesp.migrainetrack.util;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ConvertUtil {

	public static Date stringToDate(String strDate) {

		try {  
			
			DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy"); 
		    return (Date)formatter.parse(strDate); 
		} 
		catch (ParseException e) {
			System.out.println("Exception :"+e);
			return null;
		} 
	}		
}
