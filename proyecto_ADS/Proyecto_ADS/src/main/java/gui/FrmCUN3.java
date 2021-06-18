package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import java.awt.Toolkit;

public class FrmCUN3 extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JPanel panel;
	private JLabel lblRequerimiento;
	private JLabel lblJuly;
	private JLabel label;
	private JPanel panel_1;
	private JScrollPane scrollPane;
	private JTable table;
	private JLabel lblDetails;
	private JPanel panel_2;
	private JPanel panel_3;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JTextField txtDescription;
	private JTextField txtCantidad;
	private JTextField txtUnidad;
	private JButton btnNewButton_3;
	private JTextField txtNombres;
	private JButton btnNewButton_4;
	private JPanel panel_4;
	private JTextField txtDireccion;
	private JLabel lblNewLabel;
	private JTextField textField;
	private JPanel panel_5;
	private JButton btnNewButton_5;
	private JLabel lblDescuento;
	private JTextField textField_1;
	private JLabel lblIva;
	private JTextField textField_2;
	private JLabel lblTotalPresupuesto;
	private JTextField textField_3;
	private JTextField txtNombre;
	private JTextField txtDireccin;
	private JTextField txtCifNif;
	private JTextField txtCdigo;
	private JTextField textField_4;
	private JTextField txtApellido;
	private JTextField txtCorreoElectrnico;
	private JTextField txtDireccin_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmCUN3 frame = new FrmCUN3();
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
	public FrmCUN3() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(FrmCUN3.class.getResource("/icon/lista-de-verificacion (1).png")));
		setTitle("Generar informe de presupuestos");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1193, 892);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		panel = new JPanel();
		panel.setBackground(new Color(0, 206, 209));
		panel.setBounds(0, 22, 1167, 93);
		contentPane.add(panel);
		panel.setLayout(null);
		
		lblRequerimiento = new JLabel("Presupuesto N° 0001 - 2021");
		lblRequerimiento.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblRequerimiento.setForeground(Color.WHITE);
		lblRequerimiento.setBounds(23, 11, 481, 36);
		panel.add(lblRequerimiento);
		
		lblJuly = new JLabel("July,18,2021");
		lblJuly.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblJuly.setForeground(Color.WHITE);
		lblJuly.setBounds(23, 58, 120, 14);
		panel.add(lblJuly);
		
		label = new JLabel("");
		label.setIcon(new ImageIcon(FrmCUN3.class.getResource("/icon/contract.png")));
		label.setBounds(1085, 11, 72, 82);
		panel.add(label);
		
		panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 206, 209));
		panel_1.setBounds(535, 126, 632, 601);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 23, 612, 567);
		panel_1.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"ID_OCF", "Nom_Cliente", "Nom_Empresa", "Ref./C\u00F3digo/", "Descripci\u00F3n", "Cantidad", "Precio u", "Total"
			}
		));
		table.getColumnModel().getColumn(2).setPreferredWidth(95);
		scrollPane.setViewportView(table);
		
		lblDetails = new JLabel("Detalles");
		lblDetails.setForeground(Color.WHITE);
		lblDetails.setBounds(10, 0, 46, 14);
		panel_1.add(lblDetails);
		
		panel_2 = new JPanel();
		panel_2.setBackground(Color.DARK_GRAY);
		panel_2.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Detalle del Presupuesto", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 255, 255)));
		panel_2.setBounds(10, 126, 513, 271);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		txtDescription = new JTextField();
		txtDescription.setBackground(Color.DARK_GRAY);
		txtDescription.setForeground(Color.WHITE);
		txtDescription.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtDescription.setText("  Nombre o razón social(Empresa)*");
		txtDescription.setBounds(10, 22, 385, 32);
		panel_2.add(txtDescription);
		txtDescription.setColumns(10);
		
		txtCantidad = new JTextField();
		txtCantidad.setBackground(Color.DARK_GRAY);
		txtCantidad.setForeground(Color.WHITE);
		txtCantidad.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtCantidad.setText("  Teléfono*");
		txtCantidad.setBounds(10, 163, 493, 38);
		panel_2.add(txtCantidad);
		txtCantidad.setColumns(10);
		
		txtUnidad = new JTextField();
		txtUnidad.setBackground(Color.DARK_GRAY);
		txtUnidad.setForeground(Color.WHITE);
		txtUnidad.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtUnidad.setText("  Fax*\r\n");
		txtUnidad.setBounds(10, 212, 493, 38);
		panel_2.add(txtUnidad);
		txtUnidad.setColumns(10);
		
		btnNewButton_3 = new JButton("");
		btnNewButton_3.setBackground(Color.CYAN);
		btnNewButton_3.setForeground(Color.BLACK);
		btnNewButton_3.setIcon(new ImageIcon(FrmCUN3.class.getResource("/icon/lupa.png")));
		btnNewButton_3.setBounds(422, 23, 81, 32);
		panel_2.add(btnNewButton_3);
		
		txtNombres = new JTextField();
		txtNombres.setForeground(Color.WHITE);
		txtNombres.setBackground(Color.DARK_GRAY);
		txtNombres.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtNombres.setText("  CIF / NIF*");
		txtNombres.setBounds(10, 114, 493, 38);
		panel_2.add(txtNombres);
		txtNombres.setColumns(10);
		
		txtDireccion = new JTextField();
		txtDireccion.setForeground(Color.WHITE);
		txtDireccion.setBackground(Color.DARK_GRAY);
		txtDireccion.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtDireccion.setText("  Direccion*");
		txtDireccion.setBounds(10, 65, 493, 38);
		panel_2.add(txtDireccion);
		txtDireccion.setColumns(10);
		
		panel_3 = new JPanel();
		panel_3.setForeground(Color.BLACK);
		panel_3.setToolTipText("");
		panel_3.setBackground(Color.DARK_GRAY);
		panel_3.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Jefe OCF", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 255, 255)));
		panel_3.setBounds(12, 560, 513, 200);
		contentPane.add(panel_3);
		panel_3.setLayout(null);
		
		btnNewButton_4 = new JButton("");
		btnNewButton_4.setIcon(new ImageIcon(FrmCUN3.class.getResource("/icon/lupa.png")));
		btnNewButton_4.setForeground(Color.BLACK);
		btnNewButton_4.setBackground(Color.CYAN);
		btnNewButton_4.setBounds(422, 22, 81, 32);
		panel_3.add(btnNewButton_4);
		
		txtCdigo = new JTextField();
		txtCdigo.setText("  Código*");
		txtCdigo.setForeground(Color.WHITE);
		txtCdigo.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtCdigo.setColumns(10);
		txtCdigo.setBackground(Color.DARK_GRAY);
		txtCdigo.setBounds(10, 22, 384, 32);
		panel_3.add(txtCdigo);
		
		textField_4 = new JTextField();
		textField_4.setText("  Nombre*");
		textField_4.setForeground(Color.WHITE);
		textField_4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_4.setColumns(10);
		textField_4.setBackground(Color.DARK_GRAY);
		textField_4.setBounds(10, 65, 244, 32);
		panel_3.add(textField_4);
		
		txtApellido = new JTextField();
		txtApellido.setText("  Apellido*");
		txtApellido.setForeground(Color.WHITE);
		txtApellido.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtApellido.setColumns(10);
		txtApellido.setBackground(Color.DARK_GRAY);
		txtApellido.setBounds(264, 65, 239, 32);
		panel_3.add(txtApellido);
		
		txtCorreoElectrnico = new JTextField();
		txtCorreoElectrnico.setText("  Correo electrónico*");
		txtCorreoElectrnico.setForeground(Color.WHITE);
		txtCorreoElectrnico.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtCorreoElectrnico.setColumns(10);
		txtCorreoElectrnico.setBackground(Color.DARK_GRAY);
		txtCorreoElectrnico.setBounds(10, 108, 493, 32);
		panel_3.add(txtCorreoElectrnico);
		
		txtDireccin_1 = new JTextField();
		txtDireccin_1.setText("  Dirección*");
		txtDireccin_1.setForeground(Color.WHITE);
		txtDireccin_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtDireccin_1.setColumns(10);
		txtDireccin_1.setBackground(Color.DARK_GRAY);
		txtDireccin_1.setBounds(10, 151, 493, 32);
		panel_3.add(txtDireccin_1);
		
		btnNewButton = new JButton("");
		btnNewButton.setIcon(new ImageIcon(FrmCUN3.class.getResource("/icon/signo-mas-para-agregar.png")));
		btnNewButton.setBounds(55, 782, 73, 41);
		contentPane.add(btnNewButton);
		
		btnNewButton_1 = new JButton("");
		btnNewButton_1.setIcon(new ImageIcon(FrmCUN3.class.getResource("/icon/editar.png")));
		btnNewButton_1.setBounds(235, 782, 73, 41);
		contentPane.add(btnNewButton_1);
		
		btnNewButton_2 = new JButton("");
		btnNewButton_2.setIcon(new ImageIcon(FrmCUN3.class.getResource("/icon/cerrar.png")));
		btnNewButton_2.setBounds(401, 782, 73, 41);
		contentPane.add(btnNewButton_2);
		
		panel_4 = new JPanel();
		panel_4.setBackground(Color.DARK_GRAY);
		panel_4.setForeground(Color.WHITE);
		panel_4.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Valor de presupuesto", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 255, 255)));
		panel_4.setBounds(535, 738, 632, 107);
		contentPane.add(panel_4);
		panel_4.setLayout(null);
		
		lblNewLabel = new JLabel("Neto :");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(24, 27, 67, 14);
		panel_4.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setForeground(Color.WHITE);
		textField.setBackground(Color.DARK_GRAY);
		textField.setBounds(81, 26, 76, 20);
		panel_4.add(textField);
		textField.setColumns(10);
		
		lblDescuento = new JLabel("Descuento :");
		lblDescuento.setForeground(Color.WHITE);
		lblDescuento.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblDescuento.setBounds(211, 27, 100, 14);
		panel_4.add(lblDescuento);
		
		textField_1 = new JTextField();
		textField_1.setForeground(Color.WHITE);
		textField_1.setBackground(Color.DARK_GRAY);
		textField_1.setBounds(310, 26, 86, 19);
		panel_4.add(textField_1);
		textField_1.setColumns(10);
		
		lblIva = new JLabel("IVA :");
		lblIva.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblIva.setForeground(Color.WHITE);
		lblIva.setBounds(438, 27, 55, 14);
		panel_4.add(lblIva);
		
		textField_2 = new JTextField();
		textField_2.setForeground(Color.WHITE);
		textField_2.setBackground(Color.DARK_GRAY);
		textField_2.setBounds(508, 26, 86, 20);
		panel_4.add(textField_2);
		textField_2.setColumns(10);
		
		lblTotalPresupuesto = new JLabel("Total presupuesto :");
		lblTotalPresupuesto.setForeground(Color.WHITE);
		lblTotalPresupuesto.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblTotalPresupuesto.setBounds(91, 57, 157, 27);
		panel_4.add(lblTotalPresupuesto);
		
		textField_3 = new JTextField();
		textField_3.setForeground(Color.WHITE);
		textField_3.setBackground(Color.DARK_GRAY);
		textField_3.setBounds(242, 60, 262, 25);
		panel_4.add(textField_3);
		textField_3.setColumns(10);
		
		panel_5 = new JPanel();
		panel_5.setBackground(Color.DARK_GRAY);
		panel_5.setBorder(new TitledBorder(null, "Datos Cliente", TitledBorder.LEADING, TitledBorder.TOP, null, Color.WHITE));
		panel_5.setBounds(10, 398, 515, 157);
		contentPane.add(panel_5);
		panel_5.setLayout(null);
		
		btnNewButton_5 = new JButton("");
		btnNewButton_5.setIcon(new ImageIcon(FrmCUN3.class.getResource("/icon/lupa.png")));
		btnNewButton_5.setForeground(Color.BLACK);
		btnNewButton_5.setBackground(Color.CYAN);
		btnNewButton_5.setBounds(424, 22, 81, 32);
		panel_5.add(btnNewButton_5);
		
		txtNombre = new JTextField();
		txtNombre.setForeground(Color.WHITE);
		txtNombre.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtNombre.setBackground(Color.DARK_GRAY);
		txtNombre.setText("  Nombre*");
		txtNombre.setBounds(10, 22, 384, 32);
		panel_5.add(txtNombre);
		txtNombre.setColumns(10);
		
		txtDireccin = new JTextField();
		txtDireccin.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtDireccin.setForeground(Color.WHITE);
		txtDireccin.setBackground(Color.DARK_GRAY);
		txtDireccin.setText("  Dirección*");
		txtDireccin.setColumns(10);
		txtDireccin.setBounds(10, 65, 495, 32);
		panel_5.add(txtDireccin);
		
		txtCifNif = new JTextField();
		txtCifNif.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtCifNif.setText("  CIF / NIF*");
		txtCifNif.setForeground(Color.WHITE);
		txtCifNif.setBackground(Color.DARK_GRAY);
		txtCifNif.setBounds(10, 108, 495, 38);
		panel_5.add(txtCifNif);
		txtCifNif.setColumns(10);
	}
}
