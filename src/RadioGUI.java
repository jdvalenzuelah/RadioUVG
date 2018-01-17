import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.BoxLayout;
import javax.swing.JButton;

public class RadioGUI {

	private JFrame frame;
	private JButton btnAnterior;
	private JButton button;
	private JLabel lblEstacionActual;
	private JButton btnEncender;
	private JLabel lblFrecuencia;
	private InterfazRadio radio = new Radio();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RadioGUI window = new RadioGUI();
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
	public RadioGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 991, 625);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		btnAnterior = new JButton("< Anterior");
		btnAnterior.setBounds(282, 480, 178, 53);
		btnAnterior.addActionListener(new Listener());
		frame.getContentPane().add(btnAnterior);
		
		button = new JButton("Siguiente >");
		button.setBounds(471, 480, 178, 53);
		button.addActionListener(new Listener());
		frame.getContentPane().add(button);
		
		lblEstacionActual = new JLabel("EstacionActual");
		lblEstacionActual.setBounds(292, 268, 490, 189);
		frame.getContentPane().add(lblEstacionActual);
		lblEstacionActual.setFont(new Font("Tahoma", Font.PLAIN, 90));
		
		lblFrecuencia = new JLabel("Frecuencia");
		lblFrecuencia.setBounds(305, 213, 283, 73);
		frame.getContentPane().add(lblFrecuencia);
		lblFrecuencia.setFont(new Font("Tahoma", Font.PLAIN, 60));
		
		btnEncender = new JButton("Encender");
		btnEncender.setBounds(404, 182, 85, 21);
		btnEncender.addActionListener(new Listener());
		frame.getContentPane().add(btnEncender);

	}
	
	private class Listener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent evento) {
			if(evento.getSource().equals(btnEncender)) {
				radio.prender();
				lblFrecuencia.setText(radio.cambioFrecuencia());
				lblEstacionActual.setText(radio.mostrarEstacion());
			}else if(evento.getSource().equals(btnAnterior)) {
				lblEstacionActual.setText(radio.frecAtras());
			}
			
		}
		
	}
}
