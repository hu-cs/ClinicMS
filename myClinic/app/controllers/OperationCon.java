package controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import javax.swing.JOptionPane;

import play.mvc.*;
import play.data.*;
import play.db.ebean.Model.Finder;
import static play.data.Form.*;
import play.*;
import models.*;

public class OperationCon extends Controller{

    static Form<Operation> operationForm = Form.form(Operation.class);
    
	static ResourceBundle bundle = ResourceBundle.getBundle("bundle.Texts");

    
	public static Finder<Long, Operation> find = new Finder<Long, Operation>(
			Long.class, Operation.class);
	
	public static Finder<Long, Personal> personalFinder = new Finder<Long, Personal>(Long.class, Personal.class);
    
    public static Result operations(){
    	return ok(views.html.operations.operationList.render(Operation.list(), bundle));
    }

	public static Result createOperation() {
		Form<Operation> operationForm = form(Operation.class);
		return ok(views.html.operations.operationCreateForm.render(operationForm, personalFinder.all(), bundle));
	}
	
	public static Result saveOperation(){
		Form<Operation> filledForm = form(Operation.class).bindFromRequest();
		if (filledForm.hasErrors()) {
			return badRequest(views.html.operations.operationCreateForm
					.render(filledForm, personalFinder.all(), bundle));
		}
		filledForm.get().save();
		flash("success", "Parturition" + filledForm.get().firstName
				+ " has been saved");
		return redirect(routes.OperationCon.operations());
	}
    public static Result editOperation(Long id) {
        Form<Operation> editForm = form(Operation.class).fill(Operation.find.byId(id)
        );
        return ok(
        		views.html.operations.operationEditForm.render(id, editForm, personalFinder.all(), bundle)
        );
    }
    
	public static Result updateOperation(Long id){
		Form<Operation> filledForm = form(Operation.class).bindFromRequest();
		if(filledForm.hasErrors()){
			return badRequest(views.html.operations.operationEditForm.render(id, filledForm, personalFinder.all(), bundle));
		}
		else{
			filledForm.get().update(id);
			return ok(views.html.operations.operationInterface.render(Operation.list(), operationForm, bundle));
		}
	}
	public static Result searchOperation() {
		DynamicForm form = form().bindFromRequest();

		String type = form.get("type");

		String key = form.get("key");

		List<Operation> list = new ArrayList<Operation>();

		if (type == null || key == null){
			list = Operation.find.all();
		
		} else {
			list = Operation.find.where().like(type, "%" + key + "%").findList();
		}

		return ok(views.html.operations.searchOperation.render(list, type, key, bundle));
	}
	
	public static Result deleteOperation(Long id) {		
			Operation.find.ref(id).delete();
			flash("success", "User has been deleted");
			return redirect(routes.OperationCon.operations());
	}

	public static Result printOperation(){
		return ok(views.html.operations.printOperation.render(Operation.find.all(), bundle));
	}
}
