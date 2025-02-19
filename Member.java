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
