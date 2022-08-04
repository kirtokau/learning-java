package regulatorpin;

public class isCircle {
	/**
	 * 判断链表中是否有环
	 * @param first
	 * @return true 为有环，false为无环
	 */
	public class iscircle{
    public static boolean iscircl(Node<String>first) {
    	Node <String> slow=first;
    	Node <String> fast=first;
    	while(fast!=null&&fast.next!=null) {
    		fast=fast.next.next;
    		slow=slow.next;
    		if(fast.equals(slow)) {
    			return true;
    		}
    	}
		return false;   
    	
    }
}
    //结点类
    public static class Node<T>{
    	//存储数据
    	T item;
    	//下一个结点
    	public Node next;
    	
    	public Node(T item,Node next) {
    		this.item=item;
    		this.next=next;
    	}
    }
    
}
