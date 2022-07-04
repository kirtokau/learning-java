package cn.tedu.annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

//这个类用来测试暴力反射
public class Test2_Reflect2 {
    @org.junit.Test
    public void getFiledd() throws Exception  {
       //获取Class对象
       Class<?> clazz = Person.class;
       //获取私有属性
       Field field = clazz.getDeclaredField("name");
       //获取属性的数据类型
       System.out.println(field.getType().getName());
       //设置私有属性的值
       //set(m,n)-m是你要给哪个对象设置值，n是要设置的具体值
       Object obj = clazz.newInstance();
      // 暴力手段设置---私有可见
       field.setAccessible(true);
       field.set(obj, "rose");
       //获取私有属性的值
       System.out.println(field.get(obj));

    }
    @org.junit.Test
    public void getFunctions() throws Exception{
       //获取Class对象
       Class<?> clazz = Person.class;
       //暴力反射  私有方法
       //getDeclaredMethod(m,n,o,p.....)-m是要执行的方法名-n o p是方法需要的参数类型
       Method method = clazz.getDeclaredMethod("save", int.class,String.class);      
       //暴力反射  执行私有方法
       //invoke(m,n,o,p....)-m是要执行哪个对象的方法-n o p是方法需要传递的参数
       Object obj = clazz.newInstance();    
       //设置私有可见
       method.setAccessible(true);
       //执行方法
       method.invoke(obj, 10,"xiongda");

      

    }

   

   

}

 