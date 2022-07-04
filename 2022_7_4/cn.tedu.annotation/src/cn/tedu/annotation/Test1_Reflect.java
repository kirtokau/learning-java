package cn.tedu.annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;
import org.junit.Test;


//这个类用来测试反射
public class Test1_Reflect {
// 单元测试方法：是java测试的最小单位，测试时需要-选中方法名-右键运行

  // 语法要求：@Test + void + 无参的 + public

  @Test
  public void getClazz() throws Exception {
  Class<?> student1 = Class.forName("cn.tedu.annotation.Student");// 参数是类的全路径：包名.类名
  Class<?> student2 = Student.class;
  Class<?> student3 = new Student().getClass();//匿名对象，这个对象没名字
  System.out.println(student1);//反射到的Class对象
   
  System.out.println(student2.getName());//获取类的全路径包括包名类名

  System.out.println(student3.getSimpleName());//只获取类名

  System.out.println(student3.getPackage().getName());//只获取包名

  } 
//获取构造方法
  @Test
  public void getConstruct() {
     //获取Class对象
     Class<?> clazz = Student.class;    
     //获取构造方法们，并放入cs数组中
     Constructor<?>[] cs = clazz.getConstructors();   
     //获取每个构造
     //使用foreach(1 2:3){循环体} 其中3是想要循环的数据  1是循环得到的数据类型   2是变量名
     for(Constructor c:cs) {
         System.out.println(c.getName());//获取构造方法的名称       
         Class[] cc = c.getParameterTypes();//获取构造方法的参数 类型们
         System.out.println( Arrays.toString(cc) );
     }

  }
//获取成员方法
  @Test
  public void getFunction() throws Exception {
     //获取Class对象
     Class<?> clazz = Class.forName("cn.tedu.annotation.Student");
     //获取成员方法们，存入ms
     Method[] ms = clazz.getMethods();
     //遍历数组，获取每个方法m
     for (Method m : ms) {
         System.out.println( m.getName() );//获取方法名
         Class<?>[] cc = m.getParameterTypes();//获取方法参数类型
         System.out.println( Arrays.toString(cc) );
     }
 }
  // 获取成员变量--要求：不能是默认的修饰符default，必须被public修饰！！
  @Test
  public void getFieldd() throws Exception {
     //获取Class对象 -- ? 是泛型约束的通配符
     Class<?> clazz = Student.class;
     //获取所有  ！！公共的！！  成员变量们，并存入fs
     Field[] fs = clazz.getFields();
      //获取每个成员变量
     for (Field f : fs) {
         System.out.println( f.getName() );//获取变量名
         System.out.println( f.getType().getName() );//获取变量类型
     }
  }
//反射创建对象
  @Test
  public void getObject() throws Exception {
     //获取Class对象
     Class<?> clazz = Student.class;
     //创建对象
     Object obj = clazz.newInstance();//触发无参构造
     System.out.println(obj);//Student [name=null, age=0]
      //指定你想要调用哪一个含参构造？--通过构造方法 需要的  参数类型
     Constructor<?> c = clazz.getConstructor(String.class,int.class);
     //触发指定的构造方法
     Object obj2 = c.newInstance("jack",20);
     //Student [name=jack, age=20]
     System.out.println(obj2);
     //新的知识点？为什么需要把Object强转成子类？--是因为想要使用子类的特有功能
//   obj是Object类型
     Student s = (Student)obj;//--向下转型--使用子类的特有功能

     System.out.println(s.name);

     System.out.println(s.age);

     s.eat(10);

  }
}