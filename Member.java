import java.util.Date;

public class Member {

    public int memberId;
    private Date birthday;
    private String email;
    private String firstName;
    private String lastName;


    Member(int pMemberId, Date pBirthday, String pEmail, String pFirstName, String pLastName){
        memberId = pMemberId;
        birthday = pBirthday;
        email = pEmail;
        firstName = pFirstName;
    }


    private void toggleEventSignUpStatus(int memberId, int eventId){

    }

    private void cancelMembership(){

    }




}
