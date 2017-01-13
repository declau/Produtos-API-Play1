
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object notificacoes_Scope0 {
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

class notificacoes extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*1.2*/if(!flash.empty)/*1.18*/ {_display_(Seq[Any](format.raw/*1.20*/("""
"""),format.raw/*2.1*/("""<section class="container" title="Notificações">
	"""),_display_(/*3.3*/for(key <- flash.keySet) yield /*3.27*/ {_display_(Seq[Any](format.raw/*3.29*/("""
	"""),format.raw/*4.2*/("""<p class="alert alert-"""),_display_(/*4.25*/key),format.raw/*4.28*/(""" """),format.raw/*4.29*/("""text-"""),_display_(/*4.35*/key),format.raw/*4.38*/("""">"""),_display_(/*4.41*/flash/*4.46*/.get(key)),format.raw/*4.55*/("""</p>
	""")))}),format.raw/*5.3*/(""" """),_display_(/*5.5*/flash/*5.10*/.clear()),format.raw/*5.18*/("""
"""),format.raw/*6.1*/("""</section>
""")))}),format.raw/*7.2*/("""
"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


}

/**/
object notificacoes extends notificacoes_Scope0.notificacoes
              /*
                  -- GENERATED --
                  DATE: Wed Jan 11 16:43:23 BRST 2017
                  SOURCE: /home/denis/Desktop/Alura_2017/Play/projetos/produtos-api/app/views/notificacoes.scala.html
                  HASH: 7103ad5ea5260e877249db33346f0660455a5106
                  MATRIX: 841->1|865->17|904->19|931->20|1007->71|1046->95|1085->97|1113->99|1162->122|1185->125|1213->126|1245->132|1268->135|1297->138|1310->143|1339->152|1375->159|1402->161|1415->166|1443->174|1470->175|1511->187
                  LINES: 32->1|32->1|32->1|33->2|34->3|34->3|34->3|35->4|35->4|35->4|35->4|35->4|35->4|35->4|35->4|35->4|36->5|36->5|36->5|36->5|37->6|38->7
                  -- GENERATED --
              */
          