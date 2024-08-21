package exercicios;

import java.util.Scanner;

public class Ex7MaiorDez {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        double n = sc.nextDouble();

        if (n >= 10) {
            System.out.println("É MAIOR QUE DEZ");
        } else {
            System.out.println("NÃO É MAIOR QUE DEZ");
        }
        sc.close();
    }
}