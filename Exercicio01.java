import javax.swing.JOptionPane;          
public class Exercicio01 {

	public static void main(String[] args) {
		String[] nomes = new String[25];
		for(int n = 0; n < 25; n++){
			nomes[n]= JOptionPane.showInputDialog("Digite o nome que deseja cadastrar");
			
		}

	}

}
