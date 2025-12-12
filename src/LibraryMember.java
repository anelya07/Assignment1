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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getMemberID() {
        return memberID;
    }

    public void setMemberID(int memberID) {
        this.memberID = memberID;
    }

    public int getBorrowedBooks() {
        return borrowedBooks;
    }

    public void setBorrowedBooks(int borrowedBooks) {
        this.borrowedBooks = borrowedBooks;
    }

    public void getInfo(){
        System.out.println("Name: " + name);
        System.out.println("MemberID: " + memberID);
        System.out.println("Borrowed books: " + borrowedBooks);
    }

    public void borrowBook(){
        System.out.println("Borrowing Book");
        borrowedBooks++;
    }

    public void returnBook(){
        System.out.println("Returning Book");
        borrowedBooks--;
    }
}
