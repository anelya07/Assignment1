package entity;

public class LibraryMember extends Person {
    private int memberID;
    private int borrowedBooks;

    public LibraryMember(String name, String phone, int memberID) {
        super(name, phone);
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

    @Override
    public void getInfo(){
        System.out.println("Name: " + name + "; " + "MemberID: " + memberID + "; " + "Borrowed books: " + borrowedBooks);
    }

}
