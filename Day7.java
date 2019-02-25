//代码块：
//普通代码块：定义在方法中的代码块。
// public class Day7{
//     public static void main (String[] args){
//         {
//             普通代码块。
//             int x = 10;
//             System.out.println(x);
//         }
//         int x = 20;
//         System.out.println(x);
//     }
// }

//构造块：
//定义在类中（不加任何修饰符）。
// class Person{
//     public Person(){
//         System.out.println("1.Person类的构造方法");
//     }
//     {
//         //构造块；
//         System.out.println("2.Person类的构造块");
//     }
// }
// public class Day7{
//     public static void main (String[] args){
//         new Person();
//         new Person();
//     }
// }
//静态代码块：
//使用static修饰并且定义在类中的代码块。

// 1. 定义在非主类中的静态块。

// class Person{
//     public Person(){
//         System.out.println("1.Person类的构造方法");
//     }
//     {
//         //构造块；
//         System.out.println("2.Person类的构造块");
//     }
//     static{
//         //静态代码块：（定义在非主类中）且只加载一次。
//         System.out.println("3.Person类的静态块");
//     }
// }
// public class Day7{
//     public static void main (String[] args){
//         new Person();
//         new Person();
//     }
// }

// 2. 定义在主类中的静态块。

// public class Day7{
//     public static void main(String[] args){
//         System.out.println("1.main方法开始");
//         new Day7();
//     }
//     {
//         System.out.println("2.主类中的构造块");
//     }
//     static{
//     // 静态块；
//     System.out.println("3.主类中的静态块");
//     }
// }


//  继承-----在已有基础上进行功能的扩充操作(强调代码的可重用)
