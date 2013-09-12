package BibliotecaUniversitária.entidades;

import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JOptionPane;

import Intefaces.Cadastrando;

public class Artigos extends Livros implements Cadastrando{

	Scanner scan = new Scanner(System.in);
	ArrayList cadastro = new ArrayList();
	
	public Artigos() {
		// TODO Auto-generated constructor stub
	}
	
	public Artigos (int codigoLivro, String nomeLivro, int quantTotal, int quantDisp){
		super(codigoLivro, nomeLivro, quantTotal, quantDisp);
	}
	
	public Artigos(int codigoLivro, String nomeLivro, String nomeAutor, String categLivro, int quantTotal, int quantDisp ){
		super(codigoLivro, nomeLivro, nomeAutor, categLivro, quantTotal, quantDisp);
	}
	
public void cadastrar(){
		String continuar;
		do{
		int continuando;
		Artigos artigos = new Artigos();
		System.out.println("Digite o nome do Artigo:");
		artigos.setNome(scan.nextLine());
		
		System.out.println("Digite o nome do autor:");
		artigos.setAutor(scan.nextLine());
		
		System.out.println("Digite a categoria:");
		artigos.setCategoria(scan.nextLine());
		do{
			continuando =0;
		
		try{
			System.out.println("Digite a quantidade:");
			artigos.setQntTotal(Integer.parseInt(scan.nextLine()));
		}catch(Exception erro1){//String em campo que só pode receber numeros
			JOptionPane.showMessageDialog(null, "Por favor, inserir somente numeros!");
			continuando = 1;
	  }}while(continuando == 1);
	
		do{
			continuando =0;
			try{
		System.out.println("Digite o codigo:");
		artigos.setCodigo(Integer.parseInt(scan.nextLine()));
			}catch(Exception erro){
				JOptionPane.showMessageDialog(null, "ERRO! Digite somente numeros.");
				continuando = 1;
			}}while(continuando == 1);
		while (artigos.codigo<1000){
			JOptionPane.showMessageDialog(null, "ERRO!");
			System.out.println("Codigo invalido, digite novamente:");
			artigos.setCodigo(Integer.parseInt(scan.nextLine()));
		}
		
		cadastro.add(artigos);
		System.out.println("Deseja cadastrar mais algum artigo? (sim)/(nao)");
		continuar = scan.nextLine();
		}while(continuar.equalsIgnoreCase("sim"));
		}

	public void imprimir(){
		JOptionPane.showMessageDialog(null, "Artigo cadastrado com sucesso!");
		for (int i = 0; i < cadastro.size(); i++) {
			System.out.println(cadastro.get(i));
		}
	}

/* (non-Javadoc)
 * @see java.lang.Object#toString()
 */
@Override
public String toString() {
	return "Artigos\ncodigo=" + codigo + ", \nnome=" + nome + ", \nautor=" + autor
			+ ", \ncategoria=" + categoria + ", \nqntTotal=" + qntTotal
			+  "";
}



}
