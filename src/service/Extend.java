package service;

public class Extend implements BookService {

    @Override
    public void process(boolean status) {
        if (status) {
            System.out.println("Loan extended.");
        }
        else {
            System.out.println("No active loans.");
        }
    }
}
