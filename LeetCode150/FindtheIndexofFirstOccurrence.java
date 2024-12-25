package LeetCode150;

public class FindtheIndexofFirstOccurrence {

    public static void findIndexOfOcc(String haystack, String needle) {
        int m = haystack.length(), n = needle.length();

        for (int i = 0; i < m - n; i++) {
            if (haystack.substring(i, n + i).equals(needle)) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        findIndexOfOcc("sadbutsad", "sad");
    }
}
