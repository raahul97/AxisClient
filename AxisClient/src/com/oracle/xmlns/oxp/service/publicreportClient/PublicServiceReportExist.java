package com.oracle.xmlns.oxp.service.publicreportClient;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.rmi.RemoteException;

import javax.activation.DataHandler;

import org.apache.axis2.AxisFault;

import com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException;
import com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException;
import com.oracle.xmlns.oxp.service.publicreportservice.IsReportExist;
import com.oracle.xmlns.oxp.service.publicreportservice.IsReportExistResponse;
import com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException;
import com.oracle.xmlns.oxp.service.publicreportservice.PublicReportServiceServiceStub;
import com.oracle.xmlns.oxp.service.publicreportservice.ReportRequest;
import com.oracle.xmlns.oxp.service.publicreportservice.ReportResponse;
import com.oracle.xmlns.oxp.service.publicreportservice.RunReport;
import com.oracle.xmlns.oxp.service.publicreportservice.RunReportResponse;

public class PublicServiceReportExist {

	public static void main(String[] args) throws AxisFault, FileNotFoundException, RemoteException {
		try {
			PublicReportServiceServiceStub stub = new PublicReportServiceServiceStub();
			
			IsReportExist isReportExist = new IsReportExist();
			isReportExist.setPassword("Administrator");
			isReportExist.setUserID("Administrator");
			isReportExist.setReportAbsolutePath("/Quantum/MDR/LillyMDR/DVS_Report/DVS_Report.xdo");
			 IsReportExistResponse isReportExistResponse =  stub.isReportExist(isReportExist);
			 Boolean isReport_Exist = isReportExistResponse.getIsReportExistReturn();
			System.out.println("The report exists is "+isReport_Exist.booleanValue()); 
			if(isReport_Exist.booleanValue()){
			ReportRequest reportRequest = new ReportRequest();
			reportRequest.setReportAbsolutePath("/Quantum/MDR/LillyMDR/DVS_Report/DVS_Report.xdo");;
			reportRequest.setAttributeTemplate("Simple");
			//reportRequest.setAttributeFormat("pdf");
			reportRequest.setAttributeLocale("en-US");
			reportRequest.setSizeOfDataChunkDownload(10000);
			
			
			ReportResponse reportResponse = new ReportResponse();
			RunReport  runReport = new RunReport();
			runReport.setReportRequest(reportRequest);
			runReport.setPassword("password32");
			runReport.setUserID("testuser32");
			RunReportResponse runReportResponse = stub.runReport(runReport);
			reportResponse =runReportResponse.getRunReportReturn();
			String reportFileID =  reportResponse.getReportFileID();
			String contentype =  reportResponse.getReportContentType();
			//byte[] reportBytes = reportResponse.getReportBytes();
			DataHandler dataHandler = reportResponse.getReportBytes();
			//FileOutputStream fos = new FileOutputStream("FromBIPub.xls");
			FileOutputStream fos = new FileOutputStream("FromBIPub.vnd.ms-excel");
			dataHandler.writeTo(fos);
			fos.close();
			System.out.println("The reportFile ID is "+contentype);
			System.out.println("The reportFile ID is "+reportFileID);
			System.out.println("The reqested file has been written to  FromBIPub.xlsx");
			}
			
			else{
				System.out.println("The reqested file does not exist ");
			}
		} catch (AccessDeniedException | InvalidParametersException | OperationFailedException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
