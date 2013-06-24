package controllers;

import java.util.*;

import play.mvc.*;
import play.cache.Cache;
import play.data.*;
import static play.data.Form.*;
import play.*;
import views.html.*;
import models.*;

public class Application extends Controller {
  

	static ResourceBundle bundle = ResourceBundle.getBundle("bundle.Texts");
	static Form<User> userForm = Form.form(User.class);
    
//    public static Result homes() {
//        return ok(views.html.homePage.render(bundle));
//    }
    
	
	
    public static Result users(){
    	return ok(views.html.users.userInterface.render(User.list(), userForm, bundle));
    }

	public static Result createUser() {
		Form<User> newForm = form(User.class);
		return ok(views.html.users.userCreateForm.render(newForm, bundle));
	}
	public static Result saveUser() {
		Form<User> filledForm = form(User.class).bindFromRequest();
		if (filledForm.hasErrors()) {
			return badRequest(views.html.users.userCreateForm
					.render(filledForm, bundle));
		}
		filledForm.get().save();
		flash("success", "User has been created" + filledForm.get().firstName
				+ " has been saved");
		return redirect(routes.Application.users());
	}
	
    public static Result editUser(Long id) {
        Form<User> editForm = form(User.class).fill(User.find.byId(id)
        );
        return ok(
        		views.html.users.userEditForm.render(id, editForm, bundle)
        );
    }
    
	public static Result updateUser(Long id){
		Form<User> filledForm = form(User.class).bindFromRequest();
		if(filledForm.hasErrors()){
			return badRequest(views.html.users.userEditForm.render(id, filledForm, bundle));
		}
		else{
			filledForm.get().update(id);
			return ok(views.html.users.userInterface.render(User.list(), userForm, bundle));
		}
	}
    
	public static Result deleteUser(Long id) {
		User.find.ref(id).delete();
		flash("success", "User has been deleted");
		return redirect(routes.Application.users());
	}

	public static Result searchUser(){
		DynamicForm form = form().bindFromRequest();
		String type = form.get("type");

		String key = form.get("key");

		List<User> list = new ArrayList<User>();
		if (type == null || key == null){
			list = User.find.all();
		
		} else {
			list = User.find.where().like(type, "%" + key + "%").findList();
		}
		
		return ok(views.html.users.searchUser.render(list, type, key, bundle));
	}
	
	public static Result printUser(){
		return ok(views.html.users.printUser.render(User.find.all(), bundle));
	}
	//user login actions
	public static Result login() {
		return ok(loginPage.render(form(Login.class)));
	}

	public static Result logout() {
	    session().clear();
	    flash("success", "You've been logged out");
	    return redirect(
	        routes.Application.login()
	    );
	}
	
	public static Result authenticate() {
	    Form<Login> loginForm = form(Login.class).bindFromRequest();
	    if (loginForm.hasErrors()) {
	        return badRequest(loginPage.render(loginForm));
	    } else {
	        session().clear();
	        session("firstName", loginForm.get().firstName);
	        return redirect(
	            routes.Application.users()
	        );
	    }
	}

	
	public static class Login {

		public String firstName;
		public String password;
		
		public String validate() {
		    if (User.authenticate(firstName, password) == null) {
		      return "ورود به سیستم ناموفق";
		    }
		    return null;
		}
	}

	
}
