package Striver.Greedy;

public class Candy {

    public static void findCandy(int[] ratings) {
        int n = ratings.length;
        int sum = 1;
        int i = 1;

        while (i < n) {
            if (ratings[i] == ratings[i - 1]) {
                sum += 1;
                i++;
                continue;
            }
            int peek = 1;
            while (i < n && ratings[i] > ratings[i - 1]) {
                peek++;
                sum += peek;
                i++;
            }
            int down = 1;
            while (i < n && ratings[i] < ratings[i - 1]) {
                sum += down;
                down++;
                i++;
            }
            if (down > peek) {
                sum += down - peek;
            }
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        int[] ratings = { 1, 3, 2, 2, 1 };
        findCandy(ratings);
    }

}
