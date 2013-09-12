package BibliotecaUniversitária.entidades;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.Scanner;

import javax.swing.JOptionPane;



public class Emprestar {
		
		private boolean renovar;
		private static int dia;
		private static int entrega;
		private static int devolucao;
		private static double multa;
		private static double precoTotal;
		ArrayList cadastro = new ArrayList();
		static Scanner scan = new Scanner(System.in);
		public Emprestar() {
			
		}
		public static void main(String[] args) {
			int voltar;
			do{
			String pega = JOptionPane.showInputDialog("Deseja pegar algum livro ou devolver algum livro?");
			if(pega.equalsIgnoreCase("pegar")){
			cadastrar();
		}else{
			Devolucao();	
		}
		 voltar = JOptionPane.showConfirmDialog(null, "Deseja continuar?");
		}while(voltar == 0);
		if(voltar == 1 || voltar == 2){
			JOptionPane.showMessageDialog(null, "Ate mais!");
			System.exit(0);
			
		}
		}

		public Emprestar(int dia ,int entrega, int devolucao, double multa, float precoTotal){
			this.entrega = entrega;
			this.devolucao = devolucao;
			this.multa = 0;
			this.precoTotal = 0;
			this.dia = 20;
		
	
	}


		public int getEntrega() {
			return entrega;
		}


		public void setEntrega(int entrega) {
			this.entrega = entrega;
		}


		public int getDevolucao() {
			return devolucao;
		}


		public void setDevolucao(int devolucao) {
			this.devolucao = devolucao;
		}


		public double getMulta() {
			return multa;
		}


		public void setMulta(double multa) {
			this.multa = multa;
		}


		public double getPrecoTotal() {
			return precoTotal;
		}


		public void setPrecoTotal(double precoTotal) {
			this.precoTotal = precoTotal;
		}

		
		public static void cadastrar(){
			Emprestar emprestimo = new Emprestar();
			int errando1;
			do{
				errando1 = 0;
			
			try{
			emprestimo.setEntrega(Integer.parseInt(JOptionPane.showInputDialog("Informe a data de emprestimo:")));
			} catch(Exception e){
				JOptionPane.showMessageDialog(null, "ERRO! Digite somente numeros.");
				errando1 = 1;
			}}while(errando1 == 1);
			dia = 20;
			int data = (entrega+dia)%31;
			System.out.println("A data de entrega e: "+data);
	
		}
		
		public static void Devolucao(){
		dia = 20;
		int errando;
			Emprestar emprestimo = new Emprestar();
			do{
				errando = 0;
			try{
			emprestimo.setEntrega(Integer.parseInt(JOptionPane.showInputDialog("Digite o dia do emprestimo:")));
			
		} catch(Exception e){
			JOptionPane.showMessageDialog(null, "ERRO! Digite somente numeros.");
			errando=1;
		}}while(errando==1);
			
			do{
				errando =0;
			
			try{
			devolucao = Integer.parseInt(JOptionPane.showInputDialog("Digite o dia da devolução"));
			} catch(Exception e){
				JOptionPane.showMessageDialog(null, "ERRO! Digite somente numeros.");
				errando=1;
			}}while(errando==1);
			
		int soma = (entrega + dia);
			
			 if (devolucao < soma){
				multa = 0;
				System.out.println("O valor da multa a ser pago é : 0");
				
			String renovar = JOptionPane.showInputDialog("Deseja renovar o livro?(sim)/(Nao)");
			if(renovar.equalsIgnoreCase("Sim")){
				entrega = Integer.parseInt(JOptionPane.showInputDialog("Digite a data de renovação."));
			}	
			}
			
			 else {
				int passou = (devolucao - soma);
				multa = 1.50;
				precoTotal = (passou*multa);
			}
			System.out.println("O valor da multa a ser pago é R$" + precoTotal);
			
		}
	}


	