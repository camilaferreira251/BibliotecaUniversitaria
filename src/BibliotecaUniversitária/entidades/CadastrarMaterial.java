package BibliotecaUniversitária.entidades;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.ImageIcon;

public class CadastrarMaterial extends JFrame {

	private JPanel contentPane;
	private JButton btnLivro;
	private JButton btnArtigo;
	private JButton btnRevista;
	private JButton btnListarLivrosCadastrados;
	private JButton btnVoltar;
	private JLabel lblNewLabel;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastrarMaterial frame = new CadastrarMaterial();
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
	public CadastrarMaterial() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCadastrarMaterial = new JLabel("Cadastrar Material");
		lblCadastrarMaterial.setForeground(Color.GRAY);
		lblCadastrarMaterial.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblCadastrarMaterial.setBounds(141, 11, 183, 14);
		contentPane.add(lblCadastrarMaterial);
		
		btnLivro = new JButton("Livro");
		btnLivro.setFont(new Font("MV Boli", Font.PLAIN, 11));
		btnLivro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				Livros livro = new Livros();
				livro.cadastrar();
				livro.imprime();
				
			}
		});
		btnLivro.setBounds(10, 56, 89, 23);
		contentPane.add(btnLivro);
		
		btnArtigo = new JButton("Artigo");
		btnArtigo.setFont(new Font("MV Boli", Font.PLAIN, 11));
		btnArtigo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				Artigos artigo = new Artigos();
				artigo.cadastrar();
				artigo.imprimir();
			}
		});
		btnArtigo.setBounds(10, 104, 89, 23);
		contentPane.add(btnArtigo);
		
		btnRevista = new JButton("Revista");
		btnRevista.setFont(new Font("MV Boli", Font.PLAIN, 11));
		btnRevista.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				Revistas revista = new Revistas();
				revista.cadastrar();
				revista.imprimir();
			}
		});
		btnRevista.setBounds(10, 151, 89, 23);
		contentPane.add(btnRevista);
		
		JButton btnEditora = new JButton("Editora");
		btnEditora.setFont(new Font("MV Boli", Font.PLAIN, 11));
		btnEditora.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setVisible(false);
				Editoras edit = new Editoras();
				edit.cadastrar();
				edit.imprimir();
			}
		});
		btnEditora.setBounds(10, 195, 89, 23);
		contentPane.add(btnEditora);
		
		btnListarLivrosCadastrados = new JButton("Listar livros cadastrados");
		btnListarLivrosCadastrados.setFont(new Font("MV Boli", Font.PLAIN, 11));
		btnListarLivrosCadastrados.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setVisible(false);
				Livros livro = new Livros();
				livro.imprimeLivros();
			}
		});
		btnListarLivrosCadastrados.setBounds(141, 56, 164, 23);
		contentPane.add(btnListarLivrosCadastrados);
		
		btnVoltar = new JButton("Voltar");
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
		btnVoltar.setBounds(335, 195, 89, 23);
		contentPane.add(btnVoltar);
		
		lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Rafael\\Desktop\\UnB\\JAVA\\Biblioteca Universit\u00E1ria\\pat.biblioteca.jpg"));
		lblNewLabel.setBounds(0, 0, 434, 262);
		contentPane.add(lblNewLabel);
	}
}
