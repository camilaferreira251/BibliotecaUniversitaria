package BibliotecaUniversitária.entidades;

import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Editoras {

	private String editora;
	private int cnpj;
	private String telefone;
	private String endereco;
	private String email;
	ArrayList cadastro = new ArrayList();
	static Scanner scan = new Scanner(System.in);
	
	public Editoras( String Editora, int Cnpj, String Telefone, String Endereco, String Email) {
		
		this.editora = editora;
		this.cnpj = cnpj;
		this.telefone = telefone;
		this.endereco = endereco;
		this.email = email;
		
	}
	
	 public Editoras() {
		// TODO Auto-generated constructor stub
	}

	public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}

	public int getCNPJ() {
		return cnpj;
	}

	public void setCNPJ(int CNPJ) {
		cnpj = CNPJ;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	
		// metodo de entrada da editora

			public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

			public void cadastrar(){
				Editoras editora = new Editoras();
				int errou;
				System.out.println("Digite o nome da editora :");
				editora.setEditora(scan.nextLine());
				
				System.out.println("Digite o telefone:");
				editora.setTelefone(scan.nextLine());
				
				System.out.println("Digite o Endereço:");
				editora.setEndereco(scan.nextLine());
				
				System.out.println("Digite o email:");
				editora.setEmail(scan.nextLine());
				ValidaEmail emai = new ValidaEmail();//Instanciando objeto da classe validaEmail
				
				while(!emai.validaEmail(editora.email)){//Verificando se o email é valido
					JOptionPane.showMessageDialog(null, "ERRO!");
					System.out.println("Digite o email:");
					editora.setEmail(scan.nextLine());
				}
				do{
					errou =0;
				try{
				System.out.println("Digite CNPJ: ");
				editora.setCNPJ(Integer.parseInt(scan.nextLine()));
				}catch(Exception erro){
					JOptionPane.showMessageDialog(null, "ERRO! Digite somente numeros.");
					errou =1;
				}}while(errou == 1);
				while (editora.cnpj<10000){
					JOptionPane.showMessageDialog(null, "ERRO!");
					System.out.println("CNJP invalido, digite novamente:");
					editora.setCNPJ(Integer.parseInt(scan.nextLine()));
				}
				
				cadastro.add(editora);

	}
			public void imprimir(){
				JOptionPane.showMessageDialog(null, "Editora cadastrada com sucesso!");
				for(int i=0 ; i<cadastro.size() ; i++){
					System.out.println(cadastro.get(i));
				}
			}

			/* (non-Javadoc)
			 * @see java.lang.Object#toString()
			 */
			@Override
			public String toString() {
				return "Editora:\neditora=" + editora + "\ncnpj=" + cnpj
						+ "\ntelefone=" + telefone + "\nendereco=" + endereco
						+ "\nemail=" + email + "";
			}

}