package BibliotecaUniversitária.entidades;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JOptionPane;

import Intefaces.Cadastrando;
public class NaoAlunos extends Pessoa implements Cadastrando {

	//Especificando atributos da classe NaoAlunos
	private String cpf;
	ArrayList cadastro = new ArrayList();
	Scanner scan = new Scanner (System.in);
	//sem parametros
	public NaoAlunos() {
	}

	//construtor com três parametros
	public NaoAlunos(String nroCpf, String nome, String sobrenome){
		super(nome, sobrenome);
		this.cpf = nroCpf;
	}
	
	//construtor com quatro parametros
	public NaoAlunos(String nroCpf, String nome, String sobrenome, String endereco){
		super(nome, sobrenome, endereco);
		this.cpf = nroCpf;
		
	}
	//Construtor com todos os parametros
	public NaoAlunos(String nroCpf, String nome, String sobrenome, String endereco, String telefone, String email){
		super(nome, sobrenome, endereco, telefone, email);
		this.cpf = nroCpf;
	}
	
	//Metodo que cadastra classe
	public void cadastrar(){
		
		NaoAlunos naoAlunos = new NaoAlunos();
		System.out.println("Digite o nome:");
		naoAlunos.setNome(scan.nextLine());
		System.out.println("Digite o sobrenome:");
		naoAlunos.setSobrenome(scan.nextLine());
		System.out.println("Digite o endereco:");
		naoAlunos.setEndereco(scan.nextLine());
		System.out.println("Digite o telefone:");
		naoAlunos.setTelefone(scan.nextLine());
		System.out.println("Digite o email:");
		naoAlunos.setEmail(scan.nextLine());
        ValidaEmail emai = new ValidaEmail();//Instanciando objeto da classe validaEmail
		while(!emai.validaEmail(naoAlunos.email)){//Verificando se o email é valido
			JOptionPane.showMessageDialog(null, "ERRO!");
			System.out.println("Digite o email:");
			naoAlunos.setEmail(scan.nextLine());
		}
		System.out.println("Digite o CPF:");
		naoAlunos.setcpf(scan.nextLine());
		ValidaCpf vcpf = new ValidaCpf();
		while(!vcpf.validarCpf(naoAlunos.cpf)){//Verificando se o email é valido
			JOptionPane.showMessageDialog(null, "ERRO!");
			System.out.println("Digite o CPF:");
			naoAlunos.setcpf(scan.nextLine());
		}
		
		cadastro.add(naoAlunos);
	}
	
	public void imprimir(){
		JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso!");
		for (int i = 0; i < cadastro.size(); i++) {
			System.out.println(cadastro.get(i));
		}
		
	}

	/**
	 * @return the numeroCpf
	 */
	public String getcpf() {
		return cpf;
	}

	/**
	 * @param Cpf the Cpf to set
	 */
	public void setcpf(String cpf) {
		this.cpf = cpf;
	}

	
	


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "NaoAlunos\ncpf=" + cpf + ", \nnome=" + nome + ", \nsobrenome="
				+ sobrenome + ", \nendereco=" + endereco + ", \ntelefone="
				+ telefone + ", \nemail=" + email + "";
	}
	
}//fim da classe
