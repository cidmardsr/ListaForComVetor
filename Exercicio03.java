import javax.swing.JOptionPane;

public class Exercicio03 {

	public static void main(String[] args) {
		int quantidade = Integer.parseInt(
			JOptionPane.showInputDialog(
				"Informe a quantidade de pre�os que deseja cadastar"
			));
		double total = 0;
		double[] precos = new double[quantidade];
		for(int p = 0; p < precos.length; p++){
			precos[p] = Double.parseDouble(
			JOptionPane.showInputDialog(
				"Digite o pre�o que deseja cadastrar"
			));
			total += precos[p];
			JOptionPane.showMessageDialog(null, 
				"Pre�o: R$" + precos[p]);		
		}
		JOptionPane.showMessageDialog(null, "Pre�o total: R$" + total);
	}

}
