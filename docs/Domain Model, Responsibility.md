# Domain Model #

|						   	**Responsibility for UC-6**				      |		 |      		   	|    
|:------------------------------------------------------------------------|:----:|------------------|   
|Responsibility Description                               				  | Type |Concept Name      |  
|Rs1. Coordinates actions of concepts associated with the searchAndSort 
use case and delegate the work to other concepts.						  | D   | Controller       |  
|Rs2. Authenticate user by prompting user to enter password, the system   | D  |                  |  
checks for validity (from UC-1, step 1) 								  | D  |UserAuthenticator |  
Rs3. Render the retrieved records into an HTML document for sending to 
actor’s Web browser for display.										  | D |Page Maker |  
Rs4. HTML document that shows the actor the current context, what 
actions can be done, and outcomes of the previous actions				|K	|Interface Page|   
Rs5. Make a database query possible for actor’s conditional search and retrieve records from database.	| D	|DBConnector|  
Rs7. user specifies the search conditions and submits for obtaining a list of records|	D	|QueryFilter|  
Rs8. Make possible for users to sort the rendered list by identified field of records|	D	|ResultSorter|  


|						  	**Responsibility for UC-7**				      |		 | 	                |    
|:------------------------------------------------------------------------|:----:|------------------|   
|**Responsibility Description**                               		      | **Type** |**Concept Name** |  
Rs1. Coordinates actions of concepts associated with the ReservingVisitTime use case and orchestrate the work of other concepts.	| D	| Controller |   
Rs2. Rs2. Authenticate user by prompting user to enter password, the system checks for validity (from UC-1, step 1)| D | UserAuthenticator|  
Rs3. Render the requested page into an HTML document for sending to actor’s Web browser for display.| D |	Page Maker |
Rs4. HTML document that shows the actor, print and time saver, new Form, and archive button actions.| K	|Interface Page|  
Rs5. Give actor the possibility  to reserve a time	| D	| TimeReserver |   
Rs6. Print the receipt (from UC-4, step 4)	| D	| RecieptPrinter |  
Rs7. Give the Initiator possibility to types all requirements fields | D | Form |  
Rs8. Notify the Receptionist if any requirement field is blank or success of form saved if time is not reserved before	| D |	Notifier |
Rs9. Make a database query possible for actor’s conditional search and retrieve records from database.	| D	| DBConnector|  
Rs10. Archive the requested receipt in the database and assign it a tracking (id) number	| D | Archiver |  
Rs11. user specifies the search conditions and submits for obtaining a list of records (from UC-6, step 4)	| D | QueryFilter |  
Rs12. Make possible for users to sort the rendered list by identified field of records (from UC-6, step 3)|	D | ResultSorter|  
Rs13. Make receptionist able to delete receipt form database (from UC-3, step 1)	| D	| Remover|  


|						   |	**Responsibility for UC-7**				  |				   	        |    
|:------------------------------------------------------------------------|:----:|------------------|   
|**Responsibility Description**                               				  | **Type** |**Concept Name**      |  
|Rs1. Coordinates actions of concepts associated with the ReceiptPatient&Receipt use case and delegate the work to other concepts.|	D |Controller|  
Rs2. Authenticate user by prompting user to enter password, the system checks for validity (from UC-1, step 1)| D | UserAuthenticator |  
Rs3. Render the retrieved records into an HTML document for sending to actor’s Web browser for display.| D | Page Maker |
Rs4. HTML document that shows the actor, like print and register, new Form, and achieve button actions.| K| InterfacePage |  
Rs5. Print the recipe and patient list (from UC-4)	| D| RecieptPrinter|  
Rs6. Make a database query possible for actor’s conditional search and retrieve records from database.| D | RegisterForm |  
Rs7. Responsible form deleting recipe (from UC-3)	| D |Remover |   
Rs8. Notify the Receptionist if any requirement field is blank or success of form saved| D |Notifier|  
Rs9. Make a database query possible for actor’s conditional search and retrieve records from database.| D | DBConnector|  
Rs10.Archive the request in the database and assign it a tracking number (from UC-2)| D| Archiver |  
Rs11.delete the request from database and delete tracking number (from UC-5)| D |Editor | 
Rs12. Make possible for users to sort the rendered list by identified field of records(from UC-6)| D | ResultSorter |  








