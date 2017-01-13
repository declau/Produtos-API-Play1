package controllers;

import javax.inject.Inject;

import models.Produto;
import play.data.Form;
import play.data.FormFactory;
import play.mvc.Controller;
import play.mvc.Result;
import validadores.ValidadorDeProduto;
import views.html.formularioDeNovoProduto;

public class ProdutoController extends Controller {

	@Inject
	private FormFactory formularios;
	@Inject
	private ValidadorDeProduto validadorDeProduto;

	public Result salvaNovoProduto() {
		Form<Produto> formulario = formularios.form(Produto.class)
				.bindFromRequest();
		Produto produto = formulario.get();

		if (validadorDeProduto.temErros(formulario)) {
			flash("danger", "Há erros no formulário de cadastro de novo produto");
			return badRequest(formularioDeNovoProduto.render(formulario));
		}
		produto.save();
		flash("success", "Seu novo produto '" + produto.getTitulo()
				+ "' foi criado com sucesso");
		return redirect(routes.ProdutoController.formularioDeNovoProduto());
	}

	public Result formularioDeNovoProduto() {
		Produto produto = new Produto();
		produto.setTipo("Papelaria");
		Form<Produto> formulario = formularios.form(Produto.class)
				.fill(produto);
		return ok(formularioDeNovoProduto.render(formulario));
	}

}