package cn.tedu.collectiona;

import java.util.HashSet;
import java.util.Iterator;

public class Test6_HashSet {

	public static void main(String[] args) {
		// ����HashSet����
		HashSet<Integer>set=new HashSet();
		//���÷���
		set.add(100);
		set.add(200);
		set.add(300);
		
		set.add(200);
		set.add(300);
		System.out.println(set);
//		set.clear();
		System.out.println(set.contains(200));//�ж��Ƿ����
		System.out.println(set.isEmpty());//�ж��Ƿ�Ϊ��
		System.out.println(set.remove(100));//ɾ��Ԫ��
		System.out.println(set.size());//��ȡ����
		
		//����set���ϣ�Iterat<E> iterator()
		Iterator <Integer> it=set.iterator();
		while(it.hasNext()) {
			//�ж���û����һ��Ԫ��
			Integer in=it.next();//��ȡ��������Ԫ��
			System.out.println(in);//��ӡ
		}
	}
}
