package controllers;

import static play.data.Form.form;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import models.AmbulanceInfo;

import play.data.DynamicForm;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
import scala.concurrent.stm.Ref.View;
import views.html.helper.form;

import com.avaje.ebean.Ebean;
import com.avaje.ebean.Query;
import com.avaje.ebean.RawSql;
import com.avaje.ebean.RawSqlBuilder;

public class Application extends Controller {
	
	private static Form<AmbulanceInfo> AmbulanceInfoForm = Form.form(AmbulanceInfo.class);
	public static Result index() {
		if ( AmbulanceInfo.find.all() == null) {
			return ok("موردی یافت نشد");
		} else {
			return ok(views.html.ambulance.ambulance.render( AmbulanceInfo.find
					.all()));
		}
	}

	public static Result searchAmbulance() {
		DynamicForm form = form().bindFromRequest();

		String type = form.get("type");

		String key = form.get("key");

		List< AmbulanceInfo> list = new ArrayList< AmbulanceInfo>();

		if (type == null || key == null){
			list =  AmbulanceInfo.find.all();
		
		} else {
			list =  AmbulanceInfo.find.where().like(type, "%" + key + "%").findList();
		}

		return ok(views.html.ambulance.AmbulanceInfo_search.render(list, type, key));
	}


	public static Result updateAmbulance(Integer id) {
		Form< AmbulanceInfo> filledForm = form( AmbulanceInfo.class).fill(
				 AmbulanceInfo.find.byId(id));
		return ok(views.html.ambulance.editForm.render(filledForm));

	}

	 public static Result saveUpdateAmbulance() {
	 Form< AmbulanceInfo> filledForm = form( AmbulanceInfo.class).bindFromRequest();
	 if (filledForm.hasErrors()) {
	 return badRequest(views.html.ambulance.editForm.render( filledForm));
	 } else {
	 filledForm.get().update();
	 return redirect(routes.Application.index());
	 }
	 }

	public static Result createAmbulance() {
		AmbulanceInfo p = new  AmbulanceInfo();
		List<Object> ids = AmbulanceInfo.find.findIds();

		int max = 0;
		for (Object id : ids)
			max = Math.max((Integer) id, max);

		max = max + 1;

		p.rgcod = max;

		AmbulanceInfoForm = AmbulanceInfoForm.fill(p);

		System.out.println(AmbulanceInfoForm);

		return ok(views.html.ambulance.newForm.render(AmbulanceInfoForm));
	}


	public static Result saveCreateAmbulance() {
		Form<AmbulanceInfo> filledForm = form(AmbulanceInfo.class).bindFromRequest();
		if (filledForm.hasErrors()) {
			return badRequest(views.html.ambulance.newForm.render(filledForm));
		} else {
			
			filledForm.get().save();
			return redirect(routes.Application.index());
		}
	}

	
	public static Result printListAmbulance() {

		return ok(views.html.ambulance.print_list.render(AmbulanceInfo.find.all()));

	}

	public static Result printRecieptAmbulance(Integer id) {
		return ok(views.html.ambulance.print_reciept.render(AmbulanceInfo.find.byId(id)));

	}

	public static Result deleteAmbulance(Integer id) {
		 AmbulanceInfo.find.ref(id).delete();
		return redirect(routes.Application. index());
	}

}
