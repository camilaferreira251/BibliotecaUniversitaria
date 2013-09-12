package BibliotecaUniversitária.entidades;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Menu;
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
import java.awt.SystemColor;

public class MenuInicial extends JFrame {
	
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JButton btnCadastrarCliente;
	private JButton btnCadastrarMaterial;
	private JButton btnEmprestimo;
	private JButton btnSair;
	private static String classe;
	private JLabel lblNewLabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuInicial frame = new MenuInicial();
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
	
	public MenuInicial() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblMenu = new JLabel("MENU:");
		lblMenu.setForeground(Color.GRAY);
		lblMenu.setBounds(192, 11, 108, 23);
		lblMenu.setBackground(Color.BLACK);
		lblMenu.setFont(new Font("Tahoma", Font.BOLD, 17));
		contentPane.add(lblMenu);
		
		btnCadastrarCliente = new JButton("Cadastrar Cliente");
		btnCadastrarCliente.setBackground(UIManager.getColor("Button.light"));
		btnCadastrarCliente.setForeground(new Color(0, 0, 0));
		btnCadastrarCliente.setFont(new Font("MV Boli", Font.PLAIN, 11));
		btnCadastrarCliente.setBounds(154, 62, 141, 23);
		btnCadastrarCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setVisible(false);
				CadastrandoClientes novoFrame = new CadastrandoClientes();
				novoFrame.dispose();//se clicar no botão, vai pra página de cadastro.
				String[] string={};
				CadastrandoClientes.main(string);
			   
			   }
		});
				
		contentPane.add(btnCadastrarCliente);
		
		
		btnCadastrarMaterial = new JButton("Cadastrar Material");
		btnCadastrarMaterial.setBackground(UIManager.getColor("Button.light"));
		btnCadastrarMaterial.setFont(new Font("MV Boli", Font.PLAIN, 11));
		btnCadastrarMaterial.setBounds(154, 96, 141, 23);
		btnCadastrarMaterial.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setVisible(false);
				CadastrarMaterial novoFrame = new CadastrarMaterial();
				novoFrame.dispose();//se clicar no botão, vai pra página de cadastro.
				String[] string={};
				CadastrarMaterial.main(string);
			}
		});
		contentPane.add(btnCadastrarMaterial);
		
		btnEmprestimo = new JButton("Emprestimo/Devolu\u00E7\u00E3o");
		btnEmprestimo.setBackground(UIManager.getColor("Button.light"));
		btnEmprestimo.setFont(new Font("MV Boli", Font.PLAIN, 11));
		btnEmprestimo.setBounds(154, 130, 141, 23);
		btnEmprestimo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setVisible(false);
				Emprestar empreste = new Emprestar();
				//empreste.dispose();//se clicar no botão, vai pra página de cadastro.
				String[] string={};
				Emprestar.main(string);
			}
		});
	
		contentPane.add(btnEmprestimo);
		
		btnSair = new JButton("Sair");
		btnSair.setBackground(UIManager.getColor("textHighlight"));
		btnSair.setFont(new Font("MV Boli", Font.PLAIN, 11));
		btnSair.setBounds(154, 209, 141, 23);
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setVisible(false);
				JOptionPane.showMessageDialog(null, "Obrigado pela preferência!");
				System.exit(0);
			}
		});
		contentPane.add(btnSair);
		
		lblNewLabel = new JLabel("New label");
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Rafael\\Desktop\\UnB\\JAVA\\Biblioteca Universit\u00E1ria\\pat.biblioteca.jpg"));
		lblNewLabel.setBounds(0, 0, 434, 262);
		contentPane.add(lblNewLabel);
		
	}

	/**
	 * @return the classe
	 */
	public static String getClasse() {
		return classe;
	}

	/**
	 * @param classe the classe to set
	 */
	public void setClasse(String classe) {
		this.classe = classe;
	}
}

