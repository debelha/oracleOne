import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

import java.util.ArrayList;

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

        Filme filme2 = new Filme();
        filme2.setNome("Jungle Beat");
        filme2.setAno(2024);
        filme2.setDuracaoEmMinutos(130);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(filme1);
        calculadora.inclui(filme2);
        calculadora.inclui(serie1);
        System.out.println(calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(filme1);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(serie1);
        episodio.setTotalVisualizacoes(300);
        filtro.filtra(episodio);

        var filme3 = new Filme();
        filme3.setNome("Dog Ville");
        filme3.setAno(2003);
        filme3.setDuracaoEmMinutos(130);
        filme3.avalia(10);

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(filme1);
        listaDeFilmes.add(filme2);
        listaDeFilmes.add(filme3);
        System.out.println("Tamanho da lista: " + listaDeFilmes.size());
        System.out.println("Primeiro filme: " + listaDeFilmes.get(0).getNome());
        System.out.println(listaDeFilmes);
        System.out.println("toString do filme: " + listaDeFilmes.get(0).toString());
    }
}
