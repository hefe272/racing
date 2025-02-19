import java.sql.Date;

public class Main {
    public static void main(String[] args) {

        Administration admin = new Administration("Toller Club");



        // Mitglieder Anfang
        admin.register("Jack", "Mehoff", "jack@mail.de", Date.valueOf("1995-03-12"));
        admin.register("John", "Doe", "john.doe@mail.de", Date.valueOf("1990-05-15"));
        admin.register("Jane", "Doe", "jane.doe@mail.de", Date.valueOf("1992-07-22"));
        admin.register("Alice", "Smith", "alice.smith@mail.de", Date.valueOf("1988-11-30"));
        admin.register("Bob", "Johnson", "bob.johnson@mail.de", Date.valueOf("1994-02-25"));
        admin.register("Charlie", "Brown", "charlie.brown@mail.de", Date.valueOf("1993-08-19"));
        admin.register("David", "Miller", "david.miller@mail.de", Date.valueOf("1987-12-10"));
        admin.register("Emma", "Wilson", "emma.wilson@mail.de", Date.valueOf("1991-04-05"));
        admin.register("Frank", "Moore", "frank.moore@mail.de", Date.valueOf("1989-06-14"));
        admin.register("Grace", "Taylor", "grace.taylor@mail.de", Date.valueOf("1996-09-21"));
        admin.register("Hank", "Anderson", "hank.anderson@mail.de", Date.valueOf("1990-01-17"));
        admin.register("Ivy", "Thomas", "ivy.thomas@mail.de", Date.valueOf("1993-03-29"));
        admin.register("Jack", "White", "jack.white@mail.de", Date.valueOf("1985-07-07"));
        admin.register("Kara", "Harris", "kara.harris@mail.de", Date.valueOf("1997-10-11"));
        admin.register("Leo", "Martin", "leo.martin@mail.de", Date.valueOf("1992-12-20"));
        admin.register("Mia", "Thompson", "mia.thompson@mail.de", Date.valueOf("1994-11-01"));
        admin.register("Noah", "Garcia", "noah.garcia@mail.de", Date.valueOf("1986-05-09"));
        admin.register("Olivia", "Martinez", "olivia.martinez@mail.de", Date.valueOf("1998-08-08"));
        admin.register("Paul", "Robinson", "paul.robinson@mail.de", Date.valueOf("1995-02-18"));
        admin.register("Quinn", "Clark", "quinn.clark@mail.de", Date.valueOf("1988-06-23"));
        admin.register("Rachel", "Rodriguez", "rachel.rodriguez@mail.de", Date.valueOf("1990-09-12"));
        admin.register("Sam", "Lewis", "sam.lewis@mail.de", Date.valueOf("1993-04-15"));
        admin.register("Tina", "Walker", "tina.walker@mail.de", Date.valueOf("1997-07-30"));
        admin.register("Uwe", "Hall", "uwe.hall@mail.de", Date.valueOf("1985-10-05"));
        admin.register("Vera", "Allen", "vera.allen@mail.de", Date.valueOf("1991-01-25"));
        admin.register("Will", "Young", "will.young@mail.de", Date.valueOf("1994-03-16"));
        admin.register("Xenia", "King", "xenia.king@mail.de", Date.valueOf("1996-12-28"));
        admin.register("Yannick", "Scott", "yannick.scott@mail.de", Date.valueOf("1992-07-14"));
        admin.register("Zoe", "Adams", "zoe.adams@mail.de", Date.valueOf("1987-09-02"));
        admin.register("Aaron", "Baker", "aaron.baker@mail.de", Date.valueOf("1990-05-20"));

        // Mitglieder Ende


        // Training Anfang

        admin.createEvent("Bobs Folterrunde", Date.valueOf("2025-03-14"), "Volleyball");
        admin.createEvent("Marias Marathon", Date.valueOf("2025-04-20"), "Laufen");
        admin.createEvent("Karls Kletterkampf", Date.valueOf("2025-05-05"), "Klettern");
        admin.createEvent("Simones Schwimmshow", Date.valueOf("2025-06-10"), "Schwimmen");
        admin.createEvent("Toms Tischtennis-Turnier", Date.valueOf("2025-07-15"), "Tischtennis");
        admin.createEvent("Laras Langstreckenlauf", Date.valueOf("2025-08-22"), "Laufen");
        admin.createEvent("Kevins Kraftkampf", Date.valueOf("2025-09-30"), "Gewichtheben");
        admin.createEvent("Peters Pokerparty", Date.valueOf("2025-10-12"), "Poker");
        admin.createEvent("Sarahs Schachschlacht", Date.valueOf("2025-11-08"), "Schach");
        admin.createEvent("Alex' Abenteuerlauf", Date.valueOf("2025-12-01"), "Hindernislauf");

        // Training Ende

        // Tournament Anfang

        admin.createEvent("Rüdigers Ringerrunde", Date.valueOf("2025-11-20"), 10);
        admin.createEvent("Eriks Eisbrecher-Challenge", Date.valueOf("2025-02-28"), 16);
        admin.createEvent("Franziskas Fitness-Finale", Date.valueOf("2025-03-25"), 20);
        admin.createEvent("Lukes Lasterlauf", Date.valueOf("2025-04-15"), 30);
        admin.createEvent("Ninas Ninja-Nacht", Date.valueOf("2025-05-10"), 12);
        admin.createEvent("Robins Ruder-Rennen", Date.valueOf("2025-06-05"), 10);
        admin.createEvent("Tinas Turm-Triathlon", Date.valueOf("2025-07-22"), 18);
        admin.createEvent("Victors Volleyball-Vulkan", Date.valueOf("2025-08-30"), 14);
        admin.createEvent("Svenjas Speed-Schach", Date.valueOf("2025-09-18"), 8);
        admin.createEvent("Mickys Muskel-Match", Date.valueOf("2025-10-08"), 25);
        admin.createEvent("Jessis Judo-Jubiläum", Date.valueOf("2025-11-29"), 6);

        // Tournament Ende



        admin.getEventList();


        System.out.println("Test");
    }
}

