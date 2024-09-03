package exercicio1;

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
/* Teste de Mesa

| Passo | Descrição                          | n  | Condição (n >= 10) | Resultado                          | Cálculo                           |
|-------|------------------------------------|----|--------------------|------------------------------------|-----------------------------------|
| 1     |Entrada do número                   |12  |true                |"É MAIOR QUE DEZ"                   |`n >= 10` (12 >= 10) = true        |
| 2     |Entrada do número                   |8   |false               |"NÃO É MAIOR QUE DEZ"               |`n >= 10` (8 >= 10) = false        |
| 3     |Entrada do número                   |10  |true                |"É MAIOR QUE DEZ"                   |`n >= 10` (10 >= 10) = true        |

*/
