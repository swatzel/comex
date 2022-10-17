package br.com.comex.modelo;

public class Categoria {
	
	private static long proximoId = 1;
	
	private long id;
	private String nome;
	private StatusCategoria status;
	
	
	
	public Categoria(long id) {
		this.id = id;
	}
	
	public Categoria(long id, String nome, StatusCategoria status) {
		super();
		this.id = id;
		this.nome = nome;
		this.status = status;
	}

	public Categoria(String nome, StatusCategoria status) {
		
		this.id = proximoId;
		this.nome = nome;
		this.status = status;
		proximoId++;
		
		if  (this.id <= 0) {
            throw new IllegalArgumentException("Id não pode ser zero");
        } 
		
			
		if (nome == null) {
			throw new IllegalArgumentException("O nome da categoria é obrigatório"); 
		}
			
		
		if (nome.isEmpty()) {
            throw new IllegalArgumentException("Nome da categoria não pode estar vazio");
		}
		
		if (nome.length() <= 3) {
			throw new IllegalArgumentException("O tamanho do nome da categoria conter mais do que 3 caracteres");
		}
		
		if (status != StatusCategoria.ATIVA && status != StatusCategoria.INATIVA ) {
	           throw new IllegalArgumentException("Categoria Inválida");
		
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
	public StatusCategoria getStatus() {
		return status;
	}
	public void setStatus(StatusCategoria status) {
		this.status = status;
	}

	
	
}
