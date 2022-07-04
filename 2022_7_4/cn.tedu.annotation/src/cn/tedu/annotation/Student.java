package cn.tedu.annotation;
//这个类用来测试反射
public class Student { 
    public Student() {}
    public Student(String name, int age) {
       super();
       this.name = name;
       this.age = age;
    }

    //提供成员变量
    String name;
    int age;
    //提供成员方法
   public void eat(int m) {
       System.out.println("eat()..."+m);

    }

    //重写toString()目的是：为了方便查看对象的属性值
    @Override
    public String toString() {
       return "Student [name=" + name + ", age=" + age + "]";

    }

}