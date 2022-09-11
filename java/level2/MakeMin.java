import java.util.Arrays;
import java.util.Collections;

public class MakeMin {

    public static void main(String[] args) {
        int[] a = {1, 2};
        int[] b = {3, 4};

        Arrays.sort(a);
        Arrays.sort(b);

        int result=0;

        for (int i = 0; i < a.length; i++) {
            result += a[i]*b[b.length-1-i];
        }

        System.out.println("result = " + result);
    }
}
