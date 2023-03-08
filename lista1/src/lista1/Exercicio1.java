package lista1;

import javax.swing.JOptionPane;

public class Exercicio1 {
	
	public static void totalPagamento(Double precoLitro, Integer quantidadeLitro) {
		double result = precoLitro*quantidadeLitro;
		JOptionPane.showMessageDialog(null, "Preço total: R$"+ result);
	}
	
	public static void main(String[] args) {
		Double precoLitro = 0.0;
		Integer quantidadeLitro = 0;
		
		String showInputDialog = JOptionPane.showInputDialog("Insira o preço por litro");

		if(showInputDialog.isEmpty()){
			JOptionPane.showMessageDialog(null, "Nada foi inserido.");
		}
		else{
			precoLitro = Double.valueOf(showInputDialog);
		}

		String showInputDialog2 = JOptionPane.showInputDialog("Insira o número de litros");
		
		if(showInputDialog2.isEmpty()){
			JOptionPane.showMessageDialog(null, "Nada foi inserido.");
		}
		else{
			quantidadeLitro = Integer.valueOf(showInputDialog2);
		}
		
		totalPagamento(precoLitro, quantidadeLitro);
	}

}
