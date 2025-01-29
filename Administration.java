import java.util.ArrayList;

public class Administration {

    public ArrayList<Member> memberList;
    public ArrayList<Event> eventList;
    public String clubName;


    Administration(String pClubName, ArrayList<Member> pMemberList, ArrayList<Event> pEventList) {
        memberList = pMemberList;
        eventList = pEventList;
        clubName = pClubName;
    }
}
