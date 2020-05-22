package sk.itsovy.kutka;

public abstract class Observer {
    private Subject subject;

    public abstract void update();
}
