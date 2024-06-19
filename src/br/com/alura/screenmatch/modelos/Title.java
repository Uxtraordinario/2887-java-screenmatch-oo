package br.com.alura.screenmatch.modelos;

public class Title {
    public String name;
    public int launchDate;
    public boolean Media;
    private boolean included;
    private double summarize;
    public int totalSummarize;
    public int minutesOfStream;
    public int yearOfRelease;

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
        System.out.println("Movie Title: " + name);
        System.out.println("Year of launch: " + launchDate);
    }

    public void feedback(double note){
        summarize += note;
        totalSummarize++;
    }

    public double getMedia(){
        return summarize / totalSummarize;
    }

    public String setMinutesOfStream() {
        this.minutesOfStream = minutesOfStream;
        return String.valueOf(minutesOfStream);
    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }

    public void setYearOfRelease(int yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }

    public int getMinutesOfStream() {
        return minutesOfStream;
    }

    public String getName() {
        return name;
    }
}
