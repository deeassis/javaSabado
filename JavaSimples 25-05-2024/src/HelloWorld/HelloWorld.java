package HelloWorld;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import basic.Sistema;

public class HelloWorld implements ActionListener {

	private JTextField campoNome;
	private JTextField campoIdade;
	private JLabel labelResultado;

	public static void main(String[] args) {

		new HelloWorld();

	}

	public HelloWorld() {

		JFrame frame = new JFrame("Bebida Sujestiva");
		frame.setSize(500, 400);

		JPanel panel = new JPanel();

		panel.setLayout(new GridLayout(3, 2, 10, 10));

		JLabel labelNome = new JLabel("Digite seu nome: ");
		campoNome = new JTextField();

		JLabel labelIdade = new JLabel("Digite a sua idade: ");
		campoIdade = new JTextField();

		JButton Sujerir = new JButton("Sujerir Bebida");
		Sujerir.addActionListener(this);

		labelResultado = new JLabel("Bebida sujerida: ");

		panel.add(labelNome);
		panel.add(campoNome);
		panel.add(new JLabel(""));
		panel.add(labelIdade);
		panel.add(campoIdade);
		panel.add(new JLabel(""));
		panel.add(Sujerir);
		panel.add(new JLabel(""));
		panel.add(labelResultado);

		frame.add(panel);

		frame.setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("Sujerir Bebida")) {
			try {
				String nome = campoNome.getText();
				int idade = Integer.parseInt(campoIdade.getText());
				String bebidaSugerida = resultadoIM(idade);
				labelResultado.setText(nome + ", a bebida sugerida para você é: " + bebidaSugerida);
			} catch (NumberFormatException ex) {
				labelResultado.setText("Idade inválida. Por favor, insira um número válido.");

			}
		}
	}

	public static String resultadoIM(double campoIdade) {

		if (campoIdade >= 18) {
			return ("Toddy");
		} else
			return ("Dolly");

	}

}
