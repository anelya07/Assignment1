public class LibraryMember {
    private String name;
    private String phone;
    private int memberID;
    private int borrowedBooks;

    public LibraryMember(String name, String phone, int memberID, int borrowedBooks) {
        this.name = name;
        this.phone = phone;
        this.memberID = memberID;
        this.borrowedBooks = 0;
    }
}
