import javax.swing.JOptionPane;

public class Exercicio02 {

	public static void main(String[] args) {
		int[] idades = new int[7];
		for(int i = 0; i < 7; i++){
			idades[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade"));
		}
		
		for(int i = 0; i < idades.length; i++){
			
		
			JOptionPane.showMessageDialog(null, 
					(i+1) + ".Idade: " + idades[i]);
		}
		
	}

}
