import entity.*;
import service.*;

public class Main {
    public static void main(String[] args) {

        Library library = new Library("Central Library", "Kabanbay batyr Avenue 24, Astana");
        LibraryMember member = new LibraryMember("Anelya", "+7 746 246 4565", 77);

        MyApplication app = new MyApplication(library, member);
        app.start();
    }
}
