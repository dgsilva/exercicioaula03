package entities;

public class Fornecedor {

	private Integer idFornecedor;
	private String nome;
	private String cnpj;
	private String telefone;
	private Produto produto;
	
	public Fornecedor() {
		// TODO Auto-generated constructor stub
	}

	

	public Fornecedor(Integer idFornecedor, String nome, String cnpj, String telefone, Produto produto) {
		super();
		this.idFornecedor = idFornecedor;
		this.nome = nome;
		this.cnpj = cnpj;
		this.telefone = telefone;
		this.produto = produto;
	}



	public Integer getIdFornecedor() {
		return idFornecedor;
	}

	public void setIdFornecedor(Integer idFornecedor) {
		this.idFornecedor = idFornecedor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	

	public Produto getProduto() {
		return produto;
	}



	public void setProduto(Produto produto) {
		this.produto = produto;
	}



	@Override
	public String toString() {
		return "Fornecedor [idFornecedor=" + idFornecedor + ", nome=" + nome + ", cnpj=" + cnpj + ", telefone="
				+ telefone + ", produto=" + produto + "]";
	}

}
