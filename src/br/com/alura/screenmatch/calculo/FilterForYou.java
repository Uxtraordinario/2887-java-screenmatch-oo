package br.com.alura.screenmatch.calculo;

public class FilterForYou {
    private String forYou;

    public void Filter(Categorie categorie) {
        if (categorie.getCategorie() >= 4) {
            System.out.println("It's between the most popular");
        } else if (categorie.getCategorie() >= 2) {
            System.out.println("One of the most popular");
        } else {
            System.out.println("Add on your list");
        }
    }
}
