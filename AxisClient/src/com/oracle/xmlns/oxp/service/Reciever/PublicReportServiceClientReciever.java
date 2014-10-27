package com.oracle.xmlns.oxp.service.Reciever;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.oracle.xmlns.oxp.service.Interface.PublicReportReadReports;

public class PublicReportServiceClientReciever {

	public static void main(String[] args) {
		String beanName = args[0]+"Bean";
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		PublicReportReadReports publicReportReadReports = (PublicReportReadReports) context.getBean(beanName);
		//PublicReportReadReports publicReportReadReports = (PublicReportReadReports) context.getBean("CRFVisualizationReportBean");
		publicReportReadReports.readreports();
		((ClassPathXmlApplicationContext) context).close();

	}

}
