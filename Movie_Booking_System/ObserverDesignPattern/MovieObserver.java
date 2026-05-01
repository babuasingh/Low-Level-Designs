package Movie_Booking_System.ObserverDesignPattern;


import Movie_Booking_System.Entities.Movie;

// Every observer i.e the user needs to implment this
public interface MovieObserver {
    void update(Movie movie);
}
