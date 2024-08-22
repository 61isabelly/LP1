package exercicios;

import java.util.Scanner;

public class Ex11Voto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o ano atual: ");
        int anoAtual = sc.nextInt();

        System.out.print("Digite o ano de nascimento: ");
        int anoNascimento = sc.nextInt();

        int idade = anoAtual - anoNascimento;

        if (idade >= 16) {
        System.out.println("Você pode votar este ano.");
    } else {
            System.out.println("Você NÃO pode votar este ano.");
        }

        sc.close();
    }
}
/*

| Passo | Descrição                                            | anoAtual  | anoNascimento  | Cálculo                  | Resultado                   |
|-------|------------------------------------------------------|-----------|----------------|--------------------------|-----------------------------|
        | 1     |Entrada: Digite o ano atual                   |2024       |                |                          |                             |
        | 2     |Entrada: Digite o ano de nascimento           |2024       |1999            |                          |                             |
        | 3     |Calcular a diferença entre anos               |2024       |1999            |`2024 - 1999`             |25                           |
        | 4     |Verificar se a diferença é >= 16              |2024       |1999            |`25 >= 16`                |true                         |
        | 5     |Exibir mensagem:"Você pode votar este ano."   |2024       |1999            |                          |"Você pode votar este ano."  |

*/
