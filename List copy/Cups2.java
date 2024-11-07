package Striver.List;

import java.util.Arrays;
import java.util.List;

public class Cups2 {


    public static void findCup(List<String> cups, String choice){
        choice = choice.toLowerCase();
        int removedCups = 0;
        Boolean isCupFound = false;

        for(int i=0;i<cups.size();i++){
            if(cups.get(i).equals(choice)){
                removedCups = i + 1;
                isCupFound = true;
                break;
            }
        }
        if(!isCupFound){
            removedCups = cups.size();
        }
        int remainingCups = cups.size() - removedCups;
        System.out.println(removedCups);
        System.out.println(remainingCups);
    }


    public static void main(String[] args) {
        List<String> cups = Arrays.asList("green", "violet", "red", "blue", "blue", "orange", "blue");
        String choice = "blue";
        findCup(cups, choice);
    }
}
