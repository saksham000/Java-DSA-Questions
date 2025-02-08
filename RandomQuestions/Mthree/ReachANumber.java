package RandomQuestions.Mthree;

public class ReachANumber {
    public static int findSteps(int target){
        target = Math.abs(target);
        int steps = 0, cost = 0;
        while (cost < target || (cost - target) % 2 != 0) {
            steps++;
            cost += steps;
        }
        return cost;
    }

    void main(){
        System.out.println(findSteps(2));
    }
}
