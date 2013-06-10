package models;

import java.util.Date;
import java.util.List;

import javax.persistence.*;

import play.data.validation.Constraints.*;
import play.db.ebean.Model;

@Entity
public class Operation extends Model{
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
	public long age;
	
	@Required
	public String bloodType;
	
	@Required
	public String phone;
	
	@Required
	public Date birthDate;
	
	@Required
	public Date operationDate;
	
	@Required
	public String address;
	
	@Required
	public String description;
	
	@Required
	public long charge;
	
	@Required
	public long discount;
	
	@Required
	public Personal doctor;
	
	@Required
	public Personal assistant;
	
	@Required
	public String operationType;
	
	@Required
	public boolean successfull;
	
	public static Finder<Long, Operation> finder = new Finder<Long, Operation>(
			Long.class, Operation.class);
	
	public Operation(String first, String father, String family, String fore,
			long age, String blood, String phone, Date birth, Date operation,
			String add, String desc, long cha, long disc, Personal doc, Personal assist,
			String operType, boolean suc){
		this.firstName = first;
		this.fatherName = father;
		this.familyName = family;
		this.foreFather = fore;
		this.age = age;
		this.bloodType = blood;
		this.phone = phone;
		this.birthDate = birth;
		this.operationDate = operation;
		this.address = add;
		this.description = desc;
		this.charge = cha;
		this.discount = disc;
		this.doctor = doc;
		this.assistant = assist;
		this.operationType = operType;
		this.successfull = suc;
	}
	
	public static void createOperation(Operation user) {
		user.save();
	}
	
	public static List<Operation> list(){
		return finder.all();
	}
	
	public static Operation findByName(String name) {
		return finder.where().eq("firstName", name).findUnique();
	}

	public String toString() {
		return "Operation(" + firstName + " " + fatherName + ")";
	}

	public static void deleteOperation(Long id) {
		finder.ref(id).delete();
	}

	public static Operation editUser(Long id) {
		return finder.where().eq("id", id).findUnique();
	}
}
