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
	
	@Required(message="خالی بوده نمی تواند")
	public String firstName;
	
	@Required(message="خالی بوده نمی تواند")
	public String fatherName;
	
	@Required(message="خالی بوده نمی تواند")
	public String familyName;
	
	@Required(message="خالی بوده نمی تواند")
	public String foreFather;
	
	@Required(message="خالی بوده نمی تواند")
	public long age;
	
	@Required(message="خالی بوده نمی تواند")
	public String bloodType;
	
	@Required(message="خالی بوده نمی تواند")
	public String phone;
	
	@Required(message="خالی بوده نمی تواند")
	public Date operationDate;
	
	@Required(message="خالی بوده نمی تواند")
	public String address;
	
	
	public String description;
	
	@Required(message="خالی بوده نمی تواند")
	public long charge;
	
	@Required(message="خالی بوده نمی تواند")
	public long discount;
	
	@Required(message="خالی بوده نمی تواند")
	public String doctor;
	
	@Required(message="خالی بوده نمی تواند")
	public String assistant;
	
	@Required(message="خالی بوده نمی تواند")
	public String operationType;
	
	@Required(message="خالی بوده نمی تواند")
	public boolean successfull;
	
	public static Finder<Long, Operation> find = new Finder<Long, Operation>(
			Long.class, Operation.class);
	
	public Operation(String first, String father, String family, String fore,
			long age, String blood, String phone, Date operation,
			String add, String desc, long cha, long disc, String doc, String assist,
			String operType, boolean suc){
		this.firstName = first;
		this.fatherName = father;
		this.familyName = family;
		this.foreFather = fore;
		this.age = age;
		this.bloodType = blood;
		this.phone = phone;
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
		return find.all();
	}
	
	public static Operation findByName(String name) {
		return find.where().eq("firstName", name).findUnique();
	}
	public static List<Operation> findByFather(String name) {
		return find.where().eq("fatherName", name).findList();
	}
	
	public static List<Operation> searchByName(String name){
		return find.where().like("firstName", "%"+name+"%").findList();
	}
	public static Operation findById(long id){
		return find.byId(id);
	}
	public String toString() {
		return "Operation(" + firstName + " " + fatherName + ")";
	}

	public static void deleteOperation(Long id) {
		find.ref(id).delete();
	}

	public static Operation editUser(Long id) {
		return find.where().eq("id", id).findUnique();
	}
}
