//this 调用本类属性：
// class Person {
//     private String name ;
//     private int age ;

//     public Person (String name , int age){
//         this.name = name ;//参数与类中属性同名时，要加this关键字，正确给对象赋值。
//         this.age = age ;
//     }
//     public String getPersonInfo(){
//         return name+age;
//     }
// }
// public class Day5{
//     public static void main (String[] args){
//         Person p = new Person("zhutingt",22);
//         System.out.println(p.getPersonInfo());
//     }
// }


//this 调用本类方法：
class Person {
    private String name ;
    private int age;

    public Person (String name , int age){
        this.name = name ;
        this.age = age;
        this.print();//调用普通方法。this也可以不用，加this的目的可以区分方法的定义来源
                    //（在继承中有用）
    }
    public String getPersonInfo(){
        return name + age;
    }
    public void  print(){
        System.out.println("nishiyizhidafeihzu");
    }
}
public class Day5{
    public static void main (String[] args){
        Person p = new Person("zhutingt", 22);
        System.out.println(p.getPersonInfo());
    }
}
