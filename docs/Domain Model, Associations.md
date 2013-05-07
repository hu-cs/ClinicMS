
# Association for Use Cases #


|**Association  for UC-0.1** |	                                                    |                     |    
|:-------------------------|:-------------------------------------------------------|:--------------------|   
|**Concept pairs**         | **Association description**                            |**Association Name** |  
|Controller **&#60;&#45;&#45;&#62;** NewIdentityEntry	|controller Send the new entry identity to add to system  | recieves |  
|Controller **&#60;&#45;&#45;&#62;** interfacePage	| Controller participate in preparation of interface  | Post | 
|pageMaker **&#60;&#45;&#45;&#62;** interfacePage	pageMaker prepares the interface Page	| Prepares |   
|Controller **&#60;&#45;&#45;&#62;** pageMaker | Controller passes requests to Page Maker and receives back pages prepared for displaying |Convey request|
|identityChecker **&#60;&#45;&#45;&#62;** AddUser | Retrieves valid identities to check the entry identity and which one is. |add valid identity |  
|identityChecker **&#60;&#45;&#45;&#62;** identity	| Verify the kind of identity | Verify |  
|Controller **&#60;&#45;&#45;&#62;** identity | Control of kind of identity and use when it is need	| Obtain |  
|pageMaker **&#60;&#45;&#45;&#62;** DBconnection |Obtain need data from database to load on page | Provides Data |  



|**Association  for UC-0.2** |	                                                    |                     |    
|:-------------------------|:-------------------------------------------------------|:--------------------|   
|**Concept pairs**         | **Association description**                            |**Association Name** |
|Controller **&#60;&#45;&#45;&#62;** RemoveIdentityEntry | Send the entry identity to remove from system to controller 	| recieves |  
|Controller **&#60;&#45;&#45;&#62;** interfacePage |Controller participate in preparation of interface | Post |   
|pageMaker **&#60;&#45;&#45;&#62;** interfacePage |pageMaker prepares the interface Page	| Prepares |  
|Controller **&#60;&#45;&#45;&#62;** pageMaker |Controller passes requests to Page Maker and receives back pages prepared for displaying | Convey request |
|Controller **&#60;&#45;&#45;&#62;** idnetityChecker	| Controller order to check the entry identity and send back the result to controller | Request | 
|pageMaker **&#60;&#45;&#45;&#62;** DBconnection	|Obtain need data from database to load on page	| Provide data |    
|Controller **&#60;&#45;&#45;&#62;** RemoveUser	| Post the expired identity to remove user and remove from system and database | Post expired identity |  



|**Association  for UC-1** |	                                                    |                     |    
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


|**Association  for UC-2** |	                                                    |                     |    
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



|**Association  for UC-3** |	                                                    |                     |    
|:-------------------------|:-------------------------------------------------------|:--------------------|   
|**Concept pairs**         | **Association description**                            |**Association Name** |  
|Actor **&#60;&#45;&#45;&#62;** interface page |Inputs data |	Get input |   
|Interface Page **&#60;&#45;&#45;&#62;** delete |Shows the contents to be deleted	| Request |   
Interface page **&#60;&#45;&#45;&#62;** page maker | Page maker makes the page to show in | Updates page |  
Page maker **&#60;&#45;&#45;&#62;** delete | Sends data to delete it . | Send request |  
Delete **&#60;&#45;&#45;&#62;** database deleter | Send request to delete the appropriate data	| request |  


|**Association  for UC-4** |	                                                    |                     |    
|:-------------------------|:-------------------------------------------------------|:--------------------|   
|**Concept pairs**         | **Association description**                            |**Association Name** |  
|Interface page **&#60;&#45;&#45;&#62;** 	checker | Sends and receives data from actor	Show data & input
|Interface page **&#60;&#45;&#45;&#62;** controller |Controls the data for the specific operation	| Control |
|Data holder **&#60;&#45;&#45;&#62;** page maker	Page maker gets data from data holder to show	| Get data |  
|Controller **&#60;&#45;&#45;&#62;** print | send request to print the data.	|Request to print |  
|Controller **&#60;&#45;&#45;&#62;** page maker | Controls the content of the page maker to show	| Control |  
|Dataholder **&#60;&#45;&#45;&#62;** data base | Gets data to hold it from other parts. | holder |  



|**Association  for UC-5** |	                                                    |                     |    
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



|**Association  for UC-6** |	                                                    |                     |    
|:-------------------------|:-------------------------------------------------------|:--------------------|   
|**Concept pairs**         | **Association description**                            |**Association Name** |  



|**Association  for UC-7** |	                                                    |                     |    
|:-------------------------|:-------------------------------------------------------|:--------------------|   
|**Concept pairs**         | **Association description**                            |**Association Name** |  



|**Association  for UC-8** |	                                                    |                     |    
|:-------------------------|:-------------------------------------------------------|:--------------------|   
|**Concept pairs**         | **Association description**                            |**Association Name** |  



|**Association  for UC-9** |	                                                    |                     |    
|:-------------------------|:-------------------------------------------------------|:--------------------|   
|**Concept pairs**         | **Association description**                            |**Association Name** |  



|**Association  for UC-10** |	                                                    |                     |    
|:-------------------------|:-------------------------------------------------------|:--------------------|   
|**Concept pairs**         | **Association description**                            |**Association Name** |  



|**Association  for UC-11** |	                                                    |                     |    
|:-------------------------|:-------------------------------------------------------|:--------------------|   
|**Concept pairs**         | **Association description**                            |**Association Name** |  



|**Association  for UC-12** |	                                                    |                     |    
|:-------------------------|:-------------------------------------------------------|:--------------------|   
|**Concept pairs**         | **Association description**                            |**Association Name** |  



|**Association  for UC-13** |	                                                    |                     |    
|:-------------------------|:-------------------------------------------------------|:--------------------|   
|**Concept pairs**         | **Association description**                            |**Association Name** |  



|**Association  for UC-14** |	                                                    |                     |    
|:-------------------------|:-------------------------------------------------------|:--------------------|   
|**Concept pairs**         | **Association description**                            |**Association Name** |  



|**Association  for UC-15** |	                                                    |                     |    
|:-------------------------|:-------------------------------------------------------|:--------------------|   
|**Concept pairs**         | **Association description**                            |**Association Name** |  



|**Association  for UC-16** |	                                                    |                     |    
|:-------------------------|:-------------------------------------------------------|:--------------------|   
|**Concept pairs**         | **Association description**                            |**Association Name** |  





**&#60;&#45;&#45;&#62;**