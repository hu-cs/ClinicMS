package controllers;

import java.io.File;
import static play.data.Form.form;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.*;

import javax.swing.JOptionPane;

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

public class PersonalController extends Controller {

	static ResourceBundle bundle = ResourceBundle.getBundle("bundle.Texts");

	static Form<Personal> personalForm = Form.form(Personal.class);

	public static Result personalList() {

		if (Personal.find.all() == null) {
			return ok("no user");
		} else {
			return ok(views.html.personal.personal_list.render(Personal.find
					.all(), bundle));
		}
	}

	public static Result createPersonal() {
		Personal p = new Personal();
		List<Object> ids = Personal.find.findIds();

		int max = 0;
		for (Object id : ids)
			max = Math.max((Integer) id, max);

		max = max + 1;

		p.id = max;

		personalForm = personalForm.fill(p);

		System.out.println(personalForm);

		return ok(views.html.personal.registerationForm.render(personalForm, bundle));
	}

	public static Result saveCreatePersonal() {
		Form<Personal> filledForm = personalForm.bindFromRequest();
		if (filledForm.hasErrors()) {

			JOptionPane.showMessageDialog(null, filledForm.errors());

			return badRequest(views.html.personal.registerationForm
					.render(filledForm, bundle));
		} else {
			Personal p = filledForm.get();

			MultipartFormData body = request().body().asMultipartFormData();
			FilePart picture = body.getFile("picture");
			if (picture != null) {
				String fileName = picture.getFilename();

				File file = picture.getFile();

				fileName = rand()
						+ rand()
						+ rand()
						+ rand()
						+ rand()
						+ (fileName.indexOf(".") != -1 ? fileName
								.substring(fileName.indexOf(".")) : "");

				String fl = copyFile(fileName, file);

				p.image = fileName;
			}

			p.save();

			return redirect(routes.PersonalController.personalList());
		}
	}

	private static String rand() {
		return String
				.valueOf((int) ((Math.random() % 1.0) * Integer.MAX_VALUE));
	}

	private static String copyFile(String fileName, File src) {
		try {
			InputStream in = new FileInputStream(src);
			File dest = new File("./public/images/upload/" + fileName);

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

	public static Result updatePersonal(Integer id) {
		Form<Personal> filledForm = form(Personal.class).fill(
				Personal.find.byId(id));
		return ok(views.html.personal.editForm.render(filledForm, bundle));
	}

	public static Result saveUpdatePersonal() {
		Form<Personal> filledForm = personalForm.bindFromRequest();
		if (filledForm.hasErrors()) {


			return badRequest(views.html.personal.editForm.render(filledForm, bundle));
		} else {
			Personal p = filledForm.get();

			MultipartFormData body = request().body().asMultipartFormData();
			FilePart picture = body.getFile("picture");
			if (picture != null) {
				String fileName = picture.getFilename();

				File file = picture.getFile();

				fileName = rand()
						+ rand()
						+ rand()
						+ rand()
						+ rand()
						+ (fileName.indexOf(".") != -1 ? fileName
								.substring(fileName.indexOf(".")) : "");

				String fl = copyFile(fileName, file);

				p.image = fileName;
			}

			p.update();

			return redirect(routes.PersonalController.personalList());
		}
	}

	public static Result deletePersonal(Integer id) {
		Personal.find.ref(id).delete();
		return redirect(routes.PersonalController.personalList());
	}

	public static Result searchPersonal() {
		DynamicForm form = form().bindFromRequest();

		String type = form.get("type");

		String key = form.get("key");

		List<Personal> list = new ArrayList<Personal>();

		if (type == null || key == null) {
			list = Personal.find.all();
		} else {
			list = Personal.find.where().like(type, "%" + key + "%").findList();
		}

		return ok(views.html.personal.personal_search.render(list, type, key, bundle));
	}

	public static Result printListPersonal() {

		return ok(views.html.personal.print_personal_list.render(Personal.find
				.all(), bundle));

	}
}
