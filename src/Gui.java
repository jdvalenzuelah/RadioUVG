import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;

public class Gui {

	private JFrame frame;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();

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
		frame = new JFrame();
		frame.setBounds(100, 100, 410, 547);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton boton1 = new JButton("Boton 1");
		boton1.setBounds(53, 182, 97, 25);
		frame.getContentPane().add(boton1);
		
		JButton boton2 = new JButton("boton 2");
		boton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		boton2.setBounds(162, 182, 97, 25);
		frame.getContentPane().add(boton2);
		
		JButton boton3 = new JButton("boton 3");
		boton3.setBounds(53, 220, 97, 25);
		frame.getContentPane().add(boton3);
		
		JButton boton4 = new JButton("boton 4");
		boton4.setBounds(162, 220, 97, 25);
		frame.getContentPane().add(boton4);
		
		JButton boton5 = new JButton("boton 5");
		boton5.setBounds(53, 258, 97, 25);
		frame.getContentPane().add(boton5);
		
		JButton boton6 = new JButton("boton 6");
		boton6.setBounds(162, 258, 97, 25);
		frame.getContentPane().add(boton6);
		
		JButton boton7 = new JButton("boton 7");
		boton7.setBounds(53, 296, 97, 25);
		frame.getContentPane().add(boton7);
		
		JButton boton8 = new JButton("boton 8");
		boton8.setBounds(162, 296, 97, 25);
		frame.getContentPane().add(boton8);
		
		JButton boton9 = new JButton("boton 9");
		boton9.setBounds(53, 334, 97, 25);
		frame.getContentPane().add(boton9);
		
		JButton boton10 = new JButton("boton 10");
		boton10.setBounds(162, 334, 97, 25);
		frame.getContentPane().add(boton10);
		
		JButton boton11 = new JButton("boton 11");
		boton11.setBounds(53, 372, 97, 25);
		frame.getContentPane().add(boton11);
		
		JButton boton12 = new JButton("boton 12");
		boton12.setBounds(162, 372, 97, 25);
		frame.getContentPane().add(boton12);
		
		JButton btnNewButton = new JButton("prender");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(188, 426, 112, 40);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnApagar = new JButton("apagar");
		btnApagar.setBounds(12, 426, 112, 40);
		frame.getContentPane().add(btnApagar);
		
		JButton button = new JButton(">>>");
		button.setBounds(162, 108, 138, 40);
		frame.getContentPane().add(button);
		
		JButton button_1 = new JButton("<<<");
		button_1.setBounds(12, 108, 138, 40);
		frame.getContentPane().add(button_1);
		
		JLabel lblAtras = new JLabel("Atras");
		lblAtras.setBounds(63, 89, 56, 16);
		frame.getContentPane().add(lblAtras);
		
		JLabel lblAdelante = new JLabel("Adelante");
		lblAdelante.setBounds(203, 89, 56, 16);
		frame.getContentPane().add(lblAdelante);
		
		JRadioButton rdbtnAm = new JRadioButton("AM");
		buttonGroup.add(rdbtnAm);
		rdbtnAm.setBounds(326, 85, 127, 25);
		frame.getContentPane().add(rdbtnAm);
		
		JRadioButton rdbtnFm = new JRadioButton("FM");
		buttonGroup.add(rdbtnFm);
		rdbtnFm.setBounds(326, 116, 127, 25);
		frame.getContentPane().add(rdbtnFm);
	}
}
