package gui;

import java.awt.EventQueue;

import javax.swing.JDialog;
import java.awt.Toolkit;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Window.Type;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Color;
import com.toedter.calendar.JDateChooser;
import javax.swing.JPanel;
import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.table.DefaultTableModel;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.SwingConstants;

public class RegistrarExpediente extends JDialog {
	private JTextField textField;
	private JButton btnBuscarBen;
	private JButton btnRemitir;
	private JButton btnBuscarBen_1;
	private JLabel lblProveedor;
	private JLabel lblDir;
	private JComboBox comboBox;
	private JLabel lblTipoP;
	private JComboBox comboBox_1;
	private JTextField textField_1;
	private JLabel lblNewLabel;
	private JTextField textField_2;
	private JLabel lblCiudad;
	private JTextField textField_3;
	private JLabel lblPais;
	private JComboBox comboBox_2;
	private JLabel lblNewLabel_1;
	private JTextField textField_4;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JTextField textField_6;
	private JLabel lblConceptoDePago;
	private JLabel lblCodigoDeOperacin;
	private JTextField textField_7;
	private JTextField textField_8;
	private JLabel lblNewLabel_5;
	private JLabel lblFecha;
	private JDateChooser dateChooser;
	private JPanel panel;
	private JLabel lblNewLabel_6;
	private JLabel lblNewLabel_7;
	private JPanel panel_1;
	private JTable table;
	private JScrollPane scrollPane;
	private JButton btnBuscarBen_2;
	private JButton btnBuscarBen_3;
	private JPanel panel_2;
	private JPanel panel_3;
	private JPanel panel_4;
	private JTextField textField_9;
	private JLabel lblNewLabel_4;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegistrarExpediente dialog = new RegistrarExpediente();
					dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					dialog.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the dialog.
	 */
	public RegistrarExpediente() {
		getContentPane().setForeground(SystemColor.menu);
		getContentPane().setBackground(Color.DARK_GRAY);
		setIconImage(Toolkit.getDefaultToolkit().getImage(RegistrarExpediente.class.getResource("/iconos/NewExp.png")));
		setTitle("Generar Expediente de Pagos");
		setBounds(100, 100, 1273, 701);
		getContentPane().setLayout(null);
		
		panel_2 = new JPanel();
		panel_2.setForeground(Color.WHITE);
		panel_2.setBackground(Color.DARK_GRAY);
		panel_2.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Receptor de Pago", TitledBorder.LEADING, TitledBorder.TOP, null, Color.WHITE));
		panel_2.setBounds(39, 112, 623, 174);
		getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(108, 73, 499, 20);
		panel_2.add(textField);
		textField.setForeground(Color.LIGHT_GRAY);
		textField.setBackground(Color.DARK_GRAY);
		textField.setColumns(10);
		
		btnBuscarBen = new JButton("Buscar Receptor");
		btnBuscarBen.setBounds(421, 22, 186, 40);
		panel_2.add(btnBuscarBen);
		btnBuscarBen.setForeground(Color.BLACK);
		btnBuscarBen.setBackground(new Color(0, 204, 204));
		btnBuscarBen.setIcon(new ImageIcon(RegistrarExpediente.class.getResource("/icon/lupa.png")));
		
		lblProveedor = new JLabel("Proveedor");
		lblProveedor.setBounds(10, 76, 88, 14);
		panel_2.add(lblProveedor);
		lblProveedor.setForeground(Color.WHITE);
		
		lblDir = new JLabel("Direccion");
		lblDir.setBounds(10, 111, 88, 14);
		panel_2.add(lblDir);
		lblDir.setForeground(Color.WHITE);
		
		comboBox = new JComboBox();
		comboBox.setBounds(166, 28, 178, 22);
		panel_2.add(comboBox);
		comboBox.setForeground(Color.LIGHT_GRAY);
		comboBox.setBackground(Color.DARK_GRAY);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Proveedor", "Planilla"}));
		
		textField_1 = new JTextField();
		textField_1.setBounds(108, 108, 499, 20);
		panel_2.add(textField_1);
		textField_1.setForeground(Color.LIGHT_GRAY);
		textField_1.setBackground(Color.DARK_GRAY);
		textField_1.setColumns(10);
		
		lblNewLabel = new JLabel("Cod. Postal:");
		lblNewLabel.setBounds(10, 143, 88, 14);
		panel_2.add(lblNewLabel);
		lblNewLabel.setForeground(Color.WHITE);
		
		textField_2 = new JTextField();
		textField_2.setBounds(108, 140, 74, 20);
		panel_2.add(textField_2);
		textField_2.setForeground(Color.LIGHT_GRAY);
		textField_2.setBackground(Color.DARK_GRAY);
		textField_2.setColumns(10);
		
		lblCiudad = new JLabel("Ciudad:");
		lblCiudad.setBounds(212, 143, 59, 14);
		panel_2.add(lblCiudad);
		lblCiudad.setForeground(Color.WHITE);
		
		textField_3 = new JTextField();
		textField_3.setBounds(281, 140, 155, 20);
		panel_2.add(textField_3);
		textField_3.setForeground(Color.LIGHT_GRAY);
		textField_3.setBackground(Color.DARK_GRAY);
		textField_3.setColumns(10);
		
		lblPais = new JLabel("Pais:");
		lblPais.setBounds(446, 143, 59, 14);
		panel_2.add(lblPais);
		lblPais.setForeground(Color.WHITE);
		
		comboBox_2 = new JComboBox();
		comboBox_2.setBounds(496, 139, 111, 22);
		panel_2.add(comboBox_2);
		comboBox_2.setBackground(Color.DARK_GRAY);
		comboBox_2.setForeground(Color.LIGHT_GRAY);
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"PERU", "BRASIL"}));
		
		lblNewLabel_5 = new JLabel("Tipo de Receptor:");
		lblNewLabel_5.setBounds(10, 28, 117, 14);
		panel_2.add(lblNewLabel_5);
		lblNewLabel_5.setForeground(Color.WHITE);
		
		btnRemitir = new JButton("Remitir Expediente");
		btnRemitir.setBackground(new Color(0, 204, 204));
		btnRemitir.setBounds(999, 559, 237, 55);
		getContentPane().add(btnRemitir);
		
		btnBuscarBen_1 = new JButton("");
		btnBuscarBen_1.setIcon(new ImageIcon(RegistrarExpediente.class.getResource("/icon/signo-mas-para-agregar.png")));
		btnBuscarBen_1.setBackground(new Color(0, 204, 204));
		btnBuscarBen_1.setBounds(45, 574, 59, 40);
		getContentPane().add(btnBuscarBen_1);
		
		panel_4 = new JPanel();
		panel_4.setForeground(Color.LIGHT_GRAY);
		panel_4.setBackground(Color.DARK_GRAY);
		panel_4.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Datos del Pago", TitledBorder.LEADING, TitledBorder.TOP, null, Color.WHITE));
		panel_4.setBounds(42, 411, 620, 129);
		getContentPane().add(panel_4);
		panel_4.setLayout(null);
		
		lblTipoP = new JLabel("Tipo dePago:");
		lblTipoP.setBounds(6, 41, 155, 14);
		panel_4.add(lblTipoP);
		lblTipoP.setForeground(Color.WHITE);
		
		comboBox_1 = new JComboBox();
		comboBox_1.setBounds(118, 37, 178, 22);
		panel_4.add(comboBox_1);
		comboBox_1.setBackground(Color.DARK_GRAY);
		comboBox_1.setForeground(Color.LIGHT_GRAY);
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Orden de Compra", "Ordenes de Servicio", "Planillas", "Liquidacion de impuestos", "resolucion"}));
		
		lblConceptoDePago = new JLabel("Concepto de Pago:");
		lblConceptoDePago.setBounds(6, 73, 165, 14);
		panel_4.add(lblConceptoDePago);
		lblConceptoDePago.setForeground(Color.WHITE);
		
		lblCodigoDeOperacin = new JLabel("Codigo de Operaci\u00F3n:");
		lblCodigoDeOperacin.setBounds(320, 73, 133, 14);
		panel_4.add(lblCodigoDeOperacin);
		lblCodigoDeOperacin.setForeground(Color.WHITE);
		
		textField_7 = new JTextField();
		textField_7.setBounds(118, 70, 176, 20);
		panel_4.add(textField_7);
		textField_7.setForeground(Color.LIGHT_GRAY);
		textField_7.setBackground(Color.DARK_GRAY);
		textField_7.setColumns(10);
		
		textField_8 = new JTextField();
		textField_8.setBounds(455, 70, 145, 20);
		panel_4.add(textField_8);
		textField_8.setForeground(Color.LIGHT_GRAY);
		textField_8.setBackground(Color.DARK_GRAY);
		textField_8.setColumns(10);
		
		lblFecha = new JLabel("Fecha del Pago:");
		lblFecha.setBounds(320, 41, 155, 14);
		panel_4.add(lblFecha);
		lblFecha.setForeground(Color.WHITE);
		
		dateChooser = new JDateChooser();
		dateChooser.setBounds(455, 37, 145, 20);
		panel_4.add(dateChooser);
		dateChooser.getCalendarButton().setForeground(Color.LIGHT_GRAY);
		dateChooser.getCalendarButton().setBackground(Color.DARK_GRAY);
		
		panel_3 = new JPanel();
		panel_3.setForeground(Color.LIGHT_GRAY);
		panel_3.setBackground(Color.DARK_GRAY);
		panel_3.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Datos Bancarios", TitledBorder.LEADING, TitledBorder.TOP, null, Color.WHITE));
		panel_3.setBounds(40, 284, 624, 129);
		getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		lblNewLabel_1 = new JLabel("Banco:");
		lblNewLabel_1.setBounds(10, 55, 78, 14);
		panel_3.add(lblNewLabel_1);
		lblNewLabel_1.setForeground(Color.WHITE);
		
		textField_4 = new JTextField();
		textField_4.setBounds(104, 52, 507, 20);
		panel_3.add(textField_4);
		textField_4.setForeground(Color.LIGHT_GRAY);
		textField_4.setBackground(Color.DARK_GRAY);
		textField_4.setColumns(10);
		
		lblNewLabel_2 = new JLabel("RUC:");
		lblNewLabel_2.setBounds(10, 20, 85, 14);
		panel_3.add(lblNewLabel_2);
		lblNewLabel_2.setForeground(Color.WHITE);
		
		lblNewLabel_3 = new JLabel("CCI:");
		lblNewLabel_3.setBounds(350, 93, 78, 14);
		panel_3.add(lblNewLabel_3);
		lblNewLabel_3.setForeground(Color.WHITE);
		
		textField_6 = new JTextField();
		textField_6.setBounds(432, 90, 182, 20);
		panel_3.add(textField_6);
		textField_6.setForeground(Color.LIGHT_GRAY);
		textField_6.setBackground(Color.DARK_GRAY);
		textField_6.setColumns(10);
		
		textField_9 = new JTextField();
		textField_9.setForeground(Color.LIGHT_GRAY);
		textField_9.setColumns(10);
		textField_9.setBackground(Color.DARK_GRAY);
		textField_9.setBounds(104, 14, 507, 20);
		panel_3.add(textField_9);
		
		lblNewLabel_4 = new JLabel("N\u00BA de Cuenta:");
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setBounds(10, 95, 78, 14);
		panel_3.add(lblNewLabel_4);
		
		textField_5 = new JTextField();
		textField_5.setForeground(Color.LIGHT_GRAY);
		textField_5.setColumns(10);
		textField_5.setBackground(Color.DARK_GRAY);
		textField_5.setBounds(104, 90, 182, 20);
		panel_3.add(textField_5);
		
		panel = new JPanel();
		panel.setBackground(new Color(0, 204, 204));
		panel.setBounds(0, 11, 1259, 76);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		lblNewLabel_6 = new JLabel("July 18, 2021");
		lblNewLabel_6.setForeground(Color.WHITE);
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_6.setBounds(43, 51, 82, 14);
		panel.add(lblNewLabel_6);
		
		lblNewLabel_7 = new JLabel("EXPEDIENTE N\u00B0 1001 - 2021");
		lblNewLabel_7.setForeground(Color.WHITE);
		lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblNewLabel_7.setBounds(43, 11, 580, 29);
		panel.add(lblNewLabel_7);
		
		JLabel lblNewLabel_9 = new JLabel("");
		lblNewLabel_9.setIcon(new ImageIcon(RegistrarExpediente.class.getResource("/icon/miniExp.png")));
		lblNewLabel_9.setBounds(1138, 7, 82, 65);
		panel.add(lblNewLabel_9);
		
		panel_1 = new JPanel();
		panel_1.setForeground(Color.WHITE);
		panel_1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "COMPROBANTE", TitledBorder.LEADING, TitledBorder.TOP, null, Color.WHITE));
		panel_1.setBackground(new Color(0, 204, 204));
		panel_1.setBounds(713, 112, 523, 428);
		getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 24, 503, 380);
		panel_1.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"RECEPTOR", "NOMBRE", "PAGO", "FECHA", "OPERACION", "MONTO"
			}
		));
		table.setForeground(Color.LIGHT_GRAY);
		table.setBackground(Color.DARK_GRAY);
		table.setFillsViewportHeight(true);
		scrollPane.setViewportView(table);
		
		btnBuscarBen_2 = new JButton("");
		btnBuscarBen_2.setIcon(new ImageIcon(RegistrarExpediente.class.getResource("/icon/cerrar.png")));
		btnBuscarBen_2.setBackground(new Color(0, 204, 204));
		btnBuscarBen_2.setBounds(603, 574, 59, 40);
		getContentPane().add(btnBuscarBen_2);
		
		btnBuscarBen_3 = new JButton("");
		btnBuscarBen_3.setIcon(new ImageIcon(RegistrarExpediente.class.getResource("/icon/editar.png")));
		btnBuscarBen_3.setBackground(new Color(0, 204, 204));
		btnBuscarBen_3.setBounds(324, 574, 59, 40);
		getContentPane().add(btnBuscarBen_3);
	}
}
