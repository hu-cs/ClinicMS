package models;

import java.util.Date;
import java.util.List;

import javax.persistence.Id;

import play.data.validation.Constraints.Required;
import play.db.ebean.Model;


public class Personal extends Model{
	
	

	@Id
	public Long id;
	
	@Required
	public Long rollNumber;
	
	@Required
	public String name;
	
	@Required
	public String fatherName;
	@Required
	public int nationalIdCardNumber;
	
	public String familyName;
	
	public String grandFathername;
	
	public String occuption;
	
	public Date dateOfBirth;
	
	public String address, email;
	
	public int telephoneNumber, age , emergencyNumber;
	
	public int salary;
	
	public boolean isPercentage, notPercentage, both;
	
	public int percentage;
	
	public boolean isready;
	
	public String info;
	
	public static Finder<Long, Personal> find = new Finder<Long, Personal>(Long.class, Personal.class);
	
	
	public Personal(){
	}
	
	public Personal(String name, String fatherName, String grandFatherName, int age, Date dateOfBirth, String email, String address, int telephoneNumber, int emergencyNumber, int salary, boolean isPercentage, boolean notPercentage, boolean both, int percentage, boolean isReady, String info){
		
		this.name = name;
		this.fatherName = fatherName;
		this.grandFathername = grandFatherName;
		this.age = age;
		this.dateOfBirth = dateOfBirth;
		this.email = email;
		this.address = address;
		this.telephoneNumber = telephoneNumber;
		this.emergencyNumber = emergencyNumber;
		this.isready = isready;
		this.occuption = occuption;
		this.familyName = familyName;
		this.salary = salary;
		this.both = both;
		this.isPercentage = isPercentage;
		this.notPercentage = notPercentage;
		this.rollNumber = rollNumber;
		this.nationalIdCardNumber = nationalIdCardNumber;
		this.occuption = occuption;
		
		isBoth();
		
	}
	public boolean isBoth(){
		if(both==true){
			isPercentage = true;
			notPercentage = true;
			
		} 
		return both;
	}
	
	public static List<Personal> all(){
		return find.all();
	}
	
	public static void delete(Long id){
		find.ref(id).delete();
	}
	
	public static void create(Personal personal){
		personal.save();
	}
	


}
