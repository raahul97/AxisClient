package com.oracle.xmlns.oxp.service.Reciever;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class DirectoryCheck {

	public static void main(String args[]) {
		String directoryPrefix = "C:\\Users";
		String userId = "rahul.kumar.rajendra";
		String reportname = "CRFvisualizationReport";
		DirectoryCheck directoryCheck = new DirectoryCheck();
		directoryCheck.createRequestedDirectory(directoryPrefix,userId,reportname,File.separator,directoryCheck.getUTCTime());
		//directoryCheck.getUTCTime();
		//C:\Users\satish.m.kumar
		/*File file = new File("C:\\Directory1\\SubDir");
		String pathSeparator = File.separator;
		String userHome = System.getProperty("user.home");
	   // File file = new File("C:\\Users\\satish.m.kumar\\Directory1");
		if (!file.exists()) {
			if (file.mkdir()) {
				System.out.println("Directory is created!");
			} else {
				System.out.println("Failed to create directory!");
			}
		}
		else{
			System.out.println("Te requested Directory Exists");
		}*/
		

	}
	
	private void createRequestedDirectory(String directoryPrefix,String userId,String reportname,String pathSeparator,String utcTime){
		
		StringBuffer reportPath = new StringBuffer(directoryPrefix);
		reportPath.append(pathSeparator);
		reportPath.append(userId);
		reportPath.append(pathSeparator);
		reportPath.append(reportname);
		reportPath.append(pathSeparator);
		reportPath.append(utcTime);
		File file = new File(reportPath.toString());
		
		if (!file.exists()) {
			if (file.mkdirs()) {
				System.out.println("Directory is created!");
			} else {
				System.out.println("Failed to create directory!");
			}
		}
		else{
			System.out.println("Te requested Directory Exists");
		}
		
	}
	
	private String getUTCTime(){
     //final String DATEFORMAT = "yyyy-MM-dd HH:mm:ss";
     final String DATEFORMAT = "yyyyMMddHHmm";
		
		final SimpleDateFormat sdf = new SimpleDateFormat(DATEFORMAT);
	    sdf.setTimeZone(TimeZone.getTimeZone("UTC"));
	    final String utcTime = sdf.format(new Date());
	    
	    System.out.println("The UC time forma is " + utcTime);
	    return utcTime;

	}

}
