package controllers;


import javax.swing.JOptionPane;

import models.RegisterDrug;
import play.*;
import play.data.Form;
import play.db.ebean.Model.Finder;
import play.mvc.*;

import views.html.*;
import views.html.helper.form;

public class Application extends Controller {
	public static Finder<Long, RegisterDrug> find = new Finder<Long, RegisterDrug>(
			Long.class, RegisterDrug.class);

	static Form<RegisterDrug> rgisterForm = Form.form(RegisterDrug.class);
	
	static RegisterDrug ob=new RegisterDrug();
	public static Result index() {
		return redirect(routes.Application.rgister());
	}

	public static Result rgister() {
		return ok(views.html.index.render(RegisterDrug.all(), rgisterForm, ob));
	}

	public static Result newRgister() {
		Form<RegisterDrug> filledForm = rgisterForm.bindFromRequest();
		if (filledForm.hasErrors()) {
			JOptionPane.showMessageDialog(null,"لطفا فرم را کامل پر کنید!!!");
			return badRequest(views.html.index.render(RegisterDrug.all(),
					filledForm ,ob));
		} else {
			RegisterDrug.create(filledForm.get());
			return redirect(routes.Application.rgister());
		}
	}

	public static Result deleteRgisterDrug(Long id) {
		RegisterDrug.delete(id);
		return ok(views.html.index.render(RegisterDrug.all(), rgisterForm, ob));
	}
	public static Result editeRgisterDrug(Long id) {	
		RegisterDrug.edit(id);
		return ok(views.html.index.render(RegisterDrug.all(), rgisterForm, ob));
	}
	
	//search
	 public static Result findByid(long id) {
	         find.where().eq("id", id).findUnique();
	        
	        
	        return ok(views.html.index.render(RegisterDrug.all(), rgisterForm, ob));
	    }

}
