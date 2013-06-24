package models;

import java.util.*;

import javax.persistence.*;
import javax.swing.JOptionPane;

import controllers.SellControll;

import play.data.validation.Constraints.Required;
import play.db.ebean.*;
import play.db.ebean.Model.Finder;

@Entity
public class ListSellDrug extends Model{
	@Id
	public int id;
	@Required
	public int number;
	
	@Required
	public Date sellDate;
	
	@Required
	public long totalSell;
	
	@Required
	public long benfit;
	
	   
	public ListSellDrug(){
		
	}
	public static Finder<Integer, ListSellDrug> find = new Finder<Integer, ListSellDrug>(
			Integer.class, ListSellDrug.class);
	
	
	public ListSellDrug(int number,Date sellDate,long totalSell,long benfit,int id){
		this.number=number;
		this.sellDate=sellDate;
		this.totalSell=totalSell;
		this.benfit=benfit;
	
	}
	
	public static List<ListSellDrug> listSell_Drug(){
		return find.all();
		
	}

}
