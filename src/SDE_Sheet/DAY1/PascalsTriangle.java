package SDE_Sheet.DAY1;

/*
*
* DAY 1
* https://leetcode.com/problems/pascals-triangle/
*
**/


import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
    static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        List<Integer> row, prev = null;
        for (int i = 0; i < numRows; i++) {
            row = new ArrayList<>();
            for (int j = 0; j <= i  ; j++) {
                if (j == 0 || j == i) {
                    row.add(1);
                }else {
                    row.add(prev.get(j-1) + prev.get(j));
                }
            }
            prev = row;
            res.add(row);
        }
        return res;
    }

    public static void main(String[] args) {

        System.out.println(generate(5));
    }
}
