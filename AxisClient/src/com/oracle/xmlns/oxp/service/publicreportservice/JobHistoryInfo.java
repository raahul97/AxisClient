
/**
 * JobHistoryInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.4  Built on : Apr 26, 2008 (06:25:17 EDT)
 */
            
                package com.oracle.xmlns.oxp.service.publicreportservice;
            

            /**
            *  JobHistoryInfo bean class
            */
        
        public  class JobHistoryInfo
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = JobHistoryInfo
                Namespace URI = http://xmlns.oracle.com/oxp/service/PublicReportService
                Namespace Prefix = ns1
                */
            

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if(namespace.equals("http://xmlns.oracle.com/oxp/service/PublicReportService")){
                return "ns1";
            }
            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        

                        /**
                        * field for CreatedDate
                        */

                        
                                    protected java.util.Calendar localCreatedDate ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.util.Calendar
                           */
                           public  java.util.Calendar getCreatedDate(){
                               return localCreatedDate;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CreatedDate
                               */
                               public void setCreatedDate(java.util.Calendar param){
                            
                                            this.localCreatedDate=param;
                                    

                               }
                            

                        /**
                        * field for DocumentDataAvailable
                        */

                        
                                    protected boolean localDocumentDataAvailable ;
                                

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getDocumentDataAvailable(){
                               return localDocumentDataAvailable;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param DocumentDataAvailable
                               */
                               public void setDocumentDataAvailable(boolean param){
                            
                                            this.localDocumentDataAvailable=param;
                                    

                               }
                            

                        /**
                        * field for DocumentDataContentType
                        */

                        
                                    protected java.lang.String localDocumentDataContentType ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getDocumentDataContentType(){
                               return localDocumentDataContentType;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param DocumentDataContentType
                               */
                               public void setDocumentDataContentType(java.lang.String param){
                            
                                            this.localDocumentDataContentType=param;
                                    

                               }
                            

                        /**
                        * field for DocumentOutput
                        */

                        
                                    protected javax.activation.DataHandler localDocumentOutput ;
                                

                           /**
                           * Auto generated getter method
                           * @return javax.activation.DataHandler
                           */
                           public  javax.activation.DataHandler getDocumentOutput(){
                               return localDocumentOutput;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param DocumentOutput
                               */
                               public void setDocumentOutput(javax.activation.DataHandler param){
                            
                                            this.localDocumentOutput=param;
                                    

                               }
                            

                        /**
                        * field for JobID
                        */

                        
                                    protected int localJobID ;
                                

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getJobID(){
                               return localJobID;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param JobID
                               */
                               public void setJobID(int param){
                            
                                            this.localJobID=param;
                                    

                               }
                            

                        /**
                        * field for JobMessage
                        */

                        
                                    protected java.lang.String localJobMessage ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getJobMessage(){
                               return localJobMessage;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param JobMessage
                               */
                               public void setJobMessage(java.lang.String param){
                            
                                            this.localJobMessage=param;
                                    

                               }
                            

                        /**
                        * field for JobName
                        */

                        
                                    protected java.lang.String localJobName ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getJobName(){
                               return localJobName;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param JobName
                               */
                               public void setJobName(java.lang.String param){
                            
                                            this.localJobName=param;
                                    

                               }
                            

                        /**
                        * field for OutputID
                        */

                        
                                    protected int localOutputID ;
                                

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getOutputID(){
                               return localOutputID;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param OutputID
                               */
                               public void setOutputID(int param){
                            
                                            this.localOutputID=param;
                                    

                               }
                            

                        /**
                        * field for ReportData
                        */

                        
                                    protected javax.activation.DataHandler localReportData ;
                                

                           /**
                           * Auto generated getter method
                           * @return javax.activation.DataHandler
                           */
                           public  javax.activation.DataHandler getReportData(){
                               return localReportData;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ReportData
                               */
                               public void setReportData(javax.activation.DataHandler param){
                            
                                            this.localReportData=param;
                                    

                               }
                            

                        /**
                        * field for ReportDataAvailable
                        */

                        
                                    protected boolean localReportDataAvailable ;
                                

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getReportDataAvailable(){
                               return localReportDataAvailable;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ReportDataAvailable
                               */
                               public void setReportDataAvailable(boolean param){
                            
                                            this.localReportDataAvailable=param;
                                    

                               }
                            

                        /**
                        * field for ReportDataContentType
                        */

                        
                                    protected java.lang.String localReportDataContentType ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getReportDataContentType(){
                               return localReportDataContentType;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ReportDataContentType
                               */
                               public void setReportDataContentType(java.lang.String param){
                            
                                            this.localReportDataContentType=param;
                                    

                               }
                            

                        /**
                        * field for ReportName
                        */

                        
                                    protected java.lang.String localReportName ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getReportName(){
                               return localReportName;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ReportName
                               */
                               public void setReportName(java.lang.String param){
                            
                                            this.localReportName=param;
                                    

                               }
                            

                        /**
                        * field for ReportURL
                        */

                        
                                    protected java.lang.String localReportURL ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getReportURL(){
                               return localReportURL;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ReportURL
                               */
                               public void setReportURL(java.lang.String param){
                            
                                            this.localReportURL=param;
                                    

                               }
                            

                        /**
                        * field for Status
                        */

                        
                                    protected java.lang.String localStatus ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getStatus(){
                               return localStatus;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Status
                               */
                               public void setStatus(java.lang.String param){
                            
                                            this.localStatus=param;
                                    

                               }
                            

                        /**
                        * field for StatusDetail
                        */

                        
                                    protected java.lang.String localStatusDetail ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getStatusDetail(){
                               return localStatusDetail;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param StatusDetail
                               */
                               public void setStatusDetail(java.lang.String param){
                            
                                            this.localStatusDetail=param;
                                    

                               }
                            

                        /**
                        * field for Username
                        */

                        
                                    protected java.lang.String localUsername ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getUsername(){
                               return localUsername;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Username
                               */
                               public void setUsername(java.lang.String param){
                            
                                            this.localUsername=param;
                                    

                               }
                            

     /**
     * isReaderMTOMAware
     * @return true if the reader supports MTOM
     */
   public static boolean isReaderMTOMAware(javax.xml.stream.XMLStreamReader reader) {
        boolean isReaderMTOMAware = false;
        
        try{
          isReaderMTOMAware = java.lang.Boolean.TRUE.equals(reader.getProperty(org.apache.axiom.om.OMConstants.IS_DATA_HANDLERS_AWARE));
        }catch(java.lang.IllegalArgumentException e){
          isReaderMTOMAware = false;
        }
        return isReaderMTOMAware;
   }
     
     
        /**
        *
        * @param parentQName
        * @param factory
        * @return org.apache.axiom.om.OMElement
        */
       public org.apache.axiom.om.OMElement getOMElement (
               final javax.xml.namespace.QName parentQName,
               final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException{


        
               org.apache.axiom.om.OMDataSource dataSource =
                       new org.apache.axis2.databinding.ADBDataSource(this,parentQName){

                 public void serialize(org.apache.axis2.databinding.utils.writer.MTOMAwareXMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
                       JobHistoryInfo.this.serialize(parentQName,factory,xmlWriter);
                 }
               };
               return new org.apache.axiom.om.impl.llom.OMSourcedElementImpl(
               parentQName,factory,dataSource);
            
       }

         public void serialize(final javax.xml.namespace.QName parentQName,
                                       final org.apache.axiom.om.OMFactory factory,
                                       org.apache.axis2.databinding.utils.writer.MTOMAwareXMLStreamWriter xmlWriter)
                                throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
                           serialize(parentQName,factory,xmlWriter,false);
         }

         public void serialize(final javax.xml.namespace.QName parentQName,
                               final org.apache.axiom.om.OMFactory factory,
                               org.apache.axis2.databinding.utils.writer.MTOMAwareXMLStreamWriter xmlWriter,
                               boolean serializeType)
            throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
            
                


                java.lang.String prefix = null;
                java.lang.String namespace = null;
                

                    prefix = parentQName.getPrefix();
                    namespace = parentQName.getNamespaceURI();

                    if ((namespace != null) && (namespace.trim().length() > 0)) {
                        java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
                        if (writerPrefix != null) {
                            xmlWriter.writeStartElement(namespace, parentQName.getLocalPart());
                        } else {
                            if (prefix == null) {
                                prefix = generatePrefix(namespace);
                            }

                            xmlWriter.writeStartElement(prefix, parentQName.getLocalPart(), namespace);
                            xmlWriter.writeNamespace(prefix, namespace);
                            xmlWriter.setPrefix(prefix, namespace);
                        }
                    } else {
                        xmlWriter.writeStartElement(parentQName.getLocalPart());
                    }
                
                  if (serializeType){
               

                   java.lang.String namespacePrefix = registerPrefix(xmlWriter,"http://xmlns.oracle.com/oxp/service/PublicReportService");
                   if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           namespacePrefix+":JobHistoryInfo",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "JobHistoryInfo",
                           xmlWriter);
                   }

               
                   }
               
                                    namespace = "http://xmlns.oracle.com/oxp/service/PublicReportService";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"createdDate", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"createdDate");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("createdDate");
                                    }
                                

                                          if (localCreatedDate==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCreatedDate));
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    namespace = "http://xmlns.oracle.com/oxp/service/PublicReportService";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"documentDataAvailable", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"documentDataAvailable");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("documentDataAvailable");
                                    }
                                
                                               if (false) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("documentDataAvailable cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDocumentDataAvailable));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    namespace = "http://xmlns.oracle.com/oxp/service/PublicReportService";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"documentDataContentType", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"documentDataContentType");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("documentDataContentType");
                                    }
                                

                                          if (localDocumentDataContentType==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localDocumentDataContentType);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    namespace = "http://xmlns.oracle.com/oxp/service/PublicReportService";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"documentOutput", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"documentOutput");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("documentOutput");
                                    }
                                
                                        
                                    if (localDocumentOutput!=null)
                                    {
                                       xmlWriter.writeDataHandler(localDocumentOutput);
                                    }
                                 
                                   xmlWriter.writeEndElement();
                             
                                    namespace = "http://xmlns.oracle.com/oxp/service/PublicReportService";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"jobID", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"jobID");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("jobID");
                                    }
                                
                                               if (localJobID==java.lang.Integer.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("jobID cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localJobID));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    namespace = "http://xmlns.oracle.com/oxp/service/PublicReportService";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"jobMessage", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"jobMessage");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("jobMessage");
                                    }
                                

                                          if (localJobMessage==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localJobMessage);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    namespace = "http://xmlns.oracle.com/oxp/service/PublicReportService";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"jobName", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"jobName");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("jobName");
                                    }
                                

                                          if (localJobName==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localJobName);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    namespace = "http://xmlns.oracle.com/oxp/service/PublicReportService";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"outputID", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"outputID");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("outputID");
                                    }
                                
                                               if (localOutputID==java.lang.Integer.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("outputID cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localOutputID));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    namespace = "http://xmlns.oracle.com/oxp/service/PublicReportService";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"reportData", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"reportData");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("reportData");
                                    }
                                
                                        
                                    if (localReportData!=null)
                                    {
                                       xmlWriter.writeDataHandler(localReportData);
                                    }
                                 
                                   xmlWriter.writeEndElement();
                             
                                    namespace = "http://xmlns.oracle.com/oxp/service/PublicReportService";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"reportDataAvailable", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"reportDataAvailable");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("reportDataAvailable");
                                    }
                                
                                               if (false) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("reportDataAvailable cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localReportDataAvailable));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    namespace = "http://xmlns.oracle.com/oxp/service/PublicReportService";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"reportDataContentType", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"reportDataContentType");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("reportDataContentType");
                                    }
                                

                                          if (localReportDataContentType==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localReportDataContentType);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    namespace = "http://xmlns.oracle.com/oxp/service/PublicReportService";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"reportName", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"reportName");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("reportName");
                                    }
                                

                                          if (localReportName==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localReportName);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    namespace = "http://xmlns.oracle.com/oxp/service/PublicReportService";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"reportURL", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"reportURL");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("reportURL");
                                    }
                                

                                          if (localReportURL==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localReportURL);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    namespace = "http://xmlns.oracle.com/oxp/service/PublicReportService";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"status", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"status");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("status");
                                    }
                                

                                          if (localStatus==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localStatus);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    namespace = "http://xmlns.oracle.com/oxp/service/PublicReportService";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"statusDetail", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"statusDetail");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("statusDetail");
                                    }
                                

                                          if (localStatusDetail==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localStatusDetail);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    namespace = "http://xmlns.oracle.com/oxp/service/PublicReportService";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"username", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"username");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("username");
                                    }
                                

                                          if (localUsername==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localUsername);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             
                    xmlWriter.writeEndElement();
               

        }

         /**
          * Util method to write an attribute with the ns prefix
          */
          private void writeAttribute(java.lang.String prefix,java.lang.String namespace,java.lang.String attName,
                                      java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
              if (xmlWriter.getPrefix(namespace) == null) {
                       xmlWriter.writeNamespace(prefix, namespace);
                       xmlWriter.setPrefix(prefix, namespace);

              }

              xmlWriter.writeAttribute(namespace,attName,attValue);

         }

        /**
          * Util method to write an attribute without the ns prefix
          */
          private void writeAttribute(java.lang.String namespace,java.lang.String attName,
                                      java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
                if (namespace.equals(""))
              {
                  xmlWriter.writeAttribute(attName,attValue);
              }
              else
              {
                  registerPrefix(xmlWriter, namespace);
                  xmlWriter.writeAttribute(namespace,attName,attValue);
              }
          }


           /**
             * Util method to write an attribute without the ns prefix
             */
            private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName,
                                             javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

                java.lang.String attributeNamespace = qname.getNamespaceURI();
                java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
                if (attributePrefix == null) {
                    attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
                }
                java.lang.String attributeValue;
                if (attributePrefix.trim().length() > 0) {
                    attributeValue = attributePrefix + ":" + qname.getLocalPart();
                } else {
                    attributeValue = qname.getLocalPart();
                }

                if (namespace.equals("")) {
                    xmlWriter.writeAttribute(attName, attributeValue);
                } else {
                    registerPrefix(xmlWriter, namespace);
                    xmlWriter.writeAttribute(namespace, attName, attributeValue);
                }
            }
        /**
         *  method to handle Qnames
         */

        private void writeQName(javax.xml.namespace.QName qname,
                                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String namespaceURI = qname.getNamespaceURI();
            if (namespaceURI != null) {
                java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
                if (prefix == null) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix,namespaceURI);
                }

                if (prefix.trim().length() > 0){
                    xmlWriter.writeCharacters(prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                } else {
                    // i.e this is the default namespace
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                }

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames,
                                 javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
                java.lang.String namespaceURI = null;
                java.lang.String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }
                    namespaceURI = qnames[i].getNamespaceURI();
                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);
                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = generatePrefix(namespaceURI);
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix,namespaceURI);
                        }

                        if (prefix.trim().length() > 0){
                            stringToWrite.append(prefix).append(":").append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        } else {
                            stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        }
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                    }
                }
                xmlWriter.writeCharacters(stringToWrite.toString());
            }

        }


         /**
         * Register a namespace prefix
         */
         private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace) throws javax.xml.stream.XMLStreamException {
                java.lang.String prefix = xmlWriter.getPrefix(namespace);

                if (prefix == null) {
                    prefix = generatePrefix(namespace);

                    while (xmlWriter.getNamespaceContext().getNamespaceURI(prefix) != null) {
                        prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                    }

                    xmlWriter.writeNamespace(prefix, namespace);
                    xmlWriter.setPrefix(prefix, namespace);
                }

                return prefix;
            }


  
        /**
        * databinding method to get an XML representation of this object
        *
        */
        public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
                    throws org.apache.axis2.databinding.ADBException{


        
                 java.util.ArrayList elementList = new java.util.ArrayList();
                 java.util.ArrayList attribList = new java.util.ArrayList();

                
                                      elementList.add(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService",
                                                                      "createdDate"));
                                 
                                         elementList.add(localCreatedDate==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCreatedDate));
                                    
                                      elementList.add(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService",
                                                                      "documentDataAvailable"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDocumentDataAvailable));
                            
                                      elementList.add(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService",
                                                                      "documentDataContentType"));
                                 
                                         elementList.add(localDocumentDataContentType==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDocumentDataContentType));
                                    
                                      elementList.add(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService",
                                        "documentOutput"));
                                
                            elementList.add(localDocumentOutput);
                        
                                      elementList.add(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService",
                                                                      "jobID"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localJobID));
                            
                                      elementList.add(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService",
                                                                      "jobMessage"));
                                 
                                         elementList.add(localJobMessage==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localJobMessage));
                                    
                                      elementList.add(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService",
                                                                      "jobName"));
                                 
                                         elementList.add(localJobName==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localJobName));
                                    
                                      elementList.add(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService",
                                                                      "outputID"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localOutputID));
                            
                                      elementList.add(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService",
                                        "reportData"));
                                
                            elementList.add(localReportData);
                        
                                      elementList.add(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService",
                                                                      "reportDataAvailable"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localReportDataAvailable));
                            
                                      elementList.add(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService",
                                                                      "reportDataContentType"));
                                 
                                         elementList.add(localReportDataContentType==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localReportDataContentType));
                                    
                                      elementList.add(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService",
                                                                      "reportName"));
                                 
                                         elementList.add(localReportName==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localReportName));
                                    
                                      elementList.add(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService",
                                                                      "reportURL"));
                                 
                                         elementList.add(localReportURL==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localReportURL));
                                    
                                      elementList.add(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService",
                                                                      "status"));
                                 
                                         elementList.add(localStatus==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localStatus));
                                    
                                      elementList.add(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService",
                                                                      "statusDetail"));
                                 
                                         elementList.add(localStatusDetail==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localStatusDetail));
                                    
                                      elementList.add(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService",
                                                                      "username"));
                                 
                                         elementList.add(localUsername==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localUsername));
                                    

                return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(), attribList.toArray());
            
            

        }

  

     /**
      *  Factory class that keeps the parse method
      */
    public static class Factory{

        
        

        /**
        * static method to create the object
        * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
        *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
        * Postcondition: If this object is an element, the reader is positioned at its end element
        *                If this object is a complex type, the reader is positioned at the end element of its outer element
        */
        public static JobHistoryInfo parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            JobHistoryInfo object =
                new JobHistoryInfo();

            int event;
            java.lang.String nillableValue = null;
            java.lang.String prefix ="";
            java.lang.String namespaceuri ="";
            try {
                
                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                
                if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","type")!=null){
                  java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                        "type");
                  if (fullTypeName!=null){
                    java.lang.String nsPrefix = null;
                    if (fullTypeName.indexOf(":") > -1){
                        nsPrefix = fullTypeName.substring(0,fullTypeName.indexOf(":"));
                    }
                    nsPrefix = nsPrefix==null?"":nsPrefix;

                    java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":")+1);
                    
                            if (!"JobHistoryInfo".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (JobHistoryInfo)com.oracle.xmlns.oxp.service.publicreportservice.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                 
                    
                    reader.next();
                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","createdDate").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setCreatedDate(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDateTime(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","documentDataAvailable").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setDocumentDataAvailable(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","documentDataContentType").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setDocumentDataContentType(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","documentOutput").equals(reader.getName())){
                                reader.next();
                                    if (isReaderMTOMAware(reader)
                                            &&
                                            java.lang.Boolean.TRUE.equals(reader.getProperty(org.apache.axiom.om.OMConstants.IS_BINARY)))
                                    {
                                        //MTOM aware reader - get the datahandler directly and put it in the object
                                        object.setDocumentOutput(
                                                (javax.activation.DataHandler) reader.getProperty(org.apache.axiom.om.OMConstants.DATA_HANDLER));
                                    } else {
                                        if (reader.getEventType() == javax.xml.stream.XMLStreamConstants.START_ELEMENT && reader.getName().equals(new javax.xml.namespace.QName(org.apache.axiom.om.impl.MTOMConstants.XOP_NAMESPACE_URI, org.apache.axiom.om.impl.MTOMConstants.XOP_INCLUDE)))
                                        {
                                            java.lang.String id = org.apache.axiom.om.util.ElementHelper.getContentID(reader, "UTF-8");
                                            object.setDocumentOutput(((org.apache.axiom.soap.impl.builder.MTOMStAXSOAPModelBuilder) ((org.apache.axiom.om.impl.llom.OMStAXWrapper) reader).getBuilder()).getDataHandler(id));
                                            reader.next();
                                            
                                                reader.next();
                                            
                                        } else if(reader.hasText()) {
                                            //Do the usual conversion
                                            java.lang.String content = reader.getText();
                                            object.setDocumentOutput(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBase64Binary(content));
                                            
                                                reader.next();
                                            
                                        }
                                    }

                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","jobID").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setJobID(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","jobMessage").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setJobMessage(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","jobName").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setJobName(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","outputID").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setOutputID(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","reportData").equals(reader.getName())){
                                reader.next();
                                    if (isReaderMTOMAware(reader)
                                            &&
                                            java.lang.Boolean.TRUE.equals(reader.getProperty(org.apache.axiom.om.OMConstants.IS_BINARY)))
                                    {
                                        //MTOM aware reader - get the datahandler directly and put it in the object
                                        object.setReportData(
                                                (javax.activation.DataHandler) reader.getProperty(org.apache.axiom.om.OMConstants.DATA_HANDLER));
                                    } else {
                                        if (reader.getEventType() == javax.xml.stream.XMLStreamConstants.START_ELEMENT && reader.getName().equals(new javax.xml.namespace.QName(org.apache.axiom.om.impl.MTOMConstants.XOP_NAMESPACE_URI, org.apache.axiom.om.impl.MTOMConstants.XOP_INCLUDE)))
                                        {
                                            java.lang.String id = org.apache.axiom.om.util.ElementHelper.getContentID(reader, "UTF-8");
                                            object.setReportData(((org.apache.axiom.soap.impl.builder.MTOMStAXSOAPModelBuilder) ((org.apache.axiom.om.impl.llom.OMStAXWrapper) reader).getBuilder()).getDataHandler(id));
                                            reader.next();
                                            
                                                reader.next();
                                            
                                        } else if(reader.hasText()) {
                                            //Do the usual conversion
                                            java.lang.String content = reader.getText();
                                            object.setReportData(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBase64Binary(content));
                                            
                                                reader.next();
                                            
                                        }
                                    }

                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","reportDataAvailable").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setReportDataAvailable(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","reportDataContentType").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setReportDataContentType(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","reportName").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setReportName(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","reportURL").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setReportURL(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","status").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setStatus(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","statusDetail").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setStatusDetail(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","username").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setUsername(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                              
                            while (!reader.isStartElement() && !reader.isEndElement())
                                reader.next();
                            
                                if (reader.isStartElement())
                                // A start element we are not expecting indicates a trailing invalid property
                                throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                            



            } catch (javax.xml.stream.XMLStreamException e) {
                throw new java.lang.Exception(e);
            }

            return object;
        }

        }//end of factory class

        

        }
           
          