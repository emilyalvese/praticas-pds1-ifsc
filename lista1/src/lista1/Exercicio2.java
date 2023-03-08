package lista1;

import javax.swing.JOptionPane;
import java.util.ArrayList;

public class Exercicio2 {

	public static void main(String[] args) {=
		ArrayList<String> lista = new ArrayList<String>();
		
		for(int i=0; i<10; i++){
			String elemento = JOptionPane.showInputDialog("Insira uma informação: ");
			lista.add(elemento);
		}
						
		JOptionPane.showMessageDialog(null, lista);
	}

}
