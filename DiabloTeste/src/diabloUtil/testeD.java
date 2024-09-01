package diabloUtil;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class testeD {

    private double totalGold;
    private double totalCritDamage;

    public testeD() {
        this.totalCritDamage = 0.0;
        this.totalGold = 0.0;
    }

    public static void main(String[] args) {
        testeD calculator = new testeD();

        ImageIcon icon = new ImageIcon(testeD.class.getResource("/diablo.png"));
        String[] options = {"Somar Gold", "Saber total de dano crítico", "Sair"};

        while (true) {
            int escolha = JOptionPane.showOptionDialog(null, "O que você gostaria de escolher: ", "Escolha uma opção", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, icon, options, options[0]);

            if (escolha == 0) {
                calculator.manipularGold();
            } else if (escolha == 1) {
                calculator.manipularDanoCritico();
            } else if (escolha == 2) {
                JOptionPane.showMessageDialog(null, "Saindo do programa, obrigado!");
                System.exit(0);
            } else {
                JOptionPane.showMessageDialog(null, "Nenhuma opção selecionada. Saindo...");
                System.exit(0);
            }
        }
    }

    public void manipularGold() {
        boolean continuar = true;

        while (continuar) {
            String goldInput = JOptionPane.showInputDialog(null, "Digite a quantidade de gold:", "Entrada de Gold", JOptionPane.QUESTION_MESSAGE);

            if (goldInput == null) {
                continuar = false;
                continue;
            }

            double gold = 0;

            try {
                gold = Double.parseDouble(goldInput);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Entrada de GOLD inválida, Digite um número válido.");
                continue;
            }

            ImageIcon icon = new ImageIcon(testeD.class.getResource("/diablo.png"));
            String[] options = {"Somar +", "Subtrair -", "Resultado", "Sair"};
            int escolha = JOptionPane.showOptionDialog(null, "Você inseriu: " + formatNumber(gold) + "\nEscolha a operação\nTotal Atual: " + formatNumber(totalGold), "Operação de GOLD", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, icon, options, options[0]);

            if (escolha == 0) {
                this.totalGold += gold;
                JOptionPane.showMessageDialog(null, "Somado! Novo total de gold: " + formatNumber(totalGold));
            } else if (escolha == 1) {
                this.totalGold -= gold;
                JOptionPane.showMessageDialog(null, "Subtraído! Novo total de gold: " + formatNumber(totalGold));
            } else if (escolha == 2) {
                JOptionPane.showMessageDialog(null, "O total final de gold é: " + formatNumber(totalGold));
            } else if (escolha == 3) {
                System.exit(0);
            } else {
                JOptionPane.showMessageDialog(null, "Operação inválida.");
            }
        }
    }

    public void manipularDanoCritico() {
        boolean continuar = true;

        while (continuar) {
            String critInput = JOptionPane.showInputDialog(null, "Digite a quantidade de dano CRÍTICO:", "Entrada de DANO", JOptionPane.QUESTION_MESSAGE);

            if (critInput == null) {
                continuar = false;
                continue;
            }

            double dano = 0;

            try {
                dano = Double.parseDouble(critInput);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Entrada de CRIT DAMAGE inválida, Digite um número válido.");
                continue;
            }

            ImageIcon icon = new ImageIcon(testeD.class.getResource("/diablo.png"));
            String[] options = {"Somar +", "Subtrair -", "Resultado", "Sair"};
            int escolha = JOptionPane.showOptionDialog(null, "Você inseriu: " + formatNumber(dano) + "\nEscolha a operação\nTotal Atual: " + formatNumber(totalCritDamage), "Operação de CRIT DAMAGE", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, icon, options, options[0]);

            if (escolha == 0) {
                this.totalCritDamage += dano;
            } else if (escolha == 1) {
                this.totalCritDamage -= dano;
            } else if (escolha == 2) {
                JOptionPane.showMessageDialog(null, "O total final de dano CRÍTICO é: " + formatNumber(totalCritDamage));
            } else if (escolha == 3) {
                System.exit(0);
            } else {
                JOptionPane.showMessageDialog(null, "Operação inválida.");
            }
        }
    }

    // Método para formatar números em unidades de mil, milhão e bilhão
    private String formatNumber(double number) {
        if (number >= 1_000_000_000) {
            return String.format("%.2f Bilhões", number / 1_000_000_000);
        } else if (number >= 1_000_000) {
            return String.format("%.2f Milhões", number / 1_000_000);
        } else if (number >= 1_000) {
            return String.format("%.2f Mil", number / 1_000);
        } else {
            return String.format("%.2f", number);
        }
    }
}
