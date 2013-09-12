package BibliotecaUniversitária;

import javax.swing.JOptionPane;

import BibliotecaUniversitária.entidades.Aluno;
import BibliotecaUniversitária.entidades.Livros;
import BibliotecaUniversitária.entidades.MenuInicial;

public class BibliotecaUniversitáriamain {
	
	private static int escolha;
	public BibliotecaUniversitáriamain() {
		// TODO Auto-generated constructor stub
	}
	
	
	public static void main(String[] args) {
		//Iniciando a Biblioteca
		JOptionPane.showMessageDialog(null, "Bem vindo a Biblioteca Universitária 1.1.3");
		MenuInicial novoFrame = new MenuInicial();
		novoFrame.dispose();
		String[] string={};
		MenuInicial.main(string);//Chama a função menu()
		
	}}
