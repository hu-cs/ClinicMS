package models;

import java.util.*;

import javax.persistence.*;

import play.data.validation.Constraints.Required;
import play.db.ebean.*;

@Entity
public class RegisterDrug extends Model{

	@Id
	public Long id;
	
	@Required
	public String name;
	
	@Required
	public String build;
	
	@Required
	public String price;
	
	@Required
	public String sellPrice;
	
	@Required
	public Date birthDate = new Date();
	
	public Long age;
	
	
	
	private static boolean done=false ;
	
	public static Finder<Long,RegisterDrug> find = new Finder<Long, RegisterDrug>(Long.class, RegisterDrug.class);
	
	public static List<RegisterDrug> all() {
		    return  find.all();//return the list of patient that was in the finder object
		  } 
		  public static void create(RegisterDrug patient) {
			  patient.save();
		  }
		  
		  public static void delete(Long id) {
			  find.ref(id).delete();
			
			}
		  public static RegisterDrug edit(Long id) {
			  setDone(true);
			  return find.where().eq("id", id).findUnique();
			 
			
		  }
		 
		  public  boolean work=true;
		  
			public static void print(List<RegisterDrug> list) {
				// TODO

			}
			
			
			public boolean isDone() {
				return done;
			}

			public static void setDone(boolean done) {
				RegisterDrug.done = done;
			} 
		  
		  
}
