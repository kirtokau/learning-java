package cn.tedu.annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

//������������Ա�������
public class Test2_Reflect2 {
    @org.junit.Test
    public void getFiledd() throws Exception  {
       //��ȡClass����
       Class<?> clazz = Person.class;
       //��ȡ˽������
       Field field = clazz.getDeclaredField("name");
       //��ȡ���Ե���������
       System.out.println(field.getType().getName());
       //����˽�����Ե�ֵ
       //set(m,n)-m����Ҫ���ĸ���������ֵ��n��Ҫ���õľ���ֵ
       Object obj = clazz.newInstance();
      // �����ֶ�����---˽�пɼ�
       field.setAccessible(true);
       field.set(obj, "rose");
       //��ȡ˽�����Ե�ֵ
       System.out.println(field.get(obj));

    }
    @org.junit.Test
    public void getFunctions() throws Exception{
       //��ȡClass����
       Class<?> clazz = Person.class;
       //��������  ˽�з���
       //getDeclaredMethod(m,n,o,p.....)-m��Ҫִ�еķ�����-n o p�Ƿ�����Ҫ�Ĳ�������
       Method method = clazz.getDeclaredMethod("save", int.class,String.class);      
       //��������  ִ��˽�з���
       //invoke(m,n,o,p....)-m��Ҫִ���ĸ�����ķ���-n o p�Ƿ�����Ҫ���ݵĲ���
       Object obj = clazz.newInstance();    
       //����˽�пɼ�
       method.setAccessible(true);
       //ִ�з���
       method.invoke(obj, 10,"xiongda");

      

    }

   

   

}

 