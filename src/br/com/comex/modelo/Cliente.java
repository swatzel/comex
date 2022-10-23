package br.com.comex.modelo;

public class Cliente {
	
	private static long proximoId = 1;
	
	protected long id;
	protected String nome;
	protected String cpf;
	protected String telefone;
	protected String rua;
	protected String numero;
	protected String complemento;
	protected String bairro;
	protected String cidade;
	protected Estados estado;
	
	
	public Cliente() {
		}
	
	
	public Cliente(String nome, String cpf, String telefone, String rua, String numero, String complemento,
			String bairro, String cidade, Estados estado) {
		super();
		this.id = proximoId;
		this.nome = nome;
		this.cpf = cpf;
		this.telefone = telefone;
		this.rua = rua;
		this.numero = numero;
		this.complemento = complemento;
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
		proximoId++;
	}


	public Cliente(long id, String nome, String cpf, String telefone, String rua, String numero, 
			String complemento, String bairro, String cidade, Estados estado) {
		super();
		this.id = id;
		this.nome = nome;
		this.cpf = cpf;
		this.telefone = telefone;
		this.rua = rua;
		this.numero = numero;
		this.complemento = complemento;
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
	
	
	if  (this.id <= 0) {
            throw new IllegalArgumentException("Id do produto não pode ser igual ou menor do que zero");
    } 
		
	if (nome == null) {
		throw new IllegalArgumentException("O nome do cliente não pode ser nulo"); 
	}
			
	if (nome.isEmpty()) {
        throw new IllegalArgumentException("O nome do cliente é obrigatório");
	}
	
	if (rua.length() <= 5) {
		throw new IllegalArgumentException("O nome do produto deve conter mais do que 5 caracteres");
	}
	
	if  (numero.length() < 1) {
        throw new IllegalArgumentException("O preço deve ser maior que zero");
    }
	
	if (bairro.length() < 1) {
           throw new IllegalArgumentException("O bairro deve conter mais de 1 caracter");
	   }
	
	if (cidade.length() < 1 ) {
           throw new IllegalArgumentException("A cidade deve conter mais de 1 caracter");
	   }
	
	if (estado == null ) {
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
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public Estados getEstado() {
		return estado;
	}
	public void setEstado(Estados estado) {
		this.estado = estado;
	}



	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nome=" + nome + ", cpf=" + cpf + ", telefone=" + telefone + ", rua=" + rua
				+ ", numero=" + numero + ", complemento=" + complemento + ", bairro=" + bairro + ", cidade=" + cidade
				+ ", estado=" + estado + "]";
	}
	
}


