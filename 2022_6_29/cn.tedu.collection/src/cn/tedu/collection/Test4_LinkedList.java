package cn.tedu.collection;

import java.util.LinkedList;

//�������������LinkedList
public class Test4_LinkedList {

	public static void main(String[] args) {
		// ��������
		LinkedList<String>list=new LinkedList();
		//���÷���
		list.add("�ܿ�");
		list.add("��˹");
		list.add("������");
		list.add("֩����");
		
		System.out.println(list);
		//TODO���Դ�COllection�ӿں�List�ӿڼ̳й����Ĺ��Է���
		//LinkedList���з���
		list.addFirst("����");//�����Ԫ��
		list.addLast("������");//���βԪ��
		System.out.println(list);
		
		System.out.println(list.getFirst());//��ȡ��Ԫ��
		System.out.println(list.getLast());//��ȡβԪ��
		System.out.println(list.removeFirst());//ɾ����Ԫ��
		System.out.println(list.removeLast());//ɾ��βԪ��
		

	}

}
