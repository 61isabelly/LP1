package exercicios;

import java.util.Scanner;

public class EleiçãoVotos {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Número total de eleitores: ");
        int totalEleitores = sc.nextInt();
        System.out.print("Número de votos brancos: ");
        int votoBrancos = sc.nextInt();
        System.out.print("Número de votos nulos: ");
        int votosNulos = sc.nextInt();
        System.out.print("Número de votos válidos: ");
        int votosValidos = sc.nextInt();

        double porcentagem = 100.0 / totalEleitores;

        double percentualBrancos = votoBrancos * porcentagem;
        double percentualNulos = votosNulos * porcentagem;
        double percentualValidos = votosValidos * porcentagem;

        System.out.println("Percentual de votos brancos: " + percentualBrancos + "%");
        System.out.println("Percentual de votos nulos: " + percentualNulos + "%");
        System.out.println("Percentual de votos válidos: " + percentualValidos + "%");

        sc.close();

    }
}
