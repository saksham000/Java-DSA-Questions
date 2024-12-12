package RandomQuestions;

import java.util.Arrays;
import java.util.List;

public class Cups {
    // public static void findCups(List<String> cups, String choice ){
    //     choice = choice.toLowerCase();

    //     int cupRemoved = 0;

    //     Boolean isCupFound = false;

    //     for(int i=0;i<cups.size();i++){
    //         if(cups.get(i).equals(choice)){
    //             cupRemoved = i + 1;
    //             isCupFound = true;
    //             break;
    //         }
    //     }

    //     if(!isCupFound){
    //         cupRemoved = cups.size();
    //     }
    //     int sizeOfStack = cups.size() - cupRemoved;

    //     System.out.println(cupRemoved);
    //     System.out.println(sizeOfStack);
    // }


    public static void cupPopper(List<String> cups, String choice) {
        // Convert the choice to lowercase for case-insensitive comparison
        choice = choice.toLowerCase();
        
        // Variable to track how many cups are removed
        int removedCups = 0;
        
        // Flag to indicate whether the cup has been found
        boolean cupFound = false;

        // Iterate through the stack of cups
        for (int i = 0; i < cups.size(); i++) {
            if (cups.get(i).toLowerCase().equals(choice)) {
                removedCups = i + 1; // Record the number of cups removed including the desired cup
                cupFound = true;
                break;
            }
        }
        
        if (!cupFound) {
            // If the cup isn't found, no cups are removed, and the stack size remains the same
            removedCups = cups.size();
        }
        
        // Calculate the remaining stack size after cups are removed
        int stackSize = cups.size() - removedCups;
        
        // Print the number of cups removed and the size of the stack
        System.out.println(removedCups);
        System.out.println(stackSize);
    }

    public static void main(String[] args) {
        List<String> cups = Arrays.asList("green", "violet", "red", "blue", "blue", "orange", "blue");
        String choice = "blue";
        cupPopper(cups, choice);
    }
}
