import java.util.ArrayList;
import java.util.Date;

public class Administration {

    private static Administration instance = null;
    public ArrayList<Member> memberList;
    public ArrayList<Event> eventList;
    public String clubName;


    private Administration() {
        memberList = new ArrayList<Member>();
        eventList = new ArrayList<Event>();
        clubName = "";
    }

    public static Administration getInstance() {
        if (instance == null) {
            instance = new Administration();
        }
        return instance;
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

    public void remove(Member member) {
        try {
            memberList.remove(member);
        } catch(Exception e) {
            System.out.println("Member not found");
        }
    }

    public void createEvent(String name, Date date){

        int newEventId = eventList.size();
        ArrayList<Member> members = new ArrayList<>();

        for(int i = 0; i <eventList.size(); i++) {
            if(eventList.get(i).eventId == newEventId) {
                i = 0;
                newEventId ++;
            }
        }

        Event event = new Event(newEventId,name,date,members);
        eventList.add(event);

    }

    public void cancelEvent(int eventId){

        for(Event event : eventList) {
            if(event.eventId == eventId) {
                if(!event.members.isEmpty()){
                    System.out.println("Member list is not empty, do you still want to proceed? (Y/N)");
                    String answer = System.console().readLine();
                    if(answer.equalsIgnoreCase("y")) {
                        event.members.clear();
                    } if(answer.equalsIgnoreCase("n")) {
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

}
