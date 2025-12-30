package service;

public class Reserve implements BookService {

    @Override
    public void process(boolean status) {
        if (status) {
            System.out.println("Book reservation successful.");
        }
        else  {
            System.out.println("Reservation failed: book is not available.");
        }
    }
}