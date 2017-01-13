
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/denis/Desktop/Alura_2017/Play/projetos/produtos-api/conf/routes
// @DATE:Fri Jan 13 15:53:19 BRST 2017


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
