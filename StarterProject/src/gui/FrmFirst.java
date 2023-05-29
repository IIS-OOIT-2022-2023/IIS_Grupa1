package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ButtonGroup;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridBagLayout;
import javax.swing.JToggleButton;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class FrmFirst extends JFrame {

	private JPanel contentPane;
	private final ButtonGroup btnGroup;
	private DefaultListModel dlm;
	private JLabel lblCrvena;
	private JLabel lblPlava;
	private JLabel lblZuta;
	private JTextField txtUnosBoje;
	private DlgTest dlgTest;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmFirst frame = new FrmFirst();
					frame.setTitle("Naša prva forma");
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
	public FrmFirst() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel pnlCenter = new JPanel();
		contentPane.add(pnlCenter, BorderLayout.CENTER);
		GridBagLayout gbl_pnlCenter = new GridBagLayout();
		gbl_pnlCenter.columnWidths = new int[]{0, 0, 0, 0};
		gbl_pnlCenter.rowHeights = new int[]{0, 0, 0, 0, 0};
		gbl_pnlCenter.columnWeights = new double[]{0.0, 1.0, 1.0, Double.MIN_VALUE};
		gbl_pnlCenter.rowWeights = new double[]{0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		pnlCenter.setLayout(gbl_pnlCenter);
		
		JToggleButton tglbtnCrvena = new JToggleButton("Crvena");
		tglbtnCrvena.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dlm.addElement(lblCrvena.getText());
				lblCrvena.setForeground(Color.RED);
				lblPlava.setForeground(Color.BLACK);
				lblZuta.setForeground(Color.BLACK);
			}
		});
		GridBagConstraints gbc_tglbtnCrvena = new GridBagConstraints();
		gbc_tglbtnCrvena.insets = new Insets(0, 0, 5, 5);
		gbc_tglbtnCrvena.gridx = 0;
		gbc_tglbtnCrvena.gridy = 0;
		pnlCenter.add(tglbtnCrvena, gbc_tglbtnCrvena);
		
		lblCrvena = new JLabel("Crvena");
		lblCrvena.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_lblCrvena = new GridBagConstraints();
		gbc_lblCrvena.insets = new Insets(0, 0, 5, 5);
		gbc_lblCrvena.gridx = 1;
		gbc_lblCrvena.gridy = 0;
		pnlCenter.add(lblCrvena, gbc_lblCrvena);
		
		JToggleButton tglbtnPlava = new JToggleButton("Plava");
		tglbtnPlava.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dlm.addElement(lblPlava.getText());
				lblPlava.setForeground(Color.BLUE);
				lblCrvena.setForeground(Color.BLACK);
				lblZuta.setForeground(Color.BLACK);
			}
		});
		
		txtUnosBoje = new JTextField();
		txtUnosBoje.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_ENTER) {
					dlm.addElement(txtUnosBoje.getText());
					txtUnosBoje.setText("");
				}
			}
		});
		GridBagConstraints gbc_txtUnosBoje = new GridBagConstraints();
		gbc_txtUnosBoje.insets = new Insets(0, 0, 5, 0);
		gbc_txtUnosBoje.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtUnosBoje.gridx = 2;
		gbc_txtUnosBoje.gridy = 0;
		pnlCenter.add(txtUnosBoje, gbc_txtUnosBoje);
		txtUnosBoje.setColumns(10);
		GridBagConstraints gbc_tglbtnPlava = new GridBagConstraints();
		gbc_tglbtnPlava.insets = new Insets(0, 0, 5, 5);
		gbc_tglbtnPlava.gridx = 0;
		gbc_tglbtnPlava.gridy = 1;
		pnlCenter.add(tglbtnPlava, gbc_tglbtnPlava);
		
		lblPlava = new JLabel("Plava");
		GridBagConstraints gbc_lblPlava = new GridBagConstraints();
		gbc_lblPlava.insets = new Insets(0, 0, 5, 5);
		gbc_lblPlava.gridx = 1;
		gbc_lblPlava.gridy = 1;
		pnlCenter.add(lblPlava, gbc_lblPlava);
		
		JToggleButton tglbtnZuta = new JToggleButton("Zuta");
		tglbtnZuta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dlm.addElement(lblZuta.getText());
				lblZuta.setForeground(Color.YELLOW);
				lblPlava.setForeground(Color.BLACK);
				lblCrvena.setForeground(Color.BLACK);
			}
		});
		GridBagConstraints gbc_tglbtnZuta = new GridBagConstraints();
		gbc_tglbtnZuta.insets = new Insets(0, 0, 5, 5);
		gbc_tglbtnZuta.gridx = 0;
		gbc_tglbtnZuta.gridy = 2;
		pnlCenter.add(tglbtnZuta, gbc_tglbtnZuta);
		
		lblZuta = new JLabel("Zuta");
		GridBagConstraints gbc_lblZuta = new GridBagConstraints();
		gbc_lblZuta.insets = new Insets(0, 0, 5, 5);
		gbc_lblZuta.gridx = 1;
		gbc_lblZuta.gridy = 2;
		pnlCenter.add(lblZuta, gbc_lblZuta);
		
		btnGroup = new ButtonGroup();
		btnGroup.add(tglbtnCrvena);
		btnGroup.add(tglbtnPlava);
		btnGroup.add(tglbtnZuta);
		
		JLabel lblDodajBoju = new JLabel("Dodaj boju:");
		GridBagConstraints gbc_lblDodajBoju = new GridBagConstraints();
		gbc_lblDodajBoju.anchor = GridBagConstraints.EAST;
		gbc_lblDodajBoju.insets = new Insets(0, 0, 0, 5);
		gbc_lblDodajBoju.gridx = 0;
		gbc_lblDodajBoju.gridy = 3;
		pnlCenter.add(lblDodajBoju, gbc_lblDodajBoju);
		
		JComboBox<String> cmbDodajBoju = new JComboBox<String>();
		cmbDodajBoju.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dlm.addElement(cmbDodajBoju.getSelectedItem().toString());
				switch (cmbDodajBoju.getSelectedItem().toString()) {
				case "Zelena":
					lblDodajBoju.setForeground(Color.GREEN);
					break;
				case "Narandzasta":
					lblDodajBoju.setForeground(Color.ORANGE);
					break;
				case "Ljubicasta":
					lblDodajBoju.setForeground(Color.MAGENTA);
					break;
				default:
					lblDodajBoju.setForeground(Color.BLACK);
					break;
				}
			}
		});
		cmbDodajBoju.setModel(new DefaultComboBoxModel<String>(new String[] {"Zelena", "Narandzasta", "Ljubicasta"}));
		GridBagConstraints gbc_cmbDodajBoju = new GridBagConstraints();
		gbc_cmbDodajBoju.insets = new Insets(0, 0, 0, 5);
		gbc_cmbDodajBoju.fill = GridBagConstraints.HORIZONTAL;
		gbc_cmbDodajBoju.gridx = 1;
		gbc_cmbDodajBoju.gridy = 3;
		pnlCenter.add(cmbDodajBoju, gbc_cmbDodajBoju);
		
		JScrollPane scrollPane = new JScrollPane();
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridx = 2;
		gbc_scrollPane.gridy = 3;
		pnlCenter.add(scrollPane, gbc_scrollPane);
		
		JList lstBoje = new JList();
		scrollPane.setViewportView(lstBoje);
		
		dlm = new DefaultListModel();
		lstBoje.setModel(dlm);
		
		JPanel pnlNorth = new JPanel();
		pnlNorth.setBackground(new Color(128, 255, 0));
		contentPane.add(pnlNorth, BorderLayout.NORTH);
		GridBagLayout gbl_pnlNorth = new GridBagLayout();
		gbl_pnlNorth.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_pnlNorth.rowHeights = new int[]{0, 0, 0};
		gbl_pnlNorth.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_pnlNorth.rowWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		pnlNorth.setLayout(gbl_pnlNorth);
		
		Component horizontalStrut_6 = Box.createHorizontalStrut(20);
		GridBagConstraints gbc_horizontalStrut_6 = new GridBagConstraints();
		gbc_horizontalStrut_6.insets = new Insets(0, 0, 5, 5);
		gbc_horizontalStrut_6.gridx = 6;
		gbc_horizontalStrut_6.gridy = 0;
		pnlNorth.add(horizontalStrut_6, gbc_horizontalStrut_6);
		
		JLabel lblNaslov = new JLabel("Naslov");
		lblNaslov.setHorizontalAlignment(SwingConstants.CENTER);
		lblNaslov.setFont(new Font("Times New Roman", Font.BOLD, 14));
		GridBagConstraints gbc_lblNaslov = new GridBagConstraints();
		gbc_lblNaslov.insets = new Insets(0, 0, 5, 0);
		gbc_lblNaslov.gridx = 7;
		gbc_lblNaslov.gridy = 0;
		pnlNorth.add(lblNaslov, gbc_lblNaslov);
		
		Component horizontalStrut = Box.createHorizontalStrut(20);
		GridBagConstraints gbc_horizontalStrut = new GridBagConstraints();
		gbc_horizontalStrut.insets = new Insets(0, 0, 0, 5);
		gbc_horizontalStrut.gridx = 0;
		gbc_horizontalStrut.gridy = 1;
		pnlNorth.add(horizontalStrut, gbc_horizontalStrut);
		
		Component horizontalStrut_1 = Box.createHorizontalStrut(20);
		GridBagConstraints gbc_horizontalStrut_1 = new GridBagConstraints();
		gbc_horizontalStrut_1.insets = new Insets(0, 0, 0, 5);
		gbc_horizontalStrut_1.gridx = 1;
		gbc_horizontalStrut_1.gridy = 1;
		pnlNorth.add(horizontalStrut_1, gbc_horizontalStrut_1);
		
		Component horizontalStrut_2 = Box.createHorizontalStrut(20);
		GridBagConstraints gbc_horizontalStrut_2 = new GridBagConstraints();
		gbc_horizontalStrut_2.insets = new Insets(0, 0, 0, 5);
		gbc_horizontalStrut_2.gridx = 2;
		gbc_horizontalStrut_2.gridy = 1;
		pnlNorth.add(horizontalStrut_2, gbc_horizontalStrut_2);
		
		Component horizontalStrut_3 = Box.createHorizontalStrut(20);
		GridBagConstraints gbc_horizontalStrut_3 = new GridBagConstraints();
		gbc_horizontalStrut_3.insets = new Insets(0, 0, 0, 5);
		gbc_horizontalStrut_3.gridx = 3;
		gbc_horizontalStrut_3.gridy = 1;
		pnlNorth.add(horizontalStrut_3, gbc_horizontalStrut_3);
		
		Component horizontalStrut_4 = Box.createHorizontalStrut(20);
		GridBagConstraints gbc_horizontalStrut_4 = new GridBagConstraints();
		gbc_horizontalStrut_4.insets = new Insets(0, 0, 0, 5);
		gbc_horizontalStrut_4.gridx = 4;
		gbc_horizontalStrut_4.gridy = 1;
		pnlNorth.add(horizontalStrut_4, gbc_horizontalStrut_4);
		
		Component horizontalStrut_5 = Box.createHorizontalStrut(20);
		GridBagConstraints gbc_horizontalStrut_5 = new GridBagConstraints();
		gbc_horizontalStrut_5.insets = new Insets(0, 0, 0, 5);
		gbc_horizontalStrut_5.gridx = 5;
		gbc_horizontalStrut_5.gridy = 1;
		pnlNorth.add(horizontalStrut_5, gbc_horizontalStrut_5);
		
		JPanel pnlSouth = new JPanel();
		contentPane.add(pnlSouth, BorderLayout.SOUTH);
		GridBagLayout gbl_pnlSouth = new GridBagLayout();
		gbl_pnlSouth.columnWidths = new int[]{0, 0, 0, 0};
		gbl_pnlSouth.rowHeights = new int[]{0, 0};
		gbl_pnlSouth.columnWeights = new double[]{0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_pnlSouth.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		pnlSouth.setLayout(gbl_pnlSouth);
		
		JButton btnKlik = new JButton("Klikni me");
		btnKlik.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null,"Antistres dugme :-)","Poruka",JOptionPane.INFORMATION_MESSAGE);
				
			}
		});
		GridBagConstraints gbc_btnKlik = new GridBagConstraints();
		gbc_btnKlik.insets = new Insets(0, 0, 0, 5);
		gbc_btnKlik.gridx = 0;
		gbc_btnKlik.gridy = 0;
		pnlSouth.add(btnKlik, gbc_btnKlik);
		
		JButton btnIzaberiBoju = new JButton("Izaberi boju");
		btnIzaberiBoju.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dlgTest = new DlgTest();
				dlgTest.setVisible(true);
				if (dlgTest.isOk() == true) {
					dlm.addElement(dlgTest.getTxtRed().getText() + " " + 
									dlgTest.getTxtGreen().getText() + " " + 
									dlgTest.getTxtBlue().getText());
					btnIzaberiBoju.setBackground(new Color(Integer.parseInt(dlgTest.getTxtRed().getText()), 
							Integer.parseInt(dlgTest.getTxtGreen().getText()),
							Integer.parseInt(dlgTest.getTxtBlue().getText())));
				}
			}
		});
		GridBagConstraints gbc_btnIzaberiBoju = new GridBagConstraints();
		gbc_btnIzaberiBoju.insets = new Insets(0, 0, 0, 5);
		gbc_btnIzaberiBoju.gridx = 1;
		gbc_btnIzaberiBoju.gridy = 0;
		pnlSouth.add(btnIzaberiBoju, gbc_btnIzaberiBoju);
		
		JButton btnIzmeniBoju = new JButton("Izmeni boju");
		btnIzmeniBoju.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dlgTest = new DlgTest();
				try {
				String [] splits=dlm.getElementAt(lstBoje.getSelectedIndex()).toString().split(" ");
				dlgTest.getTxtRed().setText(splits[0]);
				dlgTest.getTxtGreen().setText(splits[1]);
				dlgTest.getTxtBlue().setText(splits[2]);
				dlgTest.setVisible(true);
				if(dlgTest.isOk() == true) {
					dlm.removeElementAt(lstBoje.getSelectedIndex());
					dlm.addElement(dlgTest.getTxtRed().getText() + " " +
							dlgTest.getTxtGreen().getText() + " " +
							dlgTest.getTxtBlue().getText());
					btnIzmeniBoju.setBackground(new Color(Integer.parseInt(dlgTest.getTxtRed().getText()), 
							Integer.parseInt(dlgTest.getTxtGreen().getText()),
							Integer.parseInt(dlgTest.getTxtBlue().getText())));
					
				}
				}
				catch(Exception e1) {
					JOptionPane.showMessageDialog(null, "Odaberite adekvatnu boju!", "Upozorenje",
							JOptionPane.WARNING_MESSAGE);
				}
			}
		});
		GridBagConstraints gbc_btnIzmeniBoju = new GridBagConstraints();
		gbc_btnIzmeniBoju.gridx = 2;
		gbc_btnIzmeniBoju.gridy = 0;
		pnlSouth.add(btnIzmeniBoju, gbc_btnIzmeniBoju);
	}

}
