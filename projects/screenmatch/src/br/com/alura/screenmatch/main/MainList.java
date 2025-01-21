package br.com.alura.screenmatch.main;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;

public class MainList {
    public static void main(String[] args) {
        Filme filme1 = new Filme("Glass Onion", 2020);
        Filme filme2 = new Filme("Jungle Beat", 2024);
        var filme3 = new Filme("Dog Ville", 2003);
        Serie serie1 = new Serie("Vis a vis",2020);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(filme1);
        lista.add(filme2);
        lista.add(filme3);
        lista.add(serie1);
        for (Titulo item: lista) {
            System.out.println(item);
        }
    }
}
