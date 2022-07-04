package cn.tedu.annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;
import org.junit.Test;


//������������Է���
public class Test1_Reflect {
// ��Ԫ���Է�������java���Ե���С��λ������ʱ��Ҫ-ѡ�з�����-�Ҽ�����

  // �﷨Ҫ��@Test + void + �޲ε� + public

  @Test
  public void getClazz() throws Exception {
  Class<?> student1 = Class.forName("cn.tedu.annotation.Student");// ���������ȫ·��������.����
  Class<?> student2 = Student.class;
  Class<?> student3 = new Student().getClass();//���������������û����
  System.out.println(student1);//���䵽��Class����
   
  System.out.println(student2.getName());//��ȡ���ȫ·��������������

  System.out.println(student3.getSimpleName());//ֻ��ȡ����

  System.out.println(student3.getPackage().getName());//ֻ��ȡ����

  } 
//��ȡ���췽��
  @Test
  public void getConstruct() {
     //��ȡClass����
     Class<?> clazz = Student.class;    
     //��ȡ���췽���ǣ�������cs������
     Constructor<?>[] cs = clazz.getConstructors();   
     //��ȡÿ������
     //ʹ��foreach(1 2:3){ѭ����} ����3����Ҫѭ��������  1��ѭ���õ�����������   2�Ǳ�����
     for(Constructor c:cs) {
         System.out.println(c.getName());//��ȡ���췽��������       
         Class[] cc = c.getParameterTypes();//��ȡ���췽���Ĳ��� ������
         System.out.println( Arrays.toString(cc) );
     }

  }
//��ȡ��Ա����
  @Test
  public void getFunction() throws Exception {
     //��ȡClass����
     Class<?> clazz = Class.forName("cn.tedu.annotation.Student");
     //��ȡ��Ա�����ǣ�����ms
     Method[] ms = clazz.getMethods();
     //�������飬��ȡÿ������m
     for (Method m : ms) {
         System.out.println( m.getName() );//��ȡ������
         Class<?>[] cc = m.getParameterTypes();//��ȡ������������
         System.out.println( Arrays.toString(cc) );
     }
 }
  // ��ȡ��Ա����--Ҫ�󣺲�����Ĭ�ϵ����η�default�����뱻public���Σ���
  @Test
  public void getFieldd() throws Exception {
     //��ȡClass���� -- ? �Ƿ���Լ����ͨ���
     Class<?> clazz = Student.class;
     //��ȡ����  ���������ģ���  ��Ա�����ǣ�������fs
     Field[] fs = clazz.getFields();
      //��ȡÿ����Ա����
     for (Field f : fs) {
         System.out.println( f.getName() );//��ȡ������
         System.out.println( f.getType().getName() );//��ȡ��������
     }
  }
//���䴴������
  @Test
  public void getObject() throws Exception {
     //��ȡClass����
     Class<?> clazz = Student.class;
     //��������
     Object obj = clazz.newInstance();//�����޲ι���
     System.out.println(obj);//Student [name=null, age=0]
      //ָ������Ҫ������һ�����ι��죿--ͨ�����췽�� ��Ҫ��  ��������
     Constructor<?> c = clazz.getConstructor(String.class,int.class);
     //����ָ���Ĺ��췽��
     Object obj2 = c.newInstance("jack",20);
     //Student [name=jack, age=20]
     System.out.println(obj2);
     //�µ�֪ʶ�㣿Ϊʲô��Ҫ��Objectǿת�����ࣿ--����Ϊ��Ҫʹ����������й���
//   obj��Object����
     Student s = (Student)obj;//--����ת��--ʹ����������й���

     System.out.println(s.name);

     System.out.println(s.age);

     s.eat(10);

  }
}