package controllers;

import java.util.*;

import play.mvc.*;
import play.data.*;
import play.db.ebean.Model.Finder;
import static play.data.Form.*;
import play.*;
import scala.collection.parallel.ParIterableLike.Find;

import views.html.*;

import models.*;


public class PersonalController extends Controller{

	
	static Form<Personal> personalForm = Form.form(Personal.class);
	
	public static Result createPersonal(){
		Form<Personal> filledForm = personalForm.bindFromRequest();
		if(filledForm.hasErrors()){
			return badRequest(registrationForm.render(filledForm));
		}
		else{
			Personal.createPersonal(filledForm.get());
			return redirect(routes.PersonalController.personalList());
		}
	}
	
    public static Result personalList(){
    	
    	if(Personal.all()== null){
    		return ok("no user");
    	}
    	else{
    		return ok(listofpersonal.render(Personal.all()));
    	}
    }
    
    public static Result editPersonal (Long id){
        Form<Personal> filledForm = form(Personal.class).fill(Personal.find.byId(id));
        return ok(
                personalEditForm.render(id, filledForm)
            );
    }
    
    public static Result deletePersonal(Long id){
    	Personal.find.ref(id).delete();
    	return ok(listofpersonal.render(Personal.find.all()));
    }
    
   public static Result creationForm(){
	   return ok(registrationForm.render(personalForm));
   }
   

   public static Result updatePersonal (Long id ){
	   Form<Personal> filledForm = form(Personal.class).bindFromRequest();
	   if(filledForm.hasErrors()){
		   return badRequest(personalEditForm.render(id, filledForm));
		   
	   }
	   else {
		   filledForm.get().update(id);
		   return redirect(routes.PersonalController.personalList());
	   }
   }
   
   public static Result filterByName(Personal guy){
	   
	   Form<Personal> filteredForm = form(Personal.class).bindFromRequest();
	   if (filteredForm.hasErrors()){
		   
		   return badRequest();
	   }
	   return ok(listofpersonal.render(Personal.find.all()));
   }
}
