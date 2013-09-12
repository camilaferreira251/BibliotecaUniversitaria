package BibliotecaUniversitária.entidades;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.UIManager;

public class CadastrandoClientes extends JFrame {

	private JPanel contentPane;
	private JButton btnProfessor;
	private JButton btnTecnico;
	private JButton btnAluno;
	private JButton btnExAluno;
	private JButton btnNoAluno;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastrandoClientes frame = new CadastrandoClientes();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CadastrandoClientes() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCadastroDeClientes = new JLabel("Cadastro de Clientes:");
		lblCadastroDeClientes.setForeground(Color.LIGHT_GRAY);
		lblCadastroDeClientes.setBackground(Color.GRAY);
		lblCadastroDeClientes.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblCadastroDeClientes.setBounds(135, 11, 199, 14);
		contentPane.add(lblCadastroDeClientes);
		
		btnProfessor = new JButton("Professor");
		btnProfessor.setBackground(UIManager.getColor("EditorPane.selectionBackground"));
		btnProfessor.setFont(new Font("MV Boli", Font.PLAIN, 11));
		btnProfessor.setBounds(10, 75, 89, 23);
		btnProfessor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setVisible(false);
				Professor professore = new Professor();
				professore.cadastrar();
				professore.imprime();
				
			}
		});
		contentPane.add(btnProfessor);
		
		btnTecnico = new JButton("Tecnico");
		btnTecnico.setBackground(UIManager.getColor("EditorPane.selectionBackground"));
		btnTecnico.setFont(new Font("MV Boli", Font.PLAIN, 11));
		btnTecnico.setBounds(10, 143, 89, 23);
		btnTecnico.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setVisible(false);
				Tecnicos tecnico = new Tecnicos();
				tecnico.cadastrar();
				tecnico.imprime();
				
			}
		});
		contentPane.add(btnTecnico);
		
		btnAluno = new JButton("Aluno");
		btnAluno.setBackground(UIManager.getColor("EditorPane.selectionBackground"));
		btnAluno.setFont(new Font("MV Boli", Font.PLAIN, 11));
		btnAluno.setBounds(10, 177, 89, 23);
		btnAluno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setVisible(false);
				Aluno aluno = new Aluno();
				aluno.cadastrar();
				aluno.imprime();
				
			}
		});
		contentPane.add(btnAluno);
		
	    btnExAluno = new JButton("Ex Aluno");
	    btnExAluno.setBackground(UIManager.getColor("EditorPane.selectionBackground"));
	    btnExAluno.setFont(new Font("MV Boli", Font.PLAIN, 11));
		btnExAluno.setBounds(10, 211, 89, 23);
		btnExAluno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setVisible(false);
				ExAluno exx = new ExAluno();
				exx.cadastrar();
				exx.imprimir();
				
			}
		});
		contentPane.add(btnExAluno);
		
		btnNoAluno = new JButton("N\u00E3o Aluno");
		btnNoAluno.setBackground(UIManager.getColor("EditorPane.selectionBackground"));
		btnNoAluno.setFont(new Font("MV Boli", Font.PLAIN, 11));
		btnNoAluno.setBounds(10, 109, 89, 23);
		btnNoAluno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setVisible(false);
				NaoAlunos nao = new NaoAlunos();
				nao.cadastrar();
				nao.imprimir();
				
			}
		});
		contentPane.add(btnNoAluno);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.setBackground(UIManager.getColor("EditorPane.selectionBackground"));
		btnVoltar.setFont(new Font("MV Boli", Font.PLAIN, 11));
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setVisible(false);
				MenuInicial menu = new MenuInicial();
				menu.dispose();//se clicar no botão, vai pra página de cadastro.
				String[] string={};
				MenuInicial.main(string);
			}
		});
		btnVoltar.setBounds(335, 211, 89, 23);
		contentPane.add(btnVoltar);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Rafael\\Desktop\\UnB\\JAVA\\Biblioteca Universit\u00E1ria\\pat.biblioteca.jpg"));
		lblNewLabel.setBounds(0, 0, 434, 262);
		contentPane.add(lblNewLabel);
	}
}
