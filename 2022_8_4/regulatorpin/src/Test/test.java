package Test;

import regulatorpin.isCircle.iscircle;
import regulatorpin.isCircle.Node;

public class test  {
      public static void main(String[] args) {
		Node<String>first=new Node<String>("aa",null);
		Node<String>second=new Node<String>("bb",null);
		Node<String>third=new Node<String>("cc",null);
		Node<String>fourth=new Node<String>("dd",null);
		Node<String>fifth=new Node<String>("ee",null);
		Node<String>six=new Node<String>("ff",null);
		Node<String>seven=new Node<String>("gg",null);
		
		//��ɽ��֮���ָ��
		first.next=second;
		second.next=third;
		third.next=fourth;
		fourth.next=fifth;
		fifth.next=six;
		six.next=seven;
		//������
		seven.next=third;
		//�ж������Ƿ��л�
		boolean circle = iscircle.iscircl(first);
		System.out.println("first�������Ƿ��л���"+circle);
		
	}


}