package br.com.comex.modelo;

public class Produto {
	
	private static long proximoId = 1;
	
	protected long id;
	protected String nome;
	protected String descricao;
	protected double precoUnitario;
	protected int quantidadeEstoque;
	protected Categoria categoria;
	protected ProdutoTributavel produtotributavel;
	
	
	public Produto(long id) {
		super();
		this.id = id;
	}
	 	
	
	public Produto(long id, String nome, String descricao, double precoUnitario, int quantidadeEstoque,
			Categoria categoria, ProdutoTributavel produtotributavel) {
		super();
		this.id = id;
		this.nome = nome;
		this.descricao = descricao;
		this.precoUnitario = precoUnitario;
		this.quantidadeEstoque = quantidadeEstoque;
		this.categoria = categoria;
		this.produtotributavel = produtotributavel;
	}



	public Produto(String nome, String descricao, double precoUnitario, int quantidadeEstoque,
			 Categoria categoria, ProdutoTributavel produtotributavel) {
		
		super();
		this.id = proximoId;
		this.nome = nome;
		this.descricao = descricao;
		this.precoUnitario = precoUnitario;
		this.quantidadeEstoque = quantidadeEstoque;
	    this.categoria = categoria;
	    this.produtotributavel = produtotributavel;
		proximoId++;
		
		
		if  (this.id <= 0) {
            throw new IllegalArgumentException("Id do produto não pode ser igual ou menor do que zero");
        } 
		
		if (nome == null) {
			throw new IllegalArgumentException("O nome do produto não pode ser nulo"); 
		}
				
		if (nome.isEmpty()) {
            throw new IllegalArgumentException("O nome do produto é obrigatório");
		}
		
		if (nome.length() <= 5) {
			throw new IllegalArgumentException("O nome do produto deve conter mais do que 5 caracteres");
		}
		
		if  (this.precoUnitario <= 0) {
            throw new IllegalArgumentException("O preço deve ser maior que zero");
        }
		
		if (quantidadeEstoque <= 0) {
	           throw new IllegalArgumentException("O produto em estoque deve ser maior do que zero");
		   }
		
		if (categoria == null) {
	           throw new IllegalArgumentException("É obrigatório inserir a categoria");
		   }
		
			
		
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public double getPrecoUnitario() {
		return precoUnitario;
	}
	public void setPrecoUnitario(double precoUnitario) {
		this.precoUnitario = precoUnitario;
	}
	public int getQuantidadeEstoque() {
		return quantidadeEstoque;
	}
	public void setQuantidadeEstoque(int quantidadeEstoque) {
		this.quantidadeEstoque = quantidadeEstoque;
	}
	public Categoria getCategoria() {
		return categoria;
	}
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	public double getValorEmEstoque(){
		return this.precoUnitario * this.quantidadeEstoque;
	}
	public double setValorEmEstoque(){
		return this.precoUnitario = quantidadeEstoque;
	}
		public double getCalculaImposto(){
		return this.precoUnitario * 0.4;
	}
	public double setCalculaImposto() {
		return setCalculaImposto();
	}
		public ProdutoTributavel getProdutoTributavel(){
		return produtotributavel;
	}
	public void setProdutoTributavel(ProdutoTributavel produtotributavel) {
		this.produtotributavel = produtotributavel;
	}
		
	
	@Override
	public String toString() {
		return "Produto [Id: " + id + ", Nome: " + nome + ", Descricao:" + descricao + ", precoUnitario: " + precoUnitario
				+ ", quantidadeEstoque: " + quantidadeEstoque + ", Categoria: " + categoria + ", Tipo: " + produtotributavel;
	}	
	

}
