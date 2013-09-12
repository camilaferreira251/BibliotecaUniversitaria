package BibliotecaUniversitária.entidades;


import java.awt.Component;
import java.awt.EventQueue;
import java.beans.PropertyVetoException;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;


public class Janela1 extends JInternalFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTable table;
	private JTable table_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Janela1 frame = new Janela1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @throws PropertyVetoException 
	 */
	public Janela1() throws PropertyVetoException {
		setBorder(UIManager.getBorder("ToolBar.border"));
		setIcon(true);
		setBounds(100, 100, 669, 444);
		
		JPanel botoes = new JPanel();
		
		JPanel registro = new JPanel();
		
		JScrollPane scrollPane = new JScrollPane();
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(botoes, 0, 0, Short.MAX_VALUE)
					.addGap(0))
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 653, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap(22, Short.MAX_VALUE)
					.addComponent(registro, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(botoes, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(registro, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(25)
					.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
					.addContainerGap())
		);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Nome", "Sobrenome", "E-mail", "Endere\u00E7o", "Endere\u00E7o"
			}
		));
		scrollPane.setColumnHeaderView(table);
		
		table_1 = new JTable();
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
					"Nome", "Sobrenome", "E-mail", "Endere\u00E7o"
			}
		));
		scrollPane.setViewportView(table_1);
		
		JButton btnNewButton = new JButton("Novo Cadastro");
		
		JButton btnExcluir = new JButton("excluir");
		GroupLayout gl_botoes = new GroupLayout(botoes);
		gl_botoes.setHorizontalGroup(
			gl_botoes.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_botoes.createSequentialGroup()
					.addGap(19)
					.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE)
					.addGap(40)
					.addComponent(btnExcluir)
					.addContainerGap(445, Short.MAX_VALUE))
		);
		gl_botoes.setVerticalGroup(
			gl_botoes.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_botoes.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_botoes.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnNewButton)
						.addComponent(btnExcluir))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		gl_botoes.linkSize(SwingConstants.VERTICAL, new Component[] {btnNewButton, btnExcluir});
		botoes.setLayout(gl_botoes);
		
		JLabel lblNome = new JLabel("Nome:");
		
		textField = new JTextField();
		textField.setColumns(10);
		
		JLabel lblSobrenome = new JLabel("E-mail:");
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Endere\u00E7o:");
		
		textField_2 = new JTextField();
		textField_2.setText("");
		textField_2.setColumns(10);
		
		JLabel lblTelefone = new JLabel("Telefone:");
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		
		JLabel lblSobrenome_1 = new JLabel("Sobrenome:");
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		GroupLayout gl_registro = new GroupLayout(registro);
		gl_registro.setHorizontalGroup(
			gl_registro.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_registro.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_registro.createParallelGroup(Alignment.LEADING)
						.addComponent(lblSobrenome)
						.addComponent(lblNome)
						.addComponent(lblNewLabel)
						.addComponent(lblTelefone))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_registro.createParallelGroup(Alignment.LEADING, false)
						.addComponent(textField, GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
						.addComponent(textField_1)
						.addComponent(textField_2)
						.addComponent(textField_3))
					.addGap(27)
					.addComponent(lblSobrenome_1)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(201, Short.MAX_VALUE))
		);
		gl_registro.setVerticalGroup(
			gl_registro.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_registro.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_registro.createParallelGroup(Alignment.BASELINE)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNome)
						.addComponent(lblSobrenome_1)
						.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(17)
					.addGroup(gl_registro.createParallelGroup(Alignment.BASELINE)
						.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblSobrenome))
					.addGap(17)
					.addGroup(gl_registro.createParallelGroup(Alignment.BASELINE)
						.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel))
					.addGap(17)
					.addGroup(gl_registro.createParallelGroup(Alignment.BASELINE)
						.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblTelefone))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		registro.setLayout(gl_registro);
		getContentPane().setLayout(groupLayout);

	}
}
