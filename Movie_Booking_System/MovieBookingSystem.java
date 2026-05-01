package Movie_Booking_System;


import Movie_Booking_System.Entities.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class MovieBookingSystem {

    private static volatile MovieBookingSystem movieBookingSystem;

    private Map<String, Movie> moviesMap;
    private Map<String, Show> showsMap;
    private Map<String, Threatre> threatreMap;
    private Map<String, User> userMap;

    private MovieBookingSystem(){
        moviesMap=new ConcurrentHashMap<>();
        showsMap=new ConcurrentHashMap<>();
        threatreMap=new ConcurrentHashMap<>();
        userMap=new ConcurrentHashMap<>();
    }

    public static MovieBookingSystem getInstance(){
        if(movieBookingSystem==null){  // the outer check is to make sure if multiple threads access request then once after the instance is initialized we dont want every thead to acquire the lock . Unnecessary overhead .
            synchronized (MovieBookingSystem.class) {
                if(movieBookingSystem==null) { // the inner check to make sure a previous thread already initialized it .
                    movieBookingSystem = new MovieBookingSystem();
                }
            }
        }
        return movieBookingSystem;
    }

    // add threaters
    // add movies
    // add show


    public List<Show> getAllShowsForAMovie(String movieName , String city){
        return showsMap.values().stream().filter(
                x-> x.getMovie().getName().equalsIgnoreCase(movieName)
        ).filter(
                x-> x.getScreen().getThreatre().getLocation().getCity().equalsIgnoreCase(city)
        ).toList();
    }



}
