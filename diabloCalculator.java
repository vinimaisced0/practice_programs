package diabloUtil;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
public class diabloCalculator {

	private double totalGold;
	private double totalCritDamage;
	

	public diabloCalculator() {
	this.totalCritDamage = 0.0;
	this.totalGold = 0.0;
	
	
}
	
	
	public static void main(String[] args) {
		
		diabloCalculator calculator = new diabloCalculator();
		
		ImageIcon icon = new ImageIcon(testeD.class.getResource("/diablo.png"));
		String[] options = {"Somar Gold", "Saber total de dano critíco", "Sair"};		

		while (true) {
		int escolha = JOptionPane.showOptionDialog(null, "O que você gostaria de escolher: ", "Escolha uma opção", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,icon, options, options[0]);
		
		if(escolha == 0) {
			calculator.manipularGold();
		} else if (escolha == 1) {
			calculator.manipularDanoCritico();
		} else if (escolha == 2) {
			JOptionPane.showInternalMessageDialog(null, "Saindo do programa, obrigado!");
			System.exit(0);
		} else {
			JOptionPane.showInternalMessageDialog(null, "Nenhuma opção selecionada. Saindo...");
			System.exit(0);
		}
		}
}	
	

	public void manipularGold() {
			
		boolean continuar = true;

		while (continuar) {
			
			String goldInput = JOptionPane.showInputDialog(null, "Digite a quantidade de gold:", "Entrada de Gold", JOptionPane.QUESTION_MESSAGE);
			
			if (goldInput == null) {
				continuar = false; // para o user cancelar, clicar em "cancelar".
					continue;
			}
			
				
				double gold = 0;
				
				try {
				gold = Double.parseDouble(goldInput);
				}  catch (NumberFormatException e) {
					JOptionPane.showMessageDialog(null, "Entrada de GOLD inválida, Digite um número válido.");
				}
				ImageIcon icon = new ImageIcon(testeD.class.getResource("/diablo.png"));
					String[] options = {"Somar +", "Subtrair -", "Resultado", "Sair"};
					int escolha = JOptionPane.showOptionDialog(null, "Você inseriu: " + gold + "\nEscolha a operação\nTotal Atual: " + totalGold, "Operação de GOLD", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, icon, options, options[0]);
					//int escolha = JOptionPane.showOptionDialog(null, "Escolha a operação", "Operação de GOLD", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, icon, options, options[0]);
					
				
				if (escolha == 0) {
		            this.totalGold += gold;
		            JOptionPane.showMessageDialog(null, "Somado! Novo total de gold: " + totalGold);
		        } else if (escolha == 1) {
		            this.totalGold -= gold;
		            JOptionPane.showMessageDialog(null, "Subtraído! Novo total de gold: " + totalGold);
		        } else if (escolha == 2) {
		        	JOptionPane.showMessageDialog(null, "O total final de gold é: " + totalGold);
		        } else if (escolha == 3) {
		            System.exit(0);
		        } else {
		        	JOptionPane.showMessageDialog(null, "Operação inválida boydoido");

		        }								
	    }
		
     }


	public void manipularDanoCritico() {
		
		boolean continuar = true;

		while (continuar) {
			
			String critInput = JOptionPane.showInputDialog(null, "Digite a quantidade de dano CRÍTICO:", "Entrada de DANO", JOptionPane.QUESTION_MESSAGE);
			
			if (critInput == null) {
				continuar = false; // para o user cancelar, clicar em "cancelar".
					continue;
			}
			
				
				double dano = 0;
				
				try {
				dano = Double.parseDouble(critInput);
				}  catch (NumberFormatException e) {
					JOptionPane.showMessageDialog(null, "Entrada de CRIT DAMAGE inválida, Digite um número válido.");
				}
					ImageIcon icon = new ImageIcon("diablo.png");
					String[] options = {"Somar +", "Subtrair -", "Resultado","Sair"};
					int escolha = JOptionPane.showOptionDialog(null, "Você inseriu: " + dano + "\nEscolha a operação\nTotal Atual: " + totalCritDamage, "Operação de CRIT DAMAGE", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, icon, options, options[0]);
					//int escolha = JOptionPane.showOptionDialog(null, "Escolha a operação", "Operação de CRIT DAMAGE", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, icon, options, options[0]);
				
				
				if (escolha == 0) {
		            this.totalCritDamage += dano;
		        } else if (escolha == 1) {
		            this.totalCritDamage -= dano;
		        } else if(escolha == 2) {
		    		JOptionPane.showMessageDialog(null, "O total final de dano CRÍTICO é: " + totalCritDamage);
		        } else if (escolha == 3) {
		            System.exit(0);
		        } else {
		        	JOptionPane.showMessageDialog(null, "Operação inválida boydoido");

		        }								
	    }
		
     }
		
}	