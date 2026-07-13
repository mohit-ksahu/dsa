import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();

        for (int i = 0; i < numRows; i++){
            List<Integer> row = new ArrayList<>();

            for (int j = 0; j <= i; j++){
                int val = 1;
                for (int k = 0; k < j; k++) {
                    val = val * (i - k) / (k + 1);
                }

                row.add(val);
            }
            triangle.add(row);
        }
        return triangle;
    }
}