
import javax.swing.JOptionPane;

public class Exercicio03 {

    public static void main(String[] args) {
        String x = JOptionPane.showInputDialog("Digite um numero:");
        int xd = Integer.parseInt(x);

        boolean verificaNumero = (xd % 2) == 0;
        JOptionPane.showMessageDialog(null, verificaNumero);

    }
}
