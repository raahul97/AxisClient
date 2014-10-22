
/**
 * ReportDefinition.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.4  Built on : Apr 26, 2008 (06:25:17 EDT)
 */
            
                package com.oracle.xmlns.oxp.service.publicreportservice;
            

            /**
            *  ReportDefinition bean class
            */
        
        public  class ReportDefinition
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = ReportDefinition
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
                        * field for AutoRun
                        */

                        
                                    protected boolean localAutoRun ;
                                

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getAutoRun(){
                               return localAutoRun;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param AutoRun
                               */
                               public void setAutoRun(boolean param){
                            
                                            this.localAutoRun=param;
                                    

                               }
                            

                        /**
                        * field for CacheDocument
                        */

                        
                                    protected boolean localCacheDocument ;
                                

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getCacheDocument(){
                               return localCacheDocument;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CacheDocument
                               */
                               public void setCacheDocument(boolean param){
                            
                                            this.localCacheDocument=param;
                                    

                               }
                            

                        /**
                        * field for DefaultOutputFormat
                        */

                        
                                    protected java.lang.String localDefaultOutputFormat ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getDefaultOutputFormat(){
                               return localDefaultOutputFormat;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param DefaultOutputFormat
                               */
                               public void setDefaultOutputFormat(java.lang.String param){
                            
                                            this.localDefaultOutputFormat=param;
                                    

                               }
                            

                        /**
                        * field for DefaultTemplateId
                        */

                        
                                    protected java.lang.String localDefaultTemplateId ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getDefaultTemplateId(){
                               return localDefaultTemplateId;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param DefaultTemplateId
                               */
                               public void setDefaultTemplateId(java.lang.String param){
                            
                                            this.localDefaultTemplateId=param;
                                    

                               }
                            

                        /**
                        * field for Diagnostics
                        */

                        
                                    protected boolean localDiagnostics ;
                                

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getDiagnostics(){
                               return localDiagnostics;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Diagnostics
                               */
                               public void setDiagnostics(boolean param){
                            
                                            this.localDiagnostics=param;
                                    

                               }
                            

                        /**
                        * field for ListOfTemplateFormatsLabelValues
                        */

                        
                                    protected com.oracle.xmlns.oxp.service.publicreportservice.ArrayOfTemplateFormatsLabelValues localListOfTemplateFormatsLabelValues ;
                                

                           /**
                           * Auto generated getter method
                           * @return com.oracle.xmlns.oxp.service.publicreportservice.ArrayOfTemplateFormatsLabelValues
                           */
                           public  com.oracle.xmlns.oxp.service.publicreportservice.ArrayOfTemplateFormatsLabelValues getListOfTemplateFormatsLabelValues(){
                               return localListOfTemplateFormatsLabelValues;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ListOfTemplateFormatsLabelValues
                               */
                               public void setListOfTemplateFormatsLabelValues(com.oracle.xmlns.oxp.service.publicreportservice.ArrayOfTemplateFormatsLabelValues param){
                            
                                            this.localListOfTemplateFormatsLabelValues=param;
                                    

                               }
                            

                        /**
                        * field for OnLine
                        */

                        
                                    protected boolean localOnLine ;
                                

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getOnLine(){
                               return localOnLine;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param OnLine
                               */
                               public void setOnLine(boolean param){
                            
                                            this.localOnLine=param;
                                    

                               }
                            

                        /**
                        * field for OpenLinkInNewWindow
                        */

                        
                                    protected boolean localOpenLinkInNewWindow ;
                                

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getOpenLinkInNewWindow(){
                               return localOpenLinkInNewWindow;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param OpenLinkInNewWindow
                               */
                               public void setOpenLinkInNewWindow(boolean param){
                            
                                            this.localOpenLinkInNewWindow=param;
                                    

                               }
                            

                        /**
                        * field for ParameterColumns
                        */

                        
                                    protected int localParameterColumns ;
                                

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getParameterColumns(){
                               return localParameterColumns;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ParameterColumns
                               */
                               public void setParameterColumns(int param){
                            
                                            this.localParameterColumns=param;
                                    

                               }
                            

                        /**
                        * field for ParameterNames
                        */

                        
                                    protected com.oracle.xmlns.oxp.service.publicreportservice.ArrayOfString localParameterNames ;
                                

                           /**
                           * Auto generated getter method
                           * @return com.oracle.xmlns.oxp.service.publicreportservice.ArrayOfString
                           */
                           public  com.oracle.xmlns.oxp.service.publicreportservice.ArrayOfString getParameterNames(){
                               return localParameterNames;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ParameterNames
                               */
                               public void setParameterNames(com.oracle.xmlns.oxp.service.publicreportservice.ArrayOfString param){
                            
                                            this.localParameterNames=param;
                                    

                               }
                            

                        /**
                        * field for ReportDefnTitle
                        */

                        
                                    protected java.lang.String localReportDefnTitle ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getReportDefnTitle(){
                               return localReportDefnTitle;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ReportDefnTitle
                               */
                               public void setReportDefnTitle(java.lang.String param){
                            
                                            this.localReportDefnTitle=param;
                                    

                               }
                            

                        /**
                        * field for ReportDescription
                        */

                        
                                    protected java.lang.String localReportDescription ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getReportDescription(){
                               return localReportDescription;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ReportDescription
                               */
                               public void setReportDescription(java.lang.String param){
                            
                                            this.localReportDescription=param;
                                    

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
                        * field for ReportParameterNameValues
                        */

                        
                                    protected com.oracle.xmlns.oxp.service.publicreportservice.ArrayOfParamNameValue localReportParameterNameValues ;
                                

                           /**
                           * Auto generated getter method
                           * @return com.oracle.xmlns.oxp.service.publicreportservice.ArrayOfParamNameValue
                           */
                           public  com.oracle.xmlns.oxp.service.publicreportservice.ArrayOfParamNameValue getReportParameterNameValues(){
                               return localReportParameterNameValues;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ReportParameterNameValues
                               */
                               public void setReportParameterNameValues(com.oracle.xmlns.oxp.service.publicreportservice.ArrayOfParamNameValue param){
                            
                                            this.localReportParameterNameValues=param;
                                    

                               }
                            

                        /**
                        * field for ReportType
                        */

                        
                                    protected java.lang.String localReportType ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getReportType(){
                               return localReportType;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ReportType
                               */
                               public void setReportType(java.lang.String param){
                            
                                            this.localReportType=param;
                                    

                               }
                            

                        /**
                        * field for ShowControls
                        */

                        
                                    protected boolean localShowControls ;
                                

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getShowControls(){
                               return localShowControls;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ShowControls
                               */
                               public void setShowControls(boolean param){
                            
                                            this.localShowControls=param;
                                    

                               }
                            

                        /**
                        * field for ShowReportLinks
                        */

                        
                                    protected boolean localShowReportLinks ;
                                

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getShowReportLinks(){
                               return localShowReportLinks;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ShowReportLinks
                               */
                               public void setShowReportLinks(boolean param){
                            
                                            this.localShowReportLinks=param;
                                    

                               }
                            

                        /**
                        * field for TemplateIds
                        */

                        
                                    protected com.oracle.xmlns.oxp.service.publicreportservice.ArrayOfString localTemplateIds ;
                                

                           /**
                           * Auto generated getter method
                           * @return com.oracle.xmlns.oxp.service.publicreportservice.ArrayOfString
                           */
                           public  com.oracle.xmlns.oxp.service.publicreportservice.ArrayOfString getTemplateIds(){
                               return localTemplateIds;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param TemplateIds
                               */
                               public void setTemplateIds(com.oracle.xmlns.oxp.service.publicreportservice.ArrayOfString param){
                            
                                            this.localTemplateIds=param;
                                    

                               }
                            

                        /**
                        * field for UseExcelProcessor
                        */

                        
                                    protected boolean localUseExcelProcessor ;
                                

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getUseExcelProcessor(){
                               return localUseExcelProcessor;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param UseExcelProcessor
                               */
                               public void setUseExcelProcessor(boolean param){
                            
                                            this.localUseExcelProcessor=param;
                                    

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
                       ReportDefinition.this.serialize(parentQName,factory,xmlWriter);
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
                           namespacePrefix+":ReportDefinition",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "ReportDefinition",
                           xmlWriter);
                   }

               
                   }
               
                                    namespace = "http://xmlns.oracle.com/oxp/service/PublicReportService";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"autoRun", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"autoRun");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("autoRun");
                                    }
                                
                                               if (false) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("autoRun cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAutoRun));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    namespace = "http://xmlns.oracle.com/oxp/service/PublicReportService";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"cacheDocument", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"cacheDocument");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("cacheDocument");
                                    }
                                
                                               if (false) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("cacheDocument cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCacheDocument));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    namespace = "http://xmlns.oracle.com/oxp/service/PublicReportService";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"defaultOutputFormat", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"defaultOutputFormat");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("defaultOutputFormat");
                                    }
                                

                                          if (localDefaultOutputFormat==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localDefaultOutputFormat);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    namespace = "http://xmlns.oracle.com/oxp/service/PublicReportService";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"defaultTemplateId", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"defaultTemplateId");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("defaultTemplateId");
                                    }
                                

                                          if (localDefaultTemplateId==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localDefaultTemplateId);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    namespace = "http://xmlns.oracle.com/oxp/service/PublicReportService";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"diagnostics", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"diagnostics");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("diagnostics");
                                    }
                                
                                               if (false) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("diagnostics cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDiagnostics));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    if (localListOfTemplateFormatsLabelValues==null){

                                            java.lang.String namespace2 = "http://xmlns.oracle.com/oxp/service/PublicReportService";

                                        if (! namespace2.equals("")) {
                                            java.lang.String prefix2 = xmlWriter.getPrefix(namespace2);

                                            if (prefix2 == null) {
                                                prefix2 = generatePrefix(namespace2);

                                                xmlWriter.writeStartElement(prefix2,"listOfTemplateFormatsLabelValues", namespace2);
                                                xmlWriter.writeNamespace(prefix2, namespace2);
                                                xmlWriter.setPrefix(prefix2, namespace2);

                                            } else {
                                                xmlWriter.writeStartElement(namespace2,"listOfTemplateFormatsLabelValues");
                                            }

                                        } else {
                                            xmlWriter.writeStartElement("listOfTemplateFormatsLabelValues");
                                        }


                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localListOfTemplateFormatsLabelValues.serialize(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","listOfTemplateFormatsLabelValues"),
                                        factory,xmlWriter);
                                    }
                                
                                    namespace = "http://xmlns.oracle.com/oxp/service/PublicReportService";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"onLine", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"onLine");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("onLine");
                                    }
                                
                                               if (false) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("onLine cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localOnLine));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    namespace = "http://xmlns.oracle.com/oxp/service/PublicReportService";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"openLinkInNewWindow", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"openLinkInNewWindow");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("openLinkInNewWindow");
                                    }
                                
                                               if (false) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("openLinkInNewWindow cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localOpenLinkInNewWindow));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    namespace = "http://xmlns.oracle.com/oxp/service/PublicReportService";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"parameterColumns", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"parameterColumns");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("parameterColumns");
                                    }
                                
                                               if (localParameterColumns==java.lang.Integer.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("parameterColumns cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localParameterColumns));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    if (localParameterNames==null){

                                            java.lang.String namespace2 = "http://xmlns.oracle.com/oxp/service/PublicReportService";

                                        if (! namespace2.equals("")) {
                                            java.lang.String prefix2 = xmlWriter.getPrefix(namespace2);

                                            if (prefix2 == null) {
                                                prefix2 = generatePrefix(namespace2);

                                                xmlWriter.writeStartElement(prefix2,"parameterNames", namespace2);
                                                xmlWriter.writeNamespace(prefix2, namespace2);
                                                xmlWriter.setPrefix(prefix2, namespace2);

                                            } else {
                                                xmlWriter.writeStartElement(namespace2,"parameterNames");
                                            }

                                        } else {
                                            xmlWriter.writeStartElement("parameterNames");
                                        }


                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localParameterNames.serialize(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","parameterNames"),
                                        factory,xmlWriter);
                                    }
                                
                                    namespace = "http://xmlns.oracle.com/oxp/service/PublicReportService";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"reportDefnTitle", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"reportDefnTitle");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("reportDefnTitle");
                                    }
                                

                                          if (localReportDefnTitle==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localReportDefnTitle);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    namespace = "http://xmlns.oracle.com/oxp/service/PublicReportService";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"reportDescription", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"reportDescription");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("reportDescription");
                                    }
                                

                                          if (localReportDescription==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localReportDescription);
                                            
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
                             
                                    if (localReportParameterNameValues==null){

                                            java.lang.String namespace2 = "http://xmlns.oracle.com/oxp/service/PublicReportService";

                                        if (! namespace2.equals("")) {
                                            java.lang.String prefix2 = xmlWriter.getPrefix(namespace2);

                                            if (prefix2 == null) {
                                                prefix2 = generatePrefix(namespace2);

                                                xmlWriter.writeStartElement(prefix2,"reportParameterNameValues", namespace2);
                                                xmlWriter.writeNamespace(prefix2, namespace2);
                                                xmlWriter.setPrefix(prefix2, namespace2);

                                            } else {
                                                xmlWriter.writeStartElement(namespace2,"reportParameterNameValues");
                                            }

                                        } else {
                                            xmlWriter.writeStartElement("reportParameterNameValues");
                                        }


                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localReportParameterNameValues.serialize(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","reportParameterNameValues"),
                                        factory,xmlWriter);
                                    }
                                
                                    namespace = "http://xmlns.oracle.com/oxp/service/PublicReportService";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"reportType", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"reportType");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("reportType");
                                    }
                                

                                          if (localReportType==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localReportType);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    namespace = "http://xmlns.oracle.com/oxp/service/PublicReportService";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"showControls", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"showControls");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("showControls");
                                    }
                                
                                               if (false) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("showControls cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localShowControls));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    namespace = "http://xmlns.oracle.com/oxp/service/PublicReportService";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"showReportLinks", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"showReportLinks");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("showReportLinks");
                                    }
                                
                                               if (false) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("showReportLinks cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localShowReportLinks));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    if (localTemplateIds==null){

                                            java.lang.String namespace2 = "http://xmlns.oracle.com/oxp/service/PublicReportService";

                                        if (! namespace2.equals("")) {
                                            java.lang.String prefix2 = xmlWriter.getPrefix(namespace2);

                                            if (prefix2 == null) {
                                                prefix2 = generatePrefix(namespace2);

                                                xmlWriter.writeStartElement(prefix2,"templateIds", namespace2);
                                                xmlWriter.writeNamespace(prefix2, namespace2);
                                                xmlWriter.setPrefix(prefix2, namespace2);

                                            } else {
                                                xmlWriter.writeStartElement(namespace2,"templateIds");
                                            }

                                        } else {
                                            xmlWriter.writeStartElement("templateIds");
                                        }


                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localTemplateIds.serialize(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","templateIds"),
                                        factory,xmlWriter);
                                    }
                                
                                    namespace = "http://xmlns.oracle.com/oxp/service/PublicReportService";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"useExcelProcessor", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"useExcelProcessor");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("useExcelProcessor");
                                    }
                                
                                               if (false) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("useExcelProcessor cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localUseExcelProcessor));
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
                                                                      "autoRun"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAutoRun));
                            
                                      elementList.add(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService",
                                                                      "cacheDocument"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCacheDocument));
                            
                                      elementList.add(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService",
                                                                      "defaultOutputFormat"));
                                 
                                         elementList.add(localDefaultOutputFormat==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDefaultOutputFormat));
                                    
                                      elementList.add(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService",
                                                                      "defaultTemplateId"));
                                 
                                         elementList.add(localDefaultTemplateId==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDefaultTemplateId));
                                    
                                      elementList.add(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService",
                                                                      "diagnostics"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDiagnostics));
                            
                            elementList.add(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService",
                                                                      "listOfTemplateFormatsLabelValues"));
                            
                            
                                    elementList.add(localListOfTemplateFormatsLabelValues==null?null:
                                    localListOfTemplateFormatsLabelValues);
                                
                                      elementList.add(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService",
                                                                      "onLine"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localOnLine));
                            
                                      elementList.add(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService",
                                                                      "openLinkInNewWindow"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localOpenLinkInNewWindow));
                            
                                      elementList.add(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService",
                                                                      "parameterColumns"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localParameterColumns));
                            
                            elementList.add(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService",
                                                                      "parameterNames"));
                            
                            
                                    elementList.add(localParameterNames==null?null:
                                    localParameterNames);
                                
                                      elementList.add(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService",
                                                                      "reportDefnTitle"));
                                 
                                         elementList.add(localReportDefnTitle==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localReportDefnTitle));
                                    
                                      elementList.add(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService",
                                                                      "reportDescription"));
                                 
                                         elementList.add(localReportDescription==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localReportDescription));
                                    
                                      elementList.add(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService",
                                                                      "reportName"));
                                 
                                         elementList.add(localReportName==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localReportName));
                                    
                            elementList.add(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService",
                                                                      "reportParameterNameValues"));
                            
                            
                                    elementList.add(localReportParameterNameValues==null?null:
                                    localReportParameterNameValues);
                                
                                      elementList.add(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService",
                                                                      "reportType"));
                                 
                                         elementList.add(localReportType==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localReportType));
                                    
                                      elementList.add(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService",
                                                                      "showControls"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localShowControls));
                            
                                      elementList.add(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService",
                                                                      "showReportLinks"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localShowReportLinks));
                            
                            elementList.add(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService",
                                                                      "templateIds"));
                            
                            
                                    elementList.add(localTemplateIds==null?null:
                                    localTemplateIds);
                                
                                      elementList.add(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService",
                                                                      "useExcelProcessor"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localUseExcelProcessor));
                            

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
        public static ReportDefinition parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            ReportDefinition object =
                new ReportDefinition();

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
                    
                            if (!"ReportDefinition".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (ReportDefinition)com.oracle.xmlns.oxp.service.publicreportservice.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                 
                    
                    reader.next();
                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","autoRun").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setAutoRun(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","cacheDocument").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setCacheDocument(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","defaultOutputFormat").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setDefaultOutputFormat(
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","defaultTemplateId").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setDefaultTemplateId(
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","diagnostics").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setDiagnostics(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","listOfTemplateFormatsLabelValues").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setListOfTemplateFormatsLabelValues(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setListOfTemplateFormatsLabelValues(com.oracle.xmlns.oxp.service.publicreportservice.ArrayOfTemplateFormatsLabelValues.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","onLine").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setOnLine(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","openLinkInNewWindow").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setOpenLinkInNewWindow(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","parameterColumns").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setParameterColumns(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","parameterNames").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setParameterNames(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setParameterNames(com.oracle.xmlns.oxp.service.publicreportservice.ArrayOfString.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","reportDefnTitle").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setReportDefnTitle(
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","reportDescription").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setReportDescription(
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","reportParameterNameValues").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setReportParameterNameValues(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setReportParameterNameValues(com.oracle.xmlns.oxp.service.publicreportservice.ArrayOfParamNameValue.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","reportType").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setReportType(
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","showControls").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setShowControls(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","showReportLinks").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setShowReportLinks(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","templateIds").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setTemplateIds(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setTemplateIds(com.oracle.xmlns.oxp.service.publicreportservice.ArrayOfString.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","useExcelProcessor").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setUseExcelProcessor(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));
                                              
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
           
          