
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Exercicio02 {

    public static void main(String[] args) {

        //boolean verificaNumero = (1 % 2) == 0;
        //System.out.println(verificaNumero);
        Scanner s = new Scanner(System.in);

        String faturamentoFormat;
        String valorPagoFormat;
        double faturamento = 0;
        double valorPago = 0;
        double aliquota = 0;

        faturamentoFormat = JOptionPane.showInputDialog("Entre com o faturamento da empresa:");

        /*  d = apenas digitos
        + = um ou mais digitos
        . = obrigatoriamente um '.' seguido de varios digitos
        d{2} = somente dois digitos
        \\ serve pra mostrar uma busca regular
         */
        boolean checkFormatText = faturamentoFormat.matches("\\d+\\.\\d{2}");

        while (checkFormatText == false) {
            JOptionPane.showMessageDialog(null, "Digite o valor no formato 12345.00");
            faturamentoFormat = JOptionPane.showInputDialog("Entre com o faturamento da empresa:");
            checkFormatText = faturamentoFormat.matches("\\d+\\.\\d{2}");
        }

        faturamento = Double.parseDouble(faturamentoFormat);
        // TABELA IRPF 2017 http://impostorenda2017.com.br/wp-content/uploads/2016/05/19198091.jpg
        if (faturamento <= 1903.98) {
            faturamento -= 0;			 //ISENTADO
        } else if (faturamento >= 1903.99 && faturamento <= 2826.65) {
            faturamento -= 142.8;		 // ALIQUOTA = 7,5
            aliquota = 7.5f;
        } else if (faturamento >= 2826.66 && faturamento <= 3751.05) {
            faturamento -= 354.8; 		//ALIQUIOTA = 15
            aliquota = 15.0f;
        } else if (faturamento >= 3751.06 && faturamento <= 4664.68) {
            faturamento -= 636.13;		 //ALIQUOTA 22,5
            aliquota = 22.5f;
        } else {
            //FATURAMENTO MAIOR QUE 4,700.00
            faturamento -= 869.36; //ALIQUOTA 27,5
            aliquota = 27.5f;
        }

        valorPagoFormat = JOptionPane.showInputDialog("Entre com o faturamento da empresa:");

        checkFormatText = valorPagoFormat.matches("\\d+\\.\\d{2}");

        while (checkFormatText == false) {
            JOptionPane.showMessageDialog(null, "Digite o valor no formato 12345.00");
            valorPagoFormat = JOptionPane.showInputDialog("Entre com o faturamento da empresa:");
            checkFormatText = valorPagoFormat.matches("\\d+\\.\\d{2}");
        }

        valorPago = Double.parseDouble(valorPagoFormat);

        JOptionPane.showMessageDialog(null, "Fatura do mes " + faturamento
                + "\nValor pago e de " + valorPago
                + "\nO percentual gasto com os impostos foi de " + aliquota);

    }
}
