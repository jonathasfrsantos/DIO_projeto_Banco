package entidades;

public class Cliente {

	private String cpf;
	private String nome;
	private String email;
	private String celular;
	private String chavePix;

	public Cliente() {

	}

	public Cliente(String cpf, String nome, String email, String celular) {
		this.cpf = cpf;
		this.nome = nome;
		this.email = email;
		this.celular = celular;

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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getChavePix() {
		return chavePix;
	}

	public void setChavePix(String chavePix) {
		this.chavePix = chavePix;
	}

}
