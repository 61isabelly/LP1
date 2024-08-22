package exercicios;

import java.util.Scanner;

public class Ex17MediaAPI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a nota da P1: ");
        double P1 = sc.nextDouble();

        System.out.print("Digite a nota da E1: ");
        double E1 = sc.nextDouble();

        System.out.print("Digite a nota da E2: ");
        double E2 = sc.nextDouble();

        System.out.print("Digite a nota da API: ");
        double API = sc.nextDouble();

        System.out.print("Digite a nota dos pontos extras: ");
        double X = sc.nextDouble();

        System.out.print("Digite a nota da prova substitutiva: ");
        double SUB = sc.nextDouble();

        double mediaProvaTrabalho = (P1 * 0.6) + (((E1 + E2) / 2) * 0.4);
        double condicionalAPI = Math.max((mediaProvaTrabalho - 5.9), 0) / (mediaProvaTrabalho - 5.9) * API * 0.5;
        double mediaFinal = (mediaProvaTrabalho * 0.5) + condicionalAPI + X + (SUB * 0.2);

        System.out.printf("A média de LP1 é: %.2f%n", mediaFinal);

        sc.close();

    }
}
/* Teste de Mesa:

| Passo | Descrição                           |  P1 |  E1 |  E2 |  API |  X  |  SUB  | mediaProvaTrabalho | condicionalAPI | mediaFinal | Cálculo                                                   |
|-------|-------------------------------------|-----|-----|-----|------|-----|-------|--------------------|----------------|------------|-----------------------------------------------------------|
|  1    |Entrada da nota P1                   |6.0  |     |     |      |     |       |                    |                |            |                                                           |
|  2    |Entrada da nota E1                   |6.0  |4.0  |     |      |     |       |                    |                |            |                                                           |
|  3    |Entrada da nota E2                   |6.0  |4.0  |4.0  |      |     |       |                    |                |            |                                                           |
|  4    |Entrada da nota API                  |6.0  |4.0  |4.0  |10.0  |     |       |                    |                |            |                                                           |
|  5    |Entrada da nota X                    |6.0  |4.0  |4.0  |10.0  |3.0  |       |                    |                |            |                                                           |
|  6    |Entrada da nota SUB                  |6.0  |4.0  |4.0  |10.0  |3.0  |9.0    |                    |                |            |                                                           |
|  7    |Calcular mediaProvaTrabalho          |6.0  |4.0  |4.0  |10.0  |3.0  |9.0    |5.2                 |                |            |`(6.0 * 0.6) + ((4.0 + 4.0) / 2) * 0.4` = 5.2              |
|  8    |Calcular condicionalAPI              |6.0  |4.0  |4.0  |10.0  |3.0  |9.0    |5.2                 |0.0             |            |`max((5.2 - 5.9), 0) / (5.2 - 5.9) * (10.0 * 0.5)` = 0.0   |
|  9    |Calcular mediaFinal                  |6.0  |4.0  |4.0  |10.0  |3.0  |9.0    |5.2                 |0.0             |7.4         |`(5.2 * 0.5) + (0.0) + 3.0 + (9.0 * 0.2)` = 7.4            |
| 10    |Exibir Mensagem                      |6.0  |4.0  |4.0  |10.0  |3.0  |9.0    |5.2                 |0.0             |7.4         |"A média final é 7.4"                                      |

 */