
/**
 * DeliveryRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.4  Built on : Apr 26, 2008 (06:25:17 EDT)
 */
            
                package com.oracle.xmlns.oxp.service.publicreportservice;
            

            /**
            *  DeliveryRequest bean class
            */
        
        public  class DeliveryRequest
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = DeliveryRequest
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
                        * field for EmailOption
                        */

                        
                                    protected com.oracle.xmlns.oxp.service.publicreportservice.EMailDeliveryOption localEmailOption ;
                                

                           /**
                           * Auto generated getter method
                           * @return com.oracle.xmlns.oxp.service.publicreportservice.EMailDeliveryOption
                           */
                           public  com.oracle.xmlns.oxp.service.publicreportservice.EMailDeliveryOption getEmailOption(){
                               return localEmailOption;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param EmailOption
                               */
                               public void setEmailOption(com.oracle.xmlns.oxp.service.publicreportservice.EMailDeliveryOption param){
                            
                                            this.localEmailOption=param;
                                    

                               }
                            

                        /**
                        * field for FaxOption
                        */

                        
                                    protected com.oracle.xmlns.oxp.service.publicreportservice.FaxDeliveryOption localFaxOption ;
                                

                           /**
                           * Auto generated getter method
                           * @return com.oracle.xmlns.oxp.service.publicreportservice.FaxDeliveryOption
                           */
                           public  com.oracle.xmlns.oxp.service.publicreportservice.FaxDeliveryOption getFaxOption(){
                               return localFaxOption;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param FaxOption
                               */
                               public void setFaxOption(com.oracle.xmlns.oxp.service.publicreportservice.FaxDeliveryOption param){
                            
                                            this.localFaxOption=param;
                                    

                               }
                            

                        /**
                        * field for FtpOption
                        */

                        
                                    protected com.oracle.xmlns.oxp.service.publicreportservice.FTPDeliveryOption localFtpOption ;
                                

                           /**
                           * Auto generated getter method
                           * @return com.oracle.xmlns.oxp.service.publicreportservice.FTPDeliveryOption
                           */
                           public  com.oracle.xmlns.oxp.service.publicreportservice.FTPDeliveryOption getFtpOption(){
                               return localFtpOption;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param FtpOption
                               */
                               public void setFtpOption(com.oracle.xmlns.oxp.service.publicreportservice.FTPDeliveryOption param){
                            
                                            this.localFtpOption=param;
                                    

                               }
                            

                        /**
                        * field for LocalOption
                        */

                        
                                    protected com.oracle.xmlns.oxp.service.publicreportservice.LocalDeliveryOption localLocalOption ;
                                

                           /**
                           * Auto generated getter method
                           * @return com.oracle.xmlns.oxp.service.publicreportservice.LocalDeliveryOption
                           */
                           public  com.oracle.xmlns.oxp.service.publicreportservice.LocalDeliveryOption getLocalOption(){
                               return localLocalOption;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param LocalOption
                               */
                               public void setLocalOption(com.oracle.xmlns.oxp.service.publicreportservice.LocalDeliveryOption param){
                            
                                            this.localLocalOption=param;
                                    

                               }
                            

                        /**
                        * field for PrintOption
                        */

                        
                                    protected com.oracle.xmlns.oxp.service.publicreportservice.PrintDeliveryOption localPrintOption ;
                                

                           /**
                           * Auto generated getter method
                           * @return com.oracle.xmlns.oxp.service.publicreportservice.PrintDeliveryOption
                           */
                           public  com.oracle.xmlns.oxp.service.publicreportservice.PrintDeliveryOption getPrintOption(){
                               return localPrintOption;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param PrintOption
                               */
                               public void setPrintOption(com.oracle.xmlns.oxp.service.publicreportservice.PrintDeliveryOption param){
                            
                                            this.localPrintOption=param;
                                    

                               }
                            

                        /**
                        * field for WebDAVOption
                        */

                        
                                    protected com.oracle.xmlns.oxp.service.publicreportservice.WebDAVDeliveryOption localWebDAVOption ;
                                

                           /**
                           * Auto generated getter method
                           * @return com.oracle.xmlns.oxp.service.publicreportservice.WebDAVDeliveryOption
                           */
                           public  com.oracle.xmlns.oxp.service.publicreportservice.WebDAVDeliveryOption getWebDAVOption(){
                               return localWebDAVOption;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param WebDAVOption
                               */
                               public void setWebDAVOption(com.oracle.xmlns.oxp.service.publicreportservice.WebDAVDeliveryOption param){
                            
                                            this.localWebDAVOption=param;
                                    

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
                       DeliveryRequest.this.serialize(parentQName,factory,xmlWriter);
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
                           namespacePrefix+":DeliveryRequest",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "DeliveryRequest",
                           xmlWriter);
                   }

               
                   }
               
                                    if (localEmailOption==null){

                                            java.lang.String namespace2 = "http://xmlns.oracle.com/oxp/service/PublicReportService";

                                        if (! namespace2.equals("")) {
                                            java.lang.String prefix2 = xmlWriter.getPrefix(namespace2);

                                            if (prefix2 == null) {
                                                prefix2 = generatePrefix(namespace2);

                                                xmlWriter.writeStartElement(prefix2,"emailOption", namespace2);
                                                xmlWriter.writeNamespace(prefix2, namespace2);
                                                xmlWriter.setPrefix(prefix2, namespace2);

                                            } else {
                                                xmlWriter.writeStartElement(namespace2,"emailOption");
                                            }

                                        } else {
                                            xmlWriter.writeStartElement("emailOption");
                                        }


                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localEmailOption.serialize(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","emailOption"),
                                        factory,xmlWriter);
                                    }
                                
                                    if (localFaxOption==null){

                                            java.lang.String namespace2 = "http://xmlns.oracle.com/oxp/service/PublicReportService";

                                        if (! namespace2.equals("")) {
                                            java.lang.String prefix2 = xmlWriter.getPrefix(namespace2);

                                            if (prefix2 == null) {
                                                prefix2 = generatePrefix(namespace2);

                                                xmlWriter.writeStartElement(prefix2,"faxOption", namespace2);
                                                xmlWriter.writeNamespace(prefix2, namespace2);
                                                xmlWriter.setPrefix(prefix2, namespace2);

                                            } else {
                                                xmlWriter.writeStartElement(namespace2,"faxOption");
                                            }

                                        } else {
                                            xmlWriter.writeStartElement("faxOption");
                                        }


                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localFaxOption.serialize(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","faxOption"),
                                        factory,xmlWriter);
                                    }
                                
                                    if (localFtpOption==null){

                                            java.lang.String namespace2 = "http://xmlns.oracle.com/oxp/service/PublicReportService";

                                        if (! namespace2.equals("")) {
                                            java.lang.String prefix2 = xmlWriter.getPrefix(namespace2);

                                            if (prefix2 == null) {
                                                prefix2 = generatePrefix(namespace2);

                                                xmlWriter.writeStartElement(prefix2,"ftpOption", namespace2);
                                                xmlWriter.writeNamespace(prefix2, namespace2);
                                                xmlWriter.setPrefix(prefix2, namespace2);

                                            } else {
                                                xmlWriter.writeStartElement(namespace2,"ftpOption");
                                            }

                                        } else {
                                            xmlWriter.writeStartElement("ftpOption");
                                        }


                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localFtpOption.serialize(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","ftpOption"),
                                        factory,xmlWriter);
                                    }
                                
                                    if (localLocalOption==null){

                                            java.lang.String namespace2 = "http://xmlns.oracle.com/oxp/service/PublicReportService";

                                        if (! namespace2.equals("")) {
                                            java.lang.String prefix2 = xmlWriter.getPrefix(namespace2);

                                            if (prefix2 == null) {
                                                prefix2 = generatePrefix(namespace2);

                                                xmlWriter.writeStartElement(prefix2,"localOption", namespace2);
                                                xmlWriter.writeNamespace(prefix2, namespace2);
                                                xmlWriter.setPrefix(prefix2, namespace2);

                                            } else {
                                                xmlWriter.writeStartElement(namespace2,"localOption");
                                            }

                                        } else {
                                            xmlWriter.writeStartElement("localOption");
                                        }


                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localLocalOption.serialize(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","localOption"),
                                        factory,xmlWriter);
                                    }
                                
                                    if (localPrintOption==null){

                                            java.lang.String namespace2 = "http://xmlns.oracle.com/oxp/service/PublicReportService";

                                        if (! namespace2.equals("")) {
                                            java.lang.String prefix2 = xmlWriter.getPrefix(namespace2);

                                            if (prefix2 == null) {
                                                prefix2 = generatePrefix(namespace2);

                                                xmlWriter.writeStartElement(prefix2,"printOption", namespace2);
                                                xmlWriter.writeNamespace(prefix2, namespace2);
                                                xmlWriter.setPrefix(prefix2, namespace2);

                                            } else {
                                                xmlWriter.writeStartElement(namespace2,"printOption");
                                            }

                                        } else {
                                            xmlWriter.writeStartElement("printOption");
                                        }


                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localPrintOption.serialize(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","printOption"),
                                        factory,xmlWriter);
                                    }
                                
                                    if (localWebDAVOption==null){

                                            java.lang.String namespace2 = "http://xmlns.oracle.com/oxp/service/PublicReportService";

                                        if (! namespace2.equals("")) {
                                            java.lang.String prefix2 = xmlWriter.getPrefix(namespace2);

                                            if (prefix2 == null) {
                                                prefix2 = generatePrefix(namespace2);

                                                xmlWriter.writeStartElement(prefix2,"webDAVOption", namespace2);
                                                xmlWriter.writeNamespace(prefix2, namespace2);
                                                xmlWriter.setPrefix(prefix2, namespace2);

                                            } else {
                                                xmlWriter.writeStartElement(namespace2,"webDAVOption");
                                            }

                                        } else {
                                            xmlWriter.writeStartElement("webDAVOption");
                                        }


                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localWebDAVOption.serialize(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","webDAVOption"),
                                        factory,xmlWriter);
                                    }
                                
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
                                                                      "emailOption"));
                            
                            
                                    elementList.add(localEmailOption==null?null:
                                    localEmailOption);
                                
                            elementList.add(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService",
                                                                      "faxOption"));
                            
                            
                                    elementList.add(localFaxOption==null?null:
                                    localFaxOption);
                                
                            elementList.add(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService",
                                                                      "ftpOption"));
                            
                            
                                    elementList.add(localFtpOption==null?null:
                                    localFtpOption);
                                
                            elementList.add(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService",
                                                                      "localOption"));
                            
                            
                                    elementList.add(localLocalOption==null?null:
                                    localLocalOption);
                                
                            elementList.add(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService",
                                                                      "printOption"));
                            
                            
                                    elementList.add(localPrintOption==null?null:
                                    localPrintOption);
                                
                            elementList.add(new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService",
                                                                      "webDAVOption"));
                            
                            
                                    elementList.add(localWebDAVOption==null?null:
                                    localWebDAVOption);
                                

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
        public static DeliveryRequest parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            DeliveryRequest object =
                new DeliveryRequest();

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
                    
                            if (!"DeliveryRequest".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (DeliveryRequest)com.oracle.xmlns.oxp.service.publicreportservice.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                 
                    
                    reader.next();
                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","emailOption").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setEmailOption(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setEmailOption(com.oracle.xmlns.oxp.service.publicreportservice.EMailDeliveryOption.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","faxOption").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setFaxOption(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setFaxOption(com.oracle.xmlns.oxp.service.publicreportservice.FaxDeliveryOption.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","ftpOption").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setFtpOption(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setFtpOption(com.oracle.xmlns.oxp.service.publicreportservice.FTPDeliveryOption.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","localOption").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setLocalOption(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setLocalOption(com.oracle.xmlns.oxp.service.publicreportservice.LocalDeliveryOption.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","printOption").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setPrintOption(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setPrintOption(com.oracle.xmlns.oxp.service.publicreportservice.PrintDeliveryOption.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://xmlns.oracle.com/oxp/service/PublicReportService","webDAVOption").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setWebDAVOption(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setWebDAVOption(com.oracle.xmlns.oxp.service.publicreportservice.WebDAVDeliveryOption.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
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
           
          