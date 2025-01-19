package br.com.alura.screenmatch.modelos;

public class Filme {
    private String nome;
    private int ano;
    private boolean inclusoNoPlano;
    private double somaAvaliacoes;
    private int totalAvaliacoes;
    private int duracao;

    public String getNome() {
        return nome;
    }

    public int getAno() {
        return ano;
    }

    public boolean getInclusoNoPlano() {
        return inclusoNoPlano;
    }

    public int getDuracao() {
        return duracao;
    }

    public int getTotalAvaliacoes(){
        return totalAvaliacoes;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setInclusoNoPlano(boolean inclusoNoPlano) {
        this.inclusoNoPlano = inclusoNoPlano;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public void exibeFichaTecnica() {
        System.out.println("Nome do filme: " + nome);
        System.out.println("Ano de lançamento: " + ano);
    }

    public void avalia(double nota){
        somaAvaliacoes += nota;
        totalAvaliacoes++;
    }

    public double pegaMedia(){
        return somaAvaliacoes / totalAvaliacoes;
    }
}
