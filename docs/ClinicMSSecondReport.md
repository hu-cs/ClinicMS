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
