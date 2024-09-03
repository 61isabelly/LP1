package exercicio1;

import java.util.Scanner;

public class Ex12DoisValores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o primeiro valor: ");
        double valor1 = sc.nextDouble();

        System.out.print("Digite o segundo valor: ");
        double valor2 = sc.nextDouble();

        if (valor1 > valor2) {
            System.out.println("O maior valor é: " + valor1);
        } else {
            System.out.println("O maior valor é: " + valor2);
        }

        sc.close();
    }
}
/* Teste de Mesa

| Passo | Descrição                                    | num1 | num2 | Cálculo                  | Resultado                          |
|-------|----------------------------------------------|------|------|--------------------------|------------------------------------|
| 1     |Entrada: Digite o primeiro valor              |10    |      |                          |                                    |
| 2     |Entrada: Digite o segundo valor               |10    |15    |                          |                                    |
| 3     |Verificar se valor1 > valor2                  |10    |15    |`10 > 15`                 |true                                |
| 4     |Exibir mensagem: "O maior valor é: 15"        |10    |15    |                          |"O maior valor é: 15.0"             |

*/