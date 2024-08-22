import java.util.Scanner;

public class Ex16Despesa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double jan= 15000;
        double fev= 23000;
        double mar= 17000;

        double gastoTotal = jan+fev+mar;
        double media= gastoTotal/3;
        System.out.println("O gasto total é de R$: "+ gastoTotal);

        System.out.println("E a média desse gasto é de "+ media + " %");

        sc.close();
    }
}
/* Teste de Mesa:

| Passo | Descrição                            | jan    | fev   | mar    | gastoTotal  | media     | Cálculo                      | Resultado                             |
|-------|--------------------------------------|--------|-------|-------|-------------|----------|--------------------------------|---------------------------------------|
|1      |Entrada: Valor de janeiro             |15000   |       |       |             |          |                                |                                       |
|2      |Entrada: Valor de fevereiro           |15000   |23000  |       |             |          |                                |                                       |
|3      |Entrada: Valor de março               |15000   |23000  |17000  |             |          |                                |                                       |
|4      |Calcular o gasto total                |15000   |23000  |17000  |55000        |          |`janeiro + fev + mar`           |55000                                  |
|5      |Calcular a média                      |15000   |23000  |17000  |55000        |18333.33  |`gastoTotal / 3`                |18333.33                               |
|6      |Exibir o gasto total                  |15000   |23000  |17000  |55000        |18333.33  |                                |"O gasto total é de R$: 55000"         |
|7      |Exibir a média do gasto               |15000   |23000  |17000  |55000        |18333.33  |                                |"E a média desse gasto é de 18333.33 %"|

*/