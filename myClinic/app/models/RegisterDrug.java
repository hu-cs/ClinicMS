package models;

import java.util.*;

import javax.persistence.*;

import play.data.validation.Constraints.Required;
import play.db.ebean.*;

@Entity
public class RegisterDrug extends Model {

	@Id
	public Long id;

	@Required
	public String name;

	@Required
	public String build;

	@Required
	public int price;

	@Required
	public int sellPrice;

	@Required
	public Date Date = new Date();

	private static boolean done = false;

	public static Finder<Long, RegisterDrug> find = new Finder<Long, RegisterDrug>(
			Long.class, RegisterDrug.class);

	public static Map<String, String> options() {
		LinkedHashMap<String, String> options = new LinkedHashMap<String, String>();
		for (RegisterDrug c : RegisterDrug.find.orderBy("name").findList()) {
			options.put(c.id.toString(), c.name);
		}
		return options;
	}

	public static List<RegisterDrug> all() {
		return find.all();
	}

	public static void create(RegisterDrug rgister) {
		rgister.save();
	}

	public static void delete(Long id) {
		find.ref(id).delete();

	}

	public static RegisterDrug edit(Long id) {
		
		return find.where().eq("id", id).findUnique();

	}

	public boolean work = true;

	public static void print(List<RegisterDrug> list) {
		// TODO

	}
}
