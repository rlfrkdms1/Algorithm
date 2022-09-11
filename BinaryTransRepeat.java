public class BinaryTransRepeat {

    public static String BinaryTrans(String s) {
        String result = s;
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)=='0'){
                System.out.println("i = " + i);
                result=result.replace("0","");
                count++;
            }
        }

        return result+count;
    }

    public static void main(String[] args) {
        String s = "0111010";
        int[] answer = new int[2];
        String result = s;
        int countZero = 0;
        int countRepeat=0;


        while (true) {

            //0제거
            for (int i = 0; i < s.length(); i++) {
                if(s.charAt(i)=='0'){
                    System.out.println("i = " + i);
                    result=result.replace("0","");
                    countZero++;
                }
            }

            countRepeat++;
            if (result.equals("1")){ break;}
            result=s=Integer.toBinaryString(result.length());
        }
        System.out.println("countRepeat = " + countRepeat);
        System.out.println("countZero = " + countZero);

    }
}
