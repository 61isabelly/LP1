package exercicios;

import java.util.Scanner;

public class Ex9Maças {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o total de maçãs: ");
        int numeroMacas = sc.nextInt();

        double custoTotal;

        if (numeroMacas < 12) {
            custoTotal = numeroMacas * 1.30;
        } else {
            custoTotal = numeroMacas * 1.00;
        }

        System.out.printf("O custo total da compra é: R$ %.2f%n", custoTotal);

        sc.close();
    }
}

/* Teste de Mesa:

| Passo | Descrição                         | numeroMacas | Condição(numeroMacas < 12) | Resultado                            |
|-------|-----------------------------------|-------------|----------------------------|--------------------------------------|
| 1     |Entrada: Digite o total de maçãs   |8            |false                       |"O custo total da compra é:: R$ 10,40"|
| 2     |Entrada: Digite o total de maçãs   |14           |true                        |"O custo total da compra é: R$ 14,00" |
| 3     |Entrada: Digite o total de maçãs   |12           |true                        |"O custo total da compra é: R$ 12,00" |

*/

