package LeetCode150;

public class LongestCommonPrefix {
    
    public static void findPreFix(String[] strs){
        StringBuilder sb = new StringBuilder();

        for(int i=0;i<strs.length-1;i++){

            if(strs[i].charAt(i) == strs[i+1].charAt(i)){
                sb.append(strs[i].charAt(i));
            }else{
                System.out.println("");
            }
        }
        System.out.println(sb.toString());
    }

    public static void main(String[] args) {
        String[] strs = {"flower","flow","flight"};
        findPreFix(strs);
    }
}
