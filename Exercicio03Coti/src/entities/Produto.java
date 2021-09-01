package entities;

import java.util.Date;
import java.util.List;

public class Produto {

	private Integer idProduto;
	private String nome;
	private Double preco;
	private Integer quantidade;
	private Date dataCompra;
	private List<Fornecedor>fornecedor;

	public Produto() {
		// TODO Auto-generated constructor stub
	}

	

	public Produto(Integer idProduto, String nome, Double preco, Integer quantidade, Date dataCompra,
			List<Fornecedor> fornecedor) {
		super();
		this.idProduto = idProduto;
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
		this.dataCompra = dataCompra;
		this.fornecedor = fornecedor;
	}



	public Integer getIdProduto() {
		return idProduto;
	}

	public void setIdProduto(Integer idProduto) {
		this.idProduto = idProduto;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public Date getDataCompra() {
		return dataCompra;
	}

	public void setDataCompra(Date dataCompra) {
		this.dataCompra = dataCompra;
	}
	

	public List<Fornecedor> getFornecedor() {
		return fornecedor;
	}



	public void setFornecedor(List<Fornecedor> fornecedor) {
		this.fornecedor = fornecedor;
	}


	@Override
	public String toString() {
		return "Produto [idProduto=" + idProduto + ", nome=" + nome + ", preco=" + preco + ", quantidade=" + quantidade
				+ ", dataCompra=" + dataCompra + ", fornecedor=" + fornecedor + "]";
	}


}
