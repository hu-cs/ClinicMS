package models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import play.data.validation.Constraints.Required;
import play.db.ebean.Model;

@SuppressWarnings("serial")
@Entity
public class BedReservation extends Model {

	public BedReservation() {

	}

	public BedReservation(Integer bedNumber, Integer bedNum,
			String bedDepartment, String name, String fatherName, Integer cost,
			Date startDate, Date finishDate) {
		super();
		this.bedNumber = bedNumber;
		this.bedNum = bedNum;
		this.bedDepartment = bedDepartment;
		this.name = name;
		this.fatherName = fatherName;
		this.cost = cost;
		this.startDate = startDate;
		this.finishDate = finishDate;
	}

	@Id
	public Integer bedNumber;

	@Required(message = "خالی بوده  نمی تواند")
	public Integer bedNum;

	@Required(message = "خالی بوده نمی تواند")
	public String bedDepartment;

	@Required(message = "خالی بوده نمی تواند")
	public String name;

	@Required(message = "خالی بوده نمی تواند")
	public String fatherName;

	@Required(message = "خالی بوده نمی تواند")
	public Integer cost;

	@Required(message = "خالی بوده نمی تواند")
	public Date startDate;

	@Required(message = "خالی بوده نمی تواند")
	public Date finishDate;

	public static Finder<Integer, BedReservation> find = new Finder<Integer, BedReservation>(
			Integer.class, BedReservation.class);
}
