
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/denis/Desktop/Alura_2017/Play/projetos/produtos-api/conf/routes
// @DATE:Fri Jan 13 15:53:19 BRST 2017

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:3
  ProdutoController_2: controllers.ProdutoController,
  // @LINE:7
  ApiController_0: controllers.ApiController,
  // @LINE:13
  Assets_1: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:3
    ProdutoController_2: controllers.ProdutoController,
    // @LINE:7
    ApiController_0: controllers.ApiController,
    // @LINE:13
    Assets_1: controllers.Assets
  ) = this(errorHandler, ProdutoController_2, ApiController_0, Assets_1, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, ProdutoController_2, ApiController_0, Assets_1, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """produto/novo""", """controllers.ProdutoController.formularioDeNovoProduto"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """produto/novo""", """controllers.ProdutoController.salvaNovoProduto"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/produtos""", """controllers.ApiController.comFiltros"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/produtos/todos""", """controllers.ApiController.todos"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/produtos/tipo/""" + "$" + """tipo<[^/]+>""", """controllers.ApiController.doTipo(tipo:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/produtos/preco/""" + "$" + """preco<[^/]+>""", """controllers.ApiController.doPreco(preco:Double)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:3
  private[this] lazy val controllers_ProdutoController_formularioDeNovoProduto0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("produto/novo")))
  )
  private[this] lazy val controllers_ProdutoController_formularioDeNovoProduto0_invoker = createInvoker(
    ProdutoController_2.formularioDeNovoProduto,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProdutoController",
      "formularioDeNovoProduto",
      Nil,
      "GET",
      """""",
      this.prefix + """produto/novo"""
    )
  )

  // @LINE:4
  private[this] lazy val controllers_ProdutoController_salvaNovoProduto1_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("produto/novo")))
  )
  private[this] lazy val controllers_ProdutoController_salvaNovoProduto1_invoker = createInvoker(
    ProdutoController_2.salvaNovoProduto,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProdutoController",
      "salvaNovoProduto",
      Nil,
      "POST",
      """""",
      this.prefix + """produto/novo"""
    )
  )

  // @LINE:7
  private[this] lazy val controllers_ApiController_comFiltros2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/produtos")))
  )
  private[this] lazy val controllers_ApiController_comFiltros2_invoker = createInvoker(
    ApiController_0.comFiltros,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ApiController",
      "comFiltros",
      Nil,
      "GET",
      """ API""",
      this.prefix + """api/produtos"""
    )
  )

  // @LINE:8
  private[this] lazy val controllers_ApiController_todos3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/produtos/todos")))
  )
  private[this] lazy val controllers_ApiController_todos3_invoker = createInvoker(
    ApiController_0.todos,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ApiController",
      "todos",
      Nil,
      "GET",
      """""",
      this.prefix + """api/produtos/todos"""
    )
  )

  // @LINE:9
  private[this] lazy val controllers_ApiController_doTipo4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/produtos/tipo/"), DynamicPart("tipo", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ApiController_doTipo4_invoker = createInvoker(
    ApiController_0.doTipo(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ApiController",
      "doTipo",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """api/produtos/tipo/""" + "$" + """tipo<[^/]+>"""
    )
  )

  // @LINE:10
  private[this] lazy val controllers_ApiController_doPreco5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/produtos/preco/"), DynamicPart("preco", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ApiController_doPreco5_invoker = createInvoker(
    ApiController_0.doPreco(fakeValue[Double]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ApiController",
      "doPreco",
      Seq(classOf[Double]),
      "GET",
      """""",
      this.prefix + """api/produtos/preco/""" + "$" + """preco<[^/]+>"""
    )
  )

  // @LINE:13
  private[this] lazy val controllers_Assets_versioned6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned6_invoker = createInvoker(
    Assets_1.versioned(fakeValue[String], fakeValue[Asset]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      """ Map static resources from the /public folder to the /assets URL path""",
      this.prefix + """assets/""" + "$" + """file<.+>"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:3
    case controllers_ProdutoController_formularioDeNovoProduto0_route(params) =>
      call { 
        controllers_ProdutoController_formularioDeNovoProduto0_invoker.call(ProdutoController_2.formularioDeNovoProduto)
      }
  
    // @LINE:4
    case controllers_ProdutoController_salvaNovoProduto1_route(params) =>
      call { 
        controllers_ProdutoController_salvaNovoProduto1_invoker.call(ProdutoController_2.salvaNovoProduto)
      }
  
    // @LINE:7
    case controllers_ApiController_comFiltros2_route(params) =>
      call { 
        controllers_ApiController_comFiltros2_invoker.call(ApiController_0.comFiltros)
      }
  
    // @LINE:8
    case controllers_ApiController_todos3_route(params) =>
      call { 
        controllers_ApiController_todos3_invoker.call(ApiController_0.todos)
      }
  
    // @LINE:9
    case controllers_ApiController_doTipo4_route(params) =>
      call(params.fromPath[String]("tipo", None)) { (tipo) =>
        controllers_ApiController_doTipo4_invoker.call(ApiController_0.doTipo(tipo))
      }
  
    // @LINE:10
    case controllers_ApiController_doPreco5_route(params) =>
      call(params.fromPath[Double]("preco", None)) { (preco) =>
        controllers_ApiController_doPreco5_invoker.call(ApiController_0.doPreco(preco))
      }
  
    // @LINE:13
    case controllers_Assets_versioned6_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned6_invoker.call(Assets_1.versioned(path, file))
      }
  }
}
