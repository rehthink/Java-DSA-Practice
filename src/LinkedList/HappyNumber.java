package LinkedList;

public class HappyNumber {

    /*
    * Google Question - Important
    * https://leetcode.com/problems/happy-number/description/
    * */

    public static void main(String[] args) {

        boolean ans = happyNumber(19);
        System.out.println(ans);

    }
    public static int findSquare(int n){
        int sq = 0;
        while(n>0) {
            int rem = n%10;
            sq += rem * rem;
            n = n/10;
        }
        return sq;
    }

    public static boolean happyNumber(int n) {
        int slow = n;
        int fast = n;

        do {
            slow = findSquare(slow);
            fast = findSquare(findSquare(fast));

        }while (slow != fast);

        if (slow == 1) {
            return true;
        }
        return false;
    }
}
