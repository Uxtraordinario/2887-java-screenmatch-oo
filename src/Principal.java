import br.com.alura.screenmatch.modelos.Movie;

public class Principal {
    public static void main(String[] args) {
        Movie myMovie = new Movie();
        myMovie.setName("The godfather");
        myMovie.setLaunchDate(1970);
        myMovie.setMinutesOfStream(180);

        myMovie.showUpValues();

        myMovie.feedback(9);
        myMovie.feedback(8);
        myMovie.feedback(10);
        myMovie.feedback(7);
        myMovie.feedback(10);
        myMovie.feedback(6);
        myMovie.feedback(9);

        System.out.println("Total of Feedbacks:" + myMovie.getTotalSummarize);
        System.out.println(myMovie.Media);

    }
}