public class Conditional {
    public static void main(String[] args) {
        int anoDeLancamento = 1990;
        boolean inclusoNoPlano = true;
        double notaDoFilme = 8.1;
        String tipoPlano = "normal";

        if (anoDeLancamento >= 2022) {
            System.out.println("Lançamentos!");
        } else {
            System.out.println("Filmes retrôs!");
        }

        if (inclusoNoPlano == true && tipoPlano.equals("plus")) {
            System.out.println("Filme liberado!");
        } else {
            System.out.println("Adquira seu plano!");
        }
    }
}
