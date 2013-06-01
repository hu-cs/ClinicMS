
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
object userEditForm extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template2[Long,Form[User],play.api.templates.Html] {

    /**/
    def apply/*1.2*/(id: Long, userForm: Form[User]):play.api.templates.Html = {
        _display_ {import helper._


Seq[Any](format.raw/*1.34*/("""

"""),format.raw/*4.1*/("""
<!DOCTYPE html>

<html>
    <head>
        <title>Users</title>
        <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*10.54*/routes/*10.60*/.Assets.at("stylesheets/editForm.css"))),format.raw/*10.98*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(Seq[Any](/*11.59*/routes/*11.65*/.Assets.at("images/favicon.png"))),format.raw/*11.97*/("""">
        <script src=""""),_display_(Seq[Any](/*12.23*/routes/*12.29*/.Assets.at("javascripts/jquery-1.9.0.min.js"))),format.raw/*12.74*/("""" type="text/javascript"></script>
    </head>
    <body>
        <header>
            <dl id="user">

                <dd>
                    <a href=""""),_display_(Seq[Any](/*19.31*/routes/*19.37*/.Application.logout())),format.raw/*19.58*/("""">Logout</a>
                </dd>
            </dl>
        </header>

	<h1>edit user</h1>

            <table  class="users" height="30">
            <thead>
                <tr>
                        <td>
  							<b>First Name</b>
                        </td>
                        <td>
							<b>Last Name</b>
                        </td>
                        <td>
							<b>Password</b>
                        </td>
                         <td>
							<b>Accessibility</b>
                        </td>
                         <td>
							<b>Actions</b>
                        </td>
                    </tr>
            </thead>
            <tbody>

    
    <h2>edit User</h2>
    
    """),_display_(Seq[Any](/*51.6*/form(routes.Application.updateUser(id))/*51.45*/ {_display_(Seq[Any](format.raw/*51.47*/("""
        
     <td>   """),_display_(Seq[Any](/*53.14*/inputText(userForm("id")))),format.raw/*53.39*/("""  </td>
      <td>   """),_display_(Seq[Any](/*54.15*/inputText(userForm("firstName")))),format.raw/*54.47*/("""   </td>
     <td>    """),_display_(Seq[Any](/*55.15*/inputText(userForm("lastName")))),format.raw/*55.46*/(""" </td>
      <td>   """),_display_(Seq[Any](/*56.15*/inputPassword(userForm("password")))),format.raw/*56.50*/(""" </td>
    <td>     """),_display_(Seq[Any](/*57.15*/checkbox(userForm("accountingAccess")))),format.raw/*57.53*/(""" </td>
    <tr>
	 <td>	"""),_display_(Seq[Any](/*59.9*/checkbox(userForm("bedAcces")))),format.raw/*59.39*/(""" </td>
	 <td>	"""),_display_(Seq[Any](/*60.9*/checkbox(userForm("labAccess")))),format.raw/*60.40*/(""" </td>
	 <td>	"""),_display_(Seq[Any](/*61.9*/checkbox(userForm("timeReservingAccess")))),format.raw/*61.50*/("""  </td>
	 <td>	"""),_display_(Seq[Any](/*62.9*/checkbox(userForm("ambulanceAccess")))),format.raw/*62.46*/(""" </td>
	 <td>	"""),_display_(Seq[Any](/*63.9*/checkbox(userForm("operationAccess")))),format.raw/*63.46*/(""" </td> </tr>
	 <tr>
	 <td>	"""),_display_(Seq[Any](/*65.9*/checkbox(userForm("receptionAccess")))),format.raw/*65.46*/(""" </td>
	 <td>	"""),_display_(Seq[Any](/*66.9*/checkbox(userForm("officeAccess")))),format.raw/*66.43*/(""" </td>
		 <td>"""),_display_(Seq[Any](/*67.9*/checkbox(userForm("createUserAccess")))),format.raw/*67.47*/(""" </td>
	 <td>	"""),_display_(Seq[Any](/*68.9*/checkbox(userForm("drugStoreAccess")))),format.raw/*68.46*/(""" </td> </tr>

		
        <input type="submit" value="Create">
        <a href=""""),_display_(Seq[Any](/*72.19*/routes/*72.25*/.Application.users())),format.raw/*72.45*/("""" class="btn">Cancel</a> 
    """)))})),format.raw/*73.6*/("""
    </body>
</html>
"""))}
    }
    
    def render(id:Long,userForm:Form[User]): play.api.templates.Html = apply(id,userForm)
    
    def f:((Long,Form[User]) => play.api.templates.Html) = (id,userForm) => apply(id,userForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sat May 25 04:07:15 AFT 2013
                    SOURCE: E:/MyFiles/ProjectsFolders/playProjects/myClinic/app/views/userEditForm.scala.html
                    HASH: 8aae258108b582382aba3781b773451f257b2e14
                    MATRIX: 739->1|865->33|895->55|1055->179|1070->185|1130->223|1228->285|1243->291|1297->323|1359->349|1374->355|1441->400|1638->561|1653->567|1696->588|2471->1328|2519->1367|2559->1369|2620->1394|2667->1419|2726->1442|2780->1474|2840->1498|2893->1529|2951->1551|3008->1586|3066->1608|3126->1646|3187->1672|3239->1702|3290->1718|3343->1749|3394->1765|3457->1806|3509->1823|3568->1860|3619->1876|3678->1913|3743->1943|3802->1980|3853->1996|3909->2030|3960->2046|4020->2084|4071->2100|4130->2137|4250->2221|4265->2227|4307->2247|4370->2279
                    LINES: 26->1|30->1|32->4|38->10|38->10|38->10|39->11|39->11|39->11|40->12|40->12|40->12|47->19|47->19|47->19|79->51|79->51|79->51|81->53|81->53|82->54|82->54|83->55|83->55|84->56|84->56|85->57|85->57|87->59|87->59|88->60|88->60|89->61|89->61|90->62|90->62|91->63|91->63|93->65|93->65|94->66|94->66|95->67|95->67|96->68|96->68|100->72|100->72|100->72|101->73
                    -- GENERATED --
                */
            