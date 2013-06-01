package models;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;

import play.data.validation.Constraints.Required;
import play.db.ebean.Model;
import play.data.format.*;

@Entity
public class Personal extends Model{
	
	

	@Id
	public Long id;
	
	@Required
	public Long rollNumber;
	
	@Required
	public String name;
	
	@Required
	public String fatherName;
	
	public Long  nationalIdCardNumber;
	
	public String familyName;
	
	public String grandFatherName;
	
	public String occuption;
	
	
	public Date dateOfBirth;
	
	public String address, email;
	
	public Long telephoneNumber, age , emergencyNumber;
	
	public Long salary;
	
	public boolean isPercentage, notPercentage, both;
	
	public Long percentage;
	public String section;
	
	public boolean isready;
	
	public String info;
	
	public static Finder<Long, Personal> find = new Finder<Long, Personal>(Long.class, Personal.class);
	
	
	public Personal(){
	}
	
	public Personal(String name, String fatherName, String grandFatherName, Long age, Date dateOfBirth,
			String email, String address, Long telephoneNumber, Long emergencyNumber, Long salary, 
			boolean isPercentage, boolean notPercentage, boolean both, Long percentage, boolean isReady, String info){
		
		this.name = name;
		this.fatherName = fatherName;
		this.grandFatherName = grandFatherName;
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
	
	public static void deletePersonal(Long id){
		find.ref(id).delete();
		
	}
	
	public static void createPersonal(Personal personal){
		personal.save();
	}
	public static Personal editPersonal (Long id){
		return find.where().eq("id", id).findUnique();
	}
	
	public static List<Personal> filterByName(String name){
		
		return (List<Personal>) find.where().orderBy(name);
	
}
	
	


}
