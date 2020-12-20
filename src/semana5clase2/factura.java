/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana5clase2;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import java.awt.Color;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.ContainerAdapter;
import java.awt.event.ContainerEvent;
import java.awt.event.MouseWheelListener;
import java.awt.event.MouseWheelEvent;
import javax.swing.JSpinner;


public class factura extends JFrame {
	
	private JPanel contentPane;
	private JTextField textField_1;
	private JTextField textField;
        
        private PRINCIPAL p;

	/**
	 * Launch the application.
	 */
	
	Double total=0.0;//acumulador de total//
	

	/**
	 * Create the frame.
	 */

	public factura(PRINCIPAL p) {
              
            this.p = p;
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 477, 306);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(102, 255, 51));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblIngresaElNombre = new JLabel("INGRESAR EL PRODUCTO");
		lblIngresaElNombre.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblIngresaElNombre.setBounds(10, 11, 181, 24);
		contentPane.add(lblIngresaElNombre);
		
		JLabel lblNewLabel_1 = new JLabel("INGRESAR LA CANTIDAD");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(10, 42, 181, 24);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(205, 77, 167, 20);
		contentPane.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(205, 46, 167, 20);
		contentPane.add(textField_1);
		
		String [] listad= {"seleccione un producto","TELEVISOR","MICROONDAS","LAVADORA","LICUADORA"};
		JComboBox comboBox = new JComboBox(listad);
		comboBox.addContainerListener(new ContainerAdapter() {
		});
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 14));
		comboBox.addComponentListener(new ComponentAdapter() {
		});
		comboBox.setBounds(205, 11, 167, 24);
		contentPane.add(comboBox);
		comboBox.addItem("COCINA");
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(32, 103, 340, 119);
		contentPane.add(textArea);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setBounds(376, 202, 68, 20);
		contentPane.add(textArea_1);
		
		JButton btnNewButton = new JButton("AGREGAR");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Double precio;
				int cantidad;
				    String nombre= (String) comboBox.getSelectedItem();
				    cantidad=(int) Double.parseDouble(textField_1.getText());
				    precio=Double.parseDouble(textField.getText());
				    if(nombre=="seleccione un producto") {
				    	JOptionPane.showMessageDialog(null, "producto no valido");
				    }
				    else {
				    	textArea.append(nombre+"\t"+cantidad+"\t"+precio+"\n");
				    	total=total+(cantidad*precio);
				    }
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton.setBounds(10, 233, 101, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNuevo = new JButton("NUEVO");
		btnNuevo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				comboBox.setSelectedItem("seleccione un producto");
				textField_1.setText("");
				textField.setText("");
			}
		});
		btnNuevo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNuevo.setBounds(121, 233, 101, 23);
		contentPane.add(btnNuevo);
		
		JButton btnSalir = new JButton("SALIR");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				dispose();
			}
		});
		btnSalir.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnSalir.setBounds(343, 233, 101, 23);
		contentPane.add(btnSalir);
		
		JLabel lblNewLabel_1_1 = new JLabel("INGRESAR EL PRECIO");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_1.setBounds(10, 73, 181, 24);
		contentPane.add(lblNewLabel_1_1);
		
		
		JButton btnCalcular = new JButton("CALCULAR");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea_1.append(total+"\n");
				
				p.settotal(total);
                                
				JOptionPane.showMessageDialog(null, p.getTotal());
			}
		});
		btnCalcular.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnCalcular.setBounds(232, 233, 101, 23);
		contentPane.add(btnCalcular);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("TOTAL");
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_1_1.setBounds(382, 179, 62, 24);
		contentPane.add(lblNewLabel_1_1_1);
		
	}
}