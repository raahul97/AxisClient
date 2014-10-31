package com.oracle.xmlns.oxp.service.publicreportClient;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.rmi.RemoteException;

import javax.activation.DataHandler;

import org.apache.axis2.AxisFault;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.oracle.xmlns.oxp.service.DataObjects.UserDetails;
import com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException;
import com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException;
import com.oracle.xmlns.oxp.service.publicreportservice.IsReportExist;
import com.oracle.xmlns.oxp.service.publicreportservice.IsReportExistResponse;
import com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException;
import com.oracle.xmlns.oxp.service.publicreportservice.PublicReportServiceService;
import com.oracle.xmlns.oxp.service.publicreportservice.PublicReportServiceServiceStub;
import com.oracle.xmlns.oxp.service.publicreportservice.ReportResponse;
import com.oracle.xmlns.oxp.service.publicreportservice.RunReport;
import com.oracle.xmlns.oxp.service.publicreportservice.RunReportResponse;

public class PublicServiceReportHtmlRead  implements BeanFactoryPostProcessor   {

	public static void main(String[] args) throws AxisFault, FileNotFoundException, RemoteException {


		
		
			try {
				
				PublicReportServiceService stub = new PublicReportServiceServiceStub();
				
				
				ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
				IsReportExist isReportExist = (IsReportExist) context.getBean("isReportExistTabular");
				
				 IsReportExistResponse isReportExistResponse =  stub.isReportExist(isReportExist);
				 Boolean isReport_Exist = isReportExistResponse.getIsReportExistReturn();
				System.out.println("The report exists is "+isReport_Exist.booleanValue()); 
				if(isReport_Exist.booleanValue()){
					RunReport  runReport  = (RunReport) context.getBean("runreportTabular");
				
				
				
				
				RunReportResponse runReportResponse = stub.runReport(runReport);
				ReportResponse reportResponse =runReportResponse.getRunReportReturn();
				String reportFileID =  reportResponse.getReportFileID();
				String contentype =  reportResponse.getReportContentType();
				
				DataHandler dataHandler = reportResponse.getReportBytes();
				
				FileOutputStream fos = new FileOutputStream("FromBIPub.html");
				dataHandler.writeTo(fos);
				fos.close();
				System.out.println("The reportContent Type is "+contentype);
				System.out.println("The reportFile ID is "+reportFileID);
				System.out.println("The reqested file has been written to  FromBIPub.html");
				}
				
				else{
					System.out.println("The reqested file does not exist ");
				}
				
				((ClassPathXmlApplicationContext) context).close();
			} catch (AccessDeniedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 catch (InvalidParametersException  e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			 catch (OperationFailedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			 catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
			
			
			
		}
		
		




	
	public void readreports(UserDetails userDetails) {


		
		
		try {
			
			
			PublicReportServiceService stub = new PublicReportServiceServiceStub();
			
			
			ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
			UserDetails userbean = (UserDetails) context.getBean("userDetails");
			userbean.setPassword(userDetails.getPassword());
			userbean.setUserId(userDetails.getUserId());
			IsReportExist isReportExist = (IsReportExist) context.getBean("isReportExistTabular");
			
			 IsReportExistResponse isReportExistResponse =  stub.isReportExist(isReportExist);
			 Boolean isReport_Exist = isReportExistResponse.getIsReportExistReturn();
			System.out.println("The report exists is "+isReport_Exist.booleanValue()); 
			if(isReport_Exist.booleanValue()){
				RunReport  runReport  = (RunReport) context.getBean("runreportTabular");
			
			
			
			
			RunReportResponse runReportResponse = stub.runReport(runReport);
			ReportResponse reportResponse =runReportResponse.getRunReportReturn();
			String reportFileID =  reportResponse.getReportFileID();
			String contentype =  reportResponse.getReportContentType();
			
			DataHandler dataHandler = reportResponse.getReportBytes();
			
			FileOutputStream fos = new FileOutputStream("FromBIPub.html");
			dataHandler.writeTo(fos);
			fos.close();
			System.out.println("The reportContent Type is "+contentype);
			System.out.println("The reportFile ID is "+reportFileID);
			System.out.println("The reqested file has been written to  FromBIPub.html");
			}
			
			else{
				System.out.println("The reqested file does not exist ");
			}
			
			((ClassPathXmlApplicationContext) context).close();
		} catch (AccessDeniedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 catch (InvalidParametersException  e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 catch (OperationFailedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		
		
		
	}







	







	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory arg0)
			throws BeansException {
		// TODO Auto-generated method stub
		
	}

}
