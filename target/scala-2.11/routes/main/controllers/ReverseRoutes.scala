
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/denis/Desktop/Alura_2017/Play/projetos/produtos-api/conf/routes
// @DATE:Fri Jan 13 15:53:19 BRST 2017

import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:3
package controllers {

  // @LINE:3
  class ReverseProdutoController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:3
    def formularioDeNovoProduto(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "produto/novo")
    }
  
    // @LINE:4
    def salvaNovoProduto(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "produto/novo")
    }
  
  }

  // @LINE:13
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:13
    def versioned(file:Asset): Call = {
      implicit val _rrc = new ReverseRouteContext(Map(("path", "/public")))
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[Asset]].unbind("file", file))
    }
  
  }

  // @LINE:7
  class ReverseApiController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:8
    def todos(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "api/produtos/todos")
    }
  
    // @LINE:9
    def doTipo(tipo:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "api/produtos/tipo/" + implicitly[PathBindable[String]].unbind("tipo", dynamicString(tipo)))
    }
  
    // @LINE:10
    def doPreco(preco:Double): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "api/produtos/preco/" + implicitly[PathBindable[Double]].unbind("preco", preco))
    }
  
    // @LINE:7
    def comFiltros(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "api/produtos")
    }
  
  }


}
