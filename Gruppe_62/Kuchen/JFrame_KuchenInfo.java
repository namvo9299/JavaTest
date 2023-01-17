package Kuchen;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.ImageIcon;


public class JFrame_KuchenInfo extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private DefaultListModel<String> filter = new DefaultListModel<>();
	private ArrayList<KuchenInformation> liste ; //add Objekt in der Klasse <KuchenInformation>
	private JPanel contentPane;
	private JTextField text_Geschmack;
	private JTextField text_Preis;
	private DefaultListModel<String> kuchenListe = new DefaultListModel<>(); //nochmal DefaultListModel
	private JScrollPane scrollPane = new JScrollPane();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFrame_KuchenInfo frame = new JFrame_KuchenInfo();
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
	public JFrame_KuchenInfo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 824, 741);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(208, 199, 198));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		text_Geschmack = new JTextField();
		text_Geschmack.setForeground(new Color(0, 0, 0));
		text_Geschmack.setBounds(170, 83, 186, 29);
		contentPane.add(text_Geschmack);
		text_Geschmack.setColumns(10);
		
		text_Preis = new JTextField();
		text_Preis.setForeground(new Color(0, 0, 0));
		text_Preis.setBounds(170, 129, 108, 29);
		contentPane.add(text_Preis);
		text_Preis.setColumns(10);

		
		JLabel lbl_Geschmack = new JLabel("Kuchen Geschmack:");
		lbl_Geschmack.setForeground(new Color(73, 47, 41));
		lbl_Geschmack.setBackground(new Color(61, 39, 35));
		lbl_Geschmack.setFont(new Font("Century Gothic", Font.BOLD, 12));
		lbl_Geschmack.setBounds(37, 88, 127, 16);
		contentPane.add(lbl_Geschmack);
		
		JLabel lblNewLabel_1 = new JLabel("Preis eingeben:");
		lblNewLabel_1.setForeground(new Color(81, 53, 47));
		lblNewLabel_1.setFont(new Font("Century Gothic", Font.BOLD, 12));
		lblNewLabel_1.setBounds(37, 133, 108, 19);
		contentPane.add(lblNewLabel_1);
		
		JComboBox<String> box_Form = new JComboBox<String>();
		box_Form.setForeground(new Color(86, 79, 71));
		box_Form.setBackground(new Color(186, 179, 171));
		box_Form.setFont(new Font("Century Gothic", Font.BOLD, 12));
		box_Form.setModel(new DefaultComboBoxModel<String>(new String[] {"Bitte Auswählen", "Rund", "Rechteckig", "Herz", "Cupcake", "Rolle"}));
		box_Form.setBounds(608, 82, 160, 29);
		contentPane.add(box_Form);
		
		JLabel lblNewLabel_2 = new JLabel("Kuchenform: ");
		lblNewLabel_2.setForeground(new Color(73, 47, 41));
		lblNewLabel_2.setFont(new Font("Century Gothic", Font.BOLD, 12));
		lblNewLabel_2.setBounds(530, 82, 85, 29);
		contentPane.add(lblNewLabel_2);
		

		JList<String> list_KuchenInfo = new JList<String>(kuchenListe); //tu nhap <String>(danhsach)
		list_KuchenInfo.setBackground(new Color(100, 91, 83));
		list_KuchenInfo.setToolTipText("");
		list_KuchenInfo.setForeground(new Color(211, 206, 201));
		list_KuchenInfo.setFont(new Font("Century Gothic", Font.BOLD, 11));
		scrollPane.setBounds(49, 256, 719, 211);
		scrollPane.setViewportView(list_KuchenInfo);
		contentPane.add(scrollPane);

		JList<String> list_Filter = new JList<String>(filter); //tu nhap
		list_Filter.setBackground(new Color(116, 105, 95));
		list_Filter.setForeground(new Color(211, 206, 201));
		list_Filter.setFont(new Font("Century Gothic", Font.PLAIN, 10));
		list_Filter.setBounds(194, 522, 574, 156);
		contentPane.add(list_Filter);
		
		JButton button_Speichern = new JButton("Speichern");
		button_Speichern.setBackground(new Color(116, 105, 95));
		button_Speichern.setForeground(new Color(186, 179, 171));
		button_Speichern.setFont(new Font("Century Gothic", Font.BOLD, 13));
		
		button_Speichern.setBounds(283, 171, 102, 35);
		contentPane.add(button_Speichern);
		
		JButton button_Filter = new JButton("Filter");
		button_Filter.setForeground(new Color(116, 105, 95));
		button_Filter.setBackground(new Color(211, 206, 201));
		button_Filter.setFont(new Font("Century Gothic", Font.BOLD, 12));
	
		button_Filter.setBounds(62, 564, 102, 35);
		contentPane.add(button_Filter);

		
		//liste erstelen
		KuchenListe listPreis = new KuchenListe ();
		liste = listPreis.getListe();
		
//		//keo arraylist co san ra 
//		for(int i=0; i<liste.size();i++) {//theorie nochmal schauen "for"
//			if (liste.get(i).getVegan(true)) {
//				
//			kuchenListe.addElement("Geschmack: "+liste.get(i).getGeschmack().toString()
//					+" - Kuchenform: "+ liste.get(i).getForm().toString()
//					+ " - ist Vegan"
//					+" \nPreis " + String.valueOf(liste.get(i).getPreis()) + " Euro/Stück ");}
//			else { 
//				kuchenListe.addElement("Geschmack: "+ liste.get(i).getGeschmack().toString()
//						+ " - Kuchenform: "+liste.get(i).getForm().toString()
//						+" \nPreis "+ String.valueOf(liste.get(i).getPreis())+ " Euro/Stück ");
//			}
//		
//		
//		}
		
		JCheckBox vegan = new JCheckBox("Vegan");
		vegan.setForeground(new Color(86, 79, 71));
		vegan.setBackground(new Color(186, 179, 171));
		vegan.setFont(new Font("Century Gothic", Font.BOLD, 12));
		
		vegan.setBounds(608, 129, 93, 26);
		contentPane.add(vegan);
		
		JComboBox<String> box_Filter = new JComboBox<>();
		box_Filter.setBackground(new Color(186, 179, 171));
		box_Filter.setForeground(new Color(86, 79, 71));
		box_Filter.setFont(new Font("Century Gothic", Font.BOLD, 12));
		box_Filter.setModel(new DefaultComboBoxModel<String>(new String[] {"Bitte Auswählen", "Rund", "Rechteckig", "Herz", "Cupcake", "Rolle"}));
		box_Filter.setBounds(37, 525, 139, 29);
		contentPane.add(box_Filter);
		
		JLabel lbl_Filter = new JLabel("- Filter -");
		lbl_Filter.setBackground(new Color(240, 240, 240));
		lbl_Filter.setForeground(new Color(86, 79, 71));
		lbl_Filter.setFont(new Font("Curlz MT", Font.BOLD, 18));
		lbl_Filter.setBounds(418, 491, 79, 21);
		contentPane.add(lbl_Filter);
		
		
		
		
		JButton btnLöschen = new JButton("Löschen");
		btnLöschen.setForeground(new Color(90, 82, 73));
		btnLöschen.setBackground(new Color(131, 119, 107));
		btnLöschen.setFont(new Font("Century Gothic", Font.BOLD, 14));
		btnLöschen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null," Möchten Sie löschen ?");
				
				text_Geschmack.setText(null);
				text_Preis.setText(null);
				box_Form.setSelectedItem(null);
				
			}
				}
			
		);
		btnLöschen.setBounds(446, 171, 102, 35);
		contentPane.add(btnLöschen);
		
		JLabel lable_Name = new JLabel("- BÄCKEREI -");
		lable_Name.setBackground(new Color(86, 79, 71));
		lable_Name.setForeground(new Color(71, 65, 58));
		lable_Name.setFont(new Font("Curlz MT", Font.BOLD, 36));
		lable_Name.setBounds(283, 10, 256, 49);
		contentPane.add(lable_Name);
		
		JLabel lable_Kuchenlist_Name = new JLabel("- Kuchen Liste -");
		lable_Kuchenlist_Name.setBackground(new Color(86, 79, 71));
		lable_Kuchenlist_Name.setForeground(new Color(86, 79, 71));
		lable_Kuchenlist_Name.setFont(new Font("Curlz MT", Font.BOLD, 24));
		lable_Kuchenlist_Name.setBounds(327, 227, 161, 19);
		contentPane.add(lable_Kuchenlist_Name);
		
		JLabel lblNewLabel = new JLabel("Euro/Stück");
		lblNewLabel.setFont(new Font("Garamond", Font.PLAIN, 14));
		lblNewLabel.setBounds(283, 132, 73, 21);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setBounds(0, -7, 810, 711);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon("D:\\HocTap\\Java project\\Gruppe_62\\kkkkk.jpg"));
		lblNewLabel_4.setBounds(0, 0, 810, 782);
		contentPane.add(lblNewLabel_4);
		
		
		//Filter Button
		button_Filter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				filter.removeAllElements();
				for(int i=0;i<liste.size();i++)
				{
					
					if(liste.get(i).getForm()==box_Filter.getSelectedItem().toString()) {
						
						filter.addElement("Geschmack: "+liste.get(i).getGeschmack().toString()
								+" - Kuchenform: "+ liste.get(i).getForm().toString()
								+ " - ist Vegan"
								+"\nPreis " + String.valueOf(liste.get(i).getPreis()) + " Euro/Stück ");
					}
				}
			}
			
		});
		
		
		button_Speichern.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Fehler Meldung erstellen
				if (text_Geschmack.getText().length()<=0 || text_Preis.getText().length()<=0) {
					JOptionPane.showMessageDialog(null,"Bitte Information eingeben");
					return;
				}	
				else if (box_Form.getSelectedItem().toString()=="Bitte Auswählen") {
					JOptionPane.showMessageDialog(null,"Bitte Information eingeben");
					return;
				}	
				

				liste.add(new KuchenInformation(text_Geschmack.getText(), box_Form.getSelectedItem().toString(), 
						vegan.isSelected(),Double.parseDouble(text_Preis.getText())));
				if (vegan.isSelected()) {
					kuchenListe.addElement("Geschmack: " + text_Geschmack.getText()
										+ " - Kuchenform: "  +box_Form.getSelectedItem().toString()
										+ " - ist Vegan "
										+"\nPreis:  " + Double.parseDouble(text_Preis.getText())+ " Euro/Stück" );
				}
				else  {
					kuchenListe.addElement("Geschmack: " + text_Geschmack.getText()
										+ " - Kuchenform: "  +box_Form.getSelectedItem().toString()
										+"\nPreis:  " + Double.parseDouble(text_Preis.getText())+ " Euro/Stück");
				}
				vegan.setSelected(false); //nut checkbox uncheck
			}
			
		});
		
	}
}

