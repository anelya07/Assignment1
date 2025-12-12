public class Library {
    private String libraryName;
    private String address;
    private int numberOfBooks;

    public Library(String libraryName, String address, int numberOfBooks) {
        this.libraryName = libraryName;
        this.address = address;
        this.numberOfBooks = numberOfBooks;
    }

    public String getLibraryName() {
        return libraryName;
    }

    public void setLibraryName(String libraryName) {
        this.libraryName = libraryName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getNumberOfBooks() {
        return numberOfBooks;
    }

    public void setNumberOfBooks(int numberOfBooks) {
        this.numberOfBooks = numberOfBooks;
    }

    public void getInfo(){
        System.out.println("Library Name: " + libraryName);
        System.out.println("Address: " + address);
        System.out.println("Number of Books: " + numberOfBooks);
    }

    public void addBook(int amount){
        System.out.println("Adding " + amount + " books!");
        numberOfBooks += amount;
        System.out.println("Total: " + numberOfBooks);
    }

    public void removeBook(int amount){
        System.out.println("Removing " + amount + " books!");
        if(numberOfBooks >= amount){
            numberOfBooks -= amount;
            System.out.println("Total: " + numberOfBooks);
        }
    }
}

