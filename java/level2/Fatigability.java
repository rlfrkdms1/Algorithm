import java.util.Arrays;
import java.util.Comparator;

public class Fatigability {
    public static void main(String[] args) {
        int k = 80;
        int[][] dungeons = {{80, 20}, {50, 40}, {30, 10}};

        boolean[] check = new boolean[dungeons.length];


        int answer = dfs(k, dungeons, check, 0);
        System.out.println("answer = " + answer);
    }

    public static int dfs(int k, int[][] dungeons,boolean[] check,int count) {
        int max = 0;
        for (int i = 0; i < dungeons.length; i++) {
            if (!check[i] && dungeons[i][0] <= k) {
                check[i] = true;
                count++;
                System.out.println("i = " + i);
                dfs(k - dungeons[i][1], dungeons, check, count);

            }
            max = Math.max(max, count);
            System.out.println("max = " + max);
            System.out.println("count = " + count);

        }
        return max;


    }
}
