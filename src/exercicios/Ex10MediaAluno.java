package exercicios;

import java.util.Scanner;

public class Ex10MediaAluno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a nota da 1ª avaliação: ");
        double nota1 = sc.nextDouble();

        System.out.println("Digite a nota da 2ª avaliação: ");
        double nota2 = sc.nextDouble();

        double media = (nota1 + nota2) / 2;

        if (media >= 6) {
            System.out.printf("O aluno foi APROVADO com média: %.2f%n", media);
        } else {
            System.out.printf("O aluno foi REPROVADO com média: %.2f%n", media);
        }

        sc.close();
    }
}
/* Teste de Mesa

| Passo | Descrição                                     | nota1 | nota2 | media | Cálculo                | Resultado                               |
|-------|-----------------------------------------------|-------|-------|-------|------------------------|-----------------------------------------|
| 1     |Entrada da nota da 1ª avaliação                |7.0   |        |       |                        |                                         |
| 2     |Entrada da nota da 2ª avaliação                |7.0   |8.0     |       |                        |                                         |
| 3     |Calcular a média                               |7.0   |8.0     |7.50   |`(7.0 + 8.0) / 2`       |7.50                                     |
| 4     |Verificar se o aluno foi aprovado ou reprovado |7.0   |8.0     |7.50   | media >= 6`            |"O aluno foi APROVADO com média:  7.50"  |
| 5     |Exibir o resultado                             | 7.0  |8.0     | 7.50  |                        | "O aluno foi APROVADO com média:  7.50" |

 */