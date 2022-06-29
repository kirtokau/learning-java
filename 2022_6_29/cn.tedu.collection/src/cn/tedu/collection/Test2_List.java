package cn.tedu.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Test2_List {
//�������������List�ӿ�
	public static void main(String[] args) {
		//����LIst�ӿڶ���
		List <String> list=new ArrayList();
		//�̳���Collection�ӿڵķ���
		list.add("jack");
		list.add("tony");
		list.add("hanmeimei");
		list.add("tony");
		list.add("tony");
		list.add("tony");
//		list.clear();//��ռ���
		System.out.println(list.contains("jack"));
		System.out.println(list.equals("jack"));
		System.out.println(list.hashCode());
		System.out.println(list.isEmpty());;
		System.out.println(list.remove("hanmeimei"));
		System.out.println(list.size());
		System.out.println(list.toArray());//�������
		
		//List�ӿڵ����з��� --���ǿ��԰��������������ķ�ʽ
		list.add(1,"������");//��ָ�����������ָ����Ԫ��
		System.out.println(list+"===");
		System.out.println(list.get(2));//��ȡ�±��Ӧ��Ԫ��
		System.out.println(list.indexOf("tony"));//��ȡָ��Ԫ�ص�һ�γ��ֵ��±�
		System.out.println(list.remove(3));//�����±�ɾ��ָ��Ԫ��
		System.out.println(list.set(0, "xiongda"));//�û�Ԫ��
		List <String> subList=list.subList(2, 4);//��ȡ��List(��ͷ����β)
		System.out.println(subList);
		
		//TODO���ϼ�Ĳ���
		List<String>list2=new ArrayList();
		list2.add("1");
		list2.add("2");
		list2.add("3");
		System.out.println(list.addAll(list2));//��list2�ӵ�list��
		System.out.println(list.addAll(1,list2));//��ָ��ϯ������Ԫ��
		System.out.println(list.contains(list2));//�ж��Ƿ����
		System.out.println(list.remove(list2));//ɾ��list2
//		System.out.println(list.retainAll(list2));//ɾ��list
		
		//TODO���ϵĵ��� --List���ϵĵ�����ʽ�ж���
		//iterator() listIterator() for() foreach
		//��ʽ1:����List�������±꣬���Կɸ����±��������
		//i<list.size()�±����ֵ�Ǽ��ϳ���-1
		for(int i=0;i<list.size();i++) {
			String s=list.get(i);//list.get(i)�����±��ȡԪ��
			System.out.println(s);
		}
		//��ʽ2:��ͨforѭ��������Ч�ʵͣ�������foreach��ߣ��ô����﷨���Ч�ʸ� ���������ܰ����±��ȡ
		//for��1 2��3��{} --3��Ҫ���������� 1�Ǳ����õ����������� 2�Ǳ�����
		for(String str:list) {
			System.out.println(str);//str������ǵ�ǰ�����õ�������
		}
		//��ʽ3��iterator()�Ǽ̳��Ը��ӿ�Collection��
		Iterator <String> it=list.iterator();
		while(it.hasNext()) {
			//hasNext()�ж��Ƿ�����һ��Ԫ��
			String str=it.next();//next()��ȡԪ��
			System.out.println(str);//��ӡ��ȡ����ֵ
		}
		//��ʽ4��listIterator()��List�ӿڵ����з���
		//Iterator<E>iterator()--���ӿ� --hasNext() --next() --remove()
		//ListIterator<E> listIterator() --�ӽӿڣ�ӵ�и��ӿڵķ�����Ҳ���Լ������з���(���������
	    ListIterator <String> it2=list.listIterator();
	    while(it2.hasNext()) {
	    	//hasNext()�жϺ�����û������
	    	String s=it2.next();//next()��ȡ��һ������
	    	System.out.println(s);//��ӡ��ȡ��������
	        //�ӽӿ�ӵ�и��ӿڵ����з���Ҳ���Լ������з��������ӽӿڵ����з���������ǰ/�������
}
	}
}
