package controllers;

import java.util.*;

import javax.swing.JOptionPane;

import com.avaje.ebean.*;

import play.mvc.*;
import play.cache.Cache;
import play.data.*;
import play.db.ebean.Model.Finder;
import static play.data.Form.*;
import play.*;
import views.html.*;
import views.html.parturitions.parturitionCreateForm;
import models.*;

public class ParturitionCon extends Controller {

	static ResourceBundle bundle = ResourceBundle.getBundle("bundle.Texts");

	static Form<Parturition> parturitionForm = Form.form(Parturition.class);

	public static Finder<Long, Personal> finder = new Finder<Long, Personal>(
			Long.class, Personal.class);

	public static Result parturitions() {
		return ok(views.html.parturitions.parturitionInterface
				.render(Parturition.list(), bundle));
	}

	public static Result createParturition() {
		Form<Parturition> newForm = form(Parturition.class);
		return ok(views.html.parturitions.parturitionCreateForm.render(newForm,
				finder.all(), bundle));
	}

	public static Result saveParturition() {
		Form<Parturition> filledForm = form(Parturition.class).bindFromRequest();
		if (filledForm.hasErrors()) {
			return badRequest(views.html.parturitions.parturitionCreateForm
					.render(filledForm, finder.all(), bundle));
		}
		filledForm.get().save();
		flash("success", "Parturition" + filledForm.get().firstName
				+ " has been saved");
		return redirect(routes.ParturitionCon.parturitions());
	}

	public static Result editParturition(Long id) {
		Form<Parturition> editForm = form(Parturition.class).fill(
				Parturition.find.byId(id));
		return ok(views.html.parturitions.parturitionEditForm.render(id,
				editForm, finder.all(), bundle));
	}

	public static Result updateParturition(Long id) {
		Form<Parturition> filledForm = form(Parturition.class)
				.bindFromRequest();
		if (filledForm.hasErrors()) {
			return badRequest(views.html.parturitions.parturitionEditForm
					.render(id, filledForm, finder.all(), bundle));
		} else {
			filledForm.get().update(id);
			return ok(views.html.parturitions.parturitionInterface
					.render(Parturition.list(), bundle));
		}
	}

	public static Result deleteParturition(Long id) {
			Parturition.find.ref(id).delete();
			flash("success", "User has been deleted");
			return redirect(routes.ParturitionCon.parturitions());
		
	}

	public static Result searchParturition() {
		DynamicForm form = form().bindFromRequest();

		String type = form.get("type");

		String key = form.get("key");

		List<Parturition> list = new ArrayList<Parturition>();

		if (type == null || key == null){
			list = Parturition.find.all();
		
		} else {
			list = Parturition.find.where().like(type, "%" + key + "%").findList();
		}

		return ok(views.html.parturitions.searchParturition.render(list, type, key, bundle));
	}
	
	public static Result parturitionPrint(){
		return ok(views.html.parturitions.parturitionPrint.render(Parturition.find.all(), bundle));
	}

}
