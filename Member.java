import java.util.ArrayList;
import java.util.Date;

public class Member {

    private int memberId;
    private Date birthday;
    private String email;
    private String firstName;
    private String lastName;


    Member(int pMemberId, Date pBirthday, String pEmail, String pFirstName, String pLastName) {
        memberId = pMemberId;
        birthday = pBirthday;
        email = pEmail;
        firstName = pFirstName;
        lastName = pLastName;
    }


    private void toggleEventSignUpStatus(int eventId) throws NullPointerException{
        Administration administration = Administration.getInstance();
        ArrayList<Event> events = administration.getAvailableEvents();
        Event event=null;

        for (Event e : events) {
            if (e.eventId == eventId) event = e;
        }
        if (event == null) {
            throw new NullPointerException("Event not found");
        }
        if (event.members.contains(this)) {
            event.members.remove(this);
        } else event.members.add(this);
    }

    private void cancelMembership() {
        Administration administration = Administration.getInstance();
        administration.remove(this);
    }

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
