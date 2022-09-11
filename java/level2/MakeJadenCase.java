public class MakeJadenCase {
    public static void main(String[] args) {
        String answer = "";
        String s = "3people  unFollowed m"; // 공백이 연달아 있는 경우도 대비할것
        System.out.println("s = " + s);
        String allLowerString = s.toLowerCase();
        System.out.println("allLowerString = " + allLowerString);
        String[] texts = allLowerString.split(" ");

        for(String text : texts){
            System.out.println("text = " + text);
            if (text.equals("")) {
                answer += " ";
            }
            else {
                answer+=text.substring(0,1).toUpperCase()+text.substring(1)+" "; //숫자도 그냥 대문자로 만들면 됨
            }

        }
        System.out.println("answer = " + answer.substring(0,s.length()));

    }
}
