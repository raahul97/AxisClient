

/**
 * PublicReportServiceService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.4  Built on : Apr 26, 2008 (06:24:30 EDT)
 */

    package com.oracle.xmlns.oxp.service.publicreportservice;

    /*
     *  PublicReportServiceService java interface
     */

    public interface PublicReportServiceService {
          

        /**
          * Auto generated method signature
          * 
                    * @param deleteReportInSession
                
             * @throws com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException : 
             * @throws com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException : 
             * @throws com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException : 
         */

         
                     public com.oracle.xmlns.oxp.service.publicreportservice.DeleteReportInSessionResponse deleteReportInSession(

                        com.oracle.xmlns.oxp.service.publicreportservice.DeleteReportInSession deleteReportInSession)
                        throws java.rmi.RemoteException
             
          ,com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException
          ,com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException
          ,com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException;

        

        /**
          * Auto generated method signature
          * 
                    * @param getSecurityModel
                
         */

         
                     public com.oracle.xmlns.oxp.service.publicreportservice.GetSecurityModelResponse getSecurityModel(

                        com.oracle.xmlns.oxp.service.publicreportservice.GetSecurityModel getSecurityModel)
                        throws java.rmi.RemoteException
             ;

        

        /**
          * Auto generated method signature
          * 
                    * @param getListOfScheduledReportsStatus
                
             * @throws com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException : 
             * @throws com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException : 
             * @throws com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException : 
         */

         
                     public com.oracle.xmlns.oxp.service.publicreportservice.GetListOfScheduledReportsStatusResponse getListOfScheduledReportsStatus(

                        com.oracle.xmlns.oxp.service.publicreportservice.GetListOfScheduledReportsStatus getListOfScheduledReportsStatus)
                        throws java.rmi.RemoteException
             
          ,com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException
          ,com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException
          ,com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException;

        

        /**
          * Auto generated method signature
          * 
                    * @param deleteFolder
                
             * @throws com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException : 
             * @throws com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException : 
             * @throws com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException : 
         */

         
                     public com.oracle.xmlns.oxp.service.publicreportservice.DeleteFolderResponse deleteFolder(

                        com.oracle.xmlns.oxp.service.publicreportservice.DeleteFolder deleteFolder)
                        throws java.rmi.RemoteException
             
          ,com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException
          ,com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException
          ,com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException;

        

        /**
          * Auto generated method signature
          * 
                    * @param getScheduledReportStatusInSession
                
             * @throws com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException : 
             * @throws com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException : 
             * @throws com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException : 
         */

         
                     public com.oracle.xmlns.oxp.service.publicreportservice.GetScheduledReportStatusInSessionResponse getScheduledReportStatusInSession(

                        com.oracle.xmlns.oxp.service.publicreportservice.GetScheduledReportStatusInSession getScheduledReportStatusInSession)
                        throws java.rmi.RemoteException
             
          ,com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException
          ,com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException
          ,com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException;

        

        /**
          * Auto generated method signature
          * 
                    * @param createReport
                
             * @throws com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException : 
             * @throws com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException : 
             * @throws com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException : 
         */

         
                     public com.oracle.xmlns.oxp.service.publicreportservice.CreateReportResponse createReport(

                        com.oracle.xmlns.oxp.service.publicreportservice.CreateReport createReport)
                        throws java.rmi.RemoteException
             
          ,com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException
          ,com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException
          ,com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException;

        

        /**
          * Auto generated method signature
          * 
                    * @param getScheduledReportHistoryInfoInSession
                
             * @throws com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException : 
             * @throws com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException : 
             * @throws com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException : 
         */

         
                     public com.oracle.xmlns.oxp.service.publicreportservice.GetScheduledReportHistoryInfoInSessionResponse getScheduledReportHistoryInfoInSession(

                        com.oracle.xmlns.oxp.service.publicreportservice.GetScheduledReportHistoryInfoInSession getScheduledReportHistoryInfoInSession)
                        throws java.rmi.RemoteException
             
          ,com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException
          ,com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException
          ,com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException;

        

        /**
          * Auto generated method signature
          * 
                    * @param getScheduledReportHistoryInfo
                
             * @throws com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException : 
             * @throws com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException : 
             * @throws com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException : 
         */

         
                     public com.oracle.xmlns.oxp.service.publicreportservice.GetScheduledReportHistoryInfoResponse getScheduledReportHistoryInfo(

                        com.oracle.xmlns.oxp.service.publicreportservice.GetScheduledReportHistoryInfo getScheduledReportHistoryInfo)
                        throws java.rmi.RemoteException
             
          ,com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException
          ,com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException
          ,com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException;

        

        /**
          * Auto generated method signature
          * 
                    * @param deleteReport
                
             * @throws com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException : 
             * @throws com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException : 
             * @throws com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException : 
         */

         
                     public com.oracle.xmlns.oxp.service.publicreportservice.DeleteReportResponse deleteReport(

                        com.oracle.xmlns.oxp.service.publicreportservice.DeleteReport deleteReport)
                        throws java.rmi.RemoteException
             
          ,com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException
          ,com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException
          ,com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException;

        

        /**
          * Auto generated method signature
          * 
                    * @param impersonate
                
             * @throws com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException : 
         */

         
                     public com.oracle.xmlns.oxp.service.publicreportservice.ImpersonateResponse impersonate(

                        com.oracle.xmlns.oxp.service.publicreportservice.Impersonate impersonate)
                        throws java.rmi.RemoteException
             
          ,com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException;

        

        /**
          * Auto generated method signature
          * 
                    * @param isFolderExist
                
             * @throws com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException : 
         */

         
                     public com.oracle.xmlns.oxp.service.publicreportservice.IsFolderExistResponse isFolderExist(

                        com.oracle.xmlns.oxp.service.publicreportservice.IsFolderExist isFolderExist)
                        throws java.rmi.RemoteException
             
          ,com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException;

        

        /**
          * Auto generated method signature
          * 
                    * @param hasReportAccess
                
             * @throws com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException : 
         */

         
                     public com.oracle.xmlns.oxp.service.publicreportservice.HasReportAccessResponse hasReportAccess(

                        com.oracle.xmlns.oxp.service.publicreportservice.HasReportAccess hasReportAccess)
                        throws java.rmi.RemoteException
             
          ,com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException;

        

        /**
          * Auto generated method signature
          * 
                    * @param isFolderExistInSession
                
             * @throws com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException : 
         */

         
                     public com.oracle.xmlns.oxp.service.publicreportservice.IsFolderExistInSessionResponse isFolderExistInSession(

                        com.oracle.xmlns.oxp.service.publicreportservice.IsFolderExistInSession isFolderExistInSession)
                        throws java.rmi.RemoteException
             
          ,com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException;

        

        /**
          * Auto generated method signature
          * 
                    * @param isReportExistInSession
                
             * @throws com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException : 
         */

         
                     public com.oracle.xmlns.oxp.service.publicreportservice.IsReportExistInSessionResponse isReportExistInSession(

                        com.oracle.xmlns.oxp.service.publicreportservice.IsReportExistInSession isReportExistInSession)
                        throws java.rmi.RemoteException
             
          ,com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException;

        

        /**
          * Auto generated method signature
          * 
                    * @param resumeScheduledReportInSession
                
             * @throws com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException : 
             * @throws com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException : 
             * @throws com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException : 
         */

         
                     public com.oracle.xmlns.oxp.service.publicreportservice.ResumeScheduledReportInSessionResponse resumeScheduledReportInSession(

                        com.oracle.xmlns.oxp.service.publicreportservice.ResumeScheduledReportInSession resumeScheduledReportInSession)
                        throws java.rmi.RemoteException
             
          ,com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException
          ,com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException
          ,com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException;

        

        /**
          * Auto generated method signature
          * 
                    * @param getFolderContentsInSession
                
             * @throws com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException : 
             * @throws com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException : 
             * @throws com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException : 
         */

         
                     public com.oracle.xmlns.oxp.service.publicreportservice.GetFolderContentsInSessionResponse getFolderContentsInSession(

                        com.oracle.xmlns.oxp.service.publicreportservice.GetFolderContentsInSession getFolderContentsInSession)
                        throws java.rmi.RemoteException
             
          ,com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException
          ,com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException
          ,com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException;

        

        /**
          * Auto generated method signature
          * 
                    * @param runReport
                
             * @throws com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException : 
             * @throws com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException : 
             * @throws com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException : 
         */

         
                     public com.oracle.xmlns.oxp.service.publicreportservice.RunReportResponse runReport(

                        com.oracle.xmlns.oxp.service.publicreportservice.RunReport runReport)
                        throws java.rmi.RemoteException
             
          ,com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException
          ,com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException
          ,com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException;

        

        /**
          * Auto generated method signature
          * 
                    * @param scheduleReport
                
             * @throws com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException : 
             * @throws com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException : 
             * @throws com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException : 
         */

         
                     public com.oracle.xmlns.oxp.service.publicreportservice.ScheduleReportResponse scheduleReport(

                        com.oracle.xmlns.oxp.service.publicreportservice.ScheduleReport scheduleReport)
                        throws java.rmi.RemoteException
             
          ,com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException
          ,com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException
          ,com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException;

        

        /**
          * Auto generated method signature
          * 
                    * @param updateReportDefinitionInSession
                
             * @throws com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException : 
             * @throws com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException : 
             * @throws com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException : 
         */

         
                     public com.oracle.xmlns.oxp.service.publicreportservice.UpdateReportDefinitionInSessionResponse updateReportDefinitionInSession(

                        com.oracle.xmlns.oxp.service.publicreportservice.UpdateReportDefinitionInSession updateReportDefinitionInSession)
                        throws java.rmi.RemoteException
             
          ,com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException
          ,com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException
          ,com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException;

        

        /**
          * Auto generated method signature
          * 
                    * @param deleteScheduledReportInSession
                
             * @throws com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException : 
             * @throws com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException : 
             * @throws com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException : 
         */

         
                     public com.oracle.xmlns.oxp.service.publicreportservice.DeleteScheduledReportInSessionResponse deleteScheduledReportInSession(

                        com.oracle.xmlns.oxp.service.publicreportservice.DeleteScheduledReportInSession deleteScheduledReportInSession)
                        throws java.rmi.RemoteException
             
          ,com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException
          ,com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException
          ,com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException;

        

        /**
          * Auto generated method signature
          * 
                    * @param downloadReport
                
             * @throws com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException : 
             * @throws com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException : 
             * @throws com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException : 
         */

         
                     public com.oracle.xmlns.oxp.service.publicreportservice.DownloadReportResponse downloadReport(

                        com.oracle.xmlns.oxp.service.publicreportservice.DownloadReport downloadReport)
                        throws java.rmi.RemoteException
             
          ,com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException
          ,com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException
          ,com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException;

        

        /**
          * Auto generated method signature
          * 
                    * @param uploadReportInSession
                
             * @throws com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException : 
             * @throws com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException : 
             * @throws com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException : 
         */

         
                     public com.oracle.xmlns.oxp.service.publicreportservice.UploadReportInSessionResponse uploadReportInSession(

                        com.oracle.xmlns.oxp.service.publicreportservice.UploadReportInSession uploadReportInSession)
                        throws java.rmi.RemoteException
             
          ,com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException
          ,com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException
          ,com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException;

        

        /**
          * Auto generated method signature
          * 
                    * @param resumeScheduledReport
                
             * @throws com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException : 
             * @throws com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException : 
             * @throws com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException : 
         */

         
                     public com.oracle.xmlns.oxp.service.publicreportservice.ResumeScheduledReportResponse resumeScheduledReport(

                        com.oracle.xmlns.oxp.service.publicreportservice.ResumeScheduledReport resumeScheduledReport)
                        throws java.rmi.RemoteException
             
          ,com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException
          ,com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException
          ,com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException;

        

        /**
          * Auto generated method signature
          * 
                    * @param deleteScheduledReportHistory
                
             * @throws com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException : 
             * @throws com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException : 
             * @throws com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException : 
         */

         
                     public com.oracle.xmlns.oxp.service.publicreportservice.DeleteScheduledReportHistoryResponse deleteScheduledReportHistory(

                        com.oracle.xmlns.oxp.service.publicreportservice.DeleteScheduledReportHistory deleteScheduledReportHistory)
                        throws java.rmi.RemoteException
             
          ,com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException
          ,com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException
          ,com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException;

        

        /**
          * Auto generated method signature
          * 
                    * @param runReportInSession
                
             * @throws com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException : 
             * @throws com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException : 
             * @throws com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException : 
         */

         
                     public com.oracle.xmlns.oxp.service.publicreportservice.RunReportInSessionResponse runReportInSession(

                        com.oracle.xmlns.oxp.service.publicreportservice.RunReportInSession runReportInSession)
                        throws java.rmi.RemoteException
             
          ,com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException
          ,com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException
          ,com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException;

        

        /**
          * Auto generated method signature
          * 
                    * @param downloadReportInSession
                
             * @throws com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException : 
             * @throws com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException : 
             * @throws com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException : 
         */

         
                     public com.oracle.xmlns.oxp.service.publicreportservice.DownloadReportInSessionResponse downloadReportInSession(

                        com.oracle.xmlns.oxp.service.publicreportservice.DownloadReportInSession downloadReportInSession)
                        throws java.rmi.RemoteException
             
          ,com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException
          ,com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException
          ,com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException;

        

        /**
          * Auto generated method signature
          * 
                    * @param createReportInSession
                
             * @throws com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException : 
             * @throws com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException : 
             * @throws com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException : 
         */

         
                     public com.oracle.xmlns.oxp.service.publicreportservice.CreateReportInSessionResponse createReportInSession(

                        com.oracle.xmlns.oxp.service.publicreportservice.CreateReportInSession createReportInSession)
                        throws java.rmi.RemoteException
             
          ,com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException
          ,com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException
          ,com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException;

        

        /**
          * Auto generated method signature
          * 
                    * @param downloadReportDataChunk
                
             * @throws com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException : 
         */

         
                     public com.oracle.xmlns.oxp.service.publicreportservice.DownloadReportDataChunkResponse downloadReportDataChunk(

                        com.oracle.xmlns.oxp.service.publicreportservice.DownloadReportDataChunk downloadReportDataChunk)
                        throws java.rmi.RemoteException
             
          ,com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException;

        

        /**
          * Auto generated method signature
          * 
                    * @param getScheduledReportStatus
                
             * @throws com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException : 
             * @throws com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException : 
             * @throws com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException : 
         */

         
                     public com.oracle.xmlns.oxp.service.publicreportservice.GetScheduledReportStatusResponse getScheduledReportStatus(

                        com.oracle.xmlns.oxp.service.publicreportservice.GetScheduledReportStatus getScheduledReportStatus)
                        throws java.rmi.RemoteException
             
          ,com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException
          ,com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException
          ,com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException;

        

        /**
          * Auto generated method signature
          * 
                    * @param getReportDefinition
                
             * @throws com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException : 
             * @throws com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException : 
             * @throws com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException : 
         */

         
                     public com.oracle.xmlns.oxp.service.publicreportservice.GetReportDefinitionResponse getReportDefinition(

                        com.oracle.xmlns.oxp.service.publicreportservice.GetReportDefinition getReportDefinition)
                        throws java.rmi.RemoteException
             
          ,com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException
          ,com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException
          ,com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException;

        

        /**
          * Auto generated method signature
          * 
                    * @param uploadReportDataChunk
                
             * @throws com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException : 
         */

         
                     public com.oracle.xmlns.oxp.service.publicreportservice.UploadReportDataChunkResponse uploadReportDataChunk(

                        com.oracle.xmlns.oxp.service.publicreportservice.UploadReportDataChunk uploadReportDataChunk)
                        throws java.rmi.RemoteException
             
          ,com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException;

        

        /**
          * Auto generated method signature
          * 
                    * @param login
                
             * @throws com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException : 
         */

         
                     public com.oracle.xmlns.oxp.service.publicreportservice.LoginResponse login(

                        com.oracle.xmlns.oxp.service.publicreportservice.Login login)
                        throws java.rmi.RemoteException
             
          ,com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException;

        

        /**
          * Auto generated method signature
          * 
                    * @param createReportFolder
                
             * @throws com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException : 
             * @throws com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException : 
             * @throws com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException : 
         */

         
                     public com.oracle.xmlns.oxp.service.publicreportservice.CreateReportFolderResponse createReportFolder(

                        com.oracle.xmlns.oxp.service.publicreportservice.CreateReportFolder createReportFolder)
                        throws java.rmi.RemoteException
             
          ,com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException
          ,com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException
          ,com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException;

        

        /**
          * Auto generated method signature
          * 
                    * @param updateReportDefinition
                
             * @throws com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException : 
             * @throws com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException : 
             * @throws com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException : 
         */

         
                     public com.oracle.xmlns.oxp.service.publicreportservice.UpdateReportDefinitionResponse updateReportDefinition(

                        com.oracle.xmlns.oxp.service.publicreportservice.UpdateReportDefinition updateReportDefinition)
                        throws java.rmi.RemoteException
             
          ,com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException
          ,com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException
          ,com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException;

        

        /**
          * Auto generated method signature
          * 
                    * @param validateLogin
                
         */

         
                     public com.oracle.xmlns.oxp.service.publicreportservice.ValidateLoginResponse validateLogin(

                        com.oracle.xmlns.oxp.service.publicreportservice.ValidateLogin validateLogin)
                        throws java.rmi.RemoteException
             ;

        

        /**
          * Auto generated method signature
          * 
                    * @param uploadTemplateForReportInSession
                
             * @throws com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException : 
             * @throws com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException : 
             * @throws com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException : 
         */

         
                     public com.oracle.xmlns.oxp.service.publicreportservice.UploadTemplateForReportInSessionResponse uploadTemplateForReportInSession(

                        com.oracle.xmlns.oxp.service.publicreportservice.UploadTemplateForReportInSession uploadTemplateForReportInSession)
                        throws java.rmi.RemoteException
             
          ,com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException
          ,com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException
          ,com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException;

        

        /**
          * Auto generated method signature
          * 
                    * @param getScheduledReportInfoInSession
                
             * @throws com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException : 
             * @throws com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException : 
             * @throws com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException : 
         */

         
                     public com.oracle.xmlns.oxp.service.publicreportservice.GetScheduledReportInfoInSessionResponse getScheduledReportInfoInSession(

                        com.oracle.xmlns.oxp.service.publicreportservice.GetScheduledReportInfoInSession getScheduledReportInfoInSession)
                        throws java.rmi.RemoteException
             
          ,com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException
          ,com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException
          ,com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException;

        

        /**
          * Auto generated method signature
          * 
                    * @param uploadTemplateForReport
                
             * @throws com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException : 
             * @throws com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException : 
             * @throws com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException : 
         */

         
                     public com.oracle.xmlns.oxp.service.publicreportservice.UploadTemplateForReportResponse uploadTemplateForReport(

                        com.oracle.xmlns.oxp.service.publicreportservice.UploadTemplateForReport uploadTemplateForReport)
                        throws java.rmi.RemoteException
             
          ,com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException
          ,com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException
          ,com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException;

        

        /**
          * Auto generated method signature
          * 
                    * @param getReportParametersInSession
                
             * @throws com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException : 
             * @throws com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException : 
             * @throws com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException : 
         */

         
                     public com.oracle.xmlns.oxp.service.publicreportservice.GetReportParametersInSessionResponse getReportParametersInSession(

                        com.oracle.xmlns.oxp.service.publicreportservice.GetReportParametersInSession getReportParametersInSession)
                        throws java.rmi.RemoteException
             
          ,com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException
          ,com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException
          ,com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException;

        

        /**
          * Auto generated method signature
          * 
                    * @param removeTemplateForReportInSession
                
             * @throws com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException : 
             * @throws com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException : 
             * @throws com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException : 
         */

         
                     public com.oracle.xmlns.oxp.service.publicreportservice.RemoveTemplateForReportInSessionResponse removeTemplateForReportInSession(

                        com.oracle.xmlns.oxp.service.publicreportservice.RemoveTemplateForReportInSession removeTemplateForReportInSession)
                        throws java.rmi.RemoteException
             
          ,com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException
          ,com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException
          ,com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException;

        

        /**
          * Auto generated method signature
          * 
                    * @param createReportFolderInSession
                
             * @throws com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException : 
             * @throws com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException : 
             * @throws com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException : 
         */

         
                     public com.oracle.xmlns.oxp.service.publicreportservice.CreateReportFolderInSessionResponse createReportFolderInSession(

                        com.oracle.xmlns.oxp.service.publicreportservice.CreateReportFolderInSession createReportFolderInSession)
                        throws java.rmi.RemoteException
             
          ,com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException
          ,com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException
          ,com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException;

        

        /**
          * Auto generated method signature
          * 
                    * @param hasReportAccessInSession
                
             * @throws com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException : 
         */

         
                     public com.oracle.xmlns.oxp.service.publicreportservice.HasReportAccessInSessionResponse hasReportAccessInSession(

                        com.oracle.xmlns.oxp.service.publicreportservice.HasReportAccessInSession hasReportAccessInSession)
                        throws java.rmi.RemoteException
             
          ,com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException;

        

        /**
          * Auto generated method signature
          * 
                    * @param isReportExist
                
             * @throws com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException : 
         */

         
                     public com.oracle.xmlns.oxp.service.publicreportservice.IsReportExistResponse isReportExist(

                        com.oracle.xmlns.oxp.service.publicreportservice.IsReportExist isReportExist)
                        throws java.rmi.RemoteException
             
          ,com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException;

        

        /**
          * Auto generated method signature
          * 
                    * @param getBIPHTTPSessionInterval
                
         */

         
                     public com.oracle.xmlns.oxp.service.publicreportservice.GetBIPHTTPSessionIntervalResponse getBIPHTTPSessionInterval(

                        com.oracle.xmlns.oxp.service.publicreportservice.GetBIPHTTPSessionInterval getBIPHTTPSessionInterval)
                        throws java.rmi.RemoteException
             ;

        

        /**
          * Auto generated method signature
          * 
                    * @param getScheduledReportInfo
                
             * @throws com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException : 
             * @throws com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException : 
             * @throws com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException : 
         */

         
                     public com.oracle.xmlns.oxp.service.publicreportservice.GetScheduledReportInfoResponse getScheduledReportInfo(

                        com.oracle.xmlns.oxp.service.publicreportservice.GetScheduledReportInfo getScheduledReportInfo)
                        throws java.rmi.RemoteException
             
          ,com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException
          ,com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException
          ,com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException;

        

        /**
          * Auto generated method signature
          * 
                    * @param deleteFolderInSession
                
             * @throws com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException : 
             * @throws com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException : 
             * @throws com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException : 
         */

         
                     public com.oracle.xmlns.oxp.service.publicreportservice.DeleteFolderInSessionResponse deleteFolderInSession(

                        com.oracle.xmlns.oxp.service.publicreportservice.DeleteFolderInSession deleteFolderInSession)
                        throws java.rmi.RemoteException
             
          ,com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException
          ,com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException
          ,com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException;

        

        /**
          * Auto generated method signature
          * 
                    * @param deleteScheduledReportHistoryInSession
                
             * @throws com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException : 
             * @throws com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException : 
             * @throws com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException : 
         */

         
                     public com.oracle.xmlns.oxp.service.publicreportservice.DeleteScheduledReportHistoryInSessionResponse deleteScheduledReportHistoryInSession(

                        com.oracle.xmlns.oxp.service.publicreportservice.DeleteScheduledReportHistoryInSession deleteScheduledReportHistoryInSession)
                        throws java.rmi.RemoteException
             
          ,com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException
          ,com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException
          ,com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException;

        

        /**
          * Auto generated method signature
          * 
                    * @param suspendScheduledReportInSession
                
             * @throws com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException : 
             * @throws com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException : 
             * @throws com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException : 
         */

         
                     public com.oracle.xmlns.oxp.service.publicreportservice.SuspendScheduledReportInSessionResponse suspendScheduledReportInSession(

                        com.oracle.xmlns.oxp.service.publicreportservice.SuspendScheduledReportInSession suspendScheduledReportInSession)
                        throws java.rmi.RemoteException
             
          ,com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException
          ,com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException
          ,com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException;

        

        /**
          * Auto generated method signature
          * 
                    * @param getFolderContents
                
             * @throws com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException : 
             * @throws com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException : 
             * @throws com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException : 
         */

         
                     public com.oracle.xmlns.oxp.service.publicreportservice.GetFolderContentsResponse getFolderContents(

                        com.oracle.xmlns.oxp.service.publicreportservice.GetFolderContents getFolderContents)
                        throws java.rmi.RemoteException
             
          ,com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException
          ,com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException
          ,com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException;

        

        /**
          * Auto generated method signature
          * 
                    * @param getReportDefinitionInSession
                
             * @throws com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException : 
             * @throws com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException : 
             * @throws com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException : 
         */

         
                     public com.oracle.xmlns.oxp.service.publicreportservice.GetReportDefinitionInSessionResponse getReportDefinitionInSession(

                        com.oracle.xmlns.oxp.service.publicreportservice.GetReportDefinitionInSession getReportDefinitionInSession)
                        throws java.rmi.RemoteException
             
          ,com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException
          ,com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException
          ,com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException;

        

        /**
          * Auto generated method signature
          * 
                    * @param uploadReport
                
             * @throws com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException : 
             * @throws com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException : 
             * @throws com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException : 
         */

         
                     public com.oracle.xmlns.oxp.service.publicreportservice.UploadReportResponse uploadReport(

                        com.oracle.xmlns.oxp.service.publicreportservice.UploadReport uploadReport)
                        throws java.rmi.RemoteException
             
          ,com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException
          ,com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException
          ,com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException;

        

        /**
          * Auto generated method signature
          * 
                    * @param removeTemplateForReport
                
             * @throws com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException : 
             * @throws com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException : 
             * @throws com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException : 
         */

         
                     public com.oracle.xmlns.oxp.service.publicreportservice.RemoveTemplateForReportResponse removeTemplateForReport(

                        com.oracle.xmlns.oxp.service.publicreportservice.RemoveTemplateForReport removeTemplateForReport)
                        throws java.rmi.RemoteException
             
          ,com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException
          ,com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException
          ,com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException;

        

        /**
          * Auto generated method signature
          * 
                    * @param logout
                
             * @throws com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException : 
             * @throws com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException : 
         */

         
                     public com.oracle.xmlns.oxp.service.publicreportservice.LogoutResponse logout(

                        com.oracle.xmlns.oxp.service.publicreportservice.Logout logout)
                        throws java.rmi.RemoteException
             
          ,com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException
          ,com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException;

        

        /**
          * Auto generated method signature
          * 
                    * @param deleteScheduledReport
                
             * @throws com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException : 
             * @throws com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException : 
             * @throws com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException : 
         */

         
                     public com.oracle.xmlns.oxp.service.publicreportservice.DeleteScheduledReportResponse deleteScheduledReport(

                        com.oracle.xmlns.oxp.service.publicreportservice.DeleteScheduledReport deleteScheduledReport)
                        throws java.rmi.RemoteException
             
          ,com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException
          ,com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException
          ,com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException;

        

        /**
          * Auto generated method signature
          * 
                    * @param getListOfScheduledReportsStatusInSession
                
             * @throws com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException : 
             * @throws com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException : 
             * @throws com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException : 
         */

         
                     public com.oracle.xmlns.oxp.service.publicreportservice.GetListOfScheduledReportsStatusInSessionResponse getListOfScheduledReportsStatusInSession(

                        com.oracle.xmlns.oxp.service.publicreportservice.GetListOfScheduledReportsStatusInSession getListOfScheduledReportsStatusInSession)
                        throws java.rmi.RemoteException
             
          ,com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException
          ,com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException
          ,com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException;

        

        /**
          * Auto generated method signature
          * 
                    * @param suspendScheduledReport
                
             * @throws com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException : 
             * @throws com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException : 
             * @throws com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException : 
         */

         
                     public com.oracle.xmlns.oxp.service.publicreportservice.SuspendScheduledReportResponse suspendScheduledReport(

                        com.oracle.xmlns.oxp.service.publicreportservice.SuspendScheduledReport suspendScheduledReport)
                        throws java.rmi.RemoteException
             
          ,com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException
          ,com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException
          ,com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException;

        

        /**
          * Auto generated method signature
          * 
                    * @param scheduleReportInSession
                
             * @throws com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException : 
             * @throws com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException : 
             * @throws com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException : 
         */

         
                     public com.oracle.xmlns.oxp.service.publicreportservice.ScheduleReportInSessionResponse scheduleReportInSession(

                        com.oracle.xmlns.oxp.service.publicreportservice.ScheduleReportInSession scheduleReportInSession)
                        throws java.rmi.RemoteException
             
          ,com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException
          ,com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException
          ,com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException;

        

        /**
          * Auto generated method signature
          * 
                    * @param getReportParameters
                
             * @throws com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException : 
             * @throws com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException : 
             * @throws com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException : 
         */

         
                     public com.oracle.xmlns.oxp.service.publicreportservice.GetReportParametersResponse getReportParameters(

                        com.oracle.xmlns.oxp.service.publicreportservice.GetReportParameters getReportParameters)
                        throws java.rmi.RemoteException
             
          ,com.oracle.xmlns.oxp.service.publicreportservice.InvalidParametersException
          ,com.oracle.xmlns.oxp.service.publicreportservice.AccessDeniedException
          ,com.oracle.xmlns.oxp.service.publicreportservice.OperationFailedException;

        

        
       //
       }
    