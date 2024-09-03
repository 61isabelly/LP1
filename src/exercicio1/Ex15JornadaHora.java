package exercicio1;

import java.util.Scanner;

public class Ex15JornadaHora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número de horas trabalhadas no mês: ");
        int horasTrabalhadas = sc.nextInt();

        System.out.print("Digite seu salário por hora: ");
        double horaSalario = sc.nextDouble();

        int horasMes = 160;

        double totalSalario;
        if (horasTrabalhadas > horasMes) {
            int horasExtras = horasTrabalhadas - horasMes;
            double valorHoraExtra = horaSalario * 1.5;
            totalSalario = (horasMes * horaSalario) + (horasExtras * valorHoraExtra);
        } else {
            totalSalario = horasTrabalhadas * horaSalario;
        }

        System.out.printf("Seu salário este mês é: R$ %.2f%n", totalSalario);

        sc.close();
    }
}

/* Teste de Mesa

| Passo | Descrição                                     | horasTrabalhadas | horaSalario | Cálculo                                      | Resultado                          |
|-------|-----------------------------------------------|------------------|-------------|----------------------------------------------|------------------------------------|
| 1     |Entrada: Número de horas trabalhadas no mês    |170               |             |                                              |                                    |
| 2     |Entrada: Digite seu salário por hora           |20                |20           |                                              |                                    |
| 3     |Verificar se horasTrabalhadas > horasMes       |170               |20           |`170 > 160`                                   |true                                |
| 4     |Calcular horas extras                          |170               |20           |`170 - 160`                                   |10                                  |
| 5     |Calcular valor da hora extra                   |170               |20           |`20 * 1.5`                                    |30                                  |
| 6     |Calcular total com horas extras                |170               |20           |`(160 * 20) + (10 * 30)`                      |3500                                |
| 7     |Exibir mensagem                                |170               |20           |                                              |"Seu salário este mês é R$: 3500,00"|

 */