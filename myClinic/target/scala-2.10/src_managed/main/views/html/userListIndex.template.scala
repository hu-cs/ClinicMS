
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
object userListIndex extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template2[List[User],Form[User],play.api.templates.Html] {

    /**/
    def apply/*1.2*/(users: List[User], userForm: Form[User]):play.api.templates.Html = {
        _display_ {import helper._


Seq[Any](format.raw/*1.43*/("""

"""),format.raw/*4.1*/("""
<!DOCTYPE html>

<html>
<head>
<title>Users</title>
<link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*10.46*/routes/*10.52*/.Assets.at("stylesheets/userListIndex.css"))),format.raw/*10.95*/("""">
<link rel="shortcut icon" type="image/png" href=""""),_display_(Seq[Any](/*11.51*/routes/*11.57*/.Assets.at("images/favicon.png"))),format.raw/*11.89*/("""">
<script src=""""),_display_(Seq[Any](/*12.15*/routes/*12.21*/.Assets.at("javascripts/jquery-1.9.0.min.js"))),format.raw/*12.66*/("""" type="text/javascript"></script>
</head>
<body>
	<header>
		<a href=""""),_display_(Seq[Any](/*16.13*/routes/*16.19*/.Application.logout())),format.raw/*16.40*/("""">Logout</a>
	</header>
	
	<nav>
		<a href="#" > صفحه اصلی <div id="label2"> </div> </a>
		<a href="#"> پذیرش <div id="label000"> </div> </a> 
		<a href="#"> اداره  <div id="label3"> </div></a>
		<a href="#"> حسابداری  <div id="label4"> </div></a>
		<a href="#"> کسیل کش <div id="label5"> </div></a>
		<a href="#"> آزمایشگاه <div id="label6"></div></a>
		<a href="#"> بستر <div id="label7"></div></a>
		<a href="#"> نسایی و عملیات <div id="label8"></div></a>
		<a href="#"> ثبت وقت <div id="label9"></div></a>
		<a href="#"> دواخانه <div id="label10"></div></a>
	</nav>

	<div class="all">
		<div class="right">
			<a href="#"> ليست کارمندان </a> 
			<a href="#"> فورم راجستر کارمندان
			</a> <a href="#"> راجستر نوکريوالي </a>
			<a href="#"> ايجاد کاربر </a>


		</div>
		<div class="left">
	"""),_display_(Seq[Any](/*42.3*/views/*42.8*/.html.userList(users: List[User]))),format.raw/*42.41*/("""
	"""),_display_(Seq[Any](/*43.3*/views/*43.8*/.html.createForm(userForm: Form[User]))),format.raw/*43.46*/("""
	</div>

	
	<div class="right-bottom">

</div>


</div>


		
<footer>

</footer>	
</body>
</html>



"""))}
    }
    
    def render(users:List[User],userForm:Form[User]): play.api.templates.Html = apply(users,userForm)
    
    def f:((List[User],Form[User]) => play.api.templates.Html) = (users,userForm) => apply(users,userForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sat May 25 03:52:42 AFT 2013
                    SOURCE: E:/MyFiles/ProjectsFolders/playProjects/myClinic/app/views/userListIndex.scala.html
                    HASH: 38327774fb49742d22e554d583c5bd01f7956417
                    MATRIX: 746->1|881->42|911->64|1051->168|1066->174|1131->217|1221->271|1236->277|1290->309|1344->327|1359->333|1426->378|1538->454|1553->460|1596->481|2452->1302|2465->1307|2520->1340|2559->1344|2572->1349|2632->1387
                    LINES: 26->1|30->1|32->4|38->10|38->10|38->10|39->11|39->11|39->11|40->12|40->12|40->12|44->16|44->16|44->16|70->42|70->42|70->42|71->43|71->43|71->43
                    -- GENERATED --
                */
            