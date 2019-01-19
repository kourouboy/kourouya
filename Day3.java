public class Day3{
    public static void main(String[] args){
        //不一定是等列数组，
        int[][] date = new int[][] {
            {1,2,3},{4,5},{6,7,8,9}
        };
        //输出的时候一定要进行双重循环，
        for (int x = 0;x < date.length ; x++){
            for (int y = 0;y<date[x].length;y++){
                    System.out.println("date["+x+"]["+y+"]="+date[x][y]+". ");

            }
            System.out.println();
        }
    }
}