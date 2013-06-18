package controllers;

import static play.data.Form.form;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;


import models.RegisterDrug;
import play.*;
import play.data.DynamicForm;
import play.data.Form;
import play.db.ebean.Model.Finder;
import play.mvc.*;

import views.html.*;
import views.html.helper.form;

import com.avaje.ebean.Ebean;
import com.avaje.ebean.Query;
import com.avaje.ebean.RawSql;
import com.avaje.ebean.RawSqlBuilder;

public class RegisterControll extends Controller {
	
	public static Finder<Long, RegisterDrug> find = new Finder<Long, RegisterDrug>(
			Long.class, RegisterDrug.class);
	

	static Form<RegisterDrug> rgisterForm = Form.form(RegisterDrug.class);

	static RegisterDrug ob = new RegisterDrug();

	public static Result index() {
		return redirect(routes.RegisterControll.rgister());
	}

	public static Result rgister() {
		return ok(views.html.index.render(RegisterDrug.all(), rgisterForm, ob));
	}

	public static Result newRgister() {
		Form<RegisterDrug> filledForm = rgisterForm.bindFromRequest();
		if (filledForm.hasErrors()) {
			JOptionPane.showMessageDialog(null, "لطفا فرم را کامل پر کنید!!!");
			return badRequest(views.html.index.render(RegisterDrug.all(),
					filledForm, ob));
		} else {
			RegisterDrug.create(filledForm.get());
			return redirect(routes.RegisterControll.rgister());
		}
	}

	public static Result deleteRgisterDrug(Long id) {
		int rv=JOptionPane.showConfirmDialog(null, "Are you shoure you want to delete?");
		if(rv==JOptionPane.CANCEL_OPTION||rv==JOptionPane.NO_OPTION){
			return ok(views.html.index.render(RegisterDrug.all(), rgisterForm, ob));	
		}else{
		
		RegisterDrug.delete(id);
		return ok(views.html.index.render(RegisterDrug.all(), rgisterForm, ob));
	}
	}

	public static Result editeRgisterDrug(Long id) {
		
		Form<RegisterDrug> editForm = form(RegisterDrug.class).fill(
				RegisterDrug.find.byId(id));
		
		return ok(EditForm.render(id, editForm));
		 }
	
	public static Result updatereg(Long id){
		Form<RegisterDrug> filledForm = form(RegisterDrug.class).bindFromRequest();
		if(filledForm.hasErrors()){
			return ok(EditForm.render(id, filledForm));
		}
		else{
			filledForm.get().update(id);
			return ok(views.html.index.render(RegisterDrug.all(), rgisterForm, ob));
		}
	}

	// search
	public static Result findByid(Long id) {
		find.where().eq("id", id).findUnique();

		return ok(views.html.index.render(RegisterDrug.all(), rgisterForm, ob));
	}
	
	public static Result search() {
		DynamicForm form = form().bindFromRequest();

		String type = form.get("type");

		String key = form.get("key");

		List<RegisterDrug> list = new ArrayList<RegisterDrug>();

		if (type == null || key == null)
			list = RegisterDrug.find.all();
		else if (type.equals("phone")) {
			String sql = " select per.id, per.firstName, per.fatherName"
					+ " from person_model per"
					+ " join phone_model pho on per.id = pho.person_model_id ";
			RawSql rawSql = RawSqlBuilder.parse(sql)
					.columnMapping("per.id", "id")
					.columnMapping("per.firstName", "firstName")
					.columnMapping("per.fatherName", "fatherName").create();
			Query<RegisterDrug> query = Ebean.find(RegisterDrug.class);
			query.setRawSql(rawSql).where().like("pho.phone", "%" + key + "%");
			list = query.findList();
		} else {
			list = RegisterDrug.find.where().like(type, "%" + key + "%").findList();
		}

		return ok(views.html.RegisterDrugt_search.render(list, type, key));
	}
	
	
	public static Result printList() {	
		return ok(views.html.print_list.render(RegisterDrug.find.all()));
	}
	
	
	public static Result createDrug() {
		RegisterDrug p = new RegisterDrug();
	
		List<Object> ids = RegisterDrug.find.findIds();
		long max = 0;
		for (Object id : ids)
			max = Math.max((Long) id, max);

		max = max + 1;

		p.id = max;

		rgisterForm = rgisterForm.fill(p);

		System.out.println(rgisterForm);

		return ok(views.html.index.render(RegisterDrug.all(), rgisterForm, ob));
	}
}
