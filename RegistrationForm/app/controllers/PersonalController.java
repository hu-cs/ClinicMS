package controllers;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.*;

import play.mvc.*;
import play.mvc.Http.MultipartFormData;
import play.mvc.Http.MultipartFormData.FilePart;
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
   
   public static Result listNokarval(){

	   
	   return ok(listNokarVali.render("EHLLO"));
   }
   
   public static Result upload() {
		MultipartFormData body = request().body().asMultipartFormData();
		FilePart picture = body.getFile("picture");
		if (picture != null) {
			String fileName = picture.getFilename();
			String contentType = picture.getContentType();
			File file = picture.getFile();

			String fl = copyFile(fileName, file);

			return ok(index.render(fileName));

		} else {
			flash("error", "Missing file");
			return redirect(routes.Application.index());
		}
	}

	private static String copyFile(String fileName, File src) {
		try {
			InputStream in = new FileInputStream(src);
			File dest = new File("../public/images/" + fileName);
			OutputStream out = new FileOutputStream(dest);

			int i;
			while ((i = in.read()) != -1)
				out.write(i);

			in.close();
			out.close();

			return dest.getPath();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "";
	}
	
	public static Result pcload(){
		
		return ok(views.html.uploadPic.render(" "));
	}
	
	public static Result searchById(Long id){
		
		return ok("hello");
	}
}
