# Test Case #

| UC-0.1: addUser          |                                                                    |  
|:-------------------------|:--------------------------------------------------------------------------------|  
| Test-case Identifier:    |TC-0.1                                                    |  
|Use Case Tested: |UC-0.1, main success scenario |  
|Pass/fail Criteria: |The test passes if the user fill the field with correct numeric and alphabetic user name and password and specify accessibilities to subsystem for new user and save it in the database.|  
|Input Data: |Numeric  and alphabetic userName and password|  
|Test Procedure: |Expected Result:|  
|Step 1. Type in an incorrect userName and a valid password |prompts the user to try again |  
|Step 2. Type in the correct userName and password | System accepts the new username and password.|
|Step 3. Identify the accessibilities in system and tick them |User can access to specified subsystem if save and accept by system|  


| UC-0.2: removeUser       |                                                                    |  
|:-------------------------|:--------------------------------------------------------------------------------|  
| Test-case Identifier:    |TC-0.2                                                  |  
|Use Case Tested: | UC-0.2, main success scenario |  
|Pass/fail Criteria: |The test passes if the user selects a username and password that is contained in the database and want to remove it from system or limit its accessibilities.|  
|Input Data: |Numeric  and alphabetic userName and password|  
|Test Procedure:	|Expected Result:|   
|Step 1. Select just name to remove	|prompts the user to select the password which is primary key in database|
|Step 2. Select the name and password to remove	|Press the delete button, system show a warning message (are you sure?), if click ok button, it will remove from system and database|  
|Step 3. Limit the accessibilities	|The user can access to some subsystem which admin identified |   


| UC-1: CheckIdentityLogin |                                                                    |  
|:-------------------------|:--------------------------------------------------------------------------------|  
| Test-case Identifier:      |TC-1                                                    |  
|Use Case Tested: |UC-1, main success scenario|  
|Pass/fail Criteria: |The test passes if the user enters a valid username and password that is contained in the database.|  
|Input Data: |Numeric  and alphabetic userName and password|  
|Test Procedure: |Expected Result:|  
|Step 1. Type in an incorrect userName and a valid password | prompts the user to try again|  
|Step 2. Type in the correct userName and password | System opens and can access to define subsystem to this username and password with admin.|  



| UC-2: Saving             | TC-2                                                                  |  
|:-------------------------|:--------------------------------------------------------------------------------|  
| Test-case Identifier:      |                                                     |  
|Use Case Tested: |UC-2, main success scenario|  
|Pass/fail Criteria: |The test passes if the record is deleted, fails if not deleted.|  
|Input Data: |Numeric, data, texts.|  
|Test Procedure: |Expected Result:|  
|Step 1.fill all the appropriate place with text and appropriate fields. |The empty places must be filled.|  
|Step 2. Click the save button.	|A record must be added to the dbs.|  
|Step 3. Check in database if the record exist.	|You can now see the records in database.|  


| UC-3: Deleting           |                                                                    |  
|:-------------------------|:--------------------------------------------------------------------------------|  
| Test-case Identifier:      |TC-3                                                    |  
|Use Case Tested: |UC-3, main success scenario|  
|Pass/fail Criteria: | The test passes if the record is not exist in database.Fails if exist.|  
|Input Data: |Text , numbers |  
|Test Procedure: |Expected Result:|  
|Step 1. Select a record. |If not selected shows that should select a record.|  
|Step 2. Click delete.	|Press the delete button, system show a warning message (are you sure?), if click ok button, it will remove from system and database. |  

Step 3. The record does not exist in database.	Data doesn’t exist in database.


| UC-4: Printing           |                                                                    |  
|:-------------------------|:--------------------------------------------------------------------------------|  
| Test-case Identifier:      |TC-4                                                    |  
|Use Case Tested:	|UC-4, main success scenario|  
|Pass/fail Criteria: |The test passes if the record is printed, fails if not.|  
|Input Data: |Numbers and texts.| 
|Test Procedure: |Expected Result:|  
|Step 1. Select a form print.|The page must be printed.|  
|Step 2. Click on print button.	|The System prints the form for you.|  


| UC-5: Editing            |                                                                    |  
|:-------------------------|:--------------------------------------------------------------------------------|  
| Test-case Identifier:      |TC-5                                                      |  
|Use Case Tested: |UC-5, main success scenario|  
|Pass/fail Criteria:|The test passes if the record is changed,If not changed than the test fails|  
|Input Data: |Text , numbers|  
|Test Procedure: |Expected Result:|  
|Step 1. Select a record. | If not selected shows that should select a record.|  
|Step 2. Click edit	System will show a new form that is editable. | You can edit any field of your choice. Select the field and edit as you want. Fill in the correct fields.|  

|Step 3. Click ok.	|If not filled correctly, the system will prompt you to fill in the correct field.|  
|Step 4. Correct the field.	|You must now be filled the correct field.|  
|Step5. Click ok. |The field is now changed. And in database it’s changed.|  
|Step6. Check in database.	|If the field is changed, the test is passed else the test fails.|  



| Use Case UC-9: Personals |                                                                                 |  
|:-------------------------|:--------------------------------------------------------------------------------|  
| Test-case Identifier:      |TC-0.9                                                                          |  
|Use Case Tested:	|UC-0.9, main success scenario|  
|Pass/fail Criteria: |A-the test passes if the getting list can be sorted else it fails.| B-The test passes if the admin enter the valid value that we define it in the program. Else the test fail C-the test passes if the getting list can be edit in spacified row.|
|Input Data: |Numeric and alphabetic user Name and password, photo ,Numeric .Alphabetic and for name , family…C-get a List.|  
|Test Procedure: |Expected Result:|  
|Step1:Type invalid value in the form.|prompts the user to try again|  
|Step 2:Type the correct value in the form.| System accepts new personal.|  
|Step 3: Identify the accessibilities in the system and tick them.| User can access to specified subsystem if save and accept by system|  
|Step 3:Type list of value by id| System sort it|  
|Step 4:Type list of value by invalid value	|Prompts the user to try again|  
|Step 5:Type list of value by valid value |System will accept it.
|Step 6: click sort. |The system now should sort.|


| UC-10: Test Info & Result Sheet |                                                                          |  
|:-------------------------|:--------------------------------------------------------------------------------|  
| Test-case Identifier:      |TC-0.10                                                                          |  
|Use Case Tested: |UC-0.10, main success scenario|
|Pass/fail Criteri a: |A-The test passes if the user fill the field with correct numeric and alphabetic user name and password and specify accessibilities to subsystem for new user and save it in the database. B-The test passes if the admin enter the valid value that we define it
In the program. Else the test fail .|  
|Input Data: |Numeric and alphabetic user Name and password, photo ,Numeric and Alphabetic and for name ,family…|  
|Test Procedure:|Expected Result:|  
|Step 1. A-Type in an incorrect User Name and a valid password B-Type invalid value in the form.| A-prompts the user to try again B- prompts the user to try again|  
|Step 2. A-Type in the correct User Name and password B-Type the correct value in the form.	|A-System accepts the new username and password.B-System accepts new personal.|  
|Step 3. Identify the accessibilities in system and tick them	|User can access to specified subsystem if save and accept by system|  

| Use Case UC-11: Ambulance  Reservation |                                                                   |  
|:-------------------------|:--------------------------------------------------------------------------------|  
| Test-case Identifier:      |TC-12                                                                          |  
|Use Case Tested: |UC-0.11, main success scenario|  
|Pass/fail Criteria: |A-The test passes if the user fill the field with correct numeric and alphabetic user name and password and specify accessibilities to subsystem for new user and save it in the database.B-The test passes if the admin enter the valid value that we define it In the program. Else the test fail .The test pass |   
|Input Data: |Numeric and alphabetic user Name and password, photo ,Numeric and Alphabetic for name ,family…|  
|Test Procedure:	|Expected Result:|  
|Step 1. A-Type in an incorrect User Name and a valid password B-Type invalid value in the form.|A-prompts the user to try again B- prompts the user to try again|  



| UC-12: OperationRoom&Receipt |                                                                             |  
|:-------------------------|:--------------------------------------------------------------------------------|  
| Test-case Identifier:      |TC-13                                                                            |  
|Use Case Tested:	UC-12, main success scenario
|Pass/fail Criteria: |The test passes if the user fill the operation form with valid values and save the operation form in database and system show the successfully massage for user.|  
|Input Data: |Numeric  and alphabetic userName and password|  
|Test Procedure: |Expected Result: |
|Step 1. Type invalid values in the form prompts the user to try again|  
|Step 2. Type in the  form with correct Value |System accepts the new registration form |  
|Step 3. Reserve the operation room when the operation room is not ready |System show the error massage.|  
|Step 4.delete the operation room form | System show the massage that form successfully deleted|  
|Step 5. Save the form of OperationRoom	|System show the massage that form successfully saved|  
|Step6.edit the form of OperationRoom  form	|System open new window for editing|  


| UC-13: Parturition Department |                                                                            |  
|:-------------------------|:--------------------------------------------------------------------------------|  
| Test-case Identifier:      |TC-13                                                                          |  
|Use Case Tested:	|UC-13 main success scenario|  
|Pass/fail Criteria: |The test passes if system show the Parturition list window when the user Click on  Parturition list button.  And The test passes if the user fill the operation form with valid values,and save them in database.|  
|Input Data:	|Numeric  and alphabetic values|  
|Test Procedure: |Expected Result:|  
|Step 1. Type invalid values in the form |prompts the user to try again and show that your value is invalid|  
|Step 2. Type in the  form with correct Value |System accepts the new Parturition  form |   
|Step 3. Reserve the Parturition room when the Parturition room is not ready |System show the error massage.|  
|Step 4.delete the Parturition form  |System show the massage that form successfully deleted|  
|Step5 .save the Parturition form |System show the massage that form successfully saved|  
|Step6.edit the form of Parturition form |System open new window for editing|  


| UC-14: Bed Reservation & Receipt |                                                                         |  
|:-------------------------|:--------------------------------------------------------------------------------|  
| Test-case Identifier:      |TC-14                                                                          |  
|Use Case Tested:	UC-1, main success scenario
|Pass/fail Criteria: |The test passes if the system show the add reserving bed link when the  user click on  add reserving bed link  and the form of Bed Reservation and Receipt|    
|Input Data: | Numeric  and alphabetic values|   
|Test Procedure: | Expected Result:|   
|Step 1. Type invalid values in the form |prompts the user to try again show that your value is invalid|  
|Step 2. Type in the correct values	|System accept the request of user|   
|Step 3. Reserve the bed when the bed is not free.	|System show the error massage that the bed is not free.|  
|Step 4.delete the Bed Reservation form |System show the massage that form successfully deleted|  
|Step 5.save the Bed Reservation |System show the massage that form successfully saved|  
|Step 6.edit the form of  Bed Reservation form	| System open new window for editing|  


| UC-15: Selling Drugs     |                                                                                 |  
|:-------------------------|:--------------------------------------------------------------------------------|  
| Test-case Identifier:      |TC-15                                                                            |  
|Use Case Tested:	|UC-15, main success scenario|  
|Pass/fail Criteria: |The test passes if the user fills the field with correct information about first sale and choose drug and number calculate the total price.|  
|Input Data: |Drug name and number of them and their prices.|  
|Test Procedure:	|Expected Result:|  
|Step 1. Type in an invalid drug and valid number | prompts the user to try again |  
|Step 2. Type the drug name but not enter number. | Prompts the user to try again and fill the fields completely.|  
|Step 3.Type the correct drug names and numbers. |System shows a massage (Do you want to save?)user press ok and save in database|  
|Step4.Type a drug name in search area.	|System search the request from the database and shows the result.|  


| UC-17:Accounting         |                                                                                 |  
|:-------------------------|:--------------------------------------------------------------------------------|  
| Test-case Identifier:    |TC-17                                                                            |  
|Use Case Tested: |UC-17, main success scenario|  
|Pass/fail Criteria: |The test passes if the user fills the field with valid values for new record.|
|Input Data:	|Information about section and salary and so on in form.|  
|Test Procedure:	|Expected Result:|  
|Step 1. Filled the fields with invalid values.	|Prompts the user to enter valid values.|  
|Step 2. Filled with valid values and save. 	|System accepts the values and save them in database.|
Step3.Press the graph button. |System shows the graph pages. user can see next or pervious graph. |   


