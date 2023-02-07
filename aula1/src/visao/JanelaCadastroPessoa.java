package visao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.FlowLayout;

public class JanelaCadastroPessoa extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JanelaCadastroPessoa frame = new JanelaCadastroPessoa();
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
	public JanelaCadastroPessoa() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel txtNomeFuncionario = new JLabel("Nome:");
		txtNomeFuncionario.setBounds(97, 13, 31, 14);
		contentPane.add(txtNomeFuncionario);
		
		textField = new JTextField();
		textField.setBounds(133, 10, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel txtCpfFuncionario = new JLabel("Cpf:");
		txtCpfFuncionario.setBounds(107, 41, 21, 14);
		contentPane.add(txtCpfFuncionario);
		
		textField_1 = new JTextField();
		textField_1.setBounds(133, 38, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
	}

}
