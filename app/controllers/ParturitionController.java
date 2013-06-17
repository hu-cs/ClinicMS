package controllers;

import java.util.*;

import play.mvc.*;
import play.cache.Cache;
import play.data.*;
import static play.data.Form.*;
import play.*;
import views.html.*;
import models.*;

public class ParturitionController extends Controller{

	static Form<Parturition> userForm = Form.form(Parturition.class);
	
	@Security.Authenticated(Secured.class)
	public static Result parturitions(){
		return TODO;
	}
	
	@Security.Authenticated(Secured.class)
	public static Result createParturition(){
		return TODO;
	}
	
	@Security.Authenticated(Secured.class)
	public static Result editParturition(Long id){
		return TODO;
	}
	
	@Security.Authenticated(Secured.class)
	public static Result updateParturition(Long id){
		return TODO;
	}
	@Security.Authenticated(Secured.class)
	public static Result deleteParturition(Long id){
		return TODO;
	}
}
