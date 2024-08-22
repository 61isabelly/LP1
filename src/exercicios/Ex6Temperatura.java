package exercicios;

import java.util.Scanner;

public class Ex6Temperatura {
    public static void main(String[] args){
         Scanner sc  = new Scanner(System.in);

           System.out.print("Grau em Fahrenheit:");
             double fahrenheit = sc.nextDouble();
             double celsius = (fahrenheit - 32) * 5 / 9;

             System.out.printf("A temperatura em graus Celsius é: %.2f°C%n", celsius);

             sc.close ();
    }
}
/* Teste de Mesa

| Passo | Descrição                           | fahrenheit | celsius           | Cálculo                           | Resultado                                  |
|-------|-------------------------------------|------------|-------------------|-----------------------------------|--------------------------------------------|
| 1     |Entrada do grau em Fahrenheit        |40.0        |                   |                                   |                                           |
| 2     |Calcular a temperatura em Celsius    |40.0        |(40 - 32) * 5 / 9  |`(40 - 32) * 5 / 9`                |4.44                                       |
| 3     |Exibir a temperatura em Celsius      |40.0        |4.44               |"A temperatura em graus Celsius é" |"A temperatura em graus Celsius é: 4.44°C" |

 */