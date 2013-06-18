package controllers;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import play.mvc.*;
import play.data.*;
import play.db.ebean.Model.Finder;
import static play.data.Form.*;
import play.*;
import models.*;

public class PersonalCon extends Controller{

    static Form<Personal> personalForm = Form.form(Personal.class);
    
  
    
	public static Finder<Long, Personal> find = new Finder<Long, Personal>(
			Long.class, Personal.class);
	
	public static Finder<Long, Personal> personalFinder = new Finder<Long, Personal>(Long.class, Personal.class);
    
    public static Result personals(){
    	return ok(views.html.personals.listofpersonal.render(Personal.all()));
    }

	public static Result createPersonal() {
		Form<Personal> PersonalForm = form(Personal.class);
		return ok(views.html.personals.registrationForm.render(personalForm));
	}
	
	public static Result savePersonal(){
		Form<Personal> filledForm = form(Personal.class).bindFromRequest();
		if (filledForm.hasErrors()) {
			return badRequest(views.html.personals.registrationForm
					.render(filledForm));
		}
		else {
		filledForm.get().save();
		flash("success", "Parturition" + filledForm.get().firstName
				+ " has been saved");
		
		return redirect(routes.PersonalCon.personals());
		}
	}
    public static Result editPersonal(Long id) {
        Form<Personal> editForm = form(Personal.class).fill(Personal.find.byId(id)
        );
        return ok(
        		views.html.personals.personalEditForm.render(id, editForm)
        );
    }
    
	public static Result updatePersonal(Long id){
		Form<Personal> filledForm = form(Personal.class).bindFromRequest();
		if(filledForm.hasErrors()){
			return badRequest(views.html.personals.personalEditForm.render(id, filledForm));
		}
		else{
			filledForm.get().update(id);
			return ok(views.html.personals.listofpersonal.render(Personal.all()));
		}
	}
	public static Result searchPersonal() {
		DynamicForm form = form().bindFromRequest();

		String type = form.get("type");

		String key = form.get("key");

		List<Personal> list = new ArrayList<Personal>();

		if (type == null || key == null){
			list = Personal.find.all();
		
		} else {
			list = Personal.find.where().like(type, "%" + key + "%").findList();
		}

		return ok(views.html.personals.searchPersonal.render(list, type, key));
	}
	
	public static Result deletePersonal(Long id) {
		int confirm = JOptionPane.showConfirmDialog(null,
				"آیا مایلید که این رکورد را حذف کنید؟");
		if (confirm == JOptionPane.CANCEL_OPTION
				|| confirm == JOptionPane.NO_OPTION) {
			return redirect(routes.PersonalCon.personals());
		} else {
			Personal.find.ref(id).delete();
			flash("success", "User has been deleted");
			return redirect(routes.PersonalCon.personals());
		}
	}

	public static Result printPersonal(){
		return ok(views.html.personals.printPersonal.render(Personal.find.all()));
	}
}
