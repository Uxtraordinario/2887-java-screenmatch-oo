import br.com.alura.screenmatch.calculo.FilterForYou;
import br.com.alura.screenmatch.calculo.Summarize;
import br.com.alura.screenmatch.modelos.Episode;
import br.com.alura.screenmatch.modelos.Movie;
import br.com.alura.screenmatch.modelos.Series;

public class Principal {


    public static void main(String[] args) {
        Movie myMovie = new Movie();
        myMovie.setName("The godfather");
        myMovie.setLaunchDate(1970);
        myMovie.setMinutesOfStream(180);
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

        Series lost = new Series();
        lost.setName("Lost");
        lost.setLaunchDate(2000);
        lost.showUpValues();
        lost.setSeriesSeasons(12);
        lost.setEpisodesPerSeason(12);
        lost.setMinutesPerEpisode(50);
        System.out.println("Minutes Duration: " + lost.getMinutesOfStream());

        Movie anotherMovie = new Movie();
        anotherMovie.setName("Superhero Movie");
        anotherMovie.setLaunchDate(2002);
        anotherMovie.setMinutesOfStream(180);

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

    }

}