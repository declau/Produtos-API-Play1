package models;

import javax.persistence.*;

import play.data.validation.Constraints.Required;

import com.avaje.ebean.Model;

@Entity
public class Produto extends Model {
	
    @Id 
    @GeneratedValue
    private Long id;	
    @Required(message = "Produto precisa ter um título")
    private String titulo;
    @Required(message = "Produto precisa ter um código")
    private String codigo;
    @Required(message = "Produto precisa ter um tipo")
    private String tipo;
    
	private String descricao;
	
	@Required(message = "Produto precisa ter um preço")
	private Double preco;;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Double getPreco() {
		return preco;
	}
	public void setPreco(Double preco) {
		this.preco = preco;
	}
	

}
