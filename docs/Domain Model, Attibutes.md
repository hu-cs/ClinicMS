# Domain Model #

|						   |	Responsibility for UC-6				      |				   	        |    
|:------------------------------------------------------------------------|:----:|:-----------------|     
|Responsibility Description                               				  | Type |Concept Name      |  
|Rs1. Coordinates actions of concepts associated with the searchAndSort use case and delegate the work to other concepts.						  | D    Controller |  
|Rs2. Authenticate user by prompting user to enter password, the system   |  D   |                  |
checks for validity (from UC-1, step 1) 								  |  D   |UserAuthenticator |
Rs3. Render the retrieved records into an HTML document for sending to 
actor’s Web browser for display.										  |  D     |Page Maker						  |
Rs4. HTML document that shows the actor the current context, what 
actions can be done, and outcomes of the previous actions	K	Interface Page
Rs5. Make a database query possible for actor’s conditional search and retrieve records from database.	D	DBConnector
Rs7. user specifies the search conditions and submits for obtaining a list of records	D	QueryFilter
Rs8. Make possible for users to sort the rendered list by identified field of records	D	ResultSorter
