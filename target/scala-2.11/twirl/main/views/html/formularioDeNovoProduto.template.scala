
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object formularioDeNovoProduto_Scope0 {
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

class formularioDeNovoProduto extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Form[Produto],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(formulario: Form[Produto]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import b3.vertical.fieldConstructor

Seq[Any](format.raw/*1.29*/("""

"""),_display_(/*4.2*/main("Welcome to Play")/*4.25*/ {_display_(Seq[Any](format.raw/*4.27*/("""
	"""),_display_(/*5.3*/b3/*5.5*/.form(routes.ProdutoController.salvaNovoProduto)/*5.53*/ {_display_(Seq[Any](format.raw/*5.55*/("""
	
    	"""),format.raw/*7.6*/("""<h1>Cadastro de Produto</h1>
    	"""),_display_(/*8.7*/b3/*8.9*/.text(formulario("titulo"), '_label -> "Título")),format.raw/*8.57*/("""
        """),_display_(/*9.10*/b3/*9.12*/.text(formulario("codigo"), '_label -> "Código")),format.raw/*9.60*/("""
        """),_display_(/*10.10*/b3/*10.12*/.text(formulario("tipo"), '_label -> "Tipo")),format.raw/*10.56*/("""
        """),_display_(/*11.10*/b3/*11.12*/.textarea(formulario("descricao"), '_label -> "Descrição")),format.raw/*11.70*/("""
        """),_display_(/*12.10*/b3/*12.12*/.number(formulario("preco"), '_label -> "Preço")),format.raw/*12.60*/("""
        """),_display_(/*13.10*/b3/*13.12*/.submit('class -> "btn btn-primary")/*13.48*/ {_display_(Seq[Any](format.raw/*13.50*/(""" """),format.raw/*13.51*/("""Cadastrar """)))}),format.raw/*13.62*/("""
	""")))}),format.raw/*14.3*/("""
""")))}),format.raw/*15.2*/("""
"""))
      }
    }
  }

  def render(formulario:Form[Produto]): play.twirl.api.HtmlFormat.Appendable = apply(formulario)

  def f:((Form[Produto]) => play.twirl.api.HtmlFormat.Appendable) = (formulario) => apply(formulario)

  def ref: this.type = this

}


}

/**/
object formularioDeNovoProduto extends formularioDeNovoProduto_Scope0.formularioDeNovoProduto
              /*
                  -- GENERATED --
                  DATE: Mon Jan 09 19:42:41 BRST 2017
                  SOURCE: /home/denis/Desktop/Alura_2017/Play/projetos/produtos-api/app/views/formularioDeNovoProduto.scala.html
                  HASH: f37c2ffc4fea486ca00080bbc6fb58a1b36358b4
                  MATRIX: 788->1|945->28|973->68|1004->91|1043->93|1071->96|1080->98|1136->146|1175->148|1209->156|1269->191|1278->193|1346->241|1382->251|1392->253|1460->301|1497->311|1508->313|1573->357|1610->367|1621->369|1700->427|1737->437|1748->439|1817->487|1854->497|1865->499|1910->535|1950->537|1979->538|2021->549|2054->552|2086->554
                  LINES: 27->1|32->1|34->4|34->4|34->4|35->5|35->5|35->5|35->5|37->7|38->8|38->8|38->8|39->9|39->9|39->9|40->10|40->10|40->10|41->11|41->11|41->11|42->12|42->12|42->12|43->13|43->13|43->13|43->13|43->13|43->13|44->14|45->15
                  -- GENERATED --
              */
          