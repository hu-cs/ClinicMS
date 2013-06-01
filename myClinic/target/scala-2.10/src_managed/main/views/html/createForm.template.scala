
package views.html

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import views.html._
/**/
object createForm extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Form[User],play.api.templates.Html] {

    /**/
    def apply/*1.2*/(userForm: Form[User]):play.api.templates.Html = {
        _display_ {import helper._


Seq[Any](format.raw/*1.24*/("""

"""),format.raw/*4.1*/("""<html><head> <title></title> 

<style rel="stylesheet" type="text/css" >
td """),format.raw/*7.4*/("""{"""),format.raw/*7.5*/("""
direction: ltr;

"""),format.raw/*10.1*/("""}"""),format.raw/*10.2*/("""
.lt """),format.raw/*11.5*/("""{"""),format.raw/*11.6*/("""
direction: rtl;
margin-top: 0px;
width: 150px;
height: 50px;
"""),format.raw/*16.1*/("""}"""),format.raw/*16.2*/("""
</style>
</head>
<body>
"""),_display_(Seq[Any](/*20.2*/form(routes.Application.createUser())/*20.39*/ {_display_(Seq[Any](format.raw/*20.41*/("""
	<table  class="inserTable" >
	<tr>
	
	</tr>
		<tbody>
			<tr>

			<td><input class="lt" type="text" name="firstName"  size="10" required /> </td>
			<td><input class="lt" type="text" name="lastName" size="10" required/></td>
			<td><input class="lt" type="password" name="password" size="10" required  /></td>
			<td><label id="chk"> بستری  </label><input id="chk" type="checkbox" name="bedAccess" size="10" />
			<label id="chk" > محاسبه  </label><input id="chk" type="checkbox" name="accountingAccess" size="10" />
			<label id="chk" > لابراتوار </label><input id="chk" type="checkbox" name="labAccess" size="10" /> <br />
			<label id="chk1" > رزرو وقت </label><input id="chk1" type="checkbox" name="timeReservingAccess" size="10" />
			<label id="chk1" > کسیل کش </label><input id="chk1" type="checkbox" name="ambulanceAccess" size="10" />
			<label id="chk1" > عملیات </label><input id="chk1" type="checkbox" name="operationAccess" size="10" /> <br />
		
			<label id="chk2" >پذیرش</label><input id="chk2" type="checkbox" name="receptionAccess" size="10" />
			<label id="chk4" >اداره</label><input id="chk4" type="checkbox" name="officeAccess" size="10" /> <br />
			<label id="chk3" >ساخت کاربر</label><input id="chk3" type="checkbox" name="createUserAccess" size="10" />
			<label id="chk5" >دوا خانه </label><input id="chk5" type="checkbox" name="drugStoreAccess" size="10" /></td>
			
				<td><input id="pic1" type="submit" value="Create"> <br />
				 <a id="pic2" href=""""),_display_(Seq[Any](/*44.26*/routes/*44.32*/.Application.users())),format.raw/*44.52*/("""" class="btn">Cancel</a></td>
				</tr>
			
				</tbody>

			</table>
	""")))})),format.raw/*50.3*/("""
	</body>
</html>"""))}
    }
    
    def render(userForm:Form[User]): play.api.templates.Html = apply(userForm)
    
    def f:((Form[User]) => play.api.templates.Html) = (userForm) => apply(userForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sat May 25 03:26:55 AFT 2013
                    SOURCE: E:/MyFiles/ProjectsFolders/playProjects/myClinic/app/views/createForm.scala.html
                    HASH: 092148c635197175ecdd7fee156ca829fddfad9b
                    MATRIX: 732->1|848->23|878->45|983->124|1010->125|1058->146|1086->147|1119->153|1147->154|1241->221|1269->222|1334->252|1380->289|1420->291|2964->1799|2979->1805|3021->1825|3130->1903
                    LINES: 26->1|30->1|32->4|35->7|35->7|38->10|38->10|39->11|39->11|44->16|44->16|48->20|48->20|48->20|72->44|72->44|72->44|78->50
                    -- GENERATED --
                */
            