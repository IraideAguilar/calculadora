import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calculadora extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldPantaila;
    
	boolean esDecimal = false;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculadora frame = new Calculadora();
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
	public Calculadora() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300, 400, 300, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JButton button1 = new JButton("1");
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				button1.getText();
				textFieldPantaila.setText(textFieldPantaila.getText() + button1.getText());
			}
		});
		
		JButton button2 = new JButton("2");
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textFieldPantaila.setText(textFieldPantaila.getText() + button2.getText());
			}
		});
		
		JButton button3 = new JButton("3");
		button3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textFieldPantaila.setText(textFieldPantaila.getText() + button3.getText());
			}
		});
		
		JButton butonsuma = new JButton("+");
		butonsuma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textFieldPantalla.setText()
			}
		});
		
		JButton button5 = new JButton("5");
		button5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textFieldPantaila.setText(textFieldPantaila.getText() + button5.getText());
			}
		});
		
		JButton button6 = new JButton("6");
		button6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textFieldPantaila.setText(textFieldPantaila.getText() + button6.getText());
			}
		});
		
		JButton buttonresta = new JButton("-");
		buttonresta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JButton button4 = new JButton("4");
		button4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textFieldPantaila.setText(textFieldPantaila.getText() + button4.getText());
			}
		});
		
		JButton button7 = new JButton("7");
		button7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textFieldPantaila.setText(textFieldPantaila.getText() + button7.getText());
			}
		});
		
		JButton button8 = new JButton("8");
		button8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textFieldPantaila.setText(textFieldPantaila.getText() + button8.getText());
			}
		});
		
		JButton button9 = new JButton("9");
		button9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textFieldPantaila.setText(textFieldPantaila.getText() + button9.getText());
			}
		});
		
		JButton buttonmultiplicacion = new JButton("*");
		buttonmultiplicacion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JButton button0 = new JButton("0");
		button0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textFieldPantaila.setText(textFieldPantaila.getText() + button0.getText());
			}
		});
		
		JButton buttoncoma = new JButton(".");
		buttoncoma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!esDecimal){
					textFieldPantaila.setText(textFieldPantaila.getText() + buttoncoma.getText());
					esDecimal = true;
				}
			}
		});
		
		JButton butonc = new JButton("C");
		butonc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JButton buttondividir = new JButton("/");
		buttondividir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JButton buttonsumaresta = new JButton("+/-");
		buttonsumaresta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JButton buttonigual = new JButton("=");
		buttonigual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		textFieldPantaila = new JTextField();
		textFieldPantaila.setColumns(10);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(textFieldPantaila, GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
							.addContainerGap())
						.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(button0, GroupLayout.PREFERRED_SIZE, 65, Short.MAX_VALUE)
								.addComponent(button7, 0, 0, Short.MAX_VALUE)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
									.addComponent(button4, 0, 0, Short.MAX_VALUE)
									.addComponent(button1, GroupLayout.PREFERRED_SIZE, 64, Short.MAX_VALUE)))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(buttoncoma, GroupLayout.PREFERRED_SIZE, 59, Short.MAX_VALUE)
								.addComponent(button8, GroupLayout.PREFERRED_SIZE, 59, Short.MAX_VALUE)
								.addComponent(button5, 0, 0, Short.MAX_VALUE)
								.addComponent(button2, GroupLayout.PREFERRED_SIZE, 59, Short.MAX_VALUE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(butonc, GroupLayout.PREFERRED_SIZE, 57, Short.MAX_VALUE)
								.addComponent(button9, 0, 0, Short.MAX_VALUE)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
									.addComponent(button6, 0, 0, Short.MAX_VALUE)
									.addComponent(button3, GroupLayout.PREFERRED_SIZE, 56, Short.MAX_VALUE)))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(buttondividir, 0, 0, Short.MAX_VALUE)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
									.addComponent(buttonresta, 0, 0, Short.MAX_VALUE)
									.addComponent(butonsuma, GroupLayout.PREFERRED_SIZE, 61, Short.MAX_VALUE)
									.addComponent(buttonmultiplicacion, 0, 0, Short.MAX_VALUE)))
							.addGap(10))
						.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
							.addComponent(buttonsumaresta, GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(buttonigual, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE)
							.addContainerGap())))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(textFieldPantaila, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(butonsuma, GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
						.addComponent(button3, GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
						.addComponent(button2, GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
						.addComponent(button1, GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(button5, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
						.addComponent(button6, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
						.addComponent(buttonresta, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
						.addComponent(button4, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(button7, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
						.addComponent(button8, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
						.addComponent(button9, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
						.addComponent(buttonmultiplicacion, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
						.addComponent(buttondividir, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
							.addComponent(buttoncoma, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
							.addComponent(butonc, GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE))
						.addComponent(button0, GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE))
					.addGap(18, 30, Short.MAX_VALUE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(buttonsumaresta, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
						.addComponent(buttonigual, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE))
					.addGap(3))
		);
		contentPane.setLayout(gl_contentPane);
	}
}