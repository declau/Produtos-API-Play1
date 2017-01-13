
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/denis/Desktop/Alura_2017/Play/projetos/produtos-api/conf/routes
// @DATE:Fri Jan 13 15:53:19 BRST 2017

import play.api.routing.JavaScriptReverseRoute
import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:3
package controllers.javascript {
  import ReverseRouteContext.empty

  // @LINE:3
  class ReverseProdutoController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:3
    def formularioDeNovoProduto: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ProdutoController.formularioDeNovoProduto",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "produto/novo"})
        }
      """
    )
  
    // @LINE:4
    def salvaNovoProduto: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ProdutoController.salvaNovoProduto",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "produto/novo"})
        }
      """
    )
  
  }

  // @LINE:13
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:13
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[Asset]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }

  // @LINE:7
  class ReverseApiController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:8
    def todos: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ApiController.todos",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/produtos/todos"})
        }
      """
    )
  
    // @LINE:9
    def doTipo: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ApiController.doTipo",
      """
        function(tipo0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/produtos/tipo/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("tipo", encodeURIComponent(tipo0))})
        }
      """
    )
  
    // @LINE:10
    def doPreco: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ApiController.doPreco",
      """
        function(preco0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/produtos/preco/" + (""" + implicitly[PathBindable[Double]].javascriptUnbind + """)("preco", preco0)})
        }
      """
    )
  
    // @LINE:7
    def comFiltros: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ApiController.comFiltros",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/produtos"})
        }
      """
    )
  
  }


}
