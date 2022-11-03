package SDE_Sheet.Arrays;

import java.util.Arrays;

public class MinimumNumberOfPlatformNeeded {

    /*
    *
    * Given the arrival and departure times of all trains
    * that reach a railway station, the task is to find the
    * minimum number of platforms required for the railway
    * station so that no train waits. We are given two arrays
    * that represent the arrival and departure times of trains that stop.
    *
    * O(N*Log(n))
    * */

    public static void main(String[] args) {
        int arr[] = { 900, 940, 950, 1100, 1500, 1800 };
        int dep[] = { 910, 1200, 1120, 1130, 1900, 2000 };

        System.out.println(findPlatform(arr, dep));
    }

    static int findPlatform(int[] ar, int[] dep) {
        int platform = 1, result = 1;
        int i =1, j = 0;
        Arrays.sort(ar);
        Arrays.sort(dep);

        int n = ar.length;

        while (i < n && j<n) {

            if (ar[i] <= dep[j]) {
                platform++;
                i++;
            }else if (ar[i]>= dep[j]) {
                platform--;
                j++;
            }

            if (platform>result){
                result = platform;
            }

        }

        return  result;
    }
}
