package regulatorpin;

public class Mid {
	/**
	 * 
	 * @param first ������׽��
	 * @return  ������м�ֵ���
	 */
   public static String getMid(Node<String>first) {
	   Node<String>slow=first;
	   Node<String>fast=first;
	   while(fast!=null&&fast.next!=null) {
		   fast=fast.next.next;
		   slow=slow.next;
	   }
	   return slow.item;
   }
   //�ڵ���
   public static class Node<T>{
	   //�洢����
	   T item;
	   //��һ�����
	   Node next;
	   
	   public Node(T item,Node next) {
		   this.item=item;
		   this.next=next;
	   }
   }
   
}
