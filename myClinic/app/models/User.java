package models;

import java.util.List;

import javax.persistence.*;

import play.data.validation.Constraints.*;
import play.db.ebean.Model;

@Entity
public class User extends Model {

	@Id
    @GeneratedValue
	public long id;

	@Required
	public String firstName;

	@Required
	public String lastName;

	@Required
	public String password;

	@Required
	public boolean bedAccess;

	@Required
	public boolean accountingAccess;

	@Required
	public boolean labAccess;

	@Required
	public boolean timeReservingAccess;

	@Required
	public boolean ambulanceAccess;

	@Required
	public boolean operationAccess;

	@Required
	public boolean receptionAccess;

	@Required
	public boolean officeAccess;

	@Required
	public boolean createUserAccess;

	@Required
	public boolean drugStoreAccess;

	public static Finder<Long, User> find = new Finder<Long, User>(
			Long.class, User.class);

	public User(String name){
		this.firstName = name;
	}
	public User(String first, String last, String pas, boolean bed,
			boolean acc, boolean lab, boolean timeReserve, boolean amb,
			boolean ope, boolean rec, boolean office, boolean createUser,
			boolean drug) {

		this.firstName = first;
		this.lastName = last;
		this.password = pas;
		this.accountingAccess = acc;
		this.bedAccess = bed;
		this.labAccess = lab;
		this.timeReservingAccess = timeReserve;
		this.ambulanceAccess = amb;
		this.operationAccess = ope;
		this.receptionAccess = rec;
		this.officeAccess = office;
		this.createUserAccess = createUser;
		this.drugStoreAccess = drug;
	}

	public static List<User> list() {
		return find.all();
	}

	public static User findByName(String name) {
		return find.where().eq("firstName", name).findUnique();
	}

	public static User authenticate(String first, String pass) {
		return find.where().eq("firstName", first).eq("password", pass)
				.findUnique();
	}

	public String toString() {
		return "User(" + firstName + " " + lastName + ")";
	}

	public static void createUser(User user) {
		user.save();
	}

	public static void deleteUser(Long id) {
		find.ref(id).delete();
	}

	public static User editUser(Long id) {
		return find.where().eq("id", id).findUnique();
	}

	
	//access rights
	
	public boolean accountingAccess(){
		return accountingAccess;
	}

	
	public boolean bedAccess(boolean createUser, String user){
		return labAccess;
	}
	
	public boolean labAccess(){
		return labAccess;
	}
	
	public boolean timeReservingAccess(){
		return timeReservingAccess;
	}
	
	public boolean ambulanceAccess(){
		return ambulanceAccess;
	}
	
	public boolean operationAccess(){
		return operationAccess;
	}
	
	public boolean receptionAccess(){
		return receptionAccess;
	}

	
	public boolean createUserAccess() {
		return createUserAccess;
	}
	
	public boolean drugStoreAccess(){
		return drugStoreAccess;
	}
}

