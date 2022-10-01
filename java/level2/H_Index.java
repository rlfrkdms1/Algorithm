import java.util.Arrays;
import java.util.Comparator;

/*
count 초기화를 안해줘서 무한루프
논문이 모두 0인 경우도 생각해야된다.
answer의 초기값을 citations를 sort해서 마지막값을 잡아줬었는데 그냥 길이로 잡아줘도 된다.
answer과 count가 같을 때 answer의 값을 정했는데, 문제를 잘 읽어 보면 answer값과 count값이 같을 때가 아니라 이상일 때다.
 */
public class H_Index {
    public static void main(String[] args) {
        int[] citations = {0,1,2};

        int count=0;

        for(int answer = citations.length; answer>-1; answer--){
            count = 0;

            for (int j = 0; j < citations.length; j++) {
                if (citations[j] >= answer) {
                    count++;
                }
            }
            System.out.println(answer);
            System.out.println("count = " + count);
            if (count >= answer) {
                System.out.println("answer = " + answer);
                break;
            }

        }


    }

}
