package SDE_Sheet.Arrays;

public class FindSubArrayWithGivenSum {
    public static void main(String[] args) {
        int arr[] = { 15, 2, 4, 8, 9, 5, 10, 23 };
        subArraySum(arr, 23);

    }

    static void subArraySum(int arr[], int sum) {
        int n = arr.length;

        for (int i = 0; i<n; i++) {
            int currentSum = arr[i];

            if (currentSum == sum) {
                System.out.println(i);

                return;
            } else {

                for (int j =i+1; j<n; j++) {

                    currentSum += arr[j];
                    if (currentSum == sum) {
                        System.out.println(i+" and "+j);
                        return;
                    }
                }
            }
        }
        return;
    }

}
