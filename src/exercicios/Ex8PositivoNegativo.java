package exercicios;

import java.util.Scanner;

public class Ex8PositivoNegativo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número: ");
        double num = sc.nextDouble();

        if (num>= 0) {
            System.out.println("O número é POSITIVO");
        } else {
            System.out.println("O número é NEGATIVO");
        }

        sc.close();
    }
}
