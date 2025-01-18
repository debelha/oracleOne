public class Filme {
    String titulo;
    int ano;
    boolean inclusoNoPlano;
    private double somaAvaliacoes;
    private int totalAvaliacoes;
    int duracao;

    int getTotalAvaliacoes(){
        return totalAvaliacoes;
    }

    void exibeFichaTecnica() {
        System.out.println("Nome do filme: " + titulo);
        System.out.println("Ano de lançamento: " + ano);
    }

    void avalia(double nota){
        somaAvaliacoes += nota;
        totalAvaliacoes++;
    }

    double pegaMedia(){
        return somaAvaliacoes / totalAvaliacoes;
    }
}
