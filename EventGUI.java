import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.Date;


public class EventGUI {

// Main menu

    private JFrame mainmenu;
    private JButton mitgliedverwaltung;
    private JButton eventverwaltung;

// Event management
    private JFrame eventmanagement;
    private JButton backtomainmenu_event;

    // Liste mit Events

    private JLabel event_name;
    private JLabel event_date;
    private JLabel event_id;
    private JTextArea event_liste;
    private JScrollPane event_list_scroll;

// Member management
    private JFrame membermanagement;
    private JButton backtomainmenu_member;

    // Liste mit Mitgliedern

    private JLabel mitglied_vorname;
    private JLabel mitglied_nachname;
    private JLabel mitglied_id;
    private JTextArea mitglied_liste;
    private JScrollPane mitglied_liste_scroll;


   // Mitglied löschen

    private JButton mitglied_loeschen;
    private JTextArea mitglieds_id_area;
    private JLabel mitglieds_id_area_label;
    private JButton mitglied_entgueltig_loeschen;


    // Mitglied anlegen

    private JButton mitglied_registrieren;
    private JTextArea mitglieds_vorname;
    private JTextArea mitglieds_nachname;
    private JTextArea mitglieds_geburtstag;
    private JTextArea mitglieds_eMail;
    private JLabel mitglieds_vorname_label;
    private JLabel mitglieds_nachname_label;
    private JLabel mitglieds_geburtstag_label;
    private JLabel mitglieds_eMail_label;
    private JButton mitglied_entgueltig_anlegen;




    public EventGUI(Administration admin) {

        mainmenu = new JFrame("Hauptmenü");
        mainmenu.setSize(200, 100);
        mainmenu.setLocationRelativeTo(null);
        mainmenu.setResizable(false);
        mainmenu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainmenu.setLayout(new FlowLayout());

        mitgliedverwaltung = new JButton("Mitgliedverwaltung");
        eventverwaltung = new JButton("  Eventverwaltung  ");


        // Eventverwaltung initalisieren

        eventmanagement = new JFrame("Eventverwaltung");
        eventmanagement.setSize(800, 500);
        eventmanagement.setLocationRelativeTo(null);
        eventmanagement.setResizable(false);
        eventmanagement.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        eventmanagement.setLayout(null);

        backtomainmenu_event = new JButton("Zurück");
        backtomainmenu_event.setBounds(10,10,75,30);

        event_name = new JLabel("Name");
        event_name.setBounds(12,50,100,30);
        event_date = new JLabel("Datum");
        event_date.setBounds(205,50,100,30);
        event_id = new JLabel("ID");
        event_id.setBounds(300,50,100,30);
        event_liste = new JTextArea();
        event_liste.setEditable(false);
        event_list_scroll = new JScrollPane(event_liste);
        event_list_scroll.setBounds(10,75,320,390);



        // Membermanagement initialisierung

        membermanagement = new JFrame("Mitgliedsverwaltung");
        membermanagement.setSize(800, 500);
        membermanagement.setLocationRelativeTo(null);
        membermanagement.setResizable(false);
        membermanagement.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        membermanagement.setLayout(null);

        mitglied_registrieren = new JButton("Mitglied registrieren");
        mitglied_registrieren.setBounds(350,10,200,35);
        mitglied_loeschen = new JButton("Mitglied entfernen");
        mitglied_loeschen.setBounds(550,10,200,35);
        backtomainmenu_member = new JButton("Zurück");
        backtomainmenu_member.setBounds(10,10,75,30);
        mitglied_liste = new JTextArea();
        mitglied_liste.setEditable(false);
        mitglied_liste_scroll = new JScrollPane(mitglied_liste);
        mitglied_liste_scroll.setBounds(10,75,300,390);
        mitglied_vorname = new JLabel("Vorname");
        mitglied_vorname.setBounds(10,50,100,30);
        mitglied_nachname = new JLabel("Nachname");
        mitglied_nachname.setBounds(108,50,100,30);
        mitglied_id = new JLabel("Mitglieds ID");
        mitglied_id.setBounds(204,50,100,30);
        mitglieds_id_area = new JTextArea();
        mitglieds_id_area.setEditable(true);
        mitglieds_id_area.setBounds(500,100,50,15);
        mitglieds_id_area_label = new JLabel("Mitglieds ID:");
        mitglieds_id_area_label.setBounds(400,100,100,15);
        mitglied_entgueltig_loeschen  = new JButton("Mitglied entfernen");
        mitglied_entgueltig_loeschen.setBounds(400,125,200,30);


        // Mitglieder anlegen
        mitglieds_vorname = new JTextArea();
        mitglieds_vorname.setEditable(true);
        mitglieds_vorname.setBounds(450,100,200,15);
        mitglieds_nachname = new JTextArea();
        mitglieds_nachname.setEditable(true);
        mitglieds_nachname.setBounds(450,150,200,15);
        mitglieds_geburtstag = new JTextArea();
        mitglieds_geburtstag.setEditable(true);
        mitglieds_geburtstag.setBounds(450,200,200,15);
        mitglieds_eMail = new JTextArea();
        mitglieds_eMail.setEditable(true);
        mitglieds_eMail.setBounds(450,250,200,15);
        mitglieds_vorname_label = new JLabel("Vorname:");
        mitglieds_vorname_label.setBounds(375,90,100,30);
        mitglieds_nachname_label = new JLabel("Nachname:");
        mitglieds_nachname_label.setBounds(375,140,100,30);
        mitglieds_geburtstag_label = new JLabel("Geburtstag:");
        mitglieds_geburtstag_label.setBounds(375,190,100,30);
        mitglieds_eMail_label = new JLabel("Mail:");
        mitglieds_eMail_label.setBounds(375,240,100,30);
        mitglied_entgueltig_anlegen = new JButton("Mitglied anlegen");
        mitglied_entgueltig_anlegen.setBounds(410,300,200,30);



        // Action Listener für die einzelnen Buttons


        // Hauptmenü Buttons
        mitgliedverwaltung.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mainmenu.setVisible(false);
                mitglieds_id_area.setVisible(false);
                mitglieds_id_area_label.setVisible(false);
                mitglied_entgueltig_loeschen.setVisible(false);

                mitglieds_vorname.setVisible(false);
                mitglieds_nachname.setVisible(false);
                mitglieds_geburtstag.setVisible(false);
                mitglieds_eMail.setVisible(false);
                mitglieds_eMail_label.setVisible(false);
                mitglieds_vorname_label.setVisible(false);
                mitglieds_nachname_label.setVisible(false);
                mitglieds_geburtstag_label.setVisible(false);
                mitglied_entgueltig_anlegen.setVisible(false);


                mitglied_liste.setText("");
                for(int i = 0; i < admin.memberList.size(); i++){
                    mitglied_liste.append(admin.memberList.get(i).getFirstName() + "\t" + admin.memberList.get(i).getLastName() + "\t" + admin.memberList.get(i).getMemberId() + "\n");
                }


                membermanagement.setVisible(true);
            }
        });

        eventverwaltung.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mainmenu.setVisible(false);

                event_liste.setText("");
                for(int i = 0; i < admin.eventList.size(); i++){
                    event_liste.append(admin.eventList.get(i).name + "\t" + admin.eventList.get(i).date + "\t" + admin.eventList.get(i).eventId + "\n");
                }

                eventmanagement.setVisible(true);
            }
        });



        // Mitgliedsverwaltungs Buttons

        mitglied_registrieren.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                mitglieds_id_area.setVisible(false);
                mitglieds_id_area_label.setVisible(false);
                mitglied_entgueltig_loeschen.setVisible(false);

                mitglieds_vorname.setVisible(true);
                mitglieds_nachname.setVisible(true);
                mitglieds_geburtstag.setVisible(true);
                mitglieds_eMail.setVisible(true);
                mitglieds_eMail_label.setVisible(true);
                mitglieds_vorname_label.setVisible(true);
                mitglieds_nachname_label.setVisible(true);
                mitglieds_geburtstag_label.setVisible(true);
                mitglied_entgueltig_anlegen.setVisible(true);

            }
        });

        mitglied_loeschen.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                mitglieds_vorname.setVisible(false);
                mitglieds_nachname.setVisible(false);
                mitglieds_geburtstag.setVisible(false);
                mitglieds_eMail.setVisible(false);
                mitglieds_eMail_label.setVisible(false);
                mitglieds_vorname_label.setVisible(false);
                mitglieds_nachname_label.setVisible(false);
                mitglieds_geburtstag_label.setVisible(false);
                mitglied_entgueltig_anlegen.setVisible(false);

                mitglieds_id_area.setVisible(true);
                mitglieds_id_area_label.setVisible(true);
                mitglied_entgueltig_loeschen.setVisible(true);
            }
        });



        backtomainmenu_member.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                membermanagement.setVisible(false);
                mainmenu.setVisible(true);
            }
        });

        mitglied_entgueltig_loeschen.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                int mitglieds_id = Integer.parseInt(mitglieds_id_area.getText());

                admin.remove(mitglieds_id);

                mitglied_liste.setText("");
                for(int i = 0; i < admin.memberList.size(); i++){
                    mitglied_liste.append(admin.memberList.get(i).getFirstName() + "\t" + admin.memberList.get(i).getLastName() + "\t" + admin.memberList.get(i).getMemberId() + "\n");
                }


            }
        });

        mitglied_entgueltig_anlegen.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                admin.register(mitglieds_vorname.getText(),mitglieds_nachname.getText(),mitglieds_eMail.getText(),Date.valueOf(mitglieds_geburtstag.getText()));

                mitglied_liste.setText("");
                for(int i = 0; i < admin.memberList.size(); i++){
                    mitglied_liste.append(admin.memberList.get(i).getFirstName() + "\t" + admin.memberList.get(i).getLastName() + "\t" + admin.memberList.get(i).getMemberId() + "\n");
                }
            }
        });


        // Buttons fürs Eventmanagement

        backtomainmenu_event.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                eventmanagement.setVisible(false);
                mainmenu.setVisible(true);
            }
        });


        // Key Listener für die Felder
        mitglieds_id_area.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent ke) {
                String value = mitglieds_id_area.getText();
                int l = value.length();
                if (ke.getKeyChar() >= '0' && ke.getKeyChar() <= '9') {
                    mitglieds_id_area.setEditable(true);
                } else {
                    mitglieds_id_area.setEditable(false);
                    mitglieds_id_area.setText("");
                }
            }
        });






        // Frames füllen



        // Main menu füllen
        mainmenu.add(mitgliedverwaltung);
        mainmenu.add(eventverwaltung);
        mainmenu.setVisible(true);

        // Eventmanagement füllen
        eventmanagement.add(backtomainmenu_event);
        eventmanagement.add(event_id);
        eventmanagement.add(event_name);
        eventmanagement.add(event_date);
        eventmanagement.add(event_list_scroll);



        // Membermanagement füllen

        membermanagement.add(backtomainmenu_member);
        membermanagement.add(new JLabel (""));
        membermanagement.add(mitglied_loeschen);
        membermanagement.add(mitglied_registrieren);
        membermanagement.add(mitglied_liste_scroll);
        membermanagement.add(mitglied_vorname);
        membermanagement.add(mitglied_nachname);
        membermanagement.add(mitglied_id);
        membermanagement.add(mitglieds_id_area);
        membermanagement.add(mitglieds_id_area_label);
        membermanagement.add(mitglied_entgueltig_loeschen);
        membermanagement.add(mitglieds_vorname);
        membermanagement.add(mitglieds_nachname);
        membermanagement.add(mitglieds_geburtstag);
        membermanagement.add(mitglieds_eMail);
        membermanagement.add(mitglieds_vorname_label);
        membermanagement.add(mitglieds_nachname_label);
        membermanagement.add(mitglieds_geburtstag_label);
        membermanagement.add(mitglieds_eMail_label);
        membermanagement.add(mitglied_entgueltig_anlegen);



    }
}
