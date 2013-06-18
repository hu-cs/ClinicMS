package controllers;

import static play.data.Form.form;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import com.avaje.ebean.Ebean;
import com.avaje.ebean.Query;
import com.avaje.ebean.RawSql;
import com.avaje.ebean.RawSqlBuilder;

import models.ListSellDrug;
import models.RegisterDrug;
import models.SellDrug;
import play.*;
import play.data.DynamicForm;
import play.data.Form;
import play.db.ebean.Model.Finder;
import play.mvc.*;

import views.html.*;

public class ListSellContoroll extends Controller {

	static Form<ListSellDrug> listForm = Form.form(ListSellDrug.class);

	public static Finder<Integer, ListSellDrug> find = new Finder<Integer, ListSellDrug>(
			Integer.class, ListSellDrug.class);


	public static Result index() {

		return redirect(routes.ListSellContoroll.listing());
	}

	static List<ListSellDrug> list = SellControll.showTotalSellList();

	public static Result listing() {

		return ok(views.html.ListForme.render(list));
	}

	public static Result search() {
		DynamicForm form = form().bindFromRequest();

		String type = form.get("type");

		String key = form.get("key");

		List<ListSellDrug> list = new ArrayList<ListSellDrug>();

		if (type == null || key == null){
			list = ListSellDrug.find.all();
			JOptionPane.showMessageDialog(null, "it is empty");
		}
			
		else {
			list = ListSellDrug.find.where().like(type, "%" + key + "%").findList();
		}

		return ok(views.html.SellForm_search.render(list, type, key));
	}

	public static Result printList() {

		return ok(views.html.Print_ListSell.render(ListSellDrug.find.all()));

	}
	
	public static Result deleteListSell(Integer id){
		SellControll.find.ref(id).delete();
		return ok(views.html.ListForme.render(list));
		
	}
	
	
	public static Result createListSell() {
		ListSellDrug p = new ListSellDrug();
		List<Object> ids = ListSellDrug.find.findIds();

		int max = 0;
		for (Object id : ids)
			max = Math.max((Integer) id, max);

		max = max + 1;

		p.number = max;

		listForm = listForm.fill(p);

		System.out.println(listForm);

		return ok(views.html.ListForme.render(list));
	}

}
