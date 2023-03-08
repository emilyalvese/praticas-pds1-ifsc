package lista1;

import javax.swing.JOptionPane;

public class Exercicio3 {

	public static void main(String[] args) {
    Double N1 = 0.0;
    Double N2 = 0.0;
		Double N3 = 0.0;
		
		String Nt1 = JOptionPane.showInputDialog("Insira a primeira nota do discente: ");
		String Nt2 = JOptionPane.showInputDialog("Insira a segunda nota do discente: ");
		String Nt3 = JOptionPane.showInputDialog("Insira a terceira nota do discente: ");
		
		N1 = Double.valueOf(Nt1);
		N2 = Double.valueOf(Nt2);
		N3 = Double.valueOf(Nt3);
		
		M(n1, n2, n3);
	}
	
	public static void M(Double N1, Double N2, Double N3){
		Double MF = (N1+N2+N3)/3;
		
		if(MF>=6){
			JOptionPane.showMessageDialog(null, "Discente aprovado com média final: " + MF);
		}
		if(MF<6){
			JOptionPane.showMessageDialog(null, "Discente em recuperação devido a média final:" + MF);
		}
		if(MF<4){
			JOptionPane.showMessageDialog(null, "Discente reprovado devido a média final: " + MF);
		}
    
	}

}
