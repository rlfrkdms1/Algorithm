public class NumberRepresentation {
    public static void main(String[] args) {
        int n = 1;
        int count = 0;
        int _n=0;


        for (int i = 1; i <= n ; i++) {
            _n = i;
            for (int j = 1; j <= n; j++) {
                if (_n == n) {
                    count++;
                    break;
                } else if (_n < n) {
                    _n += i + j;
                } else {
                    break;
                }
            }
        }
        System.out.println("count = "+count);
    }

}
