package models;

import javax.persistence.*;

import play.data.validation.Constraints.*;
import play.db.ebean.Model;
import java.util.*;

@Entity
public class Drugs extends Model{
	
	@Id
	public Long id;

	@Required
	public String name;
	
	@Required
	public String company;
	
	@Required
	public Long price;
	
	@Required
	public Long quantity;
	
	public static Finder<Long, Drugs> finder = new Finder<Long, Drugs>(Long.class,Drugs.class);
	
	public Drugs(){
		
	}
	public Drugs(Long id, String name, String company, Long price, Long quantity){
		this.id = id;
		this.name = name;
		this.company = company;
		this.price = price;
	}
	
	public static void createDrug(Drugs drug){
		drug.save();
		
	}
	
	public static List<Drugs> all() {
		// TODO Auto-generated method stub
		return finder.all();
	}
	public static void deleteDrugs(Long id){
		finder.ref(id).delete();
	}
}
