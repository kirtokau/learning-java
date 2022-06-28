package cn.tedu.encoding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class Test1_Collection {

	public static void main(String[] args) {
		// ����collection�ӿڶ���
       //Collection c=new Collection();//����,��ΪCollection�ǽӿڲ���new 
       //<Integer>�Ƿ��ͣ���Լ�������е�Ԫ�����ͣ�ֻ��д�������Ͷ������ǻ�������
		Collection <Integer> c=new ArrayList();
	  //���÷���
		c.add(100);//���Ԫ��
		c.add(200);
		c.add(300);
		
		System.out.println(c);
		//c.clear();
		System.out.println(c.contains(300));//�жϼ����Ƿ����ָ��Ԫ��
		System.out.println(c.equals(100));//�жϺ�100�Ƿ����
		System.out.println(c.hashCode());//���ؼ��ϵĹ�ϣ��ֵ
		System.out.println(c.isEmpty());//�жϼ����Ƿ�Ϊ��
		System.out.println(c.remove(200));//�ж��Ƿ�ɹ�ɾ�������е�Ԫ��
		System.out.println(c.size());//��ȡ���ϵĳ���/����
		Object[] os=c.toArray();//�Ѽ����е�Ԫ�ط�������
		System.out.println(Arrays.toString(os));
		
		//���ϼ�Ĳ���
		Collection <Integer> c2=new ArrayList();
		c2.add(9);
		c2.add(8);
		c2.add(7);
		
		c.addAll(c2);//��c2�ӵ�c��
		System.out.println(c.containsAll(c2));//�ж�c���Ƿ����c2
		System.out.println(c.removeAll(c2));//ɾ��c2
//		System.out.println(c.retainAll(c2));//ɾ��c
		System.out.println(c2);
		
		//��������/���������е�Ԫ��Iteator<E> iteator()
		Iterator <Integer> it=c2.iterator();
		//ͨ��Iterator��������ѭ���Ż�ȡ�����е�Ԫ��
		while(it.hasNext()) {
			//hasNext()�����жϼ������Ƿ����¸�Ԫ�أ��оͷ���true
			Integer inte=it.next();//next()��ȡ��������Ԫ��
			System.out.println(inte);
		}	
	}
}
