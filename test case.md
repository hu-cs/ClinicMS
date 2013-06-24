
#TEST CASES. 2, 3, 4, 5#

<table>
<caption> UC-2: </caption>
<tr>
<td> Test-case Identifier: </td>
<td> TC-2 </td>
</tr>
<tr>
<td> Use Case Tested: </td>
<td> UC-2, main success scenario </td>
</tr>
<tr>
<td> Pass/fail Criteria: </td>
<td> The test passes if the record is deleted, fails if not deleted. </td>
</tr>
<tr> 
<td> Input Data: </td>
<td> Numeric, data, texts. </td>
</tr>
</table>
<table>
<tr>
<td> Test Procedure: </td>
<td> Expected Result: </td>
</tr>
<tr> 
<td> Step 1.fill all the appropriate place with text and appropriate fields. 
</td>
<td>
The empty places must be filled. 
</td>
</tr>
<tr>
<td> Step 2. Click the save button. </td>
<td> A record must be added to the dbs. </td>
</tr>
<tr>
<td> Step 3. Check in database if the record exist. </td>
<td> You can now see the records in database. </td>
</tr>
</table>

<table>
<caption> UC-3: Deleting </caption>
<tr>
<td> Test-case Identifier: </td>
<td>TC-3 </td>
</tr>
<tr>
<td> Use Case Tested: </td>
<td> UC-3, main success scenario </td>
</tr>
<tr> 
<td> Pass/fail Criteria: </td>
<td> The test passes if the record is not exist in database.
Fails if exist. </td>
</tr>
<tr> 
<td> Input Data: </td>
<td> Text , numbers </td>
</tr>
<tr>
<td> Test Procedure: </td>
<td> Expected Result: </td>
</tr>
<tr>
<td> Step 1. Select a record. </td>
<td> If not selected shows that should select a record. </td>
</tr>
<tr>
<td> Step 2. Click delete. </td>
<td> Press the delete button, system show a warning message (are you sure?), if click ok button, it will remove from system and database
</td>
</tr>
<tr>
<td> Step 3. The record does not exist in database. </td>
<td> Data doesn’t exist in database. </td>
</tr>
</table>

<table>
<caption> UC-4: Printing </caption>
<tr>
<td> Test-case Identifier: </td>
<td> TC-4 </td>
</tr>
<tr>
<td> Use Case Tested: </td>
<td> UC-4, main success scenario </td>
</tr>
<tr>
<td> Pass/fail Criteria: </td>
<td> The test passes if the record is printed, fails if not. </td>
</tr>
<tr> 
<td> Input Data: </td>
<td> Numbers and texts. </td>
</tr>
<tr>
<td> Test Procedure: </td>
<td> Expected Result: </td>
</tr>
<tr> 
<td> Step 1. Select a form print. </td>
<td> The page must be printed. </td>
</tr>
<tr> 
<td> Step 2. Click on print button. </td>
<td> The System prints the form for you. </td>
</tr>
</table>


<table>
<caption> UC-5: Editing  </caption>
<tr>
<td> Test-case Identifier: </td>
<td> TC-5 </td>
</tr>
<tr>
<td> Use Case Tested: </td>
<td> UC-5, main success scenario </td>
</tr>
<tr>
<td> Pass/fail Criteria: </td>
<td> The test passes if the record is changed,
If not changed than the test fails </td>
</tr>
<tr>
<td> Input Data: </td>
<td> Text , numbers </td>
</tr>
<td>
Test Procedure: 
</td>
<td> Expected Result: 
</td>
</tr>
<tr>
<td> Step 1. Select a record. </td>
<td> If not selected shows that should select a record. </td>
</tr>
<tr>
<td> Step 2. Click edit </td>
<td> System will show a new form that is editable. You can edit any field of your choice. Select the field and edit as you want.
Fill in the correct fields.
 </td>
</tr>
<tr>
<td> Step 3. Click ok. </td>
<td> If not filled correctly, the system will prompt you to fill in the correct field. </td>
</tr>
<tr> 
<td> Step 4. Correct the field. </td>
<td> You must now be filled the correct field. </td>
</tr>
<tr> 
<td> Step5. Click ok. </td>
<td> The field is now changed. And in database it’s changed. </td>
</tr>
<tr>
<td> Step6. Check in database. </td>
<td> If the field is changed, the test is passed else the test fails. </td>
</tr>
</table>
