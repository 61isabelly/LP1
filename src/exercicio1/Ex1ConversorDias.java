package exercicio1;

import java.util.Scanner;

public class Ex1ConversorDias {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Sua idade em anos: ");
        int anos = sc.nextInt();
        System.out.println("Sua idade em meses: ");
        int meses = sc.nextInt();
        System.out.println("Sua idade em dias: ");
        int dias = sc.nextInt();

        int idadeEmDias = (anos * 12 * 30) + (meses * 30) + dias;

        System.out.println("A sua idade total em dias é de: " + idadeEmDias);

        sc.close();
    }
}
/* Teste de Mesa

| Passo | Descrição                          | anos | meses | dias | idadeEmDias                                     | Cálculo                                                | Resultado                             |
|-------|------------------------------------|------|-------|------|-------------------------------------------------|--------------------------------------------------------|---------------------------------------|
| 1     |Entrada da idade em anos            |2     |       |      |                                                 |                                                        |                                       |
| 2     |Entrada da idade em meses           |2     |5      |      |                                                 |                                                        |                                       |
| 3     |Entrada da idade em dias            |2     |5      |10    |                                                 |                                                        |                                       |
| 4     |Calcular a idade total em dias      |2     |5      |10    |2 * 12 * 30 + 5 * 30 + 10 = 720 + 150 + 10 = 880 | `idadeEmDias = (anos * 12 * 30) + (meses * 30) + dias` | "A sua idade total em dias é de: 880" |

 */

