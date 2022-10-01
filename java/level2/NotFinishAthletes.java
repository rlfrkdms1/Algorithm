import java.util.Arrays;
import java.util.Hashtable;
import java.util.Map;

public class NotFinishAthletes {
    public static void main(String[] args) {
        String[] participant = {"a","a","a","b","c"};
        String[] completion = {"a","a","b","c"};

        Hashtable<String, Integer> completions = new Hashtable<>();
        String result = "";

        for (int i=0;i<completion.length;i++) {
            completions.put(completion[i],i );
        }

        for (Map.Entry<String, Integer> stringIntegerEntry : completions.entrySet()) {
            System.out.println("stringIntegerEntry = " + stringIntegerEntry.getKey());
            System.out.println("stringIntegerEntry = " + stringIntegerEntry.getValue());
        }

        for (String s : participant) {
            if(completions.containsKey(s)){
                completions.remove(s);
            }
            else {
                result=s;
                break;
            }
        }
        System.out.println("result = " + result);
    }
}
