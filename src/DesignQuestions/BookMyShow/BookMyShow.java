package DesignQuestions.BookMyShow;

import DesignQuestions.BookMyShow.enums.City;
import DesignQuestions.BookMyShow.enums.SeatCategory;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class BookMyShow {
    MovieController movieController;

    TheatreController theatreController;

    public BookMyShow(){
        this.movieController = new MovieController();
        this.theatreController = new TheatreController();
    }

    public static void main(String args[]){
        BookMyShow bookMyShow = new BookMyShow();
        bookMyShow.initialize();

        //user1
        bookMyShow.createBooking(City.Bangalore, "BAAHUBALI");
        //user2
        bookMyShow.createBooking(City.Bangalore, "BAAHUBALI");
    }

    private void initialize(){
        createMovies();
        createTheatres();


    }

    public void createBooking(City city, String movieName){
        List<Movie> movies = movieController.getMoviesByCity(city);

        Movie interestedMovie = null;

        for(Movie movie : movies){
            if(movie.getMovieName().equals(movieName)){
                interestedMovie = movie;
            }
        }

        Map<Theatre, List<Show>> showTheatreWise = theatreController.getAllShow(interestedMovie, city);
        Map.Entry<Theatre, List<Show>> entry =  showTheatreWise.entrySet().iterator().next();
        List<Show> shows = entry.getValue();
        Show intrestedShow = shows.get(0);

        int seatNumber = 30;
        List<Integer> bookedSeats = intrestedShow.getBookedSeatIds();

        if(!bookedSeats.contains(seatNumber)){
            bookedSeats.add(seatNumber);
            Booking booking = new Booking();
            List<Seat> myBookedSeats = new ArrayList<>();

            for(Seat seat : intrestedShow.getScreen().getSeats()){
                if(seat.seatId==seatNumber){
                    myBookedSeats.add(seat);
                }
            }
            booking.setBookedSeats(myBookedSeats);
            booking.setShow(intrestedShow);
        } else {
            System.out.println("Seat already booked");
            return;
        }

        System.out.println("BOOKING SUCCESSFUL");
    }

    public void createTheatres(){
        Movie avengerMovie = movieController.getMovieByName("AVENGERS");
        Movie baahubali = movieController.getMovieByName("BAAHUBALI");

        Theatre inoxTheatre = new Theatre();
        inoxTheatre.setTheatreId(1);
        inoxTheatre.setScreens(createScreens());
        inoxTheatre.setCity(City.Bangalore);

        List<Show> inoxShows = new ArrayList<>();
        Show inoxMorningShow = createShows(1, inoxTheatre.getScreens().get(0), avengerMovie, 8);
        Show inoxEveningShow = createShows(2, inoxTheatre.getScreens().get(0), baahubali, 16);

        inoxShows.add(inoxMorningShow);
        inoxShows.add(inoxEveningShow);

        inoxTheatre.setShows(inoxShows);

        Theatre pvrTheatre = new Theatre();
        pvrTheatre.setTheatreId(2);
        pvrTheatre.setScreens(createScreens());
        pvrTheatre.setCity(City.Delhi);
        List<Show> pvrShows = new ArrayList<>();
        Show pvrMorningShow = createShows(3, pvrTheatre.getScreens().get(0), avengerMovie, 13);
        Show pvrEveningShow = createShows(4, pvrTheatre.getScreens().get(0), baahubali, 20);
        pvrShows.add(pvrMorningShow);
        pvrShows.add(pvrEveningShow);
        pvrTheatre.setShows(pvrShows);

        theatreController.addTheatre(inoxTheatre, City.Bangalore);
        theatreController.addTheatre(pvrTheatre, City.Delhi);
    }

    public Show createShows(int showId, Screen screen, Movie movie, int showStartTime){
        Show show = new Show();
        show.setShowId(showId);
        show.setMovie(movie);
        show.setScreen(screen);
        show.setShowStartTime(showStartTime);

        return show;
    }

    private List<Screen> createScreens(){
        List<Screen> screens = new ArrayList<>();
        Screen screen1 = new Screen();
        screen1.setScreenId(1);
        screen1.setSeats(createSeats());
        screens.add(screen1);
        return screens;
    }

    private List<Seat> createSeats(){
        List<Seat> seats = new ArrayList<>();

        //1 to 40 : SILVER
        for (int i = 0; i < 40; i++) {
            Seat seat = new Seat();
            seat.setSeatId(i);
            seat.setSeatCategory(SeatCategory.SILVER);
            seats.add(seat);
        }

        //41 to 70 : SILVER
        for (int i = 40; i < 70; i++) {
            Seat seat = new Seat();
            seat.setSeatId(i);
            seat.setSeatCategory(SeatCategory.GOLD);
            seats.add(seat);
        }

        //1 to 40 : SILVER
        for (int i = 70; i < 100; i++) {
            Seat seat = new Seat();
            seat.setSeatId(i);
            seat.setSeatCategory(SeatCategory.PLATINUM);
            seats.add(seat);
        }

        return seats;
    }

    private void createMovies(){
        Movie avengers = new Movie();
        avengers.setMovieId(1);
        avengers.setMovieName("AVENGERS");
        avengers.setMovieDurationInMinutes(128);

        //create Movies2
        Movie baahubali = new Movie();
        baahubali.setMovieId(2);
        baahubali.setMovieName("BAAHUBALI");
        baahubali.setMovieDurationInMinutes(180);

        movieController.addMovie(avengers, City.Bangalore);
        movieController.addMovie(avengers, City.Delhi);
        movieController.addMovie(baahubali, City.Bangalore);
        movieController.addMovie(baahubali, City.Delhi);
    }
}
