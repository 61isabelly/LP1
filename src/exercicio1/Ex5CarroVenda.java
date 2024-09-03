package exercicio1;

import java.util.Scanner;

public class Ex5CarroVenda {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("O salário fixo do vendedor: ");
        double salarioFixo = sc.nextDouble();

        System.out.println("O valor que o vendedor recebe por carro vendido: ");
        double comissaoPorCarro = sc.nextDouble();

        System.out.println("O número de carros vendidos: ");
        int carrosVendidos = sc.nextInt();

        System.out.println("O valor total das vendas: ");
        double valorTotalVendas = sc.nextDouble();


        double salarioFinal = salarioFixo + (carrosVendidos * comissaoPorCarro) + (valorTotalVendas * 0.05);


        System.out.printf("O salário final do vendedor é: R$ %.2f%n", salarioFinal);

        sc.close();
    }
}
/* Teste de Mesa

| Passo | Descrição                               | salarioFixo | comissaoPorCarro | carrosVendidos | valorTotalVendas | comissaoTotal | salarioFinal     | Cálculo                                                      | Resultado                                  |
|-------|-----------------------------------------|------------ |------------------|----------------|------------------|---------------|------------------|--------------------------------------------------------------|--------------------------------------------|
| 1     |Entrada do salário fixo do vendedor      |2000.0       |                  |                |                  |               |                  |                                                              |                                            |
| 2     |Entrada do valor por carro vendido       |2000.0       |150.0             |                |                  |               |                  |                                                              |                                            |
| 3     |Entrada do número de carros vendidos     |2000.0       |150.0             |10              |                  |               |                  |                                                              |                                            |
| 4     |Entrada do valor total das vendas        |2000.0       |150.0             |10              |50000.0           |               |                  |                                                              |                                            |
| 5     |Calcular a comissão total                |2000.0       |150.0             |10              |50000.0           |2500.0         |                  |`carrosVendidos * comissaoPorCarro` = `10 * 150.0` = 1500.0   |                                            |
| 6     |Calcular o salário final                 |2000.0       |150.0             |10              |50000.0           |2500.0         |4750.0            |`salarioFixo + comissaoTotal + (valorTotalVendas * 0.05)`     |                                            |
| 7     |Exibir o salário final do vendedor       |2000.0       |150.0             |10              |50000.0           |2500.0         |4750.0            |`"O salário final do vendedor é: R$ 4750.00"`                 |"O salário final do vendedor é: R$ 4750.00" |

 */