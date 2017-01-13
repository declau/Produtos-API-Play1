
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/denis/Desktop/Alura_2017/Play/projetos/produtos-api/conf/routes
// @DATE:Fri Jan 13 15:53:19 BRST 2017

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseProdutoController ProdutoController = new controllers.ReverseProdutoController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseAssets Assets = new controllers.ReverseAssets(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseApiController ApiController = new controllers.ReverseApiController(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseProdutoController ProdutoController = new controllers.javascript.ReverseProdutoController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseAssets Assets = new controllers.javascript.ReverseAssets(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseApiController ApiController = new controllers.javascript.ReverseApiController(RoutesPrefix.byNamePrefix());
  }

}
