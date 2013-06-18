package controllers;

import static play.data.Form.form;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.swing.JOptionPane;


import models.ListSellDrug;
import models.RegisterDrug;
import models.SellDrug;
import play.*;
import play.data.Form;
import play.db.ebean.Model.Finder;
import play.mvc.*;

import views.html.*;
import views.html.helper.form;

public class SellControll extends Controller {

	// static Integer number=lastnum();
	public static Finder<Integer, SellDrug> find = new Finder<Integer, SellDrug>(
			Integer.class, SellDrug.class);

	public static Finder<Long, RegisterDrug> finder = new Finder<Long, RegisterDrug>(
			Long.class, RegisterDrug.class);

	public static Finder<Long, ListSellDrug> finderList = new Finder<Long, ListSellDrug>(
			Long.class, ListSellDrug.class);

	public static List<RegisterDrug> listReg() {
		return finder.all();
	}

	static Form<SellDrug> sellDrugForm = Form.form(SellDrug.class);

	static Form<ListSellDrug> listSellForm = Form.form(ListSellDrug.class);

	public static Result index() {
		return redirect(routes.SellControll.sell());
	}

	public static Result sell() {
		return ok(views.html.DrugSellingForm.render(SellDrug.all(),
				sellDrugForm, listReg(), addRes));
	}

	static List<ListSellDrug> list = new ArrayList<ListSellDrug>();

	// ListSellDrug objectListSell=new ListSellDrug();
	static int addRes = 0;
	static int prvNum = 0;
	static int prvPrice = 0;

	static int benfit1;
	static int id=0;
	
	int totalBenfitOfReg=0;
	

	public static Result newsell() {

		Form<SellDrug> filledForm = sellDrugForm.bindFromRequest();

		// filledForm.discardErrors();
		if (filledForm.hasErrors()) {
			JOptionPane.showMessageDialog(null, "لطفا فرم را گامل پر کنید.!"
					+ filledForm.value());

			return badRequest(views.html.DrugSellingForm.render(SellDrug.all(),
					filledForm, listReg(), addRes));

		} else {
			Date date=filledForm.get().date;
			
			int num=filledForm.get().num;

			if (prvNum == filledForm.get().num) {

				filledForm.get().total = (int) ((filledForm.get().price * filledForm
						.get().drugCount)) + prvPrice;

				prvPrice = filledForm.get().total;

				addRes = filledForm.get().total;
				
				prvNum = filledForm.get().num;
				
				
				
				for (int i = 0; i < finder.all().size(); i++) {
					if (finder.all().get(i).build
							.equals(filledForm.get().build)
							&& finder.all().get(i).name
									.equals(filledForm.get().name)) {
						
						int sellPrice = finder.all().get(i).sellPrice;
						
						int price = finder.all().get(i).price;

						benfit1 = (int) ((sellPrice - price) * (filledForm
								.get().drugCount));

					}
				}
					list.add(new ListSellDrug(num,date ,addRes, benfit1,id));

					ListSellDrug object = new ListSellDrug(num,date ,addRes, benfit1,id);
							
					finderList.all().add(object);
				//	JOptionPane.showMessageDialog(null, finderList.all().get(i).benfit);
							id++;
					listSellForm.fill(object);
					
					object.save();
					
					
				}

				

			else {

				filledForm.get().total = (int) (filledForm.get().price * filledForm
						.get().drugCount);
				prvNum = filledForm.get().num;
				prvPrice = filledForm.get().total ;

				addRes = filledForm.get().total;
				
				for (int i = 0; i < finder.all().size(); i++) {
					if (finder.all().get(i).build
							.equals(filledForm.get().build)
							&& finder.all().get(i).name
									.equals(filledForm.get().name)) {
						
						int sellPrice = finder.all().get(i).sellPrice;
						
						int price = finder.all().get(i).price;

						benfit1 = (int) ((sellPrice - price) * (filledForm
								.get().drugCount));

					}
				}
				list.add(new ListSellDrug(num,date ,addRes, benfit1,id));

				ListSellDrug object = new ListSellDrug(num,date ,addRes, benfit1,id);
						
				finderList.all().add(object);
			//	JOptionPane.showMessageDialog(null, finderList.all().get(i).benfit);
						id++;
				listSellForm.fill(object);
				
				object.save();
				

					

			}
			SellDrug.create(filledForm.get());
			
			// ----------------
			
			// --------------
			
		//	SellDrug.create(filledForm.get());
			

			return redirect(routes.SellControll.sell());
		}
	}

	public static Result deletesell(int id) {
		int rv = JOptionPane.showConfirmDialog(null,
				"Are you shoure you want to delete?");
		if (rv == JOptionPane.CANCEL_OPTION || rv == JOptionPane.NO_OPTION) {
			return ok(views.html.DrugSellingForm.render(SellDrug.all(),
					sellDrugForm, listReg(), addRes));
		} else {
			SellDrug.delete(id);
			return ok(views.html.DrugSellingForm.render(SellDrug.all(),
					sellDrugForm, listReg(), addRes));
		}
	}

	public static List showTotalSellList() {
		return finderList.all();

	}
	
	
	
	
	public static Result createSell() {
		SellDrug p = new SellDrug();
		List<Object> ids = SellDrug.find.findIds();

		int max = 0;
		for (Object id : ids)
			max = Math.max((Integer) id, max);

		max = max + 1;

		p.number = max;

		sellDrugForm = sellDrugForm.fill(p);

		System.out.println(sellDrugForm);

		return ok(views.html.DrugSellingForm.render(SellDrug.all(),
				sellDrugForm, listReg(), addRes));
	}

	

}
