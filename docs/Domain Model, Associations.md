
# Association for Use Cases #


|**Concepts Association  for UC-0.1** |	                                                    |                     |    
|:-------------------------|:-------------------------------------------------------|:--------------------|   
|**Concept pairs**         | **Association description**                            |**Association Name** |  
|Controller **&#60;&#45;&#45;&#62;** NewIdentityEntry	|controller Send the new entry identity to add to system  | recieves |  
|Controller **&#60;&#45;&#45;&#62;** interfacePage	| Controller participate in preparation of interface  | Post | 
|pageMaker **&#60;&#45;&#45;&#62;** interfacePage	| pageMaker prepares the interface Page	| Prepares |   
|Controller **&#60;&#45;&#45;&#62;** pageMaker | Controller passes requests to Page Maker and receives back pages prepared for displaying |Convey request|
|identityChecker **&#60;&#45;&#45;&#62;** AddUser | Retrieves valid identities to check the entry identity and which one is. |add valid identity |  
|identityChecker **&#60;&#45;&#45;&#62;** identity	| Verify the kind of identity | Verify |  
|Controller **&#60;&#45;&#45;&#62;** identity | Control of kind of identity and use when it is need	| Obtain |  
|pageMaker **&#60;&#45;&#45;&#62;** DBconnection |Obtain need data from database to load on page | Provides Data |  



|**Concepts Association  for UC-0.2** |	                                                    |                     |    
|:-------------------------|:-------------------------------------------------------|:--------------------|   
|**Concept pairs**         | **Association description**                            |**Association Name** |
|Controller **&#60;&#45;&#45;&#62;** RemoveIdentityEntry | Send the entry identity to remove from system to controller 	| recieves |  
|Controller **&#60;&#45;&#45;&#62;** interfacePage |Controller participate in preparation of interface | Post |   
|pageMaker **&#60;&#45;&#45;&#62;** interfacePage |pageMaker prepares the interface Page	| Prepares |  
|Controller **&#60;&#45;&#45;&#62;** pageMaker |Controller passes requests to Page Maker and receives back pages prepared for displaying | Convey request |
|Controller **&#60;&#45;&#45;&#62;** idnetityChecker	| Controller order to check the entry identity and send back the result to controller | Request | 
|pageMaker **&#60;&#45;&#45;&#62;** DBconnection	|Obtain need data from database to load on page	| Provide data |    
|Controller **&#60;&#45;&#45;&#62;** RemoveUser	| Post the expired identity to remove user and remove from system and database | Post expired identity |  



|**Concepts Association  for UC-1** |	                                                    |                     |    
|:-------------------------|:-------------------------------------------------------|:--------------------|   
|**Concept pairs**         | **Association description**                            |**Association Name** |
|Controller **&#60;&#45;&#45;&#62;** identityEntry	| Send the entry identity to controller | Receives |  
|Controller **&#60;&#45;&#45;&#62;** interfacePage	| Controller participate in preparation of interface | Post |  
|pageMaker **&#60;&#45;&#45;&#62;** interfacePage | pageMaker prepares the interface Page | Prepares |  
|Controller **&#60;&#45;&#45;&#62;** pageMaker| Controller passes requests to Page Maker and receives back pages prepared for displaying | Convey request |      
|Controller **&#60;&#45;&#45;&#62;** idnetityChecker | Controller order to check the entry identity and send back the result to controller	| Request |  
|identityChecker **&#60;&#45;&#45;&#62;** identityStorage | Retrieves valid identities to check the entry identity and which one is. | Retrieve valid  identity |
|identityChecker **&#60;&#45;&#45;&#62;** identity	| Verify the kind of identity	| Verify |   
|Controller **&#60;&#45;&#45;&#62;** identity | Control of kind of identity and use when it is need	| Obtain |  
|Controller **&#60;&#45;&#45;&#62;** EnableSubs	| Control on specification of subsystem accessibilities  for user | Specify accessibility |  
|PageMaker **&#60;&#45;&#45;&#62;** EnableSubs	| Specify the accessible subsystem to pageMaker to render it. | Obtain access |  


|**Concepts Association  for UC-2** |	                                                    |                     |    
|:-------------------------|:-------------------------------------------------------|:--------------------|   
|**Concept pairs**         | **Association description**                            |**Association Name** |  
|checker **&#60;&#45;&#45;&#62;** interface page	| Interface page will get the input | Preparing |  
|save **&#60;&#45;&#45;&#62;** getter | The getter gets the contents. | Getter for data |  
|Data holder **&#60;&#45;&#45;&#62;** save	| Saver will prepare the content for writing to database | Prepare |  
|Save **&#60;&#45;&#45;&#62;** writer | The saver will give it to the writer for righting | Write |  
|Writer **&#60;&#45;&#45;&#62;** database | Writer will write to database | writer |  
|Interface page **&#60;&#45;&#45;&#62;** checker | Checks for valid data | checking |  
|Interface page **&#60;&#45;&#45;&#62;** checker | Send and receives data | Send and receive  |  
|Saver **&#60;&#45;&#45;&#62;** save | Gets data to save | Get data |  
|Initiator **&#60;&#45;&#45;&#62;** intpage	| Dials input for system	| input |  



|**Concepts Association  for UC-3** |	                                                    |                     |    
|:-------------------------|:-------------------------------------------------------|:--------------------|   
|**Concept pairs**         | **Association description**                            |**Association Name** |  
|Actor **&#60;&#45;&#45;&#62;** interface page |Inputs data |	Get input |   
|Interface Page **&#60;&#45;&#45;&#62;** delete |Shows the contents to be deleted	| Request |   
Interface page **&#60;&#45;&#45;&#62;** page maker | Page maker makes the page to show in | Updates page |  
Page maker **&#60;&#45;&#45;&#62;** delete | Sends data to delete it . | Send request |  
Delete **&#60;&#45;&#45;&#62;** database deleter | Send request to delete the appropriate data	| request |  


|**Concepts Association  for UC-4** |	                                                    |                     |    
|:-------------------------|:-------------------------------------------------------|:--------------------|   
|**Concept pairs**         | **Association description**                            |**Association Name** |  
|Interface page **&#60;&#45;&#45;&#62;** 	checker | Sends and receives data from actor	Show data & input
|Interface page **&#60;&#45;&#45;&#62;** controller |Controls the data for the specific operation	| Control |
|Data holder **&#60;&#45;&#45;&#62;** page maker	Page maker gets data from data holder to show	| Get data |  
|Controller **&#60;&#45;&#45;&#62;** print | send request to print the data.	|Request to print |  
|Controller **&#60;&#45;&#45;&#62;** page maker | Controls the content of the page maker to show	| Control |  
|Dataholder **&#60;&#45;&#45;&#62;** data base | Gets data to hold it from other parts. | holder |  



|**Concepts Association  for UC-5** |	                                                    |                     |    
|:-------------------------|:-------------------------------------------------------|:--------------------|   
|**Concept pairs**         | **Association description**                            |**Association Name** |  
|Actor **&#60;&#45;&#45;&#62;** interface page	|Gets input and show back for actor	| In and out |  
|Page maker **&#60;&#45;&#45;&#62;** decision maker	| Decision makers decides which content to show 	| Controls |  
|Editor **&#60;&#45;&#45;&#62;** decision maker	| Send request to take the data to check. | Checker |  
|Interface **&#60;&#45;&#45;&#62;** page maker | Sends request to show content | request |  
|Decision maker **&#60;&#45;&#45;&#62;** page maker	| request to check | request |   
|Decision maker **&#60;&#45;&#45;&#62;** data holder	Send data for holding | Send and receive |  
|Decision maker **&#60;&#45;&#45;&#62;** editor	| Send data to update	| Data update |  
|Decision maker **&#60;&#45;&#45;&#62;** save	| Send request to hold the data for save | Send and receive |  



|**Concepts Association  for UC-6** |	                                            |                     |    
|:-------------------------|:-------------------------------------------------------|:--------------------|   
|**Concept pairs**         | **Association description**                            |**Association Name** |  
|Controller **&#60;&#45;&#45;&#62;** UserAuthenticator	|Controller pass the user name and password… to UserAuthenticator for authenticating the user | Authenticate |  
|Controller **&#60;&#45;&#45;&#62;** Page Maker	| passes requests to Page Maker and receives back pages prepared for displaying	| conveys requests |  
|Page Maker **&#60;&#45;&#45;&#62;** Interface Page	Page Maker prepares the Interface Page	prepare
|Page Maker **&#60;&#45;&#45;&#62;** DBConnector | Page Maker passes search requests to Database Connection to list the user interested query | Dispatches Request |  
|QueryFilter **&#60;&#45;&#45;&#62;** DBConnector | QueryFilter connect to DBConnector for filtering user interested fields	| Filtering Result |  
|ResultSorter **&#60;&#45;&#45;&#62;** DBConnector	| ResultSorter connect to DBConnector to sort the list somehow user wants. |Sorting Result |  
|ResultSorter **&#60;&#45;&#45;&#62;** Page Maker | ResultSorter  connect the Page Maker to render the user specified field sorted result | Rendering the Filtered Result |  



|**Concepts Association  for UC-7** |	                                            |                     |    
|:-------------------------|:-------------------------------------------------------|:--------------------|   
|**Concept pairs**         | **Association description**                            |**Association Name** |  
|Controller **&#60;&#45;&#45;&#62;** UserAuthenticator	|Controller pass the user name and password to UserAuthenticator for authenticating the user | Authenticate |   
|Controller **&#60;&#45;&#45;&#62;** Page Maker	| Controller passes requests to Page Maker and receives back pages prepared for displaying interface | conveys requests |  
|Page Maker **&#60;&#45;&#45;&#62;** Interface Page	| Page Maker passes predefined interface for actor actions | Prepare |  
|Page Maker **&#60;&#45;&#45;&#62;** Form |Must render the form to an html document for sending to actor’s Web browser for display. |Making form |  
|TimeReserver **&#60;&#45;&#45;&#62;** DBConnector	| TimeReserver needs to request DBConnector to check whether the time is reserved before	Checking the | reserving time |  
|Controller **&#60;&#45;&#45;&#62;** RecieptPrinter	| Need to connect with RecieptPrinter to request for printing the receipt | request |  
|RecieptPrinter **&#60;&#45;&#45;&#62;** DBConnector | RecieptPrinter needs database connection via DBConnector	| Printing |  
|Controller **&#60;&#45;&#45;&#62;** QueryFilter | Controller pass new Form request to Form	| Filtering Result |  
|Controller **&#60;&#45;&#45;&#62;** Archiver | Need to request from Archiver to save the receipt or patient | Request |  
|Archiver **&#60;&#45;&#45;&#62;** DBConnector | Archiver requests Database Connection to store receipt into the database	Receipt, Patient | save |  
|Archiver **&#60;&#45;&#45;&#62;** Notifier	| Archiver requests Notifier to notify success of archiving | Notifier |   
|Controller **&#60;&#45;&#45;&#62;** Remover | Controller Passes delete request to ReceiptDeleter for deleting the receptionist interested receipt | conveys requests |  
|Remover **&#60;&#45;&#45;&#62;** DBConnector | ReceiptDeleter must connect to DBConnector to delete the receipt form database	| DeletePatient |   
|Controller **&#60;&#45;&#45;&#62;** ResultSorter | Controller needs to ask result sorter to sort the list	| Request |  
|ResultSorter **&#60;&#45;&#45;&#62;** DBConnector	| ResultSorter connect to DBConnector to sort the list somehow user wants.	| Sorting Result |  
|ResultSorter **&#60;&#45;&#45;&#62;** Page Maker | ResultSorter  connect the Page Maker to render the user specified field sorted result | Rendering the Filtered Result |   



|**Concepts Association  for UC-8** |	                                            |                     |    
|:-------------------------|:-------------------------------------------------------|:--------------------|   
|**Concept pairs**         | **Association description**                            |**Association Name** |  
|Controller **&#60;&#45;&#45;&#62;** UserAuthenticator	| Controller pass the user name and password to UserAuthenticator for authenticating the user |Authenticate |   
|Controller **&#60;&#45;&#45;&#62;** Page Maker	| Controller passes requests to Page Maker and receives back pages prepared for displaying interface	| prepare |  
|Page Maker **&#60;&#45;&#45;&#62;** Interface Page	| Page Maker passes search requests to Database Connection	Dispatches Request
|Page Maker **&#60;&#45;&#45;&#62;** RegisterForm	| ResultRenderer request DBConnector to list the user interested query	| Rendering Result |  
|Controller **&#60;&#45;&#45;&#62;** RegisterForm	| QueryFilter connect to DBConnector for filtering user interested fields |Filtering Result |  
|ResultSorter **&#60;&#45;&#45;&#62;** DBConnector	| ResultSorter connect to DBConnector to sort the list somehow user wants. | Sorting Result |  
|Controller **&#60;&#45;&#45;&#62;** RecieptPrinter	| Need to connect with RecieptPrinter to request for printing the receipt 	| request |  
|RecieptPrinter **&#60;&#45;&#45;&#62;** DBConnector | RecieptPrinter needs database connection via DBConnector	| Printing |  
|ResultRenderer **&#60;&#45;&#45;&#62;** QueryFilter | ResultRenderer to render the user specified field filtered result of QueryFilter	| Rendering the Filtered Result |   
|Controller **&#60;&#45;&#45;&#62;** Archiver | Need to request from Archiver to save the receipt or patient | request |  
|Archiver **&#60;&#45;&#45;&#62;** DBConnector	| Archiver requests Database Connection to store receipt into the database	| Receipt save |  
|Archiver **&#60;&#45;&#45;&#62;** Notifier	Archiver requests Notifier to notify success of archiving 	Notify 
|Controller **&#60;&#45;&#45;&#62;** Remover | Controller Passes delete request to ReceiptDeleter for deleting the receptionist interested receipt 	| conveys requests |  
|Remover **&#60;&#45;&#45;&#62;** DBConnector | ReceiptDeleter must connect to DBConnector to delete the receipt from database	|Delete request |  



|**Concepts Association  for UC-9** |	                                            |                     |    
|:-------------------------|:-------------------------------------------------------|:--------------------|   
|**Concept pairs**         | **Association description**                            |**Association Name** |  
|


|**Concepts Association  for UC-10** |	                                            |                     |    
|:-------------------------|:-------------------------------------------------------|:--------------------|   
|**Concept pairs**         | **Association description**                            |**Association Name** |  
|Interface Page **&#60;&#45;&#45;&#62;** AddingFormOfNewPatient | Interface page load the form of new Patient for filling | New form |  
|CheckInputValue **&#60;&#45;&#45;&#62;** Massage warning | Check input value check the input value and massage warning show when the user enter invalid value | checking |  
|CheckInputValue **&#60;&#45;&#45;&#62;** save | After the checking the information , information send to database for saving | save |  
|database **&#60;&#45;&#45;&#62;** list of patient | Database post the list of patient to interface page | post |  
|InterfaceListOfPatient **&#60;&#45;&#45;&#62;** Printer Connector | Linterfacelist of patient post the information about the patient to printer device that user want print them. | connecting device |  
|Page Maker **&#60;&#45;&#45;&#62;** Interfacepage | Page Maker prepares the Interface Page to showing for user | prepare |  




|**Concepts Association  for UC-11** |	                                            |                     |    
|:-------------------------|:-------------------------------------------------------|:--------------------|   
|**Concept pairs**         | **Association description**                            |**Association Name** |  
|interface page **&#60;&#45;&#45;&#62;** Operation | Interface page load to see the form and doing operation(edit, print , save, and so on) | Doing operation |  
|Operation **&#60;&#45;&#45;&#62;** registerNewCall | Operation passes the request to registerNewCall for reserving the ambulance. | ReserveNewAmbulance |  
|Contorller **&#60;&#45;&#45;&#62;** massage | Massage show a massage that the ambulance is free | massage |  
|registerNewCall **&#60;&#45;&#45;&#62;** CheckInputValue | The input value check by the check input value | CheckingValue |  
|rgisterNewCall **&#60;&#45;&#45;&#62;** save | After the checking the input value the form  save in the database. | Save info |  
|Contorller **&#60;&#45;&#45;&#62;** CheckInputValue | Controller control the CheckInputValue | Receives |  
|Page Maker **&#60;&#45;&#45;&#62;** Interfacepage | Page Maker prepares the Interface Page to showing for user | prepare |  


|**Concepts Association  for UC-12** |	                                            |                     |    
|:-------------------------|:-------------------------------------------------------|:--------------------|   
|**Concept pairs**         | **Association description**                            |**Association Name** |  
|registration form of doctor **&#60;&#45;&#45;&#62;** CheckInputValue | registration form of doctor post the registration form to Check Input Value for checking. | checking |  
|CheckInputValue **&#60;&#45;&#45;&#62;** Operation | Valid data post to operation | receive |  
|Save **&#60;&#45;&#45;&#62;** Storage Data | Storing data in the database | storing data |  
|InterfaceListOfPersonals **&#60;&#45;&#45;&#62;** Printer Connector | The list of Personals post to printer for printing. | printer connector |  
|Page Maker **&#60;&#45;&#45;&#62;** Interfacepage | Page Maker prepares the Interface Page to showing for user | prepare |  


|**Concepts Association  for UC-13** |	                                            |                     |    
|:-------------------------|:-------------------------------------------------------|:--------------------|   
|**Concept pairs**         | **Association description**                            |**Association Name** |  



|**Association  for UC-14** |	                                                    |                     |    
|:-------------------------|:-------------------------------------------------------|:--------------------|   
|**Concept pairs**         | **Association description**                            |**Association Name** |  



|**Concepts Association  for UC-15** |	                                            |                     |    
|:-------------------------|:-------------------------------------------------------|:--------------------|   
|**Concept pairs**         | **Association description**                            |**Association Name** |  



|**Concepts Association  for UC-16** |	                                            |                     |    
|:-------------------------|:-------------------------------------------------------|:--------------------|   
|**Concept pairs**         | **Association description**                            |**Association Name** |  





**&#60;&#45;&#45;&#62;**