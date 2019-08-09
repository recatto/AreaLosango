package pkg;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		int diagonalMaior, diagonalMenor, area, verificador;

		diagonalMaior = Integer.parseInt(JOptionPane.showInputDialog("Insira o tamanho da diagonal Maior"));
		verificador = Integer.parseInt(JOptionPane.showInputDialog("Insira o tamanho da diagonal Menor"));
		if (diagonalMaior > verificador) {
			diagonalMenor = verificador;
		} else {
			JOptionPane.showMessageDialog(null, "Variáveis serão invertidas...", null, JOptionPane.WARNING_MESSAGE);
			diagonalMenor = diagonalMaior;
			diagonalMaior = verificador;
		}

		area = (diagonalMaior * diagonalMenor) / 2;

		JOptionPane.showMessageDialog(null, "A área é: " + area + " cm²");

	}

}
