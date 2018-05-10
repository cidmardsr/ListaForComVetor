import javax.swing.JOptionPane;

public class Exercicio03 {

	public static void main(String[] args) {
		int quantidade = Integer.parseInt(
			JOptionPane.showInputDialog(
				"Informe a quantidade de preços que deseja cadastar"
			));
		double total = 0;
		double[] precos = new double[quantidade];
		for(int p = 0; p < precos.length; p++){
			precos[p] = Double.parseDouble(
			JOptionPane.showInputDialog(
				"Digite o preço que deseja cadastrar"
			));
			total += precos[p];
			JOptionPane.showMessageDialog(null, 
				"Preço: R$" + precos[p]);		
		}
		JOptionPane.showMessageDialog(null, "Preço total: R$" + total);
	}

}
