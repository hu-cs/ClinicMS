package controllers;

import models.Personal;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.helper.form;

public class NokarewalController extends Controller{
	
	static Form<Personal> frm = Form.form(Personal.class);
	
	public static Result addNokerwal (Long id){
		
		Form<Personal> fldfrm = frm.bindFromRequest();
		
		
		
		Personal curPerson = Personal.find.byId(id);
		fldfrm.fill(curPerson);
		
		
		
		return ok("done");
	}
	
	public static Result listNokareval (){
		
		
		return ok("matellllllkuuuuu");
		
	}

}
