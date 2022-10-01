import java.util.ArrayList;
import java.util.Comparator;

public class KthNumber {

    public static void main(String[] args) {

        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        int[] answer = new int[commands.length];

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < commands.length; i++) {

            for (int j = commands[i][0] - 1; j < (commands[i][1]); j++) {
                list.add(array[j]);
            }
            list.sort(Comparator.naturalOrder());
            answer[i]= list.get(commands[i][2]-1);

            list.clear();
        }

        for (int i : answer) {
            System.out.println("i = " + i);
        }
    }
}
