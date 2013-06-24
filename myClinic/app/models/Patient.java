package models;

import java.util.Date;
import javax.persistence.*;

import play.data.validation.Constraints.Required;
import play.db.ebean.*;

@SuppressWarnings("serial")
@Entity
public class Patient extends Model {

	public Patient() {
	}

	@Id
	public Integer id;

	@Required(message = "خالی بوده نمی تواند")
	public String firstName;

	@Required(message = "خالی بوده نمی تواند")
	public String fatherName;

	@Required(message = "خالی بوده نمی تواند")
	public Date date;

	@Required(message = "خالی بوده نمی تواند")
	public String department;

	@Required(message = "خالی بوده نمی تواند")
	public String doctorName;

	@Required(message = "خالی بوده نمی تواند")
	public int doctorId;

	@Required(message = "خالی بوده نمی تواند")
	public int visit;

	@Required(message = "خالی بوده نمی تواند")
	public String payment;

	public static Finder<Integer, Patient> find = new Finder<Integer, Patient>(
			Integer.class, Patient.class);

	public Patient(String firstName, String fatherName, Date date,
			String department, String doctorName, int doctorId, int visit,
			String payment) {
		super();
		this.firstName = firstName;
		this.fatherName = fatherName;
		this.date = date;
		this.department = department;
		this.doctorName = doctorName;
		this.doctorId = doctorId;
		this.visit = visit;
		this.payment = payment;
	}
}
