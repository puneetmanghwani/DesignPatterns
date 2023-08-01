package DesignQuestions.BookMyShow;

import DesignQuestions.BookMyShow.enums.City;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MovieController {
    Map<City, List<Movie>> cityVsMovie;

    List<Movie> allMovies;

    MovieController(){
        this.cityVsMovie = new HashMap<>();
        this.allMovies = new ArrayList<>();
    }

    public void addMovie(Movie movie, City city){
        allMovies.add(movie);
        List<Movie> movies = cityVsMovie.getOrDefault(city, new ArrayList<>());
        movies.add(movie);

        cityVsMovie.put(city, movies);

    }

    Movie getMovieByName(String movieName){
        for(Movie movie : allMovies){
            if(movie.getMovieName().equals(movieName)){
                return movie;
            }
        }

        return null;
    }

    List<Movie> getMoviesByCity(City city){
        return cityVsMovie.get(city);
    }
}
