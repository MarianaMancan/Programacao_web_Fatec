import javax.swing.JOptionPane;

public class Vetor2 {

	public static void main(String[] args) {

		int vetor[] = new int[10];
		int vetor2[] = new int[10];

		for (int count = 0; count < 10; count++) {
			
			vetor[count] = Integer.parseInt(JOptionPane.showInputDialog("Digite: "));

			int j = 9 - count;
			vetor2[j] = vetor[count];

		}
		for (int count = 0; count < 10; count++) {
			System.out.print(vetor2[count]);

		}

	}

}
