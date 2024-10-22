import java.util.Scanner;

public class Scan {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("O que você gostaria de assistir?");
        String assistir = leitura.nextLine();

        System.out.println("Qual o ano de lançamento?");
        int ano = leitura.nextInt();

        System.out.println("Qual sua nota para o filme?");
        double avaliacao = leitura.nextDouble();

        System.out.println(assistir);
        System.out.println(ano);
        System.out.println(avaliacao);
    }
}
