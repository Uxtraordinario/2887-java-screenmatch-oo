package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.calculo.Categorie;

public class Episode implements Categorie {
    private int number;
    private String name;
    private Series serie;
    private int totalViews;

    public int getTotalViews() {
        return totalViews;
    }

    public void setTotalViews(int totalViews) {
        this.totalViews = totalViews;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Series getSerie() {
        return serie;
    }

    public void setSerie(Series serie) {
        this.serie = serie;
    }

    @Override
    public int getCategorie() {
        if (totalViews > 100) {
            return 4;

        } else {
        return 2;
        }
    }
}
