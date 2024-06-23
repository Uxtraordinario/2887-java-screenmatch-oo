package br.com.alura.screenmatch.modelos;
import br.com.alura.screenmatch.calculo.Categorie;

public class Movie extends Title implements Categorie {
   private String director;

    public Movie(String name, int launchDate, int minutesOfStream) {
        super(launchDate, name, minutesOfStream);
        this.setName(name);
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getDirector() {
        return director;
    }


    @Override
    public int getCategorie() {
        return (int) getMedia() / 2;
    }

    @Override
    public String toString() {
        return "Movie " + this.getName() + " (" + this.launchDate +") ";
    }
}

