import java.util.Scanner;

public class Ex8PositivoNegativo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        double num = sc.nextDouble();

        if (num>= 0) {
            System.out.println("O número é POSITIVO");
        } else {
            System.out.println("O número é NEGATIVO");
        }
        sc.close();
    }
}
/*
| Passo | Descrição                      | num  | Condição (num >= 0) | Cálculo                            | Resultado
|-------|--------------------------------|------|---------------------|------------------------------------|----------------------|
| 1     |Entrada do número               |7     |true                 |`num >= 0` (7 >= 0) = true          |"O número é POSITIVO" |
| 2     |Entrada do número               |-3    |false                |`num >= 0` (-3 >= 0) = false        |"O número é NEGATIVO" |
| 3     |Entrada do número               |0     |true                 |`num >= 0` (0 >= 0) = true          |"O número é POSITIVO" |

 */