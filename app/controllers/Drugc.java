package controllers;

import java.util.*;

import play.mvc.*;
import play.cache.Cache;
import play.data.*;
import static play.data.Form.*;
import play.*;
import views.html.*;
import models.*;


public class Drugc extends Controller{
	
	static Form<Drugs> drugForm = Form.form(Drugs.class);
	
	public static Result createDrug(){
		Form<Drugs> filledForm = drugForm.bindFromRequest();
		if (filledForm.hasErrors()){
			return badRequest(drugList.render(Drugs.all(), filledForm));
		}
		else {
			Drugs.createDrug(filledForm.get());
			return redirect(routes.Drugc.listDrug());
		}
		
	}
	
	public static Result listDrug(){
		return ok(drugList.render(Drugs.all(), drugForm));
	}
	
	public static Result deleteDrug(Long id){
		Drugs.finder.ref(id).delete();
		return redirect(routes.Drugc.listDrug());
	}

}
