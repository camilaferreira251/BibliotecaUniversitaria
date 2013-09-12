package BibliotecaUniversitária.entidades;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.swing.JOptionPane;

import Intefaces.Cadastrando;

public class Livros implements Cadastrando {
	private static final Object[] Livros = null;
	ArrayList<Livros> cadastro = new ArrayList();
	ArrayList exemplares = new ArrayList();
	Scanner scan = new Scanner(System.in);
	
	protected int codigo;
	protected String nome;
	protected String autor;
	protected String categoria;
	protected int qntTotal;
	protected int qntDisponivel;
	protected Pessoa pessoa;
	protected Aluno aluno;

	public Livros() {
		
		this.codigo = 0;
		this.nome = "sem nome";
		this.autor = "sem autor";
		this.categoria = "sem categoria";
		this.qntTotal = 0;
		this.qntDisponivel = 0;
		
	}
	
	public Livros (int codigoLivro, String nomeLivro, int quantTotal, int quantDisp ){
		
		this.codigo = codigoLivro;
		this.nome = nomeLivro;
		this.autor = "sem autor";
		this.categoria = "sem categoria";
		this.qntTotal = quantTotal;
		this.qntDisponivel = quantDisp;
		
	}
	
	public Livros (int codigoLivro, String nomeLivro, String nomeAutor, int quantTotal, int quantDisp ){
		
		this.codigo = codigoLivro;
		this.nome = nomeLivro;
		this.autor = nomeAutor;
		this.categoria = "sem categoria";
		this.qntTotal = quantTotal;
		this.qntDisponivel = quantDisp;
		
	}
	
	public Livros (int codigoLivro, String nomeLivro, String nomeAutor, String categLivro, int quantTotal, int quantDisp ){
	
		this.codigo = codigoLivro;
		this.nome = nomeLivro;
		this.autor = nomeAutor;
		this.categoria = categLivro;
		this.qntTotal = quantTotal;
		this.qntDisponivel = quantDisp;
	
	}

	public void cadastrar(){
	String continuar = "sim";
	int errando;
	while(continuar.equalsIgnoreCase("sim")){
		Livros livros = new Livros();
		System.out.println("Digite o nome do Livro:");
		livros.setNome(scan.nextLine());
		
		System.out.println("Digite o nome do autor:");
		livros.setAutor(scan.nextLine());
		
		System.out.println("Digite a categoria:");
		livros.setCategoria(scan.nextLine());
		do{
			errando = 0;
		try{
		System.out.println("Digite a quantidade total:");
		livros.setQntTotal(Integer.parseInt(scan.nextLine()));
		}catch(Exception erro){
			JOptionPane.showMessageDialog(null, "ERRO! Digite somente numeros.");
			errando =1;
		}}while(errando == 1);
		
		do{
			errando =0;
		try{
		System.out.println("Digite o codigo do Livro:");
		livros.setCodigo(Integer.parseInt(scan.nextLine()));
		}catch(Exception erro1){
			JOptionPane.showMessageDialog(null, "ERRO! Digite somente numeros.");
			errando =1;
		}}while(errando == 1);
		
		while (livros.codigo<1000){
			JOptionPane.showMessageDialog(null, "ERRO!");
			System.out.println("Codigo invalido, digite novamente:");
			livros.setCodigo(Integer.parseInt(scan.nextLine()));
		}
	
		cadastro.add(livros);
		System.out.println("Deseja cadastrar mais algum livro? (sim)/(nao)");
		continuar = scan.nextLine();
		
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

	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * @return the autor
	 */
	public String getAutor() {
		return autor;
	}

	/**
	 * @param autor the autor to set
	 */
	public void setAutor(String autor) {
		this.autor = autor;
	}

	/**
	 * @return the categoria
	 */
	public String getCategoria() {
		return categoria;
	}

	/**
	 * @param categoria the categoria to set
	 */
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	/**
	 * @return the qntTotal
	 */
	public int getQntTotal() {
		return qntTotal;
	}

	/**
	 * @param qntTotal the qntTotal to set
	 */
	public void setQntTotal(int qntTotal) {
		this.qntTotal = qntTotal;
	}

	/**
	 * @return the qntDisponivel
	 */
	public int getQntDisponivel() {
		return qntDisponivel;
	}

	/**
	 * @return the aluno
	 */
	public Aluno getAluno() {
		return aluno;
	}

	/**
	 * @param aluno the aluno to set
	 */
	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	/**
	 * @param qntDisponivel the qntDisponivel to set
	 */
	public void setQntDisponivel(int qntDisponivel) {
		this.qntDisponivel = qntDisponivel;
	}
	
	public void imprime(){
		JOptionPane.showMessageDialog(null, "Livro cadastrado com sucesso!");
		for (int i = 0; i < cadastro.size(); i++) {
			System.out.println(cadastro.get(i));
		}
		int voltar  = JOptionPane.showConfirmDialog(null, "Deseja voltar ao menu?");
		if(voltar == 0){
			MenuInicial menu = new MenuInicial();
			//empreste.dispose();//se clicar no botão, vai pra página de cadastro.
			String[] string={};
			MenuInicial.main(string);
		}
	
	}
	public void imprimeLivros(){
	
		for (int i = 0; i < cadastro.size(); i++) {
			
			System.out.println("\n Nome do livro = "+i+1+":"+cadastro.get(i).getNome());
		}
		if(cadastro.size()==0){
			JOptionPane.showMessageDialog(null, "Nenhum livro cadastrado.");
		}
		
		
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Livros:\ncodigo=" + codigo + ", \nnome=" + nome + ", \nautor="
				+ autor + ", \ncategoria=" + categoria + ", \nqntTotal=" + qntTotal
				+ "";
	}
	

}
	
