package controllers;

import static play.data.Form.form;

import java.util.ArrayList;
import java.util.List;

import models.Patient;

import play.data.DynamicForm;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
import scala.concurrent.stm.Ref.View;
import views.html.helper.form;

import com.avaje.ebean.Ebean;
import com.avaje.ebean.Query;
import com.avaje.ebean.RawSql;
import com.avaje.ebean.RawSqlBuilder;


public class Application extends Controller {

	private static Form<Patient> patientForm = Form.form(Patient.class);
	
	public static Result index() {
		return ok(views.html.reception.patient_list.render(Patient.find.all()));
	}

//	public static Result newPatient() {
//		Form<Patient> filledForm = patientForm.bindFromRequest();
//		if (filledForm.hasErrors()) {
//			return badRequest(views.html.index
//					.render(Patient.find.all(), filledForm));
//		} else {
//			filledForm.s;
//			return redirect(routes.Application.patients());
//		}
//	}
//	
//	public static Result search() {
//		DynamicForm form = patientForm().bindFromRequest();
//
//		String type = form.get("type");
//		String key = form.get("key");
//
//		List<PersonModel> list = new ArrayList<PersonModel>();
//
//		if (type == null || key == null)
//			list = PersonModel.find.all();
//		else if (type.equals("phone")) {
//			String sql = " select per.id, per.name, per.last_name "
//					+ " from person_model per"
//					+ " join phone_model pho on per.id = pho.person_model_id ";
//			RawSql rawSql = RawSqlBuilder.parse(sql)
//					.columnMapping("per.id", "id")
//					.columnMapping("per.name", "name")
//					.columnMapping("per.last_name", "lastName").create();
//			Query<PersonModel> query = Ebean.find(PersonModel.class);
//			query.setRawSql(rawSql).where().like("pho.phone", "%" + key + "%");
//			list = query.findList();
//		} else {
//			list = PersonModel.find.where().like(type, "%" + key + "%")
//					.findList();
//		}

	
	public static Result get(Integer id) {
		return TODO;
	}

	public static Result update(Integer id) {
		return TODO;
	}

	public static Result saveUpdate() {
		return TODO;
	}

	public static Result create() {
		return ok(views.html.reception.form.render(patientForm));
	}

	public static Result saveCreate() {
		Patient tmp = patientForm.bindFromRequest().get();
		tmp.save();
		
		return redirect(routes.Application.index());
	}

	public static Result delete(Integer id) {
		Patient.find.ref(id).delete();
		return redirect(routes.Application.index());
}
}
