import java.util.ArrayList;
import java.util.Date;

public class Event {

    public int eventId;
    public String name;
    public Date date;
    public ArrayList<Integer> memberIds;

    Event(int pEventId, String pName, Date pDate) {
        eventId = pEventId;
        name = pName;
        date = pDate;
        memberIds = new ArrayList<Integer>();
    }


}
