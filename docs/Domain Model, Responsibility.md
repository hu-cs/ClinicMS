# Domain Model #

|						   	**Responsibility for UC-0.1**				  |		      |      		   	 |    
|:------------------------------------------------------------------------|:---------:|------------------|   
|**Responsibility Description**                               			  | **Type** |**Concept Name**   |  
|Coordinate actions of all concepts associated with a use case, a logical grouping of use cases, or the entire system and delegate the work to other concepts. | D | Controller |  
|Container for new user’s authentication data, password, userName, accessibilities.| K | NewIdentityEntry |  
|Verify whether or not the key-code entered by the user is valid.| D | IdentityChecker |  
|HTML document that shows the others user in system. | K| interfacePage |  
|Render the retrieved records into an HTML document for sending to actor’s Web browser for display.	| D | pageMaker |  
|Add the checked identities in the database as new user	| D	| AddUser |   
|It specify the sample of identity and contains identity as object| K |Identity |  
|Prepare a database query that best matches the actor’s search criteria and retrieve the records from the database | D |DBconnection |  
   
   
|						   	**Responsibility for UC-0.2**				  |		      |      		   	 |    
|:------------------------------------------------------------------------|:---------:|------------------|   
|**Responsibility Description**                               			  | **Type** |**Concept Name**   |  
|Coordinate actions of all concepts associated with a use case, a logical grouping of use cases, or the entire system and delegate the work to other concepts. | D | Controller |  
|Container for user’s authentication data, such as password,userName, and accessibilities. | K | RemoveExpiredIdentity |  
|Remove the selected user form database | D | RemoveUser |  
|Prepare a database query that best matches the actor’s search criteria and retrieve the records from the database| D | DB connection |
|Render the retrieved records into an HTML document for sending to actor’s Web browser for display.	| D	|PageMaker |  
|HTML document that shows the others user in system.| K	| InterfacePage |  
    
   
|						   	**Responsibility for UC-1**			     	  |		      |      		   	 |    
|:------------------------------------------------------------------------|:---------:|------------------|   
|**Responsibility Description**                               			  | **Type** |**Concept Name**   |  
|Coordinate actions of all concepts associated with a use case, a logical grouping of use cases, or the entire system and delegate the work to other concepts. | D | Controller |
|Container for user’s authentication data, such as password, Username. | K | IdentityEntry |  
|HTML document that shows the others user in system. | K | interfacePage |  
|Checks which the entry identities are valid or invalid	| K	| identityChecker |  
|According to kind of users accessibilities enables the accessible subsystem	| D	| EnableSubs |  
|Render the retrieved records into an HTML document for sending to actor’s Web browser for display.	| D	| pageMaker |  
|Save the valid user in the database | D | IdentityStorage |  
|It specify the sample of identity and contains identity as object | K | identity | 
   

|						   	**Responsibility for UC-2**			     	  |		      |      		   	 |    
|:------------------------------------------------------------------------|:---------:|------------------|   
|**Responsibility Description**                               			  | **Type** |**Concept Name**   |  
|Rs1. Page make should have made the page for save | K | Page maker |  
|Rs2.The result should be get it from the different (UCS) | D | Getter |  
|Rs3.The parameter should be added to database	| D	| Saver |  
|Rs4.The page shows the content of the page	| K	| Interface page  |  
|Rs5.The page that shows the content to be saved | K | Interface page |  
|Rs6.The interface page that get parameters or edits | K | Interface page |  
|Rs7.The saver will right to database.	| D	| Writer to dbs |  
|Rs8.The holder for the contents | K | Holder |  
|Rs9.Controller where to write the contents	| D	| controller |  

|						   	**Responsibility for UC-3**			     	  |		      |      		   	 |    
|:------------------------------------------------------------------------|:---------:|------------------|   
|**Responsibility Description**                               			  | **Type** |**Concept Name**   |  
|Rs1. checker for the files to be deleted | D | Checker |  
|Rs2. the content of the page must be made. Or updated. | D	| Updater |  
|Rs3. Shows a confirmation page for delete | K | Int page |  
|Rs4. Find the object and delete	| D	| deleter |  


|						   	**Responsibility for UC-4**			     	  |		      |      		   	 |    
|:------------------------------------------------------------------------|:---------:|------------------|   
|**Responsibility Description**                               			  | **Type** |**Concept Name**   |  
|Rs1. Content must be known to print	| K	| Interface page |  
|Rs2. Container to hold the data for print.	| K	| Data holder |  
|Rs3. Make decision to print what | D | Decision maker |  
|Rs4. Send request for print	| D	| Requester |  


|						   	**Responsibility for UC-5**			     	  |		      |      		   	 |    
|:------------------------------------------------------------------------|:---------:|------------------|   
|**Responsibility Description**                               			  | **Type** |**Concept Name**   |  
|Rs1. Container for data	| K	| Data holder |  
|Rs2. Page maker to show the content interface page	| K | Page maker |  
|Rs3. Connector to database.	| D	| Connector |  
|Rs4. Editor change the disable to editable. | D	| Editor |  
|Rs5. Edits the page in database	| D	| Editor | 
|Rs6. Checks if the data has been changed | D | checker |  



|						   	**Responsibility for UC-6**				      |		      |      		   	 |    
|:------------------------------------------------------------------------|:---------:|------------------|   
|**Responsibility Description**                               			  | **Type** |**Concept Name**   |  
|Rs1. Coordinates actions of concepts associated with the searchAndSort use case and delegate the work to other concepts.| D | Controller | 
|Rs2. Authenticate user by prompting user to enter password,the system checks for validity (from UC-1, step 1) | D | UserAuthenticator |  
|Rs3. Render the retrieved records into an HTML document for sending to actor’s Web browser for display. | D |Page Maker |  
|Rs4. HTML document that shows the actor the current context, what actions can be done, and outcomes of the previous actions | K |Interface Page| 
|Rs5. Make a database query possible for actor’s conditional search and retrieve records from database.	| D	|DBConnector|  
|Rs7. user specifies the search conditions and submits for obtaining a list of records|	D |QueryFilter|  
|Rs8. Make possible for users to sort the rendered list by identified field of records|	D |ResultSorter|  
   
   
|						  	**Responsibility for UC-7**				      |		 | 	                |    
|:------------------------------------------------------------------------|:----:|------------------|   
|**Responsibility Description**                               		      | **Type** |**Concept Name** |  
|Rs1. Coordinates actions of concepts associated with the ReservingVisitTime use case and orchestrate the work of other concepts.	| D	| Controller |   
|Rs2. Rs2. Authenticate user by prompting user to enter password, the system checks for validity (from UC-1, step 1)| D | UserAuthenticator|  
|Rs3. Render the requested page into an HTML document for sending to actor’s Web browser for display.| D |	Page Maker |
|Rs4. HTML document that shows the actor, print and time saver, new Form, and archive button actions.| K	|Interface Page|  
|Rs5. Give actor the possibility  to reserve a time	| D	| TimeReserver |   
|Rs6. Print the receipt (from UC-4, step 4)	| D	| RecieptPrinter |  
|Rs7. Give the Initiator possibility to types all requirements fields | D | Form |  
|Rs8. Notify the Receptionist if any requirement field is blank or success of form saved if time is not reserved before	| D |	Notifier |
|Rs9. Make a database query possible for actor’s conditional search and retrieve records from database.	| D	| DBConnector|  
|Rs10. Archive the requested receipt in the database and assign it a tracking (id) number	| D | Archiver |  
|Rs11. user specifies the search conditions and submits for obtaining a list of records (from UC-6, step 4)	| D | QueryFilter |  
|Rs12. Make possible for users to sort the rendered list by identified field of records (from UC-6, step 3)|	D | ResultSorter|  
|Rs13. Make receptionist able to delete receipt form database (from UC-3, step 1)	| D	| Remover|  
   
   
|						   	**Responsibility for UC-8**				      |		 | 		   	        |    
|:------------------------------------------------------------------------|:----:|------------------|   
|**Responsibility Description**                               			  | **Type** |**Concept Name** |  
|Rs1. Coordinates actions of concepts associated with the ReceiptPatient&Receipt use case and delegate the work to other concepts.|	D |Controller|  
|Rs2. Authenticate user by prompting user to enter password, the system checks for validity (from UC-1, step 1)| D | UserAuthenticator |  
|Rs3. Render the retrieved records into an HTML document for sending to actor’s Web browser for display.| D | Page Maker |
|Rs4. HTML document that shows the actor, like print and register, new Form, and achieve button actions.| K| InterfacePage |  
|Rs5. Print the recipe and patient list (from UC-4)	| D| RecieptPrinter|  
|Rs6. Make a database query possible for actor’s conditional search and retrieve records from database.| D | RegisterForm |  
|Rs7. Responsible form deleting recipe (from UC-3)	| D |Remover |   
|Rs8. Notify the Receptionist if any requirement field is blank or success of form saved| D |Notifier|  
|Rs9. Make a database query possible for actor’s conditional search and retrieve records from database.| D | DBConnector|  
|Rs10.Archive the request in the database and assign it a tracking number (from UC-2)| D| Archiver |  
|Rs11.delete the request from database and delete tracking number (from UC-5)| D |Editor | 
|Rs12. Make possible for users to sort the rendered list by identified field of records(555from UC-6)| D | ResultSorter |  

|						   	**Responsibility for UC-9**				      |		 | 		   	        |    
|:------------------------------------------------------------------------|:----:|------------------|   
|**Responsibility Description**                               			  | **Type** |**Concept Name** |  
|Coordinate actions of concepts associated with this use case . | D | Controller |  	
|It should Scan our records and get photo. | D | Scanner and Camera Connection |  	                                                      |This is specify a storage container for info and can easy retrieve records and do search, edit ,delete ...operation. | D | Database Connection |  
|it responsible for printing records | D | printer Connection |  
|To add or remove personal. Manage system about the shift and salaries of personals. | K | Admin |  
|Form specifying the search parameters from database. | K | Search Request |   
|To add ,Sort ,remove and edit personals | K | Operation |  
|it responsible for checking password value that it is correct or no .if it is not correct do not allow to user login | K | check identity login |  
|Shows interface or make views | K | Interface |  
 

|						   	**Responsibility for UC-10**				      |		 | 		   	        |    
|:------------------------------------------------------------------------|:----:|------------------|   
|**Responsibility Description**                               			  | **Type** |**Concept Name** |  
|Coordinate actions of concepts associated with this use case . | D | Controller |  
|This operation check the input value is valid or no  ,if not valid , Do not allow put invalid value | D | Value checker |  
|This is specify a storage container for info and can easy retrieve records  ,and do search, edit ,delete ...operation. | D | Database Connection |  
|it responsible for printing records | D | printer Connection |  
|To print the test result sheet and save information of test in database. | D | Lab staff |  
|This form get information about patient. | K | patient |  
|Form specifying the search parameters from database. | K | Search Request |  
|To add, Sort, remove and edit personals | K | Delete ,edit and Sort request |  
|it responsible for checking password value that it is correct or no .if it is not correct do not allow to user login | K | check identity login |  
 


|						   	**Responsibility for UC-11**				      |		 | 		   	        |    
|:------------------------------------------------------------------------|:----:|------------------|   
|**Responsibility Description**                               			  | **Type** |**Concept Name** |  
|Coordinate actions of concepts associated with this use case . | D | Controller |  
|This operation check the input value is valid or no ,Do not allow put invalid value | D | Value checker |  
|This is specify a storage container for info and can easy retrieve records  ,and do search, edit ,delete ...operation. | D | Database Connection |  
|it responsible for printing records | D | printer Connection |  
|To Reserve an ambulance | D | Receptionist |  
|This form get information about patient . | K | patient |  
|Form specifying the search parameters from database. | K | Search Request |  
|To add ,S ort ,remove and edit personals | K | Delete ,edit and Sort request |  
|it responsible for checking password value that it is correct or no .if it is not correct do not allow to user login | K | 
 check identity login |  




|						   	**Responsibility for UC-12**				      |		 | 		   	        |    
|:------------------------------------------------------------------------|:----:|------------------|   
|**Responsibility Description**                               			  | **Type** |**Concept Name** |  
|Rs1. User must be authenticating with check identifier. | D | Check Identifier |  
|Rs2. Receptionist clicks on operation list link. To see the list of operation | K | View list |  
|Rs3. Receptionist clicks on operation list link. To see the list of operation | D | Opening  |
|Rs4. receptionist can delete, print, edit, search and sort| D | changer |  
|Rs5. Receptionist click on the add new operation link| D | new link |  
|Rs6. System opens the window of form to fill it. | D | opening form |  
|Rs7. receptionist fills the form with valid value a. (b) Press the save button. | K | checking valid value |  
|Rs8. a) System saves the information in database. (b) shows a message (saved successfully) | D | saving|  


|						   	**Responsibility for UC-13**				      |		 | 		   	        |    
|:------------------------------------------------------------------------|:----:|------------------|   
|**Responsibility Description**                               			  | **Type** |**Concept Name** |  
|Rs1.  Check the user for authenticating , user shoud enter valid id. | K |  check identify |  
|Rs2. List the parturition for Receptionist to see the list of parturition. | D | listing |  
|Rs3. changer can delete, print, edit, search and sort. | D | changer |  
|Rs4. new link show new parturition link for chossing | K | show new link |  
|Rs5. open the form for filling | D | open the form | D | open the form |  
|Rs6. fill the form with valid value and saving the form | D | fill the form |  
|Rs7. save the information in database and showing a massage of successful action | D | saving |  


|						   	**Responsibility for UC-14**				      |		 | 		   	        |    
|:------------------------------------------------------------------------|:----:|------------------|   
|**Responsibility Description**                               			  | **Type** |**Concept Name** |  
|Rs1. Check the user for authenticating, user should enter valid id.| D | Check identity |  
|Rs2. show the list of BedResevation and Receipt. | D | Show list |  
|RS3. the changer can delete, print, edit, search and sort. | D | Changer |   
|Rs4. Receptionist click on the, add reserving bed link.  | D | Adding |  
|Rs5. open the window for view of form to fill and show massage that beds are free for reserving. | D | show form|  
|Rs6. Check the valid value and finally save the result. | D | saving |  
|Rs7. know that the result must be save in database.| K | database |  
|Rs8. show a warning message if the time of reservation finishes about any bed. | K | warning massage |  



|						  	**Responsibility for UC-15**				  |		 | 	                |    
|:------------------------------------------------------------------------|:----:|------------------|   
|**Responsibility Description**                               		      | **Type** |**Concept Name** |  
|RS1.Coordinate actions of all concepts associated with a use case, a logical grouping of use cases, or the entire system and delegate the work to other concepts.| D | Controller |  
|RS2.Container for new sale accessibilities. | K | New Identity Entry |  
|RS3. Verify whether or not the key-code entered by the user is valid. | D |Identity Checker |  
|RS4. HTML document that shows the register drugs in system. | K | Interface Page |  
|RS5. Render the retrieved records into an HTML document for sending to actor’s Web browser for display. | D | Page Maker |  
|RS6. Add the checked identities in the database as new sale. | D | new sale |  
|RS7. It specify the sample of identity and contains identity as object | K	| Identity |   
|RS8. Prepare a database query that best matches the actor’s search criteria and retrieve the records from the database	| D	| DB connection|  


|						  	**Responsibility for UC-16**				  |		 | 	                |    
|:------------------------------------------------------------------------|:----:|------------------|   
|**Responsibility Description**                               		      | **Type** |**Concept Name** |  
|RS1.Coordinate actions of all concepts associated with a use case, a logical grouping of use cases, or the entire system and delegate the work to other concepts.| D | Controller |   
|RS2.Container for add new item accessibilities. | K | New Identity Entry |  
|RS3. Verify whether or not the key-code entered by the user is valid. | D | Identity Checker |  
|RS4. HTML document that shows the register drugs in system.	              K	Interface Page
|RS5. Render the retrieved records into an HTML document for sending to actor’s Web browser for display. | D | Page Maker |  
|RS6. Add the checked identities in the database as add new item. | D | new sale |  
|RS7. It specify the sample of identity and contains identity as object | K	| Identity |  
|RS8. Prepare a database query that best matches the actor’s search criteria and retrieve the records from the database	| D	| DB connection |  


|						  	**Responsibility for UC-17**				  |		 | 	                |    
|:------------------------------------------------------------------------|:----:|------------------|   
|**Responsibility Description**                               		      | **Type** |**Concept Name** |  
|RS1.Coordinate actions of all concepts associated with a use case, a logical grouping of use cases, or the entire system and delegate the work to other concepts. | D | Controller |  
|RS2.Container for add new record of salary accessibilities. | K | New Identity Entry |  
|RS3. Verify whether or not the key-code entered by the user is valid. | D	|Identity Checker |  
|RS4. HTML document that shows the table of personals salaries | K	| Interface Page |  
|RS5. Render the retrieved records into an HTML document for sending to actor’s Web browser for display. | D | Page Maker |  
|RS6. Add the checked identities in the database as add new record of salary. | D | new sale |  
|RS7. It specify the sample of identity and contains identity as object. | K | Identity |   
|RS8. Prepare a database query that best matches the actor’s search criteria and retrieve the records from the database	| D	 | DB connection  |  











