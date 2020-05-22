package sk.itsovy.kutka;

public class Example1 extends Observer {
    private Subject subject;

    public Example1(Subject subject) {
        this.subject = subject;
        this.subject.addObserver(this);
    }

    @Override
    public void update() {
        System.out.println("Status: " + subject.getStatus());
    }
}
