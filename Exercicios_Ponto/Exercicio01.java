import javax.swing.JOptionPane;

public class Exercicio01 {

    public static void main(String[] args) {
        String distancia = JOptionPane.showInputDialog("Digite a distancia percorrida em quilometro:");
        double distantiad = Double.parseDouble(distancia);

        String minutos = JOptionPane.showInputDialog("Digite o tempo em minutos");
        double minutosd = Double.parseDouble(minutos);

        double hora = minutosd / 60;
        double velocidade = distantiad / hora;

        JOptionPane.showMessageDialog(null, velocidade);
    }
}
