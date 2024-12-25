package LeetCode150;

public class LongestCommonPrefix {
    
    public static void findPreFix(String[] strs){

        String prefix = strs[0];

        for(int i=1;i<strs.length;i++){
            while(!strs[i].startsWith(prefix)){
                prefix = prefix.substring(0,prefix.length()-1);
                if(prefix.isEmpty()) System.out.println("-1");
            }
        }
        
        System.out.println(prefix);
    }

    public static void main(String[] args) {
        String[] strs = {"flower","flow","flight"};
        findPreFix(strs);
    }
}
