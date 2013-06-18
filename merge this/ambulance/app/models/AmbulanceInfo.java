package models;

import java.util.*;

import javax.persistence.*;

import play.data.validation.Constraints.Required;
import play.db.ebean.*;

@SuppressWarnings("serial")
@Entity
public class AmbulanceInfo extends Model {

	public AmbulanceInfo() {
	}

	@Id
	public int rgcod;

	@Required(message = "خالی بوده نمی تواند")
	public String firstName;

	@Required(message = "خالی بوده نمی تواند")
	public int ambulancenumber;

	@Required(message = "خالی بوده نمی تواند")
	public int phone;

	@Required(message = "خالی بوده نمی تواند")
	public Date date;

	@Required(message = "خالی بوده نمی تواند")
	public String address;

	@Required(message = "خالی بوده نمی تواند")
	public int cost;

	@Required(message = "خالی بوده نمی تواند")
	public String payment;

	public static Finder<Integer, AmbulanceInfo> find = new Finder<Integer, AmbulanceInfo>(
			Integer.class, AmbulanceInfo.class);

	public AmbulanceInfo(Integer rgcod, String firstName,
			Integer ambulancenumber, Integer phone, Date date, String address,
			Integer cost, String payment) {
		super();
		this.rgcod = rgcod;
		this.firstName = firstName;
		this.ambulancenumber = ambulancenumber;
		this.phone = phone;
		this.date = date;
		this.address = address;
		this.cost = cost;
		this.payment = payment;
	}

}
