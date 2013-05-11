#Detailed USE CASES#
<table>
<caption> USE CASE 0.2 DELETE USER <caption>
<tr> 
<td> related user stories </td>
<td> ST-1, 1.2 </td>
</tr>
<tr>
<td> initiator</td>
<td> Admin </td>
</tr>
<tr>
<td> participator </td>
<td> Database, users </td>
</tr>
<tr>
<td>Actor goal </td>
<td> To remove user from the system. </td>
</tr>
<tr>
<td> precondition </td>
<td>  + Admin should configure the system before 

User should be added to system.
</td>
</tr>
<td> post condition </td>
<td> remove user from System </td>
<tr> 
<td colspan=7> flow of events for main success scenario </td>
<td> 
</tr>
<tr>
<td> ->1. Admin wants to remove user from system, click on remove account.
<br /> <-2. System opens window which shows the users account
<br /> ->3.(a) Admin chooses the account. (b) click on remove button
<br /><-4. (a)System shows a warning message (are you sure to remove?) 
<br />->5. Admin press ok button of window
<br /><-6.(a)System removes the name and password of user form database.(b) shows a message (removed successfully.)
 </td>
</tr>
<tr> 
<td> Flow of Events for Extensions (Alternate Scenarios):
</td>
<td> 3. Admin has to choose one account to enable the remove button.
<br /> 6. during the removing.
<br /> ->1. admin press the cancel button
<br />  <-2. (a)System stops removing. (b) reset the account 
</td>
</tr>
</table>

#USE CASE 1 : CHECK IDENTITY LOGIN#
<table> 
<caption>  Detailed use case 1: check identity login (sub use cases ) </caption>
<tr> 
<td> Related UserStories </td>
<td> ST-1</td>
</tr>
<tr> 
<td> Initiator </td>
<td> Author Credential Database 	
</td>
</tr> 
<tr>
<td> Participators </td>
<td> Admin, Receptionist, Druggist, LabStuff, Casher, TherausrusStuff, database
</td>
</tr>
<tr>
<td> Actors goal </td>
<td> To authenticate the users </td>
</tr>
<tr> 
<td> Preconditions</td>
<td> ·	Admin should configure the system before
</td> 
<br/>

·	Admin should add the user to system.
<br />

The user must have valid name and password.

</tr>
<tr> 
<td> Post-conditions </td>
<td> 
The system authenticated the user and allowed to access to specified subsystem.
</td>
</tr>
<tr>
<td>Flow of Events for Main Success Scenario: </td>
<td> 
à1. The user inter his or her own name and password
<br />

 <-2. (a)The system checks name and password. (b)shows a welcome message(c) opens the main page (d) enable the specified subsystem that user can access 

</td>
</tr>
<tr>
<td> Flow of Events for Extensions (Alternate Scenarios): </td>
<td> 1. Insert invalid name or password in the fields.
  <br />
<-1. The system shows a warning message (please enter valid name or password)
<br />
->2. (a)The user inserts valid name and password. (b) Press login button.
<-same as step 2 
<br />
</td> </tr>
</table>

#USE CASE 2 : SAVING#
<table>
<caption> use case 2: saving ( sub use case )</caption>
<tr>
<td> Related UserStories</td>
<td>ST-2,4,6,9,11,21,22,23 </td>
</tr>
<tr>
<td> Initiator</td>
<td> All users</td>
</tr>
<tr>
<td> Participators </td>
<td> Database </td>
</tr>
<tr>
<td> Actors goal </td>
<td>To save information </td>
</tr>
<tr>
<td>Preconditions </td>
<td> +	Should be logged in the system.
 <br />

+	Have to fill the field with valid values.
 <br />

Press the save button 
<br />

</td>
</tr>
<tr> 
<td> Post-conditions </td>
<td> The information saved in database </td>
</tr>
<tr>
<td> Flow of Events for Main Success Scenario: </td>
<td> ->1. Press the new or edit button 
<br /> 
<- 2.sytem open the form 
<br />
-> 3. Fill the field with valid values  
<br />
-> 4. Press the save button		
<br />
<- 5. (a)The system will save information.(b)shows a message that indicates which it saved successfully 
</td>
</tr>
<tr> 
<td> Flow of Events for Extensions (Alternate Scenarios): </td>
<td> 3a. Insert invalid value in the fields. 
<br />

<-1. The system shows a warning message (enter valid value) 
<br />

->2. The user inserts valid values and press save button. 	
<br />

<-3. (a)The system saves the information in database. (b) Shows a message which indicates it saved successfully. 
<br />

4. Admin clicks on exit button before saving. 	
<br />

<-1. System shows a warning message. (are you sure to exit)	
<br />

->2. (a)If admin press ok button exit without saving. (b) If admin presses no button window exit. (c) admin press the save button 

 <br />
</td>
</tr>
</table>

#USE CASE 3: DELETING#

<table> 
<caption> Use Case UC-3: Deleting (sub use case) </caption> 
<tr> 
<td>Related lUserStories </td>
<td> 
ST-2,4,6,9,11,21,22,23

</td>
</tr>
<tr>
<td> Initiator </td>
<td> 
All users </td>
</tr>
<tr> <td> Participators </td>
<td> 
Database

</td>
</tr>
<tr>
<td> Actors goal </td>
<td> To delete some information from database. </td>
</tr>
<tr> <td> Preconditions </td>
<td>        +	User must be logged in the system.		
 <br />

   +	Select values or record				
<br />	

Press the delete button 
</td>				
</tr>
<tr>
<td> Post-conditions </td>
<td> Deleted the record from database. </td>
</tr>
<tr>
<td> Flow of Events  </td>
<td>->1. (a)User selects a record or more from database (b) clicks delete  </td>
</tr>
<tr>
<td> 	for Main Success Scenario: </td>
<td> button.
<br />

<- System shows a warning message (are you sure to delete)
<br />

<-2. (a)The system deletes the selected information. (b) shows a message (deleted successfully)
<br />
</td>
</tr>
<tr> 
<td> Flow of Events for Extensions (Alternate Scenarios):  </td>
<td>
 1. Doesn`t select any record and press the delete button
<br />

<-1.  the system shows a message ( please select the record)

</td>
</tr>
</table>

#USE CASE 4: PRINTING#
<table>
<caption> Use Case UC-4: Printing (sub use case) </caption>

<tr>
<td> Related UserStories  </td>
<td> ST-3, 5, 7, 16, 23. </td>
</tr>
<tr>
<td> Initiator </td>
<td> All Users </td>
</tr>
<tr> 
<td> Participators </td>
<td> Printer, database </td>
</tr>
<tr>
<td> Actors goal </td>
<td> To print records or information. </td>
</tr>
<tr>
<td> Preconditions </td>
<td>
*	User must be logged in the system  
<br />
*	The printer should be connect to system and system knows the printer
<br />

*	Have to selected or specify appropriate records.
<br />

*   Press print button 
</td>
</tr>
<tr>
<td> Post-conditions </td>
<td> The information or receipt or test result sheet printed. </td>
</tr>
<tr> 
<td> Flow of Events for Main Success Scenario: </td>
<td> 
->1. (a)User selects or specifies the appropriate records. (b) Press the print button.
<br />

<-2. System shows message (are you sure about printing)
<br />

->3. User press ok button if be sure.
<br />

<-4. System prints the records.
<br />

->5. Users want to print the receipt and save information about patient
<br />

6. include:UC-7, UC-8, UC-11, CU-12, UC-13, UC-14
<br />

<-7. (a)System prepared the information which is need on receipt(b) the system prints the receipt 
<br />

->8. LabStuff wants to print the testResultSheet 
<br />

9. include: UC-10
<br />

->10. (a)LabStuff saves the test information. (b) press the print result sheet button
<br />

<-11. (a)System prepared the information which is need for result sheet. (b)system prints the result sheet 
</td>
</tr>
<tr> 
<td> Flow of Events for Extensions (Alternate Scenarios):  </td>
<td> 4. If the printer is Off or disconnect
<br />

<-1. The system shows a message(printer is off or disconnect)
<br />
</td>
</tr>

</table>

		
#USE CASE 5:  EDITING#

<table> 
<caption> Use Case UC-5: Editing (sub use case) </caption>
<tr> 
<td> Related UserStories </td>
<td> ST-2,4,6,9,11,21,22,23 </td>
</tr>
<tr>
<td> Initiator </td>
<td> All users  </td>
</tr>
<tr>
<td> Participators </td>
<td> Database </td>
</tr>
<tr> 
<td> Actors goal </td>
<td> To Edit Records. </td>
</tr>
<tr> 
<td>  Preconditions </td>
<td> User should be logged in the system. </td>
</tr> 
<tr>
<td> Post-conditions </td>
<td> Edited some information </td>
</tr> 
<tr>
<td> Flow of Events for Main Success Scenario: </td>
<td> 
->1. (a) user selects a record for editing. (b) press the edit button
<br />

<-2. System opens the windows with content which are modifiable.
<br />

->3. User edit and press the save button.
<br />

<-4. (a)System save the information in database (b)shows a message (saved successfully)
<br />
</td>
</tr>
<tr> 
<td> Flow of Events for Extensions (Alternate Scenarios): </td>
<td> 
1. If user doesn`t select any record  
<br />

<-1a. system shows a message (please select record before).
<br />

3. User clicks on exit button before saving.
<br />

<-1. System shows a warning message. (are you sure to exit)
<br />

->2. (a)If admin press ok button exit without saving. (b) If admin presses no button window exit. (c) admin press the save button
<br />

</td>
</tr>
</table> 

	#USE CASE 6: SEARCHING AND SORTING#

<table>
<caption>  Use Case UC-6 : SearchingAndSorting (sub use case) </caption>
<tr>
<td> Related UserStories </td>
<td> ST-2,4,6,9,11,21,22,23 </td>
</tr>
<tr> 
<td> Initiator </td>
<td> All users  </td>
</tr>
<tr>
<td> Participators </td>
<td> database </td>
</tr>
<tr> 
<td> Actors goal </td>
<td> To search and sort records. </td>
</tr>
<tr> 
<td> Preconditions </td>
<td> Must be logged in as an appropriate personal. </td>
</tr>
<tr> 
<td> Post-conditions </td>
<td> Will give the result of the appropriate search or do the sort. </td>
</tr>
<tr> 
<td> Flow of Events for Main Success Scenario: </td>
<td> ->1. user specifies the search criteria and submits
<br />

<-2. System prepares a database query that best matches the actor’s search criteria and retrieves the records from the Database
<br />

<-3. Database returns the matching records
<br />

<-4. System (a) additionally filters the retrieved records to match the 
<br />

actor’s search criteria; (b) renders the remaining records for display; and (c) shows the result for user’s consideration
</td> 
</tr>
<tr>
<td> Flow of Events for Extensions (Alternate Scenarios): </td>
<td> ->1. The user enter any identifier in field to search
<br />

<-1a. The system shows a message that nothing is found. If cannot find anything. 

</td> 
</tr>
</table> 

	#USE CASE 7: RESERVING VISIT TIME#

<table>
<caption> Use Case UC- 7: ReservingVisitTime </caption>
<tr>
<td> Related UserStories </td>
<td> St-18, 4   </td>
</tr>
<tr>
<td>  Initiator </td>
<td> Receptionist  </td>
</tr>
<tr>
<td> Participators </td>
<td> Database, printer, patient </td>
</tr>
<tr>
<td> Actors goal </td>
<td> Reserving time to visiting patient at home or in clinic </td>
</tr>
<tr> 
<td> Preconditions </td>
<td> The receptionist must be logged in to reserve time. </td>
</tr>
<tr>
<td> Post-conditions </td>
<td> The time reserved for specific patient. </td>
</tr>
<tr>
<td> Flow of Events for Main Success Scenario: </td>
<td> 
->1. The initiator click on reserving visiting time button
<br />

2.include: identity check login (UC-1)
<br />

->2. Click on new button to open the form
<br />

ك 2. System opens a window to fill the blanks for information
<br />

à3. (a)Initiator types all requirements .(fill in the blanks)(b)press save button to reserve.
<br />

<-4. (a)System shows a warning message (this time is reserved) if the time is reserved before.
<br />
 
ك 5. System pops-up a window (“thank you for using this service) 
<br />

->6. (a)User presses the print receipt button to print receipt (b) or print the print button to print the list.
<br />

7. include: printing (UC-4)
<br />

<- 8. The system shows warning message 10 minutes before deadline of visiting time. (ten minutes to date)
<br />

<-9.system show a message if visiting failed and make the record red color. 
<br />

->10. user want to save, delete, edit, searching and sort records
<Br />

11.include: saving(UC-2), deleting(UC-3), editing(UC-5), searching and sorting(UC-6) 
</td>
</tr>
<tr>
<td> Flow of Events for Extensions (Alternate Scenarios): </td>
<td>
 3. If user types invalid information in the field
<br />

ك 1. The system will redirect to type the correct information
<br />

3. User clicks on exit button before saving.
<br />

<-1. System shows a warning message. (are you sure to exit)
<br />

->2. (a)If admin press ok button exit without saving. (b) If admin presses 
<br />

no button window exit. (c) admin press the save button
</td>
</tr> 
</table>

#USE CASE 8: RECEPTE PATIENTS & RECEIPT#

<table> 
<caption> Use Case UC-8: ReceiptPatient&Receipt </caption>
<tr>
<td> Related UserStories </td>
<td> ST-8 </td>
</tr>
<tr> 
<td> Initiator </td>
<td> Receptionist,  </td>
</tr>
<tr>
<td> Participators </td>
<td> Printer, database, patient </td>
</tr>
<tr> 
<td> Actors goal </td>
<td> Register patient and Printing a receipt for patients  </td>
</tr>
<tr>
<td> Preconditions </td>
<td> 
*	The receptionist must be logged in the system.
<br />

*	The printer should be connect and on
<br />
</td>
</tr>
<tr> 
<td> Post-conditions </td>
<td> Registered the patient and gave a receipt for visiting doctors to patient.
</td>
</tr>
<tr>
<td> 
Flow of Events for Main Success Scenario: </td>
<br />

<td> à1. Click on receipt patient button
<br />

2.Include: identity check login(UC-1)
<br />

->3. Click on registration form button
<br />

<-4. System opens the windows to fill the field.
<br />

->5.(a) Receptionist fill the field or form (b)click on save button
<br />

<-6. (a)System save information in database (b) shows a message (saved successfully)
<br />

7. include: saving(UC-2)
<br />

->8. Receptionist click on print receipt button
<br />

9. include: printing (UC-4)
<br />

<-10. Receptionist wants to delete, edit, search or sort records.
<br />

11. include: deleting (UC-3), editing(UC-5), searchingandsorting(UC-6)
</td>
</tr>
<tr >
<td> Flow of Events for Extensions (Alternate Scenarios): </td>
<td> 
5. If user types invalid information in field 
<br />

ك 1. The system will redirect to type the correct information
<br />

5.  Receptionist clicks on exit button before saving.
<br />

<-1. System shows a warning message. (are you sure to exit)
<br />

->2. (a)If admin press ok button exit without saving. (b) If admin presses no button window exit. (c) admin press the save button
</td>
</tr> 
</table>

#USE CASE 9: PERSONALS#

<table>
<caption>   Use Case UC-9: Personals </caption>
<tr>
<td> Related UserStories </td>
<td> ST-24, 15, 13. 7 </td>
</tr>
<tr>
<td> Initiator </td>
<td> Admin </td>
</tr>
<tr>
<td> Participators </td>
<td> Scanner & Camera, database, printer </td>
</tr>
<tr>
<td> Actors goal </td>
<td> To add or remove personal. Manage system about the shift and salaries of personals. </td>
</tr>
<tr> 
<td> Preconditions </td>
<td> 
*	Admin must be logged in the system 
<br />

Scanner, camera and printer should be connected and on 
</td>
</tr>
<tr>
<td> Post-conditions </td>
<td> The personal added or removed and arranged record about personals. </td>
</tr>
<tr>
<td> Flow of Events for Main Success Scenario: </td>
<td> 
à1. Admin clicks on Office button
<br />

2. include: Check identity login (UC-1)
<br />

à2. Admin clicks on registration form of doctor link to add personal.
<br />

<-3. System opens the window and form to fill it.
<br />

->4. (a)Admin fill the form with valid value and photo. (b) Press the save button.
<br />

5.include: saving (UC-2)
<br />

<-6. (a) System saves the information in database. (b) shows a message (saved successfully)
<br />

->7. Admin click on registration form of nurse link to add personal
<br />

<-8. Same as step 3
<br />

->9. Same as step 4
<br />

<-10. Same as step 6
<br />

->11. Admin click on registration form of other personal link to add personal (Same steps as 8, 9, 10)
<br />

->12. Admin click on personal list link. To see the list of personals
<br />

<-13. The system open list of personal windows
<Br />

->14. Admin can delete, print, edit, search and sort
<Br />

15. include: UC-3, UC-4, UC-5, UC-6
<br />

->16. Admin clink on shift list link, to see the list of personals who are shift
<br />

<-17. The system open list of shift
<br />

->18. Same as step 14 and 15

</td>
</tr>
<tr>
<td> Flow of Events for Extensions (Alternate Scenarios): </td>
<td> 
4. admin insert invalid information
<br />

<-1. system shows warning message (invalid value)
<br />

->2. Admin insert inserts valid information 
<br />

<-3.same as step 6
<br />

6. Admin clicks on exit button before saving.
<br />

<-1. System shows a warning message. (are you sure to exit)
<br />

->2. (a)If admin press ok button exit without saving. (b) If admin presses no button window exit. (c) admin press the save button
</td>
</tr>
</table>


#USE CASE 10: TEST INFO & RESULT SHEET#
<table> 
<caption> Use Case UC- 10: TestInfo&ResultSheet </caption>
<tr> 
<td> Related UserStories </td>
<td> ST-8, 1, 23,  </td>
</tr>
 <tr> 
<td> Initiator </td>
<td> Lab staff </td>
</tr>
<tr>
<td> Participators </td>
<td> Printer, database, patient </td>
</tr>
<tr>
<td> Actors goal </td>
<td> To print the test result sheet and save information of test in database </td>
</tr>
<tr> 
<td> Preconditions </td>
<td> 
*	Lab staff must be logged in the system
<br />

*	Printer should be connect and on

</td>
</tr>
<tr> 
<td> Post-conditions </td>
<td> Information about patient saved and test result sheet printed. </td>
</tr>
<tr>
<td> Flow of Events for Main Success Scenario: </td>
<td> 
à1. Lab staff clicks on laboratory button
<br />

2. include: Check identity login (UC-1)
<br />

à2. Lab staff clicks on registration form to add new patient to lab.
<br />

<-3. System opens the window and form to fill it.
<br />

->4. (a) Lab staff fill the form with valid value a. (b) Press the save button.
<br />

5.include: saving (UC-2)
<br />

<-6. (a) System saves the information in database. (b) shows a message (saved successfully)
<br />

->7. Lab staff clicks on test patient list link. To see the list of test patients
<br />

<-8. The system open list of test windows
<Br />

->9. Lab staff can delete, print, edit, search and sort
<br />

10. include: UC-3, UC-4, UC-5, UC-6
<br />

->11. Lab staff click on the add test link
<br />

<-12. System opens the window of form and list of it on the same page to fill it.
<br />

->13. (a) Lab staff fill the form with valid value a. (b) Press the save button.
<br />

14.include: saving (UC-2)
<br />

<-15. (a) System saves the information in database. (b) shows a message (saved successfully)
<Br />

->16. Lab staff clicks on tests link to choose kind on test and fill it.
<br />

<-17. System opens the window of test 
<Br />

->18. (a) Lab staff fill the field of test with valid value a. (b) Press the save button.
<br />

19.include: saving (UC-2)
<br />

<-20. (a) System saves the information in database. (b) shows a message (saved successfully)
<Br />

->21. Lab staff press the print button to print result sheet
<br />

<-22. System prints the result sheet
<br />

23. include: printing (UC-4)
</td>
</tr>
<tr>
<td> Flow of Events for Extensions (Alternate Scenarios): </td>
<td> 
4, 13, 18. If lab staff insert invalid information
<br />
<-1. system shows warning message (invalid value)
<br />

->2. Lab staff insert inserts valid information 
<br />

<-3.same as step 6
<br />

4, 13, 18. Lab staff clicks on exit button before saving.
<br />

<-1. System shows a warning message. (are you sure to exit)
<br />

->2. (a)If Lab staff press ok button exit without saving. (b) If Lab staff presses no button window exit. (c) Lab staff press the save button
<br />

21. If he cancel the print process at the middle.
<br />

ك 1. (a)the system show a warning message (are you sure to cancel the print).
<br />

->2. If the lab staff click ok button  
<br />

<-3. The system will cancel the remaining part of docs.
</td>
</tr>
</table> 

#USE CASE 11: AMBULANCE RESERVATION#

<table>
<caption> Use Case UC-11: AmbulanceReservation </caption>
<tr>
<td> Related UserStories </td>
<td> ST-21. </td>
</tr>
<tr>
<td> Initiator </td>
<td> Receptionist </td>
</tr>
<tr> 
<td> Participators </td>
<td> Database, ambulance drivers, printer </td>
</tr>
<tr>
<td> Actors goal </td>
<td> To Reserve an ambulance. ( I mean call for ambulance ) </td>
</tr>
<tr>
<td> Preconditions </td>
<td> 
*	Receptionist should be logged in the system
<br />

*	Printer should be connect and on.
<br />
      
	*	Any ambulance and driver should be free
</td> 
</tr>
<tr>
<td> Post-conditions </td>
<td> Will reserve ambulance and send an ambulance to the area. </td>
</tr>
<tr>
<td> Flow of Events for Main Success Scenario: </td>
<td> 
à1. Receptionist clicks on reserve ambulance. 
<br />

2.include: check identify login(UC-1) 
<br />

->3. Receptionist clicks on calls list link. To see the list of calls 
<br />

<-4. The system open list of calls windows
<br />

->5. receptionist can delete, print, edit, search and sort
<br />

6. include: UC-3, UC-4, UC-5, UC-6
<br />

->7. Receptionist click on the add new call link
<br />

<-8. System opens the window of form to fill it.
<br />

->9. (a) receptionist fills the form with valid value a. (b) Press the save button.
<br />

10.include: saving (UC-2)
<br />

<-11. (a) System saves the information in database. (b) shows a message (saved successfully)
</td>
</tr>
<tr>
<td> Flow of Events for Extensions (Alternate Scenarios): </td>
<td> 
7. If no ambulance is free
<br />

<-1.  system shows a message that no ambulance ready
<br />

8. If receptionist insert invalid value.
<br />

<-1. system shows warning message (invalid value)
<br />

->2. receptionist insert inserts valid information 
<br />

<-3.same as step 11
<br />

9. receptionist clicks on exit button before saving.
<br />

<-1. System shows a warning message. (are you sure to exit)
<br />

->2. (a)If admin press ok button exit without saving. (b) If admin presses no button window exit. (c) admin press the save button
</td>
</tr>

</table>

	#USE CASE 12: OPERATION ROOM & RECEIPT#

<table>
<caption>  Use Case UC-12: OperationRoom&Receipt </caption>
<tr> 
<td> Related UserStories </td>
<td> ST-3 , 6 ,22 </td>
</tr>
<tr>
<td> Initiator </td>
<td> receptionist </td>
</tr>
<tr>
<td> Participators </tr>
<td> printer, database, patient </td>
</tr>
<tr>
<td> Actors goal </td>
<td> To save information about operation and print a receipt for Operation. </td>
</tr>
<tr>
<td> Preconditions </td>
<td> 
*	Receptionist should be logged in the system
<br />

*	Printer should be connect and on.
<br />

	*	Doctors and nurse should be free
</td>
</tr>
<tr>
<td> Post-conditions </td>
<td> Saved information of operation and a receipt printed for operation room. </td>
</tr>
<tr>
<td>
Flow of Events for Main Success Scenario: </td>
<td> 
à1. Receptionist clicks on Operation Room button. 
<br />

2.include: check identify login(UC-1) 
<br />

->3. Receptionist clicks on operation list link. To see the list of operation 
<br />

<-4. The system open list of operation windows
<br />

->5. receptionist can delete, print, edit, search and sort
<br />

6. include: UC-3, UC-4, UC-5, UC-6
<br />

->7. Receptionist click on the add new operation link
<br />

<-8. System opens the window of form to fill it.
<br />

->9. (a) receptionist fills the form with valid value a. (b) Press the save button.
<br />

10.include: saving (UC-2)
<br />

<-11. (a) System saves the information in database. (b) shows a message (saved successfully)
</td>
</tr>
<tr>
<td> Flow of Events for Extensions (Alternate Scenarios): </td>
<td> 
7. If operation room is not ready
<br />

<-1.  system shows a message that operation room is not ready
<br />

8. If receptionist insert invalid value.
<Br />

<-1. system shows warning message (invalid value)
<Br />

->2. receptionist insert inserts valid information 
<Br />

<-3.same as step 11
<Br />

9. Receptionist clicks on exit button before saving.
<Br />

<-1. System shows a warning message. (are you sure to exit)
<br />

->2. (a)If Receptionist press ok button exit without saving. (b) If Receptionist presses no button window exit. (c) admin press the save button 
</td>
</tr>
</table>

#USE CASE 13: PARTURITION DEPARTMENT#
<table>
<caption> Use Case UC-13: ParturitionDepartment </caption>
<tr>
<td> Related UserStories </td>
<td> St-22 </td>
</tr>
<tr>
<td> Initiator </td>
<td> Receptionist </td>
</tr>
<tr>
<td> Participators </td>
<td> Database, printer, patient </td>
</tr>
<tr> 
<td> Actors goal </td>
<td> To add new Patients for parturition department and print a receipt. </td>
</tr>
<tr>
<td> Preconditions </td>
<td> 
*	Receptionist should be logged in the system
<br />

*	Printer should be connect and on.
<br />

	*	nurse should be free 
</td> 
</tr>
<tr>
<td> Post-conditions </td>
<td> The patient registered for the parturition department and printed the recept. </td>
</tr>
<tr> 
<td> Flow of Events for Main Success Scenario: </td>
<td> 
à1. Receptionist clicks on parturition department button. 
<br />

2.include: check identify login(UC-1) 
<br />

->3. Receptionist clicks on parturition list link. To see the list of parturition
<br />

<-4. The system open list of parturition windows
<br />

->5. receptionist can delete, print, edit, search and sort
<br />

6. include: UC-3, UC-4, UC-5, UC-6
<br />

->7. Receptionist click on the add new parturition link
<br />

<-8. System opens the window of form to fill it.
<br />

->9. (a) receptionist fills the form with valid value a. (b) Press the save button.
<br />

10.include: saving (UC-2)
<br />

<-11. (a) System saves the information in database. (b) shows a message (saved successfully)
</td>
</tr>
<tr>
<td> Flow of Events for Extensions (Alternate Scenarios): </td>
<td> 
7. If parturition room is not ready
<br />

<-1.  system shows a message that parturition room is not ready
<br />

8. If receptionist insert invalid value.
<br />

<-1. system shows warning message (invalid value)
<br />

->2. receptionist insert inserts valid information 
<br />

<-3.same as step 11
<br />

9. Receptionist clicks on exit button before saving.
<br />

<-1. System shows a warning message. (are you sure to exit)
<br />

->2. (a)If Receptionist press ok button exit without saving. (b) If Receptionist presses no button window exit. (c) admin press the save button 
</td>
</tr>
</table>

	#USE CASE 14: BedRESERVATION&RECEIPT#
<table>
<caption> Use Case UC-14: BedResevation&Receipt </caption>
<tr>
<td> Related UserStories </td>
<td> ST-14 </td>
</tr>
<tr>
<td> Initiator </td>
<td> Receptionist </td>
</tr>
<tr>
<td> Participators </td>
<td> Database printer, patient </td>
</tr>
<tr>
<td> Actors goal </td>
<td> To reserve a bed to patient </td>
</tr>
<tr>
<td> Preconditions </td>
<td> 
*	Receptionist should be logged in the system
<br />

*	Printer should be connect and on.
<br />

	*	Bed should be free 
</td>
</tr>
<tr>
<td> Post-conditions </td>
<td> Reserve the bed to patient and print a receipt about the bed and give it to patient. </td>
</tr>
<tr>
<td> Flow of Events for Main Success Scenario: </td>
<td> 
->1. Receptionist clicks on bed reservation button. 
<br />

2.include: check identify login(UC-1) 
<br />

->3. Receptionist clicks on reserved bed list link. To see the list of reserved beds
<br />

<-4. The system open list of beds windows
<br />

->5. receptionist can delete, print, edit, search and sort
<br />

6. include: UC-3, UC-4, UC-5, UC-6
<br />

->7. Receptionist click on the add reserving bed link
<br />

<-8. (a)System opens the window of form to fill.(b) Shows a message that beds numberNs are free.
<br />

->9. (a) receptionist fills the form with valid value a. (b) Press the save button.
<br />

10.include: saving (UC-2)
<br />

<-11. (a) System saves the information in database. (b) shows a message (saved successfully)
<br />

<-12. System show a warning message if the time of reservation finishes about any bed. (Time of reserve  finished )
<Br />

->13. If receptionist click the ok button of warning window.
<br />

<-14. (a)System adds the bed to free bed. (b) Shows a message that bed number x is free.  
</td>
</tr>
<tr>
<td> Flow of Events for Extensions (Alternate Scenarios): </td>
<td> 
7. If no bed is free
<br />

<-1.  System shows a message that on bed is free.
<br />

8. If receptionist insert invalid value.
<br />

<-1. system shows warning message (invalid value)
<br />

->2. receptionist insert inserts valid information 
<br />

<-3.same as step 11
<br />

9. Receptionist clicks on exit button before saving.
<br />

<-1. System shows a warning message. (are you sure to exit)
<Br />

->2. (a)If Receptionist press ok button exit without saving. (b) If Receptionist presses no button window exit. (c) receptionist press the save button 
</td>
</tr>
</table>

		#USE CASE 15: SELLING DRUGS#

<table>
<caption> Use Case UC-15: SellingDrugs (manually) </caption>
<tr>
<td> Related UserStories </td>
<td> ST-6 , 9, 10  </td>
</tr>
<tr>
<td> Initiator </td>
<td> Druggist </td>
</tr>
<tr>
<td> Participators </td>
<td> database, patient </td>
</tr>
<tr>
<td> Actors goal </td>
<td> To Sell Drugs. Counts how many doses have been sold. </td>
</tr>
<tr> 
<td> Preconditions </td>
<td> 
-	The druggist must be logged in the system.
<br />

-	The drugs and hygienic goods should register in system before
<br />
      
-	Register the price and made country name in system. 
</td>
</tr>

<tr> 
<td> Post-conditions </td>
<td>New information about selling drugs added to the database and system automatically calculates the price to easy work.  </td>
</tr>
<tr>
<td> Flow of Events for Main Success Scenario: </td>
<td> 
->1. Druggist clicks on drug store button. 
<br />

2.include: check identify login(UC-1) 
<br />

->3. Druggist clicks on drugs list or hygienic goods link. To see the list of registered drugs
<br />

<-4. The system open list of drugs or hygienic good windows
<br />

->5. druggist can delete, print, edit, search and sort
<br />

6. include: UC-3, UC-4, UC-5, UC-6
<br />

->7. Receptionist click on the new sale link
<br />

<-8. (a)System opens the window of form to choose the drugs and hygienic goods.
<br />

->9. (a)Druggist fill identity field about sale first. (b) Choose the drugs or hygienic good from the list by searching. (c) Insert the number of drugs and enter key. 
<br />

10. include: (UC-6)
<br />

<-11. (a)System add the chosen drugs and numbers it to prescription table.(b) calculates the total price of the prescription table
<br />

->12.druggist press the save button.
<br />

13.include: saving (UC-2)
<br />

<-14. (a) System saves the information in database. (b) shows a message (saved successfully)
</td> 
</tr>
<tr>
<td> 
Flow of Events for Extensions (Alternate Scenarios): </td>
<br />

<td> 8. If receptionist insert invalid value.
<br />

<-1. system shows warning message (invalid value)
<br />

->2. receptionist insert inserts valid information 
<br />

<-3.same as step 14
<br />

9. Druggist clicks on exit button before saving.
<Br />

<-1. System shows a warning message. (are you sure to exit)
<br />

->2. (a)If Druggist press ok button exit without saving. (b) If Druggist presses no button window exit. (c) Druggist press the save button 
</td>
</tr>
</table>


	#USE CASE 16: THESAURUS DEPARTMENT#

<table>
<caption> Use Case UC-16: ThesaurusDepartment&Receipt </caption>
<tr>
<td> Related UserStories </td>
<td> ST-12, 3, 16 </td>
</tr>
<tr>
<td> Participators </td>
<td> Thesaurus Staff. </td>
</tr>
<tr>
<td> Actors goal </td>
<td> Manage and record items in thesaurus </td>
</tr>
<tr>
<td> Preconditions </td>
<td> 
-	The thesaurus staff  should be logged in the system
<br />
      
- 	Information should be added to database.  
</td>
</tr>
<tr>
<td> Post-conditions </td>
<td> The new Item is added to the database for Use. </td>
</tr>
<tr>
<td> Flow of Events for Main Success Scenario: </td>
<td>
->1. Thesaurus staff clicks on thesaurus department button. 
<br />

2.include: check identify login(UC-1) 
<br />

->3. Thesaurus Staff clicks on drugs list or link. To see the list of registered drugs
<br />

<-4. The system open list of drugs or hygienic good windows
<br />

->5. Thesaurus Staff can delete, print, edit, search and sort
<br />

6. include: UC-3, UC-4, UC-5, UC-6
<br />

->7. Thesaurus Staff click on the new item link
<br />

<-8. (a)System opens the window of form to register new drugs and hygienic goods.
<br />

->9. Thesaurus Staff fill identity field about item. 
<br />

->12. Thesaurus Staff press the save button.
<br />

13.include: saving (UC-2)
<br />

<-14. (a) System saves the information in database. (b) shows a message (saved successfully)
</td>
</tr>
<tr>
<td> Flow of Events for Extensions (Alternate Scenarios): </td>
<td> 
8. If Thesaurus Staff insert invalid value.
<br />

<-1. system shows warning message (invalid value)
<br />

->2. Thesaurus Staff insert inserts valid information 
<br />

<-3.same as step 14
<br />

9. Thesaurus Staff clicks on exit button before saving.
<br />

<-1. System shows a warning message. (are you sure to exit)
<br />

->2. (a)If Thesaurus Staff press ok button exit without saving. (b) If Thesaurus Staff presses no button window exit. (c) Thesaurus Staff press the save button
</td>
</tr>
</table>

	#USE CASE 17: ACCOUNTING#

<table>

<caption> Use Case UC-17: Accounting </caption>
<tr>
<td> Related UserStories </td>
<td> ST- 9, 11, 13, 14</td>
</tr>
<tr>
<td> Initiator </td>
<td> Casher  </td>
</tr>
<tr>
<td> Participators </td>
<td> Database , printer, personals </td>
</tr>
<tr>
<td> Actors goal </td>
<td> To calculate incomes, expenditures and salary. See the graph of them. </td>
</tr>
<tr>
<td> Preconditions </td>
<td> 
*	Casher must be logged in the system.
<br />
*	Printer should be connect and on
<br />
      
*	The data and information (income, expenditure, and salary) should be in database.
</td>
</tr>
<tr>
<td> Post-conditions </td>
<td> Calculated the salaries, customer numbers, expenditures and incomes. Saw graph of them. </td>
</tr>
<tr>
<td> Flow of Events for Main Success Scenario: </td>
<td> 
->1. Casher clicks on accounting button. 
<br />

2.include: check identify login(UC-1) 
<br />

->3. Casher clicks on the graph of expenditures or incomes or numbers of customers
<br />

<-4. System shows the graph of them.
<br />

->5. Casher click on the table of personal`s salaries
<br />

<-6. System show the windows of the table.
<br />

->7. casher can delete, print, edit, search and sort
<br />

8. include: UC-3, UC-4, UC-5, UC-6
<br />

->8. casher click on the new record button
<Br />

<-9. (a)System opens the window of form to register records about salaries.
<br />

->10. Casher fill field about new records of salary. 
<br />

->12. Casher press the save button.
<br />

13.include: saving (UC-2)
<br />

<-14. (a) System saves the information in database. (b) shows a message (saved successfully) 
</td>
</tr>
<tr>
<td> Flow of Events for Extensions (Alternate Scenarios): </td>
<td> 
8. If casher insert invalid value.
<br />

<-1. system shows warning message (invalid value)
<br />

->2. casher insert inserts valid information 
<br />

<-3.same as step 14
<br />

9. Casher clicks on exit button before saving.
<br />

<-1. System shows a warning message. (are you sure to exit)
<br />

->2. (a)If casher press ok button exit without saving. (b) If casher presses no button window exit. (c) casher press the save button
</td>
</tr>
</table>



#Sequence Diagrams#

![khadraTeam](https://github.com/hu-cs/ClinicMS/blob/master/images/Sequence%20diagram/UC-0.PNG?raw=true)

![khadraTeam](https://github.com/hu-cs/ClinicMS/blob/master/images/Sequence%20diagram/UC-1.PNG?raw=true)

![khadraTeam](https://github.com/hu-cs/ClinicMS/blob/master/images/Sequence%20diagram/UC-2.PNG?raw=true)

![khadraTeam](https://github.com/hu-cs/ClinicMS/blob/master/images/Sequence%20diagram/UC-3.PNG?raw=true)

![khadraTeam](https://github.com/hu-cs/ClinicMS/blob/master/images/Sequence%20diagram/UC-4.PNG?raw=true)  

![khadraTeam](https://github.com/hu-cs/ClinicMS/blob/master/images/Sequence%20diagram/UC-5.PNG?raw=true)  

![khadraTeam](https://github.com/hu-cs/ClinicMS/blob/master/images/Sequence%20diagram/UC-6.PNG?raw=true)  

[khadraTeam](https://github.com/hu-cs/ClinicMS/blob/master/images/Sequence%20diagram/UC-7.PNG?raw=true)  

![khadraTeam](https://github.com/hu-cs/ClinicMS/blob/master/images/Sequence%20diagram/UC-8.PNG?raw=true) 

![khadraTeam](https://github.com/hu-cs/ClinicMS/blob/master/images/Sequence%20diagram2/UC-9.png?raw=true)  

![khadraTeam](https://github.com/hu-cs/ClinicMS/blob/master/images/Sequence%20diagram2/UC-10.png?raw=true)  

![khadraTeam](https://github.com/hu-cs/ClinicMS/blob/master/images/Sequence%20diagram2/UC-12.png?raw=true)  

![khadraTeam](https://github.com/hu-cs/ClinicMS/blob/master/images/Sequence%20diagram2/UC-12.png?raw=true)

![khadraTeam](https://github.com/hu-cs/ClinicMS/blob/master/images/Sequence%20diagram2/UC-13.png?raw=true)  

![khadraTeam](https://github.com/hu-cs/ClinicMS/blob/master/images/Sequence%20diagram2/UC-14.png?raw=true)   

![khadraTeam](https://github.com/hu-cs/ClinicMS/blob/master/images/Sequence%20diagram2/UC-15.png?raw=true)  

![khadraTeam](https://github.com/hu-cs/ClinicMS/blob/master/images/Sequence%20diagram2/UC-16.png?raw=true)

![khadraTeam](https://github.com/hu-cs/ClinicMS/blob/master/images/Sequence%20diagram2/UC-17.png?raw=true)


#Activity Diagrams#

![khadraTeam](https://github.com/hu-cs/ClinicMS/blob/master/images/activityDiagram2/UC-01.png?raw=true)

![khadraTeam](https://github.com/hu-cs/ClinicMS/blob/master/images/activityDiagram2/UC-02.png?raw=true)

![khadraTeam](https://github.com/hu-cs/ClinicMS/blob/master/images/activityDiagram2/UC-1.png?raw=true)

![khadraTeam](https://github.com/hu-cs/ClinicMS/blob/master/images/activityDiagram2/UC-2.png?raw=true)

![khadraTeam](https://github.com/hu-cs/ClinicMS/blob/master/images/activityDiagram2/UC-3.png?raw=true)  

![khadraTeam](https://github.com/hu-cs/ClinicMS/blob/master/images/activityDiagram2/UC-4.png?raw=true)  

![khadraTeam](https://github.com/hu-cs/ClinicMS/blob/master/images/activityDiagram2/UC-5.png?raw=true)  

[khadraTeam](https://github.com/hu-cs/ClinicMS/blob/master/images/activityDiagram2/UC-6.png?raw=true)  

![khadraTeam](https://github.com/hu-cs/ClinicMS/blob/master/images/activityDiagram2/UC-7.png?raw=true) 

![khadraTeam](https://github.com/hu-cs/ClinicMS/blob/master/images/activityDiagram2/UC-8.jpg?raw=true)  

![khadraTeam](https://github.com/hu-cs/ClinicMS/blob/master/images/activityDiagram2/UC-9.jpg?raw=true) 

![khadraTeam](https://github.com/hu-cs/ClinicMS/blob/master/images/activityDiagram2/UC-10.jpg?raw=true)

![khadraTeam](https://github.com/hu-cs/ClinicMS/blob/master/images/activityDiagram2/UC-11.jpg?raw=true)

#Responsibilities of concept models#  


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
|Rs1. Coordinate actions of concepts associated with this use case . | D | Controller |  	
|Rs2. It should Scan our records and get photo. | D | Scanner and Camera Connection |  	                                                      |Rs3. This is specify a storage container for info and can easy retrieve records and do search, edit ,delete ...operation. | D | Database Connection |  
|Rs4. it responsible for printing records | D | printer Connection |  
|Rs5. To add or remove personal. Manage system about the shift and salaries of personals. | K | Admin |  
|Rs6. Form specifying the search parameters from database. | K | Search Request |   
|Rs7. To add ,Sort ,remove and edit personals | K | Operation |  
|Rs8. it responsible for checking password value that it is correct or no .if it is not correct do not allow to user login | K | check identity login |  
|Rs9. Shows interface or make views | K | Interface |  
 

|						   	**Responsibility for UC-10**				      |		 | 		   	        |    
|:------------------------------------------------------------------------|:----:|------------------|   
|**Responsibility Description**                               			  | **Type** |**Concept Name** |  
|Rs1. Coordinate actions of concepts associated with this use case . | D | Controller |  
|Rs2. This operation check the input value is valid or no  ,if not valid , Do not allow put invalid value | D | Value checker |  
|Rs3. This is specify a storage container for info and can easy retrieve records  ,and do search, edit ,delete ...operation. | D | Database Connection |  
|Rs4. it responsible for printing records | D | printer Connection |  
|Rs5.To print the test result sheet and save information of test in database. | D | Lab staff |  
|Rs6. This form get information about patient. | K | patient |  
|Rs7. Form specifying the search parameters from database. | K | Search Request |  
|Rs8. To add, Sort, remove and edit personals | K | Delete ,edit and Sort request |  
|Rs9. it responsible for checking password value that it is correct or no .if it is not correct do not allow to user login | K | check identity login |  
 


|						   	**Responsibility for UC-11**				      |		 | 		   	        |    
|:------------------------------------------------------------------------|:----:|------------------|   
|**Responsibility Description**                               			  | **Type** |**Concept Name** |  
|Rs1. Coordinate actions of concepts associated with this use case . | D | Controller |  
|Rs2. This operation check the input value is valid or no ,Do not allow put invalid value | D | Value checker |  
|Rs3. This is specify a storage container for info and can easy retrieve records  ,and do search, edit ,delete ...operation. | D | Database Connection |  
|Rs4. it responsible for printing records | D | printer Connection |  
|Rs5. To Reserve an ambulance | D | Receptionist |  
|Rs6. This form get information about patient . | K | patient |  
|Rs7. Form specifying the search parameters from database. | K | Search Request |  
|Rs8. To add ,S ort ,remove and edit personals | K | Delete ,edit and Sort request |  
|Rs9. it responsible for checking password value that it is correct or no .if it is not correct do not allow to user login | K | check identity login |  



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
|RS4. HTML document that shows the register drugs in system. | K | Interface Page |  
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


#Association of Concepts#  



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


#Attributes of Concept models#


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
|Search, sort request	user’s identity	Used to determine the actor’s credentials, which in turn specify what kind of data this actor is authorized to view.
Result filtering	filter parameter 	Patient name, id, last name, birthdate, as user interest
Result rendering	Search parameter	Need result filtering  to  Filter  the  retrieved  records  to  match



|**Concepts Attribute for UC-7** |	                                                |                     |    
|:-------------------------|:-------------------------------------------------------|:--------------------|   
|**Concept name**          | **Attributes**                                        | **Attributes description** |  
|Time reserving request	user’s 
|identity	Used to determine the actor’s credentials, which in turn specify does actor is authorized to reserve time.
Result filtering	filter parameter 	Patient name, id, last name, birthdate, as user interest for filtering the result
Result sorting	Sort parameter	Patient name, id, last name, birthdate, field as user want
Deleting receipt 	Delete parameter 	Need to pass the receipt tracking number for deleting from database
TimeReserver	Date	Need to store date of reserving time temporary



|**Concepts Attribute for UC-8** |	                                                |                     |    
|:-------------------------|:-------------------------------------------------------|:--------------------|   
|**Concept name**          | **Attributes**                                        | **Attributes description** |  
|Search and sort request	|user’s identity |Used to determine the actor’s credentials, which in turn specify what kind of data this actor is authorized to view. |  
|Result filtering	|filter parameter |Patient name, id, last name, birthdate, for user interest|  
|search	|Search parameter	|needed  result filtering  needed  to  Filter  the  retrieved  records  to  match|   
|Deleting and editing receipt |Delete parameter |Need to pass the receipt tracking number for deleting and editing from database|  



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
|New Identity Entry	| User Name	|Take the new user name and send to controller and identity object |  
||password	|Take the new user password and send to controller and identity object|  
||Add new sale | Drug name | Take the new drug name and send to controller and identity object|  
||Drug price | Take the new drug price for new drug and send to controller and identity object |  



|**Concepts Attribute for UC-16** |	                                                |                     |    
|:-------------------------|:-------------------------------------------------------|:--------------------|   
|**Concept name**          | **Attributes**                                        | **Attributes description** |
|New Identity Entry| User Name |Take the new user name and send to controller and identity object|  
||password	|Take the new user password and send to controller and identity object|  
|| Add new item	|  	
		



|**Concepts Attribute for UC-17** |	                                                |                     |    
|:-------------------------|:-------------------------------------------------------|:--------------------|   
|**Concept name**          | **Attributes**                                        | **Attributes description** |



#Domain models#  

![khadraTeam](https://github.com/hu-cs/ClinicMS/blob/master/images/DomainModels/uc-0.1.png?raw=true)  

![khadraTeam](https://github.com/hu-cs/ClinicMS/blob/master/images/DomainModels/uc-0.2.png?raw=true)  

![khadraTeam](https://github.com/hu-cs/ClinicMS/blob/master/images/DomainModels/uc-1.png?raw=true)  

![khadraTeam](https://github.com/hu-cs/ClinicMS/blob/master/images/DomainModels/uc-6.png?raw=true)

![khadraTeam](https://github.com/hu-cs/ClinicMS/blob/master/images/DomainModels/uc-7.png?raw=true)  

![khadraTeam](https://github.com/hu-cs/ClinicMS/blob/master/images/DomainModels/uc-8.png?raw=true)  

![khadraTeam](https://github.com/hu-cs/ClinicMS/blob/master/images/DomainModels/uc-9.PNG?raw=true)

![khadraTeam](https://github.com/hu-cs/ClinicMS/blob/master/images/DomainModels/uc-10.PNG?raw=true)  

![khadraTeam](https://github.com/hu-cs/ClinicMS/blob/master/images/DomainModels/uc-11.PNG?raw=true)  

![khadraTeam](https://github.com/hu-cs/ClinicMS/blob/master/images/DomainModels/uc-12.PNG?raw=true)

![khadraTeam](https://github.com/hu-cs/ClinicMS/blob/master/images/DomainModels/uc-13.PNG?raw=true)  

![khadraTeam](https://github.com/hu-cs/ClinicMS/blob/master/images/DomainModels/uc-14.PNG?raw=true)  

![khadraTeam](https://github.com/hu-cs/ClinicMS/blob/master/images/DomainModels/uc-15.jpg?raw=true)

![khadraTeam](https://github.com/hu-cs/ClinicMS/blob/master/images/DomainModels/uc-16.jpg?raw=true)  

![khadraTeam](https://github.com/hu-cs/ClinicMS/blob/master/images/DomainModels/uc-17.jpg?raw=true)


#Class Diagrams#  

![khadraTeam](https://github.com/hu-cs/ClinicMS/blob/master/images/ClassDiagram/UC-0.1.JPG?raw=true)  

![khadraTeam](https://github.com/hu-cs/ClinicMS/blob/master/images/ClassDiagram/UC-0.2.JPG?raw=true)  

![khadraTeam](https://github.com/hu-cs/ClinicMS/blob/master/images/ClassDiagram/uc-1.jpg?raw=true)  

![khadraTeam](https://github.com/hu-cs/ClinicMS/blob/master/images/ClassDiagram/uc-2.jpg?raw=true)

![khadraTeam](https://github.com/hu-cs/ClinicMS/blob/master/images/ClassDiagram/uc-3.jpg?raw=true)  

![khadraTeam](https://github.com/hu-cs/ClinicMS/blob/master/images/ClassDiagram/uc-4.jpg?raw=true)   

![khadraTeam](https://github.com/hu-cs/ClinicMS/blob/master/images/ClassDiagram/uc-5.jpg?raw=true)  

![khadraTeam](https://github.com/hu-cs/ClinicMS/blob/master/images/ClassDiagram/uc-9.PNG?raw=true)

![khadraTeam](https://github.com/hu-cs/ClinicMS/blob/master/images/ClassDiagram/uc-10.PNG?raw=true)

![khadraTeam](https://github.com/hu-cs/ClinicMS/blob/master/images/ClassDiagram/uc-11.PNG?raw=true)

![khadraTeam](https://github.com/hu-cs/ClinicMS/blob/master/images/ClassDiagram/uc-12.PNG?raw=true)

![khadraTeam](https://github.com/hu-cs/ClinicMS/blob/master/images/ClassDiagram/uc-13.PNG?raw=true)

![khadraTeam](https://github.com/hu-cs/ClinicMS/blob/master/images/ClassDiagram/uc-14.PNG?raw=true)

![khadraTeam](https://github.com/hu-cs/ClinicMS/blob/master/images/ClassDiagram/uc-15.jpg?raw=true)  

![khadraTeam](https://github.com/hu-cs/ClinicMS/blob/master/images/ClassDiagram/uc-16.jpg?raw=true)  

![khadraTeam](https://github.com/hu-cs/ClinicMS/blob/master/images/ClassDiagram/uc-17.jpg?raw=true)  









