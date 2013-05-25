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


	static Form<User> userForm = Form.form(User.class);

	@Security.Authenticated(Secured.class)
	public static Result users() {
		return ok(userListIndex.render(User.list(), userForm));
	}

	@Security.Authenticated(Secured.class)
	public static Result createUser() {
		Form<User> filledForm = userForm.bindFromRequest();
		if (filledForm.hasErrors()) {
			return badRequest(userListIndex.render(User.list(), filledForm));
		} else {
			User.createUser(filledForm.get());
			return redirect(routes.Application.users());
		}
	}
	
	@Security.Authenticated(Secured.class)
    public static Result editUser(Long id) {
        Form<User> editForm = form(User.class).fill(User.finder.byId(id)
        );
        return ok(
        		userEditForm.render(id, editForm)
        );
    }
	
	public static Result updateUser(Long id){
		Form<User> filledForm = form(User.class).bindFromRequest();
		if(filledForm.hasErrors()){
			return badRequest(userEditForm.render(id, filledForm));
		}
		else{
			filledForm.get().update(id);
			return ok(userListIndex.render(User.list(), userForm));
		}
	}
	@Security.Authenticated(Secured.class)
	public static Result deleteUser(Long id) {
		User.finder.ref(id).delete();
		flash("success", "User has been deleted");
		return redirect(routes.Application.users());
	}
	public static Result login() {
		return ok(login.render(form(Login.class)));
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
	        return badRequest(login.render(loginForm));
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
		      return "Invalid user or password";
		    }
		    return null;
		}
	}
}
