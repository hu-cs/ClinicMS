#Concept Attributes#

|**Concepts Attribute for UC-0.1** |	                                            |                     |    
|:-------------------------|:-------------------------------------------------------|:--------------------|   
|**Concept name**          | **Attributes**                                        | **Attributes description** |  
|NewIdentityEntry     |userName | Take the new user name and send to controller and identity object|   
|                     | password|Take the new user password and send to controller and identity object |  
|	                  |accessibilities |Take the new user accessibilities to system and send to controller and identity object|  
|AddUser	          | userName	|Use value of this attribute to save in userName attribute of  relation in databasse|  
|                     |password	    |Use value of this attribute to save in password attribute of relation in databasse|  
|                     |accessibilities	|Use value of this attribute to save in attribute of  relation in databasse |  
|Identity	          |userName	|It is as an attribute of identity class to save the name of user|  
|                     |password	|It is as an attribute of identity class to save the password of user|   
|                     |accessibilities	|It is as an attribute of identity class to save the accessibilities of user|  




|**Concepts Attribute for UC-0.2** |	                                            |                     |    
|:-------------------------|:-------------------------------------------------------|:--------------------|   
|**Concept name**          | **Attributes**                                        | **Attributes description** |  
|RemoveExpiredIdentity	 | userName	|User name is use to show who will remove from database|  
||Password	|Use password as a unique key to specify the user correctly|  
||Accessibilities	|Accessibilities specified before |  
|RemoveUser | Password | Use as primary key of relation to delete the expired user from database|  




|**Concepts Attribute for UC-1** |	                                                |                     |    
|:-------------------------|:-------------------------------------------------------|:--------------------|   
|**Concept name**          | **Attributes**                                         | **Attributes description** |  
|IdentityEntry	 | userName	 | User name is use to show it is valid and is in database|  
||	Password | password is use to show it is valid and is in database of a valid user|  
||	Accessibilities	accessibilities is use to show it is valid and is in database of a valid user|  
|identity	     |Password	 |It is as an attribute of identity class to save the password of user|  
||userName	     |It is as an attribute of identity class to save the user name of user|  
||accessibilities |It is as an attribute of identity class to save the accessibilities of user|



|**Concepts Attribute for UC-2** |	                                                |                     |    
|:-------------------------|:-------------------------------------------------------|:--------------------|   
|**Concept name**          | **Attributes**                                        | **Attributes description** |  
|IdentityEntry	 |userName | User name is use to show it is valid and is in database|  
||	Password |password is use to show it is valid and is in database of a valid user|  
||	Accessibilities	|accessibilities is use to show it is valid and is in database of a valid user|  
identity	Password	It is as an attribute of identity class to save the password of user|   
||	userName| It is as an attribute of identity class to save the user name of user|  
||	accessibilities	|It is as an attribute of identity class to save the accessibilities of user|  



|**Concepts Attribute for UC-3** |	                                                |                     |    
|:-------------------------|:-------------------------------------------------------|:--------------------|   
|**Concept name**          | **Attributes**                                        | **Attributes description** |  
|Search |Searcher |Search for records to be deleted.|  
|Delete	| delete	| Takes the parameter to delete and send request to delete.|  
|Data holder |Data 	|Holds data for deleting|  
|Prints	|Print	|Prints the data.|  
|Controller	|Controller	|Checks for appropriate priorities|  



|**Concepts Attribute for UC-4** |	                                                |                     |    
|:-------------------------|:-------------------------------------------------------|:--------------------|   
|**Concept name**          | **Attributes**                                        | **Attributes description** |  
|Search	|Data	|Search data for print.|  
||	Id	It’s good for finding references|  
|Notify	|prCtrl	|Notify that has been printed.|  



|**Concepts Attribute for UC-5** |	                                                |                     |    
|:-------------------------|:-------------------------------------------------------|:--------------------|   
|**Concept name**          | **Attributes**                                        | **Attributes description** |  
|search	|Id	|Search for data to get it.|  
|| data |Make it modifiable or not.|  
|Modifiable	|Ismodifiable |Checks if it’s modifiable or not|  
|To print	|Print	|Prints the data|  
|To save |Save	|Saves the data|  
|To write	|Write	|Writes the data to database|  


|**Concepts Attribute for UC-6** |	                                                |                     |    
|:-------------------------|:-------------------------------------------------------|:--------------------|   
|**Concept name**          | **Attributes**                                        | **Attributes description** |  



|**Concepts Attribute for UC-7** |	                                                |                     |    
|:-------------------------|:-------------------------------------------------------|:--------------------|   
|**Concept name**          | **Attributes**                                        | **Attributes description** |  



|**Concepts Attribute for UC-8** |	                                                |                     |    
|:-------------------------|:-------------------------------------------------------|:--------------------|   
|**Concept name**          | **Attributes**                                        | **Attributes description** |  



|**Concepts Attribute for UC-9** |	                                                |                     |    
|:-------------------------|:-------------------------------------------------------|:--------------------|   
|**Concept name**          | **Attributes**                                        | **Attributes description** |  



|**Concepts Attribute for UC-10** |	                                                |                     |    
|:-------------------------|:-------------------------------------------------------|:--------------------|   
|**Concept name**          | **Attributes**                                        | **Attributes description** |  



|**Concepts Attribute for UC-11** |	                                                |                     |    
|:-------------------------|:-------------------------------------------------------|:--------------------|   
|**Concept name**          | **Attributes**                                        | **Attributes description** |  



|**Concepts Attribute for UC-12** |	                                                |                     |    
|:-------------------------|:-------------------------------------------------------|:--------------------|   
|**Concept name**          | **Attributes**                                        | **Attributes description** |



|**Concepts Attribute for UC-13** |	                                                |                     |    
|:-------------------------|:-------------------------------------------------------|:--------------------|   
|**Concept name**          | **Attributes**                                        | **Attributes description** |



|**Concepts Attribute for UC-14** |	                                                |                     |    
|:-------------------------|:-------------------------------------------------------|:--------------------|   
|**Concept name**          | **Attributes**                                        | **Attributes description** |



|**Concepts Attribute for UC-15** |	                                                |                     |    
|:-------------------------|:-------------------------------------------------------|:--------------------|   
|**Concept name**          | **Attributes**                                        | **Attributes description** |



|**Concepts Attribute for UC-16** |	                                                |                     |    
|:-------------------------|:-------------------------------------------------------|:--------------------|   
|**Concept name**          | **Attributes**                                        | **Attributes description** |



|**Concepts Attribute for UC-17** |	                                                |                     |    
|:-------------------------|:-------------------------------------------------------|:--------------------|   
|**Concept name**          | **Attributes**                                        | **Attributes description** |



