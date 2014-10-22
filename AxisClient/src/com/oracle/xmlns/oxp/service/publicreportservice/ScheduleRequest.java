
/**
 * ScheduleRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.4  Built on : Apr 26, 2008 (06:25:17 EDT)
 */
            
                package com.oracle.xmlns.oxp.service.publicreportservice;
            

            /**
            *  ScheduleRequest bean class
            */
        
        public  class ScheduleRequest
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = ScheduleRequest
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
                        * field for CronExpression
                        */

                        
                                    protected java.lang.String localCronExpression ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getCronExpression(){
                               return localCronExpression;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CronExpression
                               */
                               public void setCronExpression(java.lang.String param){
                            
                                            this.localCronExpression=param;
                                    

                               }
                            

                        /**
                        * field for DeliveryRequest
                        */

                        
                                    protected com.oracle.xmlns.oxp.service.publicreportservice.DeliveryRequest localDeliveryRequest ;
                                

                           /**
                           * Auto generated getter method
                           * @return com.oracle.xmlns.oxp.service.publicreportservice.DeliveryRequest
                           */
                           public  com.oracle.xmlns.oxp.service.publicreportservice.DeliveryRequest getDeliveryRequest(){
                               return localDeliveryRequest;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param DeliveryRequest
                               */
                               public void setDeliveryRequest(com.oracle.xmlns.oxp.service.publicreportservice.DeliveryRequest param){
                            
                                            this.localDeliveryRequest=param;
                                    

                               }
                            

                        /**
                        * field for EndDate
                        */

                        
                                    protected java.util.Calendar localEndDate ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.util.Calendar
                           */
                           public  java.util.Calendar getEndDate(){
                               return localEndDate;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param EndDate
                               */
                               public void setEndDate(java.util.Calendar param){
                            
                                            this.localEndDate=param;
                                    

                               }
                            

                        /**
                        * field for JobCalendar
                        */

                        
                                    protected java.lang.String localJobCalendar ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getJobCalendar(){
                               return localJobCalendar;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param JobCalendar
                               */
                               public void setJobCalendar(java.lang.String param){
                            
                                            this.localJobCalendar=param;
                                    

                               }
                            

                        /**
                        * field for JobLocale
                        */

                        
                                    protected java.lang.String localJobLocale ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getJobLocale(){
                               return localJobLocale;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param JobLocale
                               */
                               public void setJobLocale(java.lang.String param){
                            
                                            this.localJobLocale=param;
                                    

                               }
                            

                        /**
                        * field for JobTZ
                        */

                        
                                    protected java.lang.String localJobTZ ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getJobTZ(){
                               return localJobTZ;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param JobTZ
                               */
                               public void setJobTZ(java.lang.String param){
                            
                                            this.localJobTZ=param;
                                    

                               }
                            

                        /**
                        * field for NotificationTo
                        */

                        
                                    protected java.lang.String localNotificationTo ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getNotificationTo(){
                               return localNotificationTo;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param NotificationTo
                               */
                               public void setNotificationTo(java.lang.String param){
                            
                                            this.localNotificationTo=param;
                                    

                               }
                            

                        /**
                        * field for NotifyWhenFailed
                        */

                        
                                    protected boolean localNotifyWhenFailed ;
                                

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getNotifyWhenFailed(){
                               return localNotifyWhenFailed;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param NotifyWhenFailed
                               */
                               public void setNotifyWhenFailed(boolean param){
                            
                                            this.localNotifyWhenFailed=param;
                                    

                               }
                            

                        /**
                        * field for NotifyWhenSuccess
                        */

                        
                                    protected boolean localNotifyWhenSuccess ;
                                

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getNotifyWhenSuccess(){
                               return localNotifyWhenSuccess;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param NotifyWhenSuccess
                               */
                               public void setNotifyWhenSuccess(boolean param){
                            
                                            this.localNotifyWhenSuccess=param;
                                    

                               }
                            

                        /**
                        * field for NotifyWhenWarning
                        */

                        
                                    protected boolean localNotifyWhenWarning ;
                                

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getNotifyWhenWarning(){
                               return localNotifyWhenWarning;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param NotifyWhenWarning
                               */
                               public void setNotifyWhenWarning(boolean param){
                            
                                            this.localNotifyWhenWarning=param;
                                    

                               }
                            

                        /**
                        * field for HttpNotificationServer
                        */

                        
                                    protected java.lang.String localHttpNotificationServer ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getHttpNotificationServer(){
                               return localHttpNotificationServer;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param HttpNotificationServer
                               */
                               public void setHttpNotificationServer(java.lang.String param){
                            
                                            this.localHttpNotificationServer=param;
                                    

                               }
                            

                        /**
                        * field for HttpNotificationUserName
                        */

                        
                                    protected java.lang.String localHttpNotificationUserName ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getHttpNotificationUserName(){
                               return localHttpNotificationUserName;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param HttpNotificationUserName
                               */
                               public void setHttpNotificationUserName(java.lang.String param){
                            
                                            this.localHttpNotificationUserName=param;
                                    

                               }
                            

                        /**
                        * field for HttpNotificationPassword
                        */

                        
                                    protected java.lang.String localHttpNotificationPassword ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getHttpNotificationPassword(){
                               return localHttpNotificationPassword;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param HttpNotificationPassword
                               */
                               public void setHttpNotificationPassword(java.lang.String param){
                            
                                            this.localHttpNotificationPassword=param;
                                    

                               }
                            

                        /**
                        * field for RepeatCount
                        */

                        
                                    protected int localRepeatCount ;
                                

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getRepeatCount(){
                               return localRepeatCount;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param RepeatCount
                               */
                               public void setRepeatCount(int param){
                            
                                            this.localRepeatCount=param;
                                    

                               }
                            

                        /**
                        * field for RepeatInterval
                        */

                        
                                    protected int localRepeatInterval ;
                                

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getRepeatInterval(){
                               return localRepeatInterval;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param RepeatInterval
                               */
                               public void setRepeatInterval(int param){
                            
                                            this.localRepeatInterval=param;
                                    

                               }
                            

                        /**
                        * field for ReportRequest
                        */

                        
                                    protected com.oracle.xmlns.oxp.service.publicreportservice.ReportRequest localReportRequest ;
                                

                           /**
                           * Auto generated getter method
                           * @return com.oracle.xmlns.oxp.service.publicreportservice.ReportRequest
                           */
                           public  com.oracle.xmlns.oxp.service.publicreportservice.ReportRequest getReportRequest(){
                               return localReportRequest;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ReportRequest
                               */
                               public void setReportRequest(com.oracle.xmlns.oxp.service.publicreportservice.ReportRequest param){
                            
                                            this.localReportRequest=param;
                                    

                               }
                            

                        /**
                        * field for SaveDataOption
                        */

                        
                                    protected boolean localSaveDataOption ;
                                

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getSaveDataOption(){
                               return localSaveDataOption;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SaveDataOption
                               */
                               public void setSaveDataOption(boolean param){
                            
                                            this.localSaveDataOption=param;
                                    

                               }
                            

                        /**
                        * field for SaveOutputOption
                        */

                        
                                    protected boolean localSaveOutputOption ;
                                

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getSaveOutputOption(){
                               return localSaveOutputOption;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SaveOutputOption
                               */
                               public void setSaveOutputOption(boolean param){
                            
                                            this.localSaveOutputOption=param;
                                    

                               }
                            

                        /**
                        * field for ScheduleBurstringOption
                        */

                        
                                    protected boolean localScheduleBurstringOption ;
                                

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getScheduleBurstringOption(){
                               return localScheduleBurstringOption;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ScheduleBurstringOption
                               */
                               public void setScheduleBurstringOption(boolean param){
                            
                                            this.localScheduleBurstringOption=param;
                                    

                               }
                            

                        /**
                        * field for SchedulePublicOption
                        */

                        
                                    protected boolean localSchedulePublicOption ;
                                

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getSchedulePublicOption(){
                               return localSchedulePublicOption;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SchedulePublicOption
                               */
                               public void setSchedulePublicOption(boolean param){
                            
                                            this.localSchedulePublicOption=param;
                                    

                               }
                            

                        /**
                        * field for StartDate
                        */

                        
                                    protected java.util.Calendar localStartDate ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.util.Calendar
                           */
                           public  java.util.Calendar getStartDate(){
                               return localStartDate;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param StartDate
                               */
                               public void setStartDate(java.util.Calendar param){
                            
                                            this.localStartDate=param;
                                    

                               }
                            

                        /**
                        * field for UseUTF8Option
                        */

                        
                                    protected boolean localUseUTF8Option ;
                                

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getUseUTF8Option(){
                               return localUseUTF8Option;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param UseUTF8Option
                               */
                               public void setUseUTF8Option(boolean param){
                            
                                            this.localUseUTF8Option=param;
                                    

                               }
                            

                        /**
                        * field for UserJobName
                        */

                        
                                    protected java.lang.String localUserJobName ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getUserJobName(){
                               return localUserJobName;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param UserJobName
                               */
                               public void setUserJobName(java.lang.String param){
                            
                                            this.localUserJobName=param;
                                    

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
                       ScheduleRequest.this.serialize(parentQName,factory,xmlWriter);
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
                           namespacePrefix+":ScheduleRequest",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "ScheduleRequest",
                           xmlWriter);
                   }

               
                   }
               
                                    namespace = "http://xmlns.oracle.com/oxp/service/PublicReportService";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"cronExpression", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"cronExpression");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("cronExpression");
                                    }
                                

                                          if (localCronExpression==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localCronExpression);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    if (localDeliveryRequest==null){

                                            java.lang.String namespace2 = "http://xmlns.oracle.com/oxp/service/PublicReportService";

                                        if (! namespace2.equals("")) {
                                            java.lang.String prefix2 = xmlWriter.getPrefix(namespace2);

                                            if (prefix2 == null) {
                                                prefix2 = generatePrefix(namespace2);

                                                xmlWriter.writeStartElement(prefix2,"deliveryRequest", namespace2);
                                                xmlWriter.writeNamespace(prefix2, namespace2);
                                                xmlWriter.setPrefix(prefix2, namespace2);

                                            } else {
                                                xmlWriter.writeStartElement(namespace2,"deliveryRequest");
                                            }

                                        } else {
                                            xmlWriter.writeStartElement("deliveryRequest");
                                        }


                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localDeliveryRequest.serialize(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","deliveryRequest"),
                                        factory,xmlWriter);
                                    }
                                
                                    namespace = "http://xmlns.oracle.com/oxp/service/PublicReportService";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"endDate", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"endDate");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("endDate");
                                    }
                                

                                          if (localEndDate==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localEndDate));
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    namespace = "http://xmlns.oracle.com/oxp/service/PublicReportService";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"jobCalendar", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"jobCalendar");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("jobCalendar");
                                    }
                                

                                          if (localJobCalendar==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localJobCalendar);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    namespace = "http://xmlns.oracle.com/oxp/service/PublicReportService";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"jobLocale", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"jobLocale");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("jobLocale");
                                    }
                                

                                          if (localJobLocale==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localJobLocale);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    namespace = "http://xmlns.oracle.com/oxp/service/PublicReportService";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"jobTZ", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"jobTZ");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("jobTZ");
                                    }
                                

                                          if (localJobTZ==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localJobTZ);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    namespace = "http://xmlns.oracle.com/oxp/service/PublicReportService";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"notificationTo", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"notificationTo");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("notificationTo");
                                    }
                                

                                          if (localNotificationTo==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localNotificationTo);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    namespace = "http://xmlns.oracle.com/oxp/service/PublicReportService";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"notifyWhenFailed", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"notifyWhenFailed");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("notifyWhenFailed");
                                    }
                                
                                               if (false) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("notifyWhenFailed cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNotifyWhenFailed));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    namespace = "http://xmlns.oracle.com/oxp/service/PublicReportService";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"notifyWhenSuccess", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"notifyWhenSuccess");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("notifyWhenSuccess");
                                    }
                                
                                               if (false) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("notifyWhenSuccess cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNotifyWhenSuccess));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    namespace = "http://xmlns.oracle.com/oxp/service/PublicReportService";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"notifyWhenWarning", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"notifyWhenWarning");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("notifyWhenWarning");
                                    }
                                
                                               if (false) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("notifyWhenWarning cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNotifyWhenWarning));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    namespace = "http://xmlns.oracle.com/oxp/service/PublicReportService";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"httpNotificationServer", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"httpNotificationServer");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("httpNotificationServer");
                                    }
                                

                                          if (localHttpNotificationServer==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localHttpNotificationServer);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    namespace = "http://xmlns.oracle.com/oxp/service/PublicReportService";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"httpNotificationUserName", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"httpNotificationUserName");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("httpNotificationUserName");
                                    }
                                

                                          if (localHttpNotificationUserName==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localHttpNotificationUserName);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    namespace = "http://xmlns.oracle.com/oxp/service/PublicReportService";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"httpNotificationPassword", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"httpNotificationPassword");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("httpNotificationPassword");
                                    }
                                

                                          if (localHttpNotificationPassword==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localHttpNotificationPassword);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    namespace = "http://xmlns.oracle.com/oxp/service/PublicReportService";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"repeatCount", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"repeatCount");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("repeatCount");
                                    }
                                
                                               if (localRepeatCount==java.lang.Integer.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("repeatCount cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRepeatCount));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    namespace = "http://xmlns.oracle.com/oxp/service/PublicReportService";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"repeatInterval", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"repeatInterval");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("repeatInterval");
                                    }
                                
                                               if (localRepeatInterval==java.lang.Integer.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("repeatInterval cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRepeatInterval));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    if (localReportRequest==null){

                                            java.lang.String namespace2 = "http://xmlns.oracle.com/oxp/service/PublicReportService";

                                        if (! namespace2.equals("")) {
                                            java.lang.String prefix2 = xmlWriter.getPrefix(namespace2);

                                            if (prefix2 == null) {
                                                prefix2 = generatePrefix(namespace2);

                                                xmlWriter.writeStartElement(prefix2,"reportRequest", namespace2);
                                                xmlWriter.writeNamespace(prefix2, namespace2);
                                                xmlWriter.setPrefix(prefix2, namespace2);

                                            } else {
                                                xmlWriter.writeStartElement(namespace2,"reportRequest");
                                            }

                                        } else {
                                            xmlWriter.writeStartElement("reportRequest");
                                        }


                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localReportRequest.serialize(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","reportRequest"),
                                        factory,xmlWriter);
                                    }
                                
                                    namespace = "http://xmlns.oracle.com/oxp/service/PublicReportService";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"saveDataOption", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"saveDataOption");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("saveDataOption");
                                    }
                                
                                               if (false) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("saveDataOption cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSaveDataOption));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    namespace = "http://xmlns.oracle.com/oxp/service/PublicReportService";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"saveOutputOption", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"saveOutputOption");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("saveOutputOption");
                                    }
                                
                                               if (false) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("saveOutputOption cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSaveOutputOption));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    namespace = "http://xmlns.oracle.com/oxp/service/PublicReportService";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"scheduleBurstringOption", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"scheduleBurstringOption");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("scheduleBurstringOption");
                                    }
                                
                                               if (false) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("scheduleBurstringOption cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localScheduleBurstringOption));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    namespace = "http://xmlns.oracle.com/oxp/service/PublicReportService";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"schedulePublicOption", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"schedulePublicOption");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("schedulePublicOption");
                                    }
                                
                                               if (false) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("schedulePublicOption cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSchedulePublicOption));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    namespace = "http://xmlns.oracle.com/oxp/service/PublicReportService";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"startDate", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"startDate");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("startDate");
                                    }
                                

                                          if (localStartDate==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localStartDate));
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    namespace = "http://xmlns.oracle.com/oxp/service/PublicReportService";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"useUTF8Option", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"useUTF8Option");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("useUTF8Option");
                                    }
                                
                                               if (false) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("useUTF8Option cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localUseUTF8Option));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    namespace = "http://xmlns.oracle.com/oxp/service/PublicReportService";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"userJobName", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"userJobName");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("userJobName");
                                    }
                                

                                          if (localUserJobName==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localUserJobName);
                                            
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
                                                                      "cronExpression"));
                                 
                                         elementList.add(localCronExpression==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCronExpression));
                                    
                            elementList.add(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService",
                                                                      "deliveryRequest"));
                            
                            
                                    elementList.add(localDeliveryRequest==null?null:
                                    localDeliveryRequest);
                                
                                      elementList.add(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService",
                                                                      "endDate"));
                                 
                                         elementList.add(localEndDate==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localEndDate));
                                    
                                      elementList.add(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService",
                                                                      "jobCalendar"));
                                 
                                         elementList.add(localJobCalendar==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localJobCalendar));
                                    
                                      elementList.add(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService",
                                                                      "jobLocale"));
                                 
                                         elementList.add(localJobLocale==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localJobLocale));
                                    
                                      elementList.add(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService",
                                                                      "jobTZ"));
                                 
                                         elementList.add(localJobTZ==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localJobTZ));
                                    
                                      elementList.add(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService",
                                                                      "notificationTo"));
                                 
                                         elementList.add(localNotificationTo==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNotificationTo));
                                    
                                      elementList.add(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService",
                                                                      "notifyWhenFailed"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNotifyWhenFailed));
                            
                                      elementList.add(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService",
                                                                      "notifyWhenSuccess"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNotifyWhenSuccess));
                            
                                      elementList.add(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService",
                                                                      "notifyWhenWarning"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNotifyWhenWarning));
                            
                                      elementList.add(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService",
                                                                      "httpNotificationServer"));
                                 
                                         elementList.add(localHttpNotificationServer==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localHttpNotificationServer));
                                    
                                      elementList.add(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService",
                                                                      "httpNotificationUserName"));
                                 
                                         elementList.add(localHttpNotificationUserName==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localHttpNotificationUserName));
                                    
                                      elementList.add(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService",
                                                                      "httpNotificationPassword"));
                                 
                                         elementList.add(localHttpNotificationPassword==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localHttpNotificationPassword));
                                    
                                      elementList.add(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService",
                                                                      "repeatCount"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRepeatCount));
                            
                                      elementList.add(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService",
                                                                      "repeatInterval"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRepeatInterval));
                            
                            elementList.add(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService",
                                                                      "reportRequest"));
                            
                            
                                    elementList.add(localReportRequest==null?null:
                                    localReportRequest);
                                
                                      elementList.add(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService",
                                                                      "saveDataOption"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSaveDataOption));
                            
                                      elementList.add(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService",
                                                                      "saveOutputOption"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSaveOutputOption));
                            
                                      elementList.add(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService",
                                                                      "scheduleBurstringOption"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localScheduleBurstringOption));
                            
                                      elementList.add(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService",
                                                                      "schedulePublicOption"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSchedulePublicOption));
                            
                                      elementList.add(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService",
                                                                      "startDate"));
                                 
                                         elementList.add(localStartDate==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localStartDate));
                                    
                                      elementList.add(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService",
                                                                      "useUTF8Option"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localUseUTF8Option));
                            
                                      elementList.add(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService",
                                                                      "userJobName"));
                                 
                                         elementList.add(localUserJobName==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localUserJobName));
                                    

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
        public static ScheduleRequest parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            ScheduleRequest object =
                new ScheduleRequest();

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
                    
                            if (!"ScheduleRequest".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (ScheduleRequest)com.oracle.xmlns.oxp.service.publicreportservice.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                 
                    
                    reader.next();
                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","cronExpression").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setCronExpression(
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","deliveryRequest").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setDeliveryRequest(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setDeliveryRequest(com.oracle.xmlns.oxp.service.publicreportservice.DeliveryRequest.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","endDate").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setEndDate(
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","jobCalendar").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setJobCalendar(
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","jobLocale").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setJobLocale(
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","jobTZ").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setJobTZ(
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","notificationTo").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setNotificationTo(
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","notifyWhenFailed").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setNotifyWhenFailed(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","notifyWhenSuccess").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setNotifyWhenSuccess(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","notifyWhenWarning").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setNotifyWhenWarning(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","httpNotificationServer").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setHttpNotificationServer(
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","httpNotificationUserName").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setHttpNotificationUserName(
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","httpNotificationPassword").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setHttpNotificationPassword(
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","repeatCount").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setRepeatCount(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","repeatInterval").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setRepeatInterval(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","reportRequest").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setReportRequest(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setReportRequest(com.oracle.xmlns.oxp.service.publicreportservice.ReportRequest.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","saveDataOption").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setSaveDataOption(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","saveOutputOption").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setSaveOutputOption(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","scheduleBurstringOption").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setScheduleBurstringOption(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","schedulePublicOption").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setSchedulePublicOption(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","startDate").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setStartDate(
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","useUTF8Option").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setUseUTF8Option(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","userJobName").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setUserJobName(
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
           
          