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
/* Teste de Mesa

| Passo | Descrição                               | salarioMensal | reajusteSalario | aumento      | novoSalario  | Cálculo                                                            | Resultado                             |
|-------|-----------------------------------------|---------------|-----------------|--------------|--------------|--------------------------------------------------------------------|---------------------------------------|
| 1     |Entrada do salário mensal                |3000.0         |                 |              |              |                                                                    |                                       |
| 2     |Entrada do percentual de reajuste        |3000.0         |10.0             |              |              |                                                                    |                                       |
| 3     |Calcular o aumento do salário            |3000.0         |10.0             |300.0         |              |`salarioMensal * (reajusteSalario / 100)` = `3000.0 * (10.0 / 100)` |300.0                                  |
| 4     |Calcular o novo salário                  |3000.0         |10.0             |300.0         |3300.0        |`salarioMensal + aumento` = `3000.0 + 300.0`                        |                                       |
| 5     |Exibir o novo salário                    |3000.0         |10.0             |300.0         |3300.0        |`"Seu novo salário é de R$ " + novoSalario`                         |"Seu novo salário é de R$ 3300.00"     |

 */