package BibliotecaUniversit�ria;

import javax.swing.JOptionPane;

import BibliotecaUniversit�ria.entidades.Aluno;
import BibliotecaUniversit�ria.entidades.Livros;
import BibliotecaUniversit�ria.entidades.MenuInicial;

public class BibliotecaUniversit�riamain {
	
	private static int escolha;
	public BibliotecaUniversit�riamain() {
		// TODO Auto-generated constructor stub
	}
	
	
	public static void main(String[] args) {
		//Iniciando a Biblioteca
		JOptionPane.showMessageDialog(null, "Bem vindo a Biblioteca Universit�ria 1.1.3");
		MenuInicial novoFrame = new MenuInicial();
		novoFrame.dispose();
		String[] string={};
		MenuInicial.main(string);//Chama a fun��o menu()
		
	}}
