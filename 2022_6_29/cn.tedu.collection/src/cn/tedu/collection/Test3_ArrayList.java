package cn.tedu.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ListIterator;

public class Test3_ArrayList {

	public static void main(String[] args) {
		//��������ʹ�����޲ι��죬�ײ���Զ�Ϊ�㴴�������Ŷ��󣬲������ݵĳ�ʼ������10
		ArrayList<Integer>list=new ArrayList<>();
		//���÷���
		list.add(100);//���Ԫ��
		list.add(200);
		list.add(300);
		list.add(400);
		list.add(300);
		list.add(1,99);//��ָ���±괦���Ԫ��
		System.out.println(list);
//		list.clear();//��ռ���
		System.out.println(list.contains(500));//�ж��Ƿ����
		System.out.println(list.get(0));//�����±��ȡԪ��
		System.out.println(list.indexOf(300));//��ȡָ��Ԫ�ص�һ�γ��ֵ��±�
		System.out.println(list.lastIndexOf(300));//��ȡָ��Ԫ�����һ�γ��ֵ��±�
		System.out.println(list.isEmpty());//�жϼ����Ƿ�Ϊ��
		System.out.println(list.remove(1));//�����±�ɾ��Ԫ��
		System.out.println(list);
		System.out.println(list.remove(Integer.valueOf(300)));//ֱ��ɾ��ָ��Ԫ��
		System.out.println(list.set(2,88));//�û�Ԫ��
		System.out.println(list.size());//��ȡ���ϳ���
		
		Object[]os=list.toArray();//����ת����
		System.out.println(Arrays.toString(os));//�鿴�����е�Ԫ��
		
        //4�ַ�ʽ����ArrayList
		for(int i=0;i<list.size();i++) {
			//�±����ֵ�ǳ���-1
			Integer in=list.get(i);//�����±��ȡֵ
			System.out.println(in+"for");//��ӡֵ
		}
		for(Integer in:list) {
			System.out.println(in+"foreach");//��ӡ�����õ�������
		}
		Iterator <Integer> it=list.iterator();
		while(it.hasNext()) {
			//�ж���û�к�һ��Ԫ��
			Integer in=it.next();//��ȡ���һ��Ԫ��
			System.out.println(in+"iterator");
		}
		ListIterator<Integer>it2=list.listIterator();
		while(it2.hasNext()) {
			//�ж���û�����һ��Ԫ��
			Integer integer=it2.next();//��ȡ��һ��Ԫ��
			System.out.println(integer+"listIterator");
		}
	}
	
	

}
