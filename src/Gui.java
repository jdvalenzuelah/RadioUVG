import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ButtonGroup;
import javax.swing.JTextField;

public class Gui {

	private JFrame frame;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JButton boton1;
	private JButton boton2;
	private JButton boton3;
	private JButton boton4;
	private JButton boton5;
	private JButton boton6;
	private JButton boton7;
	private JButton boton8;
	private JButton boton9;
	private JButton boton10;
	private JButton boton11;
	private JButton boton12;
	private JButton btnNewButton; // Prender
	private JButton btnApagar;
	private JButton button; // Adelante
	private JButton button_1; // Atras
	private JButton rdbtnAm;
	private JButton rdbtnFm;
	private JTextField txtEstacion;
	private JButton btnGuardarEstacion;
	
	private RadioI radio;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Gui window = new Gui();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Gui() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		radio = new Radio();
		
		frame = new JFrame();
		frame.setBounds(100, 100, 410, 547);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		boton1 = new JButton("Boton 1");
		boton1.setBounds(12, 182, 97, 25);
		frame.getContentPane().add(boton1);
		
		boton2 = new JButton("Boton 2");
		boton2.setBounds(119, 182, 97, 25);
		frame.getContentPane().add(boton2);
		
		boton3 = new JButton("Boton 3");
		boton3.setBounds(12, 220, 97, 25);
		frame.getContentPane().add(boton3);
		
		boton4 = new JButton("Boton 4");
		boton4.setBounds(119, 220, 97, 25);
		frame.getContentPane().add(boton4);
		
		boton5 = new JButton("Boton 5");
		boton5.setBounds(12, 258, 97, 25);
		frame.getContentPane().add(boton5);
		
		boton6 = new JButton("Boton 6");
		boton6.setBounds(119, 255, 97, 25);
		frame.getContentPane().add(boton6);
		
		boton7 = new JButton("Boton 7");
		boton7.setBounds(12, 293, 97, 25);
		frame.getContentPane().add(boton7);
		
		boton8 = new JButton("Boton 8");
		boton8.setBounds(119, 290, 97, 25);
		frame.getContentPane().add(boton8);
		
		boton9 = new JButton("Boton 9");
		boton9.setBounds(12, 334, 97, 25);
		frame.getContentPane().add(boton9);
		
		boton10 = new JButton("Boton 10");
		boton10.setBounds(119, 334, 97, 25);
		frame.getContentPane().add(boton10);
		
		boton11 = new JButton("Boton 11");
		boton11.setBounds(12, 372, 97, 25);
		frame.getContentPane().add(boton11);
		
		boton12 = new JButton("Boton 12");
		boton12.setBounds(119, 372, 97, 25);
		frame.getContentPane().add(boton12);
		
		btnNewButton = new JButton("Prender");
		btnNewButton.setBounds(162, 426, 112, 40);
		frame.getContentPane().add(btnNewButton);
		
		btnApagar = new JButton("Apagar");
		btnApagar.setBounds(12, 426, 112, 40);
		frame.getContentPane().add(btnApagar);
		
		button = new JButton(">>>");
		button.setBounds(162, 108, 138, 40);
		frame.getContentPane().add(button);
		
		button_1 = new JButton("<<<");
		button_1.setBounds(12, 108, 138, 40);
		frame.getContentPane().add(button_1);
		
		JLabel lblAtras = new JLabel("Atras");
		lblAtras.setBounds(63, 89, 56, 16);
		frame.getContentPane().add(lblAtras);
		
		JLabel lblAdelante = new JLabel("Adelante");
		lblAdelante.setBounds(203, 89, 56, 16);
		frame.getContentPane().add(lblAdelante);
		
		rdbtnAm = new JButton("AM");
		buttonGroup.add(rdbtnAm);
		rdbtnAm.setBounds(315, 89, 71, 25);
		frame.getContentPane().add(rdbtnAm);
		
		rdbtnFm = new JButton("FM");
		buttonGroup.add(rdbtnFm);
		rdbtnFm.setBounds(315, 134, 71, 25);
		frame.getContentPane().add(rdbtnFm);
		
		btnGuardarEstacion = new JButton("Guardar Estacion");
		btnGuardarEstacion.setBounds(226, 258, 160, 59);
		frame.getContentPane().add(btnGuardarEstacion);
		
		txtEstacion = new JTextField();
		txtEstacion.setBounds(13, 25, 373, 40);
		frame.getContentPane().add(txtEstacion);
		txtEstacion.setColumns(10);
		
		//Action listeners
		boton1.addActionListener(new Listener());
		boton2.addActionListener(new Listener());
		boton3.addActionListener(new Listener());
		boton4.addActionListener(new Listener());
		boton5.addActionListener(new Listener());
		boton6.addActionListener(new Listener());
		boton7.addActionListener(new Listener());
		boton8.addActionListener(new Listener());
		boton9.addActionListener(new Listener());
		boton10.addActionListener(new Listener());
		boton11.addActionListener(new Listener());
		boton12.addActionListener(new Listener());
		btnNewButton.addActionListener(new Listener());
		btnApagar.addActionListener(new Listener());
		button.addActionListener(new Listener());
		button_1.addActionListener(new Listener());
		rdbtnFm.addActionListener(new Listener());
		rdbtnAm.addActionListener(new Listener());
		btnGuardarEstacion.addActionListener(new Listener());
		
		this.enableAll(false);
		
	}
	
	public void enableAll(boolean enable) {
		boton1.setEnabled(enable);
		boton2.setEnabled(enable);
		boton3.setEnabled(enable);
		boton4.setEnabled(enable);
		boton5.setEnabled(enable);
		boton6.setEnabled(enable);
		boton7.setEnabled(enable);
		boton8.setEnabled(enable);
		boton9.setEnabled(enable);
		boton10.setEnabled(enable);
		boton11.setEnabled(enable);
		boton12.setEnabled(enable);
		btnApagar.setEnabled(enable);
		button.setEnabled(enable);
		button_1.setEnabled(enable);
		rdbtnFm.setEnabled(enable);
		rdbtnAm.setEnabled(enable);
		btnGuardarEstacion.setEnabled(enable);
	}
	
	public int dialogBox() {
        
        String pos = JOptionPane.showInputDialog(frame, "Ingrese posicion a guardar estacion (1 a 12):", null); 
        return Integer.parseInt(pos);
	}
	
	private class Listener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource().equals(btnNewButton)) {
				radio.prender();
				enableAll(true);
				btnNewButton.setEnabled(false);
				txtEstacion.setText("Estacion: " + radio.mostrarEstacion());
				rdbtnAm.setSelected(true);
			}else if(e.getSource().equals(btnApagar)) {
				radio.apagar();
				enableAll(false);
				txtEstacion.setText("");
				btnNewButton.setEnabled(true);
			} else if(e.getSource().equals(button)) {
				txtEstacion.setText("Estacion: " + radio.frecAdelante());
			} else if(e.getSource().equals(button_1)) {
				txtEstacion.setText("Estacion: " + radio.frecAtras());
			}else if(e.getSource().equals(rdbtnAm)) {
				radio.cambioFrecuencia();
				txtEstacion.setText("Estacion: " + radio.mostrarEstacion());
			}else if(e.getSource().equals(rdbtnFm)) {
				radio.cambioFrecuencia();
				txtEstacion.setText("Estacion: " + radio.mostrarEstacion());
			}else if(e.getSource().equals(btnGuardarEstacion)) {
				radio.guardarFrec(Float.parseFloat(radio.mostrarEstacion()), dialogBox());
			}else if(e.getSource().equals(boton1)) {
				txtEstacion.setText("Estacion:" + radio.mostrarEstacionBoton(1));
			}else if(e.getSource().equals(boton2)) {
		        txtEstacion.setText("Estacion:" + radio.mostrarEstacionBoton(2));
			}
			else if(e.getSource().equals(boton3)) {
			        txtEstacion.setText("Estacion:" + radio.mostrarEstacionBoton(3));
			}
			else if(e.getSource().equals(boton4)) {
			        txtEstacion.setText("Estacion:" + radio.mostrarEstacionBoton(4));
			}
			else if(e.getSource().equals(boton5)) {
			        txtEstacion.setText("Estacion:" + radio.mostrarEstacionBoton(5));
			}
			else if(e.getSource().equals(boton6)) {
			        txtEstacion.setText("Estacion:" + radio.mostrarEstacionBoton(6));
			}
			else if(e.getSource().equals(boton7)) {
			        txtEstacion.setText("Estacion:" + radio.mostrarEstacionBoton(7));
			}
			else if(e.getSource().equals(boton8)) {
			        txtEstacion.setText("Estacion:" + radio.mostrarEstacionBoton(8));
			}
			else if(e.getSource().equals(boton9)) {
			        txtEstacion.setText("Estacion:" + radio.mostrarEstacionBoton(9));
			}
			else if(e.getSource().equals(boton10)) {
			        txtEstacion.setText("Estacion:" + radio.mostrarEstacionBoton(10));
			}
			else if(e.getSource().equals(boton11)) {
			        txtEstacion.setText("Estacion:" + radio.mostrarEstacionBoton(11));
			}
			else if(e.getSource().equals(boton12)) {
			        txtEstacion.setText("Estacion:" + radio.mostrarEstacionBoton(12));
			}
			
		}
	}
		
	}
