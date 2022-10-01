import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class DislikeSameNumber {
    public static void main(String[] args) {
        int[] arr = {1, 1, 3, 3, 0, 1, 1};
        Queue<Integer> queue = new LinkedList<>();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            queue.offer(arr[i]);
        }

        int first = queue.poll();
        list.add(first);

        while (!queue.isEmpty()) {

            if (queue.peek() == first) {
                queue.poll();
            }
            else {
                first = queue.poll();
                list.add(first);
            }
        }

        int[] answer = list.stream().mapToInt(i->i).toArray(); //stream을 사용하면 효율성 틀림 -> 그냥 for문 돌리자
        /*
        큐를 쓰지 않고 배열만 이용해서 할 수 있음 ..
         */
        for (int i : answer) {
            System.out.println("i = " + i);
        }

    }
}
