package BibliotecaUniversitária.entidades;

import java.util.ArrayList;
import java.util.Scanner;

	public class Emprestimo {
			
		private boolean renovar;
		private int dia;
		private int entrega;
		private int devolucao;
		private double multa;
		private double precoTotal;
		ArrayList cadastro = new ArrayList();
		Scanner scan = new Scanner(System.in);
		public Emprestimo() {
			// TODO Auto-generated constructor stub
		}
		

		public Emprestimo(int dia ,int entrega, int devolucao, double multa, float precoTotal){
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

		
		public int cadastrar(){
			Emprestimo emprestimo = new Emprestimo();
			System.out.println("informe a data de Emprestimo: ");
			int setEntrega = scan.nextInt();
		
			Emprestimo devolucao = new Emprestimo();
			System.out.println("informe a data de Emprestimo: ");
			int setDevolucao = scan.nextInt();
			
		
			
			 if (entrega > dia){
				multa = 0;
				
				do 
					System.out.println("deseja renovar o livro?");
				while (renovar == true);
				return 0;
				
				
			}
			
			 else {
				entrega = (entrega - dia);
				multa = 1.50;
				precoTotal = (entrega*multa);
			}
			System.out.println("O valor da multa a ser pago é" + precoTotal);
			return setDevolucao;
		}
		
}
