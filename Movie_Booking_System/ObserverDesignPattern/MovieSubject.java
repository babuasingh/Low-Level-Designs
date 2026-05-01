package Movie_Booking_System.ObserverDesignPattern;

import java.util.List;

public interface MovieSubject {
    void addObserver(MovieObserver observer);

    void removeObserver(MovieObserver observer);

    void notifyAllObservers();
}
