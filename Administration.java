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
                break;
            }
        }
        System.out.println("Member not found");
    }

    public void createEvent(String name, Date date){
        int newEventId = eventList.size();
        for(int i = 0; i <eventList.size(); i++) {
            if(eventList.get(i).eventId == newEventId) {
                i = 0;
                newEventId ++;
            }
        }
        System.out.println("Tournament('a') or Training('b')?");
        String answer = System.console().readLine();
        if(answer.equalsIgnoreCase("a")) {
            System.out.println("Max Teilnehmer?");
            int maxTeilnehmer = Integer.parseInt(System.console().readLine());
            Tournament tournament = new Tournament(newEventId,name,date,maxTeilnehmer);
            eventList.add(tournament);
        } else if(answer.equalsIgnoreCase("b")) {
            System.out.println("Sportart??");
            String sportart = System.console().readLine();
            Training training = new Training(newEventId,name,date, Training.tot.valueOf(sportart));
            eventList.add(training);
        } else {
            System.out.println("I cant understand u! \n Procces interupted!");
            return;
        }
    }

    public void cancelEvent(int eventId){

        for(Event event : eventList) {
            if(event.eventId == eventId) {
                if(!event.memberIds.isEmpty()){
                    System.out.println("Member list is not empty, do you still want to proceed? (Y/N)");
                    String answer = System.console().readLine();
                    if(answer.equalsIgnoreCase("y")) {
                        event.memberIds.clear();
                    } else if(answer.equalsIgnoreCase("n")) {
                        System.out.println("Process interupted");
                        return;
                    } else {
                        System.out.println("I cant understand u! \n Procces interupted!");
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

    private void toggleEventSignUpStatus(int eventId, int memberId) throws NullPointerException{

        Event event = null;

        for (Event e : eventList) {
            if (e.eventId == eventId) event = e;
        }


        if (event == null) {
            throw new NullPointerException("Event not found");
        }
        if (event.memberIds.contains(memberId)) {
            event.memberIds.remove(memberId);
        } else event.memberIds.add(memberId);
    }
}
