public class MakeRectangle {
    public static void main(String[] args) {

        int[][] v = {{1,4},{3,4},{3,10}};

        for(int i =0; i < 3; i++){
            for(int j=0;j<3;j++){//비교대상
                if(v[i][0]==v[j][0]&&i!=j){
                    v[i][0]=0;
                    v[j][0]=0;
                }
                if(v[i][1]==v[j][0]&&i!=j){
                    v[i][1]=0;
                    v[j][1]=0;
                }
            }
        }
        int x=0;
        int y=0;
        for(int[] k : v){
            if(k[0]!=0) x=k[0];
            if(k[1]!=0) y=k[1];
        }


        int[] answer = {x,y};
        for (int i : answer) {
            System.out.println("i = " + i);
        }


    }
}
