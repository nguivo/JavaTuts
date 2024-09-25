import java.util.HashMap;

public class T011HashMap {

    public static void main(String[] args) {
        HashMap<String, String> people = new HashMap<String, String>();
        people.put("Emi bebe", "31 years");
        people.put("Ker", "10 years");
        people.put("Ian", "6 years");
        people.put("Adrian", "2 years");
        people.put("Bri", "21 years");

        System.out.println(people.get("Ker"));
        people.remove("Bri");
        System.out.println(people);
        System.out.println(people.size());

        //looping through a HashMap
        for (String i : people.keySet()) { //people.values()
            System.out.println(i + " = " + people.get(i));
        }
    }
}
