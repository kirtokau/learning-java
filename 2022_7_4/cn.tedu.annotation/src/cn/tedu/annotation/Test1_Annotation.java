package cn.tedu.annotation;



import java.lang.annotation.ElementType;

import java.lang.annotation.Retention;

import java.lang.annotation.RetentionPolicy;

import java.lang.annotation.Target;

//��������������Զ���ע��

public class Test1_Annotation {

    public static void main(String[] args) {
          Hello a=new Hello();
          a.add();
    }

}


//����ע����Ҫ�ã�@interface����־  ע����
//@Targetָ��ע����Դ��ڵ�λ��
//@Target(ElementType.METHOD)//3,ע����Գ����ڷ�����
@Target({ ElementType.METHOD , ElementType.TYPE })//ע�⻹���Գ����ڶ��λ����
//@Retentionָ��ע����Դ��ڵ���������
@Retention(RetentionPolicy.SOURCE)//ע����Դ�Դ���ļ���
@interface Test{//������һ��ע�⣬���ֽ�Test
    //����ע��Ĺ���--��ע���������

//  int age();//�������age����������ע���ж����age���Ե��﷨
    int age() default 0 ;//10,Ϊ��ʹ��ʱ���㣬age��������Ĭ��ֵ
    //12,��������value
    String value() ;
//  String value() default "jack";//14,��������Ĭ��ֵ�Ͳ�������Ҫ��
}
//�ڶ�����ʹ��ע��
//ʹ��ע��ʱ��ֻҪ��ָ����ע������ǰ�����@����ʹ��
class Hello{
    String name;
//  @Test  ע��û������ʱ������ֱ��ʹ�ã��������˾ͱ�������Ը�ֵ
    //��������ͨ��age���ԣ�����ֵ��д��age=10�������ʱ̫�鷳���븳ֵ
//  @Test(age=10)
    //����age��������Ĭ��ֵ������ֱ���þͿ�����
    @Test("add")//13,��value���Ը�ֵ���Լ�д"add"�����൱��value="add"
    public void add() {
    System.out.println("add()");

    }

}