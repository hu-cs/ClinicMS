package models;

import java.util.List;
import java.util.ResourceBundle;

import javax.persistence.Entity;
import javax.persistence.Id;

//import bundle.Texts;

import play.data.validation.Constraints.Required;
import play.db.ebean.Model;
//import useTexts.Uses;

@SuppressWarnings("serial")
@Entity
public class Personal extends Model {
	//Texts text =  new Texts();
	
	 
	public Personal(){
		
	}
	
	@Id
	public Integer id;

	@Required(message = "خالی بوده نمی تواند")
	public String name;

	@Required(message = "خالی بوده نمی تواند")
	public String fatherName;

	public int nic;
	
	@Required(message = "خالی بوده نمی تواند")
	public String proficiency;
	
	@Required(message = "خالی بوده نمی تواند")
	public String job;
	
	@Required(message = "خالی بوده نمی تواند")
	public Long phone;

	@Required(message = "خالی بوده نمی تواند")
	public boolean active;
	
	@Required(message = "خالی بوده نمی تواند")
	public String address;

	public int salaryPercentage;
	
	public int salaryContracted;
	
	public String image;
	

	public Personal(Integer id, String name, String fatherName,
			int nationalIdCardNumber, String proficiency, String job,
			Long phone, boolean active, String address, int salaryPercentage,
			int salaryContacted, String image) {
		super();
		this.id = id;
		this.name = name;
		this.fatherName = fatherName;
		this.nic = nationalIdCardNumber;
		this.proficiency = proficiency;
		this.job = job;
		this.phone = phone;
		this.active = active;
		this.address = address;
		this.salaryPercentage = salaryPercentage;
		this.salaryContracted = salaryContacted;
		this.image = image;
	}

	public static Finder<Integer, Personal> find = new Finder<Integer, Personal>(
			Integer.class, Personal.class);


	public static List<Personal> all() {
		return find.all();
	}
}
