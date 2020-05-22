package sk.itsovy.kutka;

public class Main {

    public static void main(String[] args) {
        Subject subject = new Subject();
        Example1 ex = new Example1(subject);
        Example2 ex2 = new Example2(subject);
        subject.setStatus(5);
        subject.setStatus(6);
    }
}
