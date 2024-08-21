package exercicios;

import java.util.Scanner;

public class Ex1ConversorDias {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Sua idade em anos: ");
        int anos = sc.nextInt();
        System.out.println("Sua idade em meses: ");
        int meses = sc.nextInt();
        System.out.println("Sua idade em dias: ");
        int dias = sc.nextInt();

        int idadeEmDias = (anos * 12 * 30) + (meses * 30) + dias;

        System.out.println("A sua idade total em dias é de: " + idadeEmDias);

        sc.close();
    }
}


