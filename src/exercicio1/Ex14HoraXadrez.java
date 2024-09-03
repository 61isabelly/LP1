package exercicio1;

import java.util.Scanner;

public class Ex14HoraXadrez {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a hora de início do jogo (0 a 23): ");
        int horaInicio = sc.nextInt();

        System.out.print("Digite a hora de fim do jogo (0 a 23): ");
        int horaFim = sc.nextInt();

        int duracao;
        if (horaFim >= horaInicio) {
            duracao = horaFim - horaInicio;
        } else {
            duracao = (24 - horaInicio) + horaFim;
        }

        System.out.println("Duração do jogo: " + duracao + " horas");

        sc.close();
    }
}
/* Teste de Mesa

| Passo | Descrição                                       | horaInicio | horaFim | Cálculo                  | Resultado                          |
|-------|-------------------------------------------------|------------|---------|--------------------------|------------------------------------|
| 1     |Entrada:Digite a hora de início do jogo (0 a 23) |14          |         |                          |                                    |
| 2     |Entrada:Digite a hora de fim do jogo (0 a 23)    |14          |22       |                          |                                    |
| 3     |Verificar se horaFim >= horaInicio               |14          |22       |`14 > 22`                 |false                               |
| 4     |Calcular duração (horaFim - horaInicio)          |14          |22       |`22 - 14`                 |8                                   |
| 5     |Exibir mensagem:"Duração do jogo: 8 horas"       |14          |22       |                          |"Duração do jogo: 8 horas."         |

*/
