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
|Flow of Events for Extensions (Alternate Scenarios):|**&#45;&#45;&#45;&#62;** 1. If types invalid information                    |  
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
|                          |**&#60;&#45;&#45;&#45;** 1.a.the system shows a message (enter valid value)        |   

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
|                          |1a. the system show a message ( select the record)                               |  

 
 




