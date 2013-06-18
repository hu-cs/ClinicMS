package models;

import java.util.*;

import javax.persistence.*;
import javax.swing.JOptionPane;

import controllers.SellControll;

import play.data.validation.Constraints.Required;
import play.db.ebean.*;
import play.db.ebean.Model.Finder;

@Entity
public class SellDrug extends Model {
	@Id
	public int number;
	
	public int num;
	
	@Required
	public int total;
	
	@Required(message = "خالی بوده نمی تواند")
	public long drugCount;
	
	
	public String nameListing;
	
	@Required(message = "خالی بوده نمی تواند")
	public String name;
	
	@Required(message = "خالی بوده نمی تواند")
	public int price;
	
	public int sellPrice;
	
	@Required(message = "خالی بوده نمی تواند")
	public String build;
	
	@Required(message = "خالی بوده نمی تواند")
	public Date date = new Date();
	
	public String date1;
	
	public static Finder<Integer, SellDrug> find = new Finder<Integer, SellDrug>(
			Integer.class, SellDrug.class);

	public SellDrug(long number) {
		this.number = find.all().size();
	
	}
	

//	private int showtotal() {
//		int pric;
//		List<SellDrug> list = find.all();
//		if (list.size() == 0)
//			return 0;
//		else {
//			int lenght = list.size() - 1;
//			SellDrug object = list.get(lenght);
//			String[] lis = object.nameListing.split(",");
//			pric = Integer.parseInt(lis[1]);
//			return pric;
//		}
//	}
	public SellDrug(int price, int num, int total) {
		this.price = price;
		this.num = num;
		this.total = total;

	}

	public SellDrug(int total) {
		this.total = total;
	}

	public SellDrug() {

	}

	public static List<SellDrug> all() {
		return find.all();
	}

	public static void create(SellDrug patient) {
		patient.save();
		
	}

	public static void delete(int id) {
		find.ref(id).delete();

	}

	public static SellDrug edit(int id) {

		return find.where().eq("id", id).findUnique();

	}

	public boolean work = true;

	public static void print(List<RegisterDrug> list) {
		// TODO

	}

//	static int prevNum = 3;
//	static int prevPrice = 0;
//
//	public static SellDrug showTotalMoney() {
//		int price = 0;
//		int total = 100;
//		int num = 0;
//		List<SellDrug> list = find.all();
//		if (list.size() == 0) {
//			JOptionPane.showMessageDialog(null, "NO list!");
//		} else {
//			if (list.size() != 0) {
//				int lenght = list.size() - 1;
//				SellDrug object = list.get(lenght);
//				String[] lis = object.nameListing.split(",");
//				price = Integer.parseInt(lis[1]);
//				if (prevNum == object.num) {
//					total = price + prevPrice;
//					prevPrice = price;
//					prevNum = num;
//
//				} else {
//					total = price;
//					prevPrice = price;
//					prevNum = num;
//				}
//			}
//		}
//		return new SellDrug(price,num,total);
//	}

	public void printList() {

	}

}
