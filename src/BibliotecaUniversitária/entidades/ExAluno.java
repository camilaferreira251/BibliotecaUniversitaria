package BibliotecaUniversitária.entidades;

import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JOptionPane;

import Intefaces.Cadastrando;

public class ExAluno extends Aluno implements Cadastrando{
    private int matricula;
	ArrayList cadastro = new ArrayList();
	Scanner scan = new Scanner(System.in);
	public ExAluno() {
		// TODO Auto-generated constructor stub
	}

	public ExAluno(String nome, String sobrenome, String endereco, String email, String telefone, int matricula){
		super(nome, sobrenome, endereco, email, telefone);
		this.matricula = matricula;
	
	}
	
	public void cadastrar(){
		ExAluno ex = new ExAluno();
		
		System.out.println("Digite o nome:");
		ex.setNome(scan.nextLine());
		System.out.println("Digite o sobrenome");
		ex.setSobrenome(scan.nextLine());
		
		System.out.println("Digite o endereço:");
		ex.setEndereco(scan.nextLine());
		
		System.out.println("Digite o telefone:");
		ex.setTelefone(scan.nextLine());
		ValidaTelefone tel = new ValidaTelefone();//Instanciando objeto da classe validaEmail
		while(!tel.validaTelefone(ex.telefone)){//Verificando se o telefone é valido
			JOptionPane.showMessageDialog(null, "ERRO!");
			System.out.println("Digite o Telefone:");
			ex.setTelefone(scan.nextLine());
		}
		
		System.out.println("Digite o email:");
		ex.setEmail(scan.nextLine());
        ValidaEmail emai = new ValidaEmail();//Instanciando objeto da classe validaEmail
		
		while(!emai.validaEmail(ex.email)){//Verificando se o email é valido
			JOptionPane.showMessageDialog(null, "ERRO!");
			System.out.println("Digite o email:");
			ex.setEmail(scan.nextLine());
		}
		
		
		cadastro.add(ex);
	}
	
	public void imprimir(){
		JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso!");
		for(int i=0 ; i<cadastro.size() ; i++){
			System.out.println(cadastro.get(i));
		}
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ExAluno\nnome="
				+ nome + ", \nsobrenome=" + sobrenome + ", \nendereco=" + endereco
				+ ", \ntelefone=" + telefone + ", \nemail=" + email + "";
	}
}
