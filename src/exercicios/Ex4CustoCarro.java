package exercicios;

import java.util.Scanner;

public class Ex4CustoCarro {
        public static void main(String[] args) {
            Scanner sc = new Scanner (System.in);

            System.out.println("Custo de fábrica: ");
            double custo = sc.nextDouble();

            double distribuidor = 0.28;
            double impostos = 0.45;

            double valorDistribuidor = custo * distribuidor;
            double valorImpostos = custo * impostos;

            double custoFinal = custo + valorDistribuidor + valorImpostos;

            System.out.println("O custo final ao consumidor é: " + custoFinal + "$");

            sc.close();
        }
}
/* Teste de Mesa

| Passo | Descrição                               | custo | valorDistribuidor | valorImpostos | custoFinal   | Cálculo                                         | Resultado                                 |
|-------|-----------------------------------------|-------|-------------------|---------------|--------------|-------------------------------------------------|-------------------------------------------|
| 1     |Entrada do custo de fábrica              |30000  |                   |               |              |                                                 |                                           |
| 2     |Calcular valor do distribuidor           |30000  |8400               |               |              |`custo * distribuidor` = `30000 * 0.28` = 8400   |                                           |
| 3     |Calcular valor dos impostos              |30000  |8400               |13500          |              |`custo * impostos` = `30000 * 0.45` = 13500      |                                           |
| 4     |Calcular o custo final ao consumidor     |30000  |8400               |13500          |51900         |`custo + valorDistribuidor + valorImpostos`      |                                           |
| 5     |Exibir o custo final ao consumidor       |30000  |8400               |13500          |51900         |`"O custo final ao consumidor é: 51900.0$"`      | "O custo final ao consumidor é: 51900.0$" |

 */