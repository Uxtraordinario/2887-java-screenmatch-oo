package br.com.alura.screenmatch.modelos;

public class Series extends Title {
    public int seriesSeasons;
    public int episodesPerSeason;
    public int minutesPerEpisode;


    public Series(int launchDate, String name, String movieGenre , int minutesPerEpisode) {
        super(launchDate, name, movieGenre, minutesPerEpisode);
    }


    public void setSeriesSeasons(int seriesSeasons) {
        this.seriesSeasons = seriesSeasons;
    }

    public void setEpisodesPerSeason(int episodesPerSeason) {
        this.episodesPerSeason = episodesPerSeason;
    }

    public void setMinutesPerEpisode(int minutesPerEpisode) {
        this.minutesPerEpisode = minutesPerEpisode;
    }

    @Override
    public int getMinutesOfStream() {
        return seriesSeasons * episodesPerSeason * minutesPerEpisode;
    }

    @Override
    public String toString() {
        return "Series " + this.getName() + " (" + this.launchDate + ") ";
    }


}


