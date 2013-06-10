package models;

import java.util.Date;
import java.util.List;

import javax.persistence.*;

import play.data.validation.Constraints.*;
import play.db.ebean.Model;

@Entity
public class Parturition extends Model{
	@Id
    @GeneratedValue
	public long id;
	
	@Required
	public String firstName;
	
	@Required
	public String fatherName;
	
	@Required
	public String familyName;
	
	@Required
	public String foreFather;
	
	@Required
	public Date parturitionDate;
	
	@Required
	public long numberOfBaby;
	
	@Required
	public Personal doctor;
	
	@Required
	public String bloodType;
	
	@Required
	public String phoneNumber;
	
	@Required
	public Date birthDay;
	
	@Required
	public String address;
	
	@Required
	public String description;
	
	@Required
	public long charge;
	
	@Required
	public long discount;
	
	@Required
	public boolean Caesareaned;
	
	public static Finder<Long, Parturition> finder = new Finder<Long, Parturition>(
			Long.class, Parturition.class);
	
	public Parturition(String first, String father, String family, String fore,
			Date parturition, long numOfBaby, Personal doc, String blood, String phone,
			Date birth, String add, String desc, long cha, long disc, boolean ces){
		this.firstName = first;
		this.fatherName = father;
		this.familyName = family;
		this.foreFather = fore;
		this.parturitionDate = parturition;
		this.numberOfBaby = numOfBaby;
		this.doctor = doc;
		this.bloodType = blood;
		this.phoneNumber = phone;
		this.birthDay = birth;
		this.address = add;
		this.description = desc;
		this.charge = cha;
		this.discount = disc;

		this.Caesareaned = ces;
	}
	
	public static void createOperation(Operation user) {
		user.save();
	}
	
	public static List<Parturition> list(){
		return finder.all();
	}
	
	public static Parturition findByName(String name) {
		return finder.where().eq("firstName", name).findUnique();
	}

	public String toString() {
		return "Parturition of (" + firstName + " " + fatherName + ")";
	}

	public static void deleteParturtion(Long id) {
		finder.ref(id).delete();
	}

	public static Parturition editParturition(Long id) {
		return finder.where().eq("id", id).findUnique();
	}
}
