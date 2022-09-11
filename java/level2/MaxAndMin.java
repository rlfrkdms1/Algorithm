import java.util.ArrayList;
import java.util.List;

public class MaxAndMin {
    public static void main(String[] args) {
        String s = "11 21 31 41";

 /*       String newS = s.replaceAll(" ","");
        int i=0;
        int j=0;
        Integer[] numbers = new Integer[newS.length()];
        while(i<newS.length()){
            try {
                if (newS.charAt(i) == '-') {
                    numbers[j++]=(Integer.parseInt(newS.substring(i+1, i + 2))*-1);
                    i += 2;
                } else {
                    numbers[j++]=(Integer.parseInt(newS.substring(i, i+1)));
                    i++;
                }
            } catch (NumberFormatException e) {
                System.out.println("e = "+ e.getMessage());
            }

        }
        System.out.println("j = " + j);
        int check = 0;
        int max=numbers[0];
        int min = numbers[0];
        for (int k=0;k<j;k++) {
            if (numbers[k] > max) {
                System.out.println("k = " + k);
                max = numbers[k];
            } else if (numbers[k] < min) {
                System.out.println("k = " + k);
                min = numbers[k];
            }
        }

        System.out.println(min+" "+max);
*/
        String[] numbers = s.split(" ");
        Integer[] newNumbers = new Integer[numbers.length];

        int i =0;
        for (String number : numbers) {
            newNumbers[i++] = Integer.parseInt(number);
        }
        int max=newNumbers[0];
        int min = newNumbers[0];
        for (Integer number : newNumbers) {
            if (number > max) {
                max = number;
            } else if (number < min) {
                min = number;
            }
        }
    }
}
