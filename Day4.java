// class Person{
//     public String name;
//     public int age;

//     public Person (String name,int age){
//         this.name = name;
//         this.age = age;
//     }
//     public String getPersongInfo(){
//         return this.name + this.age;
//     }
// }
//     public class Day4{
//         public static void main(String[] args){
//             Person p = new Person("judy",39);
//             System.out.println(p.name);
//             System.out.println(p.getPersongInfo());
//        }
//     }
// 封装：
// class Person {
//     private String name ;
//     private int age;

//     public void setName(String n){
//         name = n;
//     }
//     public String getName(){
//         return name ;
//     }
//     public void setAge(int i){
//         if(i>0 && i<200){
//             age = i;
//         }else {
//             age = 0;
//         }
//     }
//     public int getAge(){
//         return age;
//     }
//     public void getPersongInfo(){
//         System.out.println(name +"  " + age + "岁");
//     }
// }
// public class Day4{
//     public static void main(String[] args){
//         Person p = new Person();
//         p.setName("lili");
//         p.setAge(100);
//         p.getPersongInfo();
//     }
// }

// class Person{
//     private String name;
//     private int age;

//     public Person(String n ,int i){
//         name = n;
//         setAge(i);
//     }
//     public void setName(String n){
//         name = n;
//     }
//     public String getName(){
//         return name;
//     }
//     public void setAge(int i){
//         if(i>0 && i<100){
//             age = i;
//         }else{
//             age = 0;
//         }
//     }
//         public int getAge(){
//             return age;
//         }
//         public void getPersonInfo(){
//             System.out.println(name+" " + age);
//         }
//     }
//     public class Day4{
//         public static void main(String[] args){
//             Person p = new Person("july", 20);
//             p.getPersonInfo();
//         }
//     }
