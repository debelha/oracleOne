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

        }
    }
}
