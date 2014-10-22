package com.oracle.xmlns.oxp.service.publicreportClient;

import java.rmi.RemoteException;

import org.apache.axis2.AxisFault;

import com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException;
import com.oracle.xmlns.oxp.service.publicreportservice.Login;
import com.oracle.xmlns.oxp.service.publicreportservice.LoginResponse;
import com.oracle.xmlns.oxp.service.publicreportservice.PublicReportServiceServiceStub;

public class PublicServiceLogin {

	public static void main(String[] args) throws AxisFault {
		try {
			PublicReportServiceServiceStub stub = new PublicReportServiceServiceStub();
			
			
			Login login = new Login();
			login.setUserID("Administrator");
			login.setPassword("Administrator");
			LoginResponse  loginResponse =  stub.login(login);
			String loginReturn =loginResponse.getLoginReturn();
			
			System.out.println("Login Return is "+loginReturn);
			System.out.println("Hello");
			
		} catch (AccessDeniedException |RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
