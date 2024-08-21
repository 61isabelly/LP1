package exercicios;

import java.util.Scanner;

public class Ex4CustoCarro {
        public static void main(String[] args) {
            Scanner sc = new Scanner (System.in);

            System.out.println("Custo de fábrica: ");
            double custo = sc.nextDouble();

            double distribuidor = 0.28;
            double impostos = 0.45;

            double valorDistribuidor = custo * distribuidor;
            double valorImpostos = custo * impostos;

            double custoFinal = custo + valorDistribuidor + valorImpostos;

            System.out.println("O custo final ao consumidor é: " + custoFinal + "$");

            sc.close();
        }
}
