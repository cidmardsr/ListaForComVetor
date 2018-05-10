import javax.swing.JOptionPane;

public class Exercicio04 {

	public static void main(String[] args) {
		String tamanho = "";
		String[] camisas = new String[5];
		for(int c = 0; c < 5; c++){
			camisas[c] = JOptionPane.showInputDialog("Informe o tamanho das camisas que deseja cadastrar");
			
			
		}
		for(int i = 0; i < camisas.length; i++){
			if(camisas[i].equalsIgnoreCase("P")){
				 tamanho = "P";
			}else if(camisas[i].equalsIgnoreCase("PP")){
				 tamanho = "PP";
			}else if(camisas[i].equalsIgnoreCase("M")){
				tamanho = "M";
			}
		}

	}

}
