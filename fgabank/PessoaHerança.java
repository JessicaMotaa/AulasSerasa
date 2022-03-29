package fgabank;

public class PessoaHerança {
	String nome;
	String email;
	String telefone;
	
	
	public PessoaHerança() {
		//método construtor default = preenchimento dos atributos é opicional
	}
	public PessoaHerança(String nome, String cpf, String rg) {
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
	}
	
	public PessoaHerança(String nome, String cpf, String rg, String profissao, String email, String telefone) {
	super();
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
	}
	
	public String getNome() {//exibe os objetos
		return nome;
	}
	public void setNome(String nome) {//grava os objetos nos atributos
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	
}


