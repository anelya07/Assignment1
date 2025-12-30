package service;

public class Extend implements BookService {

    @Override
    public void process(boolean status) {
        if (status) {
            System.out.println("Loan period successfully extended.");
        }
        else {
            System.out.println("Extension failed: no active loan found.");
        }
    }
}
