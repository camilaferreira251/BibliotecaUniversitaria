package BibliotecaUniversitária.entidades;

import java.util.Scanner;

import Intefaces.Cadastrando;

public abstract class Pessoa {
	protected String nome;
	protected String sobrenome;
	protected String endereco;
	protected String telefone;
	protected String email;
	protected Livros[] livros = {};
	protected Revistas[] revistas={};
	protected Artigos[] artigos={};
	Scanner scan = new Scanner(System.in);
	public Pessoa() {
		// TODO Auto-generated constructor stub
	}

	//Construtor com 2 Parametros
	public Pessoa(String nome, String sobrenome){
		this.nome= nome;
		this.sobrenome = sobrenome;
	}
	//Construtor com 3 Parametros
	public Pessoa(String nome, String sobrenome, String endereco){
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.endereco = endereco;
	}
	//Construtor com todos os parametros.
	public Pessoa(String nome, String sobrenome, String endereco, String telefone, String email){
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.email = email;
		this.endereco = endereco;
		this.telefone = telefone;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}

	
	public String getSobrenome() {
		return sobrenome;
	}

	
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	
	public String getEndereco() {
		return endereco;	}

	
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	
	public String getTelefone() {
		return telefone;
	}

	
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}
	
	public abstract void cadastrar();//Método abstract
	
}
