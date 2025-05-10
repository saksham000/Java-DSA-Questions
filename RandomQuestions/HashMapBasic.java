package RandomQuestions;

import java.util.HashMap;

public class HashMapBasic {
    public static void main(String[] args) {
        HashMap<Integer, String> empDetails = new HashMap<>();
        empDetails.put(1, "Saksham");
        empDetails.put(2, "sharma ji");
        empDetails.put(3, "brahman");
        System.out.println(empDetails);
        System.out.println(empDetails.get(2));
        System.out.println(empDetails.containsKey(3));
        System.out.println(empDetails.containsValue("rajput"));
        empDetails.putIfAbsent(4, "rajput ji");
        System.out.println(empDetails);
        empDetails.remove(4);
        System.out.println(empDetails);
        int min = Integer.MAX_VALUE;
        System.out.println(min);

    }

}
