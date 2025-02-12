import java.util.ArrayList;
import java.util.Date;

public class Training extends Event{

    public enum tot {Fußball,
        Handball,
        Volleyball,
        Tischtennis,
        Radball,
        Turnen,
        Dart,
        Schach,
        LeagueOfLegends,
        Tanzen,
        Basketball,
        Pilates
    };

    public tot type;

    Training(int pEventId, String pName, Date pDate, tot ptype) {
        super(pEventId, pName, pDate);
        type = ptype;
    }
}

