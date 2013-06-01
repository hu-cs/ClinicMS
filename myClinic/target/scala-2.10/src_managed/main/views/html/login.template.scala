
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
object login extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Form[Application.Login],play.api.templates.Html] {

    /**/
    def apply/*1.2*/(form: Form[Application.Login]):play.api.templates.Html = {
        _display_ {

Seq[Any](format.raw/*1.33*/("""

<html>
<meta charset="utf-8">
<head>
<title>Clinic</title>
<link rel="shortcut icon" type="image/png" href=""""),_display_(Seq[Any](/*7.51*/routes/*7.57*/.Assets.at("images/favicon.png"))),format.raw/*7.89*/("""">
<link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(Seq[Any](/*8.62*/routes/*8.68*/.Assets.at("stylesheets/login.css"))),format.raw/*8.103*/("""">

</head>
<body>
	<div class="all">

		<div class="bdy">
				<center><h2>       کلنیک خصوصی قدس </h2> </center>
			"""),_display_(Seq[Any](/*16.5*/helper/*16.11*/.form(routes.Application.authenticate)/*16.49*/ {_display_(Seq[Any](format.raw/*16.51*/("""
				"""),_display_(Seq[Any](/*17.6*/if(form.hasGlobalErrors)/*17.30*/ {_display_(Seq[Any](format.raw/*17.32*/("""
			<p class="error">"""),_display_(Seq[Any](/*18.22*/form/*18.26*/.globalError.message)),format.raw/*18.46*/("""</p>
			""")))})),format.raw/*19.5*/(""" """),_display_(Seq[Any](/*19.7*/if(flash.contains("success"))/*19.36*/ {_display_(Seq[Any](format.raw/*19.38*/("""
			<p class="success">"""),_display_(Seq[Any](/*20.24*/flash/*20.29*/.get("success"))),format.raw/*20.44*/("""</p>
			""")))})),format.raw/*21.5*/(""" <label id="username"> نام کاربر</label> <input type="text"
				name="firstName" id="input1" placeholder="firstName" value=""""),_display_(Seq[Any](/*22.66*/form("firstName")/*22.83*/.value)),format.raw/*22.89*/("""">

			<br /> <label id="pass"> رمز ورود</label> <input class="lginpass"
				type="password" id="input2" name="password" placeholder="Password"> <br />

			<button id="btn1" class="lginsubmit" type="submit">ورود</button>
			<button id="btn2" class="cancelsubmit" type="submit">خروج</button>

			<br /> """)))})),format.raw/*30.12*/("""
		</div>
		<image src=""""),_display_(Seq[Any](/*32.16*/routes/*32.22*/.Assets.at("images/arrow.png"))),format.raw/*32.52*/("""">



</body>
</html>



"""))}
    }
    
    def render(form:Form[Application.Login]): play.api.templates.Html = apply(form)
    
    def f:((Form[Application.Login]) => play.api.templates.Html) = (form) => apply(form)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Fri May 24 18:51:07 AFT 2013
                    SOURCE: E:/MyFiles/ProjectsFolders/playProjects/myClinic/app/views/login.scala.html
                    HASH: 1dedd6de1f71eff9e3ce2675a93bab89755eaa92
                    MATRIX: 740->1|848->32|1000->149|1014->155|1067->187|1167->252|1181->258|1238->293|1399->419|1414->425|1461->463|1501->465|1543->472|1576->496|1616->498|1675->521|1688->525|1730->545|1771->555|1808->557|1846->586|1886->588|1947->613|1961->618|1998->633|2039->643|2201->769|2227->786|2255->792|2598->1103|2661->1130|2676->1136|2728->1166
                    LINES: 26->1|29->1|35->7|35->7|35->7|36->8|36->8|36->8|44->16|44->16|44->16|44->16|45->17|45->17|45->17|46->18|46->18|46->18|47->19|47->19|47->19|47->19|48->20|48->20|48->20|49->21|50->22|50->22|50->22|58->30|60->32|60->32|60->32
                    -- GENERATED --
                */
            