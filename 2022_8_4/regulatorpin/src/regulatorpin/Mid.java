package regulatorpin;

public class Mid {
	/**
	 * 
	 * @param first 链表的首结点
	 * @return  链表的中间值结点
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
   //节点类
   public static class Node<T>{
	   //存储数据
	   T item;
	   //下一个结点
	   Node next;
	   
	   public Node(T item,Node next) {
		   this.item=item;
		   this.next=next;
	   }
   }
   
}
