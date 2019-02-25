//  继承-----在已有基础上进行功能的扩充操作(强调代码的可重用)
// class Person{
//     private String name;
//     private int age;
     
//     public String getName(){
//         return name;
//     }
//     public void setName(String name ){
//         this.name = name;
//     }
//     public int getAge(){
//         return age;
//     }
//     public void setAge(int age){
//         this.age = age;
//     }
// }
// class Student extends Person{
//     //定义了一个子类。
//     private String job;

//     public String getJob(){
//         return job;
//     }
//     public void setJob(String job){
//         this.job = job;
//     }
// }

// public class Day8{
//     public static void main(String[] args){
//         Student student = new Student();
//         student.setName("lufangy");
//         student.setAge(22);
//         student.setJob("IT");
//         System.out.println("姓名：" + student.getName()+ "  年龄:" + student.getAge() + "  工作:"
//         + student.getJob());
//     }
// }

//继承的限制；
// class Person{
//     public Person(){
//         System.out.println("Person类对象产生");
//     }
// }
// class Student extends Person{
//     public Student(){
//         super();//此语句在无参时写不写都一样；
//         System.out.println("Student类对象产生");
//     }
// }
// public class Day8{
//     public static void main(String[] args){
//         new Student();
//     }
// }
//显示继承与隐式继承：
///??????????????????
// class Person{

//     private String name ;

//     public String getName(){
//         return name ;
//     }
//     public void setName(String name){
//         this.name = name;
//     }
// }
// class Student extends Person{
//     public static void fun(){
//         System.out.println("getName()");
//     }
// }
// public class Day8{
//     public static void main(String[] args){
//         Student s = new Student();
//         s.setName("lili");
//         System.out.println(s.getName());
//         Student.fun();
//     }
// }


//覆写；
//  class Person{
//      public void print(){
//          System.out.println("1.Person类的print方法");

//      }
//  }
//  class Student extends Person{

//     public void print(){
//         System.out.println("2.Student类的print方法");
//     }
//  }
//  public class Day8{
//      public static void main(String[] args){
//          new Student().print();
//      }
//  }

// class Person{j
//     public void print(){
//         System.out.println("1.Father");
//     }
// }
// class Student extends Person{
//     public void print(){
//         super.print();
//         System.out.println("2.child");
//     }
// }
// public class Day8{
//     public static void main(String[] args){
//         new Student().print();
//     }
// }                                 
