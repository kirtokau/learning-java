package cn.tedu.annotation;
//������������Ա�������
public class Person {
  // �ṩ˽������
  private String name;
  private int age;
  // �ṩ˽�з���
  private void save(int m,String n) {
     System.out.println("save().."+m+n);
  }
  private void update() {
     System.out.println("update()..");
  }
}