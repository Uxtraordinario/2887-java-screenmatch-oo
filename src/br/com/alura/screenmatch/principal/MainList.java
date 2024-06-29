package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.calculo.Categorie;
import br.com.alura.screenmatch.modelos.Movie;
import br.com.alura.screenmatch.modelos.Series;
import br.com.alura.screenmatch.modelos.Title;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class MainList extends Principal {
    public static void main(String[] args) {
        Series lost = new Series(2000, "lost","Horror",  50);
        lost.feedback(10);
        Movie myMovie = new Movie("The godfather","Action" , 1970, 180);
        myMovie.feedback(9);
        Movie otherMovie = new Movie("Shrek","Animation", 2007, 160);
        otherMovie.feedback(7);

        Movie m1 = myMovie;
        Movie m2 = otherMovie;
        Series s1 = lost;


        ArrayList<Title> list = new ArrayList<>();
        list.add(myMovie);
        list.add(otherMovie);
        list.add(lost);
        for (Title Item : list) {
            System.out.println(Item.getName());
            if (Item instanceof Movie movie && movie.getCategorie() > 2) {
                System.out.println("Class " + movie.getCategorie());

            }

        }

        ArrayList<String> searchForStudios = new ArrayList<>();
        searchForStudios.add("Pixar");
        searchForStudios.add("Disney");
        searchForStudios.add("Illumination");
        Collections.sort(list);
        System.out.println(list);

        list.sort(Comparator.comparing(Title::getLaunchDate));
        System.out.println("Launch Data Ordened: ");
        System.out.println(list);

    }


}
