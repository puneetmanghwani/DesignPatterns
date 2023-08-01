package DesignQuestions.BookMyShow;

public class Movie {

    int movieId;

    String movieName;

    Integer movieDurationInMinutes;

    public int getMovieId() {
        return movieId;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public Integer getMovieDurationInMinutes() {
        return movieDurationInMinutes;
    }

    public void setMovieDurationInMinutes(Integer movieDurationInMinutes) {
        this.movieDurationInMinutes = movieDurationInMinutes;
    }
}
