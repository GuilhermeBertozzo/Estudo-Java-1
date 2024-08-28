
import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) throws Exception {
        String name = "Usuário Teste";
        String accountType = "Corrente";
        double balance = 1000.00;
        int option = 0; 

        String data;
        String menu = """
Operações:

1- Consultar saldo
2- Depositar valor
3- Retirar valor
4- Sair

Informe o número da operação desejada: """;

        Scanner scan = new Scanner(System.in);
 
        while (option != 4) {
            data = """
*************************
Dados do cliente: 


Nome:           %s
Tipo de conta:  %s
Saldo:          R$ %.2f
*************************""".formatted(name, accountType, balance);

            System.out.println(data + "\n\n");
            System.out.println(menu);
            option = scan.nextInt(); 

            switch (option) {
                case 1:
                    System.out.print("\033\143"); // limpa o terminal
                    System.out.println("O saldo atual de %s é R$ %.2f".formatted(name, balance));
                    Thread.sleep(3000);
                    System.out.print("\033\143");
                    break;
                case 2:
                    System.out.print("\033\143");
                    System.out.println("Informe o valor a ser depositado: ");
                    balance += scan.nextDouble();
                    System.out.println("\n Depósito realizado com sucesso, o saldo agora é de R$ %.2f".formatted(balance));
                    Thread.sleep(3000);
                    System.out.print("\033\143");
                    break;
                case 3:
                    System.out.print("\033\143");
                    System.out.println("Informe o valor a ser retirado: ");
                    double withdrawal = scan.nextDouble();
                    if (withdrawal > balance) {
                        System.out.println("\nSaldo insuficiente.");
                        Thread.sleep(3000);
                        System.out.print("\033\143");
                        break;
                    }
                    balance -= withdrawal;
                    System.out.println("\n Retirada realizada com sucesso, o saldo agora é de R$ %.2f".formatted(balance));
                    Thread.sleep(3000);
                    System.out.print("\033\143");
                    break;
                case 4:
                    scan.close();
                    System.out.print("\033\143");
                    System.out.println("Encerrando  .   .   .");
                    break;
                default:
                    System.out.print("\033\143"); 
                    System.out.println("Opção inválida");
                    Thread.sleep(3000);
                    System.out.print("\033\143");
                    break;
            }
            
        }
    }
}
