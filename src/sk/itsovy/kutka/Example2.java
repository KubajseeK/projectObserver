package sk.itsovy.kutka;

public class Example2 extends Observer {
    private Subject subject;

    public Example2(Subject subject) {
        this.subject = subject;
        this.subject.addObserver(this);
    }

    @Override
    public void update() {
        System.out.println("Example 2: " + subject.getStatus());
    }
}
