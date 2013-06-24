package models;

import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import static play.data.Form.*;
import play.data.format.*;
import javax.persistence.*;
import javax.swing.JOptionPane;
import javax.validation.Constraint;
import play.db.ebean.Model.Finder;

import play.data.validation.Constraints.*;
import play.db.ebean.Model;

@Entity
public class Parturition extends Model{
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
	//@Formats.DateTime(pattern="dd/MM/yy")
	public Date parturitionDate;
	
	@Required(message="خالی بوده نمی تواند")
    @Min(0)
    @Max(7)
	public long numberOfBaby;
	
	@Required(message="خالی بوده نمی تواند")
	public String doctor;
	
	@Required(message="خالی بوده نمی تواند")
	public String bloodType;
	
	@Required(message="خالی بوده نمی تواند")
	public String phoneNumber;
	

	
	@Required(message="خالی بوده نمی تواند")
	public String address;
	

	public String description;
	
	@Required(message="خالی بوده نمی تواند")
	public long charge;
	
	public long discount;
		
	@Required
	public boolean caesareaned;
	
	public static Finder<Long, Parturition> find = new Finder<Long, Parturition>(
			Long.class, Parturition.class);
	public static Finder<Long, User> docterFinder = new Finder<Long, User>(
			Long.class, User.class);
	
	public Parturition(String first, String father, String family, String fore,
			Date parturition, long numOfBaby, String doc, String blood, String phone,
			String add, String desc, long cha, long disc, boolean ces){
		this.firstName = first;
		this.fatherName = father;
		this.familyName = family;
		this.foreFather = fore;
		this.parturitionDate = parturition;
		this.numberOfBaby = numOfBaby;
		this.doctor = doc;
		this.bloodType = blood;
		this.phoneNumber = phone;
		this.address = add;
		this.description = desc;
		this.charge = cha;
		this.discount = setDiscount();
		this.caesareaned = ces;
	}
	
	public static void createParturition(Parturition user) {
		user.save();
	}
	
	public static List<Parturition> list(){
		return find.all();
	}
	
	public static Parturition findByName(String name) {
		return find.where().eq("firstName", name).findUnique();
	}
	
	public static List<Parturition> searchByName(String name){
		return find.where().like("firstName", "%"+name+"%").findList();
	}
	public static Parturition findById(long id){
		return find.byId(id);
	}
	public String toString() {
		return "Parturition of (" + firstName + " " + fatherName + ")";
	}

	public static List<Parturition> findByFather(String father){
		return find.where().like("fatherName", "%"+father+"%").findList();
		}
	
	public static void deleteParturtion(Long id) {
		if(find.getMaxRows() == 0){
			JOptionPane.showMessageDialog(null, "رکوردی برای پاک کردن نیست!!");
		}
		else{
			find.ref(id).delete();
		}
	}

	public static Parturition editParturition(Long id) {
		return find.where().eq("id", id).findUnique();
	}
	
	public static Map<String, String> options() {
		LinkedHashMap<String, String> options = new LinkedHashMap<String, String>();
		for (User c : docterFinder.orderBy("firstName").findList()) {
			options.put(c.id+"", c.firstName);
		}
		return options;
	}
	
	public  long setDiscount(){
		if(discount > charge/2){
			JOptionPane.showMessageDialog(null, "حداکثر تخفیف نصف هزینه می باشد");
			discount = charge/2;
		}
		return discount;
	}
}
