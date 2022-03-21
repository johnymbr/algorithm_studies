import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {
            List<Integer> inner = new ArrayList<>();
            int j = 0;
            if (i <= 1) {
                while (j <= i) {
                    inner.add(1);
                    j++;
                }
            } else {
                while (j <= i) {
                    if (j == 0 || j == i) {
                        inner.add(1);
                    } else {
                        inner.add(ans.get(i - 1).get(j - 1) + ans.get(i - 1).get(j));
                    }
                    j++;
                }
            }

            ans.add(inner);
        }

        return ans;
    }
}
