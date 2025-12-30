package service;

public class Main {
    public static void main(String[] args) {
        BookService service1 = new Extend();
        BookService service2 = new Reserve();

        service1.process(true);
        service2.process(false);
    }
}
