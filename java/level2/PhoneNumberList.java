import java.util.Arrays;

public class PhoneNumberList {
    public static void main(String[] args) {
        String[] phone_book = {"119", "97674223", "1195524421"};

        Arrays.sort(phone_book); //sort를 하면 for문을 한번만 사용해도 된다. 이게 젤 꿀팁인듯 ..
        for (int i = 0; i < phone_book.length-1; i++) {
            if (phone_book[i].length() < phone_book[i + 1].length()) { //substring을 하기 위해선 꼭 있어야하는 조건문임
                if(phone_book[i].equals(phone_book[i+1].substring(0,phone_book[i].length()))){
                    //return false;
                }
            }
        }
        //return answer;
    }

    /*
    자바가 지원하는 startsWith() 사용하면 진짜 훨씬 간편 ..
     */

    /* 효율성에서 탈락 ..
    public boolean solution(String[] phone_book) {
        boolean answer = true;

        for (String s1 : phone_book) {
            for (String s2 : phone_book) {
                if (s1.length() < s2.length()) {
                    if(s1.equals(s2.substring(0, s1.length()))){
                        return false;
                    }
                }
            }

        }

        return answer;
    }
     */
}
