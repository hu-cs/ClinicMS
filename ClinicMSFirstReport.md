# Software Engineering Project #
<p>
<b>Clinic Management System (Abnos)<b/>
<p/>

<p>
<b>Submission: April 10, 2013<b/>
<p/>


<p/>
![khadra logo](https://github.com/hu-cs/ClinicMS/blob/master/images/logo.png?raw=true)
<p/>

<p>
<b>Team Members:<b>
<p/>
<table>
    <tr>
        <td><b>ID</td><td><b>Name</td><td><b>Job</td> 
    </tr>
	    <tr>
        <td><b>20498</b></td><td><b>Ahmad Ahmadi Rad</b></td><td><b>DB Designer</b></td>
    </tr>
    </tr>
	    <tr>
        <td><b>20592</b></td><td><b>Ahmadulla Haden</b></td><td><b>DB Designer</b></td>
    </tr>
    </tr>
	    <tr>
        <td><b>20601</b></td><td><b>Fatema nowroozi</b></td><td><b>Programmer</b></td>
    </tr>
    </tr>
	    <tr>
        <td><b>20599</b></td><td><b>Tahera Mohammadi</b></td><td><b>Programmer</b></td>
    </tr>
    </tr>
	    <tr>
        <td><b>20695</b></td><td><b>Hadisa Qasemi</b></td><td><b>Software engineer</b></td>
    </tr>
    </tr>
	    <tr>
        <td><b>20445</b></td><td><b>Mohsen Parsa</b></td><td><b>Software engineer</b></td>
    </tr>
</table>
<p/>

<p>
<h2> Table of Content</h2>
<b>
<p/>
1. Customer statement of requirement<br/>a. Problem statement
<p/>

<p>
## table of content ##

1. Customer statement of requirements
  * Problem statement
2. User stories
3. Actual numbers don't matter, just that it's a number
  * Stockholders
  * Actors and goals
4. Use case
  * Casual description
  * Use case diagram  
5. User interface specification
  * Preliminary Design
6. Plan of work
  * Time line
  * Project cost estimation
  * Our methodology
  * Members's Activities
<p/>

<h2> 1. Customer Statement of Requirement: </h2>
<p>
<b>a. Problem statement<b/>
<p/>
<p>
According to our experience in public health care domain and as a result of several interviews that we had with our Customer, we had extra interviews with other health care centers. We had interviews with these ones, listed as follows.
<p/>

<p>
<b>
1.	Qods Clinic<br/>
2.	Hakim sanayee Clinic<br/>
3.	Panjtan Al Aba Clinic<br/>
4.	Jebraiel Governmental Hospital.<br/>
5.	Hashemi Medical Store.<br/>
6.	Mohammadi Medical Store.<br/>
7.	Jakan Medical Store<br/>
8.	Nazary Medical Store.<br/>
9.	Al-berouni Private Clinic.<br/>
10.	Khalid Medical Store.<b/>
<p/>

<p>
They were talking about their problems they had with their system. The system that is being used by people is mostly just papers and pen. There are several requirements that should be solved. Such as:
<p/>

<p>
If a patient lose his or her description, patients has no backup, how doctors should know which kind of drugs she/he has been using and it waste a lot of time and also they must pay money for every paper that they were using for their patients. It is so difficult for them. They saying that for everything that we sell we must give a receipt for the customer. And it’s a bit time consuming work. Several customers say that your system can help us about this problem. It helps us to be more confident, more reliable, and accurate. With this system we can manage our clinic in different parts and departments. In drugstore with this system we can enter the drug name and numbers of drugs and system calculates and save the information in database. It helps us to manage and organize the salaries the shift of personals. A big problem was that we did not have any record of our patients. If you survey the clinical laboratories, you wouldn’t find one record in past but with this system we will have a good back up of our records and data. According to the reliable database that they use it will be reliable. They couldn’t find the real number of people affected by a disease in duration of our service. But now we have data and the system will show the incoming and the patients that served with us by graphs. Also now officer can control and check other subsystems (all subsystems) record, status of beds that how many are reserved and by whom, situation in laboratory that how many patients came to laboratory and how much money we earn, about ambulances, appointments of doctors and accounting from office by this system. Customer said, your system can help us with the entire problem, also make the patients free of their records. And no more caution about their records and reliability of the system can solve most of us and our patient’s problem.
<p/>
<p>
We are honor that our proposed management system and design is such that it will give the report of all patients, patient services, making decision and solution of your daily problem, such as better services to people, and also stock reporting link, getting information about your everyday drug sales, visited doctors, descriptions, personnel reporting, Operation treatments, patients payment, drug repository reporting in time scale of daily, monthly, yearly reporting. On the other hand also laboratory reporting give the information like result reporting and time of report. In patients information you are able to get the all information about your patients including dates and times he/she arrived. It’s also capable of securing by restricting access to the data in your database. In operation treatment, the software gives description of your Operations, available rooms, which doctor is in charge, patient’s payment and what kind of operation they had at what time.
<p/>

<p>
According to our interview that we had with Mr. Saedi (Casher of Qods Clinic) and Dr. Rezai (Manager of Qods Clinic) Khadhra team understood the requirements to be such as:
<p/>
<p><b>
1.	Data reporting and analyzing<br/>
2.	Calculating incomes and Budget reporting<br/>
3.	Stock and expenditure report<br/>
4.	Laboratory  testing results<br/>
5.	Patients information report<br/>
6.	Lack of using database and back up from information<br/>
7.	Operation room data report<br/>
<b/>
<p/>

<p>
<h2> 2.	User Stories <h2/>
<p/>

<p>
<b>Team Members:<b/>
<p/>
<table>
    <tr>
        <td><b>Identifier</td><td><b>User Stories</td><td><b>Size</td> 
    </tr>
	    <tr>
        <td><b>ST-1</b></td><td><b>As a tenant I can, configure the system to allow authorized person to enter the system.</b></td><td><b>7 points</b></td>
    </tr>
    </tr>
	    <tr>
        <td><b>ST-2</b></td><td><b>As an authorized person (tenant or landlord), I can enter the identities of patient and save it in system.</b></td><td><b>5 points</b></td>
    </tr>
    </tr>
	    <tr>
        <td><b>ST-3</b></td><td><b>As a tenant, I can order the system, by pressing button and print a receipt for patient.</b></td><td><b>5 point</b></td>
    </tr>
    </tr>
	    <tr>
        <td><b>ST-4</b></td><td><b>As a tenant I can save information about the patient which reserved time for visiting and system will alarm ten minutes to deadline of reserved time.</b></td><td><b>4 points</b></td>
    </tr>
    </tr>
	    <tr>
        <td><b>ST-5</b></td><td><b>As a tenant I can order the system to print a bill about reserved time with information of doctor and time on it which system prepared.</b></td><td><b>3 points</b></td>
    </tr>
    </tr>
	    <tr>
        <td><b>ST-6</b></td><td><b>As a landlord, I can search in database about incoming, personals, patients, drugs.</b></td><td><b>6 pointsr</b></td>
    </tr>
    <tr>
        <td><b>ST-7</td><td><b>As a landlord I can press the button and system print the list of patient, personal, incoming, if it is necessary</td><td><b>7 points</td> 
    </tr>
	    <tr>
        <td><b>ST-8</b></td><td><b>As a landlord I can see the graph that system produce about incoming and patients who serviced with us. </b></td><td><b>7 points/b></td>
    </tr>
    </tr>
	    <tr>
        <td><b>ST-9</b></td><td><b>As a tenant I can use manually enter the names of drugs of drug store and the system at the first calculate the total price and save the incoming and necessary information in system.</b></td><td><b>5 points</b></td>
    </tr>
    </tr>
	    <tr>
        <td><b>ST-10</b></td><td><b>As a landlord I can use barcode reader to sell drugs in drug store.</b></td><td><b>9 points</b></td>
    </tr>
    </tr>
	    <tr>
        <td><b>ST-11</b></td><td><b>As a tenant I can save information about personal and the system will calculate their salary calculation.</b></td><td><b>6 points</b></td>
    </tr>
    </tr>
	    <tr>
        <td><b>ST-12</b></td><td><b>As a landlord I can manage the thesaurus with system and enter the bought drugs to database and their new price.</b></td><td><b>5 points</b></td>
    </tr>
    </tr>
	    <tr>
        <td><b>ST-13</b></td><td><b>As a tenant I can use system to manage personals about their shift. So system adds these salaries to their total salary and save it.</b></td><td><b>3 points</b></td>
    </tr>
    </tr>
	    <tr>
        <td><b>ST-14</b></td><td><b>As a landlord I can see, the system calculates price of reserved room and how many room are reserved and how many are free and for how long.</b></td><td><b>5 points</b></td>
    </tr>
    </tr>
	    <tr>
        <td><b>ST-15</b></td><td><b>As a tenant I can run the system on one PC as server and other connect to it.</b></td><td><b>9 points</b></td>
    </tr>
    </tr>
	    <tr>
        <td><b>ST-16</b></td><td><b>As an authorized person I can connect printers to system to print the lists and other information and receipt.</b></td><td><b>6 points</b></td>
    </tr>
    </tr>
	    <tr>
        <td><b>ST-17</b></td><td><b>As a tenant I can connect camera or scanner to system and enter photo of personals.</b></td><td><b>3 points</b></td>
    </tr>
    </tr>
	    <tr>
        <td><b>ST -18</b></td><td><b>As a tenant I connect the system to reliable DBMS.</b></td><td><b>8 points</b></td>
    </tr>
    </tr>
	    <tr>
        <td><b>ST-19</b></td><td><bAs a tenant I can easily use the System cause of its user friendly GUI</b></td><td><b>5 points</b></td>
    </tr>
    </tr>
	    <tr>
        <td><b>ST-20</b></td><td><b>As a tenant I am sure about its security because of open source technologies which used.</b></td><td><b>9 points</b></td>
    </tr>
</table>
<p/>


<p>
## 3.	Functional  Requirement Specification:  ##
<p/>

<p>
<b>a. Stockholders<b/>
<p/>

<p>
<b>
1.	The project sponsor: Qods Clinic.<br/>
2.	2.	The project manager: Mr. Ahamd Ahmadi Rad<br/>
3.	The project team: <b/><br/>
4.	Customers: Clinics and Care Centers specially Qods Clinic<br/>
5.	Users: manager of Admin of Clinic, druggist, Receptionist and other persons that have interaction with clinic.<br/>
6.	Opponents: other software team and Companies<br/>
<p/>

<p/>
![khadraTeam](https://github.com/mohsen-parsa/images/blob/master/khadhraTeamProfile.png?raw=true)
<p/>

<p>
<b>b. Actors and goals<b/>
<p/>

<p>
Several people are involved in our system. Such as:
<p/>
<p>
1.	Manager of clinic or Admin: manager of admin can manage and supervise all subsystem and department.<br/>
2.	Druggist: druggist just works with drug store subsystem and enters the name of sold drugs and some information about prescription.<br/>
3.	Laboratory personal: they just work with laboratory subsystem and should enter the result of tests into system to record and printing the result sheet of test.<br/>
4.	Receptionist: receptionist receives the patients and registers them into system and has interaction with operation room, parturition department and laboratory department.<br/>
5.	Bar Code Reader: this device use in drug store to make easier the selling.<br/>
6.	Scanner and Camera: these devices used in office to enter personal's photo into system to complete their identity form. <br/>
7.	Printer: this device use in office to print the information of system if it necessary, in reception to print the receipts and in laboratory department to print the result sheet.<br/>
<p/>


<p>
## 3.	Use case  ##
<p/>


<p>
<b>a. Casual description<b/>
<p/>
<p>
![subsystems](https://github.com/mohsen-parsa/images/blob/master/subsystems.png?raw=true)
<p/>

<p>
<b>Use case 01(reception):<b/>
<p/>
Reception is responsible for the printing the receipt for every patient and get information of patient want to visit doctor and reserve the time for visit doctors or patient that need operation or want to test. Receive call about ambulance and mange ambulances.
Requirements:
<p/>
<p>
1.	Print the receipt for patient that want visit doctors, need operation room, laboratory or bed.<br>
2.	Saving, editing, searching and deleting information about patient and operation that occurs in operation room and parturition department and bed status.<br/>
3.	The system calculate the price of room that patient reserve and announce how many room are reserved and how many are free and for how long.<br/>
4.	The system should accept printers to print the lists and other information and receipt.<br/>
5.	Saving, editing, searching and deleting information about calling for ambulances.<br/>
<p/>

<p>
<b>
Use Case 02 (Drug store):
<b>
<p/>
<p>
Medical or Drug Store: is responsible for adding new dosing and entering new rates to doses and can edit the rate and name of the medicines in Drug store.<br/>
<p>
<b>Requirements<b/>
<p/>
<p>
1.	Using both Barcode reader and manual entering the names of drugs in drug store and thesaurus.<br/>
2.	Can enter and save names and cost and so on of drugs in drug store and system can calculate the number and incoming form selling of drugs and decrease the numbers of drugs form thesaurus.<br/>
3.	Using and design GUI that easily druggist can enter the name of drugs.<br/>
4.	If the drug be categorized in the some groups according to their made or kind, it is easier to enter the drugs in system.<br/>
5.	Saving, editing, searching and delete information about prescriptions.<br/>
6.	We need barcode reader to read barcode in drug store.<br/>
<p/>
<p>
<b>
Use Case 03 (Operation Department):
<b>
<p/>

<p>	
The receptionist registers the patient that need to operation into system and after operation if he/ she need bed reserve the bed to her/him.	
<br/>
<p/>
<p>
<b>
Requirements:
<b/>
<p/>
<p>
1.	Saving, editing, searching and deleting information about patient.<br/>
<p/>

<p>
<b>
Use Case 04 (Office):
<b/>
<p/> 

<p>
Office is for managing all the departments of clinic. This part is for manager and Administrator. This part divide to two parts, one accounting which calculate the incoming of all departments and salaries of personals and we have graphs of number of patients, incoming and sold drugs; part to personals, registrations of  personal and arrangement of shifts are in this part.
<p/>
<p>
<b>
Requirements:
<b/>
<p/>

<p>
1.	The system will show graph of incoming and cost and data mining graph.<br/> 
2.	We need camera or scanner to enter photo of personal in to system specially doctors and nurses.<br/>
3.	The system should connect to printers to print the lists and other information.<br/>
4.	This system should be network base; run on one PC and other connect to it.<br/>
5.	Using open source technology and DBMS. <br/>
6.	The system should have reliable database.<br/>
7.	Saving, searching, edit and delete information about personal.<br/>
8.	Ability of searching in database about incoming, personal, patient, drugs, equipment and so on and control on all departments.<br/>
9.	Some of the doctors and nurses contact to work on other shift and in three category, their salaries are according to percentage or shift or both. So system should add these salaries to their total salary and save.<br/>
10.	The system should have this ability that calculates the salaries according to contact which is in percentage or month, day, shift and both feature. Because some of personal contact in salary per month and some other contact   according to percentage of incoming.<br/>
11.	Using and design user friendly GUI.<br/>
<p/>
<p>
Use Case 05 (Laboratory):
<b/>
<p/>
<p>
Laboratory is responsible for the testing and adding the result of the tests to the system. After it’s added to the system it can be viewed and be able to be edited, deleted and printed.
<p/>
<p>
<b>
Requirements:
<b/>
<p/>
1.	Saving, editing, searching and deleting information about test.<br/>
2.	Need printer to print the result sheet.<br/>
<p/>

<p>
<b>
Use Case 06 (Parturition Department):
<b/>
<p/>
The receptionist registers the patient that need to operation into system and after operation if he/ she need bed reserve the bed to her/him.<br/>
<p/>

<p>
Requirements:
<p/>
<p>
1. Saving, editing, searching and deleting information about patient.
<p/>

<p>
<b>b.	Use Case diagram:<b/>
<p/>

<p>
![subsystems](https://github.com/hu-cs/ClinicMS/blob/master/images/useCase1.png?raw=true)
<p/>

<p>
![subsystems](https://github.com/hu-cs/ClinicMS/blob/master/images/useCase2.png?raw=true)
<p/>

<h2> 5.	User interface specification: </h2>
<p>
<b>a.Preliminary Design<b/>
<p/>
<p>
This part with Mock up is in other file.
<p/>

<h2>6. Plan of work: </h2>
<p>
<b>a.	Timeline:<b/>
<p/>

<p>
<table>
    <tr>
        <td>Proposal submittal</td><td>Supplier selections</td><td>Project start</td><td>First Demo</td><td>Second Demo</td><td>Initial review</td><td>Project completion</td>
    </tr>
	<tr>
	<td>15 March 2013</td><td>23 March 2013</td><td>24 March 2013</td><td>25 May 2013</td><td>19 June 2013</td><td>20 June 2013</td><td>22 June 2013</td>
	</tr>
</table>
<p/>


<p>
The below tables consists of the initial milestones identified for the Clinic Management System: 
<p/>

<p>
<b>Iteration No.1(first subsystem: reception)<b/>
<p/>
<table>
	<tr>
	<td><b>No</td><td><b>work must be done</b></td><td><b>delivery time
	</b>
	</tr>
	<tr>
	<td>1</td><td>Functional requirement and analyzing</td> <td>March 23, 2013</td>
	</tr>
	<tr>
	<td>2</td><td>GUI</td><td>March 27, 2013</td>
	</tr>
	</tr>
	<tr>
	<td>3</td><td>Interaction diagram and UML</td><td>March 29, 2013</td>
	</tr>
	<tr>
	<td>4</td><td>Coding and implementation and testing </td><td>April 5, 2013</td>
	</tr>
	<tr>
	<td>5</td><td>Present first subsystem to customer</td><td>April 6, 2013</td>
	</tr>
</table>


<p>
<b>2. Iteration(second subsystem: drugstore and store)<b/>
<p/>

<table>
	<tr>
	<td><b>No</td><td><b>work must be done</b></td><td><b>delivery time
	</b>
	</tr>
	<tr>
	<td>1</td><td>Functional requirement and analyzing</td> <td>April 7, 2013</td>
	</tr>
	<tr>
	<td>2</td><td>GUI</td><td>April 11, 2013</td>
	</tr>
	</tr>
	<tr>
	<td>3</td><td>Interaction diagram and UML</td><td>April 13, 2013</td>
	</tr>
	<tr>
	<td>4</td><td>Coding and implementation and testing </td><td>April 17, 2013</td>
	</tr>
	<tr>
	<td>5</td><td>Present first subsystem to customer</td><td>April 18, 2013</td>
	</tr>
</table>
</p>


<p>
<b>3. Iteration (third subsystem: operation room)<b/>
<p/>
<table>
	<tr>
	<td><b>No</td><td><b>work must be done</b></td><td><b>delivery time
	</b>
	</tr>
	<tr>
	<td>1</td><td>Functional requirement and analyzing</td> <td>April 19, 2013</td>
	</tr>
	<tr>
	<td>2</td><td>GUI</td><td>April 23, 2013</td>
	</tr>
	</tr>
	<tr>
	<td>3</td><td>Interaction diagram and UML</td><td>April 25, 2013</td>
	</tr>
	<tr>
	<td>4</td><td>Coding and implementation and testing </td><td>April 29, 2013</td>
	</tr>
	<tr>
	<td>5</td><td>Present first subsystem to customer</td><td>April 30, 2013</td>
	</tr>
</table>

<p/>

<p>
<b>4. Iteration(fourth subsystem: parturition room )<b/>
<p/>
<table>
	<tr>
	<td><b>No</td><td><b>work must be done</b></td><td><b>delivery time
	</b>
	</tr>
	<tr>
	<td>1</td><td>Functional requirement and analyzing</td> <td>May 1, 2013</td>
	</tr>
	<tr>
	<td>2</td><td>GUI</td><td>May 5, 2013</td>
	</tr>
	</tr>
	<tr>
	<td>3</td><td>Interaction diagram and UML</td><td>May 7, 2013</td>
	</tr>
	<tr>
	<td>4</td><td>Coding and implementation and testing </td><td>May 12, 2013</td>
	</tr>
	<tr>
	<td>5</td><td>Present first subsystem to customer</td><td>May 13, 2013</td>
	</tr>
</table>

<p/>

<p>
<b>5. Iteration (fifth subsystem: laboratory)
<b>
<p/>
<table>
	<tr>
	<td><b>No</td><td><b>work must be done</b></td><td><b>delivery time
	</b>
	</tr>
	<tr>
	<td>1</td><td>Functional requirement and analyzing</td> <td>May 14, 2013</td>
	</tr>
	<tr>
	<td>2</td><td>GUI</td><td>May 19, 2013</td>
	</tr>
	</tr>
	<tr>
	<td>3</td><td>Interaction diagram and UML</td><td>May 21, 2013</td>
	</tr>
	<tr>
	<td>4</td><td>Coding and implementation and testing </td><td>May 26, 2013</td>
	</tr>
	<tr>
	<td>5</td><td>Present first subsystem to customer</td><td>May 27, 2013</td>
	</tr>
</table>

<p/>

<p>
<b>6. Iteration No.1(sixth subsystem: office)
<b>
<p/>

<table>
	<tr>
	<td><b>No</td><td><b>work must be done</b></td><td><b>delivery time
	</b>
	</tr>
	<tr>
	<td>1</td><td>Functional requirement and analyzing</td> <td>May 28, 2013</td>
	</tr>
	<tr>
	<td>2</td><td>GUI</td><td>June 1, 2013</td>
	</tr>
	</tr>
	<tr>
	<td>3</td><td>Interaction diagram and UML</td><td>June 3, 2013</td>
	</tr>
	<tr>
	<td>4</td><td>Coding and implementation and testing </td><td>June 8, 2013</td>
	</tr>
	<tr>
	<td>5</td><td>Present first subsystem to customer</td><td>June 9, 2013</td>
	</tr>
</table>

<p/>

<p><b>7. Iteration No.1(first subsystem: reception)<b/>
<p/>
<table>
	<tr>
	<td><b>No</td><td><b>work must be done</b></td><td><b>delivery time
	</b>
	</tr>
	<tr>
	<td>1</td><td>merge and testing </td> <td>June 12, 2013</td>
	</tr>
	<tr>
	<td>2</td><td>run of server and training </td><td>June 18, 2013</td>
	</tr>
</table>

<p/>

<p>
<b>c. Our methodology:<br/>
<p/>

<p>
The Khadhra team proudly can say we have confident on our own abilities to provide effective Project Management and offer a complete solution in approach of customer’s requirements, we are aware of your human resource limitations, cost concern, so we will provide means of achieving major cost savings. We will integrate proven technologies and tools available in standard markets listed below.
<p/>

<p>
1-	In business logic we will use java technology.<br/>
2-	In graphic and user interface we also use java technology.<br/>
3-	In data and information storing we will use MySQL.<br/>
4-	In hardware technology for tracking the material we will use both manually and barcode reader possibly.<br/>

<p/>

<p>
For product support first we will train you working with software and during one year after run, we will support our product and fix any debug reported. The design will be based on development such you can see the software product demo sequentially in very small units of time, possibly every week. Thus you can advise your changes in details of software product. 
<p/>

<p>
The proposed solution by Khadhra team uses a combination of not complex, but tried and tested tools, and we are aware of copyright, legislative and judiciary aspects of official organizations. Thus we use free but very secure and most popular software development tools available on the market.
Khadhra team is therefore confident and guarantees that the proposed approach will provide the most reliable convenient and efficient software system at the top of market place, which will bring significant, improve on a timescale and within a budget that can be agreed and achieved. Having duly examined your requirements, we are confident that our proposed approach will effectively address your needs.
<p/>

<p>
Our unique ability to PHC domain problem and our successful track record in online support websites for clinics makes us an enviable partner in this project. We look forward to forming a mutually rewarding relationship with Qods clinic.
<p/>
<p>
<b>d. Member’s Activities:<br/>
<p/>

<p>
![khadraTeam](https://github.com/hu-cs/ClinicMS/blob/master/images/memberActivity1.png?raw=true)
<p/>

<p>
![khadraTeam]https://github.com/hu-cs/ClinicMS/blob/master/images/memberActivity2.png?raw=true)
<p/>

<p>
![khadraTeam](https://github.com/hu-cs/ClinicMS/blob/master/images/memberActivity3.png?raw=true)
<p/>