
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object main_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._

class main extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.32*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>
<html lang="en">
    <head>      
        <title>"""),_display_(/*6.17*/title),format.raw/*6.22*/("""</title>
        <meta name="viewport" content="width=device-width, intial-scale=1">
        <link rel="stylesheet" media="screen" href=""""),_display_(/*8.54*/routes/*8.60*/.Assets.versioned("bootstrap/css/bootstrap.min.css")),format.raw/*8.112*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*9.59*/routes/*9.65*/.Assets.versioned("images/favicon.png")),format.raw/*9.104*/("""">
    </head>
    <body>
        <header class="navbar navbar-default">
	        <div class="container" role="presentation">
	            <ul class="nav navbar-nav navbar-right">
	                <li><a href=""""),_display_(/*15.32*/routes/*15.38*/.ProdutoController.formularioDeNovoProduto),format.raw/*15.80*/("""">Novo produto</a></li>
	            </ul>
	        </div>
	    </header>
	    """),_display_(/*19.7*/notificacoes()),format.raw/*19.21*/("""
    """),format.raw/*20.5*/("""<main class="container">
        """),_display_(/*21.10*/content),format.raw/*21.17*/("""
    """),format.raw/*22.5*/("""</main>
    </body>
</html>
"""))
      }
    }
  }

  def render(title:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)

  def ref: this.type = this

}


}

/**/
object main extends main_Scope0.main
              /*
                  -- GENERATED --
                  DATE: Wed Jan 11 16:41:30 BRST 2017
                  SOURCE: /home/denis/Desktop/Alura_2017/Play/projetos/produtos-api/app/views/main.scala.html
                  HASH: d96e1940afbe1d853142c66d84f4ec48a366012f
                  MATRIX: 748->1|873->31|901->33|993->99|1018->104|1182->242|1196->248|1269->300|1356->361|1370->367|1430->406|1668->617|1683->623|1746->665|1852->745|1887->759|1919->764|1980->798|2008->805|2040->810
                  LINES: 27->1|32->1|34->3|37->6|37->6|39->8|39->8|39->8|40->9|40->9|40->9|46->15|46->15|46->15|50->19|50->19|51->20|52->21|52->21|53->22
                  -- GENERATED --
              */
          