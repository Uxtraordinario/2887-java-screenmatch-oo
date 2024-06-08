package br.com.alura.screenmatch.calculo;

//import br.com.alura.screenmatch.modelos.Movie;
//import br.com.alura.screenmatch.modelos.Series;
import br.com.alura.screenmatch.modelos.Title;

public class Summarize {
    private int totalTime = 0;

    public int getTotalTime() {
        return totalTime;
    }

//    public void include (Movie F) {
//        this.totalTime += F.getMinutesOfStream();
//
//    }
//
//    public void include (Series S) {
//        this.totalTime += S.getMinutesOfStream();
//
//    }

    public void include(Title title){
        System.out.println("Adding minutes of stream from " + title);
        this.totalTime += title.getMinutesOfStream();

    }


}
