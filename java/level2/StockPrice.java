import java.util.LinkedList;
import java.util.Queue;

public class StockPrice {
    public static void main(String[] args) {
        int[] prices = {1, 2, 3, 2, 3};
        int[] answer = new int[prices.length];

        int count = 0;

        for (int i = 0; i < prices.length; i++) {
            count = 0;
            for (int j = i + 1; j < prices.length; j++) {
                count++;
                if (prices[i] > prices[j]) {
                    break;
                }

            }
            answer[i]=count;
        }
        for (int i : answer) {
            System.out.println("i = " + i);
        }
    }
}
