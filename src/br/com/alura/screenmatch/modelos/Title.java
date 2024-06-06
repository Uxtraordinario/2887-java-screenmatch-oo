package br.com.alura.screenmatch.modelos;

public class Title {
    public String name;
    public int launchDate;
    public boolean Media;
    public String getTotalSummarize;
    private boolean included;
    private double summarize;
    private int totalSummarize;
    public int minutesOfStream;

    public int getTotalSummarize(){
        return getTotalSummarize();
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

    public void showUpValues(){
        System.out.println("Movie br.com.alura.screenmatch.modelos.Title: " + name);
        System.out.println("Year of launch: " + launchDate);
    }

    public void feedback(double note){
        summarize += note;
        totalSummarize++;
    }

    public double getMedia(){
        return summarize / totalSummarize;
    }
}
