package exerciciosJavaAula14_08;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Ex02Array {
 
	public static void main(String[] args) {
		
		ArrayList<Cliente> clientes = new ArrayList<>();
		
		Cliente c = new Cliente();
		c.setNome("Joao");
		c.setSalario(5000);
		clientes.add(c);
		
		Cliente c2 = new Cliente();
		c2.setNome("Maria");
		c2.setSalario(10000);
		clientes.add(c2);
		
		JOptionPane.showMessageDialog(null, clientes.get(0).getNome());
		
		if(clientes.get(0).getSalario() > clientes.get(1).getSalario()){
			
			JOptionPane.showMessageDialog(null, clientes.get(0).getNome() + " possui o maior salário");
		}else if(clientes.get(1).getSalario() > clientes.get(0).getSalario()) {
			JOptionPane.showMessageDialog(null, clientes.get(1).getNome() + " possui o maior salário");
		}else {
			JOptionPane.showMessageDialog(null,"Os salarios são iguais");
		}
	}
}
