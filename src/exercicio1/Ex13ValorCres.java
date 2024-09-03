package exercicio1;

import java.util.Scanner;

public class Ex13ValorCres {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o primeiro valor: ");
        double valor1 = sc.nextDouble();

        System.out.print("Digite o segundo valor: ");
        double valor2 = sc.nextDouble();

        if (valor1 < valor2) {
            System.out.println("Valores em ordem crescente: " + valor1 + ", " + valor2);
        } else {
            System.out.println("Valores em ordem crescente: " + valor2 + ", " + valor1);
        }

        sc.close();
    }
}
/* Teste de Mesa

| Passo | Descrição                                              | valor1 | valor2 | Cálculo                  | Resultado                           |
|-------|--------------------------------------------------------|--------|--------|--------------------------|-------------------------------------|
| 1     |Entrada: Digite o primeiro valor                        |6       |        |                          |                                     |
| 2     |Entrada: Digite o segundo valor                         |6       |9       |                          |                                     |
| 3     |Verificar se valor1 < valor2                            |6       |9       |`6 < 9`                   |true                                 |
| 4     |Exibir mensagem: "Valores em ordem crescente: 6.0, 9.0" |        |9       |                          |"Valores em ordem crescente 6.0, 9.0"|

*/
