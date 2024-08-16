package exercicios;

import java.util.Scanner;

public class ReajusteMensal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira seu salário mensal: ");
        double salarioMensal = sc.nextDouble();

        System.out.print("Insira o percentual de reajuste: ");
        double reajusteSalario = sc.nextDouble();


        double aumento = salarioMensal * (reajusteSalario / 100);
        double novoSalario = salarioMensal + aumento;

        System.out.print(("Seu novo salário é de R$ " + novoSalario));

    }
}
