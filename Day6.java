//调用构造方法：
// class Person{
//     private String name ;
//     private int age ;

//     public Person (){
//         System.out.println("******产生一个新的person对象******");
//     }
//     public Person(String name) {
//         this();//调用本类无参构造；
//         this.name = name;//this调用方法不能成“环”
//     }
//     public Person(String name , int age){
//         this(name);//调用本类有参构造；
//         this.age = age;
//     }
//     public String getPersonInfo(){
//         return name + age;
//     }
// }
// public class Day6{
//     public static void main(String[] args){
//         Person p1 = new Person();
//         Person p2 = new Person("lili");
//         Person p3 = new Person("luna",20);
//         System.out.println(p1.getPersonInfo());
//         System.out.println(p2.getPersonInfo());
//         System.out.println(p3.getPersonInfo());
//     }
// }


//this表示当前对象；
// class Person{
//     public void fun(){
//         //this表示当前对象
//         //this表示当前调用fun方法的对象
//         System.out.println("当前对象为"+this);
//     }
// }
// public class Day6{
//     public static void main(String[] args){
//         Person per1 = new Person();
//         // //this 表示 per1
//         per1.fun();
//         System.out.println(per1);
//         System.out.println("_______________________");
//         Person per2 = new Person();
//         per2.fun();
//         System.out.println(per2);
//     }
// }


//static 关键字 - 与类的实例化对象无关
  
// static 属性 - 静态属性（类属性）

// class Person{
//     private String name;
//     private int age;
//     static String country;
//     public Person(String name ,int age){
//         this.name = name ;
//         this.age = age;
//         // this.country = country;
//     }
//     public void fun(){
//         System.out.println(this.name + " " + this.age + "岁" + "在" + country);
//     }
//     // public void setCountry(String country){
//     //     this.country = country;
//     // }
// }
// public class Day6{
//     public static void main(String[] args){
//         Person per1 = new Person("zhutingt",12);
//         Person per2 = new Person("lufangy",22);
//         Person.country = "jepan";
//         per1.fun();
//         per2.fun();

//     }

// }\


//static 方法 - 类方法 - 静态方法
//使用static定义的方法为类方法，与对象无关，直接通过类名称调用。

//静态方法不能调用类中普通属性；
//普通方法可以调用类中静态属性；
class Person{
    public static void fun(){
        System.out.println("kourouya");
    }
}
public class Day6{
    public static void main(String[] args){
        Person.fun();

    } 
}