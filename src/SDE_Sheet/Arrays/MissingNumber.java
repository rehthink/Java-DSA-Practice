package SDE_Sheet.Arrays;

public class MissingNumber {

    /*
    * VVI - Amazon Question
    * Cyclic Sort
    * */

    public static void main(String[] args) {
        int[] arr = {2,1,4,0,3,6};
        int n = missingNumber(arr);
        System.out.println(n);

    }

    static int missingNumber(int[] arr) {
        int size = arr.length;
        int i = 0;
        while (i< size) {

            int correct = arr[i];
            if (arr[i]<size && arr[i] != arr[correct]) {
                int temp = arr[i];
                arr[i] = arr[correct];
                arr[correct] = temp;
            }else {
                i++;
            }
        }

        for (int index = 0; index<size; index ++) {
            if (arr[index] != index){
                return index;
            }
        }
        return size;
    }
}
