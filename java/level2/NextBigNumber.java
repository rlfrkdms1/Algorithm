public class NextBigNumber {
    public static int solution(int n) {
        int answer = n+1;
        int n_one = countOne(MakeBinary(n));

        while (true) {
            if(countOne(MakeBinary(answer))==n_one) break;
            answer++;
        }
        return answer;
    }

    public static String MakeBinary(int n) {
        return Integer.toBinaryString(n);
    }

    public static int countOne(String binary) {
        int count = 0;
        for (int i = 0; i < binary.length(); i++) {
            if (binary.charAt(i) == '1') {
                count++;
            }
        }
        return count;
    }


    public static void main(String[] args) {
        System.out.println(solution(15));
    }
}

/*
Integer.bitCount라는 것이 있다고 한다
아무래도 1을 세주는 것이겠찌
 */
