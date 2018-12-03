//public class Test12_1 {
   // public static void main (String[] args)
   /*{
        int [] x = null;
        int [] y = null;
        x = new int [3];
        System.out.println(x.length);
        x[0] = 1;
        x[1] = 2;
        x[2] = 3;
        for (int i = 0;i < x.length;i++){
            System.out.println(x[i]);
        }
        y = x;
        y[1] = 39;
        System.out.println(y[1]);
    }
}*/

public class Test12_1{
   public static void main(String[] args){
       int[] date = new int[] {1,2,3,4,5};
       int[] date = init();
        printArray(date);
   }
   //方法修改数组
   public static void bigger(int[] arr){
       for (int i = 0 ;i < arr.length;i++){
           arr[i] *= 3;
       }
   }
   //方法返回数组
   public static int[] init(){
       return new int [] {1,2,3,4};// 匿名数组
   }

   //方法接收数组
   public static void printArray(int[] temp){
       for (int i = 0;i < temp.length;i++){
        System.out.println(temp[i]);
           }
       }
   }

    