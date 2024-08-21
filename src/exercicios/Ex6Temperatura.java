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