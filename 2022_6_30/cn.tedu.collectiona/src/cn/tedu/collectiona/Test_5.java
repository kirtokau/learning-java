package cn.tedu.collectiona;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

//�������������set�ӿڷ���
public class Test_5 {

	public static void main(String[] args) {
		// ����set����
		//Set set=new Set();//Set�ǽӿڣ�����new 
		Set <String> set=new HashSet();
		//���÷���
		set.add("jack");
		set.add("rose");
		set.add("tony");
		set.add("hanmeimei");
		set.add("tony");
		set.add("tony");
		set.add("null");
		//�ص�1��set�����е�Ԫ�ض��������
		//�ص�2��set�����е�Ԫ��ʱ�����ظ���
		//�ص�3��set������������nullԪ��
		System.out.println(set);
		//set.clear();//��ռ���
		System.out.println(set.contains("tony"));//�ж�set���Ƿ����Ԫ��
		System.out.println(set.equals("tony"));//�ж�set�Ƿ��tony���
		System.out.println(set.hashCode());//��ȡset���ϵĹ�ϣ��ֵ
		System.out.println(set.isEmpty());//��ȡset�����Ƿ�Ϊ��
		System.out.println(set.remove("null"));//ɾ�����ϵ�ָ��Ԫ��
		System.out.println(set.size());//��ȡ���ϵĳ���
		Object[] obs=set.toArray();//�Ѽ����е�Ԫ�ط���������
		System.out.println(Arrays.toString(obs));//�鿴�������Ԫ��ֵ
		
		//���ϼ�Ĳ���
		Set <String> set2=new HashSet();
		set2.add("1");
		set2.add("2");
		set2.add("3");
	    System.out.println(set.addAll(set2));//��set2���뵽set��
	    System.out.println(set.containsAll(set2));//�ж�set���Ƿ����set2
	    System.out.println(set.removeAll(set2));//ɾ��set2
	    
	    //���ϵĵ���Iterator<E> iterator()
	    Iterator <String> it=set.iterator();
	    while(it.hasNext()) {
	    	//�ж���û����һ��Ԫ��
	    	String s=it.next();//��ȡԪ��
	    	System.out.println(s);//��ӡ��ȡ����Ԫ��
	    }

	}

}
