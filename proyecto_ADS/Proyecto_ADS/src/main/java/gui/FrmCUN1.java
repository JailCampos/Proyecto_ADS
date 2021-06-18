package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.DropMode;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;
import javax.swing.JComboBox;

public class FrmCUN1 extends JFrame implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtCdigo;
	private JTextField txtFirstName;
	private JTextField txtLastName;
	private JTextField txtEmailAdddress;
	private JTextField textField;
	private JPanel panel_2;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JButton btnNewButton_2;
	private JLabel lblJuly;
	private JButton btnNewButton_3;
	private JButton btnNewButton_4;
	private JButton btnNewButton_5;
	private JPanel panel_3;
	private JTextField txtDesprictionOfRequirement;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmCUN1 frame = new FrmCUN1();
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
	public FrmCUN1() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(FrmCUN1.class.getResource("/icon/lista-de-verificacion (1).png")));
		setTitle("Generar Tramite Financiero");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1156, 1004);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setForeground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCdigo = new JLabel("Requerimiento N° 0001 - 2021");
		lblCdigo.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblCdigo.setForeground(Color.WHITE);
		lblCdigo.setBackground(Color.WHITE);
		lblCdigo.setBounds(36, 27, 461, 64);
		contentPane.add(lblCdigo);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.DARK_GRAY);
		panel.setBorder(new TitledBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Representative Details", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(192, 192, 192)), "", TitledBorder.LEFT, TitledBorder.TOP, null, Color.WHITE));
		panel.setBounds(25, 123, 527, 267);
		contentPane.add(panel);
		panel.setLayout(null);
		
		txtEmailAdddress = new JTextField();
		txtEmailAdddress.setBounds(18, 168, 494, 38);
		panel.add(txtEmailAdddress);
		txtEmailAdddress.setText(" Direction*");
		txtEmailAdddress.setForeground(Color.LIGHT_GRAY);
		txtEmailAdddress.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtEmailAdddress.setColumns(10);
		txtEmailAdddress.setBackground(Color.DARK_GRAY);
		
		textField = new JTextField();
		textField.setBounds(18, 119, 494, 38);
		panel.add(textField);
		textField.setText(" Email Adddress*");
		textField.setForeground(Color.LIGHT_GRAY);
		textField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField.setColumns(10);
		textField.setBackground(Color.DARK_GRAY);
		
		txtFirstName = new JTextField();
		txtFirstName.setBounds(18, 70, 242, 38);
		panel.add(txtFirstName);
		txtFirstName.setText(" First Name*");
		txtFirstName.setForeground(Color.LIGHT_GRAY);
		txtFirstName.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtFirstName.setColumns(10);
		txtFirstName.setBackground(Color.DARK_GRAY);
		
		txtCdigo = new JTextField();
		txtCdigo.setBounds(18, 21, 434, 38);
		panel.add(txtCdigo);
		txtCdigo.setText(" Code*");
		txtCdigo.setToolTipText("");
		txtCdigo.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtCdigo.setForeground(Color.LIGHT_GRAY);
		txtCdigo.setBackground(Color.DARK_GRAY);
		txtCdigo.setColumns(10);
		
		btnNewButton = new JButton("");
		btnNewButton.addActionListener(this);
		btnNewButton.setBounds(462, 21, 50, 38);
		panel.add(btnNewButton);
		btnNewButton.setForeground(new Color(0, 128, 128));
		btnNewButton.setBackground(new Color(0, 206, 209));
		btnNewButton.setIcon(new ImageIcon(FrmCUN1.class.getResource("/icon/lupa.png")));
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		txtLastName = new JTextField();
		txtLastName.setBounds(269, 70, 242, 38);
		panel.add(txtLastName);
		txtLastName.setText(" Last Name*");
		txtLastName.setForeground(Color.LIGHT_GRAY);
		txtLastName.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtLastName.setColumns(10);
		txtLastName.setBackground(Color.DARK_GRAY);
		
		txtDesprictionOfRequirement = new JTextField();
		txtDesprictionOfRequirement.setText(" Description of Requirement*");
		txtDesprictionOfRequirement.setForeground(Color.LIGHT_GRAY);
		txtDesprictionOfRequirement.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtDesprictionOfRequirement.setColumns(10);
		txtDesprictionOfRequirement.setBackground(Color.DARK_GRAY);
		txtDesprictionOfRequirement.setBounds(19, 211, 494, 36);
		panel.add(txtDesprictionOfRequirement);
		
		panel_2 = new JPanel();
		panel_2.setBackground(Color.DARK_GRAY);
		panel_2.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "OCF Chief", TitledBorder.LEADING, TitledBorder.TOP, null, Color.WHITE));
		panel_2.setBounds(25, 401, 523, 219);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		textField_6 = new JTextField();
		textField_6.setText(" Direction*");
		textField_6.setForeground(Color.LIGHT_GRAY);
		textField_6.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_6.setColumns(10);
		textField_6.setBackground(Color.DARK_GRAY);
		textField_6.setBounds(15, 165, 494, 38);
		panel_2.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setText(" Email Adddress*");
		textField_7.setForeground(Color.LIGHT_GRAY);
		textField_7.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_7.setColumns(10);
		textField_7.setBackground(Color.DARK_GRAY);
		textField_7.setBounds(15, 116, 494, 38);
		panel_2.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setText(" First Name*");
		textField_8.setForeground(Color.LIGHT_GRAY);
		textField_8.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_8.setColumns(10);
		textField_8.setBackground(Color.DARK_GRAY);
		textField_8.setBounds(15, 67, 242, 38);
		panel_2.add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setText(" Last Name*");
		textField_9.setForeground(Color.LIGHT_GRAY);
		textField_9.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_9.setColumns(10);
		textField_9.setBackground(Color.DARK_GRAY);
		textField_9.setBounds(267, 67, 242, 38);
		panel_2.add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setToolTipText("");
		textField_10.setText(" Code*");
		textField_10.setForeground(Color.LIGHT_GRAY);
		textField_10.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_10.setColumns(10);
		textField_10.setBackground(Color.DARK_GRAY);
		textField_10.setBounds(15, 18, 434, 38);
		panel_2.add(textField_10);
		
		btnNewButton_2 = new JButton("");
		btnNewButton_2.setIcon(new ImageIcon(FrmCUN1.class.getResource("/icon/lupa.png")));
		btnNewButton_2.setForeground(new Color(0, 128, 128));
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton_2.setBackground(new Color(0, 206, 209));
		btnNewButton_2.setBounds(459, 18, 50, 38);
		panel_2.add(btnNewButton_2);
		
		lblJuly = new JLabel("July 18, 2021 ");
		lblJuly.setForeground(Color.WHITE);
		lblJuly.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblJuly.setBounds(40, 78, 152, 34);
		contentPane.add(lblJuly);
		
		btnNewButton_3 = new JButton("");
		btnNewButton_3.setForeground(new Color(0, 128, 128));
		btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton_3.setBackground(new Color(0, 206, 209));
		btnNewButton_3.setBounds(410, 633, 50, 38);
		contentPane.add(btnNewButton_3);
		
		btnNewButton_4 = new JButton("");
		btnNewButton_4.setForeground(new Color(0, 128, 128));
		btnNewButton_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton_4.setBackground(new Color(0, 206, 209));
		btnNewButton_4.setBounds(254, 633, 50, 38);
		contentPane.add(btnNewButton_4);
		
		btnNewButton_5 = new JButton("");
		btnNewButton_5.setForeground(new Color(0, 128, 128));
		btnNewButton_5.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton_5.setBackground(new Color(0, 206, 209));
		btnNewButton_5.setBounds(89, 633, 50, 38);
		contentPane.add(btnNewButton_5);
		
		panel_3 = new JPanel();
		panel_3.setBackground(Color.DARK_GRAY);
		panel_3.setForeground(Color.LIGHT_GRAY);
		panel_3.setBorder(new TitledBorder(null, "Operation you want to perform", TitledBorder.LEADING, TitledBorder.TOP, null, Color.LIGHT_GRAY));
		panel_3.setBounds(473, 766, 519, 70);
		contentPane.add(panel_3);
		panel_3.setLayout(null);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(16, 19, 427, 36);
		panel_3.add(comboBox);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnNewButton) {
			do_btnNewButton_actionPerformed(e);
		}
	}
	protected void do_btnNewButton_actionPerformed(ActionEvent e) {
		
	System.out.println("DIA 1");
	}
	
}
