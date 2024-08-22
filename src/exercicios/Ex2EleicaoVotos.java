package exercicios;

import java.util.Scanner;

public class Ex2EleicaoVotos {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Número total de eleitores: ");
        int totalEleitores = sc.nextInt();
        System.out.print("Número de votos brancos: ");
        int votoBrancos = sc.nextInt();
        System.out.print("Número de votos nulos: ");
        int votosNulos = sc.nextInt();
        System.out.print("Número de votos válidos: ");
        int votosValidos = sc.nextInt();

        double porcentagem = 100.0 / totalEleitores;

        double percentualBrancos = votoBrancos * porcentagem;
        double percentualNulos = votosNulos * porcentagem;
        double percentualValidos = votosValidos * porcentagem;

        System.out.println("Percentual de votos brancos: " + percentualBrancos + "%");
        System.out.println("Percentual de votos nulos: " + percentualNulos + "%");
        System.out.println("Percentual de votos válidos: " + percentualValidos + "%");

        sc.close();
    }
}
/* Teste de Mesa

| Passo | Descrição                               | totalEleitores | votoBrancos | votosNulos | votosValidos | porcentagem | percentualBrancos | percentualNulos | percentualValidos | Cálculo                                                        | Resultado                             |
|-------|-----------------------------------------|----------------|-------------|------------|--------------|-------------|-------------------|-----------------|-------------------|----------------------------------------------------------------|---------------------------------------|
| 1     |Entrada do número total de eleitores     |1000            |             |            |              |             |                   |                 |                   |                                                                |                                       |
| 2     |Entrada do número de votos brancos       |1000            |100          |            |              |             |                   |                 |                   |                                                                |                                       |
| 3     |Entrada do número de votos nulos         |1000            |100          |50          |              |             |                   |                 |                   |                                                                |                                       |
| 4     |Entrada do número de votos válidos       |1000            |100          |50          |850           |0.1          |10.0               |5.0              |85.0               |`porcentagem = 100.0 / totalEleitores` = `100.0 / 1000` = 0.1   |                                       |
| 5     |Calcular percentual de votos brancos     |1000            |100          |50          |850           |0.1          |10.0               |                 |                   |`percentualBrancos = votoBrancos * porcentagem` = `100 * 0.1`   |                                       |
| 6     |Calcular percentual de votos nulos       |1000            |100          |50          |850           |0.1          |10.0               |5.0              |                   |`percentualNulos = votosNulos * porcentagem` = `50 * 0.1`       |                                       |
| 7     |Calcular percentual de votos válidos     |1000            |100          |50          |850           |0.1          |10.0               |5.0              |85.0               |`percentualValidos = votosValidos * porcentagem` = `850 * 0.1`  |                                       |
| 8     |Exibir percentual de votos brancos       |1000            |100          |50          |850           |0.1          |10.0               |5.0              |85.0               |`"Percentual de votos brancos: " + percentualBrancos + "%"`     |10.0%                                  |
| 9     |Exibir percentual de votos nulos         |1000            |100          |50          |850           |0.1          |10.0               |5.0              |85.0               |`"Percentual de votos nulos: " + percentualNulos + "%"`         |5.0%                                   |
| 10    |Exibir percentual de votos válidos       |1000            |100          |50          |850           |0.1          |10.0               |5.0              |85.0               |`"Percentual de votos válidos: " + percentualValidos + "%"`     |85.0%                                  |

 */
