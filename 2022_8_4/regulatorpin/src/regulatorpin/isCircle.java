package regulatorpin;

public class isCircle {
	/**
	 * �ж��������Ƿ��л�
	 * @param first
	 * @return true Ϊ�л���falseΪ�޻�
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
    //�����
    public static class Node<T>{
    	//�洢����
    	T item;
    	//��һ�����
    	public Node next;
    	
    	public Node(T item,Node next) {
    		this.item=item;
    		this.next=next;
    	}
    }
    
}
