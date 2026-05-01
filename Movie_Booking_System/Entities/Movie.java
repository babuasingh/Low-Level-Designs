package Movie_Booking_System.Entities;

import Movie_Booking_System.ObserverDesignPattern.MovieObserver;
import Movie_Booking_System.ObserverDesignPattern.MovieSubject;

import java.util.ArrayList;
import java.util.List;

public class Movie implements MovieSubject {

    private String name;
    private String genre;
    private int durationInMinutes;
    private List<MovieObserver> observers;

    public Movie(String name, String genre, int durationInMinutes) {
        this.name = name;
        this.genre = genre;
        this.durationInMinutes = durationInMinutes;
        observers = new ArrayList<>();
    }

    public String getName() {
        return name;
    }


    public String getGenre() {
        return genre;
    }


    public int getDurationInMinutes() {
        return durationInMinutes;
    }


    @Override
    public void addObserver(MovieObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(MovieObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyAllObservers() {
        for(MovieObserver movieObserver:observers){
            movieObserver.update(this);
        }
    }
}
