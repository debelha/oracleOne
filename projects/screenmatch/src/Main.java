import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

public class Main {
    public static void main(String[] args) {
        Filme filme1 = new Filme();
        filme1.setNome("Glass Onion");
        filme1.setAno(2020);
        filme1.setDuracaoEmMinutos(190);
        System.out.println("Duração do filme: " + filme1.getDuracaoEmMinutos());

        filme1.exibeFichaTecnica();
        filme1.avalia(8);
        filme1.avalia(5);
        filme1.avalia(10);
        System.out.println("Total de avaliações: " + filme1.getTotalAvaliacoes());
        System.out.println(filme1.pegaMedia());
        System.out.println(filme1.pegaMedia());

        Serie serie1 = new Serie();
        serie1.setNome("Vis a vis");
        serie1.setAno(2020);
        serie1.exibeFichaTecnica();
        serie1.setTemporadas(5);
        serie1.setEpisodiosPorTemporada(10);
        serie1.setMinutosPorEpisodio(50);
        System.out.println("Duração da série: " + serie1.getDuracaoEmMinutos());
    }
}
