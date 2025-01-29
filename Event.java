import java.util.ArrayList;
import java.util.Date;

public class Event {

    public int eventId;
    public String name;
    public Date date;
    public ArrayList<Member> members;

    Event(int pEventId, String pName, Date pDate, ArrayList<Member> pMembers) {
        eventId = pEventId;
        name = pName;
        date = pDate;
        members = pMembers;
    }


}
