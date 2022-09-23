package comex;

public class Produto {
	
	
	protected long id;
	protected String nome;
	protected String descricao;
	protected double precoUnitario;
	protected int quantidadeEstoque;
	protected Categoria categoria;
	
	
	
	public Produto(long id, String nome, String descricao, double precoUnitario, int quantidadeEstoque,
			Categoria categoria) {
		super();
		this.id = id;
		this.nome = nome;
		this.descricao = descricao;
		this.precoUnitario = precoUnitario;
		this.quantidadeEstoque = quantidadeEstoque;
		this.categoria = categoria;
		
		
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
	public long getQuantidadeEstoque() {
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
	
	public double getCalculaImposto(){
		return this.precoUnitario * 0.4;
	}	
	

}
