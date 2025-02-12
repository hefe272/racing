import java.sql.Date;

public class Main {
    public static void main(String[] args) {

        Administration admin = new Administration("Toller Club");
        admin.register("Jack", "Mehoff", "jack@mail.de", Date.valueOf("1995-03-12"));
        admin.createEvent("Bobs Folterrunde", Date.valueOf("2025-03-14"));
        admin.createEvent("Bobs Folterrunde2", Date.valueOf("2025-03-14"));
        System.out.println("Test");
    }
}