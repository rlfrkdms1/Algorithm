import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/*
다리를 size만큼 0으로 채워놓고 트럭을 넣는게 중요
 */
public class BridgeCrossTruck {
    public static void main(String[] args) {
        int bridge_length = 100;
        int weight = 100;
        int[] truck_weights = {10,10,10,10,10,10,10,10,10,10};
        int answer = 0;

        int bridge_weight=0;

        Queue<Integer> bridge = new LinkedList<>();
        for (int j = 0; j < bridge_length; j++) {
            bridge.offer(0);
        }

        int i = 0;
        while (!bridge.isEmpty()) {

            //트럭 빼기
            bridge_weight -= bridge.peek();
            bridge.poll();

            //
            if (i<truck_weights.length && bridge_weight + truck_weights[i] <= weight) {
                bridge.offer(truck_weights[i]);
                bridge_weight += truck_weights[i];
                i++;
            } else if(i<truck_weights.length){
                bridge.offer(0);
            }
            System.out.println("bridge = " + bridge.peek());

            answer++;
        }

        System.out.println("answer = " + answer);
    }
}
