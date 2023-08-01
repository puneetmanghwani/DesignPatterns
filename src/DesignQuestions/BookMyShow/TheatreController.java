package DesignQuestions.BookMyShow;

import DesignQuestions.BookMyShow.enums.City;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TheatreController {
    Map<City, List<Theatre>> cityVsTheatre;

    List<Theatre> allTheatres;

    TheatreController(){
        this.cityVsTheatre = new HashMap<>();
        this.allTheatres = new ArrayList<>();
    }

    public void addTheatre(Theatre theatre, City city){
        allTheatres.add(theatre);

        List<Theatre> theatres = cityVsTheatre.getOrDefault(city, new ArrayList<>());
        theatres.add(theatre);

        cityVsTheatre.put(city, theatres);
    }

    public Map<Theatre, List<Show>> getAllShow(Movie movie, City city){
        Map<Theatre, List<Show>> theatreVsShow = new HashMap<>();

        List<Theatre> theatres = cityVsTheatre.get(city);

        for(Theatre theatre : theatres){
            List<Show> givenMovieShows = new ArrayList<>();
            List<Show> shows = theatre.getShows();
            for(Show show : shows){
                if(show.getMovie().getMovieId()==movie.getMovieId()){
                    givenMovieShows.add(show);
                }
            }
            if(!givenMovieShows.isEmpty()){
                theatreVsShow.put(theatre, givenMovieShows);
            }
        }

        return theatreVsShow;
    }
}
