package String;

import java.util.Arrays;

public class Anagrams {
    public static void main(String[] args) {
        String str = "CAR";
        String str1 = "RAC";

        System.out.println(isAnagram(str, str1));
    }

    static boolean isAnagram(String str, String str1) {
        int n1 = str.length();
        int n2 = str1.length();
        if (n1 != n2) {
            return false;
        }

        char[] aa = str.toCharArray();
        char[] ab = str1.toCharArray();

        Arrays.sort(aa);
        Arrays.sort(ab);

        for (int i = 0; i<n1; i++) {
            if (aa[i] != ab[i]) {
                return false;
            }
        }
        return true;
    }
}
