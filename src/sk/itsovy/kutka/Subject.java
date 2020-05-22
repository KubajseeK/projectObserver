package sk.itsovy.kutka;

import java.util.ArrayList;

public class Subject {
    private ArrayList<Observer> observerslist = new ArrayList<>();
    private int status;

    public void addObserver(Observer observer) {
        observerslist.add(observer);
    }

    public void notifyAllObservers() {
        for (Observer observer : observerslist) {
            observer.update();
        }
    }

    public void setStatus(int status) {
        this.status = status;
        notifyAllObservers();
    }

    public int getStatus() {
        return status;
    }
}
