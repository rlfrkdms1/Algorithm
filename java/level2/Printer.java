import java.util.*;

public class Printer {
    public static void main(String[] args) {
        int[] priorities = {1, 1, 9, 1, 1, 1};
        int location = 0;
        int answer =0;
        List<Integer> prints = new ArrayList<>();

        for (int i = 0; i < priorities.length; i++) {
            prints.add(priorities[i]);
        }

        int count = 1;
        while (true) {

            if(prints.get(0)< Collections.max(prints)){
                prints.add(prints.get(0));

                prints.remove(0);
                for (int i = 0; i < prints.size(); i++) {
                    System.out.println("prints.get(i) = " + prints.get(i));
                }
                if (location == 0) {
                    location = prints.size()-1;
                }else location--;
            }else {
                System.out.println("prints.size() = " + prints.size());
                prints.remove(0);
                if (location == 0) {
                    answer=count;
                    break;
                }
                else {
                    location--;
                    count++;
                }
            }
        }
        System.out.println("answer = " + answer);
    }
}
