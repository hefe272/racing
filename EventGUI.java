import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class EventGUI {
    private JFrame mainmenu;
    private JButton mitgliedsverwaltung;


    private JFrame membermanagement;
    private JButton mitglied_registrieren;
    private JButton mitglied_loeschen;
    private JButton backtomainmenu;

    private JTextArea mitgliederfeld;

    public EventGUI(Administration administration) {

        mainmenu = new JFrame("Hauptmenü");
        mainmenu.setSize(200, 200);
        mainmenu.setLocationRelativeTo(null);
        mainmenu.setResizable(false);
        mainmenu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainmenu.setLayout(new FlowLayout());

        mitgliedsverwaltung = new JButton("Mitgliedsverwaltung");



        membermanagement = new JFrame("Mitgliedsverwaltung");
        membermanagement.setSize(800, 500);
        membermanagement.setLocationRelativeTo(null);
        membermanagement.setResizable(false);
        membermanagement.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        membermanagement.setLayout(null);

        mitglied_registrieren = new JButton("Mitglied registrieren");
        mitglied_registrieren.setBounds(300,10,200,35);
        mitglied_loeschen = new JButton("Mitglied entfernen");
        mitglied_loeschen.setBounds(500,10,200,35);
        backtomainmenu = new JButton("Zurück");
        backtomainmenu.setBounds(10,10,75,30);
        mitgliederfeld = new JTextArea();
        mitgliederfeld.setEditable(false);
        mitgliederfeld.setBounds(200,200,300,200);







        // Action Listener für die einzelnen Buttons


        // Hauptmenü Buttons
        mitgliedsverwaltung.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mainmenu.setVisible(false);


                for(int i = 0; i < 0; i++){

                }


                membermanagement.setVisible(true);
            }
        });


        // Mitgliedsverwaltungs Buttons

        mitglied_registrieren.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            }
        });

        mitglied_loeschen.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            }
        });



        backtomainmenu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                membermanagement.setVisible(false);
                mainmenu.setVisible(true);
            }
        });



        // Frames füllen


        membermanagement.add(backtomainmenu);
        membermanagement.add(new JLabel (""));
        membermanagement.add(mitglied_loeschen);
        membermanagement.add(mitglied_registrieren);
        membermanagement.add(mitgliederfeld);
        mainmenu.add(mitgliedsverwaltung);


        mainmenu.setVisible(true);
    }
}
