public class revString {

    public static void rev(String str) {
        StringBuilder res = new StringBuilder(str);
        int left = 0, right = res.length()-1;

        while(left < right){
            char temp = str.charAt(left);
            res.setCharAt(left, res.charAt(right));
            res.setCharAt(right, temp); 
            left++;
            right--;
        }
        System.out.println(res);
    }

    public static void main(String[] arg) {
        rev("hello");
    }

}