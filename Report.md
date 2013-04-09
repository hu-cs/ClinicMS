
*	Software Engineering Project *
	

** Clinic Management System **

*** Submission: 15 March 2013 ***

Team Members:   return
	Ahmad Ahmadi Rad  		         ID:   return
	Ahmadullah      					  ID: 20592   return
	Mohsen Parsa					   ID:    return 
	Tahira Mohammadi				   ID:    return
	Hadisa Nowrozi					   ID:   return
	Fatima Qasemi					   ID:   return

Table of Contents:	   return
#### Part One:    ####   return

 >1. Customer statement of Requirement.
a.	*	Problem statement

>2. System Requirements.
*	Enumerated Functional Requirements.
*	Enumerated non-functional Requirements.
*	On Screen appearance requirements.
#### Part Two:  ####    return 
>1. Functional Requirements specification.
*	Stock holders.
*	Actors and Goals.
*	Use Cases.
*	Sequence Diagram.
>2. User Interface Specification.
*	Preliminary Design.
*	User Effort Estimation.
Part Three:
·	Domain Analysis.
·	Domain Model.
·	System Operation contracts.
·	Mathematical Model.
1.	Plan of Work.
2.	References.




Our requirement specification is as follows:     return 
1.	Data reporting and analyzing
2.	Calculating incomes and Budget reporting
3.	Stock and expenditure report
4.	Laboratory  testing results
5.	Patients information report
6.	Lack of using database and back up from information
7.	Operation room data report
Domain Models:  List of all our System Modules.		Return
1.	Reception 
2.	Laboratory
3.	Medical Store
4.	Operation theater ( ICU ) 
 

#####All members are contributed equally.#####    return



#### Customer Statement of Requirement. ####
	As a result of several interview that we had with our Customer. Not just one of them, we had extra interviews with other health care environments. We had interviews with these places listed as follows.	return
1.	Hakim sanayee Clinic
2.	Panjtan Al Aba
3.	Jebraiel Governmental Hospital.
4.	Hashemi Medical Store.
5.	Mohammadi Medical Store.
6.	Jakan Medical Store.
7.	Nazary Medical Store.
8.	Al-berouni Private Hospital.
9.	Khalid Medical Store.
They were talking about their problems they had with the environment system.    return
The system that is being used by people is mostly just papers and pen.    return
	There is several requirements that should be solved.	return
Such as: 	return
If a patients lost his or her description. Patients has no backup how doctors should know, which kind of drugs she has been using. And it was a lot of time consuming and also they must pay money for every paper that they were using for their patients. It was so difficult for them if they were moved from one place to another place to move all the records of their patients if they had some.    return
And it can be easily stolen. Could be damaged soon, burned or being useless, and holds place. And also difficult to take care of.    return
There was a man saying that for every dose that we were selling we must give a receipt for the customer. And it’s a bit time consuming work.	return
 And more than that it was difficult for a guy to sit on cash draws and count every person’s bill, it’s a bit annoying work for some people. They don’t like too much counting.	return
Several customers saying that, the system can help us with this problem.		return
With counting, time serving, no more loss of records, it helps us to be more confident, more reliable, and accurate. A customer said to us, about his problem facing with his work on medical was the fake or not real doses that they had in his medical store, and had the real one, if you could build us with a system that can distinguish between this doses. We’ll be so grateful.	return 
Another customer was talking about problem with the counting of his bill, he said that we have a lot of patients and I don’t have enough time to calculate the bill for them, most of the time I make mistakes in calculating them. And this is a loss of money for me.	return
Another problem was with the record of their patients, they didn’t have a record from their patients.	return
If you survey the clinical laboratories, you wouldn’t find one record.	return
Because of that they couldn’t find the real number of people affected by a disease in a country.
Also you couldn’t’ have access the records from another place, and watch for your records and drugs that have been used by patient. If a patient wants to get to his or her records from another place to show to another doctor for his or her treatment she couldn’t if she lost his/her record that was with him/her.    return 
You could access your records from another treatment site and get the information about your patients and be able to advise them some treatments or take a result.	return
In reality it had two kind of problem first one was with the hospital or Medical stores.    return
The second one was with the patients.    return 
First one is quite difficult to diagnose but it’s possible to diagnose it.	return 
For your medical store, hospitals or another health care agencies. It’s good to know about your patients everything, it helps doctors to take a better result from the treatments. Or can change the treatment process if it’s not working well. Or have access synchronously several patients’ records if needed.	return	
Or if you want to know the number of affected people by a disease at some particular time. You must serve a lot of time to calculate your patients if you have the whole record of your patients if you don’t lost any if it’s usable at all.	return	
As a patients perspective we can say that client must have a whole record of his/her self in his/her hands everywhere he/she wants to go for treatment. If he/she doesn’t lost some. If he can save for him/herself. If he/she can have their record after an accident.	return
Customer said to us: your system can help us with all of the problem, also make the patients free of their records. And no more caution about their records and reliability of the system.	return
Can solve most of the patient’s problem.	return 
Our proposed management system and design is such that it will give the report of all patients, patient services, making decision and solution of your daily problem, such as better services to people, and also stock reporting link, getting information about your everyday drug sales, visited doctors, descriptions, personnel reporting, Operation treatments, patients payment, drug repository reporting in time scale of daily, monthly, yearly reporting. On the other hand also laboratory reporting give the information like result reporting and time of report. In patients information you are able to get the all information about your patients including dates and times he/she arrived. It’s also capable of securing by restricting access to the data in your database. In operation treatment, the software gives description of your Operations, available rooms, which doctor is in charge, patient’s payment and what kind of operation they had at what time.
Qods clinic requirements:	return	
According to our interview that we had with Mr. Saedi and visiting from Qods clinic. Khadhra team understood the requirements to be as such:	return
1.	Data reporting and analyzing
2.	Calculating incomes and Budget reporting
3.	Stock and expenditure report
4.	Laboratory  testing results
5.	Patients information report
6.	Lack of using database and back up from information
7.	Operation room data report

**User story:**	return	 
 
User Story	Priority	Description	   
Us-1	3	User shall use barcode reader or manual entering of dose names. Druggist can manually enter the name of medicine.	   
Us-2	10	User shall save names and cost and so on of drugs in drug store and can calculate the number and incoming form selling of drugs.	   
Us-3	7	User must be reported for thesaurus and calculate that how much drug was sold and how much the clinic earn and warn of the date of drugs expired.	   
Us-4	4	User shall easily work with GUI.	   
Us-5	5	The user has the ability to categorize the drugs.	   
Us-6	6	The user should view the salaries according to month, day, and year and according to percentage. Because some of personal contact in salary per month and some other contact   according to percentage of incoming.	   
Us-7	5	User also must be able view worker working double shifts.	   
Us-8	10	User shall print the receipt and laboratory result on demand.	   
Us-9	10	User shall search in database about incoming, personal, patient, drugs, equipment and so on.	   
Us-10	8	User must have the Ability of updating the information of drugs in drug store.	   
Us-11	7	User must have Ability to see the list of patient, drugs, and personnel and print the list on demand.	   
Us-12	10	User must Save, edit and delete information about patient and operation that occurs in operation room on demand.	   
Us-13	5	User must see the calculation of the price of room that patient reserve and announce how many room are reserved.
On demand.	   
Us-14	7	Above ability must be concerned on parturition room.	 

__Functional Requirements:__     return 
1.	Using both Barcode reader and manual entering the names of drugs in drug store and store.
2.	Can enter and save names and cost and so on of drugs in drug store and system can calculate the number and incoming form selling of drugs and decrease the numbers of drugs form thesaurus.
3.	Thesaurus subsystem and this subsystem calculate that how much drug was sold and how much the clinic earn and warn of the date of drugs when they expired.
4.	Using and design GUI that easily druggist can enter the name of drugs and the subsystem calculate the price and other calculation.
5.	If the drug be categorized in the some groups according to their made or kind, it is easier to enter the drugs in system.
6.	The system should have this ability that calculates the salaries according to contact which is in percentage or month, day, shift and both feature. Because some of personal contact in salary per month and some other contact   according to percentage of incoming.
7.	Some of the doctors and nurses contact to work on other shift and in three category, their salaries are according to percentage or shift or both. So system should add these salaries to their total salary and save it.
8.	Print the receipt in reception subsystem and test sheet in laboratory.
9.	Ability of searching in database about incoming, personal, patient, drugs, equipment and so on.
10.	Ability of updating the information of drugs in drug store.
11.	Ability of updating or editing the information about personal.
12.	Ability to see the list of patient, drugs, personnel and print the list if it is necessary.
13.	Save, edit and delete information about patient and operation that occurs in operation room and parturition part.
14.	The system calculate the price of room that patient reserve and announce how many room are reserved and how many are free and for how long.
15.	The system should have reliable database.
16.	Using open source technology and DBMS.
17.	We need barcode reader to read barcode in drug store.
18.	This system should be network base; run on one PC and other connect to it.
19.	The system should connect to printers to print the lists and other information and receipt.
20.	We need camera or scanner to enter photo of personal in to system specially doctors and nurses.
21.	The system will show graph of incoming and cost and data mining graph. 
22.	It is necessary to train the personal of clinic and we will train it.
23.	We will support the system for six month.

 
Stakeholders: Our stakeholder is Qods Clinic.	return
Actors and goals: Several people are involved in our system. Such as:    return	
Druggist, Laboratory guy, Manager, Doctors, and receptionist.    Return	
And several devices Camera, Printer.    Return	
Druggist is responsible for adding new Medicine in System.	return
Laboratory guy is responsible for entering results of test and can print the test manual.	Return	
Manager is responsible for managing all the system.	Return	
Doctors can view the results of the tests and medicine used by the patients. Can validate if necessary. For more laboratory test or advice new medicine.	Return 
Receptionist is responsible for printing the receipt for every patient who want to visit doctor. Not for guest of doctors.    Return	
A printer has a role of printing the result of a test and a receipt. And many necessary test print or report prints.    Return	
Camera: a camera is used for taking pictures of the patients.	Return	
SubSystem1:	return 
Reception is responsible for the printing the receipt for every patient who wants to visit doctor. Take the full description of the patient and print a receipt for the patient. This receipt will give the patient authority to visit the doctor otherwise the patient will not be able to visit doctor.    Return 
The subsystem1 can hold this kind for information in system. Save it, and the result will be a print and the patients will be added to the system, if the patients is new the record is added, if the patient had come several time before the old receipt is printed for the patient and a  bar show that he/she how many time has visited here. The records can be deleted from the system. The subsystem does the printing also.	return
Except for Emergency Patients they will be able to get the receipt later.	Return 


SubSystem2:	return
Medical or Drug /Store : is responsible for adding new dose to the system and entering new rates to doses and can edit the rate and name of the medicines in Drug store. If medicine is not available in store they can note it as not available in store. Druggist values to add more doses in system and print it.    Return 
Can view and edit the patient’s records.	Return 
Subsystem2 is doing the job of saving all the medicines in system and storing and saving and choosing it’s the right person that access to the system, by showing the menu for accessing user name and password.    Return 
Printing, deleting, saving, or editing, can be applied to the records.    Return 
	return
SubSystem3:	return
Laboratory: this guy is responsible for the testing to laboratory and adding the result of the tests to the system. After it’s added to the system it can be viewed and be able to be edited, deleted and printed.	return
The system does all the first time temporary saving and user can choose to save or not to.	return
	return
SubSystem4: 	return 
Operation room: this system is designed for the operation room.	Return 
Every result of laboratory test and medicine that the patients has used before is reported to the operation room. The operation when the operation is complete.
The result can be added to the patient link that shows that the patient is been to Operation Theater.	Return  

subSystem5: parturition it’s for the patients about the pregnancy and other related disease.
	The patients must be listed here, according to their sickness type that the patient has.
	Return	
	return
SubSystem6: Office	return
	Office is for managing all the aspect of Hospital. This part is for manager and Administrators,
Who has the ability to all of the resources in hospital? To manage it.	return
	return
	return
Traceability Matrix: shows the mathematical calculation of the project. Such as:
1.	When patients came, after the checking they must be pay for those.
2.	Doctors, nurses, and workers want salary in-order to work.

Salary of doctors per month =    return
Salary of nurses per month =    return
Salary of worker per month =	return
                                                       	Count all of them.    return
Check out for patients if it reaches to particular point. Count them with percentages. How 
		Scenario: checkout for patients if the patient is under 40 than
			Count all the money got from patients, find the defined percentage return the result.	return
		Ex: there is 40 patients every patient has purchased medicine and the total of them is 90000 if a doctor takes percentages than assume he’s taking 5% of all    return
			90000 = 100    return
			X          = 5             x = 4500    return
That is done.	return
Check out for every person and check for the occupation: doctor, nurse, and worker. Count all the salary of them and give the output as a total amount of payment. And take notice if occupation is doctor count all the doctors, nurses, workers. Show the total amount of the salary of doctors, workers, nurses and display it. Check if a doctor has took the salary of every month. If not then add the previous salary to this salary and give the result.
	For the medical: take every medicine’s rate, and the dose percentage check out how many of this kind has been sold, if n kind than n * rate = total amount. 	return
	return
If the company want the profit. Than all amount of money the Clinic got it should be minuses from the amount of money the company has to spend.
Or has given to Companies that the hospital gets medicines from.
We normally have two kinds of Spends 
1.	Constant    return    
2. Dynamics    return
Constants: is constant like the bills, Cars etc.	return
Dynamics: are not possible to assume maybe some time a lot maybe some time very less.    return  
			
		
			
Fully Dressed Description: I start here with the User manual how he/she enters to the System. I’ll not cover all of them here because it’ll be so long to.
	First of all when the application opens, a window opens than it asks for user name and password. And then click ok the user is logged in.
After it recognize that the user is from which part he’s medical store, opt theater, or office or from the other part. That user only access on his own part not the others the other parts will be disabled for that user. 
How a reception can add new patients: 
When the come in the receptionist takes his/her full specification. The patient decides to go where. Opt, visit doctor, or parturition or laboratory. And the amount of money he/she should pay for the receipt. After the patient decide to go where the receipt will be printed. By clicking the print button.
I have covered the two of them. There is several more. 
System Sequence diagram: draw a system sequence diagram selected above.
    
                     Main page                                 login

this lines are not showing the inheritance it show the sections.


RP                 Lbt                     Office 	       Md stre		      prtn                      opt 


Add new Patients                                    sell                 edit                add

RP = receptionist              prtn = parturition	return
Lbt =  Laboratory              opt = operation Theater	return
Md stre = Medical store  	return 
	return
User interface specification:	return
1.	How user logs in: 
i.	First a dialog opens, to choose who is he/she if, it selects and types his/her name than the password.
ii.	Than the main page will open, the places that the reception can access will be enabled to work, the other part that he/she doesn’t have access will be disabled, for example: receptionist doesn’t have access to the Operation Theater. You would see some more information around on picture. Medical(1)
iii.	The receptionist wants to add a new patient to the database. Fill in the blanks full description of patient. There is several choice that a patient can make reserve for timing or go to parturition, visit doctor, and Operation Theater.
iv.	After that receipt is printed for that patient. With the description of patient.
All pictures all included with the document. You can see all of them.
		On our model that the customer wants, several reports must be printed. 


**Part3:**    return

Domain Model: Our work domain model is as follows:	return	
Head of the Hospital is one person, after his supervisors.1 for management and one for all medical, as shown on picture it’s divided as shown on the picture you can zoom it if it’s not possible to see.    return	

![alt image1] (/image1.jpg)
 











**Plan of work:**
1.	IterationNo.1(first subsystem: reception)
·	 Functional requirement and analyzing 		March 23, 2013
·	GUI	March 27, 2013
·	Interaction diagram and UML	March 29, 2013
·	Coding and implementation and testing 	April 5, 2013
·	Present first subsystem to customer	April 6, 2013
2.	IterationNo.2 (second subsystem: drugstore and store)
·	Functional requirement and analyzing 		April 7, 2013
·	GUI	April 11, 2013
·	Interaction diagram and UML	April 13, 2013
·	Coding and implementation and testing 	April 17, 2013
·	Present first subsystem to customer	April 18, 2013
3.	IterationNo.3 (third subsystem: operation room)
·	Functional requirement and analyzing 		April 19, 2013
·	GUI	April 23, 2013
·	Interaction diagram and UML	April 25, 2013
·	Coding and implementation and testing 	April 29, 2013
·	Present first subsystem to customer	April 30, 2013
4.	IterationNo.4 (fourth subsystem: parturition room )
·	Functional requirement and analyzing 		May 1, 2013
·	GUI	May 5, 2013
·	Interaction diagram and UML	May 7, 2013
·	Coding and implementation and testing 	May 12, 2013
·	Present first subsystem to customer	May 13, 2013
5.	iterationNo.5 (fifth subsystem: laboratory)
·	Functional requirement and analyzing 		May 14, 2013
·	GUI	May 19, 2013
·	Interaction diagram and UML	May 21, 2013
·	Coding and implementation and testing 	May 26, 2013
·	Present first subsystem to customer	May 27, 2013
6.	iterationNo.6 (sixth subsystem: office)
·	Functional requirement and analyzing 		May 28, 2013
·	GUI	June 1, 2013
·	Interaction diagram and UML	June 3, 2013
·	Coding and implementation and testing 	June 8, 2013
·	Present first subsystem to customer	June 9, 2013
7.	iterationNo.7 
·	merge and testing 	June 12, 2013
·	run of server and training 	June 18, 2013

 __Member’s followings:__
![alt image2] (/image2.jpg)
 
 
![alt image3] (/image3.jpg)
 


References:    return 
	return		 
	return
[rutgers]:  www.rutgers.com  				“Rutgers Site”
 __Practitioners guide approach 7th edition	__	
__practice software object oriented practices.__	
[bing]:  www.Bing.com 					“bing”
[wikipedia]:  www.Wikipedia.com			“Wikipedia”
[google]:  www.Google.com				“google”


