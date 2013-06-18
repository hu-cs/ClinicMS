package controllers;

import static play.data.Form.form;

import java.util.ArrayList;
import java.util.List;

import models.BedReservation;

import play.data.DynamicForm;
import play.data.Form;
import play.mvc.*;

public class Application extends Controller {
  
    private static Form<BedReservation> bedReservationForm = Form.form(BedReservation.class);

	public static Result index() {
		if (BedReservation.find.all() == null) {
			return ok("بستر رزرو شده وجود ندارد");
		} else {
			return ok(views.html.bedReservation.reservedBed_list.render(BedReservation.find
					.all()));
		}
	}

	public static Result searchBed() {
		DynamicForm form = form().bindFromRequest();

		String type = form.get("type");

		String key = form.get("key");

		List<BedReservation> list = new ArrayList<BedReservation>();

		if (type == null || key == null){
			list = BedReservation.find.all();
		} else {
			list = BedReservation.find.where().like(type, "%" + key + "%").findList();
		}

		return ok(views.html.bedReservation.bedReservation_search.render(list, type, key));
	}

	public static Result updateBed(Integer id) {
		Form<BedReservation> filledForm = form(BedReservation.class).fill(
				BedReservation.find.byId(id));
		return ok(views.html.bedReservation.editForm.render(filledForm));

	}

	 public static Result saveUpdateBed() {
	 Form<BedReservation> filledForm = form(BedReservation.class).bindFromRequest();
	 if (filledForm.hasErrors()) {
	 return badRequest(views.html.bedReservation.editForm.render( filledForm));
	 } else {
	 filledForm.get().update();
	 return redirect(routes.Application.index());
	 }
	 }

	public static Result createBed() {
		BedReservation p = new BedReservation();
		List<Object> ids = BedReservation.find.findIds();

		int max = 0;
		for (Object id : ids)
			max = Math.max((Integer) id, max);

		max = max + 1;

		p.bedNumber = max;

		bedReservationForm = bedReservationForm.fill(p);

		System.out.println(bedReservationForm);

		return ok(views.html.bedReservation.newForm.render(bedReservationForm));
	}

	public static Result saveCreateBed() {
		Form<BedReservation> filledForm = form(BedReservation.class).bindFromRequest();
		if (filledForm.hasErrors()) {
			return badRequest(views.html.bedReservation.newForm.render(filledForm));
		} else {
			filledForm.get().save();
			return redirect(routes.Application.index());
		}
	}

	public static Result printListBed() {

		return ok(views.html.bedReservation.print_list.render(BedReservation.find.all()));

	}

	public static Result printRecieptBed(Integer id) {
		return ok(views.html.bedReservation.print_reciept.render(BedReservation.find.byId(id)));

	}

	public static Result deleteBed(Integer id) {
		BedReservation.find.ref(id).delete();
		return redirect(routes.Application.index());
	}

}
