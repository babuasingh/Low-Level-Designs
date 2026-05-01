package Movie_Booking_System.Entities;

import Movie_Booking_System.ObserverDesignPattern.MovieObserver;

public class User implements MovieObserver {
    private String id;
    private String name;

    public String getId() {
        return id;
    }


    public String getName() {
        return name;
    }

    @Override
    public void update(Movie movie) {
        """
                Booking for the move {movie} has started . User {user} has been notified
                """.formatted("movie" , movie.getName())
                .formatted("user", name);
    }
}
