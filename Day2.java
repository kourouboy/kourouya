// public class Day2{
//     public static void main (String[] args){
//             //方法接收数组。
//     //     int [] date = new int [] {1,2,3,4,5} ;
//     //     printArray(date);//等价效果等于 int [] temp = date.
//     //  }
//     // public static void printArray(int [] temp){
//     //     for (int i = 0;i < temp.length;i++){
//     //         System.out.println(temp[i]);
//     //     }
//     // 方法返回数组。
//     // int [] date = init();
//     // printArray(date);
//     // }
//     // //定义一个返回数组的方法。
//     // public static int[] init(){
//     //     return new int[] {1,2,3,4,5};//匿名数组。
//     // }
//     // public static void printArray(int[] temp){
//     // for (int i = 0 ; i < temp.length; i++){
//     //         System.out.println(temp[i]);//数组可以引用传递，
//     //      }
//     //方法修改数组。
//     // int[] date = init();
//     // bigger(date);
//     // printArray(date);
//     // }
//     // public static int[] init(){
//     //     return new int[] {1,2,3,4,5};
//     // }
//     // //数组扩大元素五倍
//     // public static void bigger(int[] arr){
//     //     for(int i = 0; i < arr.length; i++){
//     //         arr[i] *= 5;
//     //     }
//     // }
//     //     public static void printArray(int[] temp){
//     //         for (int i = 0 ; i < temp.length; i++){
//     //             System.out.println(temp[i]);//数组可以引用传递，
//     //         }

//     //数组排序。
//     // int [] intDate = new int[] {2,34,664,97,54};
//     // char[] charDate = new char[] {'f','s','h','y'};
//     // java.util.Arrays.sort(intDate);
//     // java.util.Arrays.sort(charDate);
//     // printArray(intDate);
//     // printArray(charDate);
//     // }
//     //  public static void printArray(int[] temp){
//     //      for (int i = 0 ;i < temp.length;i++){
//     //          System.out.println(temp[i]);
//     //      }
//     //      System.out.println();
//     // }
//     // //重载。
//     //       public static void printArray(char[] temp){
//     //       for (int i = 0 ;i < temp.length;i++){
//     //          System.out.println(temp);
//     //      }
//     //      System.out.println();

//     // 数组拷贝。
//     //1.System.arraycopy(源数组名称，源数组开始点，目标数组名称，目标数组开始点，长度)
//     //2.java.util.Arrays.copyOf(源数组名称，新数组长度)
    
//         // int[] date = new int [] {1,2,4,65,34};
//         // int[] result = java.util.Arrays.copyOf(date,10);
//         // for (int temp : result){
//         //     System.out.println(temp);
//         // }
//     }
     
// }

 // 对象数组
 //动态初始化。
//  class Person {
//      private String name;
//      private int age;
//      public Person (String name,int age){
//          this.name = name;
//          this.age = age;
//      }
//      public void getInfo(){
//          System.out.println(this.name + this.age);
//      }
//  }
//   public class Day2{
//       public static void main (String[] args){
//           Person[] per = new Person[3];
//           per[0] = new Person ("judu  ",20);
//           per[1] = new Person ("jsi  ",33);
//           per[2] = new Person ("hdsh  ",54);
//           for (int i = 0; i < per.length; i++){
//               per[i].getInfo();
//           }
      }
  }