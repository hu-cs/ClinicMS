package controllers;

import java.util.*;

import play.mvc.*;
import play.cache.Cache;
import play.data.*;
import static play.data.Form.*;
import play.*;
import views.html.*;
import models.*;
public class OperationController extends Controller{
	
	static Form<Operation> userForm = Form.form(Operation.class);
	
	@Security.Authenticated(Secured.class)
	public static Result operations(){
		return TODO;
	}
	
	@Security.Authenticated(Secured.class)
	public static Result createOperation(){
		return TODO;
	}

	@Security.Authenticated(Secured.class)
	public static Result editOperation(Long id){
		return TODO;
	}
	
	@Security.Authenticated(Secured.class)
	public static Result updateOperation(Long id){
		return TODO;
	}
	
	@Security.Authenticated(Secured.class)
	public static Result deleteOperation(Long id){
		return TODO;
	}
	
}
