import java.util.ArrayList;
import java.util.Date;

public class Administration {

    public ArrayList<Member> memberList;
    public ArrayList<Event> eventList;
    public String clubName;


    Administration(String pClubName) {
        memberList = new ArrayList<>();
        eventList = new ArrayList<>();
        clubName = pClubName;
    }

    public void register(String firstName, String lastName, String email, Date birthday) {

        int newMemberId = memberList.size();

        for(int i = 0; i < memberList.size(); i++) {
            if(memberList.get(i).getMemberId() == newMemberId) {
                i = 0;
                newMemberId ++;
            }
        }

        Member member = new Member(newMemberId,birthday,email,firstName,lastName);
        memberList.add(member);
    }

    public void remove(int memberId) {


        for(Member m : memberList) {
            if(m.getMemberId() == memberId) {
                memberList.remove(m);
                return;
            }
        }
        System.out.println("Member not found");
    }

    public void createEvent(String name, Date date, int maxTeilnehmer){
        int newEventId = eventList.size();
        for(int i = 0; i <eventList.size(); i++) {
            if(eventList.get(i).eventId == newEventId) {
                i = 0;
                newEventId ++;
            }
        }

        Tournament tournament = new Tournament(newEventId,name,date,maxTeilnehmer);
            eventList.add(tournament);


    }

    public void createEvent(String name, Date date, String sportart){
        int newEventId = eventList.size();
        for(int i = 0; i <eventList.size(); i++) {
            if(eventList.get(i).eventId == newEventId) {
                i = 0;
                newEventId ++;
            }
        }

        Training training = new Training(newEventId,name,date,sportart);
        eventList.add(training);
    }
    public void cancelEvent(int eventId){

        for(Event event : eventList) {
            if(event.eventId == eventId) {
                if(!event.memberIds.isEmpty()){
                    System.out.println("Member list is not empty, do you still want to proceed? (Y/N)");
                    String answer = System.console().readLine();
                    if(answer.equalsIgnoreCase("y") ) {
                        event.memberIds.clear();
                    } else if(answer.equalsIgnoreCase("n")) {
                        System.out.println("Process interrupted");
                        return;
                    } else {
                        System.out.println("I cant understand u! \n Process interrupted!");
                        return;
                    }

                }
                eventList.remove(event);
                return;
            }
        }
        System.out.println("Event not found");
    }

    public ArrayList<Event> getEventList() {
        return eventList;
    }

    private void toggleEventSignUpStatus(int eventId, int memberId, boolean anmelden) throws NullPointerException{

        Event event = null;
        int zv = -5;

        for (Event e : eventList) {
            if (e.eventId == eventId) event = e;
        }




        if (event == null) {
            throw new NullPointerException("Event not found");
        }
        if (event.memberIds.contains(memberId) && !anmelden) {
            for(int i = 0; i < memberList.size(); i++) {
                if(event.memberIds.get(i) == memberId) {
                    zv = i;
                    break;
                }
            }
            if (zv == -5){
                throw new NullPointerException("Member not found");
            }
            event.memberIds.remove(zv);

        } else if (!event.memberIds.contains(memberId) && anmelden){
            event.memberIds.add(memberId);
        }
    }

    public void anmelden(int eventId, int memberId){
        toggleEventSignUpStatus(eventId, memberId, true);
    }

    public void abmelden(int eventId, int memberId){
        toggleEventSignUpStatus(eventId, memberId, false);
    }
}
