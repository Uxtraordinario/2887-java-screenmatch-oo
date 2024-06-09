package br.com.alura.screenmatch.modelos;
import br.com.alura.screenmatch.calculo.Categorie;

public class Movie extends Title implements Categorie {
   private String director;

    public void setDirector(String director) {
        this.director = director;
    }

    public String getDirector() {
        return director;
    }

    Series BigBangTheory = new Series();

    @Override
    public int getCategorie() {
        return (int) getMedia() / 2;
    }
    // BigBangTheory.setname("BigBandTheory");
}

