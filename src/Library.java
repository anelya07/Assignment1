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
    }

    public void addBook(){
        System.out.println("Adding Book");
        numberOfBooks++;
    }

    public void returnBook(){
        System.out.println("Returning Book");
        numberOfBooks--;
    }
}

