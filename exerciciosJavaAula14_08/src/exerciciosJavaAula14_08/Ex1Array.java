package exerciciosJavaAula14_08;

import java.util.ArrayList;

import javax.swing.JOptionPane;

///	Arraylist <tipo> identificador = new arraylist<>();
//adição identificador.add()
//exclusão identificador.remove(indice);
//acesso identificador.get(indice);
//tamanho do array identificador.size();


public class Ex1Array {
	
	public static void main(String[] args) {
		
		ArrayList <String> al = new ArrayList<>();
		
		for(int i =0; i<5;i++) {
			
			al.add(JOptionPane.showInputDialog("Digite um nome: "));
			
		}
		
		for(int cont = 0; cont <al.size( );cont ++) {
			
			JOptionPane.showMessageDialog(null, al.get(cont));
		}
		
	}

}
