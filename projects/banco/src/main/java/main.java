import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        String nome = "Deborah";
        String tipoConta = "Corrente";
        double saldo = 1500.00;
        int opcao = 0;

        System.out.println("***********************");
        System.out.println("\nNome: " + nome);
        System.out.println("Tipo de conta: " + tipoConta);
        System.out.println("Saldo: " + saldo);
        System.out.println("\n***********************");

        String menu = """
                ** Digite sua opção: **
                1- Consultar saldo
                2- Transferir valor
                3- Receber valor
                4- Sair
               
                """;

        Scanner leitura = new Scanner(System.in);

        while (opcao != 4) {
            System.out.println(menu);
            opcao = leitura.nextInt();

            if (opcao == 1) {
                System.out.println("Saldo: " + saldo);
            } else if (opcao == 2) {
                System.out.println("Valor da transferência: " );
                double valorTransferencia = leitura.nextDouble();
                if (valorTransferencia > saldo) {
                    System.out.println("Não há saldo suficiente para realizar essa transferência");
                } else {
                    saldo -= valorTransferencia;
                    System.out.println("Saldo atualizado: " + saldo);
                }
            } else if (opcao == 3) {
                System.out.println("Valor recebido: ");
                double valor = leitura.nextDouble();
                saldo += valor;
                System.out.println("Saldo atualizado: " + saldo);
            } else if (opcao != 4) {
                System.out.println("Opção inválida");
            }
        }
    }
}
