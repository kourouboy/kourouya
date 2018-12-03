class Person {
    public String name;
    public int age;
    public void fun (){
        System.out.println(name+"zai"+age+"dadoudou");
    }
}
public class Test12_3{
    public static void main(String[] arge){
        //根据person类产生一个person对象。
        Person per = new Person ()
        per.name = "马云爸爸";
        per.age = 50;
        per.fun();
    }
}