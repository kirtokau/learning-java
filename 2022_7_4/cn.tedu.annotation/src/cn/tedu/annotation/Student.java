package cn.tedu.annotation;
//������������Է���
public class Student { 
    public Student() {}
    public Student(String name, int age) {
       super();
       this.name = name;
       this.age = age;
    }

    //�ṩ��Ա����
    String name;
    int age;
    //�ṩ��Ա����
   public void eat(int m) {
       System.out.println("eat()..."+m);

    }

    //��дtoString()Ŀ���ǣ�Ϊ�˷���鿴���������ֵ
    @Override
    public String toString() {
       return "Student [name=" + name + ", age=" + age + "]";

    }

}