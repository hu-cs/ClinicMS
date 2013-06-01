
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
object userList extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[List[User],play.api.templates.Html] {

    /**/
    def apply/*1.2*/(users: List[User]):play.api.templates.Html = {
        _display_ {import helper._


Seq[Any](format.raw/*1.21*/("""

"""),format.raw/*4.1*/("""
<html>

<head>
<title>

</title>
<link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*11.46*/routes/*11.52*/.Assets.at("stylesheets/userListIndex.css"))),format.raw/*11.95*/("""">
</head>
<body>

	<table  class="users" height="30">
		<thead>
		<tr>
		<td><input type="search" /></td>
		<td><input type="search" /></td>
		<td></td>
		<td></td>
		<td></td>
		</tr>
		<tr>
		<td><b>شماره</b></td>
		<td><b> نام کاربر</b></td>
		<td><b>رمز کاربر</b></td>
		<td><b>اجازه دسترسي</b></td>
		<td><b> عمل</b></td>
		</tr>
		</thead>
		<tbody>
		"""),_display_(Seq[Any](/*33.4*/for(user <- users) yield /*33.22*/ {_display_(Seq[Any](format.raw/*33.24*/("""
			<tr>
			<td>"""),_display_(Seq[Any](/*35.9*/user/*35.13*/.id)),format.raw/*35.16*/("""</td>
			<td>"""),_display_(Seq[Any](/*36.9*/user/*36.13*/.firstName)),format.raw/*36.23*/("""</td>
			<td>"""),_display_(Seq[Any](/*37.9*/user/*37.13*/.lastName)),format.raw/*37.22*/("""</td>
			<td>"""),_display_(Seq[Any](/*38.9*/user/*38.13*/.password)),format.raw/*38.22*/(""".</td>
			<td><label> بستر</label> <input disabled type="checkbox" """),_display_(Seq[Any](/*39.62*/if(user.bedAccess)/*39.80*/{_display_(Seq[Any](format.raw/*39.81*/("""checked""")))})),format.raw/*39.89*/("""/>
			<label> لابراتوار</label> <input disabled type="checkbox" """),_display_(Seq[Any](/*40.63*/if(user.labAccess)/*40.81*/{_display_(Seq[Any](format.raw/*40.82*/("""checked""")))})),format.raw/*40.90*/(""" />
			<label>پذیرش</label> <input disabled type="checkbox" """),_display_(Seq[Any](/*41.58*/if(user.receptionAccess)/*41.82*/{_display_(Seq[Any](format.raw/*41.83*/("""checked""")))})),format.raw/*41.91*/("""/> <br /> 
			<label>حسابداری</label> <input disabled type="checkbox" """),_display_(Seq[Any](/*42.61*/if(user.accountingAccess)/*42.86*/{_display_(Seq[Any](format.raw/*42.87*/("""checked""")))})),format.raw/*42.95*/("""/> 
			<label> رزرو وقت</label> <input  disabled type="checkbox" """),_display_(Seq[Any](/*43.63*/if(user.timeReservingAccess)/*43.91*/{_display_(Seq[Any](format.raw/*43.92*/("""checked""")))})),format.raw/*43.100*/(""" /> 
			<label>اداره</label> <input  disabled type="checkbox" """),_display_(Seq[Any](/*44.59*/if(user.officeAccess)/*44.80*/{_display_(Seq[Any](format.raw/*44.81*/("""checked""")))})),format.raw/*44.89*/("""/> <br />
			<label>کسیل کش</label> <input disabled type="checkbox" """),_display_(Seq[Any](/*45.60*/if(user.ambulanceAccess)/*45.84*/{_display_(Seq[Any](format.raw/*45.85*/("""checked""")))})),format.raw/*45.93*/(""" />
			<label>ایجاد کاربر</label> <input disabled type="checkbox" """),_display_(Seq[Any](/*46.64*/if(user.createUserAccess)/*46.89*/{_display_(Seq[Any](format.raw/*46.90*/("""checked""")))})),format.raw/*46.98*/("""/> <br />
			<label>عملیات</label> <input disabled type="checkbox" """),_display_(Seq[Any](/*47.59*/if(user.operationAccess)/*47.83*/{_display_(Seq[Any](format.raw/*47.84*/("""checked""")))})),format.raw/*47.92*/(""" /> 
			<label> دوا خانه</label> <input disabled type="checkbox" """),_display_(Seq[Any](/*48.62*/if(user.drugStoreAccess)/*48.86*/{_display_(Seq[Any](format.raw/*48.87*/("""checked""")))})),format.raw/*48.95*/("""/><br /></td>
			<td>
			<button id="sbmit3" class="cancelsubmit" type="submit">
				"""),_display_(Seq[Any](/*51.6*/form(routes.Application.deleteUser(user.id))/*51.50*/ {_display_(Seq[Any](format.raw/*51.52*/(""" 
				<input id="sbmit2" type="submit" value="حذف">""")))})),format.raw/*52.51*/("""
			</button><br />
			<button id="sbmit1" class="cancelsubmit" type="submit">
				"""),_display_(Seq[Any](/*55.6*/form(routes.Application.editUser(user.id))/*55.48*/ {_display_(Seq[Any](format.raw/*55.50*/(""" 
			<input id="sbmit" type="submit" value="ویرایش">""")))})),format.raw/*56.52*/("""
			</button>
			<td>
			</tr>
			""")))})),format.raw/*60.5*/("""
		</tbody>
	</table>
			
	</body>
</html>"""))}
    }
    
    def render(users:List[User]): play.api.templates.Html = apply(users)
    
    def f:((List[User]) => play.api.templates.Html) = (users) => apply(users)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sat May 25 02:59:12 AFT 2013
                    SOURCE: E:/MyFiles/ProjectsFolders/playProjects/myClinic/app/views/userList.scala.html
                    HASH: 441e1635db2239e20d8975b4efd78ca7006c16fe
                    MATRIX: 730->1|843->20|873->42|995->128|1010->134|1075->177|1492->559|1526->577|1566->579|1620->598|1633->602|1658->605|1708->620|1721->624|1753->634|1803->649|1816->653|1847->662|1897->677|1910->681|1941->690|2046->759|2073->777|2112->778|2152->786|2254->852|2281->870|2320->871|2360->879|2458->941|2491->965|2530->966|2570->974|2678->1046|2712->1071|2751->1072|2791->1080|2894->1147|2931->1175|2970->1176|3011->1184|3111->1248|3141->1269|3180->1270|3220->1278|3326->1348|3359->1372|3398->1373|3438->1381|3542->1449|3576->1474|3615->1475|3655->1483|3760->1552|3793->1576|3832->1577|3872->1585|3975->1652|4008->1676|4047->1677|4087->1685|4211->1774|4264->1818|4304->1820|4389->1873|4511->1960|4562->2002|4602->2004|4688->2058|4758->2097
                    LINES: 26->1|30->1|32->4|39->11|39->11|39->11|61->33|61->33|61->33|63->35|63->35|63->35|64->36|64->36|64->36|65->37|65->37|65->37|66->38|66->38|66->38|67->39|67->39|67->39|67->39|68->40|68->40|68->40|68->40|69->41|69->41|69->41|69->41|70->42|70->42|70->42|70->42|71->43|71->43|71->43|71->43|72->44|72->44|72->44|72->44|73->45|73->45|73->45|73->45|74->46|74->46|74->46|74->46|75->47|75->47|75->47|75->47|76->48|76->48|76->48|76->48|79->51|79->51|79->51|80->52|83->55|83->55|83->55|84->56|88->60
                    -- GENERATED --
                */
            