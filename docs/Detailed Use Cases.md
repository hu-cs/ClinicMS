# Detailed Use Cases #


**USE CASE 0: ADMINISTRATING** 

   
| Use Case UC-0            | Administrating                                                                  |  
|:-------------------------|:--------------------------------------------------------------------------------|  
| Related UserStories      |St-1, 6, 7, 11,15, 18, 19, 20                                                    |  
| Initiator                |Admin                                                                            |  
| Participators            |Receptionist, Druggist, LabStuff, Casher, TherausrusStuff                        |   
| Actors goal              |To add delete, edit, users or manage users and system.                           |  
| Preconditions            |He has to be admin, and have to be added as Admin and enter the password.        |  
| Post-conditions          |Will be able to bring changes to the database Or records Or system.              |  
|Flow of Events for Main Success Scenario:|**&#45;&#45;&#45;&#62;** 1. Initiator opens the file &#171;include&#187; identity use case|  
|                          |**&#60;&#45;&#45;&#45;** 2. System asks for authentication.                           |     
|                          |**&#45;&#45;&#45;&#62;** 3. Initiator types the authentication information to be accepted|   
|                          |**&#60;&#45;&#45;&#45;** 4. System opens the windows for the initiator. For controlling. Or editing.|    
|Flow of Events for Extensions (Alternate Scenarios):|**&#45;&#45;&#45;&#62;** 1. If types invalid information       |  
|                          |**&#60;&#45;&#45;&#45;** 2. The system will show a message (type the correct information)|  
|                          |**&#45;&#45;&#45;&#62;** 3. If correct he’s accepted.                                    |  

**USE CASE 1: CHECK IDENTITY LOGIN**   
   
| Use Case UC-1            | Check Identity(Login) (sub use case)                                            |  
|:-------------------------|:--------------------------------------------------------------------------------|  
| Related UserStories      |St-1, 2.                                                                         |  
| Initiator                |Author Credential Database                                                       |  
| Participators            |Admin, Receptionist, Druggist, Lab Stuff, cashier, thesaurus Stuff               |   
| Actors goal              |o authenticate the users                                                         |  
| Preconditions            |The user must have opened the program.                                           |  
| Post-conditions          |The system authenticated the user                                                |  
|Flow of Events for Main Success Scenario:|**&#45;&#45;&#45;&#62;** 1. The user inter his or her own password    |  
|                          |**&#60;&#45;&#45;&#45;** 2. The system checks and if is valid shows a message(valid password)|    
|Flow of Events for Extensions (Alternate Scenarios):|&#45;&#45;&#45;&#62; 1. If types invalid name and passwords.   |  
|                          |**&#60;&#45;&#45;&#45;** 2. The system will redirect to type the correct information |  
|                          |**&#45;&#45;&#45;&#62;** 3. If insert correct ones                                   |   
|                          |**&#60;&#45;&#45;&#45;** 4. user’s accepted.                                         |  

**USE CASE 2: SAVING**  

| Use Case UC-2            | Saving (sub use case)                                                                  |  
|:-------------------------|:--------------------------------------------------------------------------------|  
| Related UserStories      |ST-2,4,6,9,11,21,22,23                                                           |  
| Initiator                |All users but with different accessibility                                       |  
| Participators            |database                                                                         |   
| Actors goal              |To save information                                                              |  
| Preconditions            |Have to fill the field with valid values.                                        |  
| Post-conditions          |Have to press the save button.                                                   |  
|Flow of Events for Main Success Scenario:|**&#45;&#45;&#45;&#62;** 1. Press the new button and new form open|  
|                          |**&#45;&#45;&#45;&#62;** 2. Fill the field with valid values                     |     
|                          |**&#45;&#45;&#45;&#62;** 3. Press the save button                                |   
|                          |**&#60;&#45;&#45;&#45;** 4. The system will save information.                    |   
|                          | 5. &#171;exclude&#187;(control System, Reserve time, receipt patients & receipt, personals, text info & result sheet, Ambulance reservation, operation room & receipt, parturition Department, room reservation & receipt).                                                                                                    |     
|Flow of Events for Extensions (Alternate Scenarios):|**&#45;&#45;&#45;&#62;** 1. Enter invalid value.       |  
|                          |**&#60;&#45;&#45;&#45;** 1.a.the system shows a message (enter valid value)      |   

**USE CASE 3: DELETING**  

| Use Case UC-3            | Deleting (sub use case)                                                         |  
|:-------------------------|:--------------------------------------------------------------------------------|  
| Related UserStories      |ST-2,4,6,9,11,21,22,23                                                           |  
| Initiator                |All users but with different accessibility                                       |  
| Participators            |Database                                                                         |   
| Actors goal              |To delete some information from system.                                          |  
| Preconditions            |User must be logged in.                                                          |  
| Post-conditions          |The information will be deleted from the system.                                 |  
|Flow of Events for Main Success Scenario:|**&#45;&#45;&#45;&#62;** 1. User selects a record and clicks delete.|  
|                          |**&#60;&#45;&#45;&#45;** 2. The system will delete the selected information.       |     
|                          |3.&#171;exclude&#187;(control System, Reserve time, receipt patients & receipt, personals, text info & result sheet, Ambulance reservation, operation room & receipt, parturition Department, room reservation & receipt).                                                                                                    |    
|Flow of Events for Extensions (Alternate Scenarios):|**&#45;&#45;&#45;&#62;** 1. Does not select and record and press the delete button                                                                                            |  
|                          |1 a. the system show a message ( select the record)                               |  

 
**USE CASE 4: PRINTING**  


| Use Case UC-4            | Printing  (sub use case)                                                        |  
|:-------------------------|:--------------------------------------------------------------------------------|  
| Related UserStories      |St-3, 5,7, 16, 23.                                                               |  
| Initiator                |All users                                                                        |  
| Participators            |printer                                                                          |   
| Actors goal              |To print record                                                                  |  
| Preconditions            |User must be logged in and have selected appropriate record.                     |  
| Post-conditions          |The result will be printed for the user.                                         |  
|Flow of Events for Main Success Scenario:|**&#45;&#45;&#45;&#62;** 1. Select records to print or file.      |  
|                          |**&#45;&#45;&#45;&#62;** 2. Wants to print the receipt                           |     
|                          |**&#60;&#45;&#45;&#45;** 3. It’ll print.                                |   
|                          |4. &#171;extend&#187;( control System, Reserve time, receipt patients & receipt, personals, text info & result sheet, Ambulance reservation, operation room & receipt, parturition Department, room reservation & receipt, Selling drugs, thesaurus department, accounting, authenticate user, Personals).                                                                               |     
|Flow of Events for Extensions (Alternate Scenarios):|**&#45;&#45;&#45;&#62;** 1. If the printer is Off than |  
|                          |**&#60;&#45;&#45;&#45;** 2.the system shows an error message (Printer is off).   |   

**USE CASE 5:  EDITING**

| Use Case UC-5            | EDITING                                                                         |  
|:-------------------------|:--------------------------------------------------------------------------------|  
| Related UserStories      |ST-2,4,6,9,11,21,22,23                                                           |  
| Initiator                |All users but with different accessibility                                       |  
| Participators            |Database                                                                         |   
| Actors goal              |Logged in as appropriate person.                                                 |  
| Preconditions            |The will be changed.                                                             |  
| Post-conditions          |The will be changed.                                                             |  
|Flow of Events for Main Success Scenario:|**&#45;&#45;&#45;&#62;** 1. Selects a record for changing.        |  
|                          |**&#60;&#45;&#45;&#45;** 2. Brings windows up with contents and be modifiable.   |     
|                          |3.&#171;extend&#187;( control System, Reserve time, receipt patients & receipt, personals, text info & result sheet, Ambulance reservation, operation room & receipt, parturition Department, room reservation & receipt, Selling drugs, thesaurus department, accounting, authenticate user, Personals).                                                                               |    
|Flow of Events for Extensions (Alternate Scenarios):|**&#45;&#45;&#45;&#62;** 1. If does not select any record|  
|                          |**&#60;&#45;&#45;&#45;** 1 a. system shows a message that select record.          |  
|                          |**&#45;&#45;&#45;&#62;** 2. The user correct the information and press the save button|  
|                          |**&#60;&#45;&#45;&#45;** 3. The system shows a message that saved.               |  


**USE CASE 6: SEARCHING AND SORTING**

| Use Case UC-6            | Searching And Sorting (sub use case)                                            |  
|:-------------------------|:--------------------------------------------------------------------------------|  
| Related UserStories      |ST-2,4,6,9,11,21,22,23                                                           |  
| Initiator                |All users                                                                        |  
| Participators            |Database                                                                         |   
| Actors goal              |To search or sort records.                                                       |  
| Preconditions            |Must be logged in as an appropriate personal.                                    |  
| Post-conditions          |Will give the result of the appropriate search or do the sort.                   |  
|Flow of Events for Main Success Scenario:|**&#45;&#45;&#45;&#62;** 1. Clicks on search box and types for appropriate record name.|  
|                          |**&#60;&#45;&#45;&#45;** 2. The match will be found if any.                      |     
|                          |3.&#171;extend&#187;( control System, Reserve time, receipt patients & receipt, personals, text info & result sheet, Ambulance reservation, operation room & receipt, parturition Department, room reservation & receipt).                  |    
|Flow of Events for Extensions (Alternate Scenarios):|**&#45;&#45;&#45;&#62;** 1. The user enter any identifier in field to search|  
|                          |**&#60;&#45;&#45;&#45;** 1 a. the system shows a message that nothing is found. If cannot find anything.|  

**USE CASE 7: RESERVING VISIT TIME**  


| Use Case UC-7            | EDITING                                                                         |  
|:-------------------------|:--------------------------------------------------------------------------------|  
| Related UserStories      |St-18, 4                                                                         |  
| Initiator                |Receptionist                                                                     |  
| Participators            |Database                                                                         |   
| Actors goal              |To visit time for patients                                                       |  
| Preconditions            |The receptionist must be logged in to reserve time.                              |  
| Post-conditions          |The time will be reserved for specific patient.                                  |  
|Flow of Events for Main Success Scenario:|**&#45;&#45;&#45;&#62;** 1. The initiator click on reserve time &#171;include&#187; identity check login|  
|                          |**&#60;&#45;&#45;&#45;** 2. System opens a window to fill the blanks for information |     
|                          |**&#45;&#45;&#45;&#62;** 3. Initiator types all requirements .(fill in the blanks)   |  
|                          |**&#60;&#45;&#45;&#45;** 4. System pops-up a window (“thank you for using this service)|     
|Flow of Events for Extensions (Alternate Scenarios):|**&#45;&#45;&#45;&#62;** 1. If types invalid information|  
|                          |**&#60;&#45;&#45;&#45;** 2. The system will redirect to type the correct information|  
|                          |**&#45;&#45;&#45;&#62;** 3. If insert correct ones                                |  
|                          |**&#60;&#45;&#45;&#45;** 4. the system shows a message (user ’s accepted).           |  

**USE CASE 8: RECEPTION PATIENTS & RECEIPT**  

| Use Case UC-8            | Reception PATIENTS & RECEIPT                                                          |  
|:-------------------------|:--------------------------------------------------------------------------------|  
| Related UserStories      |ST-8                                                                             |  
| Initiator                |Receptionist                                                                     |  
| Participators            |Printer, database                                                                |   
| Actors goal              |Printing a receipt for patients                                                  |  
| Preconditions            |The receptionist must be logged in.                                              |  
| Post-conditions          |Will have a receipt for visiting doctors.                                        |  
|Flow of Events for Main Success Scenario:|**&#45;&#45;&#45;&#62;** 1. Chooses what to do next, add new patient, or print old one
&#171;include&#187; identity check login(use case)                                                           |  
|                          |**&#60;&#45;&#45;&#45;** 2. Opens a windows to do the job.                       |     
|                          |**&#45;&#45;&#45;&#62;** 3. Type in information. If new if old select one. And choose what to do next.|  
|                          |**&#60;&#45;&#45;&#45;** 4. If print, if edit than edit or several more options. |     
|Flow of Events for Extensions (Alternate Scenarios):|**&#45;&#45;&#45;&#62;** 1. If types invalid information|  
|                          |**&#60;&#45;&#45;&#45;** 2. The system will redirect to type the correct information|  
|                          |**&#45;&#45;&#45;&#62;** 3. If correct he’s accepted.                             |  

**USE CASE 9: PERSONALS**

| Use Case UC-9            | Personals                                                                       |  
|:-------------------------|:--------------------------------------------------------------------------------|  
| Related UserStories      |St-24, 15, 13. 7                                                                 |  
| Initiator                |Admin                                                                            |  
| Participators            |Scanner & Camera database                                                        |   
| Actors goal              |To add new personal. Manage information about the shift and salaries of personals.|  
| Preconditions            |Admin must be logged in                                                           |  
| Post-conditions          |The new personal is added and arranging record about personals.                   |  
|Flow of Events for Main Success Scenario:|**&#45;&#45;&#45;&#62;** 1. &#171;include&#187; Check identity login|                                                           |                          |**&#45;&#45;&#45;&#62;** 2. User clicks on personals |
|                          |**&#60;&#45;&#45;&#45;** 3. A windows will pops up for new files.                 |     
|                          |**&#45;&#45;&#45;&#62;** 4. Will fill the blanks.                                 |  
|                          |**&#45;&#45;&#45;&#62;** 5. Click done button.                                    |     
|Flow of Events for Extensions (Alternate Scenarios):|**&#45;&#45;&#45;&#62;** 1. Insert invalid information  |  
|                          |**&#60;&#45;&#45;&#45;** 1 a. system shows warning message                        |   

**USE CASE 10: TEST INFO & RESULT SHEET**  

| Use Case UC-10           | Test Info & Result Sheet                                                        |  
|:-------------------------|:--------------------------------------------------------------------------------|  
| Related UserStories      |St-8, 1, 23                                                                      |  
| Initiator                |Lab stuff                                                                        |  
| Participators            |Printer & database                                                               |   
| Actors goal              |To print the test result and save information of test in database                |  
| Preconditions            |Lab guy must be logged in and must have selected a patient’s record.             |  
| Post-conditions          |He’ll be able to modify or print the test results.                               |  
|Flow of Events for Main Success Scenario:|**&#45;&#45;&#45;&#62;** 1. Clicks on print to print.&#171;include&#187; identity check login(use case)|   
|                          |**&#60;&#45;&#45;&#45;** 2. The system will print.                               |     
|                          |**&#45;&#45;&#45;&#62;** 3. &#171;exclude&#187; (edit, remove, search and sort, print)(use cases)|     
|Flow of Events for Extensions (Alternate Scenarios):|**&#45;&#45;&#45;&#62;** 1. If he cancel the print process at the middle.|  
|                          |**&#60;&#45;&#45;&#45;** 2. The system will cancel the remaining part of docs.   |  
|                          |**&#45;&#45;&#45;&#62;** 3. If he doesn’t select any record                      |  
|                          |**&#60;&#45;&#45;&#45;** 4. System takes error to select an item.                |   

**USE CASE 11: AMBULANCE RESERVATION**  


| Use Case UC-11           | Ambulance Reservation                                                           |  
|:-------------------------|:--------------------------------------------------------------------------------|  
| Related UserStories      |ST-21.                                                                           |  
| Initiator                |Receptionist                                                                     |  
| Participators            |Database                                                                         |   
| Actors goal              |To Reserve an ambulance. ( I mean call for ambulance )                           |  
| Preconditions            |Must be logged in as a receptionist.                                             |  
| Post-conditions          |Will reserve ambulance and send an ambulance to the area.                        |  
|Flow of Events for Main Success Scenario:|**&#45;&#45;&#45;&#62;** 1. Click on reserve ambulance. &#171;include&#187; identity check |  
|                          |**&#60;&#45;&#45;&#45;** 2. Comes up a window for identification                 |     
|                          |**&#45;&#45;&#45;&#62;** 3. Fill the blanks with information. And click save.    |  
|                          |**&#60;&#45;&#45;&#45;** 4. A message will be given from system.&#171;exclude&#187; (Print, delete, edit, search and sort).|     
|Flow of Events for Extensions (Alternate Scenarios):|**&#60;&#45;&#45;&#45;** 1. If no ambulance is free, system shows a message that no ambulance ready                                                                                                         |  
|                          |**&#45;&#45;&#45;&#62;** 2. If receptionist insert invalid value.                 |  
|                          |**&#60;&#45;&#45;&#45;** 2a. system shows and warning message.                    |  
|                          |**&#45;&#45;&#45;&#62;** 3. Receptionist click the save button.                   |  
|                          |**&#60;&#45;&#45;&#45;** 3a. a message will be shown form system.                 |  


**USE CASE 12: OPERATION ROOM & RECEIPT**


| Use Case UC-12           | OperationRoom&Receipt                                                           |  
|:-------------------------|:--------------------------------------------------------------------------------|  
| Related UserStories      |St-3 , 6 ,22                                                                     |  
| Initiator                |Receptionist                                                                     |  
| Participators            |Database, printer                                                                |   
| Actors goal              |To print a receipt for Operation.                                                |  
| Preconditions            |Must be logged in as receptionist.                                               |  
| Post-conditions          |A receipt will be printed for operation room.                                    |  
|Flow of Events for Main Success Scenario:|**&#45;&#45;&#45;&#62;** 1. &#171;include&#187; identity check login.|  
|                          |**&#60;&#45;&#45;&#45;** Clicks on laboratory test.                              |     
|                          |**&#45;&#45;&#45;&#62;** 3. A windows comes up. That patient. To select type of tests.|  
|                          |**&#60;&#45;&#45;&#45;** 4. Will be printed a receipt for that patient.          |  
|                          |**&#45;&#45;&#45;&#62;** 5.&#171;exclude&#187; (Print, edit, remove, search & sort)|
|Flow of Events for Extensions (Alternate Scenarios):|**&#60;&#45;&#45;&#45;** 1. If not typed to the appropriate place.|  
|                          |**&#45;&#45;&#45;&#62;** 2. A notification will be given to the user for correction.|  

**USE CASE 13: PARTURITION DEPARTMENT**  


| Use Case UC-13           | Parturition Department                                                          |  
|:-------------------------|:--------------------------------------------------------------------------------|  
| Related UserStories      |St-22                                                                            |  
| Initiator                |Receptionist                                                                     |  
| Participators            |Database                                                                         |   
| Actors goal              |To add new Patients for parturition department.                                  |  
| Preconditions            |Logged in as receptionist.                                                       |  
| Post-conditions          |The patient will be registered for the parturition department.                   |  
|Flow of Events for Main Success Scenario:|**&#45;&#45;&#45;&#62;** 1. &#171;include&#187; identity check login.|  
|                          |**&#60;&#45;&#45;&#45;** 2. Pops up a window for entering info.                  |     
|                          |**&#45;&#45;&#45;&#62;** 3. Type in contents click don or print a receipt.       |  
|                          |**&#60;&#45;&#45;&#45;** 4. The done message or thank you message.               |  
|                          |**&#45;&#45;&#45;&#62;** 5.&#171;exclude&#187; (Print, edit, remove, search & sort)|
|Flow of Events for Extensions (Alternate Scenarios):|**&#60;&#45;&#45;&#45;** 1. If wrong input.            |  
|                          |**&#45;&#45;&#45;&#62;** 2. Notify user for correct input.                       |  


**USE CASE 14: Bed RESERVATION & RECEIPT**  

| Use Case UC-14           | BedResevation&Receipt                                                           |  
|:-------------------------|:--------------------------------------------------------------------------------|  
| Related UserStories      |ST-14                                                                            |  
| Initiator                |Receptionist                                                                     |  
| Participators            |Database                                                                         |   
| Actors goal              |To reserve a bed to patient                                                      |  
| Preconditions            |The receptionist has to check that there are unreserved bed                      |  
| Post-conditions          |Reserve the bed to patient and print a receipt about the bed and give it to patient.|  
|Flow of Events for Main Success Scenario:|**&#45;&#45;&#45;&#62;** 1. The receptionist sees the system that how many beds are free.|  
|                          |**&#60;&#45;&#45;&#45;** 1a. the system shows how many are free                     |     
|                          |**&#45;&#45;&#45;&#62;** 2.the receptionist fill the form about the bed and press the save button|  
|                          |**&#60;&#45;&#45;&#45;** 2a.the system saves the information in the database.    |   
|                          |**&#60;&#45;&#45;&#45;** 2b.the system shows a message that the information saved|  
|                          |**&#45;&#45;&#45;&#62;** 2c. The receptionist press the print button.           |  
|                          |**&#60;&#45;&#45;&#45;** 2d. The system will print the receipt to patient.      |       
|Flow of Events for Extensions (Alternate Scenarios):|**&#45;&#45;&#45;&#62;** 1. If receptionist wants to reserve without checking the free beds.|  
|                          |**&#60;&#45;&#45;&#45;** 1a. the system shows a message that no bed is free.    |    
|                          |**&#60;&#45;&#45;&#45;** 1b. shows the nearest bed that will become free.       |  

**USE CASE 15: SELLING DRUGS**  


| Use Case UC-15           | Test Info & Result Sheet                                                        |  
|:-------------------------|:--------------------------------------------------------------------------------|  
| Related UserStories      |St 6 , 9, 10,                                                                    |  
| Initiator                |Druggist                                                                         |  
| Participators            |Barcode reader.                                                                  |   
| Actors goal              |To Sell Drugs. Counts how many doses has been sold.                              |  
| Preconditions            |The druggist must be logged in.                                                  |  
| Post-conditions          |A new information is added to the database that the medicine has been sold.      |  
|Flow of Events for Main Success Scenario:|**&#45;&#45;&#45;&#62;** 1. Clicks on print to print.&#171;exclude&#187; identity check login(use case)|   
|                          |**&#60;&#45;&#45;&#45;** 2. The system will print.                               |     
|                          |**&#45;&#45;&#45;&#62;** 3. &#171;exclude&#187; (edit, remove, search and sort, print)(use cases)|     
|Flow of Events for Extensions (Alternate Scenarios):|**&#45;&#45;&#45;&#62;** 1. If the driver or barcode reader doesn’t work. Can type manually.|  
|                          |**&#45;&#45;&#45;&#62;** 2. Pops up a windows to choose the drug for sale.       |  
|                          |**&#60;&#45;&#45;&#45;** 3. Press a button for acceptance.                       |   

**USE CASE 16: THESAURUS DEPARTMENT**  

| Use Case UC-16           | ThesaurusDepartment                                                             |  
|:-------------------------|:--------------------------------------------------------------------------------|  
| Related UserStories      |ST-12, 3, 16                                                                     |  
| Initiator                |Thesaurus Stuff.                                                                 |  
| Participators            |database                                                                         |   
| Actors goal              |Mine and store arrangement                                                       |  
| Preconditions            |To Add new Information to database.
Must have new information, ex: have bought a new medicine that is not                                        |  
| Post-conditions          |included in database.
The new Item is added to the database for Use.                                                               |  
|Flow of Events for Main Success Scenario:|**&#45;&#45;&#45;&#62;** 1. Opens the login.                      |  
|                          |**&#60;&#45;&#45;&#45;** 2. System show a windows to type the need credentials for login|     
|                          |**&#45;&#45;&#45;&#62;** 3. Fills the blank and types the credentials.           |  
|                          |**&#60;&#45;&#45;&#45;** 4. &#171;exclude&#187; use Case14 (check identity)      |   
|                          |**&#45;&#45;&#45;&#62;** 2b.the system shows a message that the information saved|  
|                          |**&#45;&#45;&#45;&#62;** 5. Can now add new names to database, or simply update. |       
|Flow of Events for Extensions (Alternate Scenarios):|**&#45;&#45;&#45;&#62;** if he enters invalid information.|  
|                          |**&#60;&#45;&#45;&#45;** Must enter correct credentials                        |    
|                          |**&#45;&#45;&#45;&#62;** If authenticated than will be able to add new items. or delete or edit. |  


**USE CASE 17: ACCOUNTING**  


| Use Case UC-17           | ACCOUNTING                                                                      |  
|:-------------------------|:--------------------------------------------------------------------------------|  
| Related UserStories      |St- 9, 11, 13, 14                                                                |  
| Initiator                |cashier                                                                          |  
| Participators            |database                                                                         |   
| Actors goal              |To calculate prices of anything or salary.                                       |  
| Preconditions            |Must be logged in as authenticated user.                                         |  
| Post-conditions          |Will give the result of the calculation to the user.                             |  
|Flow of Events for Main Success Scenario:|**&#45;&#45;&#45;&#62;** 1. &#171;include&#187; check identity.   |  
|                          |**&#60;&#45;&#45;&#45;** 2. Gives the ability to watch and select the appropriate item for calculation.|     
|                          |**&#45;&#45;&#45;&#62;** 3. &#171;include&#187; (edit, remove, search & sort, print.|  
|                          |**&#60;&#45;&#45;&#45;** 4. &#171;exclude&#187; use Case14 (check identity)      |   
|                          |**&#45;&#45;&#45;&#62;** 2b.the system shows a message that the information saved|  
|                          |**&#45;&#45;&#45;&#62;** 5. Can now add new names to database, or simply update. |       
|Flow of Events for Extensions (Alternate Scenarios):|**&#45;&#45;&#45;&#62;** 1. If the cashier insert incorrect pass word|  
|                          |**&#60;&#45;&#45;&#45;** 1a. system redirect the user                            |    
|                          |**&#45;&#45;&#45;&#62;** 2. If does not select to delete, edit                   |  
|                          |**&#60;&#45;&#45;&#45;** 2a. The system send warning message.                    |  
|                          |**&#60;&#45;&#45;&#45;** 2b. select the record                                   |













