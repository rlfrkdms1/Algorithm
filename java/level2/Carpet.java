public class Carpet {
    public static int[] solution(int brown, int yellow) {

        int width = ((brown - 4) / 2) - 1;
        int height = 1;

        while (true) {
            System.out.println("width = " + width);
            System.out.println("height = " + height);
            if (width * height == yellow) {
                break;
            }
            width--;
            height++;
        }

        int[] answer = {width + 2, height + 2};
        return answer;
    }

    public static void main(String[] args) {

    }
}
