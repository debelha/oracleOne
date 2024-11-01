import java.util.Scanner;

public class Loop2 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double mediaAvaliacao = 0;
        double nota = 0;
        int totalNotas = 0;

        while (nota != -1) {
            System.out.println("Digite sua nota para o filme ou aperte -1 para encerrar:");
            nota = leitura.nextDouble();

            if (nota != 0) {
                mediaAvaliacao += nota;
                totalNotas++;
            }
        }

        System.out.println("Média de avaliações " + mediaAvaliacao / totalNotas);
    }
}
