import javax.swing.JOptionPane;

public class Vetor1 {
	
	public static void main(String[] args) {
		int vetor [] = new int[6];
		
		for(int cont =0; cont<6; cont ++) {
			vetor[cont] = Integer.parseInt(JOptionPane.showInputDialog("Digite: "));
		}
		
		for(int cont =0; cont<6; cont ++) {
			if(vetor[cont] %2==0) {
				
				System.out.println(vetor[cont]);
			}
		}
		
	}

}
