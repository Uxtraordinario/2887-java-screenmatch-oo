package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.exception.ConvertionErrorException;
import com.google.gson.annotations.SerializedName;

public class Title implements Comparable<Title> {
    @SerializedName("Title")
    public String name;
    @SerializedName("Genre")
    public String movieGenre;
    @SerializedName("Year")
    public int launchDate;
    public boolean Media;
   private boolean included;
    private double summarize;
    public int totalSummarize;
    @SerializedName("Runtime")
    public int minutesOfStream;
    public int yearOfRelease;

    public Title(int launchDate, String name, String movieGenre, int minutesOfStream) {
        this.launchDate = launchDate;
        this.name = name;
    }

    public String getMovieGenre() {
        return movieGenre;
    }

    public void setMovieGenre(String movieGenre) {
        this.movieGenre = movieGenre;
    }

    public Title(TitleOMDB myTitleOmdb) {
        this.name = myTitleOmdb.title();


        if (myTitleOmdb.year().length() >  4) {
            throw new ConvertionErrorException("Can't convert year value, cause there's more than 04 numbers");
         }
        this.launchDate = Integer.valueOf(myTitleOmdb.year());
        this.minutesOfStream = Integer.valueOf(myTitleOmdb.runtime().substring(0, 2));
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLaunchDate(int launchDate) {
        this.launchDate = launchDate;
    }

    public void setMinutesOfStream(int minutesOfStream) {
        this.minutesOfStream = minutesOfStream;
    }

    public void showUpValues() {
        System.out.println("Movie Title: " + name);
        System.out.println("Year of launch: " + launchDate);
    }

    public void feedback(double note) {
        summarize += note;
        totalSummarize++;
    }


    public double getMedia() {
        return summarize / totalSummarize;
    }

    public String setMinutesOfStream() {
        this.minutesOfStream = minutesOfStream;
        return String.valueOf(minutesOfStream);
    }

    public int getLaunchDate() {
        return launchDate;
    }

    public void setlaunchDate(int launchDate) {
        this.launchDate = launchDate;
    }

    public int getMinutesOfStream() {
        return minutesOfStream;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Title o) {
        return 0;
    }

    @Override
    public String toString() {
        return
                " name =" + name +
                        " Gender = " +  movieGenre +
                        " launchDate = " + launchDate +
                        " minutesOfStream = " + minutesOfStream;
    }
}
