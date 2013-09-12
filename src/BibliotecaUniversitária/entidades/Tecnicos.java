package BibliotecaUniversitária.entidades;

import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JOptionPane;

import Intefaces.Cadastrando;

public class Tecnicos extends Pessoa implements Cadastrando{
	private int codigo;
	ArrayList cadastro = new ArrayList();
	Scanner scan = new Scanner (System.in);
	
	//Construtor sem Parametro
	public Tecnicos() {
	this.codigo = 0;
	this.nome = "sem nome";
	this.sobrenome = "sem sobrenome";
	this.endereco = "sem endereco";
	this.telefone = "sem telefone";
	this.email = "sem email";
	
	}
	//Construtor com Tres parametros
	public Tecnicos(int codigoTecnicos, String nome, String sobrenome){
		super(nome, sobrenome);
		this.codigo = codigoTecnicos;
		this.endereco = "sem endereco";
		this.telefone = "sem telefone";
		this.email = "sem email";	
	}
	
	public Tecnicos(int codigoTecnicos, String nome, String sobrenome, String endereco, String telefone, String email){
		super(nome, sobrenome, endereco, email, telefone);
		this.codigo = codigoTecnicos;
	}
	//Construtor com quatro parametros
	public Tecnicos(String nome, String sobrenome, String endereco){
		super(nome, sobrenome, endereco);
		this.codigo = 0;
		this.email = "sem email";
		this.telefone = "sem telefone";
		
	}
	
	//Método de cadastrar Tecnicos
	public void cadastrar (){
		int errando;
		Tecnicos tecnicos = new Tecnicos();
		
		System.out.println("Digite o nome:");
		tecnicos.setNome(scan.nextLine());
		
		System.out.println("Digite o sobrenome");
		tecnicos.setSobrenome(scan.nextLine());
		
		System.out.println("Digite o endereço:");
		tecnicos.setEndereco(scan.nextLine());
		
		System.out.println("Digite o telefone:");
		tecnicos.setTelefone(scan.nextLine());
		
		System.out.println("Digite o email:");
		tecnicos.setEmail(scan.nextLine());
        ValidaEmail emai = new ValidaEmail();//Instanciando objeto da classe validaEmail
		
		while(!emai.validaEmail(tecnicos.email)){//Verificando se o email é valido
			JOptionPane.showMessageDialog(null, "ERRO!");
			System.out.println("Digite o email:");
			tecnicos.setEmail(scan.nextLine());
		}
		
		
		do{
			errando = 0;
		try{
		System.out.println("Digite seu Codigo:");
		tecnicos.setCodigo(Integer.parseInt(scan.nextLine()));
		}catch(Exception rro){
			JOptionPane.showMessageDialog(null, "ERRO! Digite somente numeros.");
			errando = 1;
		}}while(errando == 1);
		while (tecnicos.codigo<1000){
			JOptionPane.showMessageDialog(null, "ERRO!");
			System.out.println("Codigo invalido, digite novamente:");
			tecnicos.setCodigo(Integer.parseInt(scan.nextLine()));
		}
		
		cadastro.add(tecnicos);
	}
	
	public void imprime(){
		JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso!");
		for (int i = 0; i < cadastro.size(); i++) {
			System.out.println(cadastro.get(i));
		}
	}

	
	/**
	 * @return the codigo
	 */
	public int getCodigo() {
		return codigo;
	}
	/**
	 * @param codigo the codigo to set
	 */
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
	
	@Override
	public String toString() {
		return "Tecnicos\ncodigo=" + codigo + ", \nnome=" + nome + ", \nsobrenome="
				+ sobrenome + ", \nendereco=" + endereco + ", \ntelefone="
				+ telefone + ", \nemail=" + email + "]";
	}
}//fim da classe Tecnicos
