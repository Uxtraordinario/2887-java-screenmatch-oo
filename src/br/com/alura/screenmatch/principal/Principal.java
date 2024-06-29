package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.calculo.FilterForYou;
import br.com.alura.screenmatch.calculo.Summarize;
import br.com.alura.screenmatch.modelos.Episode;
import br.com.alura.screenmatch.modelos.Movie;
import br.com.alura.screenmatch.modelos.Series;

import java.util.ArrayList;

public class Principal {


    public static void main(String[] args) {
        Movie myMovie = new Movie("The godfather", "action", 1972, 180);
        System.out.println("Minutes of Stream: " + myMovie.setMinutesOfStream());



        myMovie.showUpValues();

        myMovie.feedback(9);
        myMovie.feedback(8);
        myMovie.feedback(10);
        myMovie.feedback(7);
        myMovie.feedback(10);
        myMovie.feedback(6);
        myMovie.feedback(9);

        System.out.println("Total of Feedbacks:" );
        System.out.println(myMovie.Media);

        Series lost = new Series(2000, "lost","Horror" , 50);
        lost.showUpValues();
        lost.setSeriesSeasons(12);
        lost.setEpisodesPerSeason(12);
        System.out.println("Minutes Duration: " + lost.getMinutesOfStream());

        Movie anotherMovie = new Movie("Toy Story","animation",  2002, 180);

        Summarize calculator = new Summarize();
        calculator.include(myMovie);
        calculator.include(anotherMovie);
        calculator.include(lost);
        System.out.println( calculator.getTotalTime());

        FilterForYou filter = new FilterForYou();
        filter.Filter(myMovie);

        Episode episode = new Episode();
        episode.setNumber(1);
        episode.setSerie(lost);
        episode.setTotalViews(300);
        filter.Filter(episode);

        Movie otherMovie = new Movie("Shrek", "Animation",  2007, 160);

        ArrayList<Movie> movielist = new ArrayList<>();
        movielist.add(myMovie);
        movielist.add(anotherMovie);
        movielist.add(otherMovie);
        System.out.println("List lenght: " + movielist.size());
        System.out.println("First Movie: " + movielist.get(0).getName());
        System.out.println("Second Movie: " + movielist.get(1).getName());
        System.out.println("Third: " + movielist.get(2).getName());
        System.out.println(movielist);
        System.out.println("movie ToString " + movielist.get(0).toString());

    }

}