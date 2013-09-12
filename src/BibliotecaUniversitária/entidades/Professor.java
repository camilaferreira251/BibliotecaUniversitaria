package BibliotecaUniversitária.entidades;

import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JOptionPane;

import Intefaces.Cadastrando;

public class Professor extends Pessoa implements Cadastrando  {

	//Especificando atributos da classe Professor
	private int numeroDeMatricula;
	ArrayList cadastro = new ArrayList();
	Scanner scan = new Scanner(System.in);
	//sem parametros
	public Professor() {
		this.numeroDeMatricula  = 0;
		this.nome = "sem nome";
		this.sobrenome = "sem sobrenome";
		this.endereco = "sem endereco";
		this.telefone = "sem telefone";
		this.email = "sem email";
		// TODO Auto-generated constructor stub
	}

	//construtor com três parametros
	public Professor(int nroMatriculaProfessor, String nome, String sobrenome){
		super (nome, sobrenome);
		this.numeroDeMatricula = nroMatriculaProfessor;
		this.endereco = "sem endereco";
		this.telefone = "sem telefone";
		this.email  = "sem email";
	}
	
	//construtor com quatro parametros
	public Professor (int nroMatriculaProfessor, String nome, String sobrenome, String email){
	super(nome, sobrenome, email);
		this.numeroDeMatricula = nroMatriculaProfessor;
		this.endereco = "sem endereco";
		this.telefone = "sem telefone";
	}
	
	public Professor(int nroMatriculaProfessor, String nome, String sobrenome, String email, String endereco, String telefone){
		super(nome, sobrenome, email, endereco, telefone);
		this.numeroDeMatricula = nroMatriculaProfessor;
	}
	//Metodo que cadastra classe
	public void cadastrar(){
		int errando;
	Professor professor = new Professor();
	System.out.println("Digite o nome:");
	professor.setNome(scan.nextLine());
	
	System.out.println("Digite o sobrenome");
	professor.setSobrenome(scan.nextLine());
	
	System.out.println("Digite o endereço:");
	professor.setEndereco(scan.nextLine());
	
	System.out.println("Digite o telefone:");
	professor.setTelefone(scan.nextLine());
	
	System.out.println("Digite o email:");
	professor.setEmail(scan.nextLine());
	ValidaEmail emai = new ValidaEmail();//Instanciando objeto da classe validaEmail
	
	while(!emai.validaEmail(professor.email)){//Verificando se o email é valido
		JOptionPane.showMessageDialog(null, "ERRO!");
		System.out.println("Digite o email:");
		professor.setEmail(scan.nextLine());
	}
	
	do{
		errando = 0;
	try{
	System.out.println("Digite seu numero de matricula:");
	professor.setNumeroDeMatricula(Integer.parseInt(scan.nextLine()));
	}catch(Exception err){
		JOptionPane.showMessageDialog(null, "ERRO! Digite somente numeros,");
		errando = 1;
	}}while(errando == 1);
	while (professor.numeroDeMatricula<1000){
		JOptionPane.showMessageDialog(null, "ERRO!");
		System.out.println("Numero de matricula invalido, digite novamente:");
		professor.setNumeroDeMatricula(Integer.parseInt(scan.nextLine()));
	}
	
	
	cadastro.add(professor);
	}
	

	/**
	 * @return the numeroDeMatricula
	 */
	public int getNumeroDeMatricula() {
		return numeroDeMatricula;
	}

	/**
	 * @param numeroDeMatricula the numeroDeMatricula to set
	 */
	public void setNumeroDeMatricula(int numeroDeMatricula) {
		this.numeroDeMatricula = numeroDeMatricula;
	}


	public void imprime(){
		JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso!");
		for (int i = 0; i < cadastro.size(); i++) {
			System.out.println(cadastro.get(i));
		}
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Professor\nnumeroDeMatricula=" + numeroDeMatricula + ", \nnome="
				+ nome + ", \nsobrenome=" + sobrenome + ", \nendereco=" + endereco
				+ ", \ntelefone=" + telefone + ", \nemail=" + email + "";
	}
	
}//fim da classe