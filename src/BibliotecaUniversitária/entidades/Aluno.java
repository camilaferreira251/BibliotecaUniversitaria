package BibliotecaUniversitária.entidades;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JOptionPane;

import Intefaces.Cadastrando;



public class Aluno extends Pessoa implements Cadastrando {
	//especificando os atributos da classe Aluno, pode colocar o = aqui também, mas fizemos la em baixo
	private int numeroDeMatricula;
	private Livros[] livros = {};
	ArrayList cadastro = new ArrayList();
	Scanner scan = new Scanner (System.in);

	//Construtor sem PARAMETRO
	public Aluno() {
		
	}
	public Aluno(String nome, String sobrenome, String endereco, String telefone, String email){
		super(nome, sobrenome, endereco, telefone, email);
	}
	//Construtor com tres parametros
	public Aluno(int numeroDeMatricula, String nome, String sobrenome){
		super(nome, sobrenome);//Tive que criar um construtor com 2 parametros na classe pessoa para poder criar este super com 2.
		this.numeroDeMatricula=numeroDeMatricula;
	}
	//Construtor com QUATRO PARÂMETROS
	public Aluno( String nome, String sobrenome, String endereco, String email, String telefone, int numeroDeMatricula){
		super(nome, sobrenome, endereco, email, telefone);
		this.numeroDeMatricula = numeroDeMatricula;
	}
	//Método de Cadastrar um aluno
	public void cadastrar(){
		int errando;
		Aluno aluno = new Aluno();
		System.out.println("Digite o nome:");
		aluno.setNome(scan.nextLine());
		
		System.out.println("Digite o sobrenome");
		aluno.setSobrenome(scan.nextLine());
		
		System.out.println("Digite o endereço:");
		aluno.setEndereco(scan.nextLine());
		
		System.out.println("Digite o telefone:");
		aluno.setTelefone(scan.nextLine());
		ValidaTelefone tel = new ValidaTelefone();//Instanciando objeto da classe validaEmail
		while(!tel.validaTelefone(aluno.telefone)){//Verificando se o email é valido
			JOptionPane.showMessageDialog(null, "ERRO!");
			System.out.println("Digite o Telefone:");
			aluno.setTelefone(scan.nextLine());
		}
		
		System.out.println("Digite o email:");
		aluno.setEmail(scan.nextLine());
		ValidaEmail emai = new ValidaEmail();//Instanciando objeto da classe validaEmail
		
		while(!emai.validaEmail(aluno.email)){//Verificando se o email é valido
			JOptionPane.showMessageDialog(null, "ERRO!");
			System.out.println("Digite o email:");
			aluno.setEmail(scan.nextLine());
		}
		do{
			errando = 0;
		try{
		System.out.println("Digite seu numero de matricula:");
		aluno.setNumeroDeMatricula(Integer.parseInt(scan.nextLine()));
		}catch(Exception er){
			JOptionPane.showMessageDialog(null, "ERRO! Digite somente numeros.");
			errando = 1;
		}}while(errando==1);
		while (aluno.numeroDeMatricula<1000){
			
			JOptionPane.showMessageDialog(null, "ERRO!");
			System.out.println("Numero de matricula invalido, digite novamente:");
			aluno.setNumeroDeMatricula(Integer.parseInt(scan.nextLine()));
		}
		
		cadastro.add(aluno);
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
	/**
	 * @return the livros
	 */
	public Livros[] getLivros() {
		return livros;
	}

	
	public void setLivros(Livros[] livros) {
		this.livros = livros;
	}
	
	public void imprime(){
		JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso!");
		for (int i = 0; i < cadastro.size(); i++) {
			System.out.println(cadastro.get(i));
		}
	}

	//Método que verifica as pendências de um aluno
	public String[] verificarPendencias(int numeroDeMatriculaAluno){
		//verificar pendênciar via matricula do aluno
		//no momento, não vamos nos preocupar com o corpo desse método
		String[] pendencias = {"pendencia0", "pendencia1"};
		return pendencias;
	}
	
	@Override
	public String toString() {
		return "Aluno\nNumeroDeMatricula=" + numeroDeMatricula + ", \nNome="
				+ nome + ", \nSobrenome=" + sobrenome + ", \nEndereco=" + endereco
				+ ", \nTelefone=" + telefone + ", \nEmail=" + email + "";
	}
	
	
	
}//Fim da Classe Aluno


