import java.util.ArrayList;
import java.util.Date;

public class Tournament extends Event{

    public int maxParticipants;

    Tournament(int pEventId, String pName, Date pDate, int pMaxParticipants) {
        super(pEventId, pName, pDate);
        maxParticipants = pMaxParticipants;
    }
}
