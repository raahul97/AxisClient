package com.oracle.xmlns.oxp.service.publicreportClient;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.rmi.RemoteException;

import javax.activation.DataHandler;

import org.apache.axis2.AxisFault;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException;
import com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException;
import com.oracle.xmlns.oxp.service.publicreportservice.IsReportExist;
import com.oracle.xmlns.oxp.service.publicreportservice.IsReportExistResponse;
import com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException;
import com.oracle.xmlns.oxp.service.publicreportservice.PublicReportServiceService;
import com.oracle.xmlns.oxp.service.publicreportservice.PublicReportServiceServiceStub;
import com.oracle.xmlns.oxp.service.publicreportservice.ReportRequest;
import com.oracle.xmlns.oxp.service.publicreportservice.ReportResponse;
import com.oracle.xmlns.oxp.service.publicreportservice.RunReport;
import com.oracle.xmlns.oxp.service.publicreportservice.RunReportResponse;

public class PublicServiceReportPdfRead {

	
		public static void main(String[] args) throws AxisFault, FileNotFoundException, RemoteException {
			try {
				PublicReportServiceService stub = new PublicReportServiceServiceStub();
				
				
				ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
				IsReportExist isReportExist = (IsReportExist) context.getBean("isReportExist");
				
				 IsReportExistResponse isReportExistResponse =  stub.isReportExist(isReportExist);
				 Boolean isReport_Exist = isReportExistResponse.getIsReportExistReturn();
				System.out.println("The report exists is "+isReport_Exist.booleanValue()); 
				if(isReport_Exist.booleanValue()){
					RunReport  runReport  = (RunReport) context.getBean("runreport");
				
				
				
				
				RunReportResponse runReportResponse = stub.runReport(runReport);
				ReportResponse reportResponse =runReportResponse.getRunReportReturn();
				String reportFileID =  reportResponse.getReportFileID();
				String contentype =  reportResponse.getReportContentType();
				
				DataHandler dataHandler = reportResponse.getReportBytes();
				
				FileOutputStream fos = new FileOutputStream("FromBIPub.pdf");
				dataHandler.writeTo(fos);
				fos.close();
				System.out.println("The reportContent Type is "+contentype);
				System.out.println("The reportFile ID is "+reportFileID);
				System.out.println("The reqested file has been written to  FromBIPub.pdf");
				}
				
				else{
					System.out.println("The reqested file does not exist ");
				}
				
				((ClassPathXmlApplicationContext) context).close();
			} catch (AccessDeniedException | InvalidParametersException | OperationFailedException | IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			
		}

}


