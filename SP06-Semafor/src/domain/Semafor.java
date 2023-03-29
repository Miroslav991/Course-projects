package domain;

import java.util.ArrayList;
import java.util.List;
import observer.ObserveLight;

/**
 *
 * @author Miroslav Kološnjaji
 */
public class Semafor {

    private static final Semafor instance = new Semafor();
    private boolean ukljucen;
    private Signal signal;
    private Status status;
    private List<ObserveLight> observers;

    private Semafor() {
        this.observers = new ArrayList<>();
        status = StatusFactory.vratiStatus(getSignal());
    }

    public static Semafor getInstance() {
        return instance;
    }

    public void changeColor() {
        status.changeColor(this);
        updateLight();
    }

    public boolean isUkljucen() {
        return ukljucen;
    }

    public void setUkljucen(boolean ukljucen) {
        this.ukljucen = ukljucen;
    }

    public Signal getSignal() {
        return signal;
    }

    public void setSignal(Signal signal) {
        this.signal = signal;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }


    public void addObserver(ObserveLight observer) {
        observers.add(observer);
    }

    public void updateLight() {
        for (ObserveLight observer : observers) {
            observer.updateStatus();
        }
    }

    @Override
    public String toString() {
        String statString = getStatus().getClass().getName();
        return "Semafor { " + "ukljucen: " + ukljucen + ", signal: " + signal + ", status: " + statString.substring(7, statString.length()).toUpperCase() + " }";
    }

}
