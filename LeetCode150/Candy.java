package LeetCode150;

import java.util.Arrays;

public class Candy {

    public static void findCandy(int[] ratings) {
        int candy = 0;

        for (int i = 1; i < ratings.length ; i++) {
            if(ratings[i] == ratings[i-1]){
                candy +=1;
                i++;
            }
            if (ratings[i] > ratings[i-1]) {
                candy += 2;
            }
            else {
                candy += 1;
            }
        }
        for (int i = ratings.length - 2; i > -1; i--) {
          
            if (ratings[i + 1] > ratings[i] && ratings[i+1] != ratings[i]) {
                candy += 2;
            }
        }
        System.out.println(candy);
    }

    public static void main(String[] args) {
        int[] ratings = { 1, 3, 2, 2, 1 };
        findCandy(ratings);
    }
}
