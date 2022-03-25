import java.util.Arrays;
import java.util.Comparator;

public class TwoCityScheduling {
    public int twoCitySchedCost(int[][] costs) {
        int[][] diff = new int[costs.length][3];
        for (int i = 0; i < costs.length; i++) {
            diff[i][0] = costs[i][1] - costs[i][0];
            diff[i][1] = costs[i][0];
            diff[i][2] = costs[i][1];
        }

        Arrays.sort(diff, Comparator.comparingInt(o -> o[0]));

        int minCost = 0;
        for (int i = 0; i < diff.length; i++) {
            if (i < diff.length / 2) {
                minCost += diff[i][2];
            } else {
                minCost += diff[i][1];
            }
        }

        return minCost;
    }
}
