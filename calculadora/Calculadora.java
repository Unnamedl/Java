package calculadora;

import java.util.Scanner;
import java.util.regex.*;

public class Calculadora {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("# Calculadora v0.1 #"
                + "\n0 - Fechar"
                + "\n1 - Adição"
                + "\n2 - Subtração"
                + "\n3 - Multiplicação"
                + "\n4 - Divisão");
        Calculador ad = new Calculador();

        int escolha = scanner.nextInt();
        if (escolha == 1) { // Adição
            ad.Calcular();
            double numero1D = ad.numero1D;
            double numero2D = ad.numero2D;
            double total = numero1D + numero2D;
            System.out.println("Total: " + total);
            continuar();
        } else if (escolha == 2) { // Subtração
            ad.Calcular();
            double numero1D = ad.numero1D;
            double numero2D = ad.numero2D;
            double total = numero1D - numero2D;
            System.out.println("Total: " + total);
            continuar();
        } else if (escolha == 3) { // Multiplicação
            ad.Calcular();
            double numero1D = ad.numero1D;
            double numero2D = ad.numero2D;
            double total = numero1D * numero2D;
            System.out.println("Total: " + total);
            continuar();
        } else if (escolha == 4) { // Divisão
            ad.Calcular();
            double numero1D = ad.numero1D;
            double numero2D = ad.numero2D;
            double total = numero1D / numero2D;
            System.out.println("Total: " + total);
            continuar();
        } else if (escolha == 0) {
            return;
        }
    }

    public static void continuar() {
        System.out.println("\nDeseja continuar usando a calculadora? Sim/Nao");
        Scanner a = new Scanner(System.in);
        String continuar = a.next();
        if (continuar.equalsIgnoreCase("sim")) {
            main(null);
        } else {
            if (continuar.equalsIgnoreCase("nao")) {
                System.out.println("Obrigado por usar o programa!");
                return;
            }
            System.out.println("Desculpe-me mais não entendi sua resposta. Tente novamente!");
            continuar();
            return;
        }
    }
}

class Calculador {

    double numero1D, numero2D;
    String numero1S, numero2S;
    double totaladi, totalsub, totaldiv, totalmut;

    public double Calcular() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha o primeiro numero:");
        numero1S = scanner.nextLine();
        while (numero1S.contains("a") || numero1S.contains(".")) {
            System.out.println("Digite apenas numeros");
            Calcular();
        }
        numero1D = Double.valueOf(numero1S).doubleValue();

        System.out.println("Escolha o segundo numero:");
        numero2S = scanner.nextLine();
        while (numero2S.contains("a") || numero2S.contains(".")) {
            System.out.println("Digite apenas numeros");
            Calcular();
        }
        numero2D = Double.valueOf(numero2S).doubleValue();
        return Total();
    }

    public double Total() {
        return totaladi;
    }
}
