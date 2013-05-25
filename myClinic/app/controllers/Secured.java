package controllers;

import play.*;
import play.mvc.*;
import play.mvc.Http.*;

import models.*;

public class Secured extends Security.Authenticator {

    @Override
    public String getUsername(Context ctx) {
        return ctx.session().get("firstName");
    }

    @Override
    public Result onUnauthorized(Context ctx) {
        return redirect(routes.Application.login());
    }
    
    // Access rights
	public boolean accountingAcc(User user){
		return user.accountingAccess();
	}

//	public  boolean bedAcc(){
//		return (Context.current().request().username());
//	}
//	
	public boolean labAcc(User user){
		return user.labAccess();
	}
	
	public boolean timeReservingAcc(User user){
		return user.timeReservingAccess();
	}
	
	public boolean ambulanceAcc(User user){
		return user.ambulanceAccess();
	}
	
	public boolean operationAcc(User user){
		return user.operationAccess();
	}
	
	public boolean receptionAcc(User user){
		return user.receptionAccess();
	}

	public boolean createUserAcc(User user) {
		return user.createUserAccess();
	}
	
	public boolean drugStoreAcc(User user){
		return user.drugStoreAccess();
	}
}