package exercicios;

import java.util.Scanner;

public class Ex3ReajusteMensal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Seu salário mensal: ");
        double salarioMensal = sc.nextDouble();

        System.out.print("O percentual de reajuste: ");
        double reajusteSalario = sc.nextDouble();


        double aumento = salarioMensal * (reajusteSalario / 100);
        double novoSalario = salarioMensal + aumento;

        System.out.print(("Seu novo salário é de R$ " + novoSalario));

        sc.close();
    }
}
