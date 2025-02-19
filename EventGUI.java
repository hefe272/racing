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

// Member management
    private JFrame membermanagement;
    private JButton backtomainmenu_member;

    // Liste mit Mitgliedern

    private JLabel vorname;
    private JLabel nachname;
    private JLabel mitglieds_id;
    private JTextArea mitgliederfeld;
    private JScrollPane mitgliederlisteScrollPane;

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
        mitgliederfeld = new JTextArea();
        mitgliederfeld.setEditable(false);
        mitgliederlisteScrollPane = new JScrollPane(mitgliederfeld);
        mitgliederlisteScrollPane.setBounds(10,75,300,390);
        vorname = new JLabel("Vorname");
        vorname.setBounds(10,50,100,30);
        nachname = new JLabel("Nachname");
        nachname.setBounds(108,50,100,30);
        mitglieds_id = new JLabel("Mitglieds ID");
        mitglieds_id.setBounds(204,50,100,30);
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


                for(int i = 0; i < admin.memberList.size(); i++){
                    mitgliederfeld.append(admin.memberList.get(i).getFirstName() + "\t" + admin.memberList.get(i).getLastName() + "\t" + admin.memberList.get(i).getMemberId() + "\n");
                }


                membermanagement.setVisible(true);
            }
        });

        eventverwaltung.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mainmenu.setVisible(false);
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

                mitgliederfeld.setText("");
                for(int i = 0; i < admin.memberList.size(); i++){
                    mitgliederfeld.append(admin.memberList.get(i).getFirstName() + "\t" + admin.memberList.get(i).getLastName() + "\t" + admin.memberList.get(i).getMemberId() + "\n");
                }


            }
        });

        mitglied_entgueltig_anlegen.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                admin.register(mitglieds_vorname.getText(),mitglieds_nachname.getText(),mitglieds_eMail.getText(),Date.valueOf(mitglieds_geburtstag.getText()));

                mitgliederfeld.setText("");
                for(int i = 0; i < admin.memberList.size(); i++){
                    mitgliederfeld.append(admin.memberList.get(i).getFirstName() + "\t" + admin.memberList.get(i).getLastName() + "\t" + admin.memberList.get(i).getMemberId() + "\n");
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




        // Membermanagement füllen

        membermanagement.add(backtomainmenu_member);
        membermanagement.add(new JLabel (""));
        membermanagement.add(mitglied_loeschen);
        membermanagement.add(mitglied_registrieren);
        membermanagement.add(mitgliederlisteScrollPane);
        membermanagement.add(vorname);
        membermanagement.add(nachname);
        membermanagement.add(mitglieds_id);
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
