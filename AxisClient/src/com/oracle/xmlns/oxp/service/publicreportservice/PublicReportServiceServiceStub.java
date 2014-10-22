
/**
 * PublicReportServiceServiceStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.4  Built on : Apr 26, 2008 (06:24:30 EDT)
 */
        package com.oracle.xmlns.oxp.service.publicreportservice;

        

        /*
        *  PublicReportServiceServiceStub java implementation
        */

        
        public class PublicReportServiceServiceStub extends org.apache.axis2.client.Stub
        implements PublicReportServiceService{
        protected org.apache.axis2.description.AxisOperation[] _operations;

        //hashmaps to keep the fault mapping
        private java.util.HashMap faultExceptionNameMap = new java.util.HashMap();
        private java.util.HashMap faultExceptionClassNameMap = new java.util.HashMap();
        private java.util.HashMap faultMessageMap = new java.util.HashMap();

        private static int counter = 0;

        private static synchronized String getUniqueSuffix(){
            // reset the counter if it is greater than 99999
            if (counter > 99999){
                counter = 0;
            }
            counter = counter + 1; 
            return Long.toString(System.currentTimeMillis()) + "_" + counter;
        }

    
    private void populateAxisService() throws org.apache.axis2.AxisFault {

     //creating the Service with a unique name
     _service = new org.apache.axis2.description.AxisService("PublicReportServiceService" + getUniqueSuffix());
     addAnonymousOperations();

        //creating the operations
        org.apache.axis2.description.AxisOperation __operation;

        _operations = new org.apache.axis2.description.AxisOperation[58];
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService", "deleteReportInSession"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[0]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService", "getSecurityModel"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[1]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService", "getListOfScheduledReportsStatus"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[2]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService", "deleteFolder"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[3]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService", "getScheduledReportStatusInSession"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[4]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService", "createReport"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[5]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService", "getScheduledReportHistoryInfoInSession"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[6]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService", "getScheduledReportHistoryInfo"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[7]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService", "deleteReport"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[8]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService", "impersonate"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[9]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService", "isFolderExist"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[10]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService", "hasReportAccess"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[11]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService", "isFolderExistInSession"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[12]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService", "isReportExistInSession"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[13]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService", "resumeScheduledReportInSession"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[14]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService", "getFolderContentsInSession"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[15]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService", "runReport"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[16]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService", "scheduleReport"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[17]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService", "updateReportDefinitionInSession"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[18]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService", "deleteScheduledReportInSession"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[19]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService", "downloadReport"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[20]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService", "uploadReportInSession"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[21]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService", "resumeScheduledReport"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[22]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService", "deleteScheduledReportHistory"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[23]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService", "runReportInSession"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[24]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService", "downloadReportInSession"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[25]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService", "createReportInSession"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[26]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService", "downloadReportDataChunk"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[27]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService", "getScheduledReportStatus"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[28]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService", "getReportDefinition"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[29]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService", "uploadReportDataChunk"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[30]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService", "login"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[31]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService", "createReportFolder"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[32]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService", "updateReportDefinition"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[33]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService", "validateLogin"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[34]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService", "uploadTemplateForReportInSession"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[35]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService", "getScheduledReportInfoInSession"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[36]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService", "uploadTemplateForReport"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[37]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService", "getReportParametersInSession"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[38]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService", "removeTemplateForReportInSession"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[39]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService", "createReportFolderInSession"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[40]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService", "hasReportAccessInSession"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[41]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService", "isReportExist"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[42]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService", "getBIPHTTPSessionInterval"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[43]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService", "getScheduledReportInfo"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[44]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService", "deleteFolderInSession"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[45]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService", "deleteScheduledReportHistoryInSession"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[46]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService", "suspendScheduledReportInSession"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[47]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService", "getFolderContents"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[48]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService", "getReportDefinitionInSession"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[49]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService", "uploadReport"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[50]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService", "removeTemplateForReport"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[51]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService", "logout"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[52]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService", "deleteScheduledReport"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[53]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService", "getListOfScheduledReportsStatusInSession"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[54]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService", "suspendScheduledReport"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[55]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService", "scheduleReportInSession"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[56]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService", "getReportParameters"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[57]=__operation;
            
        
        }

    //populates the faults
    private void populateFaults(){
         
              faultExceptionNameMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault1"),"com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault1"),"com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException");
              faultMessageMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault1"),"com.oracle.xmlns.oxp.service.publicreportservice.Fault1");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault"),"com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault"),"com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException");
              faultMessageMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault"),"com.oracle.xmlns.oxp.service.publicreportservice.Fault");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault2"),"com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault2"),"com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException");
              faultMessageMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault2"),"com.oracle.xmlns.oxp.service.publicreportservice.Fault2");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault1"),"com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault1"),"com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException");
              faultMessageMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault1"),"com.oracle.xmlns.oxp.service.publicreportservice.Fault1");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault"),"com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault"),"com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException");
              faultMessageMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault"),"com.oracle.xmlns.oxp.service.publicreportservice.Fault");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault2"),"com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault2"),"com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException");
              faultMessageMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault2"),"com.oracle.xmlns.oxp.service.publicreportservice.Fault2");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault1"),"com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault1"),"com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException");
              faultMessageMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault1"),"com.oracle.xmlns.oxp.service.publicreportservice.Fault1");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault"),"com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault"),"com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException");
              faultMessageMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault"),"com.oracle.xmlns.oxp.service.publicreportservice.Fault");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault2"),"com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault2"),"com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException");
              faultMessageMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault2"),"com.oracle.xmlns.oxp.service.publicreportservice.Fault2");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault1"),"com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault1"),"com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException");
              faultMessageMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault1"),"com.oracle.xmlns.oxp.service.publicreportservice.Fault1");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault"),"com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault"),"com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException");
              faultMessageMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault"),"com.oracle.xmlns.oxp.service.publicreportservice.Fault");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault2"),"com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault2"),"com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException");
              faultMessageMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault2"),"com.oracle.xmlns.oxp.service.publicreportservice.Fault2");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault1"),"com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault1"),"com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException");
              faultMessageMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault1"),"com.oracle.xmlns.oxp.service.publicreportservice.Fault1");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault"),"com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault"),"com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException");
              faultMessageMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault"),"com.oracle.xmlns.oxp.service.publicreportservice.Fault");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault2"),"com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault2"),"com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException");
              faultMessageMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault2"),"com.oracle.xmlns.oxp.service.publicreportservice.Fault2");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault1"),"com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault1"),"com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException");
              faultMessageMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault1"),"com.oracle.xmlns.oxp.service.publicreportservice.Fault1");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault"),"com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault"),"com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException");
              faultMessageMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault"),"com.oracle.xmlns.oxp.service.publicreportservice.Fault");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault2"),"com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault2"),"com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException");
              faultMessageMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault2"),"com.oracle.xmlns.oxp.service.publicreportservice.Fault2");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault1"),"com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault1"),"com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException");
              faultMessageMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault1"),"com.oracle.xmlns.oxp.service.publicreportservice.Fault1");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault"),"com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault"),"com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException");
              faultMessageMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault"),"com.oracle.xmlns.oxp.service.publicreportservice.Fault");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault2"),"com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault2"),"com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException");
              faultMessageMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault2"),"com.oracle.xmlns.oxp.service.publicreportservice.Fault2");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault1"),"com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault1"),"com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException");
              faultMessageMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault1"),"com.oracle.xmlns.oxp.service.publicreportservice.Fault1");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault"),"com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault"),"com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException");
              faultMessageMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault"),"com.oracle.xmlns.oxp.service.publicreportservice.Fault");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault2"),"com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault2"),"com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException");
              faultMessageMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault2"),"com.oracle.xmlns.oxp.service.publicreportservice.Fault2");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault"),"com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault"),"com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException");
              faultMessageMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault"),"com.oracle.xmlns.oxp.service.publicreportservice.Fault");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault"),"com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault"),"com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException");
              faultMessageMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault"),"com.oracle.xmlns.oxp.service.publicreportservice.Fault");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault1"),"com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault1"),"com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException");
              faultMessageMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault1"),"com.oracle.xmlns.oxp.service.publicreportservice.Fault1");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault"),"com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault"),"com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException");
              faultMessageMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault"),"com.oracle.xmlns.oxp.service.publicreportservice.Fault");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault"),"com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault"),"com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException");
              faultMessageMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault"),"com.oracle.xmlns.oxp.service.publicreportservice.Fault");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault1"),"com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault1"),"com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException");
              faultMessageMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault1"),"com.oracle.xmlns.oxp.service.publicreportservice.Fault1");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault"),"com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault"),"com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException");
              faultMessageMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault"),"com.oracle.xmlns.oxp.service.publicreportservice.Fault");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault2"),"com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault2"),"com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException");
              faultMessageMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault2"),"com.oracle.xmlns.oxp.service.publicreportservice.Fault2");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault1"),"com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault1"),"com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException");
              faultMessageMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault1"),"com.oracle.xmlns.oxp.service.publicreportservice.Fault1");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault"),"com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault"),"com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException");
              faultMessageMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault"),"com.oracle.xmlns.oxp.service.publicreportservice.Fault");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault2"),"com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault2"),"com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException");
              faultMessageMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault2"),"com.oracle.xmlns.oxp.service.publicreportservice.Fault2");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault1"),"com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault1"),"com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException");
              faultMessageMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault1"),"com.oracle.xmlns.oxp.service.publicreportservice.Fault1");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault"),"com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault"),"com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException");
              faultMessageMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault"),"com.oracle.xmlns.oxp.service.publicreportservice.Fault");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault2"),"com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault2"),"com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException");
              faultMessageMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault2"),"com.oracle.xmlns.oxp.service.publicreportservice.Fault2");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault1"),"com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault1"),"com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException");
              faultMessageMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault1"),"com.oracle.xmlns.oxp.service.publicreportservice.Fault1");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault"),"com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault"),"com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException");
              faultMessageMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault"),"com.oracle.xmlns.oxp.service.publicreportservice.Fault");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault2"),"com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault2"),"com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException");
              faultMessageMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault2"),"com.oracle.xmlns.oxp.service.publicreportservice.Fault2");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault1"),"com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault1"),"com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException");
              faultMessageMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault1"),"com.oracle.xmlns.oxp.service.publicreportservice.Fault1");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault"),"com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault"),"com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException");
              faultMessageMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault"),"com.oracle.xmlns.oxp.service.publicreportservice.Fault");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault2"),"com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault2"),"com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException");
              faultMessageMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault2"),"com.oracle.xmlns.oxp.service.publicreportservice.Fault2");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault1"),"com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault1"),"com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException");
              faultMessageMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault1"),"com.oracle.xmlns.oxp.service.publicreportservice.Fault1");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault"),"com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault"),"com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException");
              faultMessageMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault"),"com.oracle.xmlns.oxp.service.publicreportservice.Fault");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault2"),"com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault2"),"com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException");
              faultMessageMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault2"),"com.oracle.xmlns.oxp.service.publicreportservice.Fault2");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault1"),"com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault1"),"com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException");
              faultMessageMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault1"),"com.oracle.xmlns.oxp.service.publicreportservice.Fault1");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault"),"com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault"),"com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException");
              faultMessageMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault"),"com.oracle.xmlns.oxp.service.publicreportservice.Fault");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault2"),"com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault2"),"com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException");
              faultMessageMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault2"),"com.oracle.xmlns.oxp.service.publicreportservice.Fault2");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault1"),"com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault1"),"com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException");
              faultMessageMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault1"),"com.oracle.xmlns.oxp.service.publicreportservice.Fault1");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault"),"com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault"),"com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException");
              faultMessageMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault"),"com.oracle.xmlns.oxp.service.publicreportservice.Fault");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault2"),"com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault2"),"com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException");
              faultMessageMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault2"),"com.oracle.xmlns.oxp.service.publicreportservice.Fault2");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault1"),"com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault1"),"com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException");
              faultMessageMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault1"),"com.oracle.xmlns.oxp.service.publicreportservice.Fault1");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault"),"com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault"),"com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException");
              faultMessageMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault"),"com.oracle.xmlns.oxp.service.publicreportservice.Fault");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault2"),"com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault2"),"com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException");
              faultMessageMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault2"),"com.oracle.xmlns.oxp.service.publicreportservice.Fault2");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault1"),"com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault1"),"com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException");
              faultMessageMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault1"),"com.oracle.xmlns.oxp.service.publicreportservice.Fault1");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault"),"com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault"),"com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException");
              faultMessageMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault"),"com.oracle.xmlns.oxp.service.publicreportservice.Fault");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault2"),"com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault2"),"com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException");
              faultMessageMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault2"),"com.oracle.xmlns.oxp.service.publicreportservice.Fault2");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault1"),"com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault1"),"com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException");
              faultMessageMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault1"),"com.oracle.xmlns.oxp.service.publicreportservice.Fault1");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault"),"com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault"),"com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException");
              faultMessageMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault"),"com.oracle.xmlns.oxp.service.publicreportservice.Fault");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault2"),"com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault2"),"com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException");
              faultMessageMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault2"),"com.oracle.xmlns.oxp.service.publicreportservice.Fault2");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault1"),"com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault1"),"com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException");
              faultMessageMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault1"),"com.oracle.xmlns.oxp.service.publicreportservice.Fault1");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault"),"com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault"),"com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException");
              faultMessageMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault"),"com.oracle.xmlns.oxp.service.publicreportservice.Fault");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault2"),"com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault2"),"com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException");
              faultMessageMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault2"),"com.oracle.xmlns.oxp.service.publicreportservice.Fault2");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault1"),"com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault1"),"com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException");
              faultMessageMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault1"),"com.oracle.xmlns.oxp.service.publicreportservice.Fault1");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault"),"com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault"),"com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException");
              faultMessageMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault"),"com.oracle.xmlns.oxp.service.publicreportservice.Fault");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault2"),"com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault2"),"com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException");
              faultMessageMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault2"),"com.oracle.xmlns.oxp.service.publicreportservice.Fault2");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault2"),"com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault2"),"com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException");
              faultMessageMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault2"),"com.oracle.xmlns.oxp.service.publicreportservice.Fault2");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault1"),"com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault1"),"com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException");
              faultMessageMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault1"),"com.oracle.xmlns.oxp.service.publicreportservice.Fault1");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault"),"com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault"),"com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException");
              faultMessageMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault"),"com.oracle.xmlns.oxp.service.publicreportservice.Fault");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault2"),"com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault2"),"com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException");
              faultMessageMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault2"),"com.oracle.xmlns.oxp.service.publicreportservice.Fault2");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault1"),"com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault1"),"com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException");
              faultMessageMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault1"),"com.oracle.xmlns.oxp.service.publicreportservice.Fault1");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault"),"com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault"),"com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException");
              faultMessageMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault"),"com.oracle.xmlns.oxp.service.publicreportservice.Fault");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault2"),"com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault2"),"com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException");
              faultMessageMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault2"),"com.oracle.xmlns.oxp.service.publicreportservice.Fault2");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault2"),"com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault2"),"com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException");
              faultMessageMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault2"),"com.oracle.xmlns.oxp.service.publicreportservice.Fault2");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault"),"com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault"),"com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException");
              faultMessageMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault"),"com.oracle.xmlns.oxp.service.publicreportservice.Fault");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault1"),"com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault1"),"com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException");
              faultMessageMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault1"),"com.oracle.xmlns.oxp.service.publicreportservice.Fault1");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault"),"com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault"),"com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException");
              faultMessageMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault"),"com.oracle.xmlns.oxp.service.publicreportservice.Fault");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault2"),"com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault2"),"com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException");
              faultMessageMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault2"),"com.oracle.xmlns.oxp.service.publicreportservice.Fault2");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault1"),"com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault1"),"com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException");
              faultMessageMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault1"),"com.oracle.xmlns.oxp.service.publicreportservice.Fault1");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault"),"com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault"),"com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException");
              faultMessageMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault"),"com.oracle.xmlns.oxp.service.publicreportservice.Fault");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault2"),"com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault2"),"com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException");
              faultMessageMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault2"),"com.oracle.xmlns.oxp.service.publicreportservice.Fault2");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault1"),"com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault1"),"com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException");
              faultMessageMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault1"),"com.oracle.xmlns.oxp.service.publicreportservice.Fault1");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault"),"com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault"),"com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException");
              faultMessageMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault"),"com.oracle.xmlns.oxp.service.publicreportservice.Fault");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault2"),"com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault2"),"com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException");
              faultMessageMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault2"),"com.oracle.xmlns.oxp.service.publicreportservice.Fault2");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault1"),"com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault1"),"com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException");
              faultMessageMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault1"),"com.oracle.xmlns.oxp.service.publicreportservice.Fault1");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault"),"com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault"),"com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException");
              faultMessageMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault"),"com.oracle.xmlns.oxp.service.publicreportservice.Fault");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault2"),"com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault2"),"com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException");
              faultMessageMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault2"),"com.oracle.xmlns.oxp.service.publicreportservice.Fault2");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault1"),"com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault1"),"com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException");
              faultMessageMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault1"),"com.oracle.xmlns.oxp.service.publicreportservice.Fault1");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault"),"com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault"),"com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException");
              faultMessageMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault"),"com.oracle.xmlns.oxp.service.publicreportservice.Fault");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault2"),"com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault2"),"com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException");
              faultMessageMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault2"),"com.oracle.xmlns.oxp.service.publicreportservice.Fault2");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault1"),"com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault1"),"com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException");
              faultMessageMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault1"),"com.oracle.xmlns.oxp.service.publicreportservice.Fault1");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault"),"com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault"),"com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException");
              faultMessageMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault"),"com.oracle.xmlns.oxp.service.publicreportservice.Fault");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault2"),"com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault2"),"com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException");
              faultMessageMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault2"),"com.oracle.xmlns.oxp.service.publicreportservice.Fault2");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault1"),"com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault1"),"com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException");
              faultMessageMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault1"),"com.oracle.xmlns.oxp.service.publicreportservice.Fault1");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault"),"com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault"),"com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException");
              faultMessageMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault"),"com.oracle.xmlns.oxp.service.publicreportservice.Fault");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault2"),"com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault2"),"com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException");
              faultMessageMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault2"),"com.oracle.xmlns.oxp.service.publicreportservice.Fault2");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault1"),"com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault1"),"com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException");
              faultMessageMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault1"),"com.oracle.xmlns.oxp.service.publicreportservice.Fault1");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault"),"com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault"),"com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException");
              faultMessageMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault"),"com.oracle.xmlns.oxp.service.publicreportservice.Fault");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault2"),"com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault2"),"com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException");
              faultMessageMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault2"),"com.oracle.xmlns.oxp.service.publicreportservice.Fault2");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault1"),"com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault1"),"com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException");
              faultMessageMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault1"),"com.oracle.xmlns.oxp.service.publicreportservice.Fault1");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault"),"com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault"),"com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException");
              faultMessageMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault"),"com.oracle.xmlns.oxp.service.publicreportservice.Fault");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault1"),"com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault1"),"com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException");
              faultMessageMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault1"),"com.oracle.xmlns.oxp.service.publicreportservice.Fault1");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault"),"com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault"),"com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException");
              faultMessageMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault"),"com.oracle.xmlns.oxp.service.publicreportservice.Fault");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault2"),"com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault2"),"com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException");
              faultMessageMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault2"),"com.oracle.xmlns.oxp.service.publicreportservice.Fault2");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault1"),"com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault1"),"com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException");
              faultMessageMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault1"),"com.oracle.xmlns.oxp.service.publicreportservice.Fault1");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault"),"com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault"),"com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException");
              faultMessageMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault"),"com.oracle.xmlns.oxp.service.publicreportservice.Fault");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault2"),"com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault2"),"com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException");
              faultMessageMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault2"),"com.oracle.xmlns.oxp.service.publicreportservice.Fault2");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault1"),"com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault1"),"com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException");
              faultMessageMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault1"),"com.oracle.xmlns.oxp.service.publicreportservice.Fault1");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault"),"com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault"),"com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException");
              faultMessageMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault"),"com.oracle.xmlns.oxp.service.publicreportservice.Fault");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault2"),"com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault2"),"com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException");
              faultMessageMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault2"),"com.oracle.xmlns.oxp.service.publicreportservice.Fault2");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault1"),"com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault1"),"com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException");
              faultMessageMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault1"),"com.oracle.xmlns.oxp.service.publicreportservice.Fault1");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault"),"com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault"),"com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException");
              faultMessageMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault"),"com.oracle.xmlns.oxp.service.publicreportservice.Fault");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault2"),"com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault2"),"com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException");
              faultMessageMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault2"),"com.oracle.xmlns.oxp.service.publicreportservice.Fault2");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault1"),"com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault1"),"com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException");
              faultMessageMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault1"),"com.oracle.xmlns.oxp.service.publicreportservice.Fault1");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault"),"com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault"),"com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException");
              faultMessageMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault"),"com.oracle.xmlns.oxp.service.publicreportservice.Fault");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault2"),"com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault2"),"com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException");
              faultMessageMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault2"),"com.oracle.xmlns.oxp.service.publicreportservice.Fault2");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault1"),"com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault1"),"com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException");
              faultMessageMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault1"),"com.oracle.xmlns.oxp.service.publicreportservice.Fault1");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault"),"com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault"),"com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException");
              faultMessageMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault"),"com.oracle.xmlns.oxp.service.publicreportservice.Fault");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault2"),"com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault2"),"com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException");
              faultMessageMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault2"),"com.oracle.xmlns.oxp.service.publicreportservice.Fault2");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault1"),"com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault1"),"com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException");
              faultMessageMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault1"),"com.oracle.xmlns.oxp.service.publicreportservice.Fault1");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault"),"com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault"),"com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException");
              faultMessageMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault"),"com.oracle.xmlns.oxp.service.publicreportservice.Fault");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault2"),"com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault2"),"com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException");
              faultMessageMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault2"),"com.oracle.xmlns.oxp.service.publicreportservice.Fault2");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault1"),"com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault1"),"com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException");
              faultMessageMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault1"),"com.oracle.xmlns.oxp.service.publicreportservice.Fault1");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault"),"com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault"),"com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException");
              faultMessageMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault"),"com.oracle.xmlns.oxp.service.publicreportservice.Fault");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault2"),"com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault2"),"com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException");
              faultMessageMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault2"),"com.oracle.xmlns.oxp.service.publicreportservice.Fault2");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault1"),"com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault1"),"com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException");
              faultMessageMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault1"),"com.oracle.xmlns.oxp.service.publicreportservice.Fault1");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault"),"com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault"),"com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException");
              faultMessageMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault"),"com.oracle.xmlns.oxp.service.publicreportservice.Fault");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault1"),"com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault1"),"com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException");
              faultMessageMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault1"),"com.oracle.xmlns.oxp.service.publicreportservice.Fault1");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault"),"com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault"),"com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException");
              faultMessageMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault"),"com.oracle.xmlns.oxp.service.publicreportservice.Fault");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault2"),"com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault2"),"com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException");
              faultMessageMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault2"),"com.oracle.xmlns.oxp.service.publicreportservice.Fault2");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault1"),"com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault1"),"com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException");
              faultMessageMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault1"),"com.oracle.xmlns.oxp.service.publicreportservice.Fault1");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault"),"com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault"),"com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException");
              faultMessageMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault"),"com.oracle.xmlns.oxp.service.publicreportservice.Fault");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault2"),"com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault2"),"com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException");
              faultMessageMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault2"),"com.oracle.xmlns.oxp.service.publicreportservice.Fault2");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault1"),"com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault1"),"com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException");
              faultMessageMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault1"),"com.oracle.xmlns.oxp.service.publicreportservice.Fault1");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault"),"com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault"),"com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException");
              faultMessageMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault"),"com.oracle.xmlns.oxp.service.publicreportservice.Fault");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault2"),"com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault2"),"com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException");
              faultMessageMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault2"),"com.oracle.xmlns.oxp.service.publicreportservice.Fault2");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault1"),"com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault1"),"com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException");
              faultMessageMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault1"),"com.oracle.xmlns.oxp.service.publicreportservice.Fault1");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault"),"com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault"),"com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException");
              faultMessageMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault"),"com.oracle.xmlns.oxp.service.publicreportservice.Fault");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault2"),"com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault2"),"com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException");
              faultMessageMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault2"),"com.oracle.xmlns.oxp.service.publicreportservice.Fault2");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault1"),"com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault1"),"com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException");
              faultMessageMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault1"),"com.oracle.xmlns.oxp.service.publicreportservice.Fault1");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault"),"com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault"),"com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException");
              faultMessageMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault"),"com.oracle.xmlns.oxp.service.publicreportservice.Fault");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault2"),"com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault2"),"com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException");
              faultMessageMap.put( new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","fault2"),"com.oracle.xmlns.oxp.service.publicreportservice.Fault2");
           


    }

    /**
      *Constructor that takes in a configContext
      */

    public PublicReportServiceServiceStub(org.apache.axis2.context.ConfigurationContext configurationContext,
       java.lang.String targetEndpoint)
       throws org.apache.axis2.AxisFault {
         this(configurationContext,targetEndpoint,false);
   }


   /**
     * Constructor that takes in a configContext  and useseperate listner
     */
   public PublicReportServiceServiceStub(org.apache.axis2.context.ConfigurationContext configurationContext,
        java.lang.String targetEndpoint, boolean useSeparateListener)
        throws org.apache.axis2.AxisFault {
         //To populate AxisService
         populateAxisService();
         populateFaults();

        _serviceClient = new org.apache.axis2.client.ServiceClient(configurationContext,_service);
        
	
        configurationContext = _serviceClient.getServiceContext().getConfigurationContext();

        _serviceClient.getOptions().setTo(new org.apache.axis2.addressing.EndpointReference(
                targetEndpoint));
        _serviceClient.getOptions().setUseSeparateListener(useSeparateListener);
        
    
    }

    /**
     * Default Constructor
     */
    public PublicReportServiceServiceStub(org.apache.axis2.context.ConfigurationContext configurationContext) throws org.apache.axis2.AxisFault {
        
                    this(configurationContext,"https://192.168.28.73/xmlpserver/services/PublicReportService" );
                
    }

    /**
     * Default Constructor
     */
    public PublicReportServiceServiceStub() throws org.apache.axis2.AxisFault {
        
                    this("https://192.168.28.73/xmlpserver/services/PublicReportService" );
                
    }

    /**
     * Constructor taking the target endpoint
     */
    public PublicReportServiceServiceStub(java.lang.String targetEndpoint) throws org.apache.axis2.AxisFault {
        this(null,targetEndpoint);
    }



        
                    /**
                     * Auto generated method signature
                     * 
                     * @see com.oracle.xmlns.oxp.service.publicreportservice.PublicReportServiceService#deleteReportInSession
                     * @param deleteReportInSession0
                    
                     * @throws com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException : 
                     * @throws com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException : 
                     * @throws com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException : 
                     */

                    

                            public  com.oracle.xmlns.oxp.service.publicreportservice.DeleteReportInSessionResponse deleteReportInSession(

                            com.oracle.xmlns.oxp.service.publicreportservice.DeleteReportInSession deleteReportInSession0)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException
                        ,com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException
                        ,com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[0].getName());
              _operationClient.getOptions().setAction("\"\"");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    deleteReportInSession0,
                                                    optimizeContent(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService",
                                                    "deleteReportInSession")));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             com.oracle.xmlns.oxp.service.publicreportservice.DeleteReportInSessionResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (com.oracle.xmlns.oxp.service.publicreportservice.DeleteReportInSessionResponse)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(faultElt.getQName())){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex=
                                (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException){
                          throw (com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException)ex;
                        }
                        
                        if (ex instanceof com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException){
                          throw (com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException)ex;
                        }
                        
                        if (ex instanceof com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException){
                          throw (com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
            
                    /**
                     * Auto generated method signature
                     * 
                     * @see com.oracle.xmlns.oxp.service.publicreportservice.PublicReportServiceService#getSecurityModel
                     * @param getSecurityModel2
                    
                     */

                    

                            public  com.oracle.xmlns.oxp.service.publicreportservice.GetSecurityModelResponse getSecurityModel(

                            com.oracle.xmlns.oxp.service.publicreportservice.GetSecurityModel getSecurityModel2)
                        

                    throws java.rmi.RemoteException
                    
                    {
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[1].getName());
              _operationClient.getOptions().setAction("\"\"");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    getSecurityModel2,
                                                    optimizeContent(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService",
                                                    "getSecurityModel")));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             com.oracle.xmlns.oxp.service.publicreportservice.GetSecurityModelResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (com.oracle.xmlns.oxp.service.publicreportservice.GetSecurityModelResponse)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(faultElt.getQName())){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex=
                                (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
            
                    /**
                     * Auto generated method signature
                     * 
                     * @see com.oracle.xmlns.oxp.service.publicreportservice.PublicReportServiceService#getListOfScheduledReportsStatus
                     * @param getListOfScheduledReportsStatus4
                    
                     * @throws com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException : 
                     * @throws com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException : 
                     * @throws com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException : 
                     */

                    

                            public  com.oracle.xmlns.oxp.service.publicreportservice.GetListOfScheduledReportsStatusResponse getListOfScheduledReportsStatus(

                            com.oracle.xmlns.oxp.service.publicreportservice.GetListOfScheduledReportsStatus getListOfScheduledReportsStatus4)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException
                        ,com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException
                        ,com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[2].getName());
              _operationClient.getOptions().setAction("\"\"");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    getListOfScheduledReportsStatus4,
                                                    optimizeContent(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService",
                                                    "getListOfScheduledReportsStatus")));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             com.oracle.xmlns.oxp.service.publicreportservice.GetListOfScheduledReportsStatusResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (com.oracle.xmlns.oxp.service.publicreportservice.GetListOfScheduledReportsStatusResponse)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(faultElt.getQName())){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex=
                                (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException){
                          throw (com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException)ex;
                        }
                        
                        if (ex instanceof com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException){
                          throw (com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException)ex;
                        }
                        
                        if (ex instanceof com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException){
                          throw (com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
            
                    /**
                     * Auto generated method signature
                     * 
                     * @see com.oracle.xmlns.oxp.service.publicreportservice.PublicReportServiceService#deleteFolder
                     * @param deleteFolder6
                    
                     * @throws com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException : 
                     * @throws com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException : 
                     * @throws com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException : 
                     */

                    

                            public  com.oracle.xmlns.oxp.service.publicreportservice.DeleteFolderResponse deleteFolder(

                            com.oracle.xmlns.oxp.service.publicreportservice.DeleteFolder deleteFolder6)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException
                        ,com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException
                        ,com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[3].getName());
              _operationClient.getOptions().setAction("\"\"");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    deleteFolder6,
                                                    optimizeContent(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService",
                                                    "deleteFolder")));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             com.oracle.xmlns.oxp.service.publicreportservice.DeleteFolderResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (com.oracle.xmlns.oxp.service.publicreportservice.DeleteFolderResponse)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(faultElt.getQName())){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex=
                                (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException){
                          throw (com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException)ex;
                        }
                        
                        if (ex instanceof com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException){
                          throw (com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException)ex;
                        }
                        
                        if (ex instanceof com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException){
                          throw (com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
            
                    /**
                     * Auto generated method signature
                     * 
                     * @see com.oracle.xmlns.oxp.service.publicreportservice.PublicReportServiceService#getScheduledReportStatusInSession
                     * @param getScheduledReportStatusInSession8
                    
                     * @throws com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException : 
                     * @throws com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException : 
                     * @throws com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException : 
                     */

                    

                            public  com.oracle.xmlns.oxp.service.publicreportservice.GetScheduledReportStatusInSessionResponse getScheduledReportStatusInSession(

                            com.oracle.xmlns.oxp.service.publicreportservice.GetScheduledReportStatusInSession getScheduledReportStatusInSession8)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException
                        ,com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException
                        ,com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[4].getName());
              _operationClient.getOptions().setAction("\"\"");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    getScheduledReportStatusInSession8,
                                                    optimizeContent(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService",
                                                    "getScheduledReportStatusInSession")));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             com.oracle.xmlns.oxp.service.publicreportservice.GetScheduledReportStatusInSessionResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (com.oracle.xmlns.oxp.service.publicreportservice.GetScheduledReportStatusInSessionResponse)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(faultElt.getQName())){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex=
                                (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException){
                          throw (com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException)ex;
                        }
                        
                        if (ex instanceof com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException){
                          throw (com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException)ex;
                        }
                        
                        if (ex instanceof com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException){
                          throw (com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
            
                    /**
                     * Auto generated method signature
                     * 
                     * @see com.oracle.xmlns.oxp.service.publicreportservice.PublicReportServiceService#createReport
                     * @param createReport10
                    
                     * @throws com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException : 
                     * @throws com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException : 
                     * @throws com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException : 
                     */

                    

                            public  com.oracle.xmlns.oxp.service.publicreportservice.CreateReportResponse createReport(

                            com.oracle.xmlns.oxp.service.publicreportservice.CreateReport createReport10)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException
                        ,com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException
                        ,com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[5].getName());
              _operationClient.getOptions().setAction("\"\"");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    createReport10,
                                                    optimizeContent(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService",
                                                    "createReport")));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             com.oracle.xmlns.oxp.service.publicreportservice.CreateReportResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (com.oracle.xmlns.oxp.service.publicreportservice.CreateReportResponse)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(faultElt.getQName())){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex=
                                (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException){
                          throw (com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException)ex;
                        }
                        
                        if (ex instanceof com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException){
                          throw (com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException)ex;
                        }
                        
                        if (ex instanceof com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException){
                          throw (com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
            
                    /**
                     * Auto generated method signature
                     * 
                     * @see com.oracle.xmlns.oxp.service.publicreportservice.PublicReportServiceService#getScheduledReportHistoryInfoInSession
                     * @param getScheduledReportHistoryInfoInSession12
                    
                     * @throws com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException : 
                     * @throws com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException : 
                     * @throws com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException : 
                     */

                    

                            public  com.oracle.xmlns.oxp.service.publicreportservice.GetScheduledReportHistoryInfoInSessionResponse getScheduledReportHistoryInfoInSession(

                            com.oracle.xmlns.oxp.service.publicreportservice.GetScheduledReportHistoryInfoInSession getScheduledReportHistoryInfoInSession12)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException
                        ,com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException
                        ,com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[6].getName());
              _operationClient.getOptions().setAction("\"\"");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    getScheduledReportHistoryInfoInSession12,
                                                    optimizeContent(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService",
                                                    "getScheduledReportHistoryInfoInSession")));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             com.oracle.xmlns.oxp.service.publicreportservice.GetScheduledReportHistoryInfoInSessionResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (com.oracle.xmlns.oxp.service.publicreportservice.GetScheduledReportHistoryInfoInSessionResponse)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(faultElt.getQName())){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex=
                                (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException){
                          throw (com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException)ex;
                        }
                        
                        if (ex instanceof com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException){
                          throw (com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException)ex;
                        }
                        
                        if (ex instanceof com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException){
                          throw (com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
            
                    /**
                     * Auto generated method signature
                     * 
                     * @see com.oracle.xmlns.oxp.service.publicreportservice.PublicReportServiceService#getScheduledReportHistoryInfo
                     * @param getScheduledReportHistoryInfo14
                    
                     * @throws com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException : 
                     * @throws com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException : 
                     * @throws com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException : 
                     */

                    

                            public  com.oracle.xmlns.oxp.service.publicreportservice.GetScheduledReportHistoryInfoResponse getScheduledReportHistoryInfo(

                            com.oracle.xmlns.oxp.service.publicreportservice.GetScheduledReportHistoryInfo getScheduledReportHistoryInfo14)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException
                        ,com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException
                        ,com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[7].getName());
              _operationClient.getOptions().setAction("\"\"");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    getScheduledReportHistoryInfo14,
                                                    optimizeContent(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService",
                                                    "getScheduledReportHistoryInfo")));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             com.oracle.xmlns.oxp.service.publicreportservice.GetScheduledReportHistoryInfoResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (com.oracle.xmlns.oxp.service.publicreportservice.GetScheduledReportHistoryInfoResponse)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(faultElt.getQName())){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex=
                                (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException){
                          throw (com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException)ex;
                        }
                        
                        if (ex instanceof com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException){
                          throw (com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException)ex;
                        }
                        
                        if (ex instanceof com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException){
                          throw (com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
            
                    /**
                     * Auto generated method signature
                     * 
                     * @see com.oracle.xmlns.oxp.service.publicreportservice.PublicReportServiceService#deleteReport
                     * @param deleteReport16
                    
                     * @throws com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException : 
                     * @throws com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException : 
                     * @throws com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException : 
                     */

                    

                            public  com.oracle.xmlns.oxp.service.publicreportservice.DeleteReportResponse deleteReport(

                            com.oracle.xmlns.oxp.service.publicreportservice.DeleteReport deleteReport16)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException
                        ,com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException
                        ,com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[8].getName());
              _operationClient.getOptions().setAction("\"\"");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    deleteReport16,
                                                    optimizeContent(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService",
                                                    "deleteReport")));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             com.oracle.xmlns.oxp.service.publicreportservice.DeleteReportResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (com.oracle.xmlns.oxp.service.publicreportservice.DeleteReportResponse)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(faultElt.getQName())){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex=
                                (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException){
                          throw (com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException)ex;
                        }
                        
                        if (ex instanceof com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException){
                          throw (com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException)ex;
                        }
                        
                        if (ex instanceof com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException){
                          throw (com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
            
                    /**
                     * Auto generated method signature
                     * 
                     * @see com.oracle.xmlns.oxp.service.publicreportservice.PublicReportServiceService#impersonate
                     * @param impersonate18
                    
                     * @throws com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException : 
                     */

                    

                            public  com.oracle.xmlns.oxp.service.publicreportservice.ImpersonateResponse impersonate(

                            com.oracle.xmlns.oxp.service.publicreportservice.Impersonate impersonate18)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[9].getName());
              _operationClient.getOptions().setAction("\"\"");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    impersonate18,
                                                    optimizeContent(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService",
                                                    "impersonate")));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             com.oracle.xmlns.oxp.service.publicreportservice.ImpersonateResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (com.oracle.xmlns.oxp.service.publicreportservice.ImpersonateResponse)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(faultElt.getQName())){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex=
                                (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException){
                          throw (com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
            
                    /**
                     * Auto generated method signature
                     * 
                     * @see com.oracle.xmlns.oxp.service.publicreportservice.PublicReportServiceService#isFolderExist
                     * @param isFolderExist20
                    
                     * @throws com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException : 
                     */

                    

                            public  com.oracle.xmlns.oxp.service.publicreportservice.IsFolderExistResponse isFolderExist(

                            com.oracle.xmlns.oxp.service.publicreportservice.IsFolderExist isFolderExist20)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[10].getName());
              _operationClient.getOptions().setAction("\"\"");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    isFolderExist20,
                                                    optimizeContent(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService",
                                                    "isFolderExist")));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             com.oracle.xmlns.oxp.service.publicreportservice.IsFolderExistResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (com.oracle.xmlns.oxp.service.publicreportservice.IsFolderExistResponse)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(faultElt.getQName())){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex=
                                (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException){
                          throw (com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
            
                    /**
                     * Auto generated method signature
                     * 
                     * @see com.oracle.xmlns.oxp.service.publicreportservice.PublicReportServiceService#hasReportAccess
                     * @param hasReportAccess22
                    
                     * @throws com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException : 
                     */

                    

                            public  com.oracle.xmlns.oxp.service.publicreportservice.HasReportAccessResponse hasReportAccess(

                            com.oracle.xmlns.oxp.service.publicreportservice.HasReportAccess hasReportAccess22)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[11].getName());
              _operationClient.getOptions().setAction("\"\"");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    hasReportAccess22,
                                                    optimizeContent(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService",
                                                    "hasReportAccess")));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             com.oracle.xmlns.oxp.service.publicreportservice.HasReportAccessResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (com.oracle.xmlns.oxp.service.publicreportservice.HasReportAccessResponse)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(faultElt.getQName())){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex=
                                (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException){
                          throw (com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
            
                    /**
                     * Auto generated method signature
                     * 
                     * @see com.oracle.xmlns.oxp.service.publicreportservice.PublicReportServiceService#isFolderExistInSession
                     * @param isFolderExistInSession24
                    
                     * @throws com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException : 
                     */

                    

                            public  com.oracle.xmlns.oxp.service.publicreportservice.IsFolderExistInSessionResponse isFolderExistInSession(

                            com.oracle.xmlns.oxp.service.publicreportservice.IsFolderExistInSession isFolderExistInSession24)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[12].getName());
              _operationClient.getOptions().setAction("\"\"");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    isFolderExistInSession24,
                                                    optimizeContent(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService",
                                                    "isFolderExistInSession")));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             com.oracle.xmlns.oxp.service.publicreportservice.IsFolderExistInSessionResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (com.oracle.xmlns.oxp.service.publicreportservice.IsFolderExistInSessionResponse)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(faultElt.getQName())){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex=
                                (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException){
                          throw (com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
            
                    /**
                     * Auto generated method signature
                     * 
                     * @see com.oracle.xmlns.oxp.service.publicreportservice.PublicReportServiceService#isReportExistInSession
                     * @param isReportExistInSession26
                    
                     * @throws com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException : 
                     */

                    

                            public  com.oracle.xmlns.oxp.service.publicreportservice.IsReportExistInSessionResponse isReportExistInSession(

                            com.oracle.xmlns.oxp.service.publicreportservice.IsReportExistInSession isReportExistInSession26)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[13].getName());
              _operationClient.getOptions().setAction("\"\"");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    isReportExistInSession26,
                                                    optimizeContent(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService",
                                                    "isReportExistInSession")));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             com.oracle.xmlns.oxp.service.publicreportservice.IsReportExistInSessionResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (com.oracle.xmlns.oxp.service.publicreportservice.IsReportExistInSessionResponse)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(faultElt.getQName())){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex=
                                (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException){
                          throw (com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
            
                    /**
                     * Auto generated method signature
                     * 
                     * @see com.oracle.xmlns.oxp.service.publicreportservice.PublicReportServiceService#resumeScheduledReportInSession
                     * @param resumeScheduledReportInSession28
                    
                     * @throws com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException : 
                     * @throws com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException : 
                     * @throws com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException : 
                     */

                    

                            public  com.oracle.xmlns.oxp.service.publicreportservice.ResumeScheduledReportInSessionResponse resumeScheduledReportInSession(

                            com.oracle.xmlns.oxp.service.publicreportservice.ResumeScheduledReportInSession resumeScheduledReportInSession28)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException
                        ,com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException
                        ,com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[14].getName());
              _operationClient.getOptions().setAction("\"\"");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    resumeScheduledReportInSession28,
                                                    optimizeContent(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService",
                                                    "resumeScheduledReportInSession")));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             com.oracle.xmlns.oxp.service.publicreportservice.ResumeScheduledReportInSessionResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (com.oracle.xmlns.oxp.service.publicreportservice.ResumeScheduledReportInSessionResponse)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(faultElt.getQName())){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex=
                                (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException){
                          throw (com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException)ex;
                        }
                        
                        if (ex instanceof com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException){
                          throw (com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException)ex;
                        }
                        
                        if (ex instanceof com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException){
                          throw (com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
            
                    /**
                     * Auto generated method signature
                     * 
                     * @see com.oracle.xmlns.oxp.service.publicreportservice.PublicReportServiceService#getFolderContentsInSession
                     * @param getFolderContentsInSession30
                    
                     * @throws com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException : 
                     * @throws com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException : 
                     * @throws com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException : 
                     */

                    

                            public  com.oracle.xmlns.oxp.service.publicreportservice.GetFolderContentsInSessionResponse getFolderContentsInSession(

                            com.oracle.xmlns.oxp.service.publicreportservice.GetFolderContentsInSession getFolderContentsInSession30)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException
                        ,com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException
                        ,com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[15].getName());
              _operationClient.getOptions().setAction("\"\"");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    getFolderContentsInSession30,
                                                    optimizeContent(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService",
                                                    "getFolderContentsInSession")));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             com.oracle.xmlns.oxp.service.publicreportservice.GetFolderContentsInSessionResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (com.oracle.xmlns.oxp.service.publicreportservice.GetFolderContentsInSessionResponse)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(faultElt.getQName())){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex=
                                (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException){
                          throw (com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException)ex;
                        }
                        
                        if (ex instanceof com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException){
                          throw (com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException)ex;
                        }
                        
                        if (ex instanceof com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException){
                          throw (com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
            
                    /**
                     * Auto generated method signature
                     * 
                     * @see com.oracle.xmlns.oxp.service.publicreportservice.PublicReportServiceService#runReport
                     * @param runReport32
                    
                     * @throws com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException : 
                     * @throws com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException : 
                     * @throws com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException : 
                     */

                    

                            public  com.oracle.xmlns.oxp.service.publicreportservice.RunReportResponse runReport(

                            com.oracle.xmlns.oxp.service.publicreportservice.RunReport runReport32)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException
                        ,com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException
                        ,com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[16].getName());
              _operationClient.getOptions().setAction("\"\"");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    runReport32,
                                                    optimizeContent(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService",
                                                    "runReport")));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             com.oracle.xmlns.oxp.service.publicreportservice.RunReportResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (com.oracle.xmlns.oxp.service.publicreportservice.RunReportResponse)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(faultElt.getQName())){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex=
                                (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException){
                          throw (com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException)ex;
                        }
                        
                        if (ex instanceof com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException){
                          throw (com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException)ex;
                        }
                        
                        if (ex instanceof com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException){
                          throw (com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
            
                    /**
                     * Auto generated method signature
                     * 
                     * @see com.oracle.xmlns.oxp.service.publicreportservice.PublicReportServiceService#scheduleReport
                     * @param scheduleReport34
                    
                     * @throws com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException : 
                     * @throws com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException : 
                     * @throws com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException : 
                     */

                    

                            public  com.oracle.xmlns.oxp.service.publicreportservice.ScheduleReportResponse scheduleReport(

                            com.oracle.xmlns.oxp.service.publicreportservice.ScheduleReport scheduleReport34)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException
                        ,com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException
                        ,com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[17].getName());
              _operationClient.getOptions().setAction("\"\"");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    scheduleReport34,
                                                    optimizeContent(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService",
                                                    "scheduleReport")));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             com.oracle.xmlns.oxp.service.publicreportservice.ScheduleReportResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (com.oracle.xmlns.oxp.service.publicreportservice.ScheduleReportResponse)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(faultElt.getQName())){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex=
                                (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException){
                          throw (com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException)ex;
                        }
                        
                        if (ex instanceof com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException){
                          throw (com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException)ex;
                        }
                        
                        if (ex instanceof com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException){
                          throw (com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
            
                    /**
                     * Auto generated method signature
                     * 
                     * @see com.oracle.xmlns.oxp.service.publicreportservice.PublicReportServiceService#updateReportDefinitionInSession
                     * @param updateReportDefinitionInSession36
                    
                     * @throws com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException : 
                     * @throws com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException : 
                     * @throws com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException : 
                     */

                    

                            public  com.oracle.xmlns.oxp.service.publicreportservice.UpdateReportDefinitionInSessionResponse updateReportDefinitionInSession(

                            com.oracle.xmlns.oxp.service.publicreportservice.UpdateReportDefinitionInSession updateReportDefinitionInSession36)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException
                        ,com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException
                        ,com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[18].getName());
              _operationClient.getOptions().setAction("\"\"");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    updateReportDefinitionInSession36,
                                                    optimizeContent(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService",
                                                    "updateReportDefinitionInSession")));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             com.oracle.xmlns.oxp.service.publicreportservice.UpdateReportDefinitionInSessionResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (com.oracle.xmlns.oxp.service.publicreportservice.UpdateReportDefinitionInSessionResponse)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(faultElt.getQName())){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex=
                                (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException){
                          throw (com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException)ex;
                        }
                        
                        if (ex instanceof com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException){
                          throw (com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException)ex;
                        }
                        
                        if (ex instanceof com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException){
                          throw (com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
            
                    /**
                     * Auto generated method signature
                     * 
                     * @see com.oracle.xmlns.oxp.service.publicreportservice.PublicReportServiceService#deleteScheduledReportInSession
                     * @param deleteScheduledReportInSession38
                    
                     * @throws com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException : 
                     * @throws com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException : 
                     * @throws com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException : 
                     */

                    

                            public  com.oracle.xmlns.oxp.service.publicreportservice.DeleteScheduledReportInSessionResponse deleteScheduledReportInSession(

                            com.oracle.xmlns.oxp.service.publicreportservice.DeleteScheduledReportInSession deleteScheduledReportInSession38)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException
                        ,com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException
                        ,com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[19].getName());
              _operationClient.getOptions().setAction("\"\"");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    deleteScheduledReportInSession38,
                                                    optimizeContent(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService",
                                                    "deleteScheduledReportInSession")));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             com.oracle.xmlns.oxp.service.publicreportservice.DeleteScheduledReportInSessionResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (com.oracle.xmlns.oxp.service.publicreportservice.DeleteScheduledReportInSessionResponse)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(faultElt.getQName())){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex=
                                (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException){
                          throw (com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException)ex;
                        }
                        
                        if (ex instanceof com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException){
                          throw (com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException)ex;
                        }
                        
                        if (ex instanceof com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException){
                          throw (com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
            
                    /**
                     * Auto generated method signature
                     * 
                     * @see com.oracle.xmlns.oxp.service.publicreportservice.PublicReportServiceService#downloadReport
                     * @param downloadReport40
                    
                     * @throws com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException : 
                     * @throws com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException : 
                     * @throws com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException : 
                     */

                    

                            public  com.oracle.xmlns.oxp.service.publicreportservice.DownloadReportResponse downloadReport(

                            com.oracle.xmlns.oxp.service.publicreportservice.DownloadReport downloadReport40)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException
                        ,com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException
                        ,com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[20].getName());
              _operationClient.getOptions().setAction("\"\"");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    downloadReport40,
                                                    optimizeContent(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService",
                                                    "downloadReport")));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             com.oracle.xmlns.oxp.service.publicreportservice.DownloadReportResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (com.oracle.xmlns.oxp.service.publicreportservice.DownloadReportResponse)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(faultElt.getQName())){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex=
                                (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException){
                          throw (com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException)ex;
                        }
                        
                        if (ex instanceof com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException){
                          throw (com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException)ex;
                        }
                        
                        if (ex instanceof com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException){
                          throw (com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
            
                    /**
                     * Auto generated method signature
                     * 
                     * @see com.oracle.xmlns.oxp.service.publicreportservice.PublicReportServiceService#uploadReportInSession
                     * @param uploadReportInSession42
                    
                     * @throws com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException : 
                     * @throws com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException : 
                     * @throws com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException : 
                     */

                    

                            public  com.oracle.xmlns.oxp.service.publicreportservice.UploadReportInSessionResponse uploadReportInSession(

                            com.oracle.xmlns.oxp.service.publicreportservice.UploadReportInSession uploadReportInSession42)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException
                        ,com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException
                        ,com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[21].getName());
              _operationClient.getOptions().setAction("\"\"");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    uploadReportInSession42,
                                                    optimizeContent(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService",
                                                    "uploadReportInSession")));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             com.oracle.xmlns.oxp.service.publicreportservice.UploadReportInSessionResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (com.oracle.xmlns.oxp.service.publicreportservice.UploadReportInSessionResponse)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(faultElt.getQName())){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex=
                                (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException){
                          throw (com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException)ex;
                        }
                        
                        if (ex instanceof com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException){
                          throw (com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException)ex;
                        }
                        
                        if (ex instanceof com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException){
                          throw (com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
            
                    /**
                     * Auto generated method signature
                     * 
                     * @see com.oracle.xmlns.oxp.service.publicreportservice.PublicReportServiceService#resumeScheduledReport
                     * @param resumeScheduledReport44
                    
                     * @throws com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException : 
                     * @throws com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException : 
                     * @throws com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException : 
                     */

                    

                            public  com.oracle.xmlns.oxp.service.publicreportservice.ResumeScheduledReportResponse resumeScheduledReport(

                            com.oracle.xmlns.oxp.service.publicreportservice.ResumeScheduledReport resumeScheduledReport44)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException
                        ,com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException
                        ,com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[22].getName());
              _operationClient.getOptions().setAction("\"\"");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    resumeScheduledReport44,
                                                    optimizeContent(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService",
                                                    "resumeScheduledReport")));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             com.oracle.xmlns.oxp.service.publicreportservice.ResumeScheduledReportResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (com.oracle.xmlns.oxp.service.publicreportservice.ResumeScheduledReportResponse)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(faultElt.getQName())){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex=
                                (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException){
                          throw (com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException)ex;
                        }
                        
                        if (ex instanceof com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException){
                          throw (com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException)ex;
                        }
                        
                        if (ex instanceof com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException){
                          throw (com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
            
                    /**
                     * Auto generated method signature
                     * 
                     * @see com.oracle.xmlns.oxp.service.publicreportservice.PublicReportServiceService#deleteScheduledReportHistory
                     * @param deleteScheduledReportHistory46
                    
                     * @throws com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException : 
                     * @throws com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException : 
                     * @throws com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException : 
                     */

                    

                            public  com.oracle.xmlns.oxp.service.publicreportservice.DeleteScheduledReportHistoryResponse deleteScheduledReportHistory(

                            com.oracle.xmlns.oxp.service.publicreportservice.DeleteScheduledReportHistory deleteScheduledReportHistory46)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException
                        ,com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException
                        ,com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[23].getName());
              _operationClient.getOptions().setAction("\"\"");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    deleteScheduledReportHistory46,
                                                    optimizeContent(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService",
                                                    "deleteScheduledReportHistory")));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             com.oracle.xmlns.oxp.service.publicreportservice.DeleteScheduledReportHistoryResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (com.oracle.xmlns.oxp.service.publicreportservice.DeleteScheduledReportHistoryResponse)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(faultElt.getQName())){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex=
                                (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException){
                          throw (com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException)ex;
                        }
                        
                        if (ex instanceof com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException){
                          throw (com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException)ex;
                        }
                        
                        if (ex instanceof com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException){
                          throw (com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
            
                    /**
                     * Auto generated method signature
                     * 
                     * @see com.oracle.xmlns.oxp.service.publicreportservice.PublicReportServiceService#runReportInSession
                     * @param runReportInSession48
                    
                     * @throws com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException : 
                     * @throws com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException : 
                     * @throws com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException : 
                     */

                    

                            public  com.oracle.xmlns.oxp.service.publicreportservice.RunReportInSessionResponse runReportInSession(

                            com.oracle.xmlns.oxp.service.publicreportservice.RunReportInSession runReportInSession48)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException
                        ,com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException
                        ,com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[24].getName());
              _operationClient.getOptions().setAction("\"\"");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    runReportInSession48,
                                                    optimizeContent(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService",
                                                    "runReportInSession")));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             com.oracle.xmlns.oxp.service.publicreportservice.RunReportInSessionResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (com.oracle.xmlns.oxp.service.publicreportservice.RunReportInSessionResponse)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(faultElt.getQName())){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex=
                                (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException){
                          throw (com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException)ex;
                        }
                        
                        if (ex instanceof com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException){
                          throw (com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException)ex;
                        }
                        
                        if (ex instanceof com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException){
                          throw (com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
            
                    /**
                     * Auto generated method signature
                     * 
                     * @see com.oracle.xmlns.oxp.service.publicreportservice.PublicReportServiceService#downloadReportInSession
                     * @param downloadReportInSession50
                    
                     * @throws com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException : 
                     * @throws com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException : 
                     * @throws com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException : 
                     */

                    

                            public  com.oracle.xmlns.oxp.service.publicreportservice.DownloadReportInSessionResponse downloadReportInSession(

                            com.oracle.xmlns.oxp.service.publicreportservice.DownloadReportInSession downloadReportInSession50)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException
                        ,com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException
                        ,com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[25].getName());
              _operationClient.getOptions().setAction("\"\"");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    downloadReportInSession50,
                                                    optimizeContent(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService",
                                                    "downloadReportInSession")));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             com.oracle.xmlns.oxp.service.publicreportservice.DownloadReportInSessionResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (com.oracle.xmlns.oxp.service.publicreportservice.DownloadReportInSessionResponse)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(faultElt.getQName())){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex=
                                (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException){
                          throw (com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException)ex;
                        }
                        
                        if (ex instanceof com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException){
                          throw (com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException)ex;
                        }
                        
                        if (ex instanceof com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException){
                          throw (com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
            
                    /**
                     * Auto generated method signature
                     * 
                     * @see com.oracle.xmlns.oxp.service.publicreportservice.PublicReportServiceService#createReportInSession
                     * @param createReportInSession52
                    
                     * @throws com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException : 
                     * @throws com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException : 
                     * @throws com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException : 
                     */

                    

                            public  com.oracle.xmlns.oxp.service.publicreportservice.CreateReportInSessionResponse createReportInSession(

                            com.oracle.xmlns.oxp.service.publicreportservice.CreateReportInSession createReportInSession52)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException
                        ,com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException
                        ,com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[26].getName());
              _operationClient.getOptions().setAction("\"\"");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    createReportInSession52,
                                                    optimizeContent(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService",
                                                    "createReportInSession")));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             com.oracle.xmlns.oxp.service.publicreportservice.CreateReportInSessionResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (com.oracle.xmlns.oxp.service.publicreportservice.CreateReportInSessionResponse)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(faultElt.getQName())){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex=
                                (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException){
                          throw (com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException)ex;
                        }
                        
                        if (ex instanceof com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException){
                          throw (com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException)ex;
                        }
                        
                        if (ex instanceof com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException){
                          throw (com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
            
                    /**
                     * Auto generated method signature
                     * 
                     * @see com.oracle.xmlns.oxp.service.publicreportservice.PublicReportServiceService#downloadReportDataChunk
                     * @param downloadReportDataChunk54
                    
                     * @throws com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException : 
                     */

                    

                            public  com.oracle.xmlns.oxp.service.publicreportservice.DownloadReportDataChunkResponse downloadReportDataChunk(

                            com.oracle.xmlns.oxp.service.publicreportservice.DownloadReportDataChunk downloadReportDataChunk54)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[27].getName());
              _operationClient.getOptions().setAction("\"\"");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    downloadReportDataChunk54,
                                                    optimizeContent(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService",
                                                    "downloadReportDataChunk")));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             com.oracle.xmlns.oxp.service.publicreportservice.DownloadReportDataChunkResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (com.oracle.xmlns.oxp.service.publicreportservice.DownloadReportDataChunkResponse)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(faultElt.getQName())){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex=
                                (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException){
                          throw (com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
            
                    /**
                     * Auto generated method signature
                     * 
                     * @see com.oracle.xmlns.oxp.service.publicreportservice.PublicReportServiceService#getScheduledReportStatus
                     * @param getScheduledReportStatus56
                    
                     * @throws com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException : 
                     * @throws com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException : 
                     * @throws com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException : 
                     */

                    

                            public  com.oracle.xmlns.oxp.service.publicreportservice.GetScheduledReportStatusResponse getScheduledReportStatus(

                            com.oracle.xmlns.oxp.service.publicreportservice.GetScheduledReportStatus getScheduledReportStatus56)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException
                        ,com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException
                        ,com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[28].getName());
              _operationClient.getOptions().setAction("\"\"");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    getScheduledReportStatus56,
                                                    optimizeContent(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService",
                                                    "getScheduledReportStatus")));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             com.oracle.xmlns.oxp.service.publicreportservice.GetScheduledReportStatusResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (com.oracle.xmlns.oxp.service.publicreportservice.GetScheduledReportStatusResponse)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(faultElt.getQName())){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex=
                                (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException){
                          throw (com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException)ex;
                        }
                        
                        if (ex instanceof com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException){
                          throw (com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException)ex;
                        }
                        
                        if (ex instanceof com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException){
                          throw (com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
            
                    /**
                     * Auto generated method signature
                     * 
                     * @see com.oracle.xmlns.oxp.service.publicreportservice.PublicReportServiceService#getReportDefinition
                     * @param getReportDefinition58
                    
                     * @throws com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException : 
                     * @throws com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException : 
                     * @throws com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException : 
                     */

                    

                            public  com.oracle.xmlns.oxp.service.publicreportservice.GetReportDefinitionResponse getReportDefinition(

                            com.oracle.xmlns.oxp.service.publicreportservice.GetReportDefinition getReportDefinition58)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException
                        ,com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException
                        ,com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[29].getName());
              _operationClient.getOptions().setAction("\"\"");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    getReportDefinition58,
                                                    optimizeContent(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService",
                                                    "getReportDefinition")));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             com.oracle.xmlns.oxp.service.publicreportservice.GetReportDefinitionResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (com.oracle.xmlns.oxp.service.publicreportservice.GetReportDefinitionResponse)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(faultElt.getQName())){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex=
                                (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException){
                          throw (com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException)ex;
                        }
                        
                        if (ex instanceof com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException){
                          throw (com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException)ex;
                        }
                        
                        if (ex instanceof com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException){
                          throw (com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
            
                    /**
                     * Auto generated method signature
                     * 
                     * @see com.oracle.xmlns.oxp.service.publicreportservice.PublicReportServiceService#uploadReportDataChunk
                     * @param uploadReportDataChunk60
                    
                     * @throws com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException : 
                     */

                    

                            public  com.oracle.xmlns.oxp.service.publicreportservice.UploadReportDataChunkResponse uploadReportDataChunk(

                            com.oracle.xmlns.oxp.service.publicreportservice.UploadReportDataChunk uploadReportDataChunk60)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[30].getName());
              _operationClient.getOptions().setAction("\"\"");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    uploadReportDataChunk60,
                                                    optimizeContent(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService",
                                                    "uploadReportDataChunk")));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             com.oracle.xmlns.oxp.service.publicreportservice.UploadReportDataChunkResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (com.oracle.xmlns.oxp.service.publicreportservice.UploadReportDataChunkResponse)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(faultElt.getQName())){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex=
                                (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException){
                          throw (com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
            
                    /**
                     * Auto generated method signature
                     * 
                     * @see com.oracle.xmlns.oxp.service.publicreportservice.PublicReportServiceService#login
                     * @param login62
                    
                     * @throws com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException : 
                     */

                    

                            public  com.oracle.xmlns.oxp.service.publicreportservice.LoginResponse login(

                            com.oracle.xmlns.oxp.service.publicreportservice.Login login62)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[31].getName());
              _operationClient.getOptions().setAction("\"\"");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    login62,
                                                    optimizeContent(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService",
                                                    "login")));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             com.oracle.xmlns.oxp.service.publicreportservice.LoginResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (com.oracle.xmlns.oxp.service.publicreportservice.LoginResponse)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(faultElt.getQName())){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex=
                                (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException){
                          throw (com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
            
                    /**
                     * Auto generated method signature
                     * 
                     * @see com.oracle.xmlns.oxp.service.publicreportservice.PublicReportServiceService#createReportFolder
                     * @param createReportFolder64
                    
                     * @throws com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException : 
                     * @throws com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException : 
                     * @throws com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException : 
                     */

                    

                            public  com.oracle.xmlns.oxp.service.publicreportservice.CreateReportFolderResponse createReportFolder(

                            com.oracle.xmlns.oxp.service.publicreportservice.CreateReportFolder createReportFolder64)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException
                        ,com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException
                        ,com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[32].getName());
              _operationClient.getOptions().setAction("\"\"");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    createReportFolder64,
                                                    optimizeContent(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService",
                                                    "createReportFolder")));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             com.oracle.xmlns.oxp.service.publicreportservice.CreateReportFolderResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (com.oracle.xmlns.oxp.service.publicreportservice.CreateReportFolderResponse)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(faultElt.getQName())){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex=
                                (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException){
                          throw (com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException)ex;
                        }
                        
                        if (ex instanceof com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException){
                          throw (com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException)ex;
                        }
                        
                        if (ex instanceof com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException){
                          throw (com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
            
                    /**
                     * Auto generated method signature
                     * 
                     * @see com.oracle.xmlns.oxp.service.publicreportservice.PublicReportServiceService#updateReportDefinition
                     * @param updateReportDefinition66
                    
                     * @throws com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException : 
                     * @throws com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException : 
                     * @throws com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException : 
                     */

                    

                            public  com.oracle.xmlns.oxp.service.publicreportservice.UpdateReportDefinitionResponse updateReportDefinition(

                            com.oracle.xmlns.oxp.service.publicreportservice.UpdateReportDefinition updateReportDefinition66)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException
                        ,com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException
                        ,com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[33].getName());
              _operationClient.getOptions().setAction("\"\"");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    updateReportDefinition66,
                                                    optimizeContent(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService",
                                                    "updateReportDefinition")));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             com.oracle.xmlns.oxp.service.publicreportservice.UpdateReportDefinitionResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (com.oracle.xmlns.oxp.service.publicreportservice.UpdateReportDefinitionResponse)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(faultElt.getQName())){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex=
                                (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException){
                          throw (com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException)ex;
                        }
                        
                        if (ex instanceof com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException){
                          throw (com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException)ex;
                        }
                        
                        if (ex instanceof com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException){
                          throw (com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
            
                    /**
                     * Auto generated method signature
                     * 
                     * @see com.oracle.xmlns.oxp.service.publicreportservice.PublicReportServiceService#validateLogin
                     * @param validateLogin68
                    
                     */

                    

                            public  com.oracle.xmlns.oxp.service.publicreportservice.ValidateLoginResponse validateLogin(

                            com.oracle.xmlns.oxp.service.publicreportservice.ValidateLogin validateLogin68)
                        

                    throws java.rmi.RemoteException
                    
                    {
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[34].getName());
              _operationClient.getOptions().setAction("\"\"");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    validateLogin68,
                                                    optimizeContent(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService",
                                                    "validateLogin")));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             com.oracle.xmlns.oxp.service.publicreportservice.ValidateLoginResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (com.oracle.xmlns.oxp.service.publicreportservice.ValidateLoginResponse)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(faultElt.getQName())){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex=
                                (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
            
                    /**
                     * Auto generated method signature
                     * 
                     * @see com.oracle.xmlns.oxp.service.publicreportservice.PublicReportServiceService#uploadTemplateForReportInSession
                     * @param uploadTemplateForReportInSession70
                    
                     * @throws com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException : 
                     * @throws com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException : 
                     * @throws com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException : 
                     */

                    

                            public  com.oracle.xmlns.oxp.service.publicreportservice.UploadTemplateForReportInSessionResponse uploadTemplateForReportInSession(

                            com.oracle.xmlns.oxp.service.publicreportservice.UploadTemplateForReportInSession uploadTemplateForReportInSession70)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException
                        ,com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException
                        ,com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[35].getName());
              _operationClient.getOptions().setAction("\"\"");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    uploadTemplateForReportInSession70,
                                                    optimizeContent(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService",
                                                    "uploadTemplateForReportInSession")));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             com.oracle.xmlns.oxp.service.publicreportservice.UploadTemplateForReportInSessionResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (com.oracle.xmlns.oxp.service.publicreportservice.UploadTemplateForReportInSessionResponse)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(faultElt.getQName())){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex=
                                (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException){
                          throw (com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException)ex;
                        }
                        
                        if (ex instanceof com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException){
                          throw (com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException)ex;
                        }
                        
                        if (ex instanceof com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException){
                          throw (com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
            
                    /**
                     * Auto generated method signature
                     * 
                     * @see com.oracle.xmlns.oxp.service.publicreportservice.PublicReportServiceService#getScheduledReportInfoInSession
                     * @param getScheduledReportInfoInSession72
                    
                     * @throws com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException : 
                     * @throws com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException : 
                     * @throws com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException : 
                     */

                    

                            public  com.oracle.xmlns.oxp.service.publicreportservice.GetScheduledReportInfoInSessionResponse getScheduledReportInfoInSession(

                            com.oracle.xmlns.oxp.service.publicreportservice.GetScheduledReportInfoInSession getScheduledReportInfoInSession72)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException
                        ,com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException
                        ,com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[36].getName());
              _operationClient.getOptions().setAction("\"\"");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    getScheduledReportInfoInSession72,
                                                    optimizeContent(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService",
                                                    "getScheduledReportInfoInSession")));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             com.oracle.xmlns.oxp.service.publicreportservice.GetScheduledReportInfoInSessionResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (com.oracle.xmlns.oxp.service.publicreportservice.GetScheduledReportInfoInSessionResponse)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(faultElt.getQName())){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex=
                                (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException){
                          throw (com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException)ex;
                        }
                        
                        if (ex instanceof com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException){
                          throw (com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException)ex;
                        }
                        
                        if (ex instanceof com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException){
                          throw (com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
            
                    /**
                     * Auto generated method signature
                     * 
                     * @see com.oracle.xmlns.oxp.service.publicreportservice.PublicReportServiceService#uploadTemplateForReport
                     * @param uploadTemplateForReport74
                    
                     * @throws com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException : 
                     * @throws com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException : 
                     * @throws com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException : 
                     */

                    

                            public  com.oracle.xmlns.oxp.service.publicreportservice.UploadTemplateForReportResponse uploadTemplateForReport(

                            com.oracle.xmlns.oxp.service.publicreportservice.UploadTemplateForReport uploadTemplateForReport74)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException
                        ,com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException
                        ,com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[37].getName());
              _operationClient.getOptions().setAction("\"\"");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    uploadTemplateForReport74,
                                                    optimizeContent(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService",
                                                    "uploadTemplateForReport")));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             com.oracle.xmlns.oxp.service.publicreportservice.UploadTemplateForReportResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (com.oracle.xmlns.oxp.service.publicreportservice.UploadTemplateForReportResponse)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(faultElt.getQName())){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex=
                                (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException){
                          throw (com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException)ex;
                        }
                        
                        if (ex instanceof com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException){
                          throw (com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException)ex;
                        }
                        
                        if (ex instanceof com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException){
                          throw (com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
            
                    /**
                     * Auto generated method signature
                     * 
                     * @see com.oracle.xmlns.oxp.service.publicreportservice.PublicReportServiceService#getReportParametersInSession
                     * @param getReportParametersInSession76
                    
                     * @throws com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException : 
                     * @throws com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException : 
                     * @throws com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException : 
                     */

                    

                            public  com.oracle.xmlns.oxp.service.publicreportservice.GetReportParametersInSessionResponse getReportParametersInSession(

                            com.oracle.xmlns.oxp.service.publicreportservice.GetReportParametersInSession getReportParametersInSession76)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException
                        ,com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException
                        ,com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[38].getName());
              _operationClient.getOptions().setAction("\"\"");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    getReportParametersInSession76,
                                                    optimizeContent(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService",
                                                    "getReportParametersInSession")));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             com.oracle.xmlns.oxp.service.publicreportservice.GetReportParametersInSessionResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (com.oracle.xmlns.oxp.service.publicreportservice.GetReportParametersInSessionResponse)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(faultElt.getQName())){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex=
                                (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException){
                          throw (com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException)ex;
                        }
                        
                        if (ex instanceof com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException){
                          throw (com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException)ex;
                        }
                        
                        if (ex instanceof com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException){
                          throw (com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
            
                    /**
                     * Auto generated method signature
                     * 
                     * @see com.oracle.xmlns.oxp.service.publicreportservice.PublicReportServiceService#removeTemplateForReportInSession
                     * @param removeTemplateForReportInSession78
                    
                     * @throws com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException : 
                     * @throws com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException : 
                     * @throws com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException : 
                     */

                    

                            public  com.oracle.xmlns.oxp.service.publicreportservice.RemoveTemplateForReportInSessionResponse removeTemplateForReportInSession(

                            com.oracle.xmlns.oxp.service.publicreportservice.RemoveTemplateForReportInSession removeTemplateForReportInSession78)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException
                        ,com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException
                        ,com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[39].getName());
              _operationClient.getOptions().setAction("\"\"");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    removeTemplateForReportInSession78,
                                                    optimizeContent(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService",
                                                    "removeTemplateForReportInSession")));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             com.oracle.xmlns.oxp.service.publicreportservice.RemoveTemplateForReportInSessionResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (com.oracle.xmlns.oxp.service.publicreportservice.RemoveTemplateForReportInSessionResponse)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(faultElt.getQName())){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex=
                                (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException){
                          throw (com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException)ex;
                        }
                        
                        if (ex instanceof com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException){
                          throw (com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException)ex;
                        }
                        
                        if (ex instanceof com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException){
                          throw (com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
            
                    /**
                     * Auto generated method signature
                     * 
                     * @see com.oracle.xmlns.oxp.service.publicreportservice.PublicReportServiceService#createReportFolderInSession
                     * @param createReportFolderInSession80
                    
                     * @throws com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException : 
                     * @throws com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException : 
                     * @throws com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException : 
                     */

                    

                            public  com.oracle.xmlns.oxp.service.publicreportservice.CreateReportFolderInSessionResponse createReportFolderInSession(

                            com.oracle.xmlns.oxp.service.publicreportservice.CreateReportFolderInSession createReportFolderInSession80)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException
                        ,com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException
                        ,com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[40].getName());
              _operationClient.getOptions().setAction("\"\"");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    createReportFolderInSession80,
                                                    optimizeContent(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService",
                                                    "createReportFolderInSession")));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             com.oracle.xmlns.oxp.service.publicreportservice.CreateReportFolderInSessionResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (com.oracle.xmlns.oxp.service.publicreportservice.CreateReportFolderInSessionResponse)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(faultElt.getQName())){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex=
                                (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException){
                          throw (com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException)ex;
                        }
                        
                        if (ex instanceof com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException){
                          throw (com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException)ex;
                        }
                        
                        if (ex instanceof com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException){
                          throw (com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
            
                    /**
                     * Auto generated method signature
                     * 
                     * @see com.oracle.xmlns.oxp.service.publicreportservice.PublicReportServiceService#hasReportAccessInSession
                     * @param hasReportAccessInSession82
                    
                     * @throws com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException : 
                     */

                    

                            public  com.oracle.xmlns.oxp.service.publicreportservice.HasReportAccessInSessionResponse hasReportAccessInSession(

                            com.oracle.xmlns.oxp.service.publicreportservice.HasReportAccessInSession hasReportAccessInSession82)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[41].getName());
              _operationClient.getOptions().setAction("\"\"");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    hasReportAccessInSession82,
                                                    optimizeContent(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService",
                                                    "hasReportAccessInSession")));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             com.oracle.xmlns.oxp.service.publicreportservice.HasReportAccessInSessionResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (com.oracle.xmlns.oxp.service.publicreportservice.HasReportAccessInSessionResponse)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(faultElt.getQName())){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex=
                                (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException){
                          throw (com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
            
                    /**
                     * Auto generated method signature
                     * 
                     * @see com.oracle.xmlns.oxp.service.publicreportservice.PublicReportServiceService#isReportExist
                     * @param isReportExist84
                    
                     * @throws com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException : 
                     */

                    

                            public  com.oracle.xmlns.oxp.service.publicreportservice.IsReportExistResponse isReportExist(

                            com.oracle.xmlns.oxp.service.publicreportservice.IsReportExist isReportExist84)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[42].getName());
              _operationClient.getOptions().setAction("\"\"");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    isReportExist84,
                                                    optimizeContent(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService",
                                                    "isReportExist")));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             com.oracle.xmlns.oxp.service.publicreportservice.IsReportExistResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (com.oracle.xmlns.oxp.service.publicreportservice.IsReportExistResponse)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(faultElt.getQName())){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex=
                                (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException){
                          throw (com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
            
                    /**
                     * Auto generated method signature
                     * 
                     * @see com.oracle.xmlns.oxp.service.publicreportservice.PublicReportServiceService#getBIPHTTPSessionInterval
                     * @param getBIPHTTPSessionInterval86
                    
                     */

                    

                            public  com.oracle.xmlns.oxp.service.publicreportservice.GetBIPHTTPSessionIntervalResponse getBIPHTTPSessionInterval(

                            com.oracle.xmlns.oxp.service.publicreportservice.GetBIPHTTPSessionInterval getBIPHTTPSessionInterval86)
                        

                    throws java.rmi.RemoteException
                    
                    {
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[43].getName());
              _operationClient.getOptions().setAction("\"\"");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    getBIPHTTPSessionInterval86,
                                                    optimizeContent(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService",
                                                    "getBIPHTTPSessionInterval")));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             com.oracle.xmlns.oxp.service.publicreportservice.GetBIPHTTPSessionIntervalResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (com.oracle.xmlns.oxp.service.publicreportservice.GetBIPHTTPSessionIntervalResponse)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(faultElt.getQName())){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex=
                                (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
            
                    /**
                     * Auto generated method signature
                     * 
                     * @see com.oracle.xmlns.oxp.service.publicreportservice.PublicReportServiceService#getScheduledReportInfo
                     * @param getScheduledReportInfo88
                    
                     * @throws com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException : 
                     * @throws com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException : 
                     * @throws com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException : 
                     */

                    

                            public  com.oracle.xmlns.oxp.service.publicreportservice.GetScheduledReportInfoResponse getScheduledReportInfo(

                            com.oracle.xmlns.oxp.service.publicreportservice.GetScheduledReportInfo getScheduledReportInfo88)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException
                        ,com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException
                        ,com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[44].getName());
              _operationClient.getOptions().setAction("\"\"");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    getScheduledReportInfo88,
                                                    optimizeContent(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService",
                                                    "getScheduledReportInfo")));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             com.oracle.xmlns.oxp.service.publicreportservice.GetScheduledReportInfoResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (com.oracle.xmlns.oxp.service.publicreportservice.GetScheduledReportInfoResponse)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(faultElt.getQName())){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex=
                                (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException){
                          throw (com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException)ex;
                        }
                        
                        if (ex instanceof com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException){
                          throw (com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException)ex;
                        }
                        
                        if (ex instanceof com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException){
                          throw (com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
            
                    /**
                     * Auto generated method signature
                     * 
                     * @see com.oracle.xmlns.oxp.service.publicreportservice.PublicReportServiceService#deleteFolderInSession
                     * @param deleteFolderInSession90
                    
                     * @throws com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException : 
                     * @throws com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException : 
                     * @throws com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException : 
                     */

                    

                            public  com.oracle.xmlns.oxp.service.publicreportservice.DeleteFolderInSessionResponse deleteFolderInSession(

                            com.oracle.xmlns.oxp.service.publicreportservice.DeleteFolderInSession deleteFolderInSession90)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException
                        ,com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException
                        ,com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[45].getName());
              _operationClient.getOptions().setAction("\"\"");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    deleteFolderInSession90,
                                                    optimizeContent(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService",
                                                    "deleteFolderInSession")));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             com.oracle.xmlns.oxp.service.publicreportservice.DeleteFolderInSessionResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (com.oracle.xmlns.oxp.service.publicreportservice.DeleteFolderInSessionResponse)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(faultElt.getQName())){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex=
                                (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException){
                          throw (com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException)ex;
                        }
                        
                        if (ex instanceof com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException){
                          throw (com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException)ex;
                        }
                        
                        if (ex instanceof com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException){
                          throw (com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
            
                    /**
                     * Auto generated method signature
                     * 
                     * @see com.oracle.xmlns.oxp.service.publicreportservice.PublicReportServiceService#deleteScheduledReportHistoryInSession
                     * @param deleteScheduledReportHistoryInSession92
                    
                     * @throws com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException : 
                     * @throws com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException : 
                     * @throws com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException : 
                     */

                    

                            public  com.oracle.xmlns.oxp.service.publicreportservice.DeleteScheduledReportHistoryInSessionResponse deleteScheduledReportHistoryInSession(

                            com.oracle.xmlns.oxp.service.publicreportservice.DeleteScheduledReportHistoryInSession deleteScheduledReportHistoryInSession92)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException
                        ,com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException
                        ,com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[46].getName());
              _operationClient.getOptions().setAction("\"\"");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    deleteScheduledReportHistoryInSession92,
                                                    optimizeContent(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService",
                                                    "deleteScheduledReportHistoryInSession")));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             com.oracle.xmlns.oxp.service.publicreportservice.DeleteScheduledReportHistoryInSessionResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (com.oracle.xmlns.oxp.service.publicreportservice.DeleteScheduledReportHistoryInSessionResponse)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(faultElt.getQName())){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex=
                                (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException){
                          throw (com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException)ex;
                        }
                        
                        if (ex instanceof com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException){
                          throw (com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException)ex;
                        }
                        
                        if (ex instanceof com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException){
                          throw (com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
            
                    /**
                     * Auto generated method signature
                     * 
                     * @see com.oracle.xmlns.oxp.service.publicreportservice.PublicReportServiceService#suspendScheduledReportInSession
                     * @param suspendScheduledReportInSession94
                    
                     * @throws com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException : 
                     * @throws com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException : 
                     * @throws com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException : 
                     */

                    

                            public  com.oracle.xmlns.oxp.service.publicreportservice.SuspendScheduledReportInSessionResponse suspendScheduledReportInSession(

                            com.oracle.xmlns.oxp.service.publicreportservice.SuspendScheduledReportInSession suspendScheduledReportInSession94)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException
                        ,com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException
                        ,com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[47].getName());
              _operationClient.getOptions().setAction("\"\"");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    suspendScheduledReportInSession94,
                                                    optimizeContent(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService",
                                                    "suspendScheduledReportInSession")));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             com.oracle.xmlns.oxp.service.publicreportservice.SuspendScheduledReportInSessionResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (com.oracle.xmlns.oxp.service.publicreportservice.SuspendScheduledReportInSessionResponse)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(faultElt.getQName())){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex=
                                (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException){
                          throw (com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException)ex;
                        }
                        
                        if (ex instanceof com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException){
                          throw (com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException)ex;
                        }
                        
                        if (ex instanceof com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException){
                          throw (com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
            
                    /**
                     * Auto generated method signature
                     * 
                     * @see com.oracle.xmlns.oxp.service.publicreportservice.PublicReportServiceService#getFolderContents
                     * @param getFolderContents96
                    
                     * @throws com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException : 
                     * @throws com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException : 
                     * @throws com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException : 
                     */

                    

                            public  com.oracle.xmlns.oxp.service.publicreportservice.GetFolderContentsResponse getFolderContents(

                            com.oracle.xmlns.oxp.service.publicreportservice.GetFolderContents getFolderContents96)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException
                        ,com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException
                        ,com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[48].getName());
              _operationClient.getOptions().setAction("\"\"");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    getFolderContents96,
                                                    optimizeContent(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService",
                                                    "getFolderContents")));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             com.oracle.xmlns.oxp.service.publicreportservice.GetFolderContentsResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (com.oracle.xmlns.oxp.service.publicreportservice.GetFolderContentsResponse)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(faultElt.getQName())){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex=
                                (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException){
                          throw (com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException)ex;
                        }
                        
                        if (ex instanceof com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException){
                          throw (com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException)ex;
                        }
                        
                        if (ex instanceof com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException){
                          throw (com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
            
                    /**
                     * Auto generated method signature
                     * 
                     * @see com.oracle.xmlns.oxp.service.publicreportservice.PublicReportServiceService#getReportDefinitionInSession
                     * @param getReportDefinitionInSession98
                    
                     * @throws com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException : 
                     * @throws com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException : 
                     * @throws com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException : 
                     */

                    

                            public  com.oracle.xmlns.oxp.service.publicreportservice.GetReportDefinitionInSessionResponse getReportDefinitionInSession(

                            com.oracle.xmlns.oxp.service.publicreportservice.GetReportDefinitionInSession getReportDefinitionInSession98)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException
                        ,com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException
                        ,com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[49].getName());
              _operationClient.getOptions().setAction("\"\"");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    getReportDefinitionInSession98,
                                                    optimizeContent(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService",
                                                    "getReportDefinitionInSession")));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             com.oracle.xmlns.oxp.service.publicreportservice.GetReportDefinitionInSessionResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (com.oracle.xmlns.oxp.service.publicreportservice.GetReportDefinitionInSessionResponse)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(faultElt.getQName())){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex=
                                (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException){
                          throw (com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException)ex;
                        }
                        
                        if (ex instanceof com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException){
                          throw (com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException)ex;
                        }
                        
                        if (ex instanceof com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException){
                          throw (com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
            
                    /**
                     * Auto generated method signature
                     * 
                     * @see com.oracle.xmlns.oxp.service.publicreportservice.PublicReportServiceService#uploadReport
                     * @param uploadReport100
                    
                     * @throws com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException : 
                     * @throws com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException : 
                     * @throws com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException : 
                     */

                    

                            public  com.oracle.xmlns.oxp.service.publicreportservice.UploadReportResponse uploadReport(

                            com.oracle.xmlns.oxp.service.publicreportservice.UploadReport uploadReport100)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException
                        ,com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException
                        ,com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[50].getName());
              _operationClient.getOptions().setAction("\"\"");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    uploadReport100,
                                                    optimizeContent(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService",
                                                    "uploadReport")));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             com.oracle.xmlns.oxp.service.publicreportservice.UploadReportResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (com.oracle.xmlns.oxp.service.publicreportservice.UploadReportResponse)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(faultElt.getQName())){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex=
                                (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException){
                          throw (com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException)ex;
                        }
                        
                        if (ex instanceof com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException){
                          throw (com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException)ex;
                        }
                        
                        if (ex instanceof com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException){
                          throw (com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
            
                    /**
                     * Auto generated method signature
                     * 
                     * @see com.oracle.xmlns.oxp.service.publicreportservice.PublicReportServiceService#removeTemplateForReport
                     * @param removeTemplateForReport102
                    
                     * @throws com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException : 
                     * @throws com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException : 
                     * @throws com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException : 
                     */

                    

                            public  com.oracle.xmlns.oxp.service.publicreportservice.RemoveTemplateForReportResponse removeTemplateForReport(

                            com.oracle.xmlns.oxp.service.publicreportservice.RemoveTemplateForReport removeTemplateForReport102)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException
                        ,com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException
                        ,com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[51].getName());
              _operationClient.getOptions().setAction("\"\"");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    removeTemplateForReport102,
                                                    optimizeContent(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService",
                                                    "removeTemplateForReport")));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             com.oracle.xmlns.oxp.service.publicreportservice.RemoveTemplateForReportResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (com.oracle.xmlns.oxp.service.publicreportservice.RemoveTemplateForReportResponse)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(faultElt.getQName())){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex=
                                (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException){
                          throw (com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException)ex;
                        }
                        
                        if (ex instanceof com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException){
                          throw (com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException)ex;
                        }
                        
                        if (ex instanceof com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException){
                          throw (com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
            
                    /**
                     * Auto generated method signature
                     * 
                     * @see com.oracle.xmlns.oxp.service.publicreportservice.PublicReportServiceService#logout
                     * @param logout104
                    
                     * @throws com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException : 
                     * @throws com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException : 
                     */

                    

                            public  com.oracle.xmlns.oxp.service.publicreportservice.LogoutResponse logout(

                            com.oracle.xmlns.oxp.service.publicreportservice.Logout logout104)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException
                        ,com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[52].getName());
              _operationClient.getOptions().setAction("\"\"");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    logout104,
                                                    optimizeContent(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService",
                                                    "logout")));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             com.oracle.xmlns.oxp.service.publicreportservice.LogoutResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (com.oracle.xmlns.oxp.service.publicreportservice.LogoutResponse)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(faultElt.getQName())){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex=
                                (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException){
                          throw (com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException)ex;
                        }
                        
                        if (ex instanceof com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException){
                          throw (com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
            
                    /**
                     * Auto generated method signature
                     * 
                     * @see com.oracle.xmlns.oxp.service.publicreportservice.PublicReportServiceService#deleteScheduledReport
                     * @param deleteScheduledReport106
                    
                     * @throws com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException : 
                     * @throws com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException : 
                     * @throws com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException : 
                     */

                    

                            public  com.oracle.xmlns.oxp.service.publicreportservice.DeleteScheduledReportResponse deleteScheduledReport(

                            com.oracle.xmlns.oxp.service.publicreportservice.DeleteScheduledReport deleteScheduledReport106)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException
                        ,com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException
                        ,com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[53].getName());
              _operationClient.getOptions().setAction("\"\"");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    deleteScheduledReport106,
                                                    optimizeContent(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService",
                                                    "deleteScheduledReport")));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             com.oracle.xmlns.oxp.service.publicreportservice.DeleteScheduledReportResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (com.oracle.xmlns.oxp.service.publicreportservice.DeleteScheduledReportResponse)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(faultElt.getQName())){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex=
                                (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException){
                          throw (com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException)ex;
                        }
                        
                        if (ex instanceof com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException){
                          throw (com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException)ex;
                        }
                        
                        if (ex instanceof com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException){
                          throw (com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
            
                    /**
                     * Auto generated method signature
                     * 
                     * @see com.oracle.xmlns.oxp.service.publicreportservice.PublicReportServiceService#getListOfScheduledReportsStatusInSession
                     * @param getListOfScheduledReportsStatusInSession108
                    
                     * @throws com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException : 
                     * @throws com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException : 
                     * @throws com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException : 
                     */

                    

                            public  com.oracle.xmlns.oxp.service.publicreportservice.GetListOfScheduledReportsStatusInSessionResponse getListOfScheduledReportsStatusInSession(

                            com.oracle.xmlns.oxp.service.publicreportservice.GetListOfScheduledReportsStatusInSession getListOfScheduledReportsStatusInSession108)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException
                        ,com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException
                        ,com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[54].getName());
              _operationClient.getOptions().setAction("\"\"");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    getListOfScheduledReportsStatusInSession108,
                                                    optimizeContent(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService",
                                                    "getListOfScheduledReportsStatusInSession")));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             com.oracle.xmlns.oxp.service.publicreportservice.GetListOfScheduledReportsStatusInSessionResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (com.oracle.xmlns.oxp.service.publicreportservice.GetListOfScheduledReportsStatusInSessionResponse)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(faultElt.getQName())){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex=
                                (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException){
                          throw (com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException)ex;
                        }
                        
                        if (ex instanceof com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException){
                          throw (com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException)ex;
                        }
                        
                        if (ex instanceof com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException){
                          throw (com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
            
                    /**
                     * Auto generated method signature
                     * 
                     * @see com.oracle.xmlns.oxp.service.publicreportservice.PublicReportServiceService#suspendScheduledReport
                     * @param suspendScheduledReport110
                    
                     * @throws com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException : 
                     * @throws com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException : 
                     * @throws com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException : 
                     */

                    

                            public  com.oracle.xmlns.oxp.service.publicreportservice.SuspendScheduledReportResponse suspendScheduledReport(

                            com.oracle.xmlns.oxp.service.publicreportservice.SuspendScheduledReport suspendScheduledReport110)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException
                        ,com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException
                        ,com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[55].getName());
              _operationClient.getOptions().setAction("\"\"");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    suspendScheduledReport110,
                                                    optimizeContent(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService",
                                                    "suspendScheduledReport")));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             com.oracle.xmlns.oxp.service.publicreportservice.SuspendScheduledReportResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (com.oracle.xmlns.oxp.service.publicreportservice.SuspendScheduledReportResponse)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(faultElt.getQName())){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex=
                                (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException){
                          throw (com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException)ex;
                        }
                        
                        if (ex instanceof com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException){
                          throw (com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException)ex;
                        }
                        
                        if (ex instanceof com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException){
                          throw (com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
            
                    /**
                     * Auto generated method signature
                     * 
                     * @see com.oracle.xmlns.oxp.service.publicreportservice.PublicReportServiceService#scheduleReportInSession
                     * @param scheduleReportInSession112
                    
                     * @throws com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException : 
                     * @throws com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException : 
                     * @throws com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException : 
                     */

                    

                            public  com.oracle.xmlns.oxp.service.publicreportservice.ScheduleReportInSessionResponse scheduleReportInSession(

                            com.oracle.xmlns.oxp.service.publicreportservice.ScheduleReportInSession scheduleReportInSession112)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException
                        ,com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException
                        ,com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[56].getName());
              _operationClient.getOptions().setAction("\"\"");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    scheduleReportInSession112,
                                                    optimizeContent(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService",
                                                    "scheduleReportInSession")));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             com.oracle.xmlns.oxp.service.publicreportservice.ScheduleReportInSessionResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (com.oracle.xmlns.oxp.service.publicreportservice.ScheduleReportInSessionResponse)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(faultElt.getQName())){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex=
                                (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException){
                          throw (com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException)ex;
                        }
                        
                        if (ex instanceof com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException){
                          throw (com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException)ex;
                        }
                        
                        if (ex instanceof com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException){
                          throw (com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
            
                    /**
                     * Auto generated method signature
                     * 
                     * @see com.oracle.xmlns.oxp.service.publicreportservice.PublicReportServiceService#getReportParameters
                     * @param getReportParameters114
                    
                     * @throws com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException : 
                     * @throws com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException : 
                     * @throws com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException : 
                     */

                    

                            public  com.oracle.xmlns.oxp.service.publicreportservice.GetReportParametersResponse getReportParameters(

                            com.oracle.xmlns.oxp.service.publicreportservice.GetReportParameters getReportParameters114)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException
                        ,com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException
                        ,com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[57].getName());
              _operationClient.getOptions().setAction("\"\"");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    getReportParameters114,
                                                    optimizeContent(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService",
                                                    "getReportParameters")));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             com.oracle.xmlns.oxp.service.publicreportservice.GetReportParametersResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (com.oracle.xmlns.oxp.service.publicreportservice.GetReportParametersResponse)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(faultElt.getQName())){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex=
                                (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException){
                          throw (com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException)ex;
                        }
                        
                        if (ex instanceof com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException){
                          throw (com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException)ex;
                        }
                        
                        if (ex instanceof com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException){
                          throw (com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
            


       /**
        *  A utility method that copies the namepaces from the SOAPEnvelope
        */
       private java.util.Map getEnvelopeNamespaces(org.apache.axiom.soap.SOAPEnvelope env){
        java.util.Map returnMap = new java.util.HashMap();
        java.util.Iterator namespaceIterator = env.getAllDeclaredNamespaces();
        while (namespaceIterator.hasNext()) {
            org.apache.axiom.om.OMNamespace ns = (org.apache.axiom.om.OMNamespace) namespaceIterator.next();
            returnMap.put(ns.getPrefix(),ns.getNamespaceURI());
        }
       return returnMap;
    }

    
    
    private javax.xml.namespace.QName[] opNameArray = null;
    private boolean optimizeContent(javax.xml.namespace.QName opName) {
        

        if (opNameArray == null) {
            return false;
        }
        for (int i = 0; i < opNameArray.length; i++) {
            if (opName.equals(opNameArray[i])) {
                return true;   
            }
        }
        return false;
    }
     //https://192.168.28.73/xmlpserver/services/PublicReportService
            private  org.apache.axiom.om.OMElement  toOM(com.oracle.xmlns.oxp.service.publicreportservice.DeleteReportInSession param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.oracle.xmlns.oxp.service.publicreportservice.DeleteReportInSession.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.oracle.xmlns.oxp.service.publicreportservice.DeleteReportInSessionResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.oracle.xmlns.oxp.service.publicreportservice.DeleteReportInSessionResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.oracle.xmlns.oxp.service.publicreportservice.Fault1 param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.oracle.xmlns.oxp.service.publicreportservice.Fault1.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.oracle.xmlns.oxp.service.publicreportservice.Fault param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.oracle.xmlns.oxp.service.publicreportservice.Fault.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.oracle.xmlns.oxp.service.publicreportservice.Fault2 param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.oracle.xmlns.oxp.service.publicreportservice.Fault2.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.oracle.xmlns.oxp.service.publicreportservice.GetSecurityModel param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.oracle.xmlns.oxp.service.publicreportservice.GetSecurityModel.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.oracle.xmlns.oxp.service.publicreportservice.GetSecurityModelResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.oracle.xmlns.oxp.service.publicreportservice.GetSecurityModelResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.oracle.xmlns.oxp.service.publicreportservice.GetListOfScheduledReportsStatus param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.oracle.xmlns.oxp.service.publicreportservice.GetListOfScheduledReportsStatus.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.oracle.xmlns.oxp.service.publicreportservice.GetListOfScheduledReportsStatusResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.oracle.xmlns.oxp.service.publicreportservice.GetListOfScheduledReportsStatusResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.oracle.xmlns.oxp.service.publicreportservice.DeleteFolder param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.oracle.xmlns.oxp.service.publicreportservice.DeleteFolder.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.oracle.xmlns.oxp.service.publicreportservice.DeleteFolderResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.oracle.xmlns.oxp.service.publicreportservice.DeleteFolderResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.oracle.xmlns.oxp.service.publicreportservice.GetScheduledReportStatusInSession param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.oracle.xmlns.oxp.service.publicreportservice.GetScheduledReportStatusInSession.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.oracle.xmlns.oxp.service.publicreportservice.GetScheduledReportStatusInSessionResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.oracle.xmlns.oxp.service.publicreportservice.GetScheduledReportStatusInSessionResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.oracle.xmlns.oxp.service.publicreportservice.CreateReport param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.oracle.xmlns.oxp.service.publicreportservice.CreateReport.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.oracle.xmlns.oxp.service.publicreportservice.CreateReportResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.oracle.xmlns.oxp.service.publicreportservice.CreateReportResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.oracle.xmlns.oxp.service.publicreportservice.GetScheduledReportHistoryInfoInSession param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.oracle.xmlns.oxp.service.publicreportservice.GetScheduledReportHistoryInfoInSession.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.oracle.xmlns.oxp.service.publicreportservice.GetScheduledReportHistoryInfoInSessionResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.oracle.xmlns.oxp.service.publicreportservice.GetScheduledReportHistoryInfoInSessionResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.oracle.xmlns.oxp.service.publicreportservice.GetScheduledReportHistoryInfo param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.oracle.xmlns.oxp.service.publicreportservice.GetScheduledReportHistoryInfo.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.oracle.xmlns.oxp.service.publicreportservice.GetScheduledReportHistoryInfoResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.oracle.xmlns.oxp.service.publicreportservice.GetScheduledReportHistoryInfoResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.oracle.xmlns.oxp.service.publicreportservice.DeleteReport param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.oracle.xmlns.oxp.service.publicreportservice.DeleteReport.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.oracle.xmlns.oxp.service.publicreportservice.DeleteReportResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.oracle.xmlns.oxp.service.publicreportservice.DeleteReportResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.oracle.xmlns.oxp.service.publicreportservice.Impersonate param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.oracle.xmlns.oxp.service.publicreportservice.Impersonate.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.oracle.xmlns.oxp.service.publicreportservice.ImpersonateResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.oracle.xmlns.oxp.service.publicreportservice.ImpersonateResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.oracle.xmlns.oxp.service.publicreportservice.IsFolderExist param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.oracle.xmlns.oxp.service.publicreportservice.IsFolderExist.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.oracle.xmlns.oxp.service.publicreportservice.IsFolderExistResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.oracle.xmlns.oxp.service.publicreportservice.IsFolderExistResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.oracle.xmlns.oxp.service.publicreportservice.HasReportAccess param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.oracle.xmlns.oxp.service.publicreportservice.HasReportAccess.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.oracle.xmlns.oxp.service.publicreportservice.HasReportAccessResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.oracle.xmlns.oxp.service.publicreportservice.HasReportAccessResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.oracle.xmlns.oxp.service.publicreportservice.IsFolderExistInSession param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.oracle.xmlns.oxp.service.publicreportservice.IsFolderExistInSession.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.oracle.xmlns.oxp.service.publicreportservice.IsFolderExistInSessionResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.oracle.xmlns.oxp.service.publicreportservice.IsFolderExistInSessionResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.oracle.xmlns.oxp.service.publicreportservice.IsReportExistInSession param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.oracle.xmlns.oxp.service.publicreportservice.IsReportExistInSession.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.oracle.xmlns.oxp.service.publicreportservice.IsReportExistInSessionResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.oracle.xmlns.oxp.service.publicreportservice.IsReportExistInSessionResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.oracle.xmlns.oxp.service.publicreportservice.ResumeScheduledReportInSession param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.oracle.xmlns.oxp.service.publicreportservice.ResumeScheduledReportInSession.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.oracle.xmlns.oxp.service.publicreportservice.ResumeScheduledReportInSessionResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.oracle.xmlns.oxp.service.publicreportservice.ResumeScheduledReportInSessionResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.oracle.xmlns.oxp.service.publicreportservice.GetFolderContentsInSession param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.oracle.xmlns.oxp.service.publicreportservice.GetFolderContentsInSession.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.oracle.xmlns.oxp.service.publicreportservice.GetFolderContentsInSessionResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.oracle.xmlns.oxp.service.publicreportservice.GetFolderContentsInSessionResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.oracle.xmlns.oxp.service.publicreportservice.RunReport param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.oracle.xmlns.oxp.service.publicreportservice.RunReport.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.oracle.xmlns.oxp.service.publicreportservice.RunReportResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.oracle.xmlns.oxp.service.publicreportservice.RunReportResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.oracle.xmlns.oxp.service.publicreportservice.ScheduleReport param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.oracle.xmlns.oxp.service.publicreportservice.ScheduleReport.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.oracle.xmlns.oxp.service.publicreportservice.ScheduleReportResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.oracle.xmlns.oxp.service.publicreportservice.ScheduleReportResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.oracle.xmlns.oxp.service.publicreportservice.UpdateReportDefinitionInSession param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.oracle.xmlns.oxp.service.publicreportservice.UpdateReportDefinitionInSession.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.oracle.xmlns.oxp.service.publicreportservice.UpdateReportDefinitionInSessionResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.oracle.xmlns.oxp.service.publicreportservice.UpdateReportDefinitionInSessionResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.oracle.xmlns.oxp.service.publicreportservice.DeleteScheduledReportInSession param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.oracle.xmlns.oxp.service.publicreportservice.DeleteScheduledReportInSession.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.oracle.xmlns.oxp.service.publicreportservice.DeleteScheduledReportInSessionResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.oracle.xmlns.oxp.service.publicreportservice.DeleteScheduledReportInSessionResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.oracle.xmlns.oxp.service.publicreportservice.DownloadReport param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.oracle.xmlns.oxp.service.publicreportservice.DownloadReport.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.oracle.xmlns.oxp.service.publicreportservice.DownloadReportResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.oracle.xmlns.oxp.service.publicreportservice.DownloadReportResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.oracle.xmlns.oxp.service.publicreportservice.UploadReportInSession param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.oracle.xmlns.oxp.service.publicreportservice.UploadReportInSession.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.oracle.xmlns.oxp.service.publicreportservice.UploadReportInSessionResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.oracle.xmlns.oxp.service.publicreportservice.UploadReportInSessionResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.oracle.xmlns.oxp.service.publicreportservice.ResumeScheduledReport param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.oracle.xmlns.oxp.service.publicreportservice.ResumeScheduledReport.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.oracle.xmlns.oxp.service.publicreportservice.ResumeScheduledReportResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.oracle.xmlns.oxp.service.publicreportservice.ResumeScheduledReportResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.oracle.xmlns.oxp.service.publicreportservice.DeleteScheduledReportHistory param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.oracle.xmlns.oxp.service.publicreportservice.DeleteScheduledReportHistory.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.oracle.xmlns.oxp.service.publicreportservice.DeleteScheduledReportHistoryResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.oracle.xmlns.oxp.service.publicreportservice.DeleteScheduledReportHistoryResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.oracle.xmlns.oxp.service.publicreportservice.RunReportInSession param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.oracle.xmlns.oxp.service.publicreportservice.RunReportInSession.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.oracle.xmlns.oxp.service.publicreportservice.RunReportInSessionResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.oracle.xmlns.oxp.service.publicreportservice.RunReportInSessionResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.oracle.xmlns.oxp.service.publicreportservice.DownloadReportInSession param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.oracle.xmlns.oxp.service.publicreportservice.DownloadReportInSession.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.oracle.xmlns.oxp.service.publicreportservice.DownloadReportInSessionResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.oracle.xmlns.oxp.service.publicreportservice.DownloadReportInSessionResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.oracle.xmlns.oxp.service.publicreportservice.CreateReportInSession param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.oracle.xmlns.oxp.service.publicreportservice.CreateReportInSession.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.oracle.xmlns.oxp.service.publicreportservice.CreateReportInSessionResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.oracle.xmlns.oxp.service.publicreportservice.CreateReportInSessionResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.oracle.xmlns.oxp.service.publicreportservice.DownloadReportDataChunk param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.oracle.xmlns.oxp.service.publicreportservice.DownloadReportDataChunk.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.oracle.xmlns.oxp.service.publicreportservice.DownloadReportDataChunkResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.oracle.xmlns.oxp.service.publicreportservice.DownloadReportDataChunkResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.oracle.xmlns.oxp.service.publicreportservice.GetScheduledReportStatus param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.oracle.xmlns.oxp.service.publicreportservice.GetScheduledReportStatus.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.oracle.xmlns.oxp.service.publicreportservice.GetScheduledReportStatusResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.oracle.xmlns.oxp.service.publicreportservice.GetScheduledReportStatusResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.oracle.xmlns.oxp.service.publicreportservice.GetReportDefinition param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.oracle.xmlns.oxp.service.publicreportservice.GetReportDefinition.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.oracle.xmlns.oxp.service.publicreportservice.GetReportDefinitionResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.oracle.xmlns.oxp.service.publicreportservice.GetReportDefinitionResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.oracle.xmlns.oxp.service.publicreportservice.UploadReportDataChunk param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.oracle.xmlns.oxp.service.publicreportservice.UploadReportDataChunk.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.oracle.xmlns.oxp.service.publicreportservice.UploadReportDataChunkResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.oracle.xmlns.oxp.service.publicreportservice.UploadReportDataChunkResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.oracle.xmlns.oxp.service.publicreportservice.Login param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.oracle.xmlns.oxp.service.publicreportservice.Login.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.oracle.xmlns.oxp.service.publicreportservice.LoginResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.oracle.xmlns.oxp.service.publicreportservice.LoginResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.oracle.xmlns.oxp.service.publicreportservice.CreateReportFolder param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.oracle.xmlns.oxp.service.publicreportservice.CreateReportFolder.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.oracle.xmlns.oxp.service.publicreportservice.CreateReportFolderResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.oracle.xmlns.oxp.service.publicreportservice.CreateReportFolderResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.oracle.xmlns.oxp.service.publicreportservice.UpdateReportDefinition param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.oracle.xmlns.oxp.service.publicreportservice.UpdateReportDefinition.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.oracle.xmlns.oxp.service.publicreportservice.UpdateReportDefinitionResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.oracle.xmlns.oxp.service.publicreportservice.UpdateReportDefinitionResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.oracle.xmlns.oxp.service.publicreportservice.ValidateLogin param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.oracle.xmlns.oxp.service.publicreportservice.ValidateLogin.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.oracle.xmlns.oxp.service.publicreportservice.ValidateLoginResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.oracle.xmlns.oxp.service.publicreportservice.ValidateLoginResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.oracle.xmlns.oxp.service.publicreportservice.UploadTemplateForReportInSession param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.oracle.xmlns.oxp.service.publicreportservice.UploadTemplateForReportInSession.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.oracle.xmlns.oxp.service.publicreportservice.UploadTemplateForReportInSessionResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.oracle.xmlns.oxp.service.publicreportservice.UploadTemplateForReportInSessionResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.oracle.xmlns.oxp.service.publicreportservice.GetScheduledReportInfoInSession param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.oracle.xmlns.oxp.service.publicreportservice.GetScheduledReportInfoInSession.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.oracle.xmlns.oxp.service.publicreportservice.GetScheduledReportInfoInSessionResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.oracle.xmlns.oxp.service.publicreportservice.GetScheduledReportInfoInSessionResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.oracle.xmlns.oxp.service.publicreportservice.UploadTemplateForReport param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.oracle.xmlns.oxp.service.publicreportservice.UploadTemplateForReport.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.oracle.xmlns.oxp.service.publicreportservice.UploadTemplateForReportResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.oracle.xmlns.oxp.service.publicreportservice.UploadTemplateForReportResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.oracle.xmlns.oxp.service.publicreportservice.GetReportParametersInSession param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.oracle.xmlns.oxp.service.publicreportservice.GetReportParametersInSession.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.oracle.xmlns.oxp.service.publicreportservice.GetReportParametersInSessionResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.oracle.xmlns.oxp.service.publicreportservice.GetReportParametersInSessionResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.oracle.xmlns.oxp.service.publicreportservice.RemoveTemplateForReportInSession param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.oracle.xmlns.oxp.service.publicreportservice.RemoveTemplateForReportInSession.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.oracle.xmlns.oxp.service.publicreportservice.RemoveTemplateForReportInSessionResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.oracle.xmlns.oxp.service.publicreportservice.RemoveTemplateForReportInSessionResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.oracle.xmlns.oxp.service.publicreportservice.CreateReportFolderInSession param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.oracle.xmlns.oxp.service.publicreportservice.CreateReportFolderInSession.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.oracle.xmlns.oxp.service.publicreportservice.CreateReportFolderInSessionResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.oracle.xmlns.oxp.service.publicreportservice.CreateReportFolderInSessionResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.oracle.xmlns.oxp.service.publicreportservice.HasReportAccessInSession param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.oracle.xmlns.oxp.service.publicreportservice.HasReportAccessInSession.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.oracle.xmlns.oxp.service.publicreportservice.HasReportAccessInSessionResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.oracle.xmlns.oxp.service.publicreportservice.HasReportAccessInSessionResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.oracle.xmlns.oxp.service.publicreportservice.IsReportExist param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.oracle.xmlns.oxp.service.publicreportservice.IsReportExist.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.oracle.xmlns.oxp.service.publicreportservice.IsReportExistResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.oracle.xmlns.oxp.service.publicreportservice.IsReportExistResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.oracle.xmlns.oxp.service.publicreportservice.GetBIPHTTPSessionInterval param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.oracle.xmlns.oxp.service.publicreportservice.GetBIPHTTPSessionInterval.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.oracle.xmlns.oxp.service.publicreportservice.GetBIPHTTPSessionIntervalResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.oracle.xmlns.oxp.service.publicreportservice.GetBIPHTTPSessionIntervalResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.oracle.xmlns.oxp.service.publicreportservice.GetScheduledReportInfo param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.oracle.xmlns.oxp.service.publicreportservice.GetScheduledReportInfo.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.oracle.xmlns.oxp.service.publicreportservice.GetScheduledReportInfoResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.oracle.xmlns.oxp.service.publicreportservice.GetScheduledReportInfoResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.oracle.xmlns.oxp.service.publicreportservice.DeleteFolderInSession param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.oracle.xmlns.oxp.service.publicreportservice.DeleteFolderInSession.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.oracle.xmlns.oxp.service.publicreportservice.DeleteFolderInSessionResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.oracle.xmlns.oxp.service.publicreportservice.DeleteFolderInSessionResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.oracle.xmlns.oxp.service.publicreportservice.DeleteScheduledReportHistoryInSession param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.oracle.xmlns.oxp.service.publicreportservice.DeleteScheduledReportHistoryInSession.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.oracle.xmlns.oxp.service.publicreportservice.DeleteScheduledReportHistoryInSessionResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.oracle.xmlns.oxp.service.publicreportservice.DeleteScheduledReportHistoryInSessionResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.oracle.xmlns.oxp.service.publicreportservice.SuspendScheduledReportInSession param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.oracle.xmlns.oxp.service.publicreportservice.SuspendScheduledReportInSession.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.oracle.xmlns.oxp.service.publicreportservice.SuspendScheduledReportInSessionResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.oracle.xmlns.oxp.service.publicreportservice.SuspendScheduledReportInSessionResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.oracle.xmlns.oxp.service.publicreportservice.GetFolderContents param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.oracle.xmlns.oxp.service.publicreportservice.GetFolderContents.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.oracle.xmlns.oxp.service.publicreportservice.GetFolderContentsResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.oracle.xmlns.oxp.service.publicreportservice.GetFolderContentsResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.oracle.xmlns.oxp.service.publicreportservice.GetReportDefinitionInSession param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.oracle.xmlns.oxp.service.publicreportservice.GetReportDefinitionInSession.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.oracle.xmlns.oxp.service.publicreportservice.GetReportDefinitionInSessionResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.oracle.xmlns.oxp.service.publicreportservice.GetReportDefinitionInSessionResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.oracle.xmlns.oxp.service.publicreportservice.UploadReport param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.oracle.xmlns.oxp.service.publicreportservice.UploadReport.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.oracle.xmlns.oxp.service.publicreportservice.UploadReportResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.oracle.xmlns.oxp.service.publicreportservice.UploadReportResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.oracle.xmlns.oxp.service.publicreportservice.RemoveTemplateForReport param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.oracle.xmlns.oxp.service.publicreportservice.RemoveTemplateForReport.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.oracle.xmlns.oxp.service.publicreportservice.RemoveTemplateForReportResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.oracle.xmlns.oxp.service.publicreportservice.RemoveTemplateForReportResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.oracle.xmlns.oxp.service.publicreportservice.Logout param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.oracle.xmlns.oxp.service.publicreportservice.Logout.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.oracle.xmlns.oxp.service.publicreportservice.LogoutResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.oracle.xmlns.oxp.service.publicreportservice.LogoutResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.oracle.xmlns.oxp.service.publicreportservice.DeleteScheduledReport param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.oracle.xmlns.oxp.service.publicreportservice.DeleteScheduledReport.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.oracle.xmlns.oxp.service.publicreportservice.DeleteScheduledReportResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.oracle.xmlns.oxp.service.publicreportservice.DeleteScheduledReportResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.oracle.xmlns.oxp.service.publicreportservice.GetListOfScheduledReportsStatusInSession param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.oracle.xmlns.oxp.service.publicreportservice.GetListOfScheduledReportsStatusInSession.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.oracle.xmlns.oxp.service.publicreportservice.GetListOfScheduledReportsStatusInSessionResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.oracle.xmlns.oxp.service.publicreportservice.GetListOfScheduledReportsStatusInSessionResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.oracle.xmlns.oxp.service.publicreportservice.SuspendScheduledReport param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.oracle.xmlns.oxp.service.publicreportservice.SuspendScheduledReport.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.oracle.xmlns.oxp.service.publicreportservice.SuspendScheduledReportResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.oracle.xmlns.oxp.service.publicreportservice.SuspendScheduledReportResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.oracle.xmlns.oxp.service.publicreportservice.ScheduleReportInSession param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.oracle.xmlns.oxp.service.publicreportservice.ScheduleReportInSession.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.oracle.xmlns.oxp.service.publicreportservice.ScheduleReportInSessionResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.oracle.xmlns.oxp.service.publicreportservice.ScheduleReportInSessionResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.oracle.xmlns.oxp.service.publicreportservice.GetReportParameters param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.oracle.xmlns.oxp.service.publicreportservice.GetReportParameters.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.oracle.xmlns.oxp.service.publicreportservice.GetReportParametersResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.oracle.xmlns.oxp.service.publicreportservice.GetReportParametersResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.oracle.xmlns.oxp.service.publicreportservice.DeleteReportInSession param, boolean optimizeContent)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(com.oracle.xmlns.oxp.service.publicreportservice.DeleteReportInSession.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.oracle.xmlns.oxp.service.publicreportservice.GetSecurityModel param, boolean optimizeContent)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(com.oracle.xmlns.oxp.service.publicreportservice.GetSecurityModel.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.oracle.xmlns.oxp.service.publicreportservice.GetListOfScheduledReportsStatus param, boolean optimizeContent)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(com.oracle.xmlns.oxp.service.publicreportservice.GetListOfScheduledReportsStatus.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.oracle.xmlns.oxp.service.publicreportservice.DeleteFolder param, boolean optimizeContent)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(com.oracle.xmlns.oxp.service.publicreportservice.DeleteFolder.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.oracle.xmlns.oxp.service.publicreportservice.GetScheduledReportStatusInSession param, boolean optimizeContent)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(com.oracle.xmlns.oxp.service.publicreportservice.GetScheduledReportStatusInSession.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.oracle.xmlns.oxp.service.publicreportservice.CreateReport param, boolean optimizeContent)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(com.oracle.xmlns.oxp.service.publicreportservice.CreateReport.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.oracle.xmlns.oxp.service.publicreportservice.GetScheduledReportHistoryInfoInSession param, boolean optimizeContent)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(com.oracle.xmlns.oxp.service.publicreportservice.GetScheduledReportHistoryInfoInSession.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.oracle.xmlns.oxp.service.publicreportservice.GetScheduledReportHistoryInfo param, boolean optimizeContent)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(com.oracle.xmlns.oxp.service.publicreportservice.GetScheduledReportHistoryInfo.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.oracle.xmlns.oxp.service.publicreportservice.DeleteReport param, boolean optimizeContent)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(com.oracle.xmlns.oxp.service.publicreportservice.DeleteReport.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.oracle.xmlns.oxp.service.publicreportservice.Impersonate param, boolean optimizeContent)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(com.oracle.xmlns.oxp.service.publicreportservice.Impersonate.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.oracle.xmlns.oxp.service.publicreportservice.IsFolderExist param, boolean optimizeContent)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(com.oracle.xmlns.oxp.service.publicreportservice.IsFolderExist.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.oracle.xmlns.oxp.service.publicreportservice.HasReportAccess param, boolean optimizeContent)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(com.oracle.xmlns.oxp.service.publicreportservice.HasReportAccess.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.oracle.xmlns.oxp.service.publicreportservice.IsFolderExistInSession param, boolean optimizeContent)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(com.oracle.xmlns.oxp.service.publicreportservice.IsFolderExistInSession.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.oracle.xmlns.oxp.service.publicreportservice.IsReportExistInSession param, boolean optimizeContent)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(com.oracle.xmlns.oxp.service.publicreportservice.IsReportExistInSession.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.oracle.xmlns.oxp.service.publicreportservice.ResumeScheduledReportInSession param, boolean optimizeContent)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(com.oracle.xmlns.oxp.service.publicreportservice.ResumeScheduledReportInSession.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.oracle.xmlns.oxp.service.publicreportservice.GetFolderContentsInSession param, boolean optimizeContent)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(com.oracle.xmlns.oxp.service.publicreportservice.GetFolderContentsInSession.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.oracle.xmlns.oxp.service.publicreportservice.RunReport param, boolean optimizeContent)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(com.oracle.xmlns.oxp.service.publicreportservice.RunReport.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.oracle.xmlns.oxp.service.publicreportservice.ScheduleReport param, boolean optimizeContent)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(com.oracle.xmlns.oxp.service.publicreportservice.ScheduleReport.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.oracle.xmlns.oxp.service.publicreportservice.UpdateReportDefinitionInSession param, boolean optimizeContent)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(com.oracle.xmlns.oxp.service.publicreportservice.UpdateReportDefinitionInSession.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.oracle.xmlns.oxp.service.publicreportservice.DeleteScheduledReportInSession param, boolean optimizeContent)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(com.oracle.xmlns.oxp.service.publicreportservice.DeleteScheduledReportInSession.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.oracle.xmlns.oxp.service.publicreportservice.DownloadReport param, boolean optimizeContent)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(com.oracle.xmlns.oxp.service.publicreportservice.DownloadReport.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.oracle.xmlns.oxp.service.publicreportservice.UploadReportInSession param, boolean optimizeContent)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(com.oracle.xmlns.oxp.service.publicreportservice.UploadReportInSession.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.oracle.xmlns.oxp.service.publicreportservice.ResumeScheduledReport param, boolean optimizeContent)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(com.oracle.xmlns.oxp.service.publicreportservice.ResumeScheduledReport.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.oracle.xmlns.oxp.service.publicreportservice.DeleteScheduledReportHistory param, boolean optimizeContent)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(com.oracle.xmlns.oxp.service.publicreportservice.DeleteScheduledReportHistory.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.oracle.xmlns.oxp.service.publicreportservice.RunReportInSession param, boolean optimizeContent)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(com.oracle.xmlns.oxp.service.publicreportservice.RunReportInSession.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.oracle.xmlns.oxp.service.publicreportservice.DownloadReportInSession param, boolean optimizeContent)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(com.oracle.xmlns.oxp.service.publicreportservice.DownloadReportInSession.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.oracle.xmlns.oxp.service.publicreportservice.CreateReportInSession param, boolean optimizeContent)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(com.oracle.xmlns.oxp.service.publicreportservice.CreateReportInSession.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.oracle.xmlns.oxp.service.publicreportservice.DownloadReportDataChunk param, boolean optimizeContent)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(com.oracle.xmlns.oxp.service.publicreportservice.DownloadReportDataChunk.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.oracle.xmlns.oxp.service.publicreportservice.GetScheduledReportStatus param, boolean optimizeContent)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(com.oracle.xmlns.oxp.service.publicreportservice.GetScheduledReportStatus.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.oracle.xmlns.oxp.service.publicreportservice.GetReportDefinition param, boolean optimizeContent)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(com.oracle.xmlns.oxp.service.publicreportservice.GetReportDefinition.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.oracle.xmlns.oxp.service.publicreportservice.UploadReportDataChunk param, boolean optimizeContent)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(com.oracle.xmlns.oxp.service.publicreportservice.UploadReportDataChunk.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.oracle.xmlns.oxp.service.publicreportservice.Login param, boolean optimizeContent)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(com.oracle.xmlns.oxp.service.publicreportservice.Login.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.oracle.xmlns.oxp.service.publicreportservice.CreateReportFolder param, boolean optimizeContent)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(com.oracle.xmlns.oxp.service.publicreportservice.CreateReportFolder.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.oracle.xmlns.oxp.service.publicreportservice.UpdateReportDefinition param, boolean optimizeContent)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(com.oracle.xmlns.oxp.service.publicreportservice.UpdateReportDefinition.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.oracle.xmlns.oxp.service.publicreportservice.ValidateLogin param, boolean optimizeContent)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(com.oracle.xmlns.oxp.service.publicreportservice.ValidateLogin.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.oracle.xmlns.oxp.service.publicreportservice.UploadTemplateForReportInSession param, boolean optimizeContent)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(com.oracle.xmlns.oxp.service.publicreportservice.UploadTemplateForReportInSession.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.oracle.xmlns.oxp.service.publicreportservice.GetScheduledReportInfoInSession param, boolean optimizeContent)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(com.oracle.xmlns.oxp.service.publicreportservice.GetScheduledReportInfoInSession.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.oracle.xmlns.oxp.service.publicreportservice.UploadTemplateForReport param, boolean optimizeContent)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(com.oracle.xmlns.oxp.service.publicreportservice.UploadTemplateForReport.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.oracle.xmlns.oxp.service.publicreportservice.GetReportParametersInSession param, boolean optimizeContent)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(com.oracle.xmlns.oxp.service.publicreportservice.GetReportParametersInSession.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.oracle.xmlns.oxp.service.publicreportservice.RemoveTemplateForReportInSession param, boolean optimizeContent)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(com.oracle.xmlns.oxp.service.publicreportservice.RemoveTemplateForReportInSession.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.oracle.xmlns.oxp.service.publicreportservice.CreateReportFolderInSession param, boolean optimizeContent)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(com.oracle.xmlns.oxp.service.publicreportservice.CreateReportFolderInSession.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.oracle.xmlns.oxp.service.publicreportservice.HasReportAccessInSession param, boolean optimizeContent)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(com.oracle.xmlns.oxp.service.publicreportservice.HasReportAccessInSession.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.oracle.xmlns.oxp.service.publicreportservice.IsReportExist param, boolean optimizeContent)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(com.oracle.xmlns.oxp.service.publicreportservice.IsReportExist.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.oracle.xmlns.oxp.service.publicreportservice.GetBIPHTTPSessionInterval param, boolean optimizeContent)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(com.oracle.xmlns.oxp.service.publicreportservice.GetBIPHTTPSessionInterval.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.oracle.xmlns.oxp.service.publicreportservice.GetScheduledReportInfo param, boolean optimizeContent)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(com.oracle.xmlns.oxp.service.publicreportservice.GetScheduledReportInfo.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.oracle.xmlns.oxp.service.publicreportservice.DeleteFolderInSession param, boolean optimizeContent)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(com.oracle.xmlns.oxp.service.publicreportservice.DeleteFolderInSession.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.oracle.xmlns.oxp.service.publicreportservice.DeleteScheduledReportHistoryInSession param, boolean optimizeContent)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(com.oracle.xmlns.oxp.service.publicreportservice.DeleteScheduledReportHistoryInSession.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.oracle.xmlns.oxp.service.publicreportservice.SuspendScheduledReportInSession param, boolean optimizeContent)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(com.oracle.xmlns.oxp.service.publicreportservice.SuspendScheduledReportInSession.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.oracle.xmlns.oxp.service.publicreportservice.GetFolderContents param, boolean optimizeContent)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(com.oracle.xmlns.oxp.service.publicreportservice.GetFolderContents.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.oracle.xmlns.oxp.service.publicreportservice.GetReportDefinitionInSession param, boolean optimizeContent)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(com.oracle.xmlns.oxp.service.publicreportservice.GetReportDefinitionInSession.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.oracle.xmlns.oxp.service.publicreportservice.UploadReport param, boolean optimizeContent)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(com.oracle.xmlns.oxp.service.publicreportservice.UploadReport.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.oracle.xmlns.oxp.service.publicreportservice.RemoveTemplateForReport param, boolean optimizeContent)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(com.oracle.xmlns.oxp.service.publicreportservice.RemoveTemplateForReport.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.oracle.xmlns.oxp.service.publicreportservice.Logout param, boolean optimizeContent)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(com.oracle.xmlns.oxp.service.publicreportservice.Logout.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.oracle.xmlns.oxp.service.publicreportservice.DeleteScheduledReport param, boolean optimizeContent)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(com.oracle.xmlns.oxp.service.publicreportservice.DeleteScheduledReport.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.oracle.xmlns.oxp.service.publicreportservice.GetListOfScheduledReportsStatusInSession param, boolean optimizeContent)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(com.oracle.xmlns.oxp.service.publicreportservice.GetListOfScheduledReportsStatusInSession.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.oracle.xmlns.oxp.service.publicreportservice.SuspendScheduledReport param, boolean optimizeContent)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(com.oracle.xmlns.oxp.service.publicreportservice.SuspendScheduledReport.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.oracle.xmlns.oxp.service.publicreportservice.ScheduleReportInSession param, boolean optimizeContent)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(com.oracle.xmlns.oxp.service.publicreportservice.ScheduleReportInSession.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.oracle.xmlns.oxp.service.publicreportservice.GetReportParameters param, boolean optimizeContent)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(com.oracle.xmlns.oxp.service.publicreportservice.GetReportParameters.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             


        /**
        *  get the default envelope
        */
        private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory){
        return factory.getDefaultEnvelope();
        }


        private  java.lang.Object fromOM(
        org.apache.axiom.om.OMElement param,
        java.lang.Class type,
        java.util.Map extraNamespaces) throws org.apache.axis2.AxisFault{

        try {
        
                if (com.oracle.xmlns.oxp.service.publicreportservice.DeleteReportInSession.class.equals(type)){
                
                           return com.oracle.xmlns.oxp.service.publicreportservice.DeleteReportInSession.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.oracle.xmlns.oxp.service.publicreportservice.DeleteReportInSessionResponse.class.equals(type)){
                
                           return com.oracle.xmlns.oxp.service.publicreportservice.DeleteReportInSessionResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.oracle.xmlns.oxp.service.publicreportservice.Fault1.class.equals(type)){
                
                           return com.oracle.xmlns.oxp.service.publicreportservice.Fault1.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.oracle.xmlns.oxp.service.publicreportservice.Fault.class.equals(type)){
                
                           return com.oracle.xmlns.oxp.service.publicreportservice.Fault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.oracle.xmlns.oxp.service.publicreportservice.Fault2.class.equals(type)){
                
                           return com.oracle.xmlns.oxp.service.publicreportservice.Fault2.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.oracle.xmlns.oxp.service.publicreportservice.GetSecurityModel.class.equals(type)){
                
                           return com.oracle.xmlns.oxp.service.publicreportservice.GetSecurityModel.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.oracle.xmlns.oxp.service.publicreportservice.GetSecurityModelResponse.class.equals(type)){
                
                           return com.oracle.xmlns.oxp.service.publicreportservice.GetSecurityModelResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.oracle.xmlns.oxp.service.publicreportservice.GetListOfScheduledReportsStatus.class.equals(type)){
                
                           return com.oracle.xmlns.oxp.service.publicreportservice.GetListOfScheduledReportsStatus.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.oracle.xmlns.oxp.service.publicreportservice.GetListOfScheduledReportsStatusResponse.class.equals(type)){
                
                           return com.oracle.xmlns.oxp.service.publicreportservice.GetListOfScheduledReportsStatusResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.oracle.xmlns.oxp.service.publicreportservice.Fault1.class.equals(type)){
                
                           return com.oracle.xmlns.oxp.service.publicreportservice.Fault1.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.oracle.xmlns.oxp.service.publicreportservice.Fault.class.equals(type)){
                
                           return com.oracle.xmlns.oxp.service.publicreportservice.Fault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.oracle.xmlns.oxp.service.publicreportservice.Fault2.class.equals(type)){
                
                           return com.oracle.xmlns.oxp.service.publicreportservice.Fault2.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.oracle.xmlns.oxp.service.publicreportservice.DeleteFolder.class.equals(type)){
                
                           return com.oracle.xmlns.oxp.service.publicreportservice.DeleteFolder.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.oracle.xmlns.oxp.service.publicreportservice.DeleteFolderResponse.class.equals(type)){
                
                           return com.oracle.xmlns.oxp.service.publicreportservice.DeleteFolderResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.oracle.xmlns.oxp.service.publicreportservice.Fault1.class.equals(type)){
                
                           return com.oracle.xmlns.oxp.service.publicreportservice.Fault1.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.oracle.xmlns.oxp.service.publicreportservice.Fault.class.equals(type)){
                
                           return com.oracle.xmlns.oxp.service.publicreportservice.Fault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.oracle.xmlns.oxp.service.publicreportservice.Fault2.class.equals(type)){
                
                           return com.oracle.xmlns.oxp.service.publicreportservice.Fault2.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.oracle.xmlns.oxp.service.publicreportservice.GetScheduledReportStatusInSession.class.equals(type)){
                
                           return com.oracle.xmlns.oxp.service.publicreportservice.GetScheduledReportStatusInSession.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.oracle.xmlns.oxp.service.publicreportservice.GetScheduledReportStatusInSessionResponse.class.equals(type)){
                
                           return com.oracle.xmlns.oxp.service.publicreportservice.GetScheduledReportStatusInSessionResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.oracle.xmlns.oxp.service.publicreportservice.Fault1.class.equals(type)){
                
                           return com.oracle.xmlns.oxp.service.publicreportservice.Fault1.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.oracle.xmlns.oxp.service.publicreportservice.Fault.class.equals(type)){
                
                           return com.oracle.xmlns.oxp.service.publicreportservice.Fault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.oracle.xmlns.oxp.service.publicreportservice.Fault2.class.equals(type)){
                
                           return com.oracle.xmlns.oxp.service.publicreportservice.Fault2.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.oracle.xmlns.oxp.service.publicreportservice.CreateReport.class.equals(type)){
                
                           return com.oracle.xmlns.oxp.service.publicreportservice.CreateReport.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.oracle.xmlns.oxp.service.publicreportservice.CreateReportResponse.class.equals(type)){
                
                           return com.oracle.xmlns.oxp.service.publicreportservice.CreateReportResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.oracle.xmlns.oxp.service.publicreportservice.Fault1.class.equals(type)){
                
                           return com.oracle.xmlns.oxp.service.publicreportservice.Fault1.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.oracle.xmlns.oxp.service.publicreportservice.Fault.class.equals(type)){
                
                           return com.oracle.xmlns.oxp.service.publicreportservice.Fault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.oracle.xmlns.oxp.service.publicreportservice.Fault2.class.equals(type)){
                
                           return com.oracle.xmlns.oxp.service.publicreportservice.Fault2.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.oracle.xmlns.oxp.service.publicreportservice.GetScheduledReportHistoryInfoInSession.class.equals(type)){
                
                           return com.oracle.xmlns.oxp.service.publicreportservice.GetScheduledReportHistoryInfoInSession.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.oracle.xmlns.oxp.service.publicreportservice.GetScheduledReportHistoryInfoInSessionResponse.class.equals(type)){
                
                           return com.oracle.xmlns.oxp.service.publicreportservice.GetScheduledReportHistoryInfoInSessionResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.oracle.xmlns.oxp.service.publicreportservice.Fault1.class.equals(type)){
                
                           return com.oracle.xmlns.oxp.service.publicreportservice.Fault1.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.oracle.xmlns.oxp.service.publicreportservice.Fault.class.equals(type)){
                
                           return com.oracle.xmlns.oxp.service.publicreportservice.Fault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.oracle.xmlns.oxp.service.publicreportservice.Fault2.class.equals(type)){
                
                           return com.oracle.xmlns.oxp.service.publicreportservice.Fault2.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.oracle.xmlns.oxp.service.publicreportservice.GetScheduledReportHistoryInfo.class.equals(type)){
                
                           return com.oracle.xmlns.oxp.service.publicreportservice.GetScheduledReportHistoryInfo.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.oracle.xmlns.oxp.service.publicreportservice.GetScheduledReportHistoryInfoResponse.class.equals(type)){
                
                           return com.oracle.xmlns.oxp.service.publicreportservice.GetScheduledReportHistoryInfoResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.oracle.xmlns.oxp.service.publicreportservice.Fault1.class.equals(type)){
                
                           return com.oracle.xmlns.oxp.service.publicreportservice.Fault1.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.oracle.xmlns.oxp.service.publicreportservice.Fault.class.equals(type)){
                
                           return com.oracle.xmlns.oxp.service.publicreportservice.Fault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.oracle.xmlns.oxp.service.publicreportservice.Fault2.class.equals(type)){
                
                           return com.oracle.xmlns.oxp.service.publicreportservice.Fault2.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.oracle.xmlns.oxp.service.publicreportservice.DeleteReport.class.equals(type)){
                
                           return com.oracle.xmlns.oxp.service.publicreportservice.DeleteReport.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.oracle.xmlns.oxp.service.publicreportservice.DeleteReportResponse.class.equals(type)){
                
                           return com.oracle.xmlns.oxp.service.publicreportservice.DeleteReportResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.oracle.xmlns.oxp.service.publicreportservice.Fault1.class.equals(type)){
                
                           return com.oracle.xmlns.oxp.service.publicreportservice.Fault1.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.oracle.xmlns.oxp.service.publicreportservice.Fault.class.equals(type)){
                
                           return com.oracle.xmlns.oxp.service.publicreportservice.Fault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.oracle.xmlns.oxp.service.publicreportservice.Fault2.class.equals(type)){
                
                           return com.oracle.xmlns.oxp.service.publicreportservice.Fault2.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.oracle.xmlns.oxp.service.publicreportservice.Impersonate.class.equals(type)){
                
                           return com.oracle.xmlns.oxp.service.publicreportservice.Impersonate.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.oracle.xmlns.oxp.service.publicreportservice.ImpersonateResponse.class.equals(type)){
                
                           return com.oracle.xmlns.oxp.service.publicreportservice.ImpersonateResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.oracle.xmlns.oxp.service.publicreportservice.Fault.class.equals(type)){
                
                           return com.oracle.xmlns.oxp.service.publicreportservice.Fault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.oracle.xmlns.oxp.service.publicreportservice.IsFolderExist.class.equals(type)){
                
                           return com.oracle.xmlns.oxp.service.publicreportservice.IsFolderExist.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.oracle.xmlns.oxp.service.publicreportservice.IsFolderExistResponse.class.equals(type)){
                
                           return com.oracle.xmlns.oxp.service.publicreportservice.IsFolderExistResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.oracle.xmlns.oxp.service.publicreportservice.Fault.class.equals(type)){
                
                           return com.oracle.xmlns.oxp.service.publicreportservice.Fault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.oracle.xmlns.oxp.service.publicreportservice.HasReportAccess.class.equals(type)){
                
                           return com.oracle.xmlns.oxp.service.publicreportservice.HasReportAccess.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.oracle.xmlns.oxp.service.publicreportservice.HasReportAccessResponse.class.equals(type)){
                
                           return com.oracle.xmlns.oxp.service.publicreportservice.HasReportAccessResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.oracle.xmlns.oxp.service.publicreportservice.Fault1.class.equals(type)){
                
                           return com.oracle.xmlns.oxp.service.publicreportservice.Fault1.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.oracle.xmlns.oxp.service.publicreportservice.IsFolderExistInSession.class.equals(type)){
                
                           return com.oracle.xmlns.oxp.service.publicreportservice.IsFolderExistInSession.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.oracle.xmlns.oxp.service.publicreportservice.IsFolderExistInSessionResponse.class.equals(type)){
                
                           return com.oracle.xmlns.oxp.service.publicreportservice.IsFolderExistInSessionResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.oracle.xmlns.oxp.service.publicreportservice.Fault.class.equals(type)){
                
                           return com.oracle.xmlns.oxp.service.publicreportservice.Fault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.oracle.xmlns.oxp.service.publicreportservice.IsReportExistInSession.class.equals(type)){
                
                           return com.oracle.xmlns.oxp.service.publicreportservice.IsReportExistInSession.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.oracle.xmlns.oxp.service.publicreportservice.IsReportExistInSessionResponse.class.equals(type)){
                
                           return com.oracle.xmlns.oxp.service.publicreportservice.IsReportExistInSessionResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.oracle.xmlns.oxp.service.publicreportservice.Fault.class.equals(type)){
                
                           return com.oracle.xmlns.oxp.service.publicreportservice.Fault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.oracle.xmlns.oxp.service.publicreportservice.ResumeScheduledReportInSession.class.equals(type)){
                
                           return com.oracle.xmlns.oxp.service.publicreportservice.ResumeScheduledReportInSession.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.oracle.xmlns.oxp.service.publicreportservice.ResumeScheduledReportInSessionResponse.class.equals(type)){
                
                           return com.oracle.xmlns.oxp.service.publicreportservice.ResumeScheduledReportInSessionResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.oracle.xmlns.oxp.service.publicreportservice.Fault1.class.equals(type)){
                
                           return com.oracle.xmlns.oxp.service.publicreportservice.Fault1.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.oracle.xmlns.oxp.service.publicreportservice.Fault.class.equals(type)){
                
                           return com.oracle.xmlns.oxp.service.publicreportservice.Fault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.oracle.xmlns.oxp.service.publicreportservice.Fault2.class.equals(type)){
                
                           return com.oracle.xmlns.oxp.service.publicreportservice.Fault2.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.oracle.xmlns.oxp.service.publicreportservice.GetFolderContentsInSession.class.equals(type)){
                
                           return com.oracle.xmlns.oxp.service.publicreportservice.GetFolderContentsInSession.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.oracle.xmlns.oxp.service.publicreportservice.GetFolderContentsInSessionResponse.class.equals(type)){
                
                           return com.oracle.xmlns.oxp.service.publicreportservice.GetFolderContentsInSessionResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.oracle.xmlns.oxp.service.publicreportservice.Fault1.class.equals(type)){
                
                           return com.oracle.xmlns.oxp.service.publicreportservice.Fault1.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.oracle.xmlns.oxp.service.publicreportservice.Fault.class.equals(type)){
                
                           return com.oracle.xmlns.oxp.service.publicreportservice.Fault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.oracle.xmlns.oxp.service.publicreportservice.Fault2.class.equals(type)){
                
                           return com.oracle.xmlns.oxp.service.publicreportservice.Fault2.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.oracle.xmlns.oxp.service.publicreportservice.RunReport.class.equals(type)){
                
                           return com.oracle.xmlns.oxp.service.publicreportservice.RunReport.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.oracle.xmlns.oxp.service.publicreportservice.RunReportResponse.class.equals(type)){
                
                           return com.oracle.xmlns.oxp.service.publicreportservice.RunReportResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.oracle.xmlns.oxp.service.publicreportservice.Fault1.class.equals(type)){
                
                           return com.oracle.xmlns.oxp.service.publicreportservice.Fault1.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.oracle.xmlns.oxp.service.publicreportservice.Fault.class.equals(type)){
                
                           return com.oracle.xmlns.oxp.service.publicreportservice.Fault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.oracle.xmlns.oxp.service.publicreportservice.Fault2.class.equals(type)){
                
                           return com.oracle.xmlns.oxp.service.publicreportservice.Fault2.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.oracle.xmlns.oxp.service.publicreportservice.ScheduleReport.class.equals(type)){
                
                           return com.oracle.xmlns.oxp.service.publicreportservice.ScheduleReport.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.oracle.xmlns.oxp.service.publicreportservice.ScheduleReportResponse.class.equals(type)){
                
                           return com.oracle.xmlns.oxp.service.publicreportservice.ScheduleReportResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.oracle.xmlns.oxp.service.publicreportservice.Fault1.class.equals(type)){
                
                           return com.oracle.xmlns.oxp.service.publicreportservice.Fault1.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.oracle.xmlns.oxp.service.publicreportservice.Fault.class.equals(type)){
                
                           return com.oracle.xmlns.oxp.service.publicreportservice.Fault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.oracle.xmlns.oxp.service.publicreportservice.Fault2.class.equals(type)){
                
                           return com.oracle.xmlns.oxp.service.publicreportservice.Fault2.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.oracle.xmlns.oxp.service.publicreportservice.UpdateReportDefinitionInSession.class.equals(type)){
                
                           return com.oracle.xmlns.oxp.service.publicreportservice.UpdateReportDefinitionInSession.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.oracle.xmlns.oxp.service.publicreportservice.UpdateReportDefinitionInSessionResponse.class.equals(type)){
                
                           return com.oracle.xmlns.oxp.service.publicreportservice.UpdateReportDefinitionInSessionResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.oracle.xmlns.oxp.service.publicreportservice.Fault1.class.equals(type)){
                
                           return com.oracle.xmlns.oxp.service.publicreportservice.Fault1.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.oracle.xmlns.oxp.service.publicreportservice.Fault.class.equals(type)){
                
                           return com.oracle.xmlns.oxp.service.publicreportservice.Fault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.oracle.xmlns.oxp.service.publicreportservice.Fault2.class.equals(type)){
                
                           return com.oracle.xmlns.oxp.service.publicreportservice.Fault2.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.oracle.xmlns.oxp.service.publicreportservice.DeleteScheduledReportInSession.class.equals(type)){
                
                           return com.oracle.xmlns.oxp.service.publicreportservice.DeleteScheduledReportInSession.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.oracle.xmlns.oxp.service.publicreportservice.DeleteScheduledReportInSessionResponse.class.equals(type)){
                
                           return com.oracle.xmlns.oxp.service.publicreportservice.DeleteScheduledReportInSessionResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.oracle.xmlns.oxp.service.publicreportservice.Fault1.class.equals(type)){
                
                           return com.oracle.xmlns.oxp.service.publicreportservice.Fault1.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.oracle.xmlns.oxp.service.publicreportservice.Fault.class.equals(type)){
                
                           return com.oracle.xmlns.oxp.service.publicreportservice.Fault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.oracle.xmlns.oxp.service.publicreportservice.Fault2.class.equals(type)){
                
                           return com.oracle.xmlns.oxp.service.publicreportservice.Fault2.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.oracle.xmlns.oxp.service.publicreportservice.DownloadReport.class.equals(type)){
                
                           return com.oracle.xmlns.oxp.service.publicreportservice.DownloadReport.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.oracle.xmlns.oxp.service.publicreportservice.DownloadReportResponse.class.equals(type)){
                
                           return com.oracle.xmlns.oxp.service.publicreportservice.DownloadReportResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.oracle.xmlns.oxp.service.publicreportservice.Fault1.class.equals(type)){
                
                           return com.oracle.xmlns.oxp.service.publicreportservice.Fault1.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.oracle.xmlns.oxp.service.publicreportservice.Fault.class.equals(type)){
                
                           return com.oracle.xmlns.oxp.service.publicreportservice.Fault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.oracle.xmlns.oxp.service.publicreportservice.Fault2.class.equals(type)){
                
                           return com.oracle.xmlns.oxp.service.publicreportservice.Fault2.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.oracle.xmlns.oxp.service.publicreportservice.UploadReportInSession.class.equals(type)){
                
                           return com.oracle.xmlns.oxp.service.publicreportservice.UploadReportInSession.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.oracle.xmlns.oxp.service.publicreportservice.UploadReportInSessionResponse.class.equals(type)){
                
                           return com.oracle.xmlns.oxp.service.publicreportservice.UploadReportInSessionResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.oracle.xmlns.oxp.service.publicreportservice.Fault1.class.equals(type)){
                
                           return com.oracle.xmlns.oxp.service.publicreportservice.Fault1.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.oracle.xmlns.oxp.service.publicreportservice.Fault.class.equals(type)){
                
                           return com.oracle.xmlns.oxp.service.publicreportservice.Fault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.oracle.xmlns.oxp.service.publicreportservice.Fault2.class.equals(type)){
                
                           return com.oracle.xmlns.oxp.service.publicreportservice.Fault2.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.oracle.xmlns.oxp.service.publicreportservice.ResumeScheduledReport.class.equals(type)){
                
                           return com.oracle.xmlns.oxp.service.publicreportservice.ResumeScheduledReport.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.oracle.xmlns.oxp.service.publicreportservice.ResumeScheduledReportResponse.class.equals(type)){
                
                           return com.oracle.xmlns.oxp.service.publicreportservice.ResumeScheduledReportResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.oracle.xmlns.oxp.service.publicreportservice.Fault1.class.equals(type)){
                
                           return com.oracle.xmlns.oxp.service.publicreportservice.Fault1.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.oracle.xmlns.oxp.service.publicreportservice.Fault.class.equals(type)){
                
                           return com.oracle.xmlns.oxp.service.publicreportservice.Fault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.oracle.xmlns.oxp.service.publicreportservice.Fault2.class.equals(type)){
                
                           return com.oracle.xmlns.oxp.service.publicreportservice.Fault2.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.oracle.xmlns.oxp.service.publicreportservice.DeleteScheduledReportHistory.class.equals(type)){
                
                           return com.oracle.xmlns.oxp.service.publicreportservice.DeleteScheduledReportHistory.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.oracle.xmlns.oxp.service.publicreportservice.DeleteScheduledReportHistoryResponse.class.equals(type)){
                
                           return com.oracle.xmlns.oxp.service.publicreportservice.DeleteScheduledReportHistoryResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.oracle.xmlns.oxp.service.publicreportservice.Fault1.class.equals(type)){
                
                           return com.oracle.xmlns.oxp.service.publicreportservice.Fault1.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.oracle.xmlns.oxp.service.publicreportservice.Fault.class.equals(type)){
                
                           return com.oracle.xmlns.oxp.service.publicreportservice.Fault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.oracle.xmlns.oxp.service.publicreportservice.Fault2.class.equals(type)){
                
                           return com.oracle.xmlns.oxp.service.publicreportservice.Fault2.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.oracle.xmlns.oxp.service.publicreportservice.RunReportInSession.class.equals(type)){
                
                           return com.oracle.xmlns.oxp.service.publicreportservice.RunReportInSession.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.oracle.xmlns.oxp.service.publicreportservice.RunReportInSessionResponse.class.equals(type)){
                
                           return com.oracle.xmlns.oxp.service.publicreportservice.RunReportInSessionResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.oracle.xmlns.oxp.service.publicreportservice.Fault1.class.equals(type)){
                
                           return com.oracle.xmlns.oxp.service.publicreportservice.Fault1.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.oracle.xmlns.oxp.service.publicreportservice.Fault.class.equals(type)){
                
                           return com.oracle.xmlns.oxp.service.publicreportservice.Fault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.oracle.xmlns.oxp.service.publicreportservice.Fault2.class.equals(type)){
                
                           return com.oracle.xmlns.oxp.service.publicreportservice.Fault2.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.oracle.xmlns.oxp.service.publicreportservice.DownloadReportInSession.class.equals(type)){
                
                           return com.oracle.xmlns.oxp.service.publicreportservice.DownloadReportInSession.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.oracle.xmlns.oxp.service.publicreportservice.DownloadReportInSessionResponse.class.equals(type)){
                
                           return com.oracle.xmlns.oxp.service.publicreportservice.DownloadReportInSessionResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.oracle.xmlns.oxp.service.publicreportservice.Fault1.class.equals(type)){
                
                           return com.oracle.xmlns.oxp.service.publicreportservice.Fault1.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.oracle.xmlns.oxp.service.publicreportservice.Fault.class.equals(type)){
                
                           return com.oracle.xmlns.oxp.service.publicreportservice.Fault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.oracle.xmlns.oxp.service.publicreportservice.Fault2.class.equals(type)){
                
                           return com.oracle.xmlns.oxp.service.publicreportservice.Fault2.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.oracle.xmlns.oxp.service.publicreportservice.CreateReportInSession.class.equals(type)){
                
                           return com.oracle.xmlns.oxp.service.publicreportservice.CreateReportInSession.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.oracle.xmlns.oxp.service.publicreportservice.CreateReportInSessionResponse.class.equals(type)){
                
                           return com.oracle.xmlns.oxp.service.publicreportservice.CreateReportInSessionResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.oracle.xmlns.oxp.service.publicreportservice.Fault1.class.equals(type)){
                
                           return com.oracle.xmlns.oxp.service.publicreportservice.Fault1.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.oracle.xmlns.oxp.service.publicreportservice.Fault.class.equals(type)){
                
                           return com.oracle.xmlns.oxp.service.publicreportservice.Fault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.oracle.xmlns.oxp.service.publicreportservice.Fault2.class.equals(type)){
                
                           return com.oracle.xmlns.oxp.service.publicreportservice.Fault2.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.oracle.xmlns.oxp.service.publicreportservice.DownloadReportDataChunk.class.equals(type)){
                
                           return com.oracle.xmlns.oxp.service.publicreportservice.DownloadReportDataChunk.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.oracle.xmlns.oxp.service.publicreportservice.DownloadReportDataChunkResponse.class.equals(type)){
                
                           return com.oracle.xmlns.oxp.service.publicreportservice.DownloadReportDataChunkResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.oracle.xmlns.oxp.service.publicreportservice.Fault2.class.equals(type)){
                
                           return com.oracle.xmlns.oxp.service.publicreportservice.Fault2.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.oracle.xmlns.oxp.service.publicreportservice.GetScheduledReportStatus.class.equals(type)){
                
                           return com.oracle.xmlns.oxp.service.publicreportservice.GetScheduledReportStatus.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.oracle.xmlns.oxp.service.publicreportservice.GetScheduledReportStatusResponse.class.equals(type)){
                
                           return com.oracle.xmlns.oxp.service.publicreportservice.GetScheduledReportStatusResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.oracle.xmlns.oxp.service.publicreportservice.Fault1.class.equals(type)){
                
                           return com.oracle.xmlns.oxp.service.publicreportservice.Fault1.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.oracle.xmlns.oxp.service.publicreportservice.Fault.class.equals(type)){
                
                           return com.oracle.xmlns.oxp.service.publicreportservice.Fault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.oracle.xmlns.oxp.service.publicreportservice.Fault2.class.equals(type)){
                
                           return com.oracle.xmlns.oxp.service.publicreportservice.Fault2.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.oracle.xmlns.oxp.service.publicreportservice.GetReportDefinition.class.equals(type)){
                
                           return com.oracle.xmlns.oxp.service.publicreportservice.GetReportDefinition.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.oracle.xmlns.oxp.service.publicreportservice.GetReportDefinitionResponse.class.equals(type)){
                
                           return com.oracle.xmlns.oxp.service.publicreportservice.GetReportDefinitionResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.oracle.xmlns.oxp.service.publicreportservice.Fault1.class.equals(type)){
                
                           return com.oracle.xmlns.oxp.service.publicreportservice.Fault1.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.oracle.xmlns.oxp.service.publicreportservice.Fault.class.equals(type)){
                
                           return com.oracle.xmlns.oxp.service.publicreportservice.Fault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.oracle.xmlns.oxp.service.publicreportservice.Fault2.class.equals(type)){
                
                           return com.oracle.xmlns.oxp.service.publicreportservice.Fault2.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.oracle.xmlns.oxp.service.publicreportservice.UploadReportDataChunk.class.equals(type)){
                
                           return com.oracle.xmlns.oxp.service.publicreportservice.UploadReportDataChunk.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.oracle.xmlns.oxp.service.publicreportservice.UploadReportDataChunkResponse.class.equals(type)){
                
                           return com.oracle.xmlns.oxp.service.publicreportservice.UploadReportDataChunkResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.oracle.xmlns.oxp.service.publicreportservice.Fault2.class.equals(type)){
                
                           return com.oracle.xmlns.oxp.service.publicreportservice.Fault2.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.oracle.xmlns.oxp.service.publicreportservice.Login.class.equals(type)){
                
                           return com.oracle.xmlns.oxp.service.publicreportservice.Login.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.oracle.xmlns.oxp.service.publicreportservice.LoginResponse.class.equals(type)){
                
                           return com.oracle.xmlns.oxp.service.publicreportservice.LoginResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.oracle.xmlns.oxp.service.publicreportservice.Fault.class.equals(type)){
                
                           return com.oracle.xmlns.oxp.service.publicreportservice.Fault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.oracle.xmlns.oxp.service.publicreportservice.CreateReportFolder.class.equals(type)){
                
                           return com.oracle.xmlns.oxp.service.publicreportservice.CreateReportFolder.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.oracle.xmlns.oxp.service.publicreportservice.CreateReportFolderResponse.class.equals(type)){
                
                           return com.oracle.xmlns.oxp.service.publicreportservice.CreateReportFolderResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.oracle.xmlns.oxp.service.publicreportservice.Fault1.class.equals(type)){
                
                           return com.oracle.xmlns.oxp.service.publicreportservice.Fault1.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.oracle.xmlns.oxp.service.publicreportservice.Fault.class.equals(type)){
                
                           return com.oracle.xmlns.oxp.service.publicreportservice.Fault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.oracle.xmlns.oxp.service.publicreportservice.Fault2.class.equals(type)){
                
                           return com.oracle.xmlns.oxp.service.publicreportservice.Fault2.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.oracle.xmlns.oxp.service.publicreportservice.UpdateReportDefinition.class.equals(type)){
                
                           return com.oracle.xmlns.oxp.service.publicreportservice.UpdateReportDefinition.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.oracle.xmlns.oxp.service.publicreportservice.UpdateReportDefinitionResponse.class.equals(type)){
                
                           return com.oracle.xmlns.oxp.service.publicreportservice.UpdateReportDefinitionResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.oracle.xmlns.oxp.service.publicreportservice.Fault1.class.equals(type)){
                
                           return com.oracle.xmlns.oxp.service.publicreportservice.Fault1.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.oracle.xmlns.oxp.service.publicreportservice.Fault.class.equals(type)){
                
                           return com.oracle.xmlns.oxp.service.publicreportservice.Fault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.oracle.xmlns.oxp.service.publicreportservice.Fault2.class.equals(type)){
                
                           return com.oracle.xmlns.oxp.service.publicreportservice.Fault2.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.oracle.xmlns.oxp.service.publicreportservice.ValidateLogin.class.equals(type)){
                
                           return com.oracle.xmlns.oxp.service.publicreportservice.ValidateLogin.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.oracle.xmlns.oxp.service.publicreportservice.ValidateLoginResponse.class.equals(type)){
                
                           return com.oracle.xmlns.oxp.service.publicreportservice.ValidateLoginResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.oracle.xmlns.oxp.service.publicreportservice.UploadTemplateForReportInSession.class.equals(type)){
                
                           return com.oracle.xmlns.oxp.service.publicreportservice.UploadTemplateForReportInSession.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.oracle.xmlns.oxp.service.publicreportservice.UploadTemplateForReportInSessionResponse.class.equals(type)){
                
                           return com.oracle.xmlns.oxp.service.publicreportservice.UploadTemplateForReportInSessionResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.oracle.xmlns.oxp.service.publicreportservice.Fault1.class.equals(type)){
                
                           return com.oracle.xmlns.oxp.service.publicreportservice.Fault1.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.oracle.xmlns.oxp.service.publicreportservice.Fault.class.equals(type)){
                
                           return com.oracle.xmlns.oxp.service.publicreportservice.Fault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.oracle.xmlns.oxp.service.publicreportservice.Fault2.class.equals(type)){
                
                           return com.oracle.xmlns.oxp.service.publicreportservice.Fault2.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.oracle.xmlns.oxp.service.publicreportservice.GetScheduledReportInfoInSession.class.equals(type)){
                
                           return com.oracle.xmlns.oxp.service.publicreportservice.GetScheduledReportInfoInSession.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.oracle.xmlns.oxp.service.publicreportservice.GetScheduledReportInfoInSessionResponse.class.equals(type)){
                
                           return com.oracle.xmlns.oxp.service.publicreportservice.GetScheduledReportInfoInSessionResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.oracle.xmlns.oxp.service.publicreportservice.Fault1.class.equals(type)){
                
                           return com.oracle.xmlns.oxp.service.publicreportservice.Fault1.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.oracle.xmlns.oxp.service.publicreportservice.Fault.class.equals(type)){
                
                           return com.oracle.xmlns.oxp.service.publicreportservice.Fault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.oracle.xmlns.oxp.service.publicreportservice.Fault2.class.equals(type)){
                
                           return com.oracle.xmlns.oxp.service.publicreportservice.Fault2.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.oracle.xmlns.oxp.service.publicreportservice.UploadTemplateForReport.class.equals(type)){
                
                           return com.oracle.xmlns.oxp.service.publicreportservice.UploadTemplateForReport.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.oracle.xmlns.oxp.service.publicreportservice.UploadTemplateForReportResponse.class.equals(type)){
                
                           return com.oracle.xmlns.oxp.service.publicreportservice.UploadTemplateForReportResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.oracle.xmlns.oxp.service.publicreportservice.Fault1.class.equals(type)){
                
                           return com.oracle.xmlns.oxp.service.publicreportservice.Fault1.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.oracle.xmlns.oxp.service.publicreportservice.Fault.class.equals(type)){
                
                           return com.oracle.xmlns.oxp.service.publicreportservice.Fault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.oracle.xmlns.oxp.service.publicreportservice.Fault2.class.equals(type)){
                
                           return com.oracle.xmlns.oxp.service.publicreportservice.Fault2.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.oracle.xmlns.oxp.service.publicreportservice.GetReportParametersInSession.class.equals(type)){
                
                           return com.oracle.xmlns.oxp.service.publicreportservice.GetReportParametersInSession.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.oracle.xmlns.oxp.service.publicreportservice.GetReportParametersInSessionResponse.class.equals(type)){
                
                           return com.oracle.xmlns.oxp.service.publicreportservice.GetReportParametersInSessionResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.oracle.xmlns.oxp.service.publicreportservice.Fault1.class.equals(type)){
                
                           return com.oracle.xmlns.oxp.service.publicreportservice.Fault1.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.oracle.xmlns.oxp.service.publicreportservice.Fault.class.equals(type)){
                
                           return com.oracle.xmlns.oxp.service.publicreportservice.Fault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.oracle.xmlns.oxp.service.publicreportservice.Fault2.class.equals(type)){
                
                           return com.oracle.xmlns.oxp.service.publicreportservice.Fault2.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.oracle.xmlns.oxp.service.publicreportservice.RemoveTemplateForReportInSession.class.equals(type)){
                
                           return com.oracle.xmlns.oxp.service.publicreportservice.RemoveTemplateForReportInSession.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.oracle.xmlns.oxp.service.publicreportservice.RemoveTemplateForReportInSessionResponse.class.equals(type)){
                
                           return com.oracle.xmlns.oxp.service.publicreportservice.RemoveTemplateForReportInSessionResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.oracle.xmlns.oxp.service.publicreportservice.Fault1.class.equals(type)){
                
                           return com.oracle.xmlns.oxp.service.publicreportservice.Fault1.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.oracle.xmlns.oxp.service.publicreportservice.Fault.class.equals(type)){
                
                           return com.oracle.xmlns.oxp.service.publicreportservice.Fault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.oracle.xmlns.oxp.service.publicreportservice.Fault2.class.equals(type)){
                
                           return com.oracle.xmlns.oxp.service.publicreportservice.Fault2.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.oracle.xmlns.oxp.service.publicreportservice.CreateReportFolderInSession.class.equals(type)){
                
                           return com.oracle.xmlns.oxp.service.publicreportservice.CreateReportFolderInSession.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.oracle.xmlns.oxp.service.publicreportservice.CreateReportFolderInSessionResponse.class.equals(type)){
                
                           return com.oracle.xmlns.oxp.service.publicreportservice.CreateReportFolderInSessionResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.oracle.xmlns.oxp.service.publicreportservice.Fault1.class.equals(type)){
                
                           return com.oracle.xmlns.oxp.service.publicreportservice.Fault1.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.oracle.xmlns.oxp.service.publicreportservice.Fault.class.equals(type)){
                
                           return com.oracle.xmlns.oxp.service.publicreportservice.Fault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.oracle.xmlns.oxp.service.publicreportservice.Fault2.class.equals(type)){
                
                           return com.oracle.xmlns.oxp.service.publicreportservice.Fault2.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.oracle.xmlns.oxp.service.publicreportservice.HasReportAccessInSession.class.equals(type)){
                
                           return com.oracle.xmlns.oxp.service.publicreportservice.HasReportAccessInSession.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.oracle.xmlns.oxp.service.publicreportservice.HasReportAccessInSessionResponse.class.equals(type)){
                
                           return com.oracle.xmlns.oxp.service.publicreportservice.HasReportAccessInSessionResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.oracle.xmlns.oxp.service.publicreportservice.Fault1.class.equals(type)){
                
                           return com.oracle.xmlns.oxp.service.publicreportservice.Fault1.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.oracle.xmlns.oxp.service.publicreportservice.IsReportExist.class.equals(type)){
                
                           return com.oracle.xmlns.oxp.service.publicreportservice.IsReportExist.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.oracle.xmlns.oxp.service.publicreportservice.IsReportExistResponse.class.equals(type)){
                
                           return com.oracle.xmlns.oxp.service.publicreportservice.IsReportExistResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.oracle.xmlns.oxp.service.publicreportservice.Fault.class.equals(type)){
                
                           return com.oracle.xmlns.oxp.service.publicreportservice.Fault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.oracle.xmlns.oxp.service.publicreportservice.GetBIPHTTPSessionInterval.class.equals(type)){
                
                           return com.oracle.xmlns.oxp.service.publicreportservice.GetBIPHTTPSessionInterval.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.oracle.xmlns.oxp.service.publicreportservice.GetBIPHTTPSessionIntervalResponse.class.equals(type)){
                
                           return com.oracle.xmlns.oxp.service.publicreportservice.GetBIPHTTPSessionIntervalResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.oracle.xmlns.oxp.service.publicreportservice.GetScheduledReportInfo.class.equals(type)){
                
                           return com.oracle.xmlns.oxp.service.publicreportservice.GetScheduledReportInfo.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.oracle.xmlns.oxp.service.publicreportservice.GetScheduledReportInfoResponse.class.equals(type)){
                
                           return com.oracle.xmlns.oxp.service.publicreportservice.GetScheduledReportInfoResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.oracle.xmlns.oxp.service.publicreportservice.Fault1.class.equals(type)){
                
                           return com.oracle.xmlns.oxp.service.publicreportservice.Fault1.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.oracle.xmlns.oxp.service.publicreportservice.Fault.class.equals(type)){
                
                           return com.oracle.xmlns.oxp.service.publicreportservice.Fault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.oracle.xmlns.oxp.service.publicreportservice.Fault2.class.equals(type)){
                
                           return com.oracle.xmlns.oxp.service.publicreportservice.Fault2.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.oracle.xmlns.oxp.service.publicreportservice.DeleteFolderInSession.class.equals(type)){
                
                           return com.oracle.xmlns.oxp.service.publicreportservice.DeleteFolderInSession.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.oracle.xmlns.oxp.service.publicreportservice.DeleteFolderInSessionResponse.class.equals(type)){
                
                           return com.oracle.xmlns.oxp.service.publicreportservice.DeleteFolderInSessionResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.oracle.xmlns.oxp.service.publicreportservice.Fault1.class.equals(type)){
                
                           return com.oracle.xmlns.oxp.service.publicreportservice.Fault1.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.oracle.xmlns.oxp.service.publicreportservice.Fault.class.equals(type)){
                
                           return com.oracle.xmlns.oxp.service.publicreportservice.Fault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.oracle.xmlns.oxp.service.publicreportservice.Fault2.class.equals(type)){
                
                           return com.oracle.xmlns.oxp.service.publicreportservice.Fault2.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.oracle.xmlns.oxp.service.publicreportservice.DeleteScheduledReportHistoryInSession.class.equals(type)){
                
                           return com.oracle.xmlns.oxp.service.publicreportservice.DeleteScheduledReportHistoryInSession.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.oracle.xmlns.oxp.service.publicreportservice.DeleteScheduledReportHistoryInSessionResponse.class.equals(type)){
                
                           return com.oracle.xmlns.oxp.service.publicreportservice.DeleteScheduledReportHistoryInSessionResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.oracle.xmlns.oxp.service.publicreportservice.Fault1.class.equals(type)){
                
                           return com.oracle.xmlns.oxp.service.publicreportservice.Fault1.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.oracle.xmlns.oxp.service.publicreportservice.Fault.class.equals(type)){
                
                           return com.oracle.xmlns.oxp.service.publicreportservice.Fault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.oracle.xmlns.oxp.service.publicreportservice.Fault2.class.equals(type)){
                
                           return com.oracle.xmlns.oxp.service.publicreportservice.Fault2.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.oracle.xmlns.oxp.service.publicreportservice.SuspendScheduledReportInSession.class.equals(type)){
                
                           return com.oracle.xmlns.oxp.service.publicreportservice.SuspendScheduledReportInSession.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.oracle.xmlns.oxp.service.publicreportservice.SuspendScheduledReportInSessionResponse.class.equals(type)){
                
                           return com.oracle.xmlns.oxp.service.publicreportservice.SuspendScheduledReportInSessionResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.oracle.xmlns.oxp.service.publicreportservice.Fault1.class.equals(type)){
                
                           return com.oracle.xmlns.oxp.service.publicreportservice.Fault1.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.oracle.xmlns.oxp.service.publicreportservice.Fault.class.equals(type)){
                
                           return com.oracle.xmlns.oxp.service.publicreportservice.Fault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.oracle.xmlns.oxp.service.publicreportservice.Fault2.class.equals(type)){
                
                           return com.oracle.xmlns.oxp.service.publicreportservice.Fault2.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.oracle.xmlns.oxp.service.publicreportservice.GetFolderContents.class.equals(type)){
                
                           return com.oracle.xmlns.oxp.service.publicreportservice.GetFolderContents.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.oracle.xmlns.oxp.service.publicreportservice.GetFolderContentsResponse.class.equals(type)){
                
                           return com.oracle.xmlns.oxp.service.publicreportservice.GetFolderContentsResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.oracle.xmlns.oxp.service.publicreportservice.Fault1.class.equals(type)){
                
                           return com.oracle.xmlns.oxp.service.publicreportservice.Fault1.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.oracle.xmlns.oxp.service.publicreportservice.Fault.class.equals(type)){
                
                           return com.oracle.xmlns.oxp.service.publicreportservice.Fault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.oracle.xmlns.oxp.service.publicreportservice.Fault2.class.equals(type)){
                
                           return com.oracle.xmlns.oxp.service.publicreportservice.Fault2.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.oracle.xmlns.oxp.service.publicreportservice.GetReportDefinitionInSession.class.equals(type)){
                
                           return com.oracle.xmlns.oxp.service.publicreportservice.GetReportDefinitionInSession.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.oracle.xmlns.oxp.service.publicreportservice.GetReportDefinitionInSessionResponse.class.equals(type)){
                
                           return com.oracle.xmlns.oxp.service.publicreportservice.GetReportDefinitionInSessionResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.oracle.xmlns.oxp.service.publicreportservice.Fault1.class.equals(type)){
                
                           return com.oracle.xmlns.oxp.service.publicreportservice.Fault1.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.oracle.xmlns.oxp.service.publicreportservice.Fault.class.equals(type)){
                
                           return com.oracle.xmlns.oxp.service.publicreportservice.Fault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.oracle.xmlns.oxp.service.publicreportservice.Fault2.class.equals(type)){
                
                           return com.oracle.xmlns.oxp.service.publicreportservice.Fault2.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.oracle.xmlns.oxp.service.publicreportservice.UploadReport.class.equals(type)){
                
                           return com.oracle.xmlns.oxp.service.publicreportservice.UploadReport.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.oracle.xmlns.oxp.service.publicreportservice.UploadReportResponse.class.equals(type)){
                
                           return com.oracle.xmlns.oxp.service.publicreportservice.UploadReportResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.oracle.xmlns.oxp.service.publicreportservice.Fault1.class.equals(type)){
                
                           return com.oracle.xmlns.oxp.service.publicreportservice.Fault1.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.oracle.xmlns.oxp.service.publicreportservice.Fault.class.equals(type)){
                
                           return com.oracle.xmlns.oxp.service.publicreportservice.Fault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.oracle.xmlns.oxp.service.publicreportservice.Fault2.class.equals(type)){
                
                           return com.oracle.xmlns.oxp.service.publicreportservice.Fault2.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.oracle.xmlns.oxp.service.publicreportservice.RemoveTemplateForReport.class.equals(type)){
                
                           return com.oracle.xmlns.oxp.service.publicreportservice.RemoveTemplateForReport.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.oracle.xmlns.oxp.service.publicreportservice.RemoveTemplateForReportResponse.class.equals(type)){
                
                           return com.oracle.xmlns.oxp.service.publicreportservice.RemoveTemplateForReportResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.oracle.xmlns.oxp.service.publicreportservice.Fault1.class.equals(type)){
                
                           return com.oracle.xmlns.oxp.service.publicreportservice.Fault1.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.oracle.xmlns.oxp.service.publicreportservice.Fault.class.equals(type)){
                
                           return com.oracle.xmlns.oxp.service.publicreportservice.Fault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.oracle.xmlns.oxp.service.publicreportservice.Fault2.class.equals(type)){
                
                           return com.oracle.xmlns.oxp.service.publicreportservice.Fault2.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.oracle.xmlns.oxp.service.publicreportservice.Logout.class.equals(type)){
                
                           return com.oracle.xmlns.oxp.service.publicreportservice.Logout.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.oracle.xmlns.oxp.service.publicreportservice.LogoutResponse.class.equals(type)){
                
                           return com.oracle.xmlns.oxp.service.publicreportservice.LogoutResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.oracle.xmlns.oxp.service.publicreportservice.Fault1.class.equals(type)){
                
                           return com.oracle.xmlns.oxp.service.publicreportservice.Fault1.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.oracle.xmlns.oxp.service.publicreportservice.Fault.class.equals(type)){
                
                           return com.oracle.xmlns.oxp.service.publicreportservice.Fault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.oracle.xmlns.oxp.service.publicreportservice.DeleteScheduledReport.class.equals(type)){
                
                           return com.oracle.xmlns.oxp.service.publicreportservice.DeleteScheduledReport.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.oracle.xmlns.oxp.service.publicreportservice.DeleteScheduledReportResponse.class.equals(type)){
                
                           return com.oracle.xmlns.oxp.service.publicreportservice.DeleteScheduledReportResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.oracle.xmlns.oxp.service.publicreportservice.Fault1.class.equals(type)){
                
                           return com.oracle.xmlns.oxp.service.publicreportservice.Fault1.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.oracle.xmlns.oxp.service.publicreportservice.Fault.class.equals(type)){
                
                           return com.oracle.xmlns.oxp.service.publicreportservice.Fault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.oracle.xmlns.oxp.service.publicreportservice.Fault2.class.equals(type)){
                
                           return com.oracle.xmlns.oxp.service.publicreportservice.Fault2.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.oracle.xmlns.oxp.service.publicreportservice.GetListOfScheduledReportsStatusInSession.class.equals(type)){
                
                           return com.oracle.xmlns.oxp.service.publicreportservice.GetListOfScheduledReportsStatusInSession.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.oracle.xmlns.oxp.service.publicreportservice.GetListOfScheduledReportsStatusInSessionResponse.class.equals(type)){
                
                           return com.oracle.xmlns.oxp.service.publicreportservice.GetListOfScheduledReportsStatusInSessionResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.oracle.xmlns.oxp.service.publicreportservice.Fault1.class.equals(type)){
                
                           return com.oracle.xmlns.oxp.service.publicreportservice.Fault1.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.oracle.xmlns.oxp.service.publicreportservice.Fault.class.equals(type)){
                
                           return com.oracle.xmlns.oxp.service.publicreportservice.Fault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.oracle.xmlns.oxp.service.publicreportservice.Fault2.class.equals(type)){
                
                           return com.oracle.xmlns.oxp.service.publicreportservice.Fault2.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.oracle.xmlns.oxp.service.publicreportservice.SuspendScheduledReport.class.equals(type)){
                
                           return com.oracle.xmlns.oxp.service.publicreportservice.SuspendScheduledReport.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.oracle.xmlns.oxp.service.publicreportservice.SuspendScheduledReportResponse.class.equals(type)){
                
                           return com.oracle.xmlns.oxp.service.publicreportservice.SuspendScheduledReportResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.oracle.xmlns.oxp.service.publicreportservice.Fault1.class.equals(type)){
                
                           return com.oracle.xmlns.oxp.service.publicreportservice.Fault1.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.oracle.xmlns.oxp.service.publicreportservice.Fault.class.equals(type)){
                
                           return com.oracle.xmlns.oxp.service.publicreportservice.Fault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.oracle.xmlns.oxp.service.publicreportservice.Fault2.class.equals(type)){
                
                           return com.oracle.xmlns.oxp.service.publicreportservice.Fault2.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.oracle.xmlns.oxp.service.publicreportservice.ScheduleReportInSession.class.equals(type)){
                
                           return com.oracle.xmlns.oxp.service.publicreportservice.ScheduleReportInSession.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.oracle.xmlns.oxp.service.publicreportservice.ScheduleReportInSessionResponse.class.equals(type)){
                
                           return com.oracle.xmlns.oxp.service.publicreportservice.ScheduleReportInSessionResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.oracle.xmlns.oxp.service.publicreportservice.Fault1.class.equals(type)){
                
                           return com.oracle.xmlns.oxp.service.publicreportservice.Fault1.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.oracle.xmlns.oxp.service.publicreportservice.Fault.class.equals(type)){
                
                           return com.oracle.xmlns.oxp.service.publicreportservice.Fault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.oracle.xmlns.oxp.service.publicreportservice.Fault2.class.equals(type)){
                
                           return com.oracle.xmlns.oxp.service.publicreportservice.Fault2.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.oracle.xmlns.oxp.service.publicreportservice.GetReportParameters.class.equals(type)){
                
                           return com.oracle.xmlns.oxp.service.publicreportservice.GetReportParameters.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.oracle.xmlns.oxp.service.publicreportservice.GetReportParametersResponse.class.equals(type)){
                
                           return com.oracle.xmlns.oxp.service.publicreportservice.GetReportParametersResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.oracle.xmlns.oxp.service.publicreportservice.Fault1.class.equals(type)){
                
                           return com.oracle.xmlns.oxp.service.publicreportservice.Fault1.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.oracle.xmlns.oxp.service.publicreportservice.Fault.class.equals(type)){
                
                           return com.oracle.xmlns.oxp.service.publicreportservice.Fault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.oracle.xmlns.oxp.service.publicreportservice.Fault2.class.equals(type)){
                
                           return com.oracle.xmlns.oxp.service.publicreportservice.Fault2.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
        } catch (java.lang.Exception e) {
        throw org.apache.axis2.AxisFault.makeFault(e);
        }
           return null;
        }



    
   }
   