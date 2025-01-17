public class Main {
    public static void main(String[] args) {
        Filme filme1 = new Filme();
        filme1.titulo = "Glass Onion";
        filme1.ano = 2020;
        filme1.duracao = 190;

        filme1.exibeFichaTecnica();
        filme1.avalia(8);
        filme1.avalia(5);
        filme1.avalia(10);
        System.out.println(filme1.somaAvaliacoes);
        System.out.println(filme1.totalAvaliacoes);
        System.out.println(filme1.pegaMedia());
    }
}
