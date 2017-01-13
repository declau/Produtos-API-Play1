package validadores;

import javax.inject.Inject;

import models.Produto;
import play.data.validation.ValidationError;
import daos.ProdutoDAO;

public class ValidadorDeProduto {

	@Inject
	private ProdutoDAO produtoDAO;

	public boolean temErros(play.data.Form<Produto> formulario) {
		Produto produto = formulario.get();
		if (produto.getPreco() < 0.0) {
			formulario.reject(new ValidationError("preco",
					"Preço tem que ser maior ou igual a zero."));
		}
		if (produtoDAO.comCodigo(produto.getCodigo()).isPresent()) {
			formulario.reject(new ValidationError("codigo",
					"Já existe um produto com este código."));
		}
		return formulario.hasErrors();
	}

}
