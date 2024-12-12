package RandomQuestions;

public class ReverseString {

    public static void reversestring(String s){
        int start = 0;
        int end = s.length()-1;
        char[] charArray = s.toCharArray();

        while(start < end){
            char temp = charArray[start];
            charArray[start] = charArray[end];
            charArray[end] = temp;
            start++;
            end--;
        }
        String reversedString = new String(charArray);
        System.out.println(reversedString);
    }

    public static void revserseArray(int[] arr){
        int start = 0;
        int end = arr.length -1;

        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp; 
            start++;
            end--;
        }
        for(int i : arr){
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        reversestring("saksham");
        int[] nums = {1,2,3,4,5};
        revserseArray(nums);
    }
}
