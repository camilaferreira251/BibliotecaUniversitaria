package BibliotecaUniversitária.entidades;

import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JOptionPane;

import Intefaces.Cadastrando;

public class Revistas implements Cadastrando {

	private String titulo;
	private String categoria;
	private int ano;
	private int quantTotal;
	private int quantDisp;
	private Pessoa pessoa;
	ArrayList cadastro = new ArrayList();
	Scanner scan = new Scanner(System.in);
	public Revistas() {
		// TODO Auto-generated constructor stub
	}
	
	public Revistas(String titulo, String categoria, int ano){
		this.ano = ano;
		this.categoria = categoria;
		this.quantDisp = 0;
		this.quantTotal = 0;
		this.titulo = titulo;
	}
	
	public Revistas(String titulo, String categoria, int ano, int quantTotal, int QuantDisp){
		this.ano = ano;
		this.categoria = categoria;
		this.quantDisp = quantDisp;
		this.quantTotal = quantTotal;
		this.titulo = titulo;
	}
	
	/**
	 * @return the titulo
	 */
	public String getTitulo() {
		return titulo;
	}

	/**
	 * @param titulo the titulo to set
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
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
	 * @return the ano
	 */
	public int getAno() {
		return ano;
	}

	/**
	 * @param ano the ano to set
	 */
	public void setAno(int ano) {
		this.ano = ano;
	}

	/**
	 * @return the quantTotal
	 */
	public int getQuantTotal() {
		return quantTotal;
	}

	/**
	 * @param quantTotal the quantTotal to set
	 */
	public void setQuantTotal(int quantTotal) {
		this.quantTotal = quantTotal;
	}

	/**
	 * @return the quantDisp
	 */
	public int getQuantDisp() {
		return quantDisp;
	}

	/**
	 * @param quantDisp the quantDisp to set
	 */
	public void setQuantDisp(int quantDisp) {
		this.quantDisp = quantDisp;
	}

	public void cadastrar(){
		String continua = "sim";
	int errando;
		while(continua.equalsIgnoreCase("sim")){
		Revistas revista = new Revistas();
		System.out.println("Digite o título da revista:");
		revista.setTitulo(scan.nextLine());
		
		System.out.println("Digite a categoria da revista:");
		revista.setCategoria(scan.nextLine());
		do{
			errando = 0;
		try{
		System.out.println("Digite o ano da revista:");
		revista.setAno(Integer.parseInt(scan.nextLine()));
		}catch(Exception erro1){
			JOptionPane.showMessageDialog(null, "ERRO! Digite somente numeros.");
			errando =1;
		}}while(errando == 1);
		do{
			errando =0;
			try{
		System.out.println("Digite a quantidade total:");
		revista.setQuantTotal(Integer.parseInt(scan.nextLine()));
			}catch (Exception erro){
				JOptionPane.showMessageDialog(null, "ERRO! Digite somente numeros.");
				errando =1;
			}}while(errando == 1);
		while(revista.quantTotal < 0 ){
			JOptionPane.showMessageDialog(null, "ERRO!");
			System.out.println("Numero de revistas inválido, digite novamente:");
			revista.setQuantTotal(Integer.parseInt(scan.nextLine()));
		}
		cadastro.add(revista);
		System.out.println("Deseja cadastrar mais alguma revista? (sim)/(nao)");
		continua = scan.nextLine();
		}
	}
	
	public void imprimir(){
		JOptionPane.showMessageDialog(null, "Revista cadastrada com sucesso!");
		for(int i=0 ; i<cadastro.size() ; i++){
			System.out.println(cadastro.get(i));
		}
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Revistas\ntitulo=" + titulo + ", \ncategoria=" + categoria
				+ ", \nano=" + ano + ", \nquantTotal=" + quantTotal + "";
	}
	
	

}
