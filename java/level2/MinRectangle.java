public class MinRectangle {
    public static void main(String[] args) {
        int swap=0;
        int max_width=0;
        int max_height=0;

        int[][] sizes = {{60, 50}, {30, 70}, {60, 30}, {80, 40}};
        for (int[] size : sizes) {
            if (size[0] < size[1]) {
                swap = size[0];
                size[0] = size[1];
                size[1] = swap;
            }

            if (size[0] > max_width) {
                max_width = size[0];
            }

            if (size[1] > max_height) {
                max_height = size[1];
            }
        }



    }


}
