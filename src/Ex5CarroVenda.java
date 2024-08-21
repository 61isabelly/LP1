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
